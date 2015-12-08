'use strict';

angular.module('imageLoaderService', ['utils'])
.factory('createImageElement', function($document) {
	return function () {
		return $document[0].createElement('img');
	};
})
.factory('basicSetTimeout', function() {
	return function(fn, time) {
		return setTimeout(fn, time);
	};
})
.factory('basicClearInterval', function() {
	return function(interval) {
		clearInterval(interval);
	};
})
.service('ImageLoader', function(createImageElement, basicSetTimeout, basicClearInterval, addSchemaToSchemaless) {

	var load = function(imageUrl, successFn, errorFn, finallyFn) {
		var timeoutInterval;
		var image = createImageElement();

		var cleanup = function() {
			image.onerror = null;
			image.onload = null;
			image.onabort = null;
			basicClearInterval(timeoutInterval);
			finallyFn();
		};

		image.onload = function() {
			cleanup();
			successFn();
		};

		image.onerror = function() {
			cleanup();
			errorFn();
		};

		image.onabort = function() {
			cleanup();
		};

		image.src = addSchemaToSchemaless(imageUrl);
		timeoutInterval = basicSetTimeout(image.onerror, 10000);

		return image.onabort;
	};

	return {
		load: load
	};
});
