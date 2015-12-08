'use strict';


/**
 * A directive that "turns off" Angular after a second.
 * Interaction with the directive with a click or touch
 * event will re-enable Angular to refresh the template
 * and go to sleep after a second again
 */
angular.module('disableDigestDirective', [])
.directive('disableDigest', function($window) {
	return function(scope, elem) {
		var watchers, childHead, childTail, connected;

		connected = true;

		function disableDigest() {
			$window.setTimeout(function() {
				watchers = scope.$$watchers;
				childHead = scope.$$childHead;
				childTail = scope.$$childTail;
				scope.$$watchers = [];
				scope.$$childHead = null;
				scope.$$childTail = null;
				connected = false;
			}, 1000);
		}

		function enableDigest(event) {
			if (connected) { return; }

			scope.$$watchers = watchers;
			scope.$$childHead = childHead;
			scope.$$childTail = childTail;
			connected = true;
			scope.$digest();

			disableDigest();
		}

		disableDigest();

		elem.on('click touchstart', enableDigest);

		scope.$on('$destroy', function() {
			elem.off('touchstart click');
		});

	};
});
