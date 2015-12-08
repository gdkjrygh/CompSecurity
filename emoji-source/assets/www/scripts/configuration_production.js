'use strict';

angular.module('configuration', [])
    .constant('ImageBaseURL', 'http://compose.bitstrips.com/v2/cpanel/')
    .constant('ImageBaseURLThumb', 'http://compose.bitstrips.com/v2/cpanel/')
	.constant('API_HOST', 'https://www.bitstrips.com/')
    .constant('BITMOJI_SERVICES_HOST', 'http://services.bitmoji.com/')
    .constant('TEMPLATES_HOST', 'http://www.bitstrips.com/')
    .constant('TEMPLATES_SCENE_HOST', 'http://images.bitstrips.com.s3.amazonaws.com/fb_bgs/')
    .constant('AVATAR_TEMPLATE_HOST', 'http://render.bitstrips.com/render/')
    .constant('ANALYTICS_TRACKING_ID', 'UA-3227477-24');
