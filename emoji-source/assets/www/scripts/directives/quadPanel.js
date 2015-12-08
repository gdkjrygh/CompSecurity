'use strict';
var myApp = angular.module('mfbApp');

myApp.controller('QuadPanelCtrl', function ($scope, Templates, NavHelper, makeComicWizard) {
	$scope.comic_tag_click = function (comic, tag) {
		makeComicWizard.userA(comic.user_a);
		if (comic.type === 1) {
			makeComicWizard.userB(comic.user_b);
		}
		NavHelper.browse_templates(tag, comic.template_id, 'selected_tag');
	};
});

myApp.directive('quadPanel', function (VIEWS) {
	return {
		scope: {
			'comics': '=',
			'title': '@',
			'description': '@',
			'tag': '@',
			'count': '@'
		},
		restrict: 'E',
		templateUrl: VIEWS + 'quadPanel.html',
		controller: 'QuadPanelCtrl'
	};
});
