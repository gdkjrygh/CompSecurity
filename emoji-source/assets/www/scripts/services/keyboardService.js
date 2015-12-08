'use strict';

angular.module('keyboardService', [])
    .factory('CordovaKeyboardPlugin', function ($window, $document) {
        var showKeyboard = null;
        var closeKeyboard = null;

        var showKeyboardFallback = function() {
            console.warn('Cannot open Keyboard');
        };

        var closeKeyboardFallback = function() {
            console.warn('Cannot close keyboard');
        };


        function loadKeyboardPlugin() {
            showKeyboard = $window.cordova.plugins.Keyboard.show;
            closeKeyboard = $window.cordova.plugins.Keyboard.close;
        }

        $document[0].addEventListener('deviceready', loadKeyboardPlugin, false);

        function show() {
            (showKeyboard || showKeyboardFallback)();
        }

        function close() {
            (closeKeyboard || closeKeyboardFallback)();
        }

        return {
            show: show,
            close: close
        };
    });
