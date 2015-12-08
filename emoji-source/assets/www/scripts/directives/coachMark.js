'use strict';

angular.module('coachMarkDirective', ['usersService', 'stateService', 'utils'])
.directive('coachMark', function(Users, State) {
	return {
		link: function(scope, element, attrs) {
			var styles = {
				left: {
					image: 'l-arrow.png',
					cssClass: 'left'
				},
				middle: {
					image: 'm-arrow.png',
					cssClass: ''
				},
				right: {
					image: 'r-arrow.png',
					cssClass: 'right'
				}
			};
			var clickOverlay;
			var style = styles[attrs.coachMarkStyle];
			var imageUrl = 'images/' + style.image;
			var coachMarkHtml = '<div class="coach-marks ' + style.cssClass + '"><img src="' + imageUrl + '"><p>' + attrs.coachMark + '</p></div>';
			var darkenOverlayHtml = '<div id="coach-mark-overlay" class="overlay"></div>';
			var clickOverlayHtml = '<div id="coach-mark-click-overlay" style="z-index: 30; position: fixed; top: 0; left: 0; height: 100%; width: 100%;"></div>';

			if (!Users.me().fresh_install || State.get_key('coachMarksSeen')) {
				return;
			}

			element.append(coachMarkHtml);

			element.data('old-z-index', element.css('z-index'));
			element.css('z-index', 20);

			var removeOverlay = function(){
				angular.element(document.getElementById('coach-mark-overlay')).remove();
				angular.element(document.getElementById('coach-mark-click-overlay')).remove();

				angular.element(document.body).css('overflow', 'visible');
				angular.element(document.getElementsByTagName('html')[0]).css('overflow', 'visible');

				State.set_key('coachMarksSeen', true);
			};

			scope.$on('$destroy', removeOverlay);

			if (!document.getElementById('coach-mark-overlay')) {
				angular.element(document.body).append(darkenOverlayHtml);
				clickOverlay = angular.element(clickOverlayHtml);
				angular.element(document.body).append(clickOverlay);

				angular.element(document.body).css('overflow', 'hidden');
				angular.element(document.getElementsByTagName('html')[0]).css('overflow', 'hidden');

				clickOverlay.on('click', function() {
					var elements = Array.prototype.slice.call(document.getElementsByClassName('coach-marks'));
					angular.forEach(elements, function(element) {
						var parent = angular.element(element).parent();
						parent.css('z-index', parent.data('old-z-index'));
						angular.element(element).remove();
					});

					removeOverlay();
				});
			}
		}
	};
});
