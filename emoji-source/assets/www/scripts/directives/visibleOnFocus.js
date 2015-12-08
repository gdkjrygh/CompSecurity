'use strict';

angular.module('visibleOnFocusDirective', [])
	.directive('visibleOnFocus', function($window) {
		return {
			link: function(scope, elem) {
				elem.on('focus', function() {

					var boundingBox = elem[0].getBoundingClientRect();
					var bottomOfWidget = boundingBox.bottom;

					if (bottomOfWidget > 0) {
						$window.scrollTo(0, boundingBox.bottom + $window.scrollY);
					}

				});

			}
		};
	});

