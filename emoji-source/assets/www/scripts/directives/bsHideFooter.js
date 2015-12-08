'use strict';

var myApp = angular.module('mfbApp');

myApp.directive('bsHideFooter', function (State) {
	return {
		restrict: 'A',
		link: function (scope, elem, attrs) {
			var hiddenElement;

			if (attrs.bsHideFooter) {
				hiddenElement = angular.element(document.getElementById(attrs.bsHideFooter));
			}

			var show = function () {
				if (hiddenElement) {
					hiddenElement.css('display','block');
				} else {
					State.hide_footer(false);
				}
			};

			var hide = function () {
				if (hiddenElement) {
					hiddenElement.css('display','none');
				} else {
					State.hide_footer(true);
				}
			};


			elem.on('focus', function () {
				scope.$apply(hide);
			});

			elem.on('blur', function() {
				scope.$apply(show);
			});


			// Fixes sync issues with iOS and the virtual keyboard [BA-972]
			elem.on('touchstart', function(event) {
				var xPosStart, yPosStart, xPosEnd, yPosEnd, threshold, scroll;
				threshold = 10;
				xPosStart = event.originalEvent.changedTouches[0].pageX;
				yPosStart = event.originalEvent.changedTouches[0].pageY;

				elem.on('touchend', function(event) {
					xPosEnd = event.originalEvent.changedTouches[0].pageX;
					yPosEnd = event.originalEvent.changedTouches[0].pageY;

					scroll = Math.max(Math.abs(xPosStart - xPosEnd), Math.abs(yPosStart - yPosEnd));
					if (scroll < threshold) {
						scope.$apply(hide);
					}
					elem.off('touchend');
				});
			});

		}
	};
});
