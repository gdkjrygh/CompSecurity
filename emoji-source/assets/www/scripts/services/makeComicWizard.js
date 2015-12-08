'use strict';

angular.module('makeComicWizard', ['usersService', 'storageService', 'drawingService'])
	.factory('makeComicWizard', function (Users, Storage, Draw) {
		var state = {
			userA: Users.me(),
			userB: null,
			caption: null,
			templateId: null,
			defaultDirect: false,
            customCanvas: null
		};

		var loadOldData = function () {
			var fb_id = Storage.getItem('userA');
            if (fb_id && Users.get_user_fb(fb_id)) {
                state.userA = Users.get_user_fb(fb_id);
            }

			fb_id = Storage.getItem('userB');
            if (fb_id && Users.get_user_fb(fb_id)) {
                state.userB = Users.get_user_fb(fb_id);
            }
		};

		var getterSetterPersisted = function (name, newValue) {
			if (newValue) {
				state[name] = newValue;
				if (newValue.hasOwnProperty('fb_id')) {
					Storage.setItem(name, newValue.fb_id);
				}
			} else if (newValue === null) {
				delete state[name];
				Storage.removeItem(name);
			}
			return state[name];
		};

		var getterSetter = function (name, newValue) {
			if (newValue || newValue === '') {
				state[name] = newValue;
			} else if (newValue === null) {
				delete state[name];
			}
			return state[name];
		};

		return {
            init: loadOldData,
			userA: function (newValue) {
				return getterSetterPersisted('userA', newValue);
			},
			userB: function (newValue) {
				return getterSetterPersisted('userB', newValue);
			},
			swapUsers: function () {
				if (state.userB) {
					var tmp = state.userA;
					getterSetterPersisted('userA', state.userB);
					getterSetterPersisted('userB', tmp);
				}
			},
			templateId: function (newValue) {
				return getterSetter('templateId', newValue);
			},
			customized: function (newValue) {
				return getterSetter('customized', newValue);
			},
			customCaption: function (newValue) {
				return getterSetter('customCaption', newValue);
			},
            customCanvas: function (newValue) {
                return getterSetter('customCanvas', newValue);
            },
			defaultDirect: function(newValue) {
				return getterSetter('defaultDirect', newValue);
			},
            photoBackgroundType: function (newValue) {
                return getterSetter('photoBackgroundType', newValue);
            },
            hasTextBubble: function (newValue) {
                // sharingService uses this value for payload
                return !!getterSetter('hasTextBubble', newValue);
            },
			clearComicData: function () {
				getterSetter('templateId', null);
				getterSetter('customized', null);
				getterSetter('customCaption', null);
				getterSetter('defaultDirect', false);
                getterSetter('customCanvas', null);
                Draw.clearBackup();
			},
			getDescriptionOrDefault: function (defaultDescription) {
				var caption = getterSetter('customCaption');
				if (angular.isString(caption)) {
					return caption;
				}
				return defaultDescription;
			}
		};
	});
