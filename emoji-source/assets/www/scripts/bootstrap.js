'use strict';

angular.module('bootstrapService', [])
	.factory('Bootstrap', function () {
		return {
			delay_loading: 0,
			app_os: 0,
			testing: 1,
			app_version: '1.8.142'
		};
	}
);
