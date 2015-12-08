'use strict';

angular.module('costarsService', ['usersService', 'remoteService'])
	.factory('Costars', function (Users, Remote, Log, $q) {
		var costars;
		var user = Users.me();
		var stars = [user];

		var loading_defer = $q.defer();

		var fetching_costars = false;
		var _fetch_retry = 0;
		var fetch_costars = function () {
			fetching_costars = true;
			var promise = Remote.post({'method':'mfb_get_costars'});
			promise.success(
				function (data) {
					if (data.hasOwnProperty('costars') && data.hasOwnProperty('friends')) {
						costars = data.costars;
                        angular.forEach(data.friends, function(friend) {
                            Users.add_user(friend);
                        });
						update_stars();
						loading_defer.resolve();
					} else {
						Log.log("Invalid costars data", data);
						fetch_costars_error("invalid costars data");
					}
				}
			).error(function (data, status, headers, config) {
				fetch_costars_error("http status " + status);
			});
		};

		var fetch_costars_error = function (message) {
			_fetch_retry += 1;
			if (_fetch_retry >= 3) {
				fetching_costars = false;
				loading_defer.reject(message);
				_fetch_retry = -1;
				return;
			}
			fetch_costars();
		};


		var init = function () {
			if (_fetch_retry === -1) {
				_fetch_retry = 1;
				loading_defer = $q.defer();
			}
			if (fetching_costars === false) {
				fetch_costars();
			}
			return loading_defer.promise;
		};

		var update_stars = function () {
			stars = [user];
			if (costars !== undefined) {
				for (var i = 0; i < costars.length; i++) {
					stars.push(Users.get_user_fb(costars[i]));
				}
			}
		};

	//	update_stars();
		return {
			get_costars:function () { return costars; },
			remove_costar:function (fb_id) {
				if (costars.indexOf(fb_id) != -1) {
					costars.splice(costars.indexOf(fb_id), 1);
					Remote.post({'method':'remove_costar', 'costar':fb_id}).success(
						function (data) {
							Log.log(data);
						}
					).error(function (data, status) {
						Log.log("remove_costar error - " + status);
					});
				}
				update_stars();
				return false;
			},

			add_costar:function (fb_id) {
				costars.push(fb_id);

				update_stars();
				Remote.post({'method':'add_costar', 'costar':fb_id}).success(
					function (data) {
						Log.log(data);
					}
				).error(function (data, status) {
					Log.log("add_costar error - " + status);
				});
			},

			init: init,

			setstate_for_testing: function(_costars) {
				costars = _costars;
			},
			getstate_for_testing: function() {
				return costars;
			}
		};
	}
);
