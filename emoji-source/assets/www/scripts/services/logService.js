'use strict';

angular.module('logService', ['remoteService'])
	.factory('Log', function($log) {
		var stored_logs = [];

		return {
			get_log: function() {
				return stored_logs;
			},
			log: function() {
				var strs = [];
				angular.forEach(arguments, function (value, key) {
					if (angular.isObject((value))) {
						value = JSON.stringify(value);
					}
					strs.push(value);
				});
				var final_str = strs.join(' ');

				stored_logs.push(final_str);
				$log.log(final_str);
			}
		};
	});
