package com.setplex.tests;

import com.setplex.pages.SetplexPage;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

import com.codeborne.selenide.logevents.SelenideLogger;

@Tag("setplex")
public class MainPageTests extends TestBase {

    SetplexPage setplexPage = new SetplexPage();

    @Test
    @Tag("mainPage")
    @DisplayName("Main page contains motto")
    void checkMainPageTextTest() {

        SelenideLogger.addListener("allure", new AllureSelenide());

        step("Open main page", () -> {
            setplexPage.openMainPage();
        });
        step("Check that the text on the main page is correct", () -> {
            setplexPage.checkMainPageText("Simple. Powerful.");
        });
    }
}
