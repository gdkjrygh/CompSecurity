'use strict';
var myApp = angular.module('mfbApp');

myApp.directive('bsAutoExpand', function() {
	return {
		restrict: 'A',
		link: function( scope, elem, attrs) {
			var element = elem[0];
			var $element = angular.element(elem[0]);
			var base_height = elem[0].clientHeight;
			var clickCatcher = angular.element(document.getElementById('textarea-click-catcher'));

			$element.css("height", base_height + "px");
			clickCatcher.css('height', base_height + "px");
			$element.bind('keyup', function($event) {
				var height = element.scrollHeight;

				if (height > base_height) {
					base_height = height;
					$element.css("height", base_height + "px");
					clickCatcher.css('height', base_height + "px");
				}
			});

			scope.$on('$destroy', function () {
				angular.element(elem).unbind('keyup');
			});
		}
	};
});