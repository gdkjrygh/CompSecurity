'use strict';

angular.module('mfbApp')
  .filter('thumbnail', function ($window, Log, ImageBaseURLThumb) {
	var default_scale = 1;
	var dpi = $window.devicePixelRatio*$window.innerWidth;
	if (dpi > 672) {
		default_scale = 2;
	}

	return function (comic) {
		if (comic.user_a && (comic.type === 0 || comic.user_b)) {
			var url = ImageBaseURLThumb;
			if (default_scale >= 2) {
				url += 'scale' + default_scale + '/';
			}
			if (comic.type === 0) {
				return url + comic.comic_id + '-' + comic.user_a.id + '-v1.png';
			} else {
				return url + comic.comic_id + '-' + comic.user_a.id + '-' + comic.user_b.id + '-' + 'v1.png';
			}
		} else {
			Log.log('Missing user');
			return '';
		}
	};
});
