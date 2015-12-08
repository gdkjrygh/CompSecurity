// inspired by GoF Memento (http://www.amazon.ca/Design-Patterns-Elements-Reusable-Object-Oriented/dp/0201633612)
'use strict';

angular.module('mementoService', ['ngRoute'])
	.factory('memento', function ($rootScope, $route, $window, $anchorScroll, $routeParams, $location) {

		var states = {};

		var anchorScrollAndOffsetHeader = function () {
			$anchorScroll();
			$window.setTimeout(function () {
				$window.scroll(0, window.pageYOffset - 60);
			}, 0);
		};

		return function (scope, key) {
			var unregister_view_content_loaded = scope.$on('$viewContentLoaded', function () {
				if (angular.isFunction(scope.restore) && $routeParams.back) {
					var state = states[key] || {};
					scope.restore(state);
				}
				unregister_view_content_loaded();
			});

			var unregister_loaded = scope.$on('loaded', function () {
				var state = states[key] || {};

				$window.setTimeout(function () {
					if ($routeParams.back) {
						if (state.$scroll === 'auto' && angular.isNumber(state.$scroll_position)) {
							$window.scroll(0, state.$scroll_position);
							scope.$emit('tabSwitch');
							scope.$apply();
							return;
						}
					}

					if ($location.hash()) {
						anchorScrollAndOffsetHeader();
					} else {
						$window.scroll(0, 0);
					}
				}, 0);

				unregister_loaded();
			});

			var unregister_location_change_start = $rootScope.$on('$locationChangeStart', function () {
				if (angular.isFunction(scope.save)) {
					var state = scope.save();
					if (state && state.$scroll === 'auto') {
						state.$scroll_position = $window.scrollY;
					}
					states[key] = state;
				}
				unregister_location_change_start();
			});
		};
	});
