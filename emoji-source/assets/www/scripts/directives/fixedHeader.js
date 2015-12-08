'use strict';

angular.module('fixedHeader', ['jQuery'])
	.directive('onFocusUnfixHeader', function ($document, $window, $timeout, $) {
		return {
			link: function (scope, elem, attrs) {
				var header = angular.element($document[0].querySelector('.top-bar'));
                if (!header) {
                    return;
                }

				var headerScope = header.scope();
                if (!headerScope) {
                    return;
                }

				elem.on('focus', function () {
					headerScope.$emit('bitstrips.keyboard.show');
				});

				elem.on('blur', function() {
					headerScope.$emit('bitstrips.keyboard.hide');
				});

				scope.$on('$destroy', function () {
					elem.off('focus blur');
				});

			}
		};
	})
	.directive('fixedHeader', function($document, $window) {
		return {
			restrict: 'C',
			link: function(scope, elem) {
				// The header is static by default and gets enhanced to fixed when ready
				var fixHeader = function() {
					elem.css('position', 'fixed');

					// Fixed headers in iOS require a scroll to be properly placed.
					$window.setTimeout(function() {
						$window.scrollBy(0, 1);
					}, 0);
				};

				var unfixHeader = function() {
					elem.css('position', 'absolute');
				};

				fixHeader();

				scope.$on('bitstrips.keyboard.show', unfixHeader);
				scope.$on('bitstrips.keyboard.hide', fixHeader);

			}
		};
	})
	.directive('fixedBottom', function() {
		return {
			restrict: 'C',
			link: function(scope, elem) {
				var el = elem[0];

				// There are syncing issues when coming back from Flash land.
				// Explicitly sending this signal ensures fixed elements are
				// not misplaced or hidden in such scenario.
				scope.$on('returnFromFlash', function() {
					var watchForVisibility = scope.$watch(function() {
						return el.offsetWidth;
					}, function(value) {
						if (!!value) {
							elem.css('width', '100%');
							watchForVisibility();
						}
					});
				});
			}
		};
	})
	.directive('topBar', function ($) {
		return {
			restrict: 'C',
			link: function (scope, elem, attrs) {
				// clicking header animates scroll to the top of the page
				var scrollToTop = function () {
					$('body').animate({scrollTop: 0 }, 500);
				};

				angular.element(elem).on('click', scrollToTop);
			}
		};
	});
