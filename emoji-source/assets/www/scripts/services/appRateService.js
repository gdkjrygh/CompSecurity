'use strict';

angular.module('appRateService', [])
    .factory('AppRater', function ($window) {
        var appRateSessionStarted = false;

        var show = function () {
            if (!$window.AppRate) {
                console.warn('AppRate plugin is not supported!');
                return;
            }

            if (appRateSessionStarted) {
                return;
            }

            var customLocale = {
                title: 'Rate Bitstrips!',
                message: "If you enjoy using Bitstrips, would you please take a moment to rate it?",
                cancelButtonLabel: 'No thanks',
                laterButtonLabel: 'Remind me later',
                rateButtonLabel: 'Rate Bitstrips'
            };

            AppRate.preferences.storeAppURL.ios = '694701214'; // remove `id` from the id
            AppRate.preferences.storeAppURL.android = 'market://details?id=com.bitstrips.bitstrips';
            AppRate.preferences.customLocale = customLocale;
            AppRate.preferences.promptAgainForEachNewVersion = false;
            AppRate.preferences.usesUntilPrompt = 3;
            AppRate.promptForRating();

            appRateSessionStarted = true;
        };

        return {
            show: show
        };
    });
