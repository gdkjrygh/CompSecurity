'use strict';

angular.module('removeHashes', [])
	.filter('removeHashes', function () {
		return function (string) {
			if (string) {
				return string.replace(/#/g, '');
			}
		};
	});
