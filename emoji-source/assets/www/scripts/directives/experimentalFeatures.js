'use strict';

angular.module('mfbApp')
	.directive('experimentalFeature', function (Bootstrap) {
		return {
			link: function (scope, elem, attrs) {
				if (!Bootstrap.testing) {
					elem.css('display','none');
				}
			}
		};
	});
