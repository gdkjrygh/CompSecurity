'use strict';

angular.module('stateService', [])
    .factory('State', function () {
		var state = {};
		var footer = {'category':'home', 'hidden':true, 'saving':false, 'unread':0};

		return {
			/* Footer methods... probably should put these in their own service */
			set_footer: function(category) {
				footer.saving = footer.hidden = false;
				footer.category = category;
			},
			hide_footer: function(value) {
				footer.hidden = value;
				footer.saving = false;
			},
			get_footer: function () {
				return footer;
			},
			set_saving:function (value) {
				footer.saving = value;
			},

			delete_key: function (key) {
				delete state[key];
			},


			get_key: function (key) {
				if (state.hasOwnProperty(key)) {
					return state[key];
				}
				return undefined;
			},
			set_key: function (key, value) {
				state[key] = value;
			}
		};
	})
	.factory('FlashPort', function ($q) {
		var port = 0;
		var deferred = $q.defer();

		return {
			port: function(new_port) {
				if (angular.isDefined(new_port)) {
					port = parseInt(new_port, 10);
					if (port !== 0) {
						deferred.resolve();
					}
				}
				return port;
			},
			waitForPort: function() {
				return deferred.promise;
			}
		};
	});