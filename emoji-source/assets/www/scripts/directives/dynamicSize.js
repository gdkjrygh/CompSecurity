'use strict';

angular.module('dynamicSize', [])
    .directive('dynamicSize', function ($window) {
        return {
            restrict: 'A',
            link: function (scope, element, attrs) {
                $window.setTimeout(function() {
                    var canvasWidth = attrs.canvasWidth;
                    var windowSize = $window.innerWidth;
                    var scale = Math.min(windowSize, canvasWidth)/canvasWidth;

                    // Textarea sizing
                    var transformScale = 'scale3d('+ scale + ', ' + scale + ', 1) ';
                    /* `transform-origin: 0 0` required */
                    var transformProperties = 'transform: '+ transformScale + '; -webkit-transform: ' + transformScale;

                    element.attr('style', transformProperties);
                });

            }
        };
    })
    .directive('dynamicEmoContainer', function ($window, $timeout) {
        return {
            restrict: 'A',
            link: function (scope, element) {
                $timeout(function () {
                    var windowHeight = $window.innerHeight;
                    var topSectionHeight = $window.jQuery('[data-top-section]').height();
                    var tabSectionHeight = $window.jQuery('.control-panel-tabs').height();
                    var bodyPaddingTop = parseInt($window.jQuery('body').css('paddingTop'), 10);
                    var idealEmoContainerHeight = windowHeight - bodyPaddingTop - topSectionHeight - tabSectionHeight;

                    // Set new height
                    element.css('height', idealEmoContainerHeight);
                }, 1000);
            }
        };
    });
