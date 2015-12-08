'use strict';

angular.module('queuedLoaderService', ['imageLoaderService', 'utils'])
	.constant('QUEUED_LOADER_REFRESH_INTERVAL', 500)
	.constant('QUEUED_LOADER_RETRY_DELAY', 300)
	.service('QueuedLoader', function ($window, $document, ImageLoader, QUEUED_LOADER_REFRESH_INTERVAL, QUEUED_LOADER_RETRY_DELAY, addSchemaToSchemaless) {

	var RETRY_IMAGE_BASE_URL = "images/retries/";
	var MAX_RETRIES = 3;
	var MAX_SIMULTANEOUS_REQUESTS = 6;

	var unloadedImages = [];
	var requestCounter = 0;
	var imageQueue = [];
	var loadedImages = {};

	function retryImageURL(element) {
		return RETRY_IMAGE_BASE_URL + element.attr('q-fail');
	}

	function retryFailImageURL(element) {
		return retryImageURL(element).replace(".png", "2.png");
	}

	function moveToFrontOfQueue(element) {
		var i;
		for (i = 0; i < imageQueue.length; i++) {
			if (imageQueue[i] === element) {
				imageQueue.splice(i, 1);
				imageQueue.unshift(element);
				break;
			}
		}
	}

	function isVisible(element) {
		var rect = element[0].getBoundingClientRect();
		var height = $window.innerHeight;
		return (rect.bottom > 0 && rect.bottom < height) || (rect.top > 0 && rect.top < height);
	}

	function setBackgroundImage(element, url) {
		element.css("background-size", "cover");
        url = addSchemaToSchemaless(url);
		element.css("background-image", "url(" + url + ")");
	}

	function queueImageForLoading(element, delay) {
		if (typeof delay !== 'number') {
			delay = 0;
		}
		if (!element.isLoading) {
			element.isLoading = true;
			element.loadingFailed = false;
			setTimeout(function() {
				imageQueue.push(element);
				processQueue();
			}, delay);
		}
		else {
			moveToFrontOfQueue(element);
		}
	}

	function processQueue() {
		while (requestCounter < MAX_SIMULTANEOUS_REQUESTS && imageQueue.length > 0) {
			loadImage(imageQueue.shift());
		}
	}

	function loadImage(element) {

		function successHandler() {
			setBackgroundImage(element, element.attr('queued'));
			loadedImages[element.attr('queued')] = true;
			delete unloadedImages[element.unloadedImagesIndex];
		}

		function failureHandler() {
			if (element.attr('q-fail')) {
				if (element.retryCount < MAX_RETRIES) {
					setBackgroundImage(element, retryImageURL(element));
				}
				else {
					setBackgroundImage(element, retryFailImageURL(element));
				}
			}
			element.loadingFailed = true;
		}

		function finallyHandler() {
			delete element.imageLoader;
			element.isLoading = false;
			requestCounter--;
		}

		element.cancelImageLoadFn =
			ImageLoader.load(element.attr('queued'), successHandler, failureHandler, finallyHandler);

		requestCounter++;
	}

	function clearBackgroundImage(element) {
		element.css('background-image', '');
		element.css('background-size', '');
	}

	function notLoaded(element) {
		if (element && element[0] && element[0].style) {
			return element[0].style.backgroundImage === '';
		}
	}

	function checkImageVisibility() {
		angular.forEach(unloadedImages, function(element) {
			if (notLoaded(element) && isVisible(element)) {
				queueImageForLoading(element);
			}
			else if (element.loadingFailed && !isVisible(element)) {
				clearBackgroundImage(element);
			}
		});
	}

	function detectIOS6() {
		return /(iPhone|iPad|iPod)\sOS\s6/.test(navigator.userAgent);
	}

	function loadingFailed(element) {
		return element.loadingFailed;
	}

	function retry(element) {
		clearBackgroundImage(element);
		queueImageForLoading(element, QUEUED_LOADER_RETRY_DELAY);
		element.retryCount++;
	}

	function push(element, attrs) {
		element.addClass('loading-background-spinner');
		element.retryCount = 0;
		if (loadedImages[attrs.queued] === true) {
			if (detectIOS6()) {
				element.attr('queued', attrs.queued);
				loadImage(element);
			}
			else {
				setBackgroundImage(element, attrs.queued);
			}
		}
		else {
			element.unloadedImagesIndex = unloadedImages.push(element) - 1;
			queueImageForLoading(element);
		}
	}

	function reset(element, attrs) {
		clearBackgroundImage(element);
		destroy(element);
		push(element, attrs);
	}

	function cancelLoading(element) {
		if (element.cancelImageLoadFn) {
			element.cancelImageLoadFn();
		}
	}

	function destroy(element) {
		if (element.isLoading) {
			cancelLoading(element);
		}
		delete unloadedImages[element.unloadedImagesIndex];
	}

	function refresh() {
		processQueue();
		checkImageVisibility();
	}

	function iOS6refresh() {
		refresh();
		setTimeout(iOS6refresh, QUEUED_LOADER_REFRESH_INTERVAL); //resetting setTimeout is more reliable than setInterval on iOS 6
	}

	if (detectIOS6()) {
		iOS6refresh();
	}
	else {
		setInterval(refresh, QUEUED_LOADER_REFRESH_INTERVAL);
	}

	return {
		push: push,
		destroy: destroy,
		loadingFailed: loadingFailed,
		retry: retry,
		reset: reset
	};
});
