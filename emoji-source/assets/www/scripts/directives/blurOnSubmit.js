'use strict';

angular.module('blurOnSubmitDirective', []).directive('blurOnSubmit', function() {
	return {
		restrict: 'A',
		link: function(scope, element, attrs) {
			element.on('submit', function() {
				document.activeElement.blur();
			});

			scope.$on('$destroy', function() {
				element.off('submit');
			});
		}
	};
});
