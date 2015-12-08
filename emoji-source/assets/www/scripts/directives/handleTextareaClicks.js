'use strict';

angular.module('handleTextareaClicks', ['keyboardService'])
    .directive('handleTextareaClicks', function (Draw, CordovaKeyboardPlugin) {
        return {
            restrict: 'A',
            link: function (scope, element) {
                // click events not detected on textareas in iOS, so we use touch
                var textAreaClickHandler = function (evt) {
                    var touchEvent = evt.originalEvent.touches[0];
                    var isOnText = Draw.textClick(touchEvent.pageX, touchEvent.pageY);
                    scope.$apply();
                    evt.stopPropagation();

                    if (!isOnText) {
                        CordovaKeyboardPlugin.close();
                        evt.preventDefault();
                    }
                };

                element.on('touchstart', textAreaClickHandler);

                scope.$on('$destroy', function () {
                    element.off('touchstart', textAreaClickHandler);
                });
            }
        };
    });
