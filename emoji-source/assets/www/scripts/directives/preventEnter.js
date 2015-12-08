'use strict';

angular.module('preventEnter', [])
	.directive('preventEnter', function () {
		return {
			link: function (scope, element) {
				var cancelEnterKey = function (event) {
					if (event.keyCode === 13) {
						event.preventDefault();
					}
				};

				element.on('keydown', cancelEnterKey);

				scope.$on('$destroy', function () {
					element.off('keydown', cancelEnterKey);
				});
			}
		};
	});