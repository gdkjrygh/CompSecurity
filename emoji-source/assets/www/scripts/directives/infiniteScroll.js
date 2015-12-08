'use strict';

angular.module('infiniteScroll', []).directive('infiniteScroll', function ($window) {
	return {
		scope: {
			canLoad: '=',
			threshold: '@',
			infiniteScroll: '&'
		},
		link:function (scope, element) {
			var offset = parseInt(scope.threshold, 10) || 0;
			var e = element[0];
			//Log.log("IS Destroy: " + $window.location);

			angular.element($window).bind('scroll touchmove', function (event) {
				//Log.log('Scrolling', e.scrollTop, e.offsetHeight, e.scrollHeight, offset, scope[attrs.canLoad], event.toString());
				//Log.log('Scrolling', e.scrollTop + e.offsetHeight, e.scrollHeight - offset, scope[attrs.canLoad], event.toString());
				if (scope.canLoad && e.scrollTop + e.offsetHeight >= e.scrollHeight - offset) {
					var window_bottom = $window.innerHeight + $window.scrollY;
					var e_bottom = e.offsetHeight + e.offsetTop;
					//Log.log(e_bottom - offset, window_bottom);
					if (e_bottom - offset < window_bottom) {
						//Log.log('Calling apply');
						scope.$apply(scope.infiniteScroll);
						//window.scroll(window.scrollX, window.scrollY);
					}
				}
			});

			scope.$on('$destroy', function () {
				//Log.log("IS Destroy: " + $window.location);
				angular.element($window).unbind('scroll');
				angular.element($window).unbind('touchmove');
			});
		}
	};
});

