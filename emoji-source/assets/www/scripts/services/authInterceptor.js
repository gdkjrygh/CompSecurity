'use strict';

angular.module('authInterceptor', ['userAuth'])
	.config(function ($httpProvider) {
		$httpProvider.interceptors.push('addTokenToPostRequest');
	})
	.factory('addTokenToPostRequest', function ($injector) {
		return {
			request: function (config) {
				if (config.method === 'POST' && config.with_token) {

					config.data = config.data || {};
					if (!config.data.token) {
						config.data.token = $injector.get('UserAuth').get_token();
					}
				}

				return config;

			}
		};
	});