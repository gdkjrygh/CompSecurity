'use strict';

angular.module('mfbApp')
	.controller('ProfilePicsCtrl', function ($scope, Users, TemplatesHelper, Remote, Launch, State, ImageBaseURL, NavHelper) {
		$scope.user = Users.me();
		$scope.profile_pics = [3022456, 3022536, 3022560, 3022586, 3022631, 3022831, 4582229, 4582242, 4582264, 4582293, 3022543, 3022554, 3022616, 3041095, 3041120, 4582252, 4582256, 4582335, 3107933, 4582270, 4582276, 4582351, 4582286, 4582357, 4582305, 4582314, 4582323, 3537250, 3540515, 3537142, 3537129, 3537112, 3537094, 3537077, 3537064, 3537056, 3540402, 3537003, 3540352, 3536904, 3536855, 3536823, 3583397, 3536800, 3536778];

		$scope.canLoad = true;
		$scope.pic_count = 15;

		$scope.ImageBaseURL = ImageBaseURL;

		$scope.add = function () {
			$scope.pic_count += 3;
			if ($scope.pic_count > $scope.profile_pics.length) {
				$scope.canLoad = false;
			}
		};
		$scope.picked_profile = 0;

		$scope.pick_profile_thumb = function (comic_id) {
			$scope.picked_profile = comic_id;
		};

		$scope.back = function () {
			if ($scope.picked_profile === 0) {
				NavHelper.back();
			} else {
				$scope.picked_profile = 0;
			}
		};

		$scope.save_profile = function () {
			State.set_saving(true);
			Remote.post({'method': 'save_profile_pic', 'comic_id': $scope.picked_profile})
				.success(function (data) {
					Users.set_thumb(data.fb_id, data.thumb);
					State.set_saving(false);
					NavHelper.avatar_home();
				})
				.error(
				function () {
					alert("Error");
				});
		};
	});
