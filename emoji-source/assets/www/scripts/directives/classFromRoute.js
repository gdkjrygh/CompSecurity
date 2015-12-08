'use strict';

angular.module('classFromRouteDirective', []).directive('classFromRoute', function ($rootScope, $route) {
	return {
		restrict: 'A',
		link: function postLink(scope, element, attrs) {
			$rootScope.$on('$locationChangeSuccess', function () {
				element.removeAttr('class');
				if ($route.current.body_class) {
                    element.addClass($route.current.body_class);
				}
			});
		}
	};
});
