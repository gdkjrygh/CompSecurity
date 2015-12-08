// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.schemas.event;

import org.apache.thrift.TEnum;

public final class ElementType extends Enum
    implements TEnum
{

    private static final ElementType $VALUES[];
    public static final ElementType ADD_FRIENDS_SECTION;
    public static final ElementType ADD_INTEREST_BUTTON;
    public static final ElementType ADD_MESSAGE_BUTTON;
    public static final ElementType ADD_PIN_BUTTON_BOOKMARKLET;
    public static final ElementType ADD_PIN_BUTTON_SCRAPE;
    public static final ElementType ADD_PIN_BUTTON_UPLOAD;
    public static final ElementType ADD_PIN_CANCEL_INSTALL_BOOKMARKLET;
    public static final ElementType ADD_PIN_FROM_WEBSITE_BUTTON;
    public static final ElementType ADD_PIN_INSTALL_BOOKMARKLET;
    public static final ElementType ADD_PIN_REP;
    public static final ElementType ADD_PIN_REP_BOOKMARKLET;
    public static final ElementType ADD_PIN_REP_SCRAPE;
    public static final ElementType ADD_PIN_REP_UPLOAD;
    public static final ElementType ADD_PLACE_BUTTON;
    public static final ElementType ANALYTICS_BUTTON;
    public static final ElementType API_ENVIRONMENTS_BUTTON;
    public static final ElementType APP_ICON;
    public static final ElementType APP_LIST_ITEM;
    public static final ElementType APP_RATING_ATTEMPT_BUTTON;
    public static final ElementType APP_RATING_DECLINE_BUTTON;
    public static final ElementType APP_RATING_REMIND_BUTTON;
    public static final ElementType AUTOCOMPLETE_SUGGESTION;
    public static final ElementType AUTOCOMPLETE_SUGGESTION_LC1;
    public static final ElementType AUTOCOMPLETE_SUGGESTION_LC2;
    public static final ElementType BACK_BUTTON;
    public static final ElementType BAD_LINK_BUTTON;
    public static final ElementType BOARD_CATEGORY;
    public static final ElementType BOARD_COVER;
    public static final ElementType BOARD_CREATE;
    public static final ElementType BOARD_CREATE_SECRET;
    public static final ElementType BOARD_CREATE_SUGGESTED;
    public static final ElementType BOARD_DELETE_BUTTON;
    public static final ElementType BOARD_DESCRIPTION;
    public static final ElementType BOARD_EDIT_BUTTON;
    public static final ElementType BOARD_FOLLOW;
    public static final ElementType BOARD_LEAVE_BUTTON;
    public static final ElementType BOARD_NAME;
    public static final ElementType BOARD_PICKER;
    public static final ElementType BOARD_RELATED_BOARD;
    public static final ElementType BOARD_SECRET;
    public static final ElementType BOARD_SHARE_BUTTON;
    public static final ElementType BOARD_SHARE_COPY_LINK_BUTTON;
    public static final ElementType BOARD_SHARE_EMAIL_BUTTON;
    public static final ElementType BOARD_SHARE_FACEBOOK_BUTTON;
    public static final ElementType BOARD_SHARE_FBMESSENGER_BUTTON;
    public static final ElementType BOARD_SHARE_LINE_BUTTON;
    public static final ElementType BOARD_SHARE_OTHER_APP_BUTTON;
    public static final ElementType BOARD_SHARE_OTHER_BUTTON;
    public static final ElementType BOARD_SHARE_SMS_BUTTON;
    public static final ElementType BOARD_SHARE_TWITTER_BUTTON;
    public static final ElementType BOARD_SHARE_WHATSAPP_BUTTON;
    public static final ElementType BRAND_SURVEY_DIALOG_BACKGROUND_DISMISS;
    public static final ElementType BRAND_SURVEY_DIALOG_LATER_BUTTON;
    public static final ElementType BRAND_SURVEY_DIALOG_NEVER_BUTTON;
    public static final ElementType BRAND_SURVEY_DIALOG_YES_BUTTON;
    public static final ElementType BROWSER_BUTTON;
    public static final ElementType BROWSER_WEB_IMAGE;
    public static final ElementType BUILD_HOMEFEED_BUTTON;
    public static final ElementType BULK_CANCEL_BUTTON;
    public static final ElementType BULK_COPY_PINS_BUTTON;
    public static final ElementType BULK_DELETE_PINS_BUTTON;
    public static final ElementType BULK_INVITER_BUTTON;
    public static final ElementType BULK_MOVE_PINS_BUTTON;
    public static final ElementType BUYABLE_CATEGORY_ICON;
    public static final ElementType BUYABLE_CHECKOUT_APPLE_PAY_BUTTON;
    public static final ElementType BUYABLE_CHECKOUT_CREDIT_CARD_BUTTON;
    public static final ElementType BUYABLE_CHECKOUT_EDIT_BUTTON;
    public static final ElementType BUYABLE_CHECKOUT_ERROR_DISMISS_BUTTON;
    public static final ElementType BUYABLE_CHECKOUT_LEARN_MORE_BUTTON;
    public static final ElementType BUYABLE_CHECKOUT_QUANTITY_FIELD;
    public static final ElementType BUYABLE_CHECKOUT_SAVE_BUTTON;
    public static final ElementType BUYABLE_CHECKOUT_SUMMARY_PAYMENT_CELL;
    public static final ElementType BUYABLE_CHECKOUT_SUMMARY_PAY_BUTTON;
    public static final ElementType BUYABLE_CHECKOUT_SUMMARY_SHIP_ADDRESS_CELL;
    public static final ElementType BUYABLE_CHECKOUT_SUMMARY_SHIP_METHOD_CELL;
    public static final ElementType BUYABLE_CHECKOUT_VARIANT_CIRCLE_CELL;
    public static final ElementType BUYABLE_CHECKOUT_VARIANT_TABLE_CELL;
    public static final ElementType BUYABLE_CLOSEUP_READ_MORE;
    public static final ElementType BUYABLE_CLOSEUP_RETURN_POLICY;
    public static final ElementType BUYABLE_CLOSEUP_VARIANT_SWATCH_CELL;
    public static final ElementType BUYABLE_CLOSEUP_VARIANT_TEXT_CELL;
    public static final ElementType BUYABLE_CONTACTS_ADDRESS_CELL;
    public static final ElementType BUYABLE_ORDER_DETAILS_CONTACT_SELLER_BUTTON;
    public static final ElementType BUYABLE_ORDER_DETAILS_VISIT_SELLER_BUTTON;
    public static final ElementType BUYABLE_ORDER_HISTORY_CELL;
    public static final ElementType BUYABLE_PAYMENT_ADD_NEW_CELL;
    public static final ElementType BUYABLE_PAYMENT_BILLING_CONTACTS_BUTTON;
    public static final ElementType BUYABLE_PAYMENT_BILLING_RECENTS_BUTTON;
    public static final ElementType BUYABLE_PAYMENT_BILLING_TOGGLE;
    public static final ElementType BUYABLE_PAYMENT_CAMERA_BUTTON;
    public static final ElementType BUYABLE_PAYMENT_CELL;
    public static final ElementType BUYABLE_PAYMENT_DELETE_BUTTON;
    public static final ElementType BUYABLE_RECENT_ADDRESS_CELL;
    public static final ElementType BUYABLE_SETTINGS_ADDRESS_SAVE_BUTTON;
    public static final ElementType BUYABLE_SETTINGS_PAYMENT_SAVE_BUTTON;
    public static final ElementType BUYABLE_SHIPPING_ADDRESS_ADD_NEW_CELL;
    public static final ElementType BUYABLE_SHIPPING_ADDRESS_CELL;
    public static final ElementType BUYABLE_SHIPPING_ADDRESS_CONTACTS_BUTTON;
    public static final ElementType BUYABLE_SHIPPING_ADDRESS_DELETE_BUTTON;
    public static final ElementType BUYABLE_SHIPPING_METHOD_CELL;
    public static final ElementType BUY_BUTTON;
    public static final ElementType CAMERA_BUTTON;
    public static final ElementType CAMPBELL_NAV_ADD_PIN_BUTTON;
    public static final ElementType CAMPBELL_NAV_ADD_PIN_CREATE_AD;
    public static final ElementType CAMPBELL_NAV_ADD_PIN_FROM_WEB_LINK;
    public static final ElementType CAMPBELL_NAV_ADD_PIN_UPLOAD;
    public static final ElementType CAMPBELL_NAV_ADS_AWARENESS_LINK;
    public static final ElementType CAMPBELL_NAV_ADS_BULK_EDITOR_LINK;
    public static final ElementType CAMPBELL_NAV_ADS_BUYABLE_LINK;
    public static final ElementType CAMPBELL_NAV_ADS_CINEMATIC_PIN_LINK;
    public static final ElementType CAMPBELL_NAV_ADS_CONVERSION_TRACKING_LINK;
    public static final ElementType CAMPBELL_NAV_ADS_ENGAGEMENT_LINK;
    public static final ElementType CAMPBELL_NAV_ADS_MANAGER_BUTTON;
    public static final ElementType CAMPBELL_NAV_ADS_OVERVIEW_LINK;
    public static final ElementType CAMPBELL_NAV_ADS_TOOLS_LINK;
    public static final ElementType CAMPBELL_NAV_ADS_TRAFFIC_LINK;
    public static final ElementType CAMPBELL_NAV_ANALYTICS_BUTTON;
    public static final ElementType CAMPBELL_NAV_ANALYTICS_OVERVIEW_LINK;
    public static final ElementType CAMPBELL_NAV_AUDIENCE_LINK;
    public static final ElementType CAMPBELL_NAV_CATEGORIES_BUTTON;
    public static final ElementType CAMPBELL_NAV_DRAWER_ADS_MANAGER_LINK;
    public static final ElementType CAMPBELL_NAV_DRAWER_ANALYTICS_LINK;
    public static final ElementType CAMPBELL_NAV_DRAWER_CASE_STUDIES_LINK;
    public static final ElementType CAMPBELL_NAV_DRAWER_CLOSE_BUTTON;
    public static final ElementType CAMPBELL_NAV_DRAWER_CLOSE_GREY_PAGE;
    public static final ElementType CAMPBELL_NAV_DRAWER_CREATE_AD_LINK;
    public static final ElementType CAMPBELL_NAV_DRAWER_DEVELOPER_DOCS_LINK;
    public static final ElementType CAMPBELL_NAV_DRAWER_HELP_CENTER_LINK;
    public static final ElementType CAMPBELL_NAV_DRAWER_HOMEFEED_LINK;
    public static final ElementType CAMPBELL_NAV_DRAWER_HOW_TO_GUIDES_LINK;
    public static final ElementType CAMPBELL_NAV_DRAWER_OPEN_BUTTON;
    public static final ElementType CAMPBELL_NAV_DRAWER_PINS_FROM_WEBSITE_LINK;
    public static final ElementType CAMPBELL_NAV_DRAWER_PIN_IT_BUTTON_LINK;
    public static final ElementType CAMPBELL_NAV_DRAWER_RICH_PINS_LINK;
    public static final ElementType CAMPBELL_NAV_DRAWER_UPLOAD_FROM_COMPUTER_LINK;
    public static final ElementType CAMPBELL_NAV_DRAWER_WEBSITE_CONFIRMATION_LINK;
    public static final ElementType CAMPBELL_NAV_HOMEFEED_BUTTON;
    public static final ElementType CAMPBELL_NAV_NOTIFICATIONS_BUTTON;
    public static final ElementType CAMPBELL_NAV_PROFILE_LINK;
    public static final ElementType CAMPBELL_NAV_SEARCH_BAR;
    public static final ElementType CAMPBELL_NAV_USER_MENU_BILLING_LINK;
    public static final ElementType CAMPBELL_NAV_USER_MENU_BUTTON;
    public static final ElementType CAMPBELL_NAV_USER_MENU_HELP_CENTER_LINK;
    public static final ElementType CAMPBELL_NAV_USER_MENU_LOGOUT_LINK;
    public static final ElementType CAMPBELL_NAV_USER_MENU_PROFILE_LINK;
    public static final ElementType CAMPBELL_NAV_USER_MENU_SETTINGS_LINK;
    public static final ElementType CAMPBELL_NAV_WEBSITE_LINK;
    public static final ElementType CANCEL_BUTTON;
    public static final ElementType CANCEL_EXTENSION_INSTALL_BUTTON;
    public static final ElementType CARD_ATTRIBUTION_LINK;
    public static final ElementType CATEGORY_ICON;
    public static final ElementType CATEGORY_RECENT;
    public static final ElementType CHANGE_PASSWORD_BUTTON;
    public static final ElementType CLEAR_CONTACTS_BUTTON;
    public static final ElementType CLEAR_HISTORY_BUTTON;
    public static final ElementType CLEAR_SEARCHES_BUTTON;
    public static final ElementType CLIPBOARD_BUTTON;
    public static final ElementType CLOSEUP_PINIT_SHORTCUT;
    public static final ElementType CLOSE_BUTTON;
    public static final ElementType COLLABORATOR_TEXT;
    public static final ElementType COMMENTS_BUTTON;
    public static final ElementType COMMERCE_EDUCATION_DISMISS_BUTTON;
    public static final ElementType COMMERCE_EDUCATION_SEARCH_TOPIC_BUTTON;
    public static final ElementType COMMERCE_SEARCH_PRICE_FILTER_BLUE_BUTTON;
    public static final ElementType COMMERCE_SEARCH_PRICE_FILTER_TAKEOVER;
    public static final ElementType COMMERCE_SEARCH_PRICE_FILTER_TAKEOVER_CLEAR_BUTTON;
    public static final ElementType COMMERCE_SEARCH_PRICE_FILTER_TAKEOVER_CLOSE_BUTTON;
    public static final ElementType COMMERCE_SHOP_MORE_BUTTON;
    public static final ElementType COMPOSE_EMAIL_INVITE_BUTTON;
    public static final ElementType COMPOSE_SMS_INVITE_BUTTON;
    public static final ElementType CONTEXTUAL_STORY_BOARD;
    public static final ElementType CONTEXTUAL_STORY_SEARCH;
    public static final ElementType CONTEXTUAL_STORY_SEE_MORE;
    public static final ElementType CONTEXTUAL_STORY_TOPIC;
    public static final ElementType CONTEXTUAL_STORY_USER;
    public static final ElementType CONVERSATION_CREATE_BUTTON;
    public static final ElementType CONVERSATION_INBOX_BUTTON;
    public static final ElementType CONVERSATION_LIST_ITEM;
    public static final ElementType CONVERSATION_NEW_BUTTON;
    public static final ElementType COPY_LINK_BUTTON;
    public static final ElementType COUNTRY_BUTTON;
    public static final ElementType CREATE_BOARD_BUTTON;
    public static final ElementType CREATE_BUTTON;
    public static final ElementType CUSTOM_GENDER_ON_HOVER;
    public static final ElementType CUSTOM_GENDER_SAVE_BUTTON;
    public static final ElementType DECLINE_BUTTON;
    public static final ElementType DIGEST_CAROUSEL_CONTENT_REP;
    public static final ElementType DIGEST_FEEDBACK_DIALOG_BUTTON_HIDE_THROUGH_BOARD_REC;
    public static final ElementType DIGEST_FEEDBACK_DIALOG_BUTTON_UNFOLLOW_BOARD;
    public static final ElementType DIGEST_FEEDBACK_DIALOG_BUTTON_UNFOLLOW_INTEREST;
    public static final ElementType DIGEST_FEEDBACK_DIALOG_BUTTON_UNFOLLOW_USER;
    public static final ElementType DIGEST_PIN;
    public static final ElementType DIGEST_STORY_CUSTOM_ACTION_BUTTON;
    public static final ElementType DIGEST_STORY_EXPAND_BUTTON;
    public static final ElementType DIGEST_STORY_FEEDBACK_BUTTON;
    public static final ElementType DIGEST_STORY_FOLLOW_BUTTON;
    public static final ElementType DIGEST_STORY_HEADER_BUTTON;
    public static final ElementType DISCOVER_FEATURED_ITEM;
    public static final ElementType DISCOVER_FRIEND_MERCHANDISING_CLICKTHROUGH;
    public static final ElementType DISCOVER_TRENDING_CATEGORY;
    public static final ElementType DOMAIN_URL;
    public static final ElementType DONE_BUTTON;
    public static final ElementType DUPLICATE_PIN_WARNING;
    public static final ElementType EDIT_HOME_FEED_BUTTON;
    public static final ElementType EDUCATION_GUIDED_SEARCH_COMPLETE_BUTTON;
    public static final ElementType EDUCATION_GUIDED_SEARCH_SUGGESTION;
    public static final ElementType EDUCATION_TARGET;
    public static final ElementType EDUCATION_TOOLTIP_BACKGROUND;
    public static final ElementType EDUCATION_TOOLTIP_CONFIRM_BUTTON;
    public static final ElementType EDUCATION_TOOLTIP_DISMISS_BUTTON;
    public static final ElementType EDUCATION_TOOLTIP_SPOTLIGHT;
    public static final ElementType EMAIL_BUTTON;
    public static final ElementType EXPLORE_BUTTON;
    public static final ElementType FACEBOOK_CONNECT;
    public static final ElementType FACEBOOK_INVITE_BUTTON;
    public static final ElementType FACEBOOK_TIMELINE_CONNECT;
    public static final ElementType FEED_SUBCATEGORY;
    public static final ElementType FINDFRIENDS_BUTTON;
    public static final ElementType FIND_FRIENDS_BUTTON;
    public static final ElementType FIND_FRIENDS_BUTTON_ADDRESS_BOOK;
    public static final ElementType FIND_FRIENDS_BUTTON_FACEBOOK;
    public static final ElementType FIND_FRIENDS_BUTTON_FB_MESSENGER;
    public static final ElementType FIND_FRIENDS_BUTTON_LINE;
    public static final ElementType FIND_FRIENDS_BUTTON_MORE;
    public static final ElementType FIND_FRIENDS_BUTTON_TWITTER;
    public static final ElementType FIND_FRIENDS_BUTTON_WHATSAPP;
    public static final ElementType FIND_FRIENDS_PROFILE_BUTTON;
    public static final ElementType FIND_IMAGES_BUTTON;
    public static final ElementType FIND_MORE_BOARDS_BUTTON;
    public static final ElementType FLASHLIGHT_ANNOTATION;
    public static final ElementType FLASHLIGHT_SEARCH_ICON;
    public static final ElementType FLEXIBLE_NUX_LAUNCHER;
    public static final ElementType FLOWED_INTEREST;
    public static final ElementType FOLLOWERS_BUTTON;
    public static final ElementType FOLLOWING_BOARDS_BUTTON;
    public static final ElementType FOLLOWING_BUTTON;
    public static final ElementType FOLLOWING_INTERESTS_BUTTON;
    public static final ElementType FOLLOWING_PINNERS_BUTTON;
    public static final ElementType FOLLOW_ALL_USERS_BUTTON;
    public static final ElementType FOLLOW_BOARDS_BUTTON;
    public static final ElementType FPE_CREATE_FIRST_BOARD_SUGGESTED_TITLE_BUTTON;
    public static final ElementType GALLERY_BUTTON;
    public static final ElementType GENDER_BUTTON;
    public static final ElementType GET_EXTENSION_BUTTON;
    public static final ElementType GET_STARTED_BUTTON;
    public static final ElementType GOOD_LINK_BUTTON;
    public static final ElementType GPLUS_CONNECT;
    public static final ElementType GPLUS_INVITE_BUTTON;
    public static final ElementType HASH_TAG;
    public static final ElementType HELP_BUTTON;
    public static final ElementType HELP_CENTER_BUTTON;
    public static final ElementType HELP_FLYOUT_BUTTON;
    public static final ElementType HELP_PULSE;
    public static final ElementType HOMEFEED_BUILDER_BOARD;
    public static final ElementType HOMEFEED_BUILDER_BUTTON;
    public static final ElementType HOMEFEED_BUILDER_FOLLOW_TOAST;
    public static final ElementType HOMEFEED_BUILDER_GRID_ITEM;
    public static final ElementType HOMEFEED_BUILDER_INTEREST;
    public static final ElementType HOMEFEED_BUILDER_PIN;
    public static final ElementType HOMEFEED_BUILDER_SEARCH_RESULT;
    public static final ElementType HOMEFEED_BUILDER_SEE_MORE_BUTTON;
    public static final ElementType HOMEFEED_BUILDER_TOPIC_DISMISS_BUTTON;
    public static final ElementType HOMEFEED_BUILDER_USER;
    public static final ElementType INSTALL_EXTENSION_BUTTON;
    public static final ElementType INTEREST_FOLLOW;
    public static final ElementType INTEREST_PIN_ANNOTATION;
    public static final ElementType INTEREST_SUGGESTION;
    public static final ElementType INVITE_ALL_TOGGLE;
    public static final ElementType INVITE_BUTTON;
    public static final ElementType INVITE_CONTACT;
    public static final ElementType INVITE_DELETE_BUTTON;
    public static final ElementType LANGUAGE_BUTTON;
    public static final ElementType LIBRARY_PROFILE_PIN_TOPIC;
    public static final ElementType LIBRARY_SORT_BOARDS;
    public static final ElementType LIBRARY_SORT_BOARDS_OPTION_CHANGED;
    public static final ElementType LIKES_BUTTON;
    public static final ElementType LINK_FEEDBACK_OPTION_BUTTON;
    public static final ElementType LINK_OUT_BUTTON;
    public static final ElementType LOCATION_BUTTON;
    public static final ElementType LOGIN_BUTTON;
    public static final ElementType LOGO;
    public static final ElementType LOGOUT_BUTTON;
    public static final ElementType LOOKBOOK_PROFILE_IMAGE;
    public static final ElementType LOOKBOOK_TAG;
    public static final ElementType MAP_ADD_BUTTON;
    public static final ElementType MAP_ANNOTATION;
    public static final ElementType MAP_DIRECTIONS_BUTTON;
    public static final ElementType MAP_PIN_ICON;
    public static final ElementType MAP_SEE_ON_MAP_BUTTON;
    public static final ElementType MAP_TOGGLE_BUTTON;
    public static final ElementType MENU_BUTTON;
    public static final ElementType MESSAGE_INPUT;
    public static final ElementType MORE_INFO_BUTTON;
    public static final ElementType MORE_PINS_BUTTON;
    public static final ElementType MOVE_PINS_BUTTON;
    public static final ElementType MULTIOBJECT_BOARD_LOAD_MORE_BUTTON;
    public static final ElementType MULTIOBJECT_PINNER_LOAD_MORE_BUTTON;
    public static final ElementType NAME_BUTTON;
    public static final ElementType NAVIGATION_DISCOVER_BUTTON;
    public static final ElementType NAVIGATION_HOME_BUTTON;
    public static final ElementType NAVIGATION_LOGO_BUTTON;
    public static final ElementType NEWS_BUTTON;
    public static final ElementType NEWS_FEED_ACTOR_IMAGE;
    public static final ElementType NEWS_FEED_ACTOR_LABEL;
    public static final ElementType NEWS_FEED_ANSWER;
    public static final ElementType NEWS_FEED_BOARD;
    public static final ElementType NEWS_FEED_PIN;
    public static final ElementType NEWS_FEED_QUESTION;
    public static final ElementType NEWS_FEED_REPLY;
    public static final ElementType NEWS_FEED_USER;
    public static final ElementType NEXT_BUTTON;
    public static final ElementType NEXT_CLOSEUP_BUTTON;
    public static final ElementType NOTIFICATIONS_ICON;
    public static final ElementType NUJ_CREATE_BOARD_TITLE_BUTTON;
    public static final ElementType NUX_CONTINUE_BUTTON;
    public static final ElementType NUX_INTEREST_FOLLOW;
    public static final ElementType NUX_INTEREST_UNFOLLOW;
    public static final ElementType NUX_USE_CASE_TITLE;
    public static final ElementType ORDER_HISTORY_BUTTON;
    public static final ElementType PARTNER_PERFORMANCE_STATS;
    public static final ElementType PARTNER_PERFORMANCE_TOP_PIN;
    public static final ElementType PAYMENT_METHODS_BUTTON;
    public static final ElementType PERSONALIZED_RECOMMENDATIONS_BUTTON;
    public static final ElementType PFY_REASON_BUTTON;
    public static final ElementType PHONE_BUTTON;
    public static final ElementType PHOTOS_BUTTON;
    public static final ElementType PINNER_MODULE;
    public static final ElementType PINPICKS_ICON;
    public static final ElementType PINVITATIONAL_REQUEST_INVITE_SUBMITTED;
    public static final ElementType PIN_ACTIVITY_LIKE;
    public static final ElementType PIN_ATTRIBUTION;
    public static final ElementType PIN_BOARD;
    public static final ElementType PIN_BOARD_FOLLOW;
    public static final ElementType PIN_BOARD_PIN;
    public static final ElementType PIN_CAPTION_COMMENT;
    public static final ElementType PIN_CELL_BUTTON_PFY_PIN_SOURCE;
    public static final ElementType PIN_CELL_BUTTON_PROMOTED_PIN_SOURCE;
    public static final ElementType PIN_CLOSEUP_TRANSITION_IMAGE;
    public static final ElementType PIN_COMMENT_BUTTON;
    public static final ElementType PIN_DELETE_BUTTON;
    public static final ElementType PIN_DESCRIPTION;
    public static final ElementType PIN_DOMAIN;
    public static final ElementType PIN_EDIT_BUTTON;
    public static final ElementType PIN_FEEDBACK_BUTTON_INTEREST;
    public static final ElementType PIN_FEEDBACK_BUTTON_PFY;
    public static final ElementType PIN_FEEDBACK_BUTTON_PROMOTED;
    public static final ElementType PIN_FEEDBACK_BUTTON_REPORT_PIN;
    public static final ElementType PIN_FEEDBACK_BUTTON_REPORT_UNRELATED_PIN;
    public static final ElementType PIN_FEEDBACK_BUTTON_SEARCH;
    public static final ElementType PIN_FEEDBACK_BUTTON_STATE_REASON_PFY;
    public static final ElementType PIN_FEEDBACK_BUTTON_STATE_REASON_PROMOTED;
    public static final ElementType PIN_FEEDBACK_DIALOG_BUTTON;
    public static final ElementType PIN_FEEDBACK_DIALOG_BUTTON_DISMISS;
    public static final ElementType PIN_FEEDBACK_DIALOG_BUTTON_HIDE_PIN_PFY;
    public static final ElementType PIN_FEEDBACK_DIALOG_BUTTON_HIDE_PIN_PROMOTED;
    public static final ElementType PIN_FEEDBACK_DIALOG_BUTTON_HIDE_PROMOTED_PIN;
    public static final ElementType PIN_FEEDBACK_DIALOG_BUTTON_LEARN_MORE_PROMOTED;
    public static final ElementType PIN_FEEDBACK_DIALOG_BUTTON_PFY_STOP_RECS_FROM_THROUGH_BOARD;
    public static final ElementType PIN_FEEDBACK_DIALOG_BUTTON_PFY_STOP_RECS_FROM_THROUGH_INTEREST;
    public static final ElementType PIN_FEEDBACK_DIALOG_BUTTON_PFY_STOP_RECS_FROM_THROUGH_PIN;
    public static final ElementType PIN_FEEDBACK_DIALOG_BUTTON_PIN_NOT_RELATED_TO_INTEREST;
    public static final ElementType PIN_FEEDBACK_DIALOG_BUTTON_PIN_NOT_RELATED_TO_SEARCH;
    public static final ElementType PIN_FEEDBACK_DIALOG_BUTTON_REPORT_PIN;
    public static final ElementType PIN_FEEDBACK_DIALOG_BUTTON_UNFOLLOW_BOARD;
    public static final ElementType PIN_FEEDBACK_DIALOG_BUTTON_UNFOLLOW_INTEREST;
    public static final ElementType PIN_FEEDBACK_DIALOG_BUTTON_UNFOLLOW_USER;
    public static final ElementType PIN_FEEDBACK_REASON_BUTTON_NOT_INTERESTED;
    public static final ElementType PIN_FEEDBACK_REASON_BUTTON_OFFENSIVE;
    public static final ElementType PIN_FEEDBACK_REASON_BUTTON_PFY;
    public static final ElementType PIN_FEEDBACK_REASON_BUTTON_PROMOTED;
    public static final ElementType PIN_FEEDBACK_REASON_BUTTON_SEEN_BEFORE;
    public static final ElementType PIN_FLAG_BUTTON;
    public static final ElementType PIN_HIDE_BUTTON;
    public static final ElementType PIN_INTEREST;
    public static final ElementType PIN_LIKER;
    public static final ElementType PIN_LIKE_BUTTON;
    public static final ElementType PIN_LINK_MODULE_ACTION_BUTTON;
    public static final ElementType PIN_LINK_MODULE_DOMAIN_OWNER_PROFILE;
    public static final ElementType PIN_MORE_ACTIVITY;
    public static final ElementType PIN_ORIGINAL_BOARD;
    public static final ElementType PIN_ORIGINAL_BOARD_FOLLOW;
    public static final ElementType PIN_ORIGINAL_BOARD_PIN;
    public static final ElementType PIN_PINNED_TO;
    public static final ElementType PIN_PROMOTED_INFO;
    public static final ElementType PIN_READING_LIST_BUTTON;
    public static final ElementType PIN_RELATED_PIN;
    public static final ElementType PIN_REPIN_BUTTON;
    public static final ElementType PIN_REPORT_BUTTON;
    public static final ElementType PIN_RICH_PIN_ACTION_BUTTON;
    public static final ElementType PIN_SAVED_BY;
    public static final ElementType PIN_SAVE_BUTTON;
    public static final ElementType PIN_SEND_BUTTON;
    public static final ElementType PIN_SHARE;
    public static final ElementType PIN_SHARE_BUTTON;
    public static final ElementType PIN_SHARE_EMAIL_BUTTON;
    public static final ElementType PIN_SHARE_FACEBOOK_BUTTON;
    public static final ElementType PIN_SHARE_FACEBOOK_PINLIST_OTHER_PIN_BUTTON;
    public static final ElementType PIN_SHARE_FACEBOOK_PINLIST_TRENDING_STORY;
    public static final ElementType PIN_SHARE_FBMESSENGER_BUTTON;
    public static final ElementType PIN_SHARE_FB_MESSENGER;
    public static final ElementType PIN_SHARE_FB_TIMELINE;
    public static final ElementType PIN_SHARE_LINE_BUTTON;
    public static final ElementType PIN_SHARE_MESSAGE;
    public static final ElementType PIN_SHARE_OTHER_APP_BUTTON;
    public static final ElementType PIN_SHARE_SMS_BUTTON;
    public static final ElementType PIN_SHARE_THIRD_PARTY_EXTENSION;
    public static final ElementType PIN_SHARE_TWITTER_BUTTON;
    public static final ElementType PIN_SHARE_WHATSAPP;
    public static final ElementType PIN_SHARE_WHATSAPP_BUTTON;
    public static final ElementType PIN_SOURCE_IMAGE;
    public static final ElementType PIN_SUBMIT;
    public static final ElementType PIN_UPLOAD_BUTTON;
    public static final ElementType PIN_USER;
    public static final ElementType PIN_VIA;
    public static final ElementType PIN_VIA_PIN;
    public static final ElementType PLACES_BUTTON;
    public static final ElementType PLACES_LIST_PLACE;
    public static final ElementType PLACE_IMAGE;
    public static final ElementType PLACE_MODULE_BUTTON;
    public static final ElementType PLACE_MODULE_MAP;
    public static final ElementType PLACE_PICKER_CREATE;
    public static final ElementType PLACE_PICKER_IMAGE;
    public static final ElementType PLACE_VIEW_DIRECTIONS_APPLE;
    public static final ElementType PLACE_VIEW_DIRECTIONS_BUTTON;
    public static final ElementType PLACE_VIEW_DIRECTIONS_GOOGLE;
    public static final ElementType PLACE_VIEW_LARGE_MAP;
    public static final ElementType PLACE_VIEW_MAP_CALLOUT;
    public static final ElementType PLACE_VIEW_MAP_MARKER;
    public static final ElementType PLACE_VIEW_PHONE_BUTTON;
    public static final ElementType PLACE_VIEW_SITE_BUTTON;
    public static final ElementType PLACE_VIEW_SMALL_MAP;
    public static final ElementType PREV_CLOSEUP_BUTTON;
    public static final ElementType PROFILE_BUTTON;
    public static final ElementType PROFILE_FACEBOOK;
    public static final ElementType PROFILE_IMAGE;
    public static final ElementType PROFILE_TWITTER;
    public static final ElementType PROFILE_URL;
    public static final ElementType PROMOTED_OK_BUTTON;
    public static final ElementType PUSH_NOTIFICATIONS_BUTTON;
    public static final ElementType PW_RESET_DIRECT_EMAIL_BUTTON;
    public static final ElementType PW_RESET_SEND_EMAIL_BUTTON;
    public static final ElementType PW_RESET_USER_SEARCH_BUTTON;
    public static final ElementType RAKUTEN_CONNECT;
    public static final ElementType RECENT_SEARCH_SUGGESTION;
    public static final ElementType RECOMMENDATION_SECTION;
    public static final ElementType REFRESH_BUTTON;
    public static final ElementType REGISTER_AGE_STEP;
    public static final ElementType REGISTER_EMAIL_STEP;
    public static final ElementType REGISTER_GENDER_STEP;
    public static final ElementType REGISTER_NAME_STEP;
    public static final ElementType REGISTER_PASSWORD_STEP;
    public static final ElementType REGISTER_PHONE_STEP;
    public static final ElementType REGISTER_SMS_STEP;
    public static final ElementType RELATED_INTEREST;
    public static final ElementType RELATED_RICH_PIN_BUTTON;
    public static final ElementType REMOVE_BUTTON;
    public static final ElementType REMOVE_PLACE_BUTTON;
    public static final ElementType REMOVE_SUGGESTED_USER_BUTTON;
    public static final ElementType REPINS_BUTTON;
    public static final ElementType REPIN_ADD_PLACE_BUTTON;
    public static final ElementType REPIN_DIALOG_SUGGESTED_BOARD;
    public static final ElementType REPIN_EDIT_PLACE_BUTTON;
    public static final ElementType REPIN_SUGGESTED_BOARD;
    public static final ElementType RESET_BUTTON;
    public static final ElementType RETRY_BUTTON;
    public static final ElementType RIBBON_BUTTON;
    public static final ElementType RICH_ACTION_BUTTON;
    public static final ElementType SAFARI_KEYCHAIN_NOT_NOW_BUTTON;
    public static final ElementType SAFARI_KEYCHAIN_USE_PASSWORD_BUTTON;
    public static final ElementType SAVE_AUTOCOMPLETE_GOOGLE_SEARCH;
    public static final ElementType SAVE_AUTOCOMPLETE_RECENTLY_VISITED;
    public static final ElementType SAVE_BROWSER_COPY_LINK_BUTTON;
    public static final ElementType SAVE_BROWSER_DRAWER;
    public static final ElementType SAVE_BROWSER_OPEN_IN_SAFARI_BUTTON;
    public static final ElementType SAVE_BROWSER_PINIT_BUTTON;
    public static final ElementType SAVE_EXTENSION_UPSELL;
    public static final ElementType SAVE_TABBAR_BUTTON;
    public static final ElementType SAVE_TRENDING_SEARCH;
    public static final ElementType SAVE_TRENDING_WEBSITE;
    public static final ElementType SAVE_USER_SETTINGS_BUTTON;
    public static final ElementType SEARCH_ACTION_SUGGESTION;
    public static final ElementType SEARCH_ALL_WITH_QUERY;
    public static final ElementType SEARCH_BOARDS_BUTTON;
    public static final ElementType SEARCH_BOX_ADD_TOKEN_BUTTON;
    public static final ElementType SEARCH_BOX_TEXT_INPUT;
    public static final ElementType SEARCH_BUTTON;
    public static final ElementType SEARCH_BUYABLE_PINS_BUTTON;
    public static final ElementType SEARCH_CONTACT_INPUT;
    public static final ElementType SEARCH_CONTACT_LIST_ITEM;
    public static final ElementType SEARCH_FILTER_DROPDOWNBUTTON;
    public static final ElementType SEARCH_FILTER_SUGGESTION;
    public static final ElementType SEARCH_GUIDE_SUGGESTION;
    public static final ElementType SEARCH_MY_PINS_BUTTON;
    public static final ElementType SEARCH_PINNERS_BUTTON;
    public static final ElementType SEARCH_PINS_BUTTON;
    public static final ElementType SEARCH_PLACES_BUTTON;
    public static final ElementType SEARCH_PRIVACY_BUTTON;
    public static final ElementType SEARCH_PRIVACY_LINK;
    public static final ElementType SEARCH_QUERY_TYPO_CORRECTION;
    public static final ElementType SEARCH_RELATED_CATEGORY;
    public static final ElementType SEARCH_RELATED_QUERY;
    public static final ElementType SEARCH_TOKEN;
    public static final ElementType SEE_MORE_BUTTON;
    public static final ElementType SEE_OTHER_PINS_BUTTON;
    public static final ElementType SEND_BUTTON;
    public static final ElementType SEND_INVITE_BUTTON;
    public static final ElementType SEND_SMS_INVITE_BUTTON;
    public static final ElementType SEND_SOCIAL_BUTTON;
    public static final ElementType SEND_TO_PINNER_BUTTON;
    public static final ElementType SETTINGS_BUTTON;
    public static final ElementType SETTINGS_OFFLINE_BOARD_TOGGLE;
    public static final ElementType SETTINGS_OFFLINE_BOARD_TOGGLE_ALL;
    public static final ElementType SHARE_EXTENSION_ALL_BOARDS_BOARD;
    public static final ElementType SHARE_EXTENSION_BOARD_CELL;
    public static final ElementType SHARE_EXTENSION_CREATE_BOARD_BUTTON;
    public static final ElementType SHARE_EXTENSION_CREATE_BOARD_CELL;
    public static final ElementType SHARE_EXTENSION_EDIT_DESCRIPTION_CELL;
    public static final ElementType SHARE_EXTENSION_IMAGE;
    public static final ElementType SHARE_EXTENSION_PICK_BOARD_CELL;
    public static final ElementType SHARE_EXTENSION_PIN_IT_BUTTON;
    public static final ElementType SHARE_EXTENSION_RECENT_BOARD_CELL;
    public static final ElementType SHARE_EXTENSION_UPSELL_PLUS_BUTTON;
    public static final ElementType SHARE_SOCIAL_BUTTON;
    public static final ElementType SHIPPING_ADDRESSES_BUTTON;
    public static final ElementType SHOW_PASSWORD_BUTTON;
    public static final ElementType SIGNUP_BUTTON;
    public static final ElementType SIGNUP_TRENDING_PREVIEW_BUTTON;
    public static final ElementType SIMILAR_BOARD_FOLLOW_BUTTON;
    public static final ElementType SIMILAR_BOARD_OPEN_BUTTON;
    public static final ElementType SINGLE_PIN_POPOVER;
    public static final ElementType SOCIAL_NETWORK_CONNECT_BUTTON;
    public static final ElementType STERLING_30_DAY_MOST_CLICKED_BUTTON;
    public static final ElementType STERLING_30_DAY_MOST_REPINNED_BUTTON;
    public static final ElementType STERLING_ACTIVITY_TAB;
    public static final ElementType STERLING_ADD_ALL_RELATED_TERMS_BUTTON;
    public static final ElementType STERLING_ADD_ALL_SUGGESTED_AND_RELATED_TERMS_BUTTON;
    public static final ElementType STERLING_ADD_TERMS_BUTTON;
    public static final ElementType STERLING_ADS_TOS_CHECKBOX;
    public static final ElementType STERLING_ALL_PINS_BUTTON;
    public static final ElementType STERLING_BID_INPUT;
    public static final ElementType STERLING_BILLING_SUBMIT_BUTTON;
    public static final ElementType STERLING_BULK_EDITOR_CREATE_BUTTON;
    public static final ElementType STERLING_BULK_EDITOR_EDIT_BUTTON;
    public static final ElementType STERLING_BULK_REVIEW_BACK_BUTTON;
    public static final ElementType STERLING_BULK_REVIEW_CANCEL_BUTTON;
    public static final ElementType STERLING_BULK_REVIEW_FIX_BUTTON;
    public static final ElementType STERLING_BULK_REVIEW_SUBMIT_BUTTON;
    public static final ElementType STERLING_BULK_UPLOAD_CANCEL_BUTTON;
    public static final ElementType STERLING_BULK_UPLOAD_CREATE_BUTTON;
    public static final ElementType STERLING_CAMPAIGN_DASHBOARD_LINK;
    public static final ElementType STERLING_CAMPAIGN_EDIT_BUTTON;
    public static final ElementType STERLING_CAMPAIGN_OBJECTIVE_ROW;
    public static final ElementType STERLING_CONVERSION_TAG_LEARN_MORE_LINK;
    public static final ElementType STERLING_COPY_CODE_BUTTON;
    public static final ElementType STERLING_CREATE_TAG_BUTTON;
    public static final ElementType STERLING_CREATE_TAG_LINK;
    public static final ElementType STERLING_DATE_PICKER_DROPDOWN_BUTTON;
    public static final ElementType STERLING_DATE_PICKER_NATIVE_CONTROL;
    public static final ElementType STERLING_DATE_PICKER_QUICK_SELECT_BUTTON;
    public static final ElementType STERLING_DEFAULT_TERM;
    public static final ElementType STERLING_DELETE_TAG_BUTTON;
    public static final ElementType STERLING_DOWNLOAD_BUTTON;
    public static final ElementType STERLING_EDIT_TAG_BUTTON;
    public static final ElementType STERLING_EXPORT_DATA_BUTTON;
    public static final ElementType STERLING_GRAPH_SERIES_DROPDOWN_BUTTON;
    public static final ElementType STERLING_GRAPH_SERIES_DROPDOWN_ITEM;
    public static final ElementType STERLING_HOME_LINK;
    public static final ElementType STERLING_IMPORT_TERMS_BUTTON;
    public static final ElementType STERLING_NAV_ANALYTICS_LINK;
    public static final ElementType STERLING_NAV_AWARENESS_CAMPAIGNS_LINK;
    public static final ElementType STERLING_NAV_BILLING_LINK;
    public static final ElementType STERLING_NAV_CINEMATIC_PIN_LINK;
    public static final ElementType STERLING_NAV_CONVERSION_TRACKING_LINK;
    public static final ElementType STERLING_NAV_ENGAGEMENT_CAMPAIGNS_LINK;
    public static final ElementType STERLING_NAV_PROMOTE_BUTTON;
    public static final ElementType STERLING_NAV_RECENT_CAMPAIGNS_LINK;
    public static final ElementType STERLING_NAV_RECENT_CAMPAIGN_LINK;
    public static final ElementType STERLING_NAV_REPORTS_LINK;
    public static final ElementType STERLING_NAV_TOOLS_LINK;
    public static final ElementType STERLING_NAV_TRAFFIC_CAMPAIGNS_LINK;
    public static final ElementType STERLING_OBJECTIVE_DASHBOARD_LINK;
    public static final ElementType STERLING_OBJECTIVE_SUMMARY_STATS_ROW;
    public static final ElementType STERLING_OVERVIEW_TAB;
    public static final ElementType STERLING_PICK_A_PIN_BUTTON;
    public static final ElementType STERLING_PICK_A_PIN_CLICK_MASK;
    public static final ElementType STERLING_PICK_A_PIN_SEARCH_INPUT;
    public static final ElementType STERLING_PIN_PROMOTION_EDIT_BUTTON;
    public static final ElementType STERLING_PIN_PROMOTION_PIN_LINK;
    public static final ElementType STERLING_PROMOTED_PIN_PERFORMANCE_TABLE_ROW;
    public static final ElementType STERLING_PROMOTE_BUTTON;
    public static final ElementType STERLING_RELATED_TERM_TOKEN;
    public static final ElementType STERLING_SETUP_BILLING_BUTTON;
    public static final ElementType STERLING_SPEND_TAB;
    public static final ElementType STERLING_SUGGESTED_TERM_TOKEN;
    public static final ElementType STERLING_TARGETING_TYPE_RESET;
    public static final ElementType STERLING_TERMS_DELIMITER_DROPDOWN_ITEM;
    public static final ElementType STERLING_TERMS_DELIMITER_DROPDOWN_LINK;
    public static final ElementType STERLING_TERM_SEARCH_INPUT;
    public static final ElementType STERLING_TERM_SEARCH_INPUT_CLEAR;
    public static final ElementType STERLING_VIEW_ALL_BUTTON;
    public static final ElementType STORIES_FEED_ACTOR;
    public static final ElementType STORIES_FEED_ACTOR_IMAGE;
    public static final ElementType STORIES_FEED_LARGE_STORY;
    public static final ElementType STORIES_FEED_RELATED_MORE_CELL;
    public static final ElementType STORIES_FEED_RELATED_OBJECT;
    public static final ElementType STORIES_FEED_SMALL_STORY;
    public static final ElementType STORY_END_CELL;
    public static final ElementType STORY_FEATURED_ITEM;
    public static final ElementType STORY_PLUS_ICON;
    public static final ElementType STORY_TITLE;
    public static final ElementType SUGGESTED_CONTACT_LIST_ITEM;
    public static final ElementType SUGGESTED_CONTACT_LIST_SEARCH_ITEM;
    public static final ElementType SUGGESTED_EMAIL;
    public static final ElementType SUGGESTED_USER;
    public static final ElementType SUGGEST_INTEREST_BUTTON;
    public static final ElementType SUPPORT_BUTTON;
    public static final ElementType TOS_BUTTON;
    public static final ElementType TRENDING_QUERY;
    public static final ElementType TWITTER_CONNECT;
    public static final ElementType UNDO_BUTTON;
    public static final ElementType UNFOLLOW_BOARDS_BUTTON;
    public static final ElementType UPDATE_BUTTON;
    public static final ElementType UPLOAD_PIN_BUTTON;
    public static final ElementType USERNAME_BUTTON;
    public static final ElementType USER_ABOUT_BUTTON;
    public static final ElementType USER_ABOUT_EDIT_BUTTON;
    public static final ElementType USER_BLOCK_BUTTON;
    public static final ElementType USER_BOARDS_BUTTON;
    public static final ElementType USER_EDIT_BUTTON;
    public static final ElementType USER_FEED_FOLLOW;
    public static final ElementType USER_FEED_INVITE_CUSTOM_EMAIL;
    public static final ElementType USER_FEED_INVITE_EMAIL;
    public static final ElementType USER_FEED_INVITE_SMS;
    public static final ElementType USER_FLAG_BUTTON;
    public static final ElementType USER_FOLLOW;
    public static final ElementType USER_ICON;
    public static final ElementType USER_LIKES_BUTTON;
    public static final ElementType USER_LIST_CONTACT;
    public static final ElementType USER_LIST_USER;
    public static final ElementType USER_PINS_BUTTON;
    public static final ElementType USER_RECENT_CONTACT;
    public static final ElementType USER_REPORT_BUTTON;
    public static final ElementType USER_UNBLOCK_BUTTON;
    public static final ElementType USER_URL_EDIT_BUTTON;
    public static final ElementType VISUAL_OBJECT_BUTTON;
    public static final ElementType VISUAL_SEARCH_BUTTON;
    public static final ElementType WEBSITE_BUTTON;
    public static final ElementType WEB_PIN_CREATE_BOARD_FILTER;
    public static final ElementType WEB_PIN_CREATE_CREATE_BOARD_NAME;
    public static final ElementType WEB_PIN_CREATE_CREATE_BOARD_NO_NAME;
    public static final ElementType WEB_PIN_CREATE_EDIT_DESCRIPTION;
    public static final ElementType WEB_PIN_CREATE_FILTER_BOARDS_VIA_SEARCH;
    public static final ElementType WHO_CAN_PIN_BUTTON;
    public static final ElementType YOUR_PROFILE_BUTTON;
    public static final ElementType YOUR_SETTINGS_BUTTON;
    private final int value;

    private ElementType(String s, int i, int j)
    {
        super(s, i);
        value = j;
    }

    public static ElementType findByValue(int i)
    {
        switch (i)
        {
        default:
            return null;

        case 0: // '\0'
            return PIN_REPIN_BUTTON;

        case 1: // '\001'
            return PIN_LIKE_BUTTON;

        case 2: // '\002'
            return PIN_COMMENT_BUTTON;

        case 3: // '\003'
            return PIN_EDIT_BUTTON;

        case 72: // 'H'
            return PIN_SHARE_BUTTON;

        case 4: // '\004'
            return PIN_CAPTION_COMMENT;

        case 5: // '\005'
            return PIN_BOARD;

        case 6: // '\006'
            return PIN_BOARD_FOLLOW;

        case 7: // '\007'
            return PIN_BOARD_PIN;

        case 8: // '\b'
            return PIN_ORIGINAL_BOARD;

        case 9: // '\t'
            return PIN_ORIGINAL_BOARD_FOLLOW;

        case 10: // '\n'
            return PIN_ORIGINAL_BOARD_PIN;

        case 11: // '\013'
            return PIN_VIA_PIN;

        case 12: // '\f'
            return PIN_VIA;

        case 148: 
            return PIN_RELATED_PIN;

        case 255: 
            return PIN_INTEREST;

        case 1054: 
            return PIN_MORE_ACTIVITY;

        case 1055: 
            return PIN_SAVED_BY;

        case 1063: 
            return PIN_ACTIVITY_LIKE;

        case 13: // '\r'
            return SUGGESTED_USER;

        case 14: // '\016'
            return REMOVE_SUGGESTED_USER_BUTTON;

        case 15: // '\017'
            return NEWS_FEED_PIN;

        case 16: // '\020'
            return NEWS_FEED_USER;

        case 17: // '\021'
            return REPIN_SUGGESTED_BOARD;

        case 18: // '\022'
            return PIN_UPLOAD_BUTTON;

        case 19: // '\023'
            return LOGOUT_BUTTON;

        case 20: // '\024'
            return FOLLOW_ALL_USERS_BUTTON;

        case 21: // '\025'
            return FACEBOOK_TIMELINE_CONNECT;

        case 22: // '\026'
            return BOARD_CREATE;

        case 23: // '\027'
            return BOARD_CREATE_SUGGESTED;

        case 24: // '\030'
            return ANALYTICS_BUTTON;

        case 25: // '\031'
            return PIN_DOMAIN;

        case 26: // '\032'
            return PIN_USER;

        case 27: // '\033'
            return PIN_ATTRIBUTION;

        case 28: // '\034'
            return PIN_LIKER;

        case 29: // '\035'
            return PIN_PINNED_TO;

        case 30: // '\036'
            return LOGIN_BUTTON;

        case 31: // '\037'
            return SIGNUP_BUTTON;

        case 32: // ' '
            return RETRY_BUTTON;

        case 33: // '!'
            return RESET_BUTTON;

        case 34: // '"'
            return BACK_BUTTON;

        case 35: // '#'
            return PIN_SOURCE_IMAGE;

        case 36: // '$'
            return BOARD_COVER;

        case 37: // '%'
            return BOARD_FOLLOW;

        case 38: // '&'
            return CATEGORY_ICON;

        case 341: 
            return PINPICKS_ICON;

        case 39: // '\''
            return NEWS_FEED_BOARD;

        case 40: // '('
            return PROFILE_BUTTON;

        case 41: // ')'
            return FOLLOWING_BUTTON;

        case 42: // '*'
            return FOLLOWERS_BUTTON;

        case 43: // '+'
            return SEARCH_BUTTON;

        case 44: // ','
            return CREATE_BUTTON;

        case 45: // '-'
            return REFRESH_BUTTON;

        case 46: // '.'
            return PIN_SHARE;

        case 47: // '/'
            return PIN_REPORT_BUTTON;

        case 256: 
            return PIN_SHARE_TWITTER_BUTTON;

        case 257: 
            return PIN_SHARE_FACEBOOK_BUTTON;

        case 1045: 
            return PIN_SHARE_FACEBOOK_PINLIST_OTHER_PIN_BUTTON;

        case 1046: 
            return PIN_SHARE_FACEBOOK_PINLIST_TRENDING_STORY;

        case 258: 
            return PIN_SHARE_EMAIL_BUTTON;

        case 259: 
            return PIN_READING_LIST_BUTTON;

        case 48: // '0'
            return PIN_SAVE_BUTTON;

        case 49: // '1'
            return PIN_DELETE_BUTTON;

        case 98: // 'b'
            return PIN_SEND_BUTTON;

        case 50: // '2'
            return BOARD_DELETE_BUTTON;

        case 97: // 'a'
            return BOARD_LEAVE_BUTTON;

        case 81: // 'Q'
            return BOARD_EDIT_BUTTON;

        case 51: // '3'
            return BOARD_CATEGORY;

        case 52: // '4'
            return BOARD_NAME;

        case 53: // '5'
            return BOARD_SECRET;

        case 54: // '6'
            return CAMERA_BUTTON;

        case 55: // '7'
            return GALLERY_BUTTON;

        case 56: // '8'
            return FIND_IMAGES_BUTTON;

        case 57: // '9'
            return SETTINGS_BUTTON;

        case 58: // ':'
            return FINDFRIENDS_BUTTON;

        case 59: // ';'
            return INVITE_BUTTON;

        case 60: // '<'
            return SUPPORT_BUTTON;

        case 61: // '='
            return TOS_BUTTON;

        case 62: // '>'
            return USER_FOLLOW;

        case 63: // '?'
            return PROFILE_IMAGE;

        case 64: // '@'
            return PROFILE_URL;

        case 65: // 'A'
            return PROFILE_FACEBOOK;

        case 66: // 'B'
            return PROFILE_TWITTER;

        case 67: // 'C'
            return BOARD_PICKER;

        case 68: // 'D'
            return FACEBOOK_CONNECT;

        case 69: // 'E'
            return TWITTER_CONNECT;

        case 151: 
            return RAKUTEN_CONNECT;

        case 208: 
            return GPLUS_CONNECT;

        case 70: // 'F'
            return PIN_SUBMIT;

        case 71: // 'G'
            return USER_FEED_FOLLOW;

        case 73: // 'I'
            return CANCEL_BUTTON;

        case 74: // 'J'
            return MENU_BUTTON;

        case 75: // 'K'
            return CLOSE_BUTTON;

        case 76: // 'L'
            return DONE_BUTTON;

        case 77: // 'M'
            return NEWS_BUTTON;

        case 78: // 'N'
            return EXPLORE_BUTTON;

        case 79: // 'O'
            return BROWSER_BUTTON;

        case 80: // 'P'
            return USER_FLAG_BUTTON;

        case 82: // 'R'
            return USER_LIKES_BUTTON;

        case 83: // 'S'
            return USER_PINS_BUTTON;

        case 84: // 'T'
            return USER_BOARDS_BUTTON;

        case 85: // 'U'
            return USER_ABOUT_BUTTON;

        case 94: // '^'
            return USER_EDIT_BUTTON;

        case 96: // '`'
            return NEXT_BUTTON;

        case 99: // 'c'
            return ADD_MESSAGE_BUTTON;

        case 100: // 'd'
            return COPY_LINK_BUTTON;

        case 101: // 'e'
            return CLIPBOARD_BUTTON;

        case 102: // 'f'
            return CLEAR_HISTORY_BUTTON;

        case 103: // 'g'
            return SEND_BUTTON;

        case 146: 
            return NAVIGATION_HOME_BUTTON;

        case 147: 
            return NAVIGATION_DISCOVER_BUTTON;

        case 149: 
            return PHOTOS_BUTTON;

        case 370: 
            return STORY_PLUS_ICON;

        case 371: 
            return STORY_TITLE;

        case 372: 
            return STORY_END_CELL;

        case 373: 
            return STORY_FEATURED_ITEM;

        case 86: // 'V'
            return DECLINE_BUTTON;

        case 87: // 'W'
            return USER_BLOCK_BUTTON;

        case 88: // 'X'
            return USER_UNBLOCK_BUTTON;

        case 89: // 'Y'
            return USER_REPORT_BUTTON;

        case 90: // 'Z'
            return BOARD_CREATE_SECRET;

        case 91: // '['
            return USER_ABOUT_EDIT_BUTTON;

        case 92: // '\\'
            return USER_URL_EDIT_BUTTON;

        case 93: // ']'
            return BOARD_DESCRIPTION;

        case 95: // '_'
            return EDUCATION_TARGET;

        case 109: // 'm'
            return BROWSER_WEB_IMAGE;

        case 104: // 'h'
            return AUTOCOMPLETE_SUGGESTION;

        case 105: // 'i'
            return FIND_MORE_BOARDS_BUTTON;

        case 106: // 'j'
            return GET_STARTED_BUTTON;

        case 107: // 'k'
            return REMOVE_BUTTON;

        case 108: // 'l'
            return WHO_CAN_PIN_BUTTON;

        case 110: // 'n'
            return PIN_RICH_PIN_ACTION_BUTTON;

        case 111: // 'o'
            return USER_RECENT_CONTACT;

        case 112: // 'p'
            return USER_LIST_USER;

        case 113: // 'q'
            return UNDO_BUTTON;

        case 114: // 'r'
            return CLEAR_SEARCHES_BUTTON;

        case 115: // 's'
            return CLEAR_CONTACTS_BUTTON;

        case 116: // 't'
            return PIN_DESCRIPTION;

        case 117: // 'u'
            return EDIT_HOME_FEED_BUTTON;

        case 118: // 'v'
            return FOLLOW_BOARDS_BUTTON;

        case 119: // 'w'
            return UNFOLLOW_BOARDS_BUTTON;

        case 120: // 'x'
            return DUPLICATE_PIN_WARNING;

        case 121: // 'y'
            return SUGGESTED_EMAIL;

        case 122: // 'z'
            return USERNAME_BUTTON;

        case 123: // '{'
            return EMAIL_BUTTON;

        case 124: // '|'
            return COUNTRY_BUTTON;

        case 125: // '}'
            return PUSH_NOTIFICATIONS_BUTTON;

        case 126: // '~'
            return UPDATE_BUTTON;

        case 127: // '\177'
            return CATEGORY_RECENT;

        case 240: 
            return LANGUAGE_BUTTON;

        case 241: 
            return GENDER_BUTTON;

        case 242: 
            return PERSONALIZED_RECOMMENDATIONS_BUTTON;

        case 243: 
            return SEARCH_PRIVACY_BUTTON;

        case 128: 
            return CHANGE_PASSWORD_BUTTON;

        case 129: 
            return SHOW_PASSWORD_BUTTON;

        case 130: 
            return SAVE_USER_SETTINGS_BUTTON;

        case 131: 
            return RIBBON_BUTTON;

        case 132: 
            return USER_LIST_CONTACT;

        case 133: 
            return USER_FEED_INVITE_EMAIL;

        case 134: 
            return USER_FEED_INVITE_SMS;

        case 135: 
            return USER_FEED_INVITE_CUSTOM_EMAIL;

        case 136: 
            return NAME_BUTTON;

        case 137: 
            return APP_ICON;

        case 138: 
            return USER_ICON;

        case 139: 
            return NOTIFICATIONS_ICON;

        case 140: 
            return SEE_OTHER_PINS_BUTTON;

        case 141: 
            return MORE_PINS_BUTTON;

        case 142: 
            return PIN_PROMOTED_INFO;

        case 143: 
            return PROMOTED_OK_BUTTON;

        case 144: 
            return LINK_OUT_BUTTON;

        case 145: 
            return PFY_REASON_BUTTON;

        case 150: 
            return INVITE_DELETE_BUTTON;

        case 152: 
            return FEED_SUBCATEGORY;

        case 153: 
            return DISCOVER_TRENDING_CATEGORY;

        case 154: 
            return MAP_ANNOTATION;

        case 155: 
            return MAP_SEE_ON_MAP_BUTTON;

        case 156: 
            return MAP_DIRECTIONS_BUTTON;

        case 157: 
            return MAP_ADD_BUTTON;

        case 158: 
            return PLACES_BUTTON;

        case 159: 
            return LOCATION_BUTTON;

        case 160: 
            return PLACES_LIST_PLACE;

        case 161: 
            return PHONE_BUTTON;

        case 162: 
            return WEBSITE_BUTTON;

        case 163: 
            return PLACE_IMAGE;

        case 164: 
            return MAP_PIN_ICON;

        case 165: 
            return ADD_PLACE_BUTTON;

        case 166: 
            return PLACE_PICKER_CREATE;

        case 167: 
            return PLACE_PICKER_IMAGE;

        case 168: 
            return REMOVE_PLACE_BUTTON;

        case 170: 
            return MAP_TOGGLE_BUTTON;

        case 171: 
            return COLLABORATOR_TEXT;

        case 172: 
            return SEND_INVITE_BUTTON;

        case 173: 
            return INVITE_ALL_TOGGLE;

        case 174: 
            return REPINS_BUTTON;

        case 175: 
            return LIKES_BUTTON;

        case 176: 
            return PIN_FLAG_BUTTON;

        case 177: 
            return DOMAIN_URL;

        case 178: 
            return LOGO;

        case 179: 
            return SEE_MORE_BUTTON;

        case 180: 
            return BOARD_RELATED_BOARD;

        case 181: 
            return COMMENTS_BUTTON;

        case 191: 
            return SEARCH_RELATED_QUERY;

        case 192: 
            return SEARCH_RELATED_CATEGORY;

        case 201: 
            return BUY_BUTTON;

        case 202: 
            return FACEBOOK_INVITE_BUTTON;

        case 203: 
            return GPLUS_INVITE_BUTTON;

        case 204: 
            return SEND_TO_PINNER_BUTTON;

        case 205: 
            return APP_RATING_ATTEMPT_BUTTON;

        case 206: 
            return APP_RATING_DECLINE_BUTTON;

        case 207: 
            return APP_RATING_REMIND_BUTTON;

        case 209: 
            return SEND_SMS_INVITE_BUTTON;

        case 210: 
            return COMPOSE_SMS_INVITE_BUTTON;

        case 211: 
            return FLOWED_INTEREST;

        case 212: 
            return REPIN_ADD_PLACE_BUTTON;

        case 213: 
            return REPIN_EDIT_PLACE_BUTTON;

        case 214: 
            return RELATED_RICH_PIN_BUTTON;

        case 215: 
            return BULK_INVITER_BUTTON;

        case 216: 
            return RELATED_INTEREST;

        case 217: 
            return SINGLE_PIN_POPOVER;

        case 218: 
            return NEWS_FEED_QUESTION;

        case 219: 
            return NEWS_FEED_ANSWER;

        case 220: 
            return SEARCH_PINS_BUTTON;

        case 221: 
            return SEARCH_BOARDS_BUTTON;

        case 222: 
            return SEARCH_PINNERS_BUTTON;

        case 223: 
            return SEARCH_MY_PINS_BUTTON;

        case 224: 
            return SEARCH_PLACES_BUTTON;

        case 842: 
            return SEARCH_BUYABLE_PINS_BUTTON;

        case 225: 
            return SEARCH_TOKEN;

        case 226: 
            return SEARCH_GUIDE_SUGGESTION;

        case 227: 
            return SEARCH_BOX_TEXT_INPUT;

        case 228: 
            return SEARCH_BOX_ADD_TOKEN_BUTTON;

        case 229: 
            return ADD_INTEREST_BUTTON;

        case 230: 
            return SUGGEST_INTEREST_BUTTON;

        case 231: 
            return EDUCATION_GUIDED_SEARCH_SUGGESTION;

        case 232: 
            return EDUCATION_GUIDED_SEARCH_COMPLETE_BUTTON;

        case 233: 
            return VISUAL_OBJECT_BUTTON;

        case 234: 
            return VISUAL_SEARCH_BUTTON;

        case 244: 
            return NAVIGATION_LOGO_BUTTON;

        case 245: 
            return MORE_INFO_BUTTON;

        case 246: 
            return YOUR_PROFILE_BUTTON;

        case 247: 
            return YOUR_SETTINGS_BUTTON;

        case 248: 
            return FIND_FRIENDS_BUTTON;

        case 249: 
            return CREATE_BOARD_BUTTON;

        case 250: 
            return ADD_PIN_FROM_WEBSITE_BUTTON;

        case 251: 
            return UPLOAD_PIN_BUTTON;

        case 252: 
            return NEWS_FEED_REPLY;

        case 273: 
            return NEWS_FEED_ACTOR_IMAGE;

        case 274: 
            return NEWS_FEED_ACTOR_LABEL;

        case 253: 
            return RECENT_SEARCH_SUGGESTION;

        case 254: 
            return SEARCH_ALL_WITH_QUERY;

        case 260: 
            return INTEREST_SUGGESTION;

        case 1030: 
            return INTEREST_FOLLOW;

        case 261: 
            return STORIES_FEED_LARGE_STORY;

        case 262: 
            return STORIES_FEED_SMALL_STORY;

        case 263: 
            return STORIES_FEED_ACTOR;

        case 264: 
            return STORIES_FEED_RELATED_OBJECT;

        case 269: 
            return STORIES_FEED_RELATED_MORE_CELL;

        case 272: 
            return STORIES_FEED_ACTOR_IMAGE;

        case 265: 
            return DISCOVER_FEATURED_ITEM;

        case 266: 
            return FOLLOWING_INTERESTS_BUTTON;

        case 267: 
            return FOLLOWING_PINNERS_BUTTON;

        case 268: 
            return FOLLOWING_BOARDS_BUTTON;

        case 270: 
            return HELP_PULSE;

        case 271: 
            return HELP_BUTTON;

        case 299: 
            return HELP_FLYOUT_BUTTON;

        case 275: 
            return CONVERSATION_NEW_BUTTON;

        case 276: 
            return CONVERSATION_CREATE_BUTTON;

        case 277: 
            return CONVERSATION_LIST_ITEM;

        case 278: 
            return CONVERSATION_INBOX_BUTTON;

        case 279: 
            return GET_EXTENSION_BUTTON;

        case 280: 
            return INSTALL_EXTENSION_BUTTON;

        case 460: 
            return CANCEL_EXTENSION_INSTALL_BUTTON;

        case 281: 
            return HELP_CENTER_BUTTON;

        case 282: 
            return PIN_CELL_BUTTON_PFY_PIN_SOURCE;

        case 283: 
            return PIN_CELL_BUTTON_PROMOTED_PIN_SOURCE;

        case 284: 
            return PIN_FEEDBACK_BUTTON_PFY;

        case 285: 
            return PIN_FEEDBACK_BUTTON_PROMOTED;

        case 286: 
            return PIN_FEEDBACK_BUTTON_STATE_REASON_PFY;

        case 287: 
            return PIN_FEEDBACK_BUTTON_STATE_REASON_PROMOTED;

        case 288: 
            return PIN_FEEDBACK_DIALOG_BUTTON_HIDE_PIN_PFY;

        case 289: 
            return PIN_FEEDBACK_DIALOG_BUTTON_PFY_STOP_RECS_FROM_THROUGH_BOARD;

        case 290: 
            return PIN_FEEDBACK_DIALOG_BUTTON_LEARN_MORE_PROMOTED;

        case 291: 
            return PIN_FEEDBACK_DIALOG_BUTTON_HIDE_PIN_PROMOTED;

        case 292: 
            return PIN_FEEDBACK_DIALOG_BUTTON_DISMISS;

        case 293: 
            return PIN_FEEDBACK_REASON_BUTTON_NOT_INTERESTED;

        case 294: 
            return PIN_FEEDBACK_REASON_BUTTON_OFFENSIVE;

        case 295: 
            return PIN_FEEDBACK_REASON_BUTTON_SEEN_BEFORE;

        case 973: 
            return PIN_FEEDBACK_BUTTON_REPORT_UNRELATED_PIN;

        case 974: 
            return PIN_FEEDBACK_BUTTON_REPORT_PIN;

        case 976: 
            return PIN_FEEDBACK_BUTTON_INTEREST;

        case 1003: 
            return PIN_FEEDBACK_BUTTON_SEARCH;

        case 296: 
            return DIGEST_PIN;

        case 302: 
            return DIGEST_STORY_HEADER_BUTTON;

        case 303: 
            return DIGEST_STORY_EXPAND_BUTTON;

        case 308: 
            return DIGEST_STORY_FEEDBACK_BUTTON;

        case 309: 
            return DIGEST_STORY_FOLLOW_BUTTON;

        case 351: 
            return DIGEST_STORY_CUSTOM_ACTION_BUTTON;

        case 352: 
            return DIGEST_CAROUSEL_CONTENT_REP;

        case 304: 
            return DIGEST_FEEDBACK_DIALOG_BUTTON_UNFOLLOW_BOARD;

        case 305: 
            return DIGEST_FEEDBACK_DIALOG_BUTTON_UNFOLLOW_INTEREST;

        case 306: 
            return DIGEST_FEEDBACK_DIALOG_BUTTON_UNFOLLOW_USER;

        case 307: 
            return DIGEST_FEEDBACK_DIALOG_BUTTON_HIDE_THROUGH_BOARD_REC;

        case 297: 
            return LOOKBOOK_TAG;

        case 298: 
            return LOOKBOOK_PROFILE_IMAGE;

        case 300: 
            return SEND_SOCIAL_BUTTON;

        case 301: 
            return SHARE_SOCIAL_BUTTON;

        case 310: 
            return SAFARI_KEYCHAIN_USE_PASSWORD_BUTTON;

        case 311: 
            return SAFARI_KEYCHAIN_NOT_NOW_BUTTON;

        case 314: 
            return SIGNUP_TRENDING_PREVIEW_BUTTON;

        case 316: 
            return PIN_SHARE_MESSAGE;

        case 317: 
            return PIN_SHARE_WHATSAPP;

        case 318: 
            return PIN_SHARE_FB_MESSENGER;

        case 980: 
            return PIN_SHARE_FB_TIMELINE;

        case 319: 
            return PIN_SHARE_THIRD_PARTY_EXTENSION;

        case 331: 
            return BOARD_SHARE_BUTTON;

        case 332: 
            return BOARD_SHARE_FACEBOOK_BUTTON;

        case 333: 
            return BOARD_SHARE_EMAIL_BUTTON;

        case 334: 
            return BOARD_SHARE_COPY_LINK_BUTTON;

        case 335: 
            return BOARD_SHARE_OTHER_BUTTON;

        case 336: 
            return SEARCH_ACTION_SUGGESTION;

        case 337: 
            return SEARCH_FILTER_SUGGESTION;

        case 338: 
            return SEARCH_FILTER_DROPDOWNBUTTON;

        case 339: 
            return FLEXIBLE_NUX_LAUNCHER;

        case 340: 
            return INTEREST_PIN_ANNOTATION;

        case 358: 
            return PREV_CLOSEUP_BUTTON;

        case 359: 
            return NEXT_CLOSEUP_BUTTON;

        case 360: 
            return CLOSEUP_PINIT_SHORTCUT;

        case 400: 
            return MOVE_PINS_BUTTON;

        case 401: 
            return BULK_MOVE_PINS_BUTTON;

        case 402: 
            return BULK_COPY_PINS_BUTTON;

        case 403: 
            return BULK_DELETE_PINS_BUTTON;

        case 404: 
            return BULK_CANCEL_BUTTON;

        case 450: 
            return ADD_PIN_REP;

        case 451: 
            return ADD_PIN_REP_UPLOAD;

        case 452: 
            return ADD_PIN_REP_SCRAPE;

        case 453: 
            return ADD_PIN_REP_BOOKMARKLET;

        case 454: 
            return ADD_PIN_BUTTON_UPLOAD;

        case 455: 
            return ADD_PIN_BUTTON_SCRAPE;

        case 456: 
            return ADD_PIN_BUTTON_BOOKMARKLET;

        case 457: 
            return ADD_PIN_INSTALL_BOOKMARKLET;

        case 458: 
            return ADD_PIN_CANCEL_INSTALL_BOOKMARKLET;

        case 500: 
            return RICH_ACTION_BUTTON;

        case 600: 
            return WEB_PIN_CREATE_EDIT_DESCRIPTION;

        case 603: 
            return WEB_PIN_CREATE_CREATE_BOARD_NO_NAME;

        case 604: 
            return WEB_PIN_CREATE_CREATE_BOARD_NAME;

        case 605: 
            return WEB_PIN_CREATE_FILTER_BOARDS_VIA_SEARCH;

        case 610: 
            return WEB_PIN_CREATE_BOARD_FILTER;

        case 606: 
            return PINVITATIONAL_REQUEST_INVITE_SUBMITTED;

        case 342: 
            return SEARCH_PRIVACY_LINK;

        case 343: 
            return FIND_FRIENDS_BUTTON_ADDRESS_BOOK;

        case 344: 
            return FIND_FRIENDS_BUTTON_FACEBOOK;

        case 345: 
            return FIND_FRIENDS_BUTTON_TWITTER;

        case 346: 
            return FIND_FRIENDS_BUTTON_MORE;

        case 347: 
            return FIND_FRIENDS_BUTTON_WHATSAPP;

        case 348: 
            return FIND_FRIENDS_BUTTON_FB_MESSENGER;

        case 349: 
            return COMPOSE_EMAIL_INVITE_BUTTON;

        case 350: 
            return FIND_FRIENDS_BUTTON_LINE;

        case 365: 
            return FIND_FRIENDS_PROFILE_BUTTON;

        case 353: 
            return BRAND_SURVEY_DIALOG_YES_BUTTON;

        case 354: 
            return BRAND_SURVEY_DIALOG_LATER_BUTTON;

        case 355: 
            return BRAND_SURVEY_DIALOG_NEVER_BUTTON;

        case 356: 
            return BRAND_SURVEY_DIALOG_BACKGROUND_DISMISS;

        case 357: 
            return HASH_TAG;

        case 361: 
            return PIN_LINK_MODULE_ACTION_BUTTON;

        case 362: 
            return PIN_LINK_MODULE_DOMAIN_OWNER_PROFILE;

        case 363: 
            return PIN_CLOSEUP_TRANSITION_IMAGE;

        case 1047: 
            return CARD_ATTRIBUTION_LINK;

        case 364: 
            return BUILD_HOMEFEED_BUTTON;

        case 700: 
            return SHARE_EXTENSION_PIN_IT_BUTTON;

        case 701: 
            return SHARE_EXTENSION_IMAGE;

        case 702: 
            return SHARE_EXTENSION_PICK_BOARD_CELL;

        case 703: 
            return SHARE_EXTENSION_BOARD_CELL;

        case 720: 
            return SHARE_EXTENSION_RECENT_BOARD_CELL;

        case 721: 
            return SHARE_EXTENSION_ALL_BOARDS_BOARD;

        case 722: 
            return SHARE_EXTENSION_CREATE_BOARD_CELL;

        case 723: 
            return SHARE_EXTENSION_EDIT_DESCRIPTION_CELL;

        case 724: 
            return SHARE_EXTENSION_CREATE_BOARD_BUTTON;

        case 725: 
            return SHARE_EXTENSION_UPSELL_PLUS_BUTTON;

        case 705: 
            return AUTOCOMPLETE_SUGGESTION_LC1;

        case 706: 
            return AUTOCOMPLETE_SUGGESTION_LC2;

        case 707: 
            return PIN_FEEDBACK_DIALOG_BUTTON_PFY_STOP_RECS_FROM_THROUGH_PIN;

        case 708: 
            return PIN_FEEDBACK_DIALOG_BUTTON_PFY_STOP_RECS_FROM_THROUGH_INTEREST;

        case 709: 
            return SEARCH_QUERY_TYPO_CORRECTION;

        case 710: 
            return TRENDING_QUERY;

        case 711: 
            return MULTIOBJECT_PINNER_LOAD_MORE_BUTTON;

        case 712: 
            return MULTIOBJECT_BOARD_LOAD_MORE_BUTTON;

        case 800: 
            return ORDER_HISTORY_BUTTON;

        case 801: 
            return PAYMENT_METHODS_BUTTON;

        case 802: 
            return SHIPPING_ADDRESSES_BUTTON;

        case 803: 
            return BUYABLE_CLOSEUP_VARIANT_TEXT_CELL;

        case 804: 
            return BUYABLE_CLOSEUP_VARIANT_SWATCH_CELL;

        case 805: 
            return BUYABLE_CLOSEUP_READ_MORE;

        case 806: 
            return BUYABLE_CLOSEUP_RETURN_POLICY;

        case 807: 
            return BUYABLE_CHECKOUT_VARIANT_TABLE_CELL;

        case 808: 
            return BUYABLE_CHECKOUT_VARIANT_CIRCLE_CELL;

        case 809: 
            return BUYABLE_CHECKOUT_APPLE_PAY_BUTTON;

        case 810: 
            return BUYABLE_CHECKOUT_CREDIT_CARD_BUTTON;

        case 811: 
            return BUYABLE_CHECKOUT_QUANTITY_FIELD;

        case 812: 
            return BUYABLE_CHECKOUT_SUMMARY_SHIP_ADDRESS_CELL;

        case 813: 
            return BUYABLE_CHECKOUT_SUMMARY_SHIP_METHOD_CELL;

        case 814: 
            return BUYABLE_CHECKOUT_SUMMARY_PAYMENT_CELL;

        case 815: 
            return BUYABLE_CHECKOUT_LEARN_MORE_BUTTON;

        case 816: 
            return BUYABLE_CHECKOUT_SUMMARY_PAY_BUTTON;

        case 817: 
            return BUYABLE_CHECKOUT_EDIT_BUTTON;

        case 818: 
            return BUYABLE_CHECKOUT_SAVE_BUTTON;

        case 819: 
            return BUYABLE_CHECKOUT_ERROR_DISMISS_BUTTON;

        case 820: 
            return BUYABLE_SHIPPING_ADDRESS_CELL;

        case 821: 
            return BUYABLE_SHIPPING_ADDRESS_ADD_NEW_CELL;

        case 822: 
            return BUYABLE_SHIPPING_ADDRESS_CONTACTS_BUTTON;

        case 823: 
            return BUYABLE_SHIPPING_ADDRESS_DELETE_BUTTON;

        case 824: 
            return BUYABLE_PAYMENT_CELL;

        case 825: 
            return BUYABLE_PAYMENT_ADD_NEW_CELL;

        case 826: 
            return BUYABLE_PAYMENT_BILLING_TOGGLE;

        case 827: 
            return BUYABLE_PAYMENT_CAMERA_BUTTON;

        case 828: 
            return BUYABLE_PAYMENT_BILLING_CONTACTS_BUTTON;

        case 829: 
            return BUYABLE_PAYMENT_BILLING_RECENTS_BUTTON;

        case 830: 
            return BUYABLE_PAYMENT_DELETE_BUTTON;

        case 831: 
            return BUYABLE_CONTACTS_ADDRESS_CELL;

        case 832: 
            return BUYABLE_RECENT_ADDRESS_CELL;

        case 833: 
            return BUYABLE_ORDER_HISTORY_CELL;

        case 834: 
            return BUYABLE_ORDER_DETAILS_VISIT_SELLER_BUTTON;

        case 835: 
            return BUYABLE_ORDER_DETAILS_CONTACT_SELLER_BUTTON;

        case 836: 
            return BUYABLE_SETTINGS_PAYMENT_SAVE_BUTTON;

        case 837: 
            return BUYABLE_SETTINGS_ADDRESS_SAVE_BUTTON;

        case 838: 
            return BUYABLE_SHIPPING_METHOD_CELL;

        case 839: 
            return COMMERCE_EDUCATION_DISMISS_BUTTON;

        case 840: 
            return COMMERCE_EDUCATION_SEARCH_TOPIC_BUTTON;

        case 841: 
            return BUYABLE_CATEGORY_ICON;

        case 843: 
            return COMMERCE_SHOP_MORE_BUTTON;

        case 844: 
            return API_ENVIRONMENTS_BUTTON;

        case 900: 
            return SAVE_TABBAR_BUTTON;

        case 901: 
            return SAVE_TRENDING_WEBSITE;

        case 902: 
            return SAVE_TRENDING_SEARCH;

        case 903: 
            return SAVE_EXTENSION_UPSELL;

        case 904: 
            return SAVE_AUTOCOMPLETE_GOOGLE_SEARCH;

        case 905: 
            return SAVE_AUTOCOMPLETE_RECENTLY_VISITED;

        case 906: 
            return SAVE_BROWSER_DRAWER;

        case 907: 
            return SAVE_BROWSER_PINIT_BUTTON;

        case 908: 
            return SAVE_BROWSER_COPY_LINK_BUTTON;

        case 909: 
            return SAVE_BROWSER_OPEN_IN_SAFARI_BUTTON;

        case 950: 
            return PIN_SHARE_FBMESSENGER_BUTTON;

        case 951: 
            return PIN_SHARE_WHATSAPP_BUTTON;

        case 952: 
            return PIN_SHARE_LINE_BUTTON;

        case 953: 
            return PIN_SHARE_SMS_BUTTON;

        case 954: 
            return PIN_SHARE_OTHER_APP_BUTTON;

        case 955: 
            return BOARD_SHARE_TWITTER_BUTTON;

        case 956: 
            return BOARD_SHARE_WHATSAPP_BUTTON;

        case 957: 
            return BOARD_SHARE_FBMESSENGER_BUTTON;

        case 958: 
            return BOARD_SHARE_LINE_BUTTON;

        case 959: 
            return BOARD_SHARE_SMS_BUTTON;

        case 960: 
            return BOARD_SHARE_OTHER_APP_BUTTON;

        case 961: 
            return COMMERCE_SEARCH_PRICE_FILTER_BLUE_BUTTON;

        case 962: 
            return COMMERCE_SEARCH_PRICE_FILTER_TAKEOVER;

        case 963: 
            return COMMERCE_SEARCH_PRICE_FILTER_TAKEOVER_CLOSE_BUTTON;

        case 964: 
            return COMMERCE_SEARCH_PRICE_FILTER_TAKEOVER_CLEAR_BUTTON;

        case 965: 
            return HOMEFEED_BUILDER_BUTTON;

        case 969: 
            return HOMEFEED_BUILDER_INTEREST;

        case 970: 
            return HOMEFEED_BUILDER_SEE_MORE_BUTTON;

        case 971: 
            return HOMEFEED_BUILDER_PIN;

        case 972: 
            return HOMEFEED_BUILDER_SEARCH_RESULT;

        case 975: 
            return HOMEFEED_BUILDER_GRID_ITEM;

        case 1022: 
            return HOMEFEED_BUILDER_FOLLOW_TOAST;

        case 1025: 
            return HOMEFEED_BUILDER_BOARD;

        case 1026: 
            return HOMEFEED_BUILDER_USER;

        case 1029: 
            return HOMEFEED_BUILDER_TOPIC_DISMISS_BUTTON;

        case 966: 
            return NUJ_CREATE_BOARD_TITLE_BUTTON;

        case 967: 
            return SETTINGS_OFFLINE_BOARD_TOGGLE;

        case 968: 
            return SETTINGS_OFFLINE_BOARD_TOGGLE_ALL;

        case 977: 
            return BAD_LINK_BUTTON;

        case 978: 
            return GOOD_LINK_BUTTON;

        case 979: 
            return LINK_FEEDBACK_OPTION_BUTTON;

        case 981: 
            return PIN_FEEDBACK_DIALOG_BUTTON;

        case 982: 
            return PIN_HIDE_BUTTON;

        case 983: 
            return REPIN_DIALOG_SUGGESTED_BOARD;

        case 984: 
            return PLACE_MODULE_BUTTON;

        case 985: 
            return PLACE_MODULE_MAP;

        case 986: 
            return PLACE_VIEW_DIRECTIONS_BUTTON;

        case 987: 
            return PLACE_VIEW_PHONE_BUTTON;

        case 988: 
            return PLACE_VIEW_SITE_BUTTON;

        case 989: 
            return PLACE_VIEW_LARGE_MAP;

        case 990: 
            return PLACE_VIEW_SMALL_MAP;

        case 991: 
            return PLACE_VIEW_MAP_MARKER;

        case 992: 
            return PLACE_VIEW_MAP_CALLOUT;

        case 993: 
            return PLACE_VIEW_DIRECTIONS_GOOGLE;

        case 994: 
            return PLACE_VIEW_DIRECTIONS_APPLE;

        case 996: 
            return DISCOVER_FRIEND_MERCHANDISING_CLICKTHROUGH;

        case 997: 
            return INVITE_CONTACT;

        case 998: 
            return SOCIAL_NETWORK_CONNECT_BUTTON;

        case 999: 
            return PARTNER_PERFORMANCE_TOP_PIN;

        case 1000: 
            return PARTNER_PERFORMANCE_STATS;

        case 1001: 
            return RECOMMENDATION_SECTION;

        case 1002: 
            return ADD_FRIENDS_SECTION;

        case 1004: 
            return PW_RESET_SEND_EMAIL_BUTTON;

        case 1005: 
            return PW_RESET_USER_SEARCH_BUTTON;

        case 1006: 
            return PW_RESET_DIRECT_EMAIL_BUTTON;

        case 1007: 
            return PIN_FEEDBACK_REASON_BUTTON_PROMOTED;

        case 1008: 
            return PIN_FEEDBACK_REASON_BUTTON_PFY;

        case 1009: 
            return PIN_FEEDBACK_DIALOG_BUTTON_UNFOLLOW_BOARD;

        case 1010: 
            return PIN_FEEDBACK_DIALOG_BUTTON_UNFOLLOW_USER;

        case 1011: 
            return PIN_FEEDBACK_DIALOG_BUTTON_UNFOLLOW_INTEREST;

        case 1012: 
            return PIN_FEEDBACK_DIALOG_BUTTON_HIDE_PROMOTED_PIN;

        case 1013: 
            return PIN_FEEDBACK_DIALOG_BUTTON_REPORT_PIN;

        case 1014: 
            return PIN_FEEDBACK_DIALOG_BUTTON_PIN_NOT_RELATED_TO_INTEREST;

        case 1015: 
            return PIN_FEEDBACK_DIALOG_BUTTON_PIN_NOT_RELATED_TO_SEARCH;

        case 1016: 
            return EDUCATION_TOOLTIP_CONFIRM_BUTTON;

        case 1017: 
            return EDUCATION_TOOLTIP_DISMISS_BUTTON;

        case 1018: 
            return EDUCATION_TOOLTIP_SPOTLIGHT;

        case 1019: 
            return EDUCATION_TOOLTIP_BACKGROUND;

        case 1020: 
            return FPE_CREATE_FIRST_BOARD_SUGGESTED_TITLE_BUTTON;

        case 1021: 
            return LIBRARY_PROFILE_PIN_TOPIC;

        case 1023: 
            return CUSTOM_GENDER_ON_HOVER;

        case 1024: 
            return CUSTOM_GENDER_SAVE_BUTTON;

        case 1027: 
            return SIMILAR_BOARD_OPEN_BUTTON;

        case 1028: 
            return SIMILAR_BOARD_FOLLOW_BUTTON;

        case 1031: 
            return FLASHLIGHT_SEARCH_ICON;

        case 1032: 
            return FLASHLIGHT_ANNOTATION;

        case 1033: 
            return LIBRARY_SORT_BOARDS;

        case 1034: 
            return LIBRARY_SORT_BOARDS_OPTION_CHANGED;

        case 1035: 
            return NUX_INTEREST_FOLLOW;

        case 1036: 
            return NUX_INTEREST_UNFOLLOW;

        case 1037: 
            return NUX_CONTINUE_BUTTON;

        case 1038: 
            return NUX_USE_CASE_TITLE;

        case 1039: 
            return SUGGESTED_CONTACT_LIST_ITEM;

        case 1040: 
            return SUGGESTED_CONTACT_LIST_SEARCH_ITEM;

        case 1041: 
            return APP_LIST_ITEM;

        case 1042: 
            return MESSAGE_INPUT;

        case 1043: 
            return SEARCH_CONTACT_INPUT;

        case 1044: 
            return SEARCH_CONTACT_LIST_ITEM;

        case 1048: 
            return CONTEXTUAL_STORY_USER;

        case 1049: 
            return CONTEXTUAL_STORY_TOPIC;

        case 1050: 
            return CONTEXTUAL_STORY_BOARD;

        case 1051: 
            return CONTEXTUAL_STORY_SEARCH;

        case 1052: 
            return CONTEXTUAL_STORY_SEE_MORE;

        case 1053: 
            return PINNER_MODULE;

        case 1056: 
            return REGISTER_EMAIL_STEP;

        case 1057: 
            return REGISTER_PHONE_STEP;

        case 1058: 
            return REGISTER_SMS_STEP;

        case 1059: 
            return REGISTER_PASSWORD_STEP;

        case 1060: 
            return REGISTER_NAME_STEP;

        case 1061: 
            return REGISTER_AGE_STEP;

        case 1062: 
            return REGISTER_GENDER_STEP;

        case 10000: 
            return STERLING_NAV_PROMOTE_BUTTON;

        case 10050: 
            return STERLING_CAMPAIGN_OBJECTIVE_ROW;

        case 10051: 
            return STERLING_PICK_A_PIN_BUTTON;

        case 10001: 
            return STERLING_PICK_A_PIN_CLICK_MASK;

        case 10002: 
            return STERLING_ALL_PINS_BUTTON;

        case 10003: 
            return STERLING_30_DAY_MOST_CLICKED_BUTTON;

        case 10004: 
            return STERLING_30_DAY_MOST_REPINNED_BUTTON;

        case 10005: 
            return STERLING_PICK_A_PIN_SEARCH_INPUT;

        case 10006: 
            return STERLING_IMPORT_TERMS_BUTTON;

        case 10007: 
            return STERLING_ADD_TERMS_BUTTON;

        case 10008: 
            return STERLING_TERMS_DELIMITER_DROPDOWN_LINK;

        case 10009: 
            return STERLING_TERMS_DELIMITER_DROPDOWN_ITEM;

        case 10010: 
            return STERLING_DEFAULT_TERM;

        case 10011: 
            return STERLING_TERM_SEARCH_INPUT;

        case 10012: 
            return STERLING_TERM_SEARCH_INPUT_CLEAR;

        case 10013: 
            return STERLING_ADD_ALL_SUGGESTED_AND_RELATED_TERMS_BUTTON;

        case 10014: 
            return STERLING_SUGGESTED_TERM_TOKEN;

        case 10015: 
            return STERLING_RELATED_TERM_TOKEN;

        case 10016: 
            return STERLING_ADD_ALL_RELATED_TERMS_BUTTON;

        case 10017: 
            return STERLING_TARGETING_TYPE_RESET;

        case 10018: 
            return STERLING_PROMOTE_BUTTON;

        case 10019: 
            return STERLING_SETUP_BILLING_BUTTON;

        case 10020: 
            return STERLING_ADS_TOS_CHECKBOX;

        case 10021: 
            return STERLING_BILLING_SUBMIT_BUTTON;

        case 10060: 
            return STERLING_BID_INPUT;

        case 10022: 
            return STERLING_HOME_LINK;

        case 10023: 
            return STERLING_OBJECTIVE_DASHBOARD_LINK;

        case 10024: 
            return STERLING_CAMPAIGN_DASHBOARD_LINK;

        case 10025: 
            return STERLING_CAMPAIGN_EDIT_BUTTON;

        case 10026: 
            return STERLING_PIN_PROMOTION_EDIT_BUTTON;

        case 10027: 
            return STERLING_PIN_PROMOTION_PIN_LINK;

        case 10028: 
            return STERLING_EXPORT_DATA_BUTTON;

        case 10029: 
            return STERLING_DATE_PICKER_DROPDOWN_BUTTON;

        case 10030: 
            return STERLING_DATE_PICKER_QUICK_SELECT_BUTTON;

        case 10046: 
            return STERLING_DATE_PICKER_NATIVE_CONTROL;

        case 10031: 
            return STERLING_OVERVIEW_TAB;

        case 10032: 
            return STERLING_ACTIVITY_TAB;

        case 10033: 
            return STERLING_SPEND_TAB;

        case 10034: 
            return STERLING_GRAPH_SERIES_DROPDOWN_BUTTON;

        case 10035: 
            return STERLING_GRAPH_SERIES_DROPDOWN_ITEM;

        case 10036: 
            return STERLING_VIEW_ALL_BUTTON;

        case 10045: 
            return STERLING_OBJECTIVE_SUMMARY_STATS_ROW;

        case 10037: 
            return STERLING_PROMOTED_PIN_PERFORMANCE_TABLE_ROW;

        case 10038: 
            return STERLING_DOWNLOAD_BUTTON;

        case 10039: 
            return STERLING_CONVERSION_TAG_LEARN_MORE_LINK;

        case 10040: 
            return STERLING_CREATE_TAG_BUTTON;

        case 10041: 
            return STERLING_CREATE_TAG_LINK;

        case 10042: 
            return STERLING_COPY_CODE_BUTTON;

        case 10043: 
            return STERLING_EDIT_TAG_BUTTON;

        case 10044: 
            return STERLING_DELETE_TAG_BUTTON;

        case 10047: 
            return STERLING_NAV_REPORTS_LINK;

        case 10048: 
            return STERLING_NAV_TOOLS_LINK;

        case 10049: 
            return STERLING_NAV_ANALYTICS_LINK;

        case 10052: 
            return STERLING_NAV_AWARENESS_CAMPAIGNS_LINK;

        case 10053: 
            return STERLING_NAV_ENGAGEMENT_CAMPAIGNS_LINK;

        case 10054: 
            return STERLING_NAV_TRAFFIC_CAMPAIGNS_LINK;

        case 10055: 
            return STERLING_NAV_RECENT_CAMPAIGNS_LINK;

        case 10056: 
            return STERLING_NAV_RECENT_CAMPAIGN_LINK;

        case 10057: 
            return STERLING_NAV_BILLING_LINK;

        case 10058: 
            return STERLING_NAV_CONVERSION_TRACKING_LINK;

        case 10059: 
            return STERLING_NAV_CINEMATIC_PIN_LINK;

        case 10120: 
            return STERLING_BULK_EDITOR_CREATE_BUTTON;

        case 10121: 
            return STERLING_BULK_EDITOR_EDIT_BUTTON;

        case 10122: 
            return STERLING_BULK_UPLOAD_CREATE_BUTTON;

        case 10123: 
            return STERLING_BULK_UPLOAD_CANCEL_BUTTON;

        case 10124: 
            return STERLING_BULK_REVIEW_SUBMIT_BUTTON;

        case 10125: 
            return STERLING_BULK_REVIEW_FIX_BUTTON;

        case 10126: 
            return STERLING_BULK_REVIEW_BACK_BUTTON;

        case 10127: 
            return STERLING_BULK_REVIEW_CANCEL_BUTTON;

        case 10061: 
            return CAMPBELL_NAV_HOMEFEED_BUTTON;

        case 10062: 
            return CAMPBELL_NAV_SEARCH_BAR;

        case 10063: 
            return CAMPBELL_NAV_CATEGORIES_BUTTON;

        case 10064: 
            return CAMPBELL_NAV_ADD_PIN_BUTTON;

        case 10065: 
            return CAMPBELL_NAV_NOTIFICATIONS_BUTTON;

        case 10066: 
            return CAMPBELL_NAV_USER_MENU_BUTTON;

        case 10067: 
            return CAMPBELL_NAV_DRAWER_OPEN_BUTTON;

        case 10068: 
            return CAMPBELL_NAV_DRAWER_CLOSE_BUTTON;

        case 10069: 
            return CAMPBELL_NAV_DRAWER_CLOSE_GREY_PAGE;

        case 10070: 
            return CAMPBELL_NAV_DRAWER_HOMEFEED_LINK;

        case 10071: 
            return CAMPBELL_NAV_DRAWER_ANALYTICS_LINK;

        case 10072: 
            return CAMPBELL_NAV_DRAWER_ADS_MANAGER_LINK;

        case 10073: 
            return CAMPBELL_NAV_DRAWER_PINS_FROM_WEBSITE_LINK;

        case 10074: 
            return CAMPBELL_NAV_DRAWER_UPLOAD_FROM_COMPUTER_LINK;

        case 10075: 
            return CAMPBELL_NAV_DRAWER_CREATE_AD_LINK;

        case 10076: 
            return CAMPBELL_NAV_DRAWER_PIN_IT_BUTTON_LINK;

        case 10077: 
            return CAMPBELL_NAV_DRAWER_RICH_PINS_LINK;

        case 10078: 
            return CAMPBELL_NAV_DRAWER_WEBSITE_CONFIRMATION_LINK;

        case 10079: 
            return CAMPBELL_NAV_DRAWER_CASE_STUDIES_LINK;

        case 10080: 
            return CAMPBELL_NAV_DRAWER_HOW_TO_GUIDES_LINK;

        case 10081: 
            return CAMPBELL_NAV_DRAWER_DEVELOPER_DOCS_LINK;

        case 10082: 
            return CAMPBELL_NAV_DRAWER_HELP_CENTER_LINK;

        case 10083: 
            return CAMPBELL_NAV_ADS_MANAGER_BUTTON;

        case 10084: 
            return CAMPBELL_NAV_ADS_OVERVIEW_LINK;

        case 10085: 
            return CAMPBELL_NAV_ADS_TOOLS_LINK;

        case 10086: 
            return CAMPBELL_NAV_ADS_ENGAGEMENT_LINK;

        case 10087: 
            return CAMPBELL_NAV_ADS_TRAFFIC_LINK;

        case 10088: 
            return CAMPBELL_NAV_ADS_BUYABLE_LINK;

        case 10089: 
            return CAMPBELL_NAV_ADS_AWARENESS_LINK;

        case 10090: 
            return CAMPBELL_NAV_ADS_BULK_EDITOR_LINK;

        case 10091: 
            return CAMPBELL_NAV_ADS_CONVERSION_TRACKING_LINK;

        case 10092: 
            return CAMPBELL_NAV_ADS_CINEMATIC_PIN_LINK;

        case 10093: 
            return CAMPBELL_NAV_ANALYTICS_BUTTON;

        case 10094: 
            return CAMPBELL_NAV_ANALYTICS_OVERVIEW_LINK;

        case 10095: 
            return CAMPBELL_NAV_PROFILE_LINK;

        case 10096: 
            return CAMPBELL_NAV_AUDIENCE_LINK;

        case 10097: 
            return CAMPBELL_NAV_WEBSITE_LINK;

        case 10098: 
            return CAMPBELL_NAV_ADD_PIN_FROM_WEB_LINK;

        case 10099: 
            return CAMPBELL_NAV_ADD_PIN_UPLOAD;

        case 10100: 
            return CAMPBELL_NAV_ADD_PIN_CREATE_AD;

        case 10101: 
            return CAMPBELL_NAV_USER_MENU_PROFILE_LINK;

        case 10102: 
            return CAMPBELL_NAV_USER_MENU_SETTINGS_LINK;

        case 10103: 
            return CAMPBELL_NAV_USER_MENU_BILLING_LINK;

        case 10104: 
            return CAMPBELL_NAV_USER_MENU_HELP_CENTER_LINK;

        case 10105: 
            return CAMPBELL_NAV_USER_MENU_LOGOUT_LINK;
        }
    }

    public static ElementType valueOf(String s)
    {
        return (ElementType)Enum.valueOf(com/pinterest/schemas/event/ElementType, s);
    }

    public static ElementType[] values()
    {
        return (ElementType[])$VALUES.clone();
    }

    public final int getValue()
    {
        return value;
    }

    static 
    {
        PIN_REPIN_BUTTON = new ElementType("PIN_REPIN_BUTTON", 0, 0);
        PIN_LIKE_BUTTON = new ElementType("PIN_LIKE_BUTTON", 1, 1);
        PIN_COMMENT_BUTTON = new ElementType("PIN_COMMENT_BUTTON", 2, 2);
        PIN_EDIT_BUTTON = new ElementType("PIN_EDIT_BUTTON", 3, 3);
        PIN_SHARE_BUTTON = new ElementType("PIN_SHARE_BUTTON", 4, 72);
        PIN_CAPTION_COMMENT = new ElementType("PIN_CAPTION_COMMENT", 5, 4);
        PIN_BOARD = new ElementType("PIN_BOARD", 6, 5);
        PIN_BOARD_FOLLOW = new ElementType("PIN_BOARD_FOLLOW", 7, 6);
        PIN_BOARD_PIN = new ElementType("PIN_BOARD_PIN", 8, 7);
        PIN_ORIGINAL_BOARD = new ElementType("PIN_ORIGINAL_BOARD", 9, 8);
        PIN_ORIGINAL_BOARD_FOLLOW = new ElementType("PIN_ORIGINAL_BOARD_FOLLOW", 10, 9);
        PIN_ORIGINAL_BOARD_PIN = new ElementType("PIN_ORIGINAL_BOARD_PIN", 11, 10);
        PIN_VIA_PIN = new ElementType("PIN_VIA_PIN", 12, 11);
        PIN_VIA = new ElementType("PIN_VIA", 13, 12);
        PIN_RELATED_PIN = new ElementType("PIN_RELATED_PIN", 14, 148);
        PIN_INTEREST = new ElementType("PIN_INTEREST", 15, 255);
        PIN_MORE_ACTIVITY = new ElementType("PIN_MORE_ACTIVITY", 16, 1054);
        PIN_SAVED_BY = new ElementType("PIN_SAVED_BY", 17, 1055);
        PIN_ACTIVITY_LIKE = new ElementType("PIN_ACTIVITY_LIKE", 18, 1063);
        SUGGESTED_USER = new ElementType("SUGGESTED_USER", 19, 13);
        REMOVE_SUGGESTED_USER_BUTTON = new ElementType("REMOVE_SUGGESTED_USER_BUTTON", 20, 14);
        NEWS_FEED_PIN = new ElementType("NEWS_FEED_PIN", 21, 15);
        NEWS_FEED_USER = new ElementType("NEWS_FEED_USER", 22, 16);
        REPIN_SUGGESTED_BOARD = new ElementType("REPIN_SUGGESTED_BOARD", 23, 17);
        PIN_UPLOAD_BUTTON = new ElementType("PIN_UPLOAD_BUTTON", 24, 18);
        LOGOUT_BUTTON = new ElementType("LOGOUT_BUTTON", 25, 19);
        FOLLOW_ALL_USERS_BUTTON = new ElementType("FOLLOW_ALL_USERS_BUTTON", 26, 20);
        FACEBOOK_TIMELINE_CONNECT = new ElementType("FACEBOOK_TIMELINE_CONNECT", 27, 21);
        BOARD_CREATE = new ElementType("BOARD_CREATE", 28, 22);
        BOARD_CREATE_SUGGESTED = new ElementType("BOARD_CREATE_SUGGESTED", 29, 23);
        ANALYTICS_BUTTON = new ElementType("ANALYTICS_BUTTON", 30, 24);
        PIN_DOMAIN = new ElementType("PIN_DOMAIN", 31, 25);
        PIN_USER = new ElementType("PIN_USER", 32, 26);
        PIN_ATTRIBUTION = new ElementType("PIN_ATTRIBUTION", 33, 27);
        PIN_LIKER = new ElementType("PIN_LIKER", 34, 28);
        PIN_PINNED_TO = new ElementType("PIN_PINNED_TO", 35, 29);
        LOGIN_BUTTON = new ElementType("LOGIN_BUTTON", 36, 30);
        SIGNUP_BUTTON = new ElementType("SIGNUP_BUTTON", 37, 31);
        RETRY_BUTTON = new ElementType("RETRY_BUTTON", 38, 32);
        RESET_BUTTON = new ElementType("RESET_BUTTON", 39, 33);
        BACK_BUTTON = new ElementType("BACK_BUTTON", 40, 34);
        PIN_SOURCE_IMAGE = new ElementType("PIN_SOURCE_IMAGE", 41, 35);
        BOARD_COVER = new ElementType("BOARD_COVER", 42, 36);
        BOARD_FOLLOW = new ElementType("BOARD_FOLLOW", 43, 37);
        CATEGORY_ICON = new ElementType("CATEGORY_ICON", 44, 38);
        PINPICKS_ICON = new ElementType("PINPICKS_ICON", 45, 341);
        NEWS_FEED_BOARD = new ElementType("NEWS_FEED_BOARD", 46, 39);
        PROFILE_BUTTON = new ElementType("PROFILE_BUTTON", 47, 40);
        FOLLOWING_BUTTON = new ElementType("FOLLOWING_BUTTON", 48, 41);
        FOLLOWERS_BUTTON = new ElementType("FOLLOWERS_BUTTON", 49, 42);
        SEARCH_BUTTON = new ElementType("SEARCH_BUTTON", 50, 43);
        CREATE_BUTTON = new ElementType("CREATE_BUTTON", 51, 44);
        REFRESH_BUTTON = new ElementType("REFRESH_BUTTON", 52, 45);
        PIN_SHARE = new ElementType("PIN_SHARE", 53, 46);
        PIN_REPORT_BUTTON = new ElementType("PIN_REPORT_BUTTON", 54, 47);
        PIN_SHARE_TWITTER_BUTTON = new ElementType("PIN_SHARE_TWITTER_BUTTON", 55, 256);
        PIN_SHARE_FACEBOOK_BUTTON = new ElementType("PIN_SHARE_FACEBOOK_BUTTON", 56, 257);
        PIN_SHARE_FACEBOOK_PINLIST_OTHER_PIN_BUTTON = new ElementType("PIN_SHARE_FACEBOOK_PINLIST_OTHER_PIN_BUTTON", 57, 1045);
        PIN_SHARE_FACEBOOK_PINLIST_TRENDING_STORY = new ElementType("PIN_SHARE_FACEBOOK_PINLIST_TRENDING_STORY", 58, 1046);
        PIN_SHARE_EMAIL_BUTTON = new ElementType("PIN_SHARE_EMAIL_BUTTON", 59, 258);
        PIN_READING_LIST_BUTTON = new ElementType("PIN_READING_LIST_BUTTON", 60, 259);
        PIN_SAVE_BUTTON = new ElementType("PIN_SAVE_BUTTON", 61, 48);
        PIN_DELETE_BUTTON = new ElementType("PIN_DELETE_BUTTON", 62, 49);
        PIN_SEND_BUTTON = new ElementType("PIN_SEND_BUTTON", 63, 98);
        BOARD_DELETE_BUTTON = new ElementType("BOARD_DELETE_BUTTON", 64, 50);
        BOARD_LEAVE_BUTTON = new ElementType("BOARD_LEAVE_BUTTON", 65, 97);
        BOARD_EDIT_BUTTON = new ElementType("BOARD_EDIT_BUTTON", 66, 81);
        BOARD_CATEGORY = new ElementType("BOARD_CATEGORY", 67, 51);
        BOARD_NAME = new ElementType("BOARD_NAME", 68, 52);
        BOARD_SECRET = new ElementType("BOARD_SECRET", 69, 53);
        CAMERA_BUTTON = new ElementType("CAMERA_BUTTON", 70, 54);
        GALLERY_BUTTON = new ElementType("GALLERY_BUTTON", 71, 55);
        FIND_IMAGES_BUTTON = new ElementType("FIND_IMAGES_BUTTON", 72, 56);
        SETTINGS_BUTTON = new ElementType("SETTINGS_BUTTON", 73, 57);
        FINDFRIENDS_BUTTON = new ElementType("FINDFRIENDS_BUTTON", 74, 58);
        INVITE_BUTTON = new ElementType("INVITE_BUTTON", 75, 59);
        SUPPORT_BUTTON = new ElementType("SUPPORT_BUTTON", 76, 60);
        TOS_BUTTON = new ElementType("TOS_BUTTON", 77, 61);
        USER_FOLLOW = new ElementType("USER_FOLLOW", 78, 62);
        PROFILE_IMAGE = new ElementType("PROFILE_IMAGE", 79, 63);
        PROFILE_URL = new ElementType("PROFILE_URL", 80, 64);
        PROFILE_FACEBOOK = new ElementType("PROFILE_FACEBOOK", 81, 65);
        PROFILE_TWITTER = new ElementType("PROFILE_TWITTER", 82, 66);
        BOARD_PICKER = new ElementType("BOARD_PICKER", 83, 67);
        FACEBOOK_CONNECT = new ElementType("FACEBOOK_CONNECT", 84, 68);
        TWITTER_CONNECT = new ElementType("TWITTER_CONNECT", 85, 69);
        RAKUTEN_CONNECT = new ElementType("RAKUTEN_CONNECT", 86, 151);
        GPLUS_CONNECT = new ElementType("GPLUS_CONNECT", 87, 208);
        PIN_SUBMIT = new ElementType("PIN_SUBMIT", 88, 70);
        USER_FEED_FOLLOW = new ElementType("USER_FEED_FOLLOW", 89, 71);
        CANCEL_BUTTON = new ElementType("CANCEL_BUTTON", 90, 73);
        MENU_BUTTON = new ElementType("MENU_BUTTON", 91, 74);
        CLOSE_BUTTON = new ElementType("CLOSE_BUTTON", 92, 75);
        DONE_BUTTON = new ElementType("DONE_BUTTON", 93, 76);
        NEWS_BUTTON = new ElementType("NEWS_BUTTON", 94, 77);
        EXPLORE_BUTTON = new ElementType("EXPLORE_BUTTON", 95, 78);
        BROWSER_BUTTON = new ElementType("BROWSER_BUTTON", 96, 79);
        USER_FLAG_BUTTON = new ElementType("USER_FLAG_BUTTON", 97, 80);
        USER_LIKES_BUTTON = new ElementType("USER_LIKES_BUTTON", 98, 82);
        USER_PINS_BUTTON = new ElementType("USER_PINS_BUTTON", 99, 83);
        USER_BOARDS_BUTTON = new ElementType("USER_BOARDS_BUTTON", 100, 84);
        USER_ABOUT_BUTTON = new ElementType("USER_ABOUT_BUTTON", 101, 85);
        USER_EDIT_BUTTON = new ElementType("USER_EDIT_BUTTON", 102, 94);
        NEXT_BUTTON = new ElementType("NEXT_BUTTON", 103, 96);
        ADD_MESSAGE_BUTTON = new ElementType("ADD_MESSAGE_BUTTON", 104, 99);
        COPY_LINK_BUTTON = new ElementType("COPY_LINK_BUTTON", 105, 100);
        CLIPBOARD_BUTTON = new ElementType("CLIPBOARD_BUTTON", 106, 101);
        CLEAR_HISTORY_BUTTON = new ElementType("CLEAR_HISTORY_BUTTON", 107, 102);
        SEND_BUTTON = new ElementType("SEND_BUTTON", 108, 103);
        NAVIGATION_HOME_BUTTON = new ElementType("NAVIGATION_HOME_BUTTON", 109, 146);
        NAVIGATION_DISCOVER_BUTTON = new ElementType("NAVIGATION_DISCOVER_BUTTON", 110, 147);
        PHOTOS_BUTTON = new ElementType("PHOTOS_BUTTON", 111, 149);
        STORY_PLUS_ICON = new ElementType("STORY_PLUS_ICON", 112, 370);
        STORY_TITLE = new ElementType("STORY_TITLE", 113, 371);
        STORY_END_CELL = new ElementType("STORY_END_CELL", 114, 372);
        STORY_FEATURED_ITEM = new ElementType("STORY_FEATURED_ITEM", 115, 373);
        DECLINE_BUTTON = new ElementType("DECLINE_BUTTON", 116, 86);
        USER_BLOCK_BUTTON = new ElementType("USER_BLOCK_BUTTON", 117, 87);
        USER_UNBLOCK_BUTTON = new ElementType("USER_UNBLOCK_BUTTON", 118, 88);
        USER_REPORT_BUTTON = new ElementType("USER_REPORT_BUTTON", 119, 89);
        BOARD_CREATE_SECRET = new ElementType("BOARD_CREATE_SECRET", 120, 90);
        USER_ABOUT_EDIT_BUTTON = new ElementType("USER_ABOUT_EDIT_BUTTON", 121, 91);
        USER_URL_EDIT_BUTTON = new ElementType("USER_URL_EDIT_BUTTON", 122, 92);
        BOARD_DESCRIPTION = new ElementType("BOARD_DESCRIPTION", 123, 93);
        EDUCATION_TARGET = new ElementType("EDUCATION_TARGET", 124, 95);
        BROWSER_WEB_IMAGE = new ElementType("BROWSER_WEB_IMAGE", 125, 109);
        AUTOCOMPLETE_SUGGESTION = new ElementType("AUTOCOMPLETE_SUGGESTION", 126, 104);
        FIND_MORE_BOARDS_BUTTON = new ElementType("FIND_MORE_BOARDS_BUTTON", 127, 105);
        GET_STARTED_BUTTON = new ElementType("GET_STARTED_BUTTON", 128, 106);
        REMOVE_BUTTON = new ElementType("REMOVE_BUTTON", 129, 107);
        WHO_CAN_PIN_BUTTON = new ElementType("WHO_CAN_PIN_BUTTON", 130, 108);
        PIN_RICH_PIN_ACTION_BUTTON = new ElementType("PIN_RICH_PIN_ACTION_BUTTON", 131, 110);
        USER_RECENT_CONTACT = new ElementType("USER_RECENT_CONTACT", 132, 111);
        USER_LIST_USER = new ElementType("USER_LIST_USER", 133, 112);
        UNDO_BUTTON = new ElementType("UNDO_BUTTON", 134, 113);
        CLEAR_SEARCHES_BUTTON = new ElementType("CLEAR_SEARCHES_BUTTON", 135, 114);
        CLEAR_CONTACTS_BUTTON = new ElementType("CLEAR_CONTACTS_BUTTON", 136, 115);
        PIN_DESCRIPTION = new ElementType("PIN_DESCRIPTION", 137, 116);
        EDIT_HOME_FEED_BUTTON = new ElementType("EDIT_HOME_FEED_BUTTON", 138, 117);
        FOLLOW_BOARDS_BUTTON = new ElementType("FOLLOW_BOARDS_BUTTON", 139, 118);
        UNFOLLOW_BOARDS_BUTTON = new ElementType("UNFOLLOW_BOARDS_BUTTON", 140, 119);
        DUPLICATE_PIN_WARNING = new ElementType("DUPLICATE_PIN_WARNING", 141, 120);
        SUGGESTED_EMAIL = new ElementType("SUGGESTED_EMAIL", 142, 121);
        USERNAME_BUTTON = new ElementType("USERNAME_BUTTON", 143, 122);
        EMAIL_BUTTON = new ElementType("EMAIL_BUTTON", 144, 123);
        COUNTRY_BUTTON = new ElementType("COUNTRY_BUTTON", 145, 124);
        PUSH_NOTIFICATIONS_BUTTON = new ElementType("PUSH_NOTIFICATIONS_BUTTON", 146, 125);
        UPDATE_BUTTON = new ElementType("UPDATE_BUTTON", 147, 126);
        CATEGORY_RECENT = new ElementType("CATEGORY_RECENT", 148, 127);
        LANGUAGE_BUTTON = new ElementType("LANGUAGE_BUTTON", 149, 240);
        GENDER_BUTTON = new ElementType("GENDER_BUTTON", 150, 241);
        PERSONALIZED_RECOMMENDATIONS_BUTTON = new ElementType("PERSONALIZED_RECOMMENDATIONS_BUTTON", 151, 242);
        SEARCH_PRIVACY_BUTTON = new ElementType("SEARCH_PRIVACY_BUTTON", 152, 243);
        CHANGE_PASSWORD_BUTTON = new ElementType("CHANGE_PASSWORD_BUTTON", 153, 128);
        SHOW_PASSWORD_BUTTON = new ElementType("SHOW_PASSWORD_BUTTON", 154, 129);
        SAVE_USER_SETTINGS_BUTTON = new ElementType("SAVE_USER_SETTINGS_BUTTON", 155, 130);
        RIBBON_BUTTON = new ElementType("RIBBON_BUTTON", 156, 131);
        USER_LIST_CONTACT = new ElementType("USER_LIST_CONTACT", 157, 132);
        USER_FEED_INVITE_EMAIL = new ElementType("USER_FEED_INVITE_EMAIL", 158, 133);
        USER_FEED_INVITE_SMS = new ElementType("USER_FEED_INVITE_SMS", 159, 134);
        USER_FEED_INVITE_CUSTOM_EMAIL = new ElementType("USER_FEED_INVITE_CUSTOM_EMAIL", 160, 135);
        NAME_BUTTON = new ElementType("NAME_BUTTON", 161, 136);
        APP_ICON = new ElementType("APP_ICON", 162, 137);
        USER_ICON = new ElementType("USER_ICON", 163, 138);
        NOTIFICATIONS_ICON = new ElementType("NOTIFICATIONS_ICON", 164, 139);
        SEE_OTHER_PINS_BUTTON = new ElementType("SEE_OTHER_PINS_BUTTON", 165, 140);
        MORE_PINS_BUTTON = new ElementType("MORE_PINS_BUTTON", 166, 141);
        PIN_PROMOTED_INFO = new ElementType("PIN_PROMOTED_INFO", 167, 142);
        PROMOTED_OK_BUTTON = new ElementType("PROMOTED_OK_BUTTON", 168, 143);
        LINK_OUT_BUTTON = new ElementType("LINK_OUT_BUTTON", 169, 144);
        PFY_REASON_BUTTON = new ElementType("PFY_REASON_BUTTON", 170, 145);
        INVITE_DELETE_BUTTON = new ElementType("INVITE_DELETE_BUTTON", 171, 150);
        FEED_SUBCATEGORY = new ElementType("FEED_SUBCATEGORY", 172, 152);
        DISCOVER_TRENDING_CATEGORY = new ElementType("DISCOVER_TRENDING_CATEGORY", 173, 153);
        MAP_ANNOTATION = new ElementType("MAP_ANNOTATION", 174, 154);
        MAP_SEE_ON_MAP_BUTTON = new ElementType("MAP_SEE_ON_MAP_BUTTON", 175, 155);
        MAP_DIRECTIONS_BUTTON = new ElementType("MAP_DIRECTIONS_BUTTON", 176, 156);
        MAP_ADD_BUTTON = new ElementType("MAP_ADD_BUTTON", 177, 157);
        PLACES_BUTTON = new ElementType("PLACES_BUTTON", 178, 158);
        LOCATION_BUTTON = new ElementType("LOCATION_BUTTON", 179, 159);
        PLACES_LIST_PLACE = new ElementType("PLACES_LIST_PLACE", 180, 160);
        PHONE_BUTTON = new ElementType("PHONE_BUTTON", 181, 161);
        WEBSITE_BUTTON = new ElementType("WEBSITE_BUTTON", 182, 162);
        PLACE_IMAGE = new ElementType("PLACE_IMAGE", 183, 163);
        MAP_PIN_ICON = new ElementType("MAP_PIN_ICON", 184, 164);
        ADD_PLACE_BUTTON = new ElementType("ADD_PLACE_BUTTON", 185, 165);
        PLACE_PICKER_CREATE = new ElementType("PLACE_PICKER_CREATE", 186, 166);
        PLACE_PICKER_IMAGE = new ElementType("PLACE_PICKER_IMAGE", 187, 167);
        REMOVE_PLACE_BUTTON = new ElementType("REMOVE_PLACE_BUTTON", 188, 168);
        MAP_TOGGLE_BUTTON = new ElementType("MAP_TOGGLE_BUTTON", 189, 170);
        COLLABORATOR_TEXT = new ElementType("COLLABORATOR_TEXT", 190, 171);
        SEND_INVITE_BUTTON = new ElementType("SEND_INVITE_BUTTON", 191, 172);
        INVITE_ALL_TOGGLE = new ElementType("INVITE_ALL_TOGGLE", 192, 173);
        REPINS_BUTTON = new ElementType("REPINS_BUTTON", 193, 174);
        LIKES_BUTTON = new ElementType("LIKES_BUTTON", 194, 175);
        PIN_FLAG_BUTTON = new ElementType("PIN_FLAG_BUTTON", 195, 176);
        DOMAIN_URL = new ElementType("DOMAIN_URL", 196, 177);
        LOGO = new ElementType("LOGO", 197, 178);
        SEE_MORE_BUTTON = new ElementType("SEE_MORE_BUTTON", 198, 179);
        BOARD_RELATED_BOARD = new ElementType("BOARD_RELATED_BOARD", 199, 180);
        COMMENTS_BUTTON = new ElementType("COMMENTS_BUTTON", 200, 181);
        SEARCH_RELATED_QUERY = new ElementType("SEARCH_RELATED_QUERY", 201, 191);
        SEARCH_RELATED_CATEGORY = new ElementType("SEARCH_RELATED_CATEGORY", 202, 192);
        BUY_BUTTON = new ElementType("BUY_BUTTON", 203, 201);
        FACEBOOK_INVITE_BUTTON = new ElementType("FACEBOOK_INVITE_BUTTON", 204, 202);
        GPLUS_INVITE_BUTTON = new ElementType("GPLUS_INVITE_BUTTON", 205, 203);
        SEND_TO_PINNER_BUTTON = new ElementType("SEND_TO_PINNER_BUTTON", 206, 204);
        APP_RATING_ATTEMPT_BUTTON = new ElementType("APP_RATING_ATTEMPT_BUTTON", 207, 205);
        APP_RATING_DECLINE_BUTTON = new ElementType("APP_RATING_DECLINE_BUTTON", 208, 206);
        APP_RATING_REMIND_BUTTON = new ElementType("APP_RATING_REMIND_BUTTON", 209, 207);
        SEND_SMS_INVITE_BUTTON = new ElementType("SEND_SMS_INVITE_BUTTON", 210, 209);
        COMPOSE_SMS_INVITE_BUTTON = new ElementType("COMPOSE_SMS_INVITE_BUTTON", 211, 210);
        FLOWED_INTEREST = new ElementType("FLOWED_INTEREST", 212, 211);
        REPIN_ADD_PLACE_BUTTON = new ElementType("REPIN_ADD_PLACE_BUTTON", 213, 212);
        REPIN_EDIT_PLACE_BUTTON = new ElementType("REPIN_EDIT_PLACE_BUTTON", 214, 213);
        RELATED_RICH_PIN_BUTTON = new ElementType("RELATED_RICH_PIN_BUTTON", 215, 214);
        BULK_INVITER_BUTTON = new ElementType("BULK_INVITER_BUTTON", 216, 215);
        RELATED_INTEREST = new ElementType("RELATED_INTEREST", 217, 216);
        SINGLE_PIN_POPOVER = new ElementType("SINGLE_PIN_POPOVER", 218, 217);
        NEWS_FEED_QUESTION = new ElementType("NEWS_FEED_QUESTION", 219, 218);
        NEWS_FEED_ANSWER = new ElementType("NEWS_FEED_ANSWER", 220, 219);
        SEARCH_PINS_BUTTON = new ElementType("SEARCH_PINS_BUTTON", 221, 220);
        SEARCH_BOARDS_BUTTON = new ElementType("SEARCH_BOARDS_BUTTON", 222, 221);
        SEARCH_PINNERS_BUTTON = new ElementType("SEARCH_PINNERS_BUTTON", 223, 222);
        SEARCH_MY_PINS_BUTTON = new ElementType("SEARCH_MY_PINS_BUTTON", 224, 223);
        SEARCH_PLACES_BUTTON = new ElementType("SEARCH_PLACES_BUTTON", 225, 224);
        SEARCH_BUYABLE_PINS_BUTTON = new ElementType("SEARCH_BUYABLE_PINS_BUTTON", 226, 842);
        SEARCH_TOKEN = new ElementType("SEARCH_TOKEN", 227, 225);
        SEARCH_GUIDE_SUGGESTION = new ElementType("SEARCH_GUIDE_SUGGESTION", 228, 226);
        SEARCH_BOX_TEXT_INPUT = new ElementType("SEARCH_BOX_TEXT_INPUT", 229, 227);
        SEARCH_BOX_ADD_TOKEN_BUTTON = new ElementType("SEARCH_BOX_ADD_TOKEN_BUTTON", 230, 228);
        ADD_INTEREST_BUTTON = new ElementType("ADD_INTEREST_BUTTON", 231, 229);
        SUGGEST_INTEREST_BUTTON = new ElementType("SUGGEST_INTEREST_BUTTON", 232, 230);
        EDUCATION_GUIDED_SEARCH_SUGGESTION = new ElementType("EDUCATION_GUIDED_SEARCH_SUGGESTION", 233, 231);
        EDUCATION_GUIDED_SEARCH_COMPLETE_BUTTON = new ElementType("EDUCATION_GUIDED_SEARCH_COMPLETE_BUTTON", 234, 232);
        VISUAL_OBJECT_BUTTON = new ElementType("VISUAL_OBJECT_BUTTON", 235, 233);
        VISUAL_SEARCH_BUTTON = new ElementType("VISUAL_SEARCH_BUTTON", 236, 234);
        NAVIGATION_LOGO_BUTTON = new ElementType("NAVIGATION_LOGO_BUTTON", 237, 244);
        MORE_INFO_BUTTON = new ElementType("MORE_INFO_BUTTON", 238, 245);
        YOUR_PROFILE_BUTTON = new ElementType("YOUR_PROFILE_BUTTON", 239, 246);
        YOUR_SETTINGS_BUTTON = new ElementType("YOUR_SETTINGS_BUTTON", 240, 247);
        FIND_FRIENDS_BUTTON = new ElementType("FIND_FRIENDS_BUTTON", 241, 248);
        CREATE_BOARD_BUTTON = new ElementType("CREATE_BOARD_BUTTON", 242, 249);
        ADD_PIN_FROM_WEBSITE_BUTTON = new ElementType("ADD_PIN_FROM_WEBSITE_BUTTON", 243, 250);
        UPLOAD_PIN_BUTTON = new ElementType("UPLOAD_PIN_BUTTON", 244, 251);
        NEWS_FEED_REPLY = new ElementType("NEWS_FEED_REPLY", 245, 252);
        NEWS_FEED_ACTOR_IMAGE = new ElementType("NEWS_FEED_ACTOR_IMAGE", 246, 273);
        NEWS_FEED_ACTOR_LABEL = new ElementType("NEWS_FEED_ACTOR_LABEL", 247, 274);
        RECENT_SEARCH_SUGGESTION = new ElementType("RECENT_SEARCH_SUGGESTION", 248, 253);
        SEARCH_ALL_WITH_QUERY = new ElementType("SEARCH_ALL_WITH_QUERY", 249, 254);
        INTEREST_SUGGESTION = new ElementType("INTEREST_SUGGESTION", 250, 260);
        INTEREST_FOLLOW = new ElementType("INTEREST_FOLLOW", 251, 1030);
        STORIES_FEED_LARGE_STORY = new ElementType("STORIES_FEED_LARGE_STORY", 252, 261);
        STORIES_FEED_SMALL_STORY = new ElementType("STORIES_FEED_SMALL_STORY", 253, 262);
        STORIES_FEED_ACTOR = new ElementType("STORIES_FEED_ACTOR", 254, 263);
        STORIES_FEED_RELATED_OBJECT = new ElementType("STORIES_FEED_RELATED_OBJECT", 255, 264);
        STORIES_FEED_RELATED_MORE_CELL = new ElementType("STORIES_FEED_RELATED_MORE_CELL", 256, 269);
        STORIES_FEED_ACTOR_IMAGE = new ElementType("STORIES_FEED_ACTOR_IMAGE", 257, 272);
        DISCOVER_FEATURED_ITEM = new ElementType("DISCOVER_FEATURED_ITEM", 258, 265);
        FOLLOWING_INTERESTS_BUTTON = new ElementType("FOLLOWING_INTERESTS_BUTTON", 259, 266);
        FOLLOWING_PINNERS_BUTTON = new ElementType("FOLLOWING_PINNERS_BUTTON", 260, 267);
        FOLLOWING_BOARDS_BUTTON = new ElementType("FOLLOWING_BOARDS_BUTTON", 261, 268);
        HELP_PULSE = new ElementType("HELP_PULSE", 262, 270);
        HELP_BUTTON = new ElementType("HELP_BUTTON", 263, 271);
        HELP_FLYOUT_BUTTON = new ElementType("HELP_FLYOUT_BUTTON", 264, 299);
        CONVERSATION_NEW_BUTTON = new ElementType("CONVERSATION_NEW_BUTTON", 265, 275);
        CONVERSATION_CREATE_BUTTON = new ElementType("CONVERSATION_CREATE_BUTTON", 266, 276);
        CONVERSATION_LIST_ITEM = new ElementType("CONVERSATION_LIST_ITEM", 267, 277);
        CONVERSATION_INBOX_BUTTON = new ElementType("CONVERSATION_INBOX_BUTTON", 268, 278);
        GET_EXTENSION_BUTTON = new ElementType("GET_EXTENSION_BUTTON", 269, 279);
        INSTALL_EXTENSION_BUTTON = new ElementType("INSTALL_EXTENSION_BUTTON", 270, 280);
        CANCEL_EXTENSION_INSTALL_BUTTON = new ElementType("CANCEL_EXTENSION_INSTALL_BUTTON", 271, 460);
        HELP_CENTER_BUTTON = new ElementType("HELP_CENTER_BUTTON", 272, 281);
        PIN_CELL_BUTTON_PFY_PIN_SOURCE = new ElementType("PIN_CELL_BUTTON_PFY_PIN_SOURCE", 273, 282);
        PIN_CELL_BUTTON_PROMOTED_PIN_SOURCE = new ElementType("PIN_CELL_BUTTON_PROMOTED_PIN_SOURCE", 274, 283);
        PIN_FEEDBACK_BUTTON_PFY = new ElementType("PIN_FEEDBACK_BUTTON_PFY", 275, 284);
        PIN_FEEDBACK_BUTTON_PROMOTED = new ElementType("PIN_FEEDBACK_BUTTON_PROMOTED", 276, 285);
        PIN_FEEDBACK_BUTTON_STATE_REASON_PFY = new ElementType("PIN_FEEDBACK_BUTTON_STATE_REASON_PFY", 277, 286);
        PIN_FEEDBACK_BUTTON_STATE_REASON_PROMOTED = new ElementType("PIN_FEEDBACK_BUTTON_STATE_REASON_PROMOTED", 278, 287);
        PIN_FEEDBACK_DIALOG_BUTTON_HIDE_PIN_PFY = new ElementType("PIN_FEEDBACK_DIALOG_BUTTON_HIDE_PIN_PFY", 279, 288);
        PIN_FEEDBACK_DIALOG_BUTTON_PFY_STOP_RECS_FROM_THROUGH_BOARD = new ElementType("PIN_FEEDBACK_DIALOG_BUTTON_PFY_STOP_RECS_FROM_THROUGH_BOARD", 280, 289);
        PIN_FEEDBACK_DIALOG_BUTTON_LEARN_MORE_PROMOTED = new ElementType("PIN_FEEDBACK_DIALOG_BUTTON_LEARN_MORE_PROMOTED", 281, 290);
        PIN_FEEDBACK_DIALOG_BUTTON_HIDE_PIN_PROMOTED = new ElementType("PIN_FEEDBACK_DIALOG_BUTTON_HIDE_PIN_PROMOTED", 282, 291);
        PIN_FEEDBACK_DIALOG_BUTTON_DISMISS = new ElementType("PIN_FEEDBACK_DIALOG_BUTTON_DISMISS", 283, 292);
        PIN_FEEDBACK_REASON_BUTTON_NOT_INTERESTED = new ElementType("PIN_FEEDBACK_REASON_BUTTON_NOT_INTERESTED", 284, 293);
        PIN_FEEDBACK_REASON_BUTTON_OFFENSIVE = new ElementType("PIN_FEEDBACK_REASON_BUTTON_OFFENSIVE", 285, 294);
        PIN_FEEDBACK_REASON_BUTTON_SEEN_BEFORE = new ElementType("PIN_FEEDBACK_REASON_BUTTON_SEEN_BEFORE", 286, 295);
        PIN_FEEDBACK_BUTTON_REPORT_UNRELATED_PIN = new ElementType("PIN_FEEDBACK_BUTTON_REPORT_UNRELATED_PIN", 287, 973);
        PIN_FEEDBACK_BUTTON_REPORT_PIN = new ElementType("PIN_FEEDBACK_BUTTON_REPORT_PIN", 288, 974);
        PIN_FEEDBACK_BUTTON_INTEREST = new ElementType("PIN_FEEDBACK_BUTTON_INTEREST", 289, 976);
        PIN_FEEDBACK_BUTTON_SEARCH = new ElementType("PIN_FEEDBACK_BUTTON_SEARCH", 290, 1003);
        DIGEST_PIN = new ElementType("DIGEST_PIN", 291, 296);
        DIGEST_STORY_HEADER_BUTTON = new ElementType("DIGEST_STORY_HEADER_BUTTON", 292, 302);
        DIGEST_STORY_EXPAND_BUTTON = new ElementType("DIGEST_STORY_EXPAND_BUTTON", 293, 303);
        DIGEST_STORY_FEEDBACK_BUTTON = new ElementType("DIGEST_STORY_FEEDBACK_BUTTON", 294, 308);
        DIGEST_STORY_FOLLOW_BUTTON = new ElementType("DIGEST_STORY_FOLLOW_BUTTON", 295, 309);
        DIGEST_STORY_CUSTOM_ACTION_BUTTON = new ElementType("DIGEST_STORY_CUSTOM_ACTION_BUTTON", 296, 351);
        DIGEST_CAROUSEL_CONTENT_REP = new ElementType("DIGEST_CAROUSEL_CONTENT_REP", 297, 352);
        DIGEST_FEEDBACK_DIALOG_BUTTON_UNFOLLOW_BOARD = new ElementType("DIGEST_FEEDBACK_DIALOG_BUTTON_UNFOLLOW_BOARD", 298, 304);
        DIGEST_FEEDBACK_DIALOG_BUTTON_UNFOLLOW_INTEREST = new ElementType("DIGEST_FEEDBACK_DIALOG_BUTTON_UNFOLLOW_INTEREST", 299, 305);
        DIGEST_FEEDBACK_DIALOG_BUTTON_UNFOLLOW_USER = new ElementType("DIGEST_FEEDBACK_DIALOG_BUTTON_UNFOLLOW_USER", 300, 306);
        DIGEST_FEEDBACK_DIALOG_BUTTON_HIDE_THROUGH_BOARD_REC = new ElementType("DIGEST_FEEDBACK_DIALOG_BUTTON_HIDE_THROUGH_BOARD_REC", 301, 307);
        LOOKBOOK_TAG = new ElementType("LOOKBOOK_TAG", 302, 297);
        LOOKBOOK_PROFILE_IMAGE = new ElementType("LOOKBOOK_PROFILE_IMAGE", 303, 298);
        SEND_SOCIAL_BUTTON = new ElementType("SEND_SOCIAL_BUTTON", 304, 300);
        SHARE_SOCIAL_BUTTON = new ElementType("SHARE_SOCIAL_BUTTON", 305, 301);
        SAFARI_KEYCHAIN_USE_PASSWORD_BUTTON = new ElementType("SAFARI_KEYCHAIN_USE_PASSWORD_BUTTON", 306, 310);
        SAFARI_KEYCHAIN_NOT_NOW_BUTTON = new ElementType("SAFARI_KEYCHAIN_NOT_NOW_BUTTON", 307, 311);
        SIGNUP_TRENDING_PREVIEW_BUTTON = new ElementType("SIGNUP_TRENDING_PREVIEW_BUTTON", 308, 314);
        PIN_SHARE_MESSAGE = new ElementType("PIN_SHARE_MESSAGE", 309, 316);
        PIN_SHARE_WHATSAPP = new ElementType("PIN_SHARE_WHATSAPP", 310, 317);
        PIN_SHARE_FB_MESSENGER = new ElementType("PIN_SHARE_FB_MESSENGER", 311, 318);
        PIN_SHARE_FB_TIMELINE = new ElementType("PIN_SHARE_FB_TIMELINE", 312, 980);
        PIN_SHARE_THIRD_PARTY_EXTENSION = new ElementType("PIN_SHARE_THIRD_PARTY_EXTENSION", 313, 319);
        BOARD_SHARE_BUTTON = new ElementType("BOARD_SHARE_BUTTON", 314, 331);
        BOARD_SHARE_FACEBOOK_BUTTON = new ElementType("BOARD_SHARE_FACEBOOK_BUTTON", 315, 332);
        BOARD_SHARE_EMAIL_BUTTON = new ElementType("BOARD_SHARE_EMAIL_BUTTON", 316, 333);
        BOARD_SHARE_COPY_LINK_BUTTON = new ElementType("BOARD_SHARE_COPY_LINK_BUTTON", 317, 334);
        BOARD_SHARE_OTHER_BUTTON = new ElementType("BOARD_SHARE_OTHER_BUTTON", 318, 335);
        SEARCH_ACTION_SUGGESTION = new ElementType("SEARCH_ACTION_SUGGESTION", 319, 336);
        SEARCH_FILTER_SUGGESTION = new ElementType("SEARCH_FILTER_SUGGESTION", 320, 337);
        SEARCH_FILTER_DROPDOWNBUTTON = new ElementType("SEARCH_FILTER_DROPDOWNBUTTON", 321, 338);
        FLEXIBLE_NUX_LAUNCHER = new ElementType("FLEXIBLE_NUX_LAUNCHER", 322, 339);
        INTEREST_PIN_ANNOTATION = new ElementType("INTEREST_PIN_ANNOTATION", 323, 340);
        PREV_CLOSEUP_BUTTON = new ElementType("PREV_CLOSEUP_BUTTON", 324, 358);
        NEXT_CLOSEUP_BUTTON = new ElementType("NEXT_CLOSEUP_BUTTON", 325, 359);
        CLOSEUP_PINIT_SHORTCUT = new ElementType("CLOSEUP_PINIT_SHORTCUT", 326, 360);
        MOVE_PINS_BUTTON = new ElementType("MOVE_PINS_BUTTON", 327, 400);
        BULK_MOVE_PINS_BUTTON = new ElementType("BULK_MOVE_PINS_BUTTON", 328, 401);
        BULK_COPY_PINS_BUTTON = new ElementType("BULK_COPY_PINS_BUTTON", 329, 402);
        BULK_DELETE_PINS_BUTTON = new ElementType("BULK_DELETE_PINS_BUTTON", 330, 403);
        BULK_CANCEL_BUTTON = new ElementType("BULK_CANCEL_BUTTON", 331, 404);
        ADD_PIN_REP = new ElementType("ADD_PIN_REP", 332, 450);
        ADD_PIN_REP_UPLOAD = new ElementType("ADD_PIN_REP_UPLOAD", 333, 451);
        ADD_PIN_REP_SCRAPE = new ElementType("ADD_PIN_REP_SCRAPE", 334, 452);
        ADD_PIN_REP_BOOKMARKLET = new ElementType("ADD_PIN_REP_BOOKMARKLET", 335, 453);
        ADD_PIN_BUTTON_UPLOAD = new ElementType("ADD_PIN_BUTTON_UPLOAD", 336, 454);
        ADD_PIN_BUTTON_SCRAPE = new ElementType("ADD_PIN_BUTTON_SCRAPE", 337, 455);
        ADD_PIN_BUTTON_BOOKMARKLET = new ElementType("ADD_PIN_BUTTON_BOOKMARKLET", 338, 456);
        ADD_PIN_INSTALL_BOOKMARKLET = new ElementType("ADD_PIN_INSTALL_BOOKMARKLET", 339, 457);
        ADD_PIN_CANCEL_INSTALL_BOOKMARKLET = new ElementType("ADD_PIN_CANCEL_INSTALL_BOOKMARKLET", 340, 458);
        RICH_ACTION_BUTTON = new ElementType("RICH_ACTION_BUTTON", 341, 500);
        WEB_PIN_CREATE_EDIT_DESCRIPTION = new ElementType("WEB_PIN_CREATE_EDIT_DESCRIPTION", 342, 600);
        WEB_PIN_CREATE_CREATE_BOARD_NO_NAME = new ElementType("WEB_PIN_CREATE_CREATE_BOARD_NO_NAME", 343, 603);
        WEB_PIN_CREATE_CREATE_BOARD_NAME = new ElementType("WEB_PIN_CREATE_CREATE_BOARD_NAME", 344, 604);
        WEB_PIN_CREATE_FILTER_BOARDS_VIA_SEARCH = new ElementType("WEB_PIN_CREATE_FILTER_BOARDS_VIA_SEARCH", 345, 605);
        WEB_PIN_CREATE_BOARD_FILTER = new ElementType("WEB_PIN_CREATE_BOARD_FILTER", 346, 610);
        PINVITATIONAL_REQUEST_INVITE_SUBMITTED = new ElementType("PINVITATIONAL_REQUEST_INVITE_SUBMITTED", 347, 606);
        SEARCH_PRIVACY_LINK = new ElementType("SEARCH_PRIVACY_LINK", 348, 342);
        FIND_FRIENDS_BUTTON_ADDRESS_BOOK = new ElementType("FIND_FRIENDS_BUTTON_ADDRESS_BOOK", 349, 343);
        FIND_FRIENDS_BUTTON_FACEBOOK = new ElementType("FIND_FRIENDS_BUTTON_FACEBOOK", 350, 344);
        FIND_FRIENDS_BUTTON_TWITTER = new ElementType("FIND_FRIENDS_BUTTON_TWITTER", 351, 345);
        FIND_FRIENDS_BUTTON_MORE = new ElementType("FIND_FRIENDS_BUTTON_MORE", 352, 346);
        FIND_FRIENDS_BUTTON_WHATSAPP = new ElementType("FIND_FRIENDS_BUTTON_WHATSAPP", 353, 347);
        FIND_FRIENDS_BUTTON_FB_MESSENGER = new ElementType("FIND_FRIENDS_BUTTON_FB_MESSENGER", 354, 348);
        COMPOSE_EMAIL_INVITE_BUTTON = new ElementType("COMPOSE_EMAIL_INVITE_BUTTON", 355, 349);
        FIND_FRIENDS_BUTTON_LINE = new ElementType("FIND_FRIENDS_BUTTON_LINE", 356, 350);
        FIND_FRIENDS_PROFILE_BUTTON = new ElementType("FIND_FRIENDS_PROFILE_BUTTON", 357, 365);
        BRAND_SURVEY_DIALOG_YES_BUTTON = new ElementType("BRAND_SURVEY_DIALOG_YES_BUTTON", 358, 353);
        BRAND_SURVEY_DIALOG_LATER_BUTTON = new ElementType("BRAND_SURVEY_DIALOG_LATER_BUTTON", 359, 354);
        BRAND_SURVEY_DIALOG_NEVER_BUTTON = new ElementType("BRAND_SURVEY_DIALOG_NEVER_BUTTON", 360, 355);
        BRAND_SURVEY_DIALOG_BACKGROUND_DISMISS = new ElementType("BRAND_SURVEY_DIALOG_BACKGROUND_DISMISS", 361, 356);
        HASH_TAG = new ElementType("HASH_TAG", 362, 357);
        PIN_LINK_MODULE_ACTION_BUTTON = new ElementType("PIN_LINK_MODULE_ACTION_BUTTON", 363, 361);
        PIN_LINK_MODULE_DOMAIN_OWNER_PROFILE = new ElementType("PIN_LINK_MODULE_DOMAIN_OWNER_PROFILE", 364, 362);
        PIN_CLOSEUP_TRANSITION_IMAGE = new ElementType("PIN_CLOSEUP_TRANSITION_IMAGE", 365, 363);
        CARD_ATTRIBUTION_LINK = new ElementType("CARD_ATTRIBUTION_LINK", 366, 1047);
        BUILD_HOMEFEED_BUTTON = new ElementType("BUILD_HOMEFEED_BUTTON", 367, 364);
        SHARE_EXTENSION_PIN_IT_BUTTON = new ElementType("SHARE_EXTENSION_PIN_IT_BUTTON", 368, 700);
        SHARE_EXTENSION_IMAGE = new ElementType("SHARE_EXTENSION_IMAGE", 369, 701);
        SHARE_EXTENSION_PICK_BOARD_CELL = new ElementType("SHARE_EXTENSION_PICK_BOARD_CELL", 370, 702);
        SHARE_EXTENSION_BOARD_CELL = new ElementType("SHARE_EXTENSION_BOARD_CELL", 371, 703);
        SHARE_EXTENSION_RECENT_BOARD_CELL = new ElementType("SHARE_EXTENSION_RECENT_BOARD_CELL", 372, 720);
        SHARE_EXTENSION_ALL_BOARDS_BOARD = new ElementType("SHARE_EXTENSION_ALL_BOARDS_BOARD", 373, 721);
        SHARE_EXTENSION_CREATE_BOARD_CELL = new ElementType("SHARE_EXTENSION_CREATE_BOARD_CELL", 374, 722);
        SHARE_EXTENSION_EDIT_DESCRIPTION_CELL = new ElementType("SHARE_EXTENSION_EDIT_DESCRIPTION_CELL", 375, 723);
        SHARE_EXTENSION_CREATE_BOARD_BUTTON = new ElementType("SHARE_EXTENSION_CREATE_BOARD_BUTTON", 376, 724);
        SHARE_EXTENSION_UPSELL_PLUS_BUTTON = new ElementType("SHARE_EXTENSION_UPSELL_PLUS_BUTTON", 377, 725);
        AUTOCOMPLETE_SUGGESTION_LC1 = new ElementType("AUTOCOMPLETE_SUGGESTION_LC1", 378, 705);
        AUTOCOMPLETE_SUGGESTION_LC2 = new ElementType("AUTOCOMPLETE_SUGGESTION_LC2", 379, 706);
        PIN_FEEDBACK_DIALOG_BUTTON_PFY_STOP_RECS_FROM_THROUGH_PIN = new ElementType("PIN_FEEDBACK_DIALOG_BUTTON_PFY_STOP_RECS_FROM_THROUGH_PIN", 380, 707);
        PIN_FEEDBACK_DIALOG_BUTTON_PFY_STOP_RECS_FROM_THROUGH_INTEREST = new ElementType("PIN_FEEDBACK_DIALOG_BUTTON_PFY_STOP_RECS_FROM_THROUGH_INTEREST", 381, 708);
        SEARCH_QUERY_TYPO_CORRECTION = new ElementType("SEARCH_QUERY_TYPO_CORRECTION", 382, 709);
        TRENDING_QUERY = new ElementType("TRENDING_QUERY", 383, 710);
        MULTIOBJECT_PINNER_LOAD_MORE_BUTTON = new ElementType("MULTIOBJECT_PINNER_LOAD_MORE_BUTTON", 384, 711);
        MULTIOBJECT_BOARD_LOAD_MORE_BUTTON = new ElementType("MULTIOBJECT_BOARD_LOAD_MORE_BUTTON", 385, 712);
        ORDER_HISTORY_BUTTON = new ElementType("ORDER_HISTORY_BUTTON", 386, 800);
        PAYMENT_METHODS_BUTTON = new ElementType("PAYMENT_METHODS_BUTTON", 387, 801);
        SHIPPING_ADDRESSES_BUTTON = new ElementType("SHIPPING_ADDRESSES_BUTTON", 388, 802);
        BUYABLE_CLOSEUP_VARIANT_TEXT_CELL = new ElementType("BUYABLE_CLOSEUP_VARIANT_TEXT_CELL", 389, 803);
        BUYABLE_CLOSEUP_VARIANT_SWATCH_CELL = new ElementType("BUYABLE_CLOSEUP_VARIANT_SWATCH_CELL", 390, 804);
        BUYABLE_CLOSEUP_READ_MORE = new ElementType("BUYABLE_CLOSEUP_READ_MORE", 391, 805);
        BUYABLE_CLOSEUP_RETURN_POLICY = new ElementType("BUYABLE_CLOSEUP_RETURN_POLICY", 392, 806);
        BUYABLE_CHECKOUT_VARIANT_TABLE_CELL = new ElementType("BUYABLE_CHECKOUT_VARIANT_TABLE_CELL", 393, 807);
        BUYABLE_CHECKOUT_VARIANT_CIRCLE_CELL = new ElementType("BUYABLE_CHECKOUT_VARIANT_CIRCLE_CELL", 394, 808);
        BUYABLE_CHECKOUT_APPLE_PAY_BUTTON = new ElementType("BUYABLE_CHECKOUT_APPLE_PAY_BUTTON", 395, 809);
        BUYABLE_CHECKOUT_CREDIT_CARD_BUTTON = new ElementType("BUYABLE_CHECKOUT_CREDIT_CARD_BUTTON", 396, 810);
        BUYABLE_CHECKOUT_QUANTITY_FIELD = new ElementType("BUYABLE_CHECKOUT_QUANTITY_FIELD", 397, 811);
        BUYABLE_CHECKOUT_SUMMARY_SHIP_ADDRESS_CELL = new ElementType("BUYABLE_CHECKOUT_SUMMARY_SHIP_ADDRESS_CELL", 398, 812);
        BUYABLE_CHECKOUT_SUMMARY_SHIP_METHOD_CELL = new ElementType("BUYABLE_CHECKOUT_SUMMARY_SHIP_METHOD_CELL", 399, 813);
        BUYABLE_CHECKOUT_SUMMARY_PAYMENT_CELL = new ElementType("BUYABLE_CHECKOUT_SUMMARY_PAYMENT_CELL", 400, 814);
        BUYABLE_CHECKOUT_LEARN_MORE_BUTTON = new ElementType("BUYABLE_CHECKOUT_LEARN_MORE_BUTTON", 401, 815);
        BUYABLE_CHECKOUT_SUMMARY_PAY_BUTTON = new ElementType("BUYABLE_CHECKOUT_SUMMARY_PAY_BUTTON", 402, 816);
        BUYABLE_CHECKOUT_EDIT_BUTTON = new ElementType("BUYABLE_CHECKOUT_EDIT_BUTTON", 403, 817);
        BUYABLE_CHECKOUT_SAVE_BUTTON = new ElementType("BUYABLE_CHECKOUT_SAVE_BUTTON", 404, 818);
        BUYABLE_CHECKOUT_ERROR_DISMISS_BUTTON = new ElementType("BUYABLE_CHECKOUT_ERROR_DISMISS_BUTTON", 405, 819);
        BUYABLE_SHIPPING_ADDRESS_CELL = new ElementType("BUYABLE_SHIPPING_ADDRESS_CELL", 406, 820);
        BUYABLE_SHIPPING_ADDRESS_ADD_NEW_CELL = new ElementType("BUYABLE_SHIPPING_ADDRESS_ADD_NEW_CELL", 407, 821);
        BUYABLE_SHIPPING_ADDRESS_CONTACTS_BUTTON = new ElementType("BUYABLE_SHIPPING_ADDRESS_CONTACTS_BUTTON", 408, 822);
        BUYABLE_SHIPPING_ADDRESS_DELETE_BUTTON = new ElementType("BUYABLE_SHIPPING_ADDRESS_DELETE_BUTTON", 409, 823);
        BUYABLE_PAYMENT_CELL = new ElementType("BUYABLE_PAYMENT_CELL", 410, 824);
        BUYABLE_PAYMENT_ADD_NEW_CELL = new ElementType("BUYABLE_PAYMENT_ADD_NEW_CELL", 411, 825);
        BUYABLE_PAYMENT_BILLING_TOGGLE = new ElementType("BUYABLE_PAYMENT_BILLING_TOGGLE", 412, 826);
        BUYABLE_PAYMENT_CAMERA_BUTTON = new ElementType("BUYABLE_PAYMENT_CAMERA_BUTTON", 413, 827);
        BUYABLE_PAYMENT_BILLING_CONTACTS_BUTTON = new ElementType("BUYABLE_PAYMENT_BILLING_CONTACTS_BUTTON", 414, 828);
        BUYABLE_PAYMENT_BILLING_RECENTS_BUTTON = new ElementType("BUYABLE_PAYMENT_BILLING_RECENTS_BUTTON", 415, 829);
        BUYABLE_PAYMENT_DELETE_BUTTON = new ElementType("BUYABLE_PAYMENT_DELETE_BUTTON", 416, 830);
        BUYABLE_CONTACTS_ADDRESS_CELL = new ElementType("BUYABLE_CONTACTS_ADDRESS_CELL", 417, 831);
        BUYABLE_RECENT_ADDRESS_CELL = new ElementType("BUYABLE_RECENT_ADDRESS_CELL", 418, 832);
        BUYABLE_ORDER_HISTORY_CELL = new ElementType("BUYABLE_ORDER_HISTORY_CELL", 419, 833);
        BUYABLE_ORDER_DETAILS_VISIT_SELLER_BUTTON = new ElementType("BUYABLE_ORDER_DETAILS_VISIT_SELLER_BUTTON", 420, 834);
        BUYABLE_ORDER_DETAILS_CONTACT_SELLER_BUTTON = new ElementType("BUYABLE_ORDER_DETAILS_CONTACT_SELLER_BUTTON", 421, 835);
        BUYABLE_SETTINGS_PAYMENT_SAVE_BUTTON = new ElementType("BUYABLE_SETTINGS_PAYMENT_SAVE_BUTTON", 422, 836);
        BUYABLE_SETTINGS_ADDRESS_SAVE_BUTTON = new ElementType("BUYABLE_SETTINGS_ADDRESS_SAVE_BUTTON", 423, 837);
        BUYABLE_SHIPPING_METHOD_CELL = new ElementType("BUYABLE_SHIPPING_METHOD_CELL", 424, 838);
        COMMERCE_EDUCATION_DISMISS_BUTTON = new ElementType("COMMERCE_EDUCATION_DISMISS_BUTTON", 425, 839);
        COMMERCE_EDUCATION_SEARCH_TOPIC_BUTTON = new ElementType("COMMERCE_EDUCATION_SEARCH_TOPIC_BUTTON", 426, 840);
        BUYABLE_CATEGORY_ICON = new ElementType("BUYABLE_CATEGORY_ICON", 427, 841);
        COMMERCE_SHOP_MORE_BUTTON = new ElementType("COMMERCE_SHOP_MORE_BUTTON", 428, 843);
        API_ENVIRONMENTS_BUTTON = new ElementType("API_ENVIRONMENTS_BUTTON", 429, 844);
        SAVE_TABBAR_BUTTON = new ElementType("SAVE_TABBAR_BUTTON", 430, 900);
        SAVE_TRENDING_WEBSITE = new ElementType("SAVE_TRENDING_WEBSITE", 431, 901);
        SAVE_TRENDING_SEARCH = new ElementType("SAVE_TRENDING_SEARCH", 432, 902);
        SAVE_EXTENSION_UPSELL = new ElementType("SAVE_EXTENSION_UPSELL", 433, 903);
        SAVE_AUTOCOMPLETE_GOOGLE_SEARCH = new ElementType("SAVE_AUTOCOMPLETE_GOOGLE_SEARCH", 434, 904);
        SAVE_AUTOCOMPLETE_RECENTLY_VISITED = new ElementType("SAVE_AUTOCOMPLETE_RECENTLY_VISITED", 435, 905);
        SAVE_BROWSER_DRAWER = new ElementType("SAVE_BROWSER_DRAWER", 436, 906);
        SAVE_BROWSER_PINIT_BUTTON = new ElementType("SAVE_BROWSER_PINIT_BUTTON", 437, 907);
        SAVE_BROWSER_COPY_LINK_BUTTON = new ElementType("SAVE_BROWSER_COPY_LINK_BUTTON", 438, 908);
        SAVE_BROWSER_OPEN_IN_SAFARI_BUTTON = new ElementType("SAVE_BROWSER_OPEN_IN_SAFARI_BUTTON", 439, 909);
        PIN_SHARE_FBMESSENGER_BUTTON = new ElementType("PIN_SHARE_FBMESSENGER_BUTTON", 440, 950);
        PIN_SHARE_WHATSAPP_BUTTON = new ElementType("PIN_SHARE_WHATSAPP_BUTTON", 441, 951);
        PIN_SHARE_LINE_BUTTON = new ElementType("PIN_SHARE_LINE_BUTTON", 442, 952);
        PIN_SHARE_SMS_BUTTON = new ElementType("PIN_SHARE_SMS_BUTTON", 443, 953);
        PIN_SHARE_OTHER_APP_BUTTON = new ElementType("PIN_SHARE_OTHER_APP_BUTTON", 444, 954);
        BOARD_SHARE_TWITTER_BUTTON = new ElementType("BOARD_SHARE_TWITTER_BUTTON", 445, 955);
        BOARD_SHARE_WHATSAPP_BUTTON = new ElementType("BOARD_SHARE_WHATSAPP_BUTTON", 446, 956);
        BOARD_SHARE_FBMESSENGER_BUTTON = new ElementType("BOARD_SHARE_FBMESSENGER_BUTTON", 447, 957);
        BOARD_SHARE_LINE_BUTTON = new ElementType("BOARD_SHARE_LINE_BUTTON", 448, 958);
        BOARD_SHARE_SMS_BUTTON = new ElementType("BOARD_SHARE_SMS_BUTTON", 449, 959);
        BOARD_SHARE_OTHER_APP_BUTTON = new ElementType("BOARD_SHARE_OTHER_APP_BUTTON", 450, 960);
        COMMERCE_SEARCH_PRICE_FILTER_BLUE_BUTTON = new ElementType("COMMERCE_SEARCH_PRICE_FILTER_BLUE_BUTTON", 451, 961);
        COMMERCE_SEARCH_PRICE_FILTER_TAKEOVER = new ElementType("COMMERCE_SEARCH_PRICE_FILTER_TAKEOVER", 452, 962);
        COMMERCE_SEARCH_PRICE_FILTER_TAKEOVER_CLOSE_BUTTON = new ElementType("COMMERCE_SEARCH_PRICE_FILTER_TAKEOVER_CLOSE_BUTTON", 453, 963);
        COMMERCE_SEARCH_PRICE_FILTER_TAKEOVER_CLEAR_BUTTON = new ElementType("COMMERCE_SEARCH_PRICE_FILTER_TAKEOVER_CLEAR_BUTTON", 454, 964);
        HOMEFEED_BUILDER_BUTTON = new ElementType("HOMEFEED_BUILDER_BUTTON", 455, 965);
        HOMEFEED_BUILDER_INTEREST = new ElementType("HOMEFEED_BUILDER_INTEREST", 456, 969);
        HOMEFEED_BUILDER_SEE_MORE_BUTTON = new ElementType("HOMEFEED_BUILDER_SEE_MORE_BUTTON", 457, 970);
        HOMEFEED_BUILDER_PIN = new ElementType("HOMEFEED_BUILDER_PIN", 458, 971);
        HOMEFEED_BUILDER_SEARCH_RESULT = new ElementType("HOMEFEED_BUILDER_SEARCH_RESULT", 459, 972);
        HOMEFEED_BUILDER_GRID_ITEM = new ElementType("HOMEFEED_BUILDER_GRID_ITEM", 460, 975);
        HOMEFEED_BUILDER_FOLLOW_TOAST = new ElementType("HOMEFEED_BUILDER_FOLLOW_TOAST", 461, 1022);
        HOMEFEED_BUILDER_BOARD = new ElementType("HOMEFEED_BUILDER_BOARD", 462, 1025);
        HOMEFEED_BUILDER_USER = new ElementType("HOMEFEED_BUILDER_USER", 463, 1026);
        HOMEFEED_BUILDER_TOPIC_DISMISS_BUTTON = new ElementType("HOMEFEED_BUILDER_TOPIC_DISMISS_BUTTON", 464, 1029);
        NUJ_CREATE_BOARD_TITLE_BUTTON = new ElementType("NUJ_CREATE_BOARD_TITLE_BUTTON", 465, 966);
        SETTINGS_OFFLINE_BOARD_TOGGLE = new ElementType("SETTINGS_OFFLINE_BOARD_TOGGLE", 466, 967);
        SETTINGS_OFFLINE_BOARD_TOGGLE_ALL = new ElementType("SETTINGS_OFFLINE_BOARD_TOGGLE_ALL", 467, 968);
        BAD_LINK_BUTTON = new ElementType("BAD_LINK_BUTTON", 468, 977);
        GOOD_LINK_BUTTON = new ElementType("GOOD_LINK_BUTTON", 469, 978);
        LINK_FEEDBACK_OPTION_BUTTON = new ElementType("LINK_FEEDBACK_OPTION_BUTTON", 470, 979);
        PIN_FEEDBACK_DIALOG_BUTTON = new ElementType("PIN_FEEDBACK_DIALOG_BUTTON", 471, 981);
        PIN_HIDE_BUTTON = new ElementType("PIN_HIDE_BUTTON", 472, 982);
        REPIN_DIALOG_SUGGESTED_BOARD = new ElementType("REPIN_DIALOG_SUGGESTED_BOARD", 473, 983);
        PLACE_MODULE_BUTTON = new ElementType("PLACE_MODULE_BUTTON", 474, 984);
        PLACE_MODULE_MAP = new ElementType("PLACE_MODULE_MAP", 475, 985);
        PLACE_VIEW_DIRECTIONS_BUTTON = new ElementType("PLACE_VIEW_DIRECTIONS_BUTTON", 476, 986);
        PLACE_VIEW_PHONE_BUTTON = new ElementType("PLACE_VIEW_PHONE_BUTTON", 477, 987);
        PLACE_VIEW_SITE_BUTTON = new ElementType("PLACE_VIEW_SITE_BUTTON", 478, 988);
        PLACE_VIEW_LARGE_MAP = new ElementType("PLACE_VIEW_LARGE_MAP", 479, 989);
        PLACE_VIEW_SMALL_MAP = new ElementType("PLACE_VIEW_SMALL_MAP", 480, 990);
        PLACE_VIEW_MAP_MARKER = new ElementType("PLACE_VIEW_MAP_MARKER", 481, 991);
        PLACE_VIEW_MAP_CALLOUT = new ElementType("PLACE_VIEW_MAP_CALLOUT", 482, 992);
        PLACE_VIEW_DIRECTIONS_GOOGLE = new ElementType("PLACE_VIEW_DIRECTIONS_GOOGLE", 483, 993);
        PLACE_VIEW_DIRECTIONS_APPLE = new ElementType("PLACE_VIEW_DIRECTIONS_APPLE", 484, 994);
        DISCOVER_FRIEND_MERCHANDISING_CLICKTHROUGH = new ElementType("DISCOVER_FRIEND_MERCHANDISING_CLICKTHROUGH", 485, 996);
        INVITE_CONTACT = new ElementType("INVITE_CONTACT", 486, 997);
        SOCIAL_NETWORK_CONNECT_BUTTON = new ElementType("SOCIAL_NETWORK_CONNECT_BUTTON", 487, 998);
        PARTNER_PERFORMANCE_TOP_PIN = new ElementType("PARTNER_PERFORMANCE_TOP_PIN", 488, 999);
        PARTNER_PERFORMANCE_STATS = new ElementType("PARTNER_PERFORMANCE_STATS", 489, 1000);
        RECOMMENDATION_SECTION = new ElementType("RECOMMENDATION_SECTION", 490, 1001);
        ADD_FRIENDS_SECTION = new ElementType("ADD_FRIENDS_SECTION", 491, 1002);
        PW_RESET_SEND_EMAIL_BUTTON = new ElementType("PW_RESET_SEND_EMAIL_BUTTON", 492, 1004);
        PW_RESET_USER_SEARCH_BUTTON = new ElementType("PW_RESET_USER_SEARCH_BUTTON", 493, 1005);
        PW_RESET_DIRECT_EMAIL_BUTTON = new ElementType("PW_RESET_DIRECT_EMAIL_BUTTON", 494, 1006);
        PIN_FEEDBACK_REASON_BUTTON_PROMOTED = new ElementType("PIN_FEEDBACK_REASON_BUTTON_PROMOTED", 495, 1007);
        PIN_FEEDBACK_REASON_BUTTON_PFY = new ElementType("PIN_FEEDBACK_REASON_BUTTON_PFY", 496, 1008);
        PIN_FEEDBACK_DIALOG_BUTTON_UNFOLLOW_BOARD = new ElementType("PIN_FEEDBACK_DIALOG_BUTTON_UNFOLLOW_BOARD", 497, 1009);
        PIN_FEEDBACK_DIALOG_BUTTON_UNFOLLOW_USER = new ElementType("PIN_FEEDBACK_DIALOG_BUTTON_UNFOLLOW_USER", 498, 1010);
        PIN_FEEDBACK_DIALOG_BUTTON_UNFOLLOW_INTEREST = new ElementType("PIN_FEEDBACK_DIALOG_BUTTON_UNFOLLOW_INTEREST", 499, 1011);
        PIN_FEEDBACK_DIALOG_BUTTON_HIDE_PROMOTED_PIN = new ElementType("PIN_FEEDBACK_DIALOG_BUTTON_HIDE_PROMOTED_PIN", 500, 1012);
        PIN_FEEDBACK_DIALOG_BUTTON_REPORT_PIN = new ElementType("PIN_FEEDBACK_DIALOG_BUTTON_REPORT_PIN", 501, 1013);
        PIN_FEEDBACK_DIALOG_BUTTON_PIN_NOT_RELATED_TO_INTEREST = new ElementType("PIN_FEEDBACK_DIALOG_BUTTON_PIN_NOT_RELATED_TO_INTEREST", 502, 1014);
        PIN_FEEDBACK_DIALOG_BUTTON_PIN_NOT_RELATED_TO_SEARCH = new ElementType("PIN_FEEDBACK_DIALOG_BUTTON_PIN_NOT_RELATED_TO_SEARCH", 503, 1015);
        EDUCATION_TOOLTIP_CONFIRM_BUTTON = new ElementType("EDUCATION_TOOLTIP_CONFIRM_BUTTON", 504, 1016);
        EDUCATION_TOOLTIP_DISMISS_BUTTON = new ElementType("EDUCATION_TOOLTIP_DISMISS_BUTTON", 505, 1017);
        EDUCATION_TOOLTIP_SPOTLIGHT = new ElementType("EDUCATION_TOOLTIP_SPOTLIGHT", 506, 1018);
        EDUCATION_TOOLTIP_BACKGROUND = new ElementType("EDUCATION_TOOLTIP_BACKGROUND", 507, 1019);
        FPE_CREATE_FIRST_BOARD_SUGGESTED_TITLE_BUTTON = new ElementType("FPE_CREATE_FIRST_BOARD_SUGGESTED_TITLE_BUTTON", 508, 1020);
        LIBRARY_PROFILE_PIN_TOPIC = new ElementType("LIBRARY_PROFILE_PIN_TOPIC", 509, 1021);
        CUSTOM_GENDER_ON_HOVER = new ElementType("CUSTOM_GENDER_ON_HOVER", 510, 1023);
        CUSTOM_GENDER_SAVE_BUTTON = new ElementType("CUSTOM_GENDER_SAVE_BUTTON", 511, 1024);
        SIMILAR_BOARD_OPEN_BUTTON = new ElementType("SIMILAR_BOARD_OPEN_BUTTON", 512, 1027);
        SIMILAR_BOARD_FOLLOW_BUTTON = new ElementType("SIMILAR_BOARD_FOLLOW_BUTTON", 513, 1028);
        FLASHLIGHT_SEARCH_ICON = new ElementType("FLASHLIGHT_SEARCH_ICON", 514, 1031);
        FLASHLIGHT_ANNOTATION = new ElementType("FLASHLIGHT_ANNOTATION", 515, 1032);
        LIBRARY_SORT_BOARDS = new ElementType("LIBRARY_SORT_BOARDS", 516, 1033);
        LIBRARY_SORT_BOARDS_OPTION_CHANGED = new ElementType("LIBRARY_SORT_BOARDS_OPTION_CHANGED", 517, 1034);
        NUX_INTEREST_FOLLOW = new ElementType("NUX_INTEREST_FOLLOW", 518, 1035);
        NUX_INTEREST_UNFOLLOW = new ElementType("NUX_INTEREST_UNFOLLOW", 519, 1036);
        NUX_CONTINUE_BUTTON = new ElementType("NUX_CONTINUE_BUTTON", 520, 1037);
        NUX_USE_CASE_TITLE = new ElementType("NUX_USE_CASE_TITLE", 521, 1038);
        SUGGESTED_CONTACT_LIST_ITEM = new ElementType("SUGGESTED_CONTACT_LIST_ITEM", 522, 1039);
        SUGGESTED_CONTACT_LIST_SEARCH_ITEM = new ElementType("SUGGESTED_CONTACT_LIST_SEARCH_ITEM", 523, 1040);
        APP_LIST_ITEM = new ElementType("APP_LIST_ITEM", 524, 1041);
        MESSAGE_INPUT = new ElementType("MESSAGE_INPUT", 525, 1042);
        SEARCH_CONTACT_INPUT = new ElementType("SEARCH_CONTACT_INPUT", 526, 1043);
        SEARCH_CONTACT_LIST_ITEM = new ElementType("SEARCH_CONTACT_LIST_ITEM", 527, 1044);
        CONTEXTUAL_STORY_USER = new ElementType("CONTEXTUAL_STORY_USER", 528, 1048);
        CONTEXTUAL_STORY_TOPIC = new ElementType("CONTEXTUAL_STORY_TOPIC", 529, 1049);
        CONTEXTUAL_STORY_BOARD = new ElementType("CONTEXTUAL_STORY_BOARD", 530, 1050);
        CONTEXTUAL_STORY_SEARCH = new ElementType("CONTEXTUAL_STORY_SEARCH", 531, 1051);
        CONTEXTUAL_STORY_SEE_MORE = new ElementType("CONTEXTUAL_STORY_SEE_MORE", 532, 1052);
        PINNER_MODULE = new ElementType("PINNER_MODULE", 533, 1053);
        REGISTER_EMAIL_STEP = new ElementType("REGISTER_EMAIL_STEP", 534, 1056);
        REGISTER_PHONE_STEP = new ElementType("REGISTER_PHONE_STEP", 535, 1057);
        REGISTER_SMS_STEP = new ElementType("REGISTER_SMS_STEP", 536, 1058);
        REGISTER_PASSWORD_STEP = new ElementType("REGISTER_PASSWORD_STEP", 537, 1059);
        REGISTER_NAME_STEP = new ElementType("REGISTER_NAME_STEP", 538, 1060);
        REGISTER_AGE_STEP = new ElementType("REGISTER_AGE_STEP", 539, 1061);
        REGISTER_GENDER_STEP = new ElementType("REGISTER_GENDER_STEP", 540, 1062);
        STERLING_NAV_PROMOTE_BUTTON = new ElementType("STERLING_NAV_PROMOTE_BUTTON", 541, 10000);
        STERLING_CAMPAIGN_OBJECTIVE_ROW = new ElementType("STERLING_CAMPAIGN_OBJECTIVE_ROW", 542, 10050);
        STERLING_PICK_A_PIN_BUTTON = new ElementType("STERLING_PICK_A_PIN_BUTTON", 543, 10051);
        STERLING_PICK_A_PIN_CLICK_MASK = new ElementType("STERLING_PICK_A_PIN_CLICK_MASK", 544, 10001);
        STERLING_ALL_PINS_BUTTON = new ElementType("STERLING_ALL_PINS_BUTTON", 545, 10002);
        STERLING_30_DAY_MOST_CLICKED_BUTTON = new ElementType("STERLING_30_DAY_MOST_CLICKED_BUTTON", 546, 10003);
        STERLING_30_DAY_MOST_REPINNED_BUTTON = new ElementType("STERLING_30_DAY_MOST_REPINNED_BUTTON", 547, 10004);
        STERLING_PICK_A_PIN_SEARCH_INPUT = new ElementType("STERLING_PICK_A_PIN_SEARCH_INPUT", 548, 10005);
        STERLING_IMPORT_TERMS_BUTTON = new ElementType("STERLING_IMPORT_TERMS_BUTTON", 549, 10006);
        STERLING_ADD_TERMS_BUTTON = new ElementType("STERLING_ADD_TERMS_BUTTON", 550, 10007);
        STERLING_TERMS_DELIMITER_DROPDOWN_LINK = new ElementType("STERLING_TERMS_DELIMITER_DROPDOWN_LINK", 551, 10008);
        STERLING_TERMS_DELIMITER_DROPDOWN_ITEM = new ElementType("STERLING_TERMS_DELIMITER_DROPDOWN_ITEM", 552, 10009);
        STERLING_DEFAULT_TERM = new ElementType("STERLING_DEFAULT_TERM", 553, 10010);
        STERLING_TERM_SEARCH_INPUT = new ElementType("STERLING_TERM_SEARCH_INPUT", 554, 10011);
        STERLING_TERM_SEARCH_INPUT_CLEAR = new ElementType("STERLING_TERM_SEARCH_INPUT_CLEAR", 555, 10012);
        STERLING_ADD_ALL_SUGGESTED_AND_RELATED_TERMS_BUTTON = new ElementType("STERLING_ADD_ALL_SUGGESTED_AND_RELATED_TERMS_BUTTON", 556, 10013);
        STERLING_SUGGESTED_TERM_TOKEN = new ElementType("STERLING_SUGGESTED_TERM_TOKEN", 557, 10014);
        STERLING_RELATED_TERM_TOKEN = new ElementType("STERLING_RELATED_TERM_TOKEN", 558, 10015);
        STERLING_ADD_ALL_RELATED_TERMS_BUTTON = new ElementType("STERLING_ADD_ALL_RELATED_TERMS_BUTTON", 559, 10016);
        STERLING_TARGETING_TYPE_RESET = new ElementType("STERLING_TARGETING_TYPE_RESET", 560, 10017);
        STERLING_PROMOTE_BUTTON = new ElementType("STERLING_PROMOTE_BUTTON", 561, 10018);
        STERLING_SETUP_BILLING_BUTTON = new ElementType("STERLING_SETUP_BILLING_BUTTON", 562, 10019);
        STERLING_ADS_TOS_CHECKBOX = new ElementType("STERLING_ADS_TOS_CHECKBOX", 563, 10020);
        STERLING_BILLING_SUBMIT_BUTTON = new ElementType("STERLING_BILLING_SUBMIT_BUTTON", 564, 10021);
        STERLING_BID_INPUT = new ElementType("STERLING_BID_INPUT", 565, 10060);
        STERLING_HOME_LINK = new ElementType("STERLING_HOME_LINK", 566, 10022);
        STERLING_OBJECTIVE_DASHBOARD_LINK = new ElementType("STERLING_OBJECTIVE_DASHBOARD_LINK", 567, 10023);
        STERLING_CAMPAIGN_DASHBOARD_LINK = new ElementType("STERLING_CAMPAIGN_DASHBOARD_LINK", 568, 10024);
        STERLING_CAMPAIGN_EDIT_BUTTON = new ElementType("STERLING_CAMPAIGN_EDIT_BUTTON", 569, 10025);
        STERLING_PIN_PROMOTION_EDIT_BUTTON = new ElementType("STERLING_PIN_PROMOTION_EDIT_BUTTON", 570, 10026);
        STERLING_PIN_PROMOTION_PIN_LINK = new ElementType("STERLING_PIN_PROMOTION_PIN_LINK", 571, 10027);
        STERLING_EXPORT_DATA_BUTTON = new ElementType("STERLING_EXPORT_DATA_BUTTON", 572, 10028);
        STERLING_DATE_PICKER_DROPDOWN_BUTTON = new ElementType("STERLING_DATE_PICKER_DROPDOWN_BUTTON", 573, 10029);
        STERLING_DATE_PICKER_QUICK_SELECT_BUTTON = new ElementType("STERLING_DATE_PICKER_QUICK_SELECT_BUTTON", 574, 10030);
        STERLING_DATE_PICKER_NATIVE_CONTROL = new ElementType("STERLING_DATE_PICKER_NATIVE_CONTROL", 575, 10046);
        STERLING_OVERVIEW_TAB = new ElementType("STERLING_OVERVIEW_TAB", 576, 10031);
        STERLING_ACTIVITY_TAB = new ElementType("STERLING_ACTIVITY_TAB", 577, 10032);
        STERLING_SPEND_TAB = new ElementType("STERLING_SPEND_TAB", 578, 10033);
        STERLING_GRAPH_SERIES_DROPDOWN_BUTTON = new ElementType("STERLING_GRAPH_SERIES_DROPDOWN_BUTTON", 579, 10034);
        STERLING_GRAPH_SERIES_DROPDOWN_ITEM = new ElementType("STERLING_GRAPH_SERIES_DROPDOWN_ITEM", 580, 10035);
        STERLING_VIEW_ALL_BUTTON = new ElementType("STERLING_VIEW_ALL_BUTTON", 581, 10036);
        STERLING_OBJECTIVE_SUMMARY_STATS_ROW = new ElementType("STERLING_OBJECTIVE_SUMMARY_STATS_ROW", 582, 10045);
        STERLING_PROMOTED_PIN_PERFORMANCE_TABLE_ROW = new ElementType("STERLING_PROMOTED_PIN_PERFORMANCE_TABLE_ROW", 583, 10037);
        STERLING_DOWNLOAD_BUTTON = new ElementType("STERLING_DOWNLOAD_BUTTON", 584, 10038);
        STERLING_CONVERSION_TAG_LEARN_MORE_LINK = new ElementType("STERLING_CONVERSION_TAG_LEARN_MORE_LINK", 585, 10039);
        STERLING_CREATE_TAG_BUTTON = new ElementType("STERLING_CREATE_TAG_BUTTON", 586, 10040);
        STERLING_CREATE_TAG_LINK = new ElementType("STERLING_CREATE_TAG_LINK", 587, 10041);
        STERLING_COPY_CODE_BUTTON = new ElementType("STERLING_COPY_CODE_BUTTON", 588, 10042);
        STERLING_EDIT_TAG_BUTTON = new ElementType("STERLING_EDIT_TAG_BUTTON", 589, 10043);
        STERLING_DELETE_TAG_BUTTON = new ElementType("STERLING_DELETE_TAG_BUTTON", 590, 10044);
        STERLING_NAV_REPORTS_LINK = new ElementType("STERLING_NAV_REPORTS_LINK", 591, 10047);
        STERLING_NAV_TOOLS_LINK = new ElementType("STERLING_NAV_TOOLS_LINK", 592, 10048);
        STERLING_NAV_ANALYTICS_LINK = new ElementType("STERLING_NAV_ANALYTICS_LINK", 593, 10049);
        STERLING_NAV_AWARENESS_CAMPAIGNS_LINK = new ElementType("STERLING_NAV_AWARENESS_CAMPAIGNS_LINK", 594, 10052);
        STERLING_NAV_ENGAGEMENT_CAMPAIGNS_LINK = new ElementType("STERLING_NAV_ENGAGEMENT_CAMPAIGNS_LINK", 595, 10053);
        STERLING_NAV_TRAFFIC_CAMPAIGNS_LINK = new ElementType("STERLING_NAV_TRAFFIC_CAMPAIGNS_LINK", 596, 10054);
        STERLING_NAV_RECENT_CAMPAIGNS_LINK = new ElementType("STERLING_NAV_RECENT_CAMPAIGNS_LINK", 597, 10055);
        STERLING_NAV_RECENT_CAMPAIGN_LINK = new ElementType("STERLING_NAV_RECENT_CAMPAIGN_LINK", 598, 10056);
        STERLING_NAV_BILLING_LINK = new ElementType("STERLING_NAV_BILLING_LINK", 599, 10057);
        STERLING_NAV_CONVERSION_TRACKING_LINK = new ElementType("STERLING_NAV_CONVERSION_TRACKING_LINK", 600, 10058);
        STERLING_NAV_CINEMATIC_PIN_LINK = new ElementType("STERLING_NAV_CINEMATIC_PIN_LINK", 601, 10059);
        STERLING_BULK_EDITOR_CREATE_BUTTON = new ElementType("STERLING_BULK_EDITOR_CREATE_BUTTON", 602, 10120);
        STERLING_BULK_EDITOR_EDIT_BUTTON = new ElementType("STERLING_BULK_EDITOR_EDIT_BUTTON", 603, 10121);
        STERLING_BULK_UPLOAD_CREATE_BUTTON = new ElementType("STERLING_BULK_UPLOAD_CREATE_BUTTON", 604, 10122);
        STERLING_BULK_UPLOAD_CANCEL_BUTTON = new ElementType("STERLING_BULK_UPLOAD_CANCEL_BUTTON", 605, 10123);
        STERLING_BULK_REVIEW_SUBMIT_BUTTON = new ElementType("STERLING_BULK_REVIEW_SUBMIT_BUTTON", 606, 10124);
        STERLING_BULK_REVIEW_FIX_BUTTON = new ElementType("STERLING_BULK_REVIEW_FIX_BUTTON", 607, 10125);
        STERLING_BULK_REVIEW_BACK_BUTTON = new ElementType("STERLING_BULK_REVIEW_BACK_BUTTON", 608, 10126);
        STERLING_BULK_REVIEW_CANCEL_BUTTON = new ElementType("STERLING_BULK_REVIEW_CANCEL_BUTTON", 609, 10127);
        CAMPBELL_NAV_HOMEFEED_BUTTON = new ElementType("CAMPBELL_NAV_HOMEFEED_BUTTON", 610, 10061);
        CAMPBELL_NAV_SEARCH_BAR = new ElementType("CAMPBELL_NAV_SEARCH_BAR", 611, 10062);
        CAMPBELL_NAV_CATEGORIES_BUTTON = new ElementType("CAMPBELL_NAV_CATEGORIES_BUTTON", 612, 10063);
        CAMPBELL_NAV_ADD_PIN_BUTTON = new ElementType("CAMPBELL_NAV_ADD_PIN_BUTTON", 613, 10064);
        CAMPBELL_NAV_NOTIFICATIONS_BUTTON = new ElementType("CAMPBELL_NAV_NOTIFICATIONS_BUTTON", 614, 10065);
        CAMPBELL_NAV_USER_MENU_BUTTON = new ElementType("CAMPBELL_NAV_USER_MENU_BUTTON", 615, 10066);
        CAMPBELL_NAV_DRAWER_OPEN_BUTTON = new ElementType("CAMPBELL_NAV_DRAWER_OPEN_BUTTON", 616, 10067);
        CAMPBELL_NAV_DRAWER_CLOSE_BUTTON = new ElementType("CAMPBELL_NAV_DRAWER_CLOSE_BUTTON", 617, 10068);
        CAMPBELL_NAV_DRAWER_CLOSE_GREY_PAGE = new ElementType("CAMPBELL_NAV_DRAWER_CLOSE_GREY_PAGE", 618, 10069);
        CAMPBELL_NAV_DRAWER_HOMEFEED_LINK = new ElementType("CAMPBELL_NAV_DRAWER_HOMEFEED_LINK", 619, 10070);
        CAMPBELL_NAV_DRAWER_ANALYTICS_LINK = new ElementType("CAMPBELL_NAV_DRAWER_ANALYTICS_LINK", 620, 10071);
        CAMPBELL_NAV_DRAWER_ADS_MANAGER_LINK = new ElementType("CAMPBELL_NAV_DRAWER_ADS_MANAGER_LINK", 621, 10072);
        CAMPBELL_NAV_DRAWER_PINS_FROM_WEBSITE_LINK = new ElementType("CAMPBELL_NAV_DRAWER_PINS_FROM_WEBSITE_LINK", 622, 10073);
        CAMPBELL_NAV_DRAWER_UPLOAD_FROM_COMPUTER_LINK = new ElementType("CAMPBELL_NAV_DRAWER_UPLOAD_FROM_COMPUTER_LINK", 623, 10074);
        CAMPBELL_NAV_DRAWER_CREATE_AD_LINK = new ElementType("CAMPBELL_NAV_DRAWER_CREATE_AD_LINK", 624, 10075);
        CAMPBELL_NAV_DRAWER_PIN_IT_BUTTON_LINK = new ElementType("CAMPBELL_NAV_DRAWER_PIN_IT_BUTTON_LINK", 625, 10076);
        CAMPBELL_NAV_DRAWER_RICH_PINS_LINK = new ElementType("CAMPBELL_NAV_DRAWER_RICH_PINS_LINK", 626, 10077);
        CAMPBELL_NAV_DRAWER_WEBSITE_CONFIRMATION_LINK = new ElementType("CAMPBELL_NAV_DRAWER_WEBSITE_CONFIRMATION_LINK", 627, 10078);
        CAMPBELL_NAV_DRAWER_CASE_STUDIES_LINK = new ElementType("CAMPBELL_NAV_DRAWER_CASE_STUDIES_LINK", 628, 10079);
        CAMPBELL_NAV_DRAWER_HOW_TO_GUIDES_LINK = new ElementType("CAMPBELL_NAV_DRAWER_HOW_TO_GUIDES_LINK", 629, 10080);
        CAMPBELL_NAV_DRAWER_DEVELOPER_DOCS_LINK = new ElementType("CAMPBELL_NAV_DRAWER_DEVELOPER_DOCS_LINK", 630, 10081);
        CAMPBELL_NAV_DRAWER_HELP_CENTER_LINK = new ElementType("CAMPBELL_NAV_DRAWER_HELP_CENTER_LINK", 631, 10082);
        CAMPBELL_NAV_ADS_MANAGER_BUTTON = new ElementType("CAMPBELL_NAV_ADS_MANAGER_BUTTON", 632, 10083);
        CAMPBELL_NAV_ADS_OVERVIEW_LINK = new ElementType("CAMPBELL_NAV_ADS_OVERVIEW_LINK", 633, 10084);
        CAMPBELL_NAV_ADS_TOOLS_LINK = new ElementType("CAMPBELL_NAV_ADS_TOOLS_LINK", 634, 10085);
        CAMPBELL_NAV_ADS_ENGAGEMENT_LINK = new ElementType("CAMPBELL_NAV_ADS_ENGAGEMENT_LINK", 635, 10086);
        CAMPBELL_NAV_ADS_TRAFFIC_LINK = new ElementType("CAMPBELL_NAV_ADS_TRAFFIC_LINK", 636, 10087);
        CAMPBELL_NAV_ADS_BUYABLE_LINK = new ElementType("CAMPBELL_NAV_ADS_BUYABLE_LINK", 637, 10088);
        CAMPBELL_NAV_ADS_AWARENESS_LINK = new ElementType("CAMPBELL_NAV_ADS_AWARENESS_LINK", 638, 10089);
        CAMPBELL_NAV_ADS_BULK_EDITOR_LINK = new ElementType("CAMPBELL_NAV_ADS_BULK_EDITOR_LINK", 639, 10090);
        CAMPBELL_NAV_ADS_CONVERSION_TRACKING_LINK = new ElementType("CAMPBELL_NAV_ADS_CONVERSION_TRACKING_LINK", 640, 10091);
        CAMPBELL_NAV_ADS_CINEMATIC_PIN_LINK = new ElementType("CAMPBELL_NAV_ADS_CINEMATIC_PIN_LINK", 641, 10092);
        CAMPBELL_NAV_ANALYTICS_BUTTON = new ElementType("CAMPBELL_NAV_ANALYTICS_BUTTON", 642, 10093);
        CAMPBELL_NAV_ANALYTICS_OVERVIEW_LINK = new ElementType("CAMPBELL_NAV_ANALYTICS_OVERVIEW_LINK", 643, 10094);
        CAMPBELL_NAV_PROFILE_LINK = new ElementType("CAMPBELL_NAV_PROFILE_LINK", 644, 10095);
        CAMPBELL_NAV_AUDIENCE_LINK = new ElementType("CAMPBELL_NAV_AUDIENCE_LINK", 645, 10096);
        CAMPBELL_NAV_WEBSITE_LINK = new ElementType("CAMPBELL_NAV_WEBSITE_LINK", 646, 10097);
        CAMPBELL_NAV_ADD_PIN_FROM_WEB_LINK = new ElementType("CAMPBELL_NAV_ADD_PIN_FROM_WEB_LINK", 647, 10098);
        CAMPBELL_NAV_ADD_PIN_UPLOAD = new ElementType("CAMPBELL_NAV_ADD_PIN_UPLOAD", 648, 10099);
        CAMPBELL_NAV_ADD_PIN_CREATE_AD = new ElementType("CAMPBELL_NAV_ADD_PIN_CREATE_AD", 649, 10100);
        CAMPBELL_NAV_USER_MENU_PROFILE_LINK = new ElementType("CAMPBELL_NAV_USER_MENU_PROFILE_LINK", 650, 10101);
        CAMPBELL_NAV_USER_MENU_SETTINGS_LINK = new ElementType("CAMPBELL_NAV_USER_MENU_SETTINGS_LINK", 651, 10102);
        CAMPBELL_NAV_USER_MENU_BILLING_LINK = new ElementType("CAMPBELL_NAV_USER_MENU_BILLING_LINK", 652, 10103);
        CAMPBELL_NAV_USER_MENU_HELP_CENTER_LINK = new ElementType("CAMPBELL_NAV_USER_MENU_HELP_CENTER_LINK", 653, 10104);
        CAMPBELL_NAV_USER_MENU_LOGOUT_LINK = new ElementType("CAMPBELL_NAV_USER_MENU_LOGOUT_LINK", 654, 10105);
        $VALUES = (new ElementType[] {
            PIN_REPIN_BUTTON, PIN_LIKE_BUTTON, PIN_COMMENT_BUTTON, PIN_EDIT_BUTTON, PIN_SHARE_BUTTON, PIN_CAPTION_COMMENT, PIN_BOARD, PIN_BOARD_FOLLOW, PIN_BOARD_PIN, PIN_ORIGINAL_BOARD, 
            PIN_ORIGINAL_BOARD_FOLLOW, PIN_ORIGINAL_BOARD_PIN, PIN_VIA_PIN, PIN_VIA, PIN_RELATED_PIN, PIN_INTEREST, PIN_MORE_ACTIVITY, PIN_SAVED_BY, PIN_ACTIVITY_LIKE, SUGGESTED_USER, 
            REMOVE_SUGGESTED_USER_BUTTON, NEWS_FEED_PIN, NEWS_FEED_USER, REPIN_SUGGESTED_BOARD, PIN_UPLOAD_BUTTON, LOGOUT_BUTTON, FOLLOW_ALL_USERS_BUTTON, FACEBOOK_TIMELINE_CONNECT, BOARD_CREATE, BOARD_CREATE_SUGGESTED, 
            ANALYTICS_BUTTON, PIN_DOMAIN, PIN_USER, PIN_ATTRIBUTION, PIN_LIKER, PIN_PINNED_TO, LOGIN_BUTTON, SIGNUP_BUTTON, RETRY_BUTTON, RESET_BUTTON, 
            BACK_BUTTON, PIN_SOURCE_IMAGE, BOARD_COVER, BOARD_FOLLOW, CATEGORY_ICON, PINPICKS_ICON, NEWS_FEED_BOARD, PROFILE_BUTTON, FOLLOWING_BUTTON, FOLLOWERS_BUTTON, 
            SEARCH_BUTTON, CREATE_BUTTON, REFRESH_BUTTON, PIN_SHARE, PIN_REPORT_BUTTON, PIN_SHARE_TWITTER_BUTTON, PIN_SHARE_FACEBOOK_BUTTON, PIN_SHARE_FACEBOOK_PINLIST_OTHER_PIN_BUTTON, PIN_SHARE_FACEBOOK_PINLIST_TRENDING_STORY, PIN_SHARE_EMAIL_BUTTON, 
            PIN_READING_LIST_BUTTON, PIN_SAVE_BUTTON, PIN_DELETE_BUTTON, PIN_SEND_BUTTON, BOARD_DELETE_BUTTON, BOARD_LEAVE_BUTTON, BOARD_EDIT_BUTTON, BOARD_CATEGORY, BOARD_NAME, BOARD_SECRET, 
            CAMERA_BUTTON, GALLERY_BUTTON, FIND_IMAGES_BUTTON, SETTINGS_BUTTON, FINDFRIENDS_BUTTON, INVITE_BUTTON, SUPPORT_BUTTON, TOS_BUTTON, USER_FOLLOW, PROFILE_IMAGE, 
            PROFILE_URL, PROFILE_FACEBOOK, PROFILE_TWITTER, BOARD_PICKER, FACEBOOK_CONNECT, TWITTER_CONNECT, RAKUTEN_CONNECT, GPLUS_CONNECT, PIN_SUBMIT, USER_FEED_FOLLOW, 
            CANCEL_BUTTON, MENU_BUTTON, CLOSE_BUTTON, DONE_BUTTON, NEWS_BUTTON, EXPLORE_BUTTON, BROWSER_BUTTON, USER_FLAG_BUTTON, USER_LIKES_BUTTON, USER_PINS_BUTTON, 
            USER_BOARDS_BUTTON, USER_ABOUT_BUTTON, USER_EDIT_BUTTON, NEXT_BUTTON, ADD_MESSAGE_BUTTON, COPY_LINK_BUTTON, CLIPBOARD_BUTTON, CLEAR_HISTORY_BUTTON, SEND_BUTTON, NAVIGATION_HOME_BUTTON, 
            NAVIGATION_DISCOVER_BUTTON, PHOTOS_BUTTON, STORY_PLUS_ICON, STORY_TITLE, STORY_END_CELL, STORY_FEATURED_ITEM, DECLINE_BUTTON, USER_BLOCK_BUTTON, USER_UNBLOCK_BUTTON, USER_REPORT_BUTTON, 
            BOARD_CREATE_SECRET, USER_ABOUT_EDIT_BUTTON, USER_URL_EDIT_BUTTON, BOARD_DESCRIPTION, EDUCATION_TARGET, BROWSER_WEB_IMAGE, AUTOCOMPLETE_SUGGESTION, FIND_MORE_BOARDS_BUTTON, GET_STARTED_BUTTON, REMOVE_BUTTON, 
            WHO_CAN_PIN_BUTTON, PIN_RICH_PIN_ACTION_BUTTON, USER_RECENT_CONTACT, USER_LIST_USER, UNDO_BUTTON, CLEAR_SEARCHES_BUTTON, CLEAR_CONTACTS_BUTTON, PIN_DESCRIPTION, EDIT_HOME_FEED_BUTTON, FOLLOW_BOARDS_BUTTON, 
            UNFOLLOW_BOARDS_BUTTON, DUPLICATE_PIN_WARNING, SUGGESTED_EMAIL, USERNAME_BUTTON, EMAIL_BUTTON, COUNTRY_BUTTON, PUSH_NOTIFICATIONS_BUTTON, UPDATE_BUTTON, CATEGORY_RECENT, LANGUAGE_BUTTON, 
            GENDER_BUTTON, PERSONALIZED_RECOMMENDATIONS_BUTTON, SEARCH_PRIVACY_BUTTON, CHANGE_PASSWORD_BUTTON, SHOW_PASSWORD_BUTTON, SAVE_USER_SETTINGS_BUTTON, RIBBON_BUTTON, USER_LIST_CONTACT, USER_FEED_INVITE_EMAIL, USER_FEED_INVITE_SMS, 
            USER_FEED_INVITE_CUSTOM_EMAIL, NAME_BUTTON, APP_ICON, USER_ICON, NOTIFICATIONS_ICON, SEE_OTHER_PINS_BUTTON, MORE_PINS_BUTTON, PIN_PROMOTED_INFO, PROMOTED_OK_BUTTON, LINK_OUT_BUTTON, 
            PFY_REASON_BUTTON, INVITE_DELETE_BUTTON, FEED_SUBCATEGORY, DISCOVER_TRENDING_CATEGORY, MAP_ANNOTATION, MAP_SEE_ON_MAP_BUTTON, MAP_DIRECTIONS_BUTTON, MAP_ADD_BUTTON, PLACES_BUTTON, LOCATION_BUTTON, 
            PLACES_LIST_PLACE, PHONE_BUTTON, WEBSITE_BUTTON, PLACE_IMAGE, MAP_PIN_ICON, ADD_PLACE_BUTTON, PLACE_PICKER_CREATE, PLACE_PICKER_IMAGE, REMOVE_PLACE_BUTTON, MAP_TOGGLE_BUTTON, 
            COLLABORATOR_TEXT, SEND_INVITE_BUTTON, INVITE_ALL_TOGGLE, REPINS_BUTTON, LIKES_BUTTON, PIN_FLAG_BUTTON, DOMAIN_URL, LOGO, SEE_MORE_BUTTON, BOARD_RELATED_BOARD, 
            COMMENTS_BUTTON, SEARCH_RELATED_QUERY, SEARCH_RELATED_CATEGORY, BUY_BUTTON, FACEBOOK_INVITE_BUTTON, GPLUS_INVITE_BUTTON, SEND_TO_PINNER_BUTTON, APP_RATING_ATTEMPT_BUTTON, APP_RATING_DECLINE_BUTTON, APP_RATING_REMIND_BUTTON, 
            SEND_SMS_INVITE_BUTTON, COMPOSE_SMS_INVITE_BUTTON, FLOWED_INTEREST, REPIN_ADD_PLACE_BUTTON, REPIN_EDIT_PLACE_BUTTON, RELATED_RICH_PIN_BUTTON, BULK_INVITER_BUTTON, RELATED_INTEREST, SINGLE_PIN_POPOVER, NEWS_FEED_QUESTION, 
            NEWS_FEED_ANSWER, SEARCH_PINS_BUTTON, SEARCH_BOARDS_BUTTON, SEARCH_PINNERS_BUTTON, SEARCH_MY_PINS_BUTTON, SEARCH_PLACES_BUTTON, SEARCH_BUYABLE_PINS_BUTTON, SEARCH_TOKEN, SEARCH_GUIDE_SUGGESTION, SEARCH_BOX_TEXT_INPUT, 
            SEARCH_BOX_ADD_TOKEN_BUTTON, ADD_INTEREST_BUTTON, SUGGEST_INTEREST_BUTTON, EDUCATION_GUIDED_SEARCH_SUGGESTION, EDUCATION_GUIDED_SEARCH_COMPLETE_BUTTON, VISUAL_OBJECT_BUTTON, VISUAL_SEARCH_BUTTON, NAVIGATION_LOGO_BUTTON, MORE_INFO_BUTTON, YOUR_PROFILE_BUTTON, 
            YOUR_SETTINGS_BUTTON, FIND_FRIENDS_BUTTON, CREATE_BOARD_BUTTON, ADD_PIN_FROM_WEBSITE_BUTTON, UPLOAD_PIN_BUTTON, NEWS_FEED_REPLY, NEWS_FEED_ACTOR_IMAGE, NEWS_FEED_ACTOR_LABEL, RECENT_SEARCH_SUGGESTION, SEARCH_ALL_WITH_QUERY, 
            INTEREST_SUGGESTION, INTEREST_FOLLOW, STORIES_FEED_LARGE_STORY, STORIES_FEED_SMALL_STORY, STORIES_FEED_ACTOR, STORIES_FEED_RELATED_OBJECT, STORIES_FEED_RELATED_MORE_CELL, STORIES_FEED_ACTOR_IMAGE, DISCOVER_FEATURED_ITEM, FOLLOWING_INTERESTS_BUTTON, 
            FOLLOWING_PINNERS_BUTTON, FOLLOWING_BOARDS_BUTTON, HELP_PULSE, HELP_BUTTON, HELP_FLYOUT_BUTTON, CONVERSATION_NEW_BUTTON, CONVERSATION_CREATE_BUTTON, CONVERSATION_LIST_ITEM, CONVERSATION_INBOX_BUTTON, GET_EXTENSION_BUTTON, 
            INSTALL_EXTENSION_BUTTON, CANCEL_EXTENSION_INSTALL_BUTTON, HELP_CENTER_BUTTON, PIN_CELL_BUTTON_PFY_PIN_SOURCE, PIN_CELL_BUTTON_PROMOTED_PIN_SOURCE, PIN_FEEDBACK_BUTTON_PFY, PIN_FEEDBACK_BUTTON_PROMOTED, PIN_FEEDBACK_BUTTON_STATE_REASON_PFY, PIN_FEEDBACK_BUTTON_STATE_REASON_PROMOTED, PIN_FEEDBACK_DIALOG_BUTTON_HIDE_PIN_PFY, 
            PIN_FEEDBACK_DIALOG_BUTTON_PFY_STOP_RECS_FROM_THROUGH_BOARD, PIN_FEEDBACK_DIALOG_BUTTON_LEARN_MORE_PROMOTED, PIN_FEEDBACK_DIALOG_BUTTON_HIDE_PIN_PROMOTED, PIN_FEEDBACK_DIALOG_BUTTON_DISMISS, PIN_FEEDBACK_REASON_BUTTON_NOT_INTERESTED, PIN_FEEDBACK_REASON_BUTTON_OFFENSIVE, PIN_FEEDBACK_REASON_BUTTON_SEEN_BEFORE, PIN_FEEDBACK_BUTTON_REPORT_UNRELATED_PIN, PIN_FEEDBACK_BUTTON_REPORT_PIN, PIN_FEEDBACK_BUTTON_INTEREST, 
            PIN_FEEDBACK_BUTTON_SEARCH, DIGEST_PIN, DIGEST_STORY_HEADER_BUTTON, DIGEST_STORY_EXPAND_BUTTON, DIGEST_STORY_FEEDBACK_BUTTON, DIGEST_STORY_FOLLOW_BUTTON, DIGEST_STORY_CUSTOM_ACTION_BUTTON, DIGEST_CAROUSEL_CONTENT_REP, DIGEST_FEEDBACK_DIALOG_BUTTON_UNFOLLOW_BOARD, DIGEST_FEEDBACK_DIALOG_BUTTON_UNFOLLOW_INTEREST, 
            DIGEST_FEEDBACK_DIALOG_BUTTON_UNFOLLOW_USER, DIGEST_FEEDBACK_DIALOG_BUTTON_HIDE_THROUGH_BOARD_REC, LOOKBOOK_TAG, LOOKBOOK_PROFILE_IMAGE, SEND_SOCIAL_BUTTON, SHARE_SOCIAL_BUTTON, SAFARI_KEYCHAIN_USE_PASSWORD_BUTTON, SAFARI_KEYCHAIN_NOT_NOW_BUTTON, SIGNUP_TRENDING_PREVIEW_BUTTON, PIN_SHARE_MESSAGE, 
            PIN_SHARE_WHATSAPP, PIN_SHARE_FB_MESSENGER, PIN_SHARE_FB_TIMELINE, PIN_SHARE_THIRD_PARTY_EXTENSION, BOARD_SHARE_BUTTON, BOARD_SHARE_FACEBOOK_BUTTON, BOARD_SHARE_EMAIL_BUTTON, BOARD_SHARE_COPY_LINK_BUTTON, BOARD_SHARE_OTHER_BUTTON, SEARCH_ACTION_SUGGESTION, 
            SEARCH_FILTER_SUGGESTION, SEARCH_FILTER_DROPDOWNBUTTON, FLEXIBLE_NUX_LAUNCHER, INTEREST_PIN_ANNOTATION, PREV_CLOSEUP_BUTTON, NEXT_CLOSEUP_BUTTON, CLOSEUP_PINIT_SHORTCUT, MOVE_PINS_BUTTON, BULK_MOVE_PINS_BUTTON, BULK_COPY_PINS_BUTTON, 
            BULK_DELETE_PINS_BUTTON, BULK_CANCEL_BUTTON, ADD_PIN_REP, ADD_PIN_REP_UPLOAD, ADD_PIN_REP_SCRAPE, ADD_PIN_REP_BOOKMARKLET, ADD_PIN_BUTTON_UPLOAD, ADD_PIN_BUTTON_SCRAPE, ADD_PIN_BUTTON_BOOKMARKLET, ADD_PIN_INSTALL_BOOKMARKLET, 
            ADD_PIN_CANCEL_INSTALL_BOOKMARKLET, RICH_ACTION_BUTTON, WEB_PIN_CREATE_EDIT_DESCRIPTION, WEB_PIN_CREATE_CREATE_BOARD_NO_NAME, WEB_PIN_CREATE_CREATE_BOARD_NAME, WEB_PIN_CREATE_FILTER_BOARDS_VIA_SEARCH, WEB_PIN_CREATE_BOARD_FILTER, PINVITATIONAL_REQUEST_INVITE_SUBMITTED, SEARCH_PRIVACY_LINK, FIND_FRIENDS_BUTTON_ADDRESS_BOOK, 
            FIND_FRIENDS_BUTTON_FACEBOOK, FIND_FRIENDS_BUTTON_TWITTER, FIND_FRIENDS_BUTTON_MORE, FIND_FRIENDS_BUTTON_WHATSAPP, FIND_FRIENDS_BUTTON_FB_MESSENGER, COMPOSE_EMAIL_INVITE_BUTTON, FIND_FRIENDS_BUTTON_LINE, FIND_FRIENDS_PROFILE_BUTTON, BRAND_SURVEY_DIALOG_YES_BUTTON, BRAND_SURVEY_DIALOG_LATER_BUTTON, 
            BRAND_SURVEY_DIALOG_NEVER_BUTTON, BRAND_SURVEY_DIALOG_BACKGROUND_DISMISS, HASH_TAG, PIN_LINK_MODULE_ACTION_BUTTON, PIN_LINK_MODULE_DOMAIN_OWNER_PROFILE, PIN_CLOSEUP_TRANSITION_IMAGE, CARD_ATTRIBUTION_LINK, BUILD_HOMEFEED_BUTTON, SHARE_EXTENSION_PIN_IT_BUTTON, SHARE_EXTENSION_IMAGE, 
            SHARE_EXTENSION_PICK_BOARD_CELL, SHARE_EXTENSION_BOARD_CELL, SHARE_EXTENSION_RECENT_BOARD_CELL, SHARE_EXTENSION_ALL_BOARDS_BOARD, SHARE_EXTENSION_CREATE_BOARD_CELL, SHARE_EXTENSION_EDIT_DESCRIPTION_CELL, SHARE_EXTENSION_CREATE_BOARD_BUTTON, SHARE_EXTENSION_UPSELL_PLUS_BUTTON, AUTOCOMPLETE_SUGGESTION_LC1, AUTOCOMPLETE_SUGGESTION_LC2, 
            PIN_FEEDBACK_DIALOG_BUTTON_PFY_STOP_RECS_FROM_THROUGH_PIN, PIN_FEEDBACK_DIALOG_BUTTON_PFY_STOP_RECS_FROM_THROUGH_INTEREST, SEARCH_QUERY_TYPO_CORRECTION, TRENDING_QUERY, MULTIOBJECT_PINNER_LOAD_MORE_BUTTON, MULTIOBJECT_BOARD_LOAD_MORE_BUTTON, ORDER_HISTORY_BUTTON, PAYMENT_METHODS_BUTTON, SHIPPING_ADDRESSES_BUTTON, BUYABLE_CLOSEUP_VARIANT_TEXT_CELL, 
            BUYABLE_CLOSEUP_VARIANT_SWATCH_CELL, BUYABLE_CLOSEUP_READ_MORE, BUYABLE_CLOSEUP_RETURN_POLICY, BUYABLE_CHECKOUT_VARIANT_TABLE_CELL, BUYABLE_CHECKOUT_VARIANT_CIRCLE_CELL, BUYABLE_CHECKOUT_APPLE_PAY_BUTTON, BUYABLE_CHECKOUT_CREDIT_CARD_BUTTON, BUYABLE_CHECKOUT_QUANTITY_FIELD, BUYABLE_CHECKOUT_SUMMARY_SHIP_ADDRESS_CELL, BUYABLE_CHECKOUT_SUMMARY_SHIP_METHOD_CELL, 
            BUYABLE_CHECKOUT_SUMMARY_PAYMENT_CELL, BUYABLE_CHECKOUT_LEARN_MORE_BUTTON, BUYABLE_CHECKOUT_SUMMARY_PAY_BUTTON, BUYABLE_CHECKOUT_EDIT_BUTTON, BUYABLE_CHECKOUT_SAVE_BUTTON, BUYABLE_CHECKOUT_ERROR_DISMISS_BUTTON, BUYABLE_SHIPPING_ADDRESS_CELL, BUYABLE_SHIPPING_ADDRESS_ADD_NEW_CELL, BUYABLE_SHIPPING_ADDRESS_CONTACTS_BUTTON, BUYABLE_SHIPPING_ADDRESS_DELETE_BUTTON, 
            BUYABLE_PAYMENT_CELL, BUYABLE_PAYMENT_ADD_NEW_CELL, BUYABLE_PAYMENT_BILLING_TOGGLE, BUYABLE_PAYMENT_CAMERA_BUTTON, BUYABLE_PAYMENT_BILLING_CONTACTS_BUTTON, BUYABLE_PAYMENT_BILLING_RECENTS_BUTTON, BUYABLE_PAYMENT_DELETE_BUTTON, BUYABLE_CONTACTS_ADDRESS_CELL, BUYABLE_RECENT_ADDRESS_CELL, BUYABLE_ORDER_HISTORY_CELL, 
            BUYABLE_ORDER_DETAILS_VISIT_SELLER_BUTTON, BUYABLE_ORDER_DETAILS_CONTACT_SELLER_BUTTON, BUYABLE_SETTINGS_PAYMENT_SAVE_BUTTON, BUYABLE_SETTINGS_ADDRESS_SAVE_BUTTON, BUYABLE_SHIPPING_METHOD_CELL, COMMERCE_EDUCATION_DISMISS_BUTTON, COMMERCE_EDUCATION_SEARCH_TOPIC_BUTTON, BUYABLE_CATEGORY_ICON, COMMERCE_SHOP_MORE_BUTTON, API_ENVIRONMENTS_BUTTON, 
            SAVE_TABBAR_BUTTON, SAVE_TRENDING_WEBSITE, SAVE_TRENDING_SEARCH, SAVE_EXTENSION_UPSELL, SAVE_AUTOCOMPLETE_GOOGLE_SEARCH, SAVE_AUTOCOMPLETE_RECENTLY_VISITED, SAVE_BROWSER_DRAWER, SAVE_BROWSER_PINIT_BUTTON, SAVE_BROWSER_COPY_LINK_BUTTON, SAVE_BROWSER_OPEN_IN_SAFARI_BUTTON, 
            PIN_SHARE_FBMESSENGER_BUTTON, PIN_SHARE_WHATSAPP_BUTTON, PIN_SHARE_LINE_BUTTON, PIN_SHARE_SMS_BUTTON, PIN_SHARE_OTHER_APP_BUTTON, BOARD_SHARE_TWITTER_BUTTON, BOARD_SHARE_WHATSAPP_BUTTON, BOARD_SHARE_FBMESSENGER_BUTTON, BOARD_SHARE_LINE_BUTTON, BOARD_SHARE_SMS_BUTTON, 
            BOARD_SHARE_OTHER_APP_BUTTON, COMMERCE_SEARCH_PRICE_FILTER_BLUE_BUTTON, COMMERCE_SEARCH_PRICE_FILTER_TAKEOVER, COMMERCE_SEARCH_PRICE_FILTER_TAKEOVER_CLOSE_BUTTON, COMMERCE_SEARCH_PRICE_FILTER_TAKEOVER_CLEAR_BUTTON, HOMEFEED_BUILDER_BUTTON, HOMEFEED_BUILDER_INTEREST, HOMEFEED_BUILDER_SEE_MORE_BUTTON, HOMEFEED_BUILDER_PIN, HOMEFEED_BUILDER_SEARCH_RESULT, 
            HOMEFEED_BUILDER_GRID_ITEM, HOMEFEED_BUILDER_FOLLOW_TOAST, HOMEFEED_BUILDER_BOARD, HOMEFEED_BUILDER_USER, HOMEFEED_BUILDER_TOPIC_DISMISS_BUTTON, NUJ_CREATE_BOARD_TITLE_BUTTON, SETTINGS_OFFLINE_BOARD_TOGGLE, SETTINGS_OFFLINE_BOARD_TOGGLE_ALL, BAD_LINK_BUTTON, GOOD_LINK_BUTTON, 
            LINK_FEEDBACK_OPTION_BUTTON, PIN_FEEDBACK_DIALOG_BUTTON, PIN_HIDE_BUTTON, REPIN_DIALOG_SUGGESTED_BOARD, PLACE_MODULE_BUTTON, PLACE_MODULE_MAP, PLACE_VIEW_DIRECTIONS_BUTTON, PLACE_VIEW_PHONE_BUTTON, PLACE_VIEW_SITE_BUTTON, PLACE_VIEW_LARGE_MAP, 
            PLACE_VIEW_SMALL_MAP, PLACE_VIEW_MAP_MARKER, PLACE_VIEW_MAP_CALLOUT, PLACE_VIEW_DIRECTIONS_GOOGLE, PLACE_VIEW_DIRECTIONS_APPLE, DISCOVER_FRIEND_MERCHANDISING_CLICKTHROUGH, INVITE_CONTACT, SOCIAL_NETWORK_CONNECT_BUTTON, PARTNER_PERFORMANCE_TOP_PIN, PARTNER_PERFORMANCE_STATS, 
            RECOMMENDATION_SECTION, ADD_FRIENDS_SECTION, PW_RESET_SEND_EMAIL_BUTTON, PW_RESET_USER_SEARCH_BUTTON, PW_RESET_DIRECT_EMAIL_BUTTON, PIN_FEEDBACK_REASON_BUTTON_PROMOTED, PIN_FEEDBACK_REASON_BUTTON_PFY, PIN_FEEDBACK_DIALOG_BUTTON_UNFOLLOW_BOARD, PIN_FEEDBACK_DIALOG_BUTTON_UNFOLLOW_USER, PIN_FEEDBACK_DIALOG_BUTTON_UNFOLLOW_INTEREST, 
            PIN_FEEDBACK_DIALOG_BUTTON_HIDE_PROMOTED_PIN, PIN_FEEDBACK_DIALOG_BUTTON_REPORT_PIN, PIN_FEEDBACK_DIALOG_BUTTON_PIN_NOT_RELATED_TO_INTEREST, PIN_FEEDBACK_DIALOG_BUTTON_PIN_NOT_RELATED_TO_SEARCH, EDUCATION_TOOLTIP_CONFIRM_BUTTON, EDUCATION_TOOLTIP_DISMISS_BUTTON, EDUCATION_TOOLTIP_SPOTLIGHT, EDUCATION_TOOLTIP_BACKGROUND, FPE_CREATE_FIRST_BOARD_SUGGESTED_TITLE_BUTTON, LIBRARY_PROFILE_PIN_TOPIC, 
            CUSTOM_GENDER_ON_HOVER, CUSTOM_GENDER_SAVE_BUTTON, SIMILAR_BOARD_OPEN_BUTTON, SIMILAR_BOARD_FOLLOW_BUTTON, FLASHLIGHT_SEARCH_ICON, FLASHLIGHT_ANNOTATION, LIBRARY_SORT_BOARDS, LIBRARY_SORT_BOARDS_OPTION_CHANGED, NUX_INTEREST_FOLLOW, NUX_INTEREST_UNFOLLOW, 
            NUX_CONTINUE_BUTTON, NUX_USE_CASE_TITLE, SUGGESTED_CONTACT_LIST_ITEM, SUGGESTED_CONTACT_LIST_SEARCH_ITEM, APP_LIST_ITEM, MESSAGE_INPUT, SEARCH_CONTACT_INPUT, SEARCH_CONTACT_LIST_ITEM, CONTEXTUAL_STORY_USER, CONTEXTUAL_STORY_TOPIC, 
            CONTEXTUAL_STORY_BOARD, CONTEXTUAL_STORY_SEARCH, CONTEXTUAL_STORY_SEE_MORE, PINNER_MODULE, REGISTER_EMAIL_STEP, REGISTER_PHONE_STEP, REGISTER_SMS_STEP, REGISTER_PASSWORD_STEP, REGISTER_NAME_STEP, REGISTER_AGE_STEP, 
            REGISTER_GENDER_STEP, STERLING_NAV_PROMOTE_BUTTON, STERLING_CAMPAIGN_OBJECTIVE_ROW, STERLING_PICK_A_PIN_BUTTON, STERLING_PICK_A_PIN_CLICK_MASK, STERLING_ALL_PINS_BUTTON, STERLING_30_DAY_MOST_CLICKED_BUTTON, STERLING_30_DAY_MOST_REPINNED_BUTTON, STERLING_PICK_A_PIN_SEARCH_INPUT, STERLING_IMPORT_TERMS_BUTTON, 
            STERLING_ADD_TERMS_BUTTON, STERLING_TERMS_DELIMITER_DROPDOWN_LINK, STERLING_TERMS_DELIMITER_DROPDOWN_ITEM, STERLING_DEFAULT_TERM, STERLING_TERM_SEARCH_INPUT, STERLING_TERM_SEARCH_INPUT_CLEAR, STERLING_ADD_ALL_SUGGESTED_AND_RELATED_TERMS_BUTTON, STERLING_SUGGESTED_TERM_TOKEN, STERLING_RELATED_TERM_TOKEN, STERLING_ADD_ALL_RELATED_TERMS_BUTTON, 
            STERLING_TARGETING_TYPE_RESET, STERLING_PROMOTE_BUTTON, STERLING_SETUP_BILLING_BUTTON, STERLING_ADS_TOS_CHECKBOX, STERLING_BILLING_SUBMIT_BUTTON, STERLING_BID_INPUT, STERLING_HOME_LINK, STERLING_OBJECTIVE_DASHBOARD_LINK, STERLING_CAMPAIGN_DASHBOARD_LINK, STERLING_CAMPAIGN_EDIT_BUTTON, 
            STERLING_PIN_PROMOTION_EDIT_BUTTON, STERLING_PIN_PROMOTION_PIN_LINK, STERLING_EXPORT_DATA_BUTTON, STERLING_DATE_PICKER_DROPDOWN_BUTTON, STERLING_DATE_PICKER_QUICK_SELECT_BUTTON, STERLING_DATE_PICKER_NATIVE_CONTROL, STERLING_OVERVIEW_TAB, STERLING_ACTIVITY_TAB, STERLING_SPEND_TAB, STERLING_GRAPH_SERIES_DROPDOWN_BUTTON, 
            STERLING_GRAPH_SERIES_DROPDOWN_ITEM, STERLING_VIEW_ALL_BUTTON, STERLING_OBJECTIVE_SUMMARY_STATS_ROW, STERLING_PROMOTED_PIN_PERFORMANCE_TABLE_ROW, STERLING_DOWNLOAD_BUTTON, STERLING_CONVERSION_TAG_LEARN_MORE_LINK, STERLING_CREATE_TAG_BUTTON, STERLING_CREATE_TAG_LINK, STERLING_COPY_CODE_BUTTON, STERLING_EDIT_TAG_BUTTON, 
            STERLING_DELETE_TAG_BUTTON, STERLING_NAV_REPORTS_LINK, STERLING_NAV_TOOLS_LINK, STERLING_NAV_ANALYTICS_LINK, STERLING_NAV_AWARENESS_CAMPAIGNS_LINK, STERLING_NAV_ENGAGEMENT_CAMPAIGNS_LINK, STERLING_NAV_TRAFFIC_CAMPAIGNS_LINK, STERLING_NAV_RECENT_CAMPAIGNS_LINK, STERLING_NAV_RECENT_CAMPAIGN_LINK, STERLING_NAV_BILLING_LINK, 
            STERLING_NAV_CONVERSION_TRACKING_LINK, STERLING_NAV_CINEMATIC_PIN_LINK, STERLING_BULK_EDITOR_CREATE_BUTTON, STERLING_BULK_EDITOR_EDIT_BUTTON, STERLING_BULK_UPLOAD_CREATE_BUTTON, STERLING_BULK_UPLOAD_CANCEL_BUTTON, STERLING_BULK_REVIEW_SUBMIT_BUTTON, STERLING_BULK_REVIEW_FIX_BUTTON, STERLING_BULK_REVIEW_BACK_BUTTON, STERLING_BULK_REVIEW_CANCEL_BUTTON, 
            CAMPBELL_NAV_HOMEFEED_BUTTON, CAMPBELL_NAV_SEARCH_BAR, CAMPBELL_NAV_CATEGORIES_BUTTON, CAMPBELL_NAV_ADD_PIN_BUTTON, CAMPBELL_NAV_NOTIFICATIONS_BUTTON, CAMPBELL_NAV_USER_MENU_BUTTON, CAMPBELL_NAV_DRAWER_OPEN_BUTTON, CAMPBELL_NAV_DRAWER_CLOSE_BUTTON, CAMPBELL_NAV_DRAWER_CLOSE_GREY_PAGE, CAMPBELL_NAV_DRAWER_HOMEFEED_LINK, 
            CAMPBELL_NAV_DRAWER_ANALYTICS_LINK, CAMPBELL_NAV_DRAWER_ADS_MANAGER_LINK, CAMPBELL_NAV_DRAWER_PINS_FROM_WEBSITE_LINK, CAMPBELL_NAV_DRAWER_UPLOAD_FROM_COMPUTER_LINK, CAMPBELL_NAV_DRAWER_CREATE_AD_LINK, CAMPBELL_NAV_DRAWER_PIN_IT_BUTTON_LINK, CAMPBELL_NAV_DRAWER_RICH_PINS_LINK, CAMPBELL_NAV_DRAWER_WEBSITE_CONFIRMATION_LINK, CAMPBELL_NAV_DRAWER_CASE_STUDIES_LINK, CAMPBELL_NAV_DRAWER_HOW_TO_GUIDES_LINK, 
            CAMPBELL_NAV_DRAWER_DEVELOPER_DOCS_LINK, CAMPBELL_NAV_DRAWER_HELP_CENTER_LINK, CAMPBELL_NAV_ADS_MANAGER_BUTTON, CAMPBELL_NAV_ADS_OVERVIEW_LINK, CAMPBELL_NAV_ADS_TOOLS_LINK, CAMPBELL_NAV_ADS_ENGAGEMENT_LINK, CAMPBELL_NAV_ADS_TRAFFIC_LINK, CAMPBELL_NAV_ADS_BUYABLE_LINK, CAMPBELL_NAV_ADS_AWARENESS_LINK, CAMPBELL_NAV_ADS_BULK_EDITOR_LINK, 
            CAMPBELL_NAV_ADS_CONVERSION_TRACKING_LINK, CAMPBELL_NAV_ADS_CINEMATIC_PIN_LINK, CAMPBELL_NAV_ANALYTICS_BUTTON, CAMPBELL_NAV_ANALYTICS_OVERVIEW_LINK, CAMPBELL_NAV_PROFILE_LINK, CAMPBELL_NAV_AUDIENCE_LINK, CAMPBELL_NAV_WEBSITE_LINK, CAMPBELL_NAV_ADD_PIN_FROM_WEB_LINK, CAMPBELL_NAV_ADD_PIN_UPLOAD, CAMPBELL_NAV_ADD_PIN_CREATE_AD, 
            CAMPBELL_NAV_USER_MENU_PROFILE_LINK, CAMPBELL_NAV_USER_MENU_SETTINGS_LINK, CAMPBELL_NAV_USER_MENU_BILLING_LINK, CAMPBELL_NAV_USER_MENU_HELP_CENTER_LINK, CAMPBELL_NAV_USER_MENU_LOGOUT_LINK
        });
    }
}
