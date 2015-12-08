'use strict';
var myApp = angular.module('mfbApp');

myApp.controller('mfbfooterCtrl', function ($window, State, Launch, TemplatesHelper, UserAuth,
											Users, $scope, NavHelper) {
	$scope.footer = State.get_footer();

    $scope.go_home = NavHelper.go_home;
    $scope.go_templates = NavHelper.go_templates;
    $scope.go_photo = NavHelper.go_photo;
    $scope.go_avatar = NavHelper.go_avatar;

	$scope.back = function() {
		if ($scope.footer.category !== 'home') {
			NavHelper.go_home();
		}
	};

	$scope.hide_blocker = function () {
		State.set_saving(false);
	};

	$scope.new_day = TemplatesHelper.new_day;

	$scope.view_comic = NavHelper.view_comic;
})
.directive('mfbfooter', function (VIEWS) {
	return {
		restrict: 'E',
		controller: 'mfbfooterCtrl',
		templateUrl: VIEWS + 'app-footer.html'
	};
});
