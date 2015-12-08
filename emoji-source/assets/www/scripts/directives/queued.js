'use strict';

angular.module('queuedDirective',['configuration', 'queuedLoaderService']).
	directive('queued', function (QueuedLoader, $parse) {

	return {
		link: function(scope, element, attrs) {
			var currentUrl = attrs.queued;

			if (element.attr('q-click') && !element.attr('q-retry')) {
				throw "q-click is not supported without q-retry";
			}

			QueuedLoader.push(element, attrs);

			element.on('click', function() {
				var fn;

				if (QueuedLoader.loadingFailed(element)) {
					if (element.attr('q-retry')) {
						QueuedLoader.retry(element);
					}
				}
				else {
					fn = $parse(element.attr('q-click'));
					scope.$apply( function() {
						fn(scope, { $event: event });
					});
				}
			});

			scope.$on('$destroy', function() {
				QueuedLoader.destroy(element);
				element.off('click');
			});

			attrs.$observe('queued', function(newUrl) {
				if (currentUrl != newUrl) {
					QueuedLoader.reset(element, attrs);
					currentUrl = newUrl;
				}
			});
		}
	};
});
