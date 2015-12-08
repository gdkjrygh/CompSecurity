'use strict';


angular.module('sharingService', ['usersService', 'templatesService', 'makeComicWizard', 'remoteService',
									'templatesHelperService', 'drawingService'])

	.factory('sharingService', function (Templates, TemplatesHelper, makeComicWizard, Users, Remote, $filter, Draw) {

		var createBasePayload = function(method) {
			var template_id = makeComicWizard.templateId();
			var comic = Templates.get_template(template_id) || { template_id: template_id, comic_id: template_id };
			var user_a = makeComicWizard.userA();
			var user_b = makeComicWizard.userB();
            var customCanvas = makeComicWizard.customized() ? makeComicWizard.customCanvas() : null;

            if (comic && comic.type == Templates.TYPE_PHOTO_TEMPLATE) {
                user_a = Users.me();
                user_b = null;
            }

			var me = Users.me();
			var description = makeComicWizard.getDescriptionOrDefault(comic.description);
			var caption = TemplatesHelper.update_desc(description, user_a, user_b);
            var backgroundPhotoType = makeComicWizard.photoBackgroundType();

			var data = {
				method: method,
				user_id: me.pack.user_id,
				template_id: template_id,
                custom_canvas: customCanvas,
				fb_id_a: user_a.fb_id,
				fb_id_b: comic.type === 1 ? user_b.fb_id : '',
				comic_id: comic.comic_id,
				fb_message: caption,
				char_id_a: user_a.id,
				char_id_b: comic.type === 1 ? user_b.id : '',
				fb_mode: comic.type,
                background: backgroundPhotoType,
                text_bubble: makeComicWizard.hasTextBubble(),
				share_to_fb: me.last_share.facebook
			};

			return data;
		};


		var getRecipientIds = function(recipients) {
			return recipients.map(function(recipient) {
				return recipient.bs_id;
			});
		};

		var directShare = function(recipients) {
			var data = createBasePayload('create_direct_comic');
			data.share_to_fb = 0;
			data.recipients = getRecipientIds(recipients);
			return Remote.post(data);
		};

		var trackNativeShare = function () {
			var payload = createBasePayload('native_share_comic');
			payload.customized = !!makeComicWizard.customized();
			payload.has_custom_caption = !!makeComicWizard.customCaption();
			delete payload.custom_canvas;
			Remote.post(payload);
		};

		var sortRecipients = function (recipients) {
			return $filter('orderBy')(recipients, '-isCostar');
		};

		return {
			createBasePayload: createBasePayload,
			directShare: directShare,
			getRecipientIds: getRecipientIds,
			trackNativeShare: trackNativeShare,
			sortRecipients: sortRecipients
		};
	});
