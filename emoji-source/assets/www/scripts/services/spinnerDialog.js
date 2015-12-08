'use strict';

angular.module('spinnerDialog', ['ngCordova'])
.service('SpinnerDialog', function($window, $cordovaSpinnerDialog) {

    var showBrowser = function(title, message, persistent) {
        console.warn('Cannot open Spinner Dialog with', title, message, persistent);
    };

    var hideBrowser = function() {
        console.warn('Cannot hide Spinner Dialog');
    };

    return {
        show: (!!$window.plugins && $window.plugins.spinnerDialog) ? $cordovaSpinnerDialog.show : showBrowser,
        hide: (!!$window.plugins && $window.plugins.spinnerDialog) ? $cordovaSpinnerDialog.hide : hideBrowser
    };
});
