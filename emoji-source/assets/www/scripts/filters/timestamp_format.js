'use strict';


angular.module('mfbApp').filter('timestamp_format', function () {
	// Unix epoch in milliseconds
	return function (input) {
		var time = ((new Date()).getTime() - input)/60000;

		if (time <= 1) {
			return "1m";
		}

		if (time < 60) {
			return Math.floor(time) + "m";
		}

		time /= 60;
		if (time < 24) {
			return Math.floor(time) + "h";
		}

		time = Math.floor(time/24);
		return time + "d";
	};
});
