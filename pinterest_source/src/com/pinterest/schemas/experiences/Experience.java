// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.schemas.experiences;

import org.apache.thrift.TEnum;

public final class Experience extends Enum
    implements TEnum
{

    private static final Experience $VALUES[];
    public static final Experience ANALYTICS_AUDIENCE_SELECTOR_USER_ED;
    public static final Experience ANALYTICS_HOME_USER_ED;
    public static final Experience ANALYTICS_NOOP;
    public static final Experience ANDROID_ADS_SURVEY_201507;
    public static final Experience ANDROID_BOARD_FOLLOW_ED;
    public static final Experience ANDROID_BOARD_FOLLOW_ED_HELPER;
    public static final Experience ANDROID_BOARD_FOLLOW_ED_HELPER_TABLET;
    public static final Experience ANDROID_BOARD_FOLLOW_ED_TABLET;
    public static final Experience ANDROID_CLICKTHROUGH_BTN_TOOLTIP;
    public static final Experience ANDROID_CLICKTHROUGH_ED;
    public static final Experience ANDROID_CLICKTHROUGH_ED_HELPER;
    public static final Experience ANDROID_CLICKTHROUGH_ED_HELPER_TABLET;
    public static final Experience ANDROID_CLICKTHROUGH_ED_TABLET;
    public static final Experience ANDROID_COMMERCE_CHECKOUT_ED;
    public static final Experience ANDROID_COMMERCE_CLOSEUP_BUY_ED;
    public static final Experience ANDROID_COMMERCE_CLOSEUP_MERCHANT_ED;
    public static final Experience ANDROID_COMMERCE_HOME_FEED_ED;
    public static final Experience ANDROID_COMMERCE_SEARCH_ED;
    public static final Experience ANDROID_EMMY_AWARDS;
    public static final Experience ANDROID_EMPTY_BOARD_ED;
    public static final Experience ANDROID_EMPTY_BOARD_ED_HELPER;
    public static final Experience ANDROID_EMPTY_BOARD_ED_HELPER_TABLET;
    public static final Experience ANDROID_EMPTY_BOARD_ED_TABLET;
    public static final Experience ANDROID_EMPTY_USER_PROFILE_ED;
    public static final Experience ANDROID_EMPTY_USER_PROFILE_ED_HELPER;
    public static final Experience ANDROID_EMPTY_USER_PROFILE_ED_HELPER_TABLET;
    public static final Experience ANDROID_EMPTY_USER_PROFILE_ED_TABLET;
    public static final Experience ANDROID_FIRST_FLASHLIGHT_ED;
    public static final Experience ANDROID_FIRST_PIN_SCROLL_PROMPT;
    public static final Experience ANDROID_FIRST_PIN_TAP_PROMPT;
    public static final Experience ANDROID_FLASHLIGHT_BUTTON_TOOLTIP;
    public static final Experience ANDROID_FREE_RESPONSE_USER_SURVEY_201505;
    public static final Experience ANDROID_HERO_EMPTY_HOMEFEED;
    public static final Experience ANDROID_HERO_PROMPT_REBUILD_FEED;
    public static final Experience ANDROID_HERO_UNDO_REBUILD_FEED;
    public static final Experience ANDROID_HOMEFEED_BUILDER_TOOLTIP;
    public static final Experience ANDROID_HOME_FEED_ED;
    public static final Experience ANDROID_HOME_FEED_ED_HELPER;
    public static final Experience ANDROID_HOME_FEED_ED_HELPER_TABLET;
    public static final Experience ANDROID_HOME_FEED_ED_TABLET;
    public static final Experience ANDROID_HOME_FEED_ED_V2;
    public static final Experience ANDROID_HOME_FEED_ED_V2_HELPER;
    public static final Experience ANDROID_HOME_FEED_PROFILE_TAB_TOOLTIP;
    public static final Experience ANDROID_HOME_FIRST_PIN_CLOSEUP_PROMPT;
    public static final Experience ANDROID_MSGS_WELCOME_MESSAGE;
    public static final Experience ANDROID_NAG_ADS_PRIVACY_UPDATE;
    public static final Experience ANDROID_NAG_CONFIRM_EMAIL;
    public static final Experience ANDROID_NAG_CONNECT_FACEBOOK;
    public static final Experience ANDROID_NAG_GLOBAL_INVITER;
    public static final Experience ANDROID_NAG_INVITER;
    public static final Experience ANDROID_NAG_PINVITATIONAL;
    public static final Experience ANDROID_NAG_UPLOAD_CONTACTS;
    public static final Experience ANDROID_NAG_WRITE_BANNED;
    public static final Experience ANDROID_NEW_USER_SURVEY_201504;
    public static final Experience ANDROID_NOOP;
    public static final Experience ANDROID_NUX_CORE_CONCEPTS_M5;
    public static final Experience ANDROID_NUX_FIRST_PIN;
    public static final Experience ANDROID_NUX_MANDATORY_MEN;
    public static final Experience ANDROID_NUX_MANDATORY_WOMEN;
    public static final Experience ANDROID_NUX_REBUILD_FEED;
    public static final Experience ANDROID_OWN_LIBRARY_ALL_PINS_ED;
    public static final Experience ANDROID_OWN_LIBRARY_PROFILE_ED;
    public static final Experience ANDROID_PINIT_BTN_TOOLTIP;
    public static final Experience ANDROID_PINVITATIONAL_CONFIRM_BOARD;
    public static final Experience ANDROID_PINVITATIONAL_HOME_FEED_MODAL;
    public static final Experience ANDROID_PROFILE_FOLLOW_ED;
    public static final Experience ANDROID_PROFILE_FOLLOW_ED_HELPER;
    public static final Experience ANDROID_PROFILE_FOLLOW_ED_HELPER_TABLET;
    public static final Experience ANDROID_PROFILE_FOLLOW_ED_TABLET;
    public static final Experience ANDROID_PROFILE_OFFLINE_PIN_ED;
    public static final Experience ANDROID_QA_EDUCATION;
    public static final Experience ANDROID_QA_NOTIFICATION_EDUCATION;
    public static final Experience ANDROID_REPIN_ED;
    public static final Experience ANDROID_REPIN_ED_HELPER;
    public static final Experience ANDROID_REPIN_ED_HELPER_TABLET;
    public static final Experience ANDROID_REPIN_ED_TABLET;
    public static final Experience ANDROID_REPIN_ED_V2;
    public static final Experience ANDROID_REPIN_ED_V2_HELPER;
    public static final Experience ANDROID_RESURRECTED_USER_SURVEY_201505;
    public static final Experience ANDROID_SHARE_EXTENSION_EDUCATION_HOMEFEED_PARTIAL_TAKEOVER;
    public static final Experience ANDROID_SHARE_SHEET_EXTENSION_ED;
    public static final Experience ANDROID_STATEMENT_CREDIT_CHECKOUT;
    public static final Experience ANDROID_STATEMENT_CREDIT_HOME_FEED;
    public static final Experience ANDROID_STATEMENT_CREDIT_PIN_CLOSEUP;
    public static final Experience ANDROID_SURVEY_201501;
    public static final Experience ANDROID_SURVEY_201504;
    public static final Experience ANDROID_SURVEY_WOM;
    public static final Experience ANDROID_WARM_SEO_NUX_GIFTWRAP_INTEREST_PICKER;
    public static final Experience ANDROID_WARM_SEO_NUX_HOMEFEED_INTRO;
    public static final Experience BATCH_EMAIL_BOARD_CREATE_RECOMMENDATIONS;
    public static final Experience BATCH_EMAIL_BOARD_FOLLOW_RECOMMENDATIONS;
    public static final Experience BATCH_EMAIL_CART_ABANDONMENT;
    public static final Experience BATCH_EMAIL_DORMANT_BOARD_RECOMMENDATIONS;
    public static final Experience BATCH_EMAIL_EDITORIAL;
    public static final Experience BATCH_EMAIL_EDITORIAL_POPULAR_PINS;
    public static final Experience BATCH_EMAIL_EDITORIAL_POPULAR_PINS_M5;
    public static final Experience BATCH_EMAIL_EMPTY_BOARD;
    public static final Experience BATCH_EMAIL_FIND_FRIEND;
    public static final Experience BATCH_EMAIL_FIRST_BOARD_CREATE;
    public static final Experience BATCH_EMAIL_FIRST_CLICKTHROUGH;
    public static final Experience BATCH_EMAIL_FIRST_PIN_CREATE;
    public static final Experience BATCH_EMAIL_FRIENDS_INTERESTS;
    public static final Experience BATCH_EMAIL_GUIDED_SEARCH;
    public static final Experience BATCH_EMAIL_HOMEFEED_NEW_PINS;
    public static final Experience BATCH_EMAIL_INTEREST_RECOMMENDATIONS;
    public static final Experience BATCH_EMAIL_MOBILE_APP_DOWNLOAD;
    public static final Experience BATCH_EMAIL_NETWORK_STORY_DIGEST;
    public static final Experience BATCH_EMAIL_NON_NUX_INTEREST_RECOMMENDATIONS;
    public static final Experience BATCH_EMAIL_NO_SIGNAL;
    public static final Experience BATCH_EMAIL_PIN_BECOMES_BUYABLE;
    public static final Experience BATCH_EMAIL_PIN_FREE_SHIPPING;
    public static final Experience BATCH_EMAIL_PIN_ON_ANOTHER_BOARD;
    public static final Experience BATCH_EMAIL_PIN_PRICE_DROP;
    public static final Experience BATCH_EMAIL_PIN_TWINS;
    public static final Experience BATCH_EMAIL_POPULAR_PINS;
    public static final Experience BATCH_EMAIL_POPULAR_PINS_M5;
    public static final Experience BATCH_EMAIL_PROMOTE_GOODIES;
    public static final Experience BATCH_EMAIL_RECOMMENDATIONS_DIGEST;
    public static final Experience BATCH_EMAIL_TRENDING_PINS;
    public static final Experience BATCH_EMAIL_TRENDING_SEARCHES;
    public static final Experience BATCH_NETWORK_STORY_BACK_TO_SCHOOL_PARENTS;
    public static final Experience BATCH_NETWORK_STORY_BACK_TO_SCHOOL_TEACHERS;
    public static final Experience BATCH_NETWORK_STORY_FATHERS_DAY;
    public static final Experience BATCH_NETWORK_STORY_GAME_DAY;
    public static final Experience BATCH_NETWORK_STORY_SHOP_OUR_PICKS;
    public static final Experience BATCH_NETWORK_STORY_VALENTINE;
    public static final Experience BATCH_NOOP;
    public static final Experience BATCH_PUSH_NOTIFICATION_ATHELETES_OUTDOORS;
    public static final Experience BATCH_PUSH_NOTIFICATION_CREATE_RESOLUTION_BOARD;
    public static final Experience BATCH_PUSH_NOTIFICATION_FOOD;
    public static final Experience BATCH_PUSH_NOTIFICATION_GARDENING;
    public static final Experience BATCH_PUSH_NOTIFICATION_HOLIDAY_GUIDE;
    public static final Experience BATCH_PUSH_NOTIFICATION_KIDS;
    public static final Experience BATCH_PUSH_NOTIFICATION_NEW_USER_DAY_1;
    public static final Experience BATCH_PUSH_NOTIFICATION_NEW_USER_DAY_2;
    public static final Experience BATCH_PUSH_NOTIFICATION_NEW_USER_DAY_3;
    public static final Experience BATCH_PUSH_NOTIFICATION_NUJ_BUILD_HOMEFEED;
    public static final Experience BATCH_PUSH_NOTIFICATION_RESOLUTION_IDEAS;
    public static final Experience BATCH_PUSH_NOTIFICATION_SHARE_BOARD;
    public static final Experience CAMPBELL_SIDE_NAV_USER_ED;
    public static final Experience CONFIRM_EMAIL;
    public static final Experience EMAIL_NOOP;
    public static final Experience EMAIL_USER_ED_TIP_CLICKTHROUGH;
    public static final Experience EMAIL_USER_ED_TIP_EMAIL_VERIFY;
    public static final Experience EMAIL_USER_ED_TIP_EMPTY_BOARD;
    public static final Experience EMAIL_USER_ED_TIP_PINIT_BUTTON;
    public static final Experience EMAIL_USER_ED_TIP_PIN_CREATE;
    public static final Experience EMAIL_USER_ED_TIP_REPIN;
    public static final Experience EMAIL_USER_ED_TIP_SEARCH;
    public static final Experience HOMEFEED_CELEB_TOPIC_MULTI_BOARDS;
    public static final Experience HOMEFEED_LOCAL_TOPIC_MULTI_BOARDS;
    public static final Experience HOMEFEED_NOOP;
    public static final Experience HOMEFEED_SEO_BOARD_MULTI_BOARDS;
    public static final Experience IOS_BOARD_FOLLOW_ED;
    public static final Experience IOS_BOARD_FOLLOW_ED_HELPER;
    public static final Experience IOS_CLICKTHROUGH_ED;
    public static final Experience IOS_CLICKTHROUGH_ED_HELPER;
    public static final Experience IOS_COMBINED_SEARCH_ED;
    public static final Experience IOS_COMBINED_SEARCH_ED_HELPER;
    public static final Experience IOS_COMMERCE_CHECKOUT_EDUCATION;
    public static final Experience IOS_COMMERCE_CLOSEUP_BUY_EDUCATION;
    public static final Experience IOS_COMMERCE_CLOSEUP_MERCHANT_EDUCATION;
    public static final Experience IOS_COMMERCE_EDUCATION;
    public static final Experience IOS_COMMERCE_HOMEFEED_EDUCATION;
    public static final Experience IOS_COMMERCE_SEARCH_EDUCATION;
    public static final Experience IOS_CONTACTS_AND_FACEBOOK_PERMISSIONS;
    public static final Experience IOS_CONTACTS_PERMISSIONS;
    public static final Experience IOS_CONTEXTUAL_MENU_ED;
    public static final Experience IOS_CREATE_BUTTON_ED;
    public static final Experience IOS_EMMY_AWARDS;
    public static final Experience IOS_EMPTY_BOARD_ED;
    public static final Experience IOS_EMPTY_BOARD_ED_HELPER;
    public static final Experience IOS_EMPTY_USER_PROFILE_ED;
    public static final Experience IOS_EMPTY_USER_PROFILE_ED_HELPER;
    public static final Experience IOS_FACEBOOK_TRENDING_PIN_TOAST;
    public static final Experience IOS_FIRST_CLICKTHROUGH_TOOLTIP;
    public static final Experience IOS_FIRST_FLASHLIGHT_ED;
    public static final Experience IOS_FIRST_FLASHLIGHT_ICON_ED;
    public static final Experience IOS_FIRST_PIN_BOARD_CREATE;
    public static final Experience IOS_FIRST_PIN_HOMEFEED_BUILDER_TOOLTIP;
    public static final Experience IOS_FIRST_PIN_HOMEFEED_CLOSEUP_HELPER;
    public static final Experience IOS_FIRST_PIN_HOMEFEED_SCROLL_HELPER;
    public static final Experience IOS_FIRST_PIN_REPIN;
    public static final Experience IOS_FIRST_PIN_TOOLTIP;
    public static final Experience IOS_GUIDED_SEARCH_ED;
    public static final Experience IOS_GUIDED_SEARCH_ED_HELPER;
    public static final Experience IOS_HOME_FEED_ED;
    public static final Experience IOS_HOME_FEED_ED_HELPER;
    public static final Experience IOS_HOME_FEED_PROFILE_TAB_TOOLTIP;
    public static final Experience IOS_HOME_WELCOME_HELPER;
    public static final Experience IOS_IN_APP_SURVEY;
    public static final Experience IOS_MSGS_MESSAGE_LIST_USER_ED;
    public static final Experience IOS_MSGS_MESSAGE_USER_ED;
    public static final Experience IOS_MSGS_MESSAGE_USER_ED_IPAD;
    public static final Experience IOS_MSGS_NOTIFICATIONS_USER_ED;
    public static final Experience IOS_MSGS_NOTIFICATIONS_USER_ED_IPAD;
    public static final Experience IOS_MSGS_SEND_PIN_ED;
    public static final Experience IOS_MSGS_SEND_PIN_ED_HELPER;
    public static final Experience IOS_MSGS_WELCOME_MESSAGE;
    public static final Experience IOS_NAG_ADS_PRIVACY_UPDATE;
    public static final Experience IOS_NAG_APPLE_APP_STORE;
    public static final Experience IOS_NAG_COMMERCE_SHOP_OUR_PICKS;
    public static final Experience IOS_NAG_CONFIRM_EMAIL;
    public static final Experience IOS_NAG_CONFIRM_EMAIL_V3_5_1;
    public static final Experience IOS_NAG_GLOBAL_INVITER;
    public static final Experience IOS_NAG_INVITER;
    public static final Experience IOS_NAG_PINVITATIONAL;
    public static final Experience IOS_NAG_PINVITATIONAL_REFRESH;
    public static final Experience IOS_NAG_PLACE_PINS;
    public static final Experience IOS_NAG_REBUILD_FEED;
    public static final Experience IOS_NAG_UNDO_REBUILD_FEED;
    public static final Experience IOS_NAG_WRITE_BANNED;
    public static final Experience IOS_NOOP;
    public static final Experience IOS_NOTIFICATION_PANE_PERMISSION_NAG;
    public static final Experience IOS_NUX_BUILD_HOMEFEED;
    public static final Experience IOS_NUX_COLD_HOMEFEED_INTEREST_GIFTWRAP;
    public static final Experience IOS_NUX_COLD_HOMEFEED_INTRO_TAKEOVER;
    public static final Experience IOS_NUX_COLD_INTEREST_GIFTWRAP_TAKEOVER;
    public static final Experience IOS_NUX_COLD_USE_CASES;
    public static final Experience IOS_NUX_CORE_CONCEPTS_JAPAN_FEMALE;
    public static final Experience IOS_NUX_CORE_CONCEPTS_JAPAN_MALE;
    public static final Experience IOS_NUX_CORE_CONCEPTS_M5;
    public static final Experience IOS_NUX_FIRST_BOARD;
    public static final Experience IOS_NUX_FIRST_CLICKTHROUGH;
    public static final Experience IOS_NUX_FIRST_PIN;
    public static final Experience IOS_NUX_INTEREST_PICKER;
    public static final Experience IOS_NUX_MANDATORY;
    public static final Experience IOS_NUX_MANDATORY_MEN;
    public static final Experience IOS_NUX_MANDATORY_WOMEN;
    public static final Experience IOS_NUX_REBUILD_FEED;
    public static final Experience IOS_NUX_SEARCH_LIVE_PROFILE_HELPER;
    public static final Experience IOS_NUX_SEARCH_WELCOME_HELPER;
    public static final Experience IOS_OWN_EMPTY_BOARD_ED;
    public static final Experience IOS_OWN_EMPTY_BOARD_ED_HELPER;
    public static final Experience IOS_OWN_EMPTY_USER_PROFILE_ED;
    public static final Experience IOS_OWN_EMPTY_USER_PROFILE_ED_HELPER;
    public static final Experience IOS_OWN_LIBRARY_ALL_PINS_ED;
    public static final Experience IOS_OWN_LIBRARY_PROFILE_ED;
    public static final Experience IOS_PINS_LIVE_PROFILE_HELPER;
    public static final Experience IOS_PINVITATIONAL_HOME_FEED_MODAL;
    public static final Experience IOS_PROFILE_FOLLOW_ED;
    public static final Experience IOS_PROFILE_FOLLOW_ED_HELPER;
    public static final Experience IOS_PROFILE_HOME_FEED_HELPER;
    public static final Experience IOS_PUSH_NOTIFICATION_PERMISSION_PROMPT;
    public static final Experience IOS_QA_EDUCATION;
    public static final Experience IOS_QA_NOTIFICATION_EDUCATION;
    public static final Experience IOS_REPIN_ED;
    public static final Experience IOS_REPIN_ED_HELPER;
    public static final Experience IOS_REPIN_ED_HELPER_IPAD;
    public static final Experience IOS_REPIN_ED_IPAD;
    public static final Experience IOS_SCREENSHOT_ED;
    public static final Experience IOS_SHARE_EXTENSION_EDUCATION;
    public static final Experience IOS_SHARE_EXTENSION_EDUCATION_HOMEFEED_FULL_TAKEOVER;
    public static final Experience IOS_SHARE_EXTENSION_EDUCATION_HOMEFEED_PARTIAL_TAKEOVER;
    public static final Experience IOS_SHARE_EXTENSION_EDUCATION_PROFILE_PARTIAL_TAKEOVER;
    public static final Experience IOS_TEST;
    public static final Experience IOS_UNSEEN_NOTIFICATION_HOMEFEED_TOASTER;
    public static final Experience IOS_UPDATE_APP_HELPER;
    public static final Experience NOOP;
    public static final Experience PUSH_NOTIFICATION_FRIEND_PIN;
    public static final Experience PUSH_NOTIFICATION_NOOP;
    public static final Experience PUSH_NOTIFICATION_PIN_TWINS;
    public static final Experience PUSH_NOTIFICATION_SIMILAR_REPINS;
    public static final Experience STERLING_DASHBOARD_USER_ED;
    public static final Experience STERLING_NOOP;
    public static final Experience WEB_ADD_PIN_EXTENSION_INSTALL_MODAL;
    public static final Experience WEB_ADS_SURVEY_201507;
    public static final Experience WEB_BLANK_SESSION;
    public static final Experience WEB_BOARD_BULK_EDIT_ED;
    public static final Experience WEB_BOARD_FOLLOW_ED;
    public static final Experience WEB_BOARD_FOLLOW_ED_MANUAL;
    public static final Experience WEB_CATEGORY_SEARCH_USER_ED;
    public static final Experience WEB_CLICKTHROUGH_ED;
    public static final Experience WEB_CLICKTHROUGH_ED_MANUAL;
    public static final Experience WEB_EMPTY_BOARD_ED;
    public static final Experience WEB_EMPTY_BOARD_ED_MANUAL;
    public static final Experience WEB_EMPTY_PLACES_BOARD_USER_ED;
    public static final Experience WEB_EMPTY_PROFILE_ED;
    public static final Experience WEB_EMPTY_PROFILE_ED_MANUAL;
    public static final Experience WEB_EU_COOKIE_BANNER;
    public static final Experience WEB_EXPLORE_BUTTON_USER_ED;
    public static final Experience WEB_EXPLORE_HEADER_USER_ED;
    public static final Experience WEB_EXPLORE_PAGE_USER_ED;
    public static final Experience WEB_FACEBOOK_CONNECT_HERO;
    public static final Experience WEB_FACEBOOK_PUBLISH_HERO;
    public static final Experience WEB_FAST_FOLLOW_USER_ED;
    public static final Experience WEB_FEED_EDITOR_USER_ED;
    public static final Experience WEB_FILLED_PLACES_BOARD_USER_ED;
    public static final Experience WEB_FIND_FRIENDS_USER_ED;
    public static final Experience WEB_FIRST_BOARD_USER_ED;
    public static final Experience WEB_FIRST_FOLLOW;
    public static final Experience WEB_FIRST_PIN_SUCCESS;
    public static final Experience WEB_FIRST_PIN_USER_ED;
    public static final Experience WEB_FLASHLIGHT_ED;
    public static final Experience WEB_FLASHLIGHT_ED_MANUAL;
    public static final Experience WEB_FLASHLIGHT_ED_PULSER;
    public static final Experience WEB_FLEXIBLE_NUX;
    public static final Experience WEB_FLEXIBLE_SET_UP;
    public static final Experience WEB_FREE_RESPONSE_USER_SURVEY_201505;
    public static final Experience WEB_GUIDED_SEARCH_HEADER_USER_ED;
    public static final Experience WEB_GUIDED_SEARCH_USER_ED;
    public static final Experience WEB_HERO_ADS_PRIVACY_UPDATE;
    public static final Experience WEB_HERO_APP_UPSELL;
    public static final Experience WEB_HERO_BID_GUIDANCE;
    public static final Experience WEB_HERO_BUSINESS_HOLIDAY_BOARD_NAG;
    public static final Experience WEB_HERO_BUYABLE_PIN_FROM_EMAIL;
    public static final Experience WEB_HERO_CONVERT_TO_BUSINESS;
    public static final Experience WEB_HERO_CONVERT_TO_BUSINESS_REDUX;
    public static final Experience WEB_HERO_CPE_PROMOTED_PINS_INVITE;
    public static final Experience WEB_HERO_EMMY_AWARDS;
    public static final Experience WEB_HERO_EMPTY_HOMEFEED;
    public static final Experience WEB_HERO_FIX_EMAIL_NAG;
    public static final Experience WEB_HERO_HOLIDAY_GUIDE;
    public static final Experience WEB_HERO_INSTALL_APP;
    public static final Experience WEB_HERO_INSTALL_EXTENSION;
    public static final Experience WEB_HERO_INVITE_FRIENDS;
    public static final Experience WEB_HERO_LANGUAGE;
    public static final Experience WEB_HERO_LANGUAGE_BROWSER_SAFE;
    public static final Experience WEB_HERO_NEW_ANALYTICS_CONVERT_TO_BIZ_NAG;
    public static final Experience WEB_HERO_NEW_ANALYTICS_NAG;
    public static final Experience WEB_HERO_PINIT_BUTTON;
    public static final Experience WEB_HERO_PINIT_BUTTON_INTERNATIONAL;
    public static final Experience WEB_HERO_PINIT_WEBMASTER;
    public static final Experience WEB_HERO_PINNER_HOLIDAY_BOARD_NAG;
    public static final Experience WEB_HERO_PINVITATIONAL_INVITE_NAG;
    public static final Experience WEB_HERO_PLACE_PINS;
    public static final Experience WEB_HERO_PLACE_PINS_BOARD;
    public static final Experience WEB_HERO_PROMOTED_PINS_BETA_REMINDER;
    public static final Experience WEB_HERO_PROMOTE_A_PIN;
    public static final Experience WEB_HERO_PROMPT_REBUILD_FEED;
    public static final Experience WEB_HERO_REBUILD_EMPTY_HOME_FEED;
    public static final Experience WEB_HERO_SCOOTER_PINNER_STORY;
    public static final Experience WEB_HERO_UNDO_REBUILD_FEED;
    public static final Experience WEB_HERO_VALENTINES;
    public static final Experience WEB_HERO_WEB_PUSH_NOTIFICATION_NAG;
    public static final Experience WEB_HERO_WEEK_INVITER_NAG;
    public static final Experience WEB_HERO_WORLD_CUP;
    public static final Experience WEB_HOMEFEED_CAROUSEL;
    public static final Experience WEB_HOME_FEED_ED;
    public static final Experience WEB_HOME_FEED_ED_MANUAL;
    public static final Experience WEB_HOME_FEED_ED_V2;
    public static final Experience WEB_HOME_FEED_ED_V2_MANUAL;
    public static final Experience WEB_HOME_HERO_BID_GUIDANCE;
    public static final Experience WEB_HOME_HERO_CPE_PROMOTED_PINS_INVITE;
    public static final Experience WEB_HOME_HERO_PROMOTED_PINS_BETA_REMINDER;
    public static final Experience WEB_INTL_PIN_USER_ED;
    public static final Experience WEB_MANDATORY_AUTOBAHN;
    public static final Experience WEB_MOBILE_NOOP;
    public static final Experience WEB_MOBILE_NUX_INTERESTS;
    public static final Experience WEB_MOBILE_NUX_MANDATORY;
    public static final Experience WEB_MODERN_HEADER_USER_ED;
    public static final Experience WEB_MSGS_WELCOME_MESSAGE;
    public static final Experience WEB_NAG_ADS_PRIVACY_UPDATE;
    public static final Experience WEB_NAG_CHROME_PUSH;
    public static final Experience WEB_NAG_LIMITED_LOGIN;
    public static final Experience WEB_NAG_LIMITED_LOGIN_V2;
    public static final Experience WEB_NAG_LOCALE_CHANGED_NOTIFICATION;
    public static final Experience WEB_NAG_PARTNER_CONFIRM_WEBSITE;
    public static final Experience WEB_NAG_SUBDOMAIN_REDIRECT;
    public static final Experience WEB_NEW_USER_SURVEY_201504;
    public static final Experience WEB_NOOP;
    public static final Experience WEB_NOTIFICATION_NAG_CHROME_PUSH;
    public static final Experience WEB_NUX_CORE_CONCEPTS_JAPAN;
    public static final Experience WEB_NUX_CORE_CONCEPTS_M5;
    public static final Experience WEB_PARTNER_PERFORMANCE_HERO;
    public static final Experience WEB_PARTNER_PERFORMANCE_HERO_V2;
    public static final Experience WEB_PINIT_BOOKMARKLET;
    public static final Experience WEB_PINVITATIONAL_HOMEFEED_MODAL;
    public static final Experience WEB_PIN_CLOSEUP_AUTOBAHN;
    public static final Experience WEB_PIN_CLOSEUP_LITE;
    public static final Experience WEB_PIN_CREATE_SUCCESS_EXTENSION_UPSELL;
    public static final Experience WEB_PIN_SUCCESS_EXTENSION_ED_BOARD_BOXED;
    public static final Experience WEB_PIN_SUCCESS_EXTENSION_ED_CATEGORY_BOXED;
    public static final Experience WEB_PIN_SUCCESS_EXTENSION_ED_DOMAIN;
    public static final Experience WEB_PIN_SUCCESS_EXTENSION_ED_ODD_CONTENTS;
    public static final Experience WEB_PIN_SUCCESS_EXTENSION_UPSELL;
    public static final Experience WEB_PIN_SUCCESS_NEW_EXTENSION_UPSELL;
    public static final Experience WEB_PLACE_PINS_TOOLTIP;
    public static final Experience WEB_PROFILE_FOLLOW_ED;
    public static final Experience WEB_PROFILE_FOLLOW_ED_MANUAL;
    public static final Experience WEB_PROMPT_INTEREST_SEARCH_REBUILD_FEED;
    public static final Experience WEB_QA_CLOSEUP_NOTIFICATION_USER_ED;
    public static final Experience WEB_QA_CLOSEUP_USER_ED;
    public static final Experience WEB_REBUILD_FEED;
    public static final Experience WEB_REPIN_ED;
    public static final Experience WEB_REPIN_ED_MANUAL;
    public static final Experience WEB_RESURRECTED_USER_SURVEY_201505;
    public static final Experience WEB_SEARCH_DISCOVER_TOOLTIP;
    public static final Experience WEB_SEO_NUX;
    public static final Experience WEB_SEO_NUX_CREATE_BOARD;
    public static final Experience WEB_SEO_NUX_FIRST_CLICKTHROUGH_TOOLTIP;
    public static final Experience WEB_SEO_NUX_FIRST_PIN_TOOLTIP;
    public static final Experience WEB_SEO_NUX_HOMEFEED_PIN_SUCCESS_BANNER;
    public static final Experience WEB_SEO_NUX_HOMEFEED_WELCOME;
    public static final Experience WEB_SURVEY_201501;
    public static final Experience WEB_SURVEY_201504;
    public static final Experience WEB_SURVEY_BR_201509;
    public static final Experience WEB_SURVEY_DE_201509;
    public static final Experience WEB_SURVEY_FR_201509;
    public static final Experience WEB_SURVEY_JP_201509;
    public static final Experience WEB_SURVEY_SEARCH;
    public static final Experience WEB_SURVEY_UK_201509;
    public static final Experience WEB_SURVEY_US_201509;
    public static final Experience WEB_SURVEY_WOM;
    public static final Experience WEB_TEST;
    public static final Experience WEB_UNAUTH_PIN_CLOSEUP;
    public static final Experience WEB_USER_NEWS_APP_UPSELL;
    public static final Experience WEB_VISUAL_OBJECT_SEARCH_CLOSEUP_USER_ED;
    public static final Experience WEB_YOUR_BOARDS_USER_ED;
    private final int value;

    private Experience(String s, int i, int j)
    {
        super(s, i);
        value = j;
    }

    public static Experience findByValue(int i)
    {
        switch (i)
        {
        default:
            return null;

        case 1: // '\001'
            return NOOP;

        case 2: // '\002'
            return CONFIRM_EMAIL;

        case 10000: 
            return WEB_NOOP;

        case 10001: 
            return WEB_FEED_EDITOR_USER_ED;

        case 10002: 
            return WEB_PIN_CLOSEUP_LITE;

        case 10003: 
            return WEB_PIN_CLOSEUP_AUTOBAHN;

        case 10004: 
            return WEB_MANDATORY_AUTOBAHN;

        case 10005: 
            return WEB_FIRST_PIN_SUCCESS;

        case 10006: 
            return WEB_SEARCH_DISCOVER_TOOLTIP;

        case 10007: 
            return WEB_FIRST_FOLLOW;

        case 10008: 
            return WEB_PINIT_BOOKMARKLET;

        case 10009: 
            return WEB_BLANK_SESSION;

        case 10010: 
            return WEB_FIRST_PIN_USER_ED;

        case 10011: 
            return WEB_YOUR_BOARDS_USER_ED;

        case 10012: 
            return WEB_FAST_FOLLOW_USER_ED;

        case 10013: 
            return WEB_FIND_FRIENDS_USER_ED;

        case 10014: 
            return WEB_CATEGORY_SEARCH_USER_ED;

        case 10015: 
            return WEB_PLACE_PINS_TOOLTIP;

        case 10016: 
            return WEB_EMPTY_PLACES_BOARD_USER_ED;

        case 10017: 
            return WEB_FILLED_PLACES_BOARD_USER_ED;

        case 10018: 
            return WEB_FIRST_BOARD_USER_ED;

        case 10019: 
            return WEB_EXPLORE_BUTTON_USER_ED;

        case 10020: 
            return WEB_EXPLORE_PAGE_USER_ED;

        case 10021: 
            return WEB_MODERN_HEADER_USER_ED;

        case 10022: 
            return WEB_PIN_SUCCESS_EXTENSION_UPSELL;

        case 10023: 
            return WEB_EXPLORE_HEADER_USER_ED;

        case 10024: 
            return WEB_VISUAL_OBJECT_SEARCH_CLOSEUP_USER_ED;

        case 10025: 
            return WEB_MSGS_WELCOME_MESSAGE;

        case 10026: 
            return WEB_USER_NEWS_APP_UPSELL;

        case 10027: 
            return WEB_INTL_PIN_USER_ED;

        case 10028: 
            return WEB_FACEBOOK_CONNECT_HERO;

        case 10029: 
            return WEB_FACEBOOK_PUBLISH_HERO;

        case 10030: 
            return WEB_HOMEFEED_CAROUSEL;

        case 10031: 
            return WEB_REBUILD_FEED;

        case 10032: 
            return WEB_GUIDED_SEARCH_HEADER_USER_ED;

        case 10033: 
            return WEB_GUIDED_SEARCH_USER_ED;

        case 10034: 
            return WEB_BOARD_BULK_EDIT_ED;

        case 10035: 
            return WEB_FLEXIBLE_SET_UP;

        case 10036: 
            return WEB_SURVEY_201501;

        case 10037: 
            return WEB_PINVITATIONAL_HOMEFEED_MODAL;

        case 10038: 
            return WEB_SURVEY_201504;

        case 10039: 
            return WEB_PROMPT_INTEREST_SEARCH_REBUILD_FEED;

        case 10040: 
            return WEB_NEW_USER_SURVEY_201504;

        case 10041: 
            return WEB_RESURRECTED_USER_SURVEY_201505;

        case 10042: 
            return WEB_FREE_RESPONSE_USER_SURVEY_201505;

        case 10043: 
            return WEB_ADS_SURVEY_201507;

        case 10044: 
            return WEB_SURVEY_BR_201509;

        case 10045: 
            return WEB_SURVEY_DE_201509;

        case 10046: 
            return WEB_SURVEY_FR_201509;

        case 10047: 
            return WEB_SURVEY_JP_201509;

        case 10048: 
            return WEB_SURVEY_UK_201509;

        case 10049: 
            return WEB_SURVEY_US_201509;

        case 10050: 
            return WEB_HERO_INVITE_FRIENDS;

        case 10051: 
            return WEB_HERO_EMPTY_HOMEFEED;

        case 10052: 
            return WEB_HERO_INSTALL_APP;

        case 10053: 
            return WEB_HERO_PINIT_BUTTON;

        case 10054: 
            return WEB_HERO_LANGUAGE;

        case 10055: 
            return WEB_HERO_PINIT_WEBMASTER;

        case 10056: 
            return WEB_HERO_PLACE_PINS;

        case 10057: 
            return WEB_HERO_PLACE_PINS_BOARD;

        case 10058: 
            return WEB_HERO_HOLIDAY_GUIDE;

        case 10059: 
            return WEB_HERO_VALENTINES;

        case 10060: 
            return WEB_HERO_INSTALL_EXTENSION;

        case 10061: 
            return WEB_HERO_LANGUAGE_BROWSER_SAFE;

        case 10062: 
            return WEB_HERO_PINIT_BUTTON_INTERNATIONAL;

        case 10063: 
            return WEB_HERO_CONVERT_TO_BUSINESS;

        case 10064: 
            return WEB_HERO_PROMOTE_A_PIN;

        case 10065: 
            return WEB_HERO_WORLD_CUP;

        case 10066: 
            return WEB_HERO_SCOOTER_PINNER_STORY;

        case 10067: 
            return WEB_HERO_PROMOTED_PINS_BETA_REMINDER;

        case 10068: 
            return WEB_HERO_NEW_ANALYTICS_NAG;

        case 10069: 
            return WEB_HERO_APP_UPSELL;

        case 10070: 
            return WEB_HERO_NEW_ANALYTICS_CONVERT_TO_BIZ_NAG;

        case 10071: 
            return WEB_HERO_EMMY_AWARDS;

        case 10072: 
            return WEB_HERO_PROMPT_REBUILD_FEED;

        case 10073: 
            return WEB_HERO_UNDO_REBUILD_FEED;

        case 10074: 
            return WEB_HERO_ADS_PRIVACY_UPDATE;

        case 10075: 
            return WEB_HERO_BUSINESS_HOLIDAY_BOARD_NAG;

        case 10076: 
            return WEB_HERO_PINNER_HOLIDAY_BOARD_NAG;

        case 10077: 
            return WEB_HOME_HERO_PROMOTED_PINS_BETA_REMINDER;

        case 10078: 
            return WEB_HERO_PINVITATIONAL_INVITE_NAG;

        case 10079: 
            return WEB_HERO_REBUILD_EMPTY_HOME_FEED;

        case 10080: 
            return WEB_HERO_WEB_PUSH_NOTIFICATION_NAG;

        case 10081: 
            return WEB_HERO_WEEK_INVITER_NAG;

        case 10082: 
            return WEB_HERO_CONVERT_TO_BUSINESS_REDUX;

        case 10083: 
            return WEB_HERO_CPE_PROMOTED_PINS_INVITE;

        case 10084: 
            return WEB_HOME_HERO_CPE_PROMOTED_PINS_INVITE;

        case 10085: 
            return WEB_HERO_FIX_EMAIL_NAG;

        case 10086: 
            return WEB_PARTNER_PERFORMANCE_HERO;

        case 10087: 
            return WEB_HERO_BID_GUIDANCE;

        case 10088: 
            return WEB_HOME_HERO_BID_GUIDANCE;

        case 10089: 
            return WEB_PARTNER_PERFORMANCE_HERO_V2;

        case 10090: 
            return WEB_HERO_BUYABLE_PIN_FROM_EMAIL;

        case 10100: 
            return WEB_PIN_SUCCESS_NEW_EXTENSION_UPSELL;

        case 10101: 
            return WEB_PIN_SUCCESS_EXTENSION_ED_DOMAIN;

        case 10102: 
            return WEB_PIN_SUCCESS_EXTENSION_ED_ODD_CONTENTS;

        case 10103: 
            return WEB_PIN_SUCCESS_EXTENSION_ED_CATEGORY_BOXED;

        case 10104: 
            return WEB_PIN_SUCCESS_EXTENSION_ED_BOARD_BOXED;

        case 10105: 
            return WEB_FLEXIBLE_NUX;

        case 10106: 
            return WEB_NUX_CORE_CONCEPTS_JAPAN;

        case 10107: 
            return WEB_NUX_CORE_CONCEPTS_M5;

        case 10108: 
            return WEB_SEO_NUX;

        case 10200: 
            return WEB_NAG_ADS_PRIVACY_UPDATE;

        case 10201: 
            return WEB_NAG_LIMITED_LOGIN;

        case 10202: 
            return WEB_NAG_CHROME_PUSH;

        case 10203: 
            return WEB_NAG_LIMITED_LOGIN_V2;

        case 10204: 
            return WEB_NAG_LOCALE_CHANGED_NOTIFICATION;

        case 10205: 
            return WEB_NAG_PARTNER_CONFIRM_WEBSITE;

        case 10206: 
            return WEB_NAG_SUBDOMAIN_REDIRECT;

        case 11000: 
            return WEB_QA_CLOSEUP_USER_ED;

        case 11001: 
            return WEB_QA_CLOSEUP_NOTIFICATION_USER_ED;

        case 11002: 
            return WEB_EMPTY_BOARD_ED;

        case 11003: 
            return WEB_EMPTY_PROFILE_ED;

        case 11004: 
            return WEB_EMPTY_BOARD_ED_MANUAL;

        case 11005: 
            return WEB_EMPTY_PROFILE_ED_MANUAL;

        case 11006: 
            return WEB_HOME_FEED_ED;

        case 11007: 
            return WEB_REPIN_ED;

        case 11008: 
            return WEB_HOME_FEED_ED_MANUAL;

        case 11009: 
            return WEB_REPIN_ED_MANUAL;

        case 11010: 
            return WEB_CLICKTHROUGH_ED;

        case 11011: 
            return WEB_CLICKTHROUGH_ED_MANUAL;

        case 11012: 
            return WEB_HOME_FEED_ED_V2;

        case 11013: 
            return WEB_HOME_FEED_ED_V2_MANUAL;

        case 11014: 
            return WEB_BOARD_FOLLOW_ED;

        case 11015: 
            return WEB_BOARD_FOLLOW_ED_MANUAL;

        case 11016: 
            return WEB_PROFILE_FOLLOW_ED;

        case 11017: 
            return WEB_PROFILE_FOLLOW_ED_MANUAL;

        case 11018: 
            return WEB_PIN_CREATE_SUCCESS_EXTENSION_UPSELL;

        case 11019: 
            return WEB_SEO_NUX_HOMEFEED_WELCOME;

        case 11020: 
            return WEB_SEO_NUX_FIRST_PIN_TOOLTIP;

        case 11021: 
            return WEB_SEO_NUX_FIRST_CLICKTHROUGH_TOOLTIP;

        case 11022: 
            return WEB_SEO_NUX_CREATE_BOARD;

        case 11023: 
            return WEB_SEO_NUX_HOMEFEED_PIN_SUCCESS_BANNER;

        case 11024: 
            return WEB_FLASHLIGHT_ED;

        case 11025: 
            return WEB_FLASHLIGHT_ED_MANUAL;

        case 11026: 
            return WEB_FLASHLIGHT_ED_PULSER;

        case 11100: 
            return WEB_SURVEY_WOM;

        case 11101: 
            return WEB_SURVEY_SEARCH;

        case 12000: 
            return WEB_UNAUTH_PIN_CLOSEUP;

        case 13000: 
            return WEB_NOTIFICATION_NAG_CHROME_PUSH;

        case 14000: 
            return WEB_EU_COOKIE_BANNER;

        case 15000: 
            return WEB_ADD_PIN_EXTENSION_INSTALL_MODAL;

        case 19999: 
            return WEB_TEST;

        case 20000: 
            return IOS_NOOP;

        case 20001: 
            return IOS_NAG_CONFIRM_EMAIL;

        case 20002: 
            return IOS_NAG_PLACE_PINS;

        case 20003: 
            return IOS_NAG_INVITER;

        case 20004: 
            return IOS_NUX_FIRST_PIN;

        case 20005: 
            return IOS_NUX_MANDATORY;

        case 20006: 
            return IOS_HOME_WELCOME_HELPER;

        case 20007: 
            return IOS_PINS_LIVE_PROFILE_HELPER;

        case 20008: 
            return IOS_NAG_WRITE_BANNED;

        case 20009: 
            return IOS_NAG_CONFIRM_EMAIL_V3_5_1;

        case 20010: 
            return IOS_QA_EDUCATION;

        case 20011: 
            return IOS_CONTACTS_PERMISSIONS;

        case 20012: 
            return IOS_CONTACTS_AND_FACEBOOK_PERMISSIONS;

        case 20013: 
            return IOS_UPDATE_APP_HELPER;

        case 20014: 
            return IOS_EMPTY_BOARD_ED;

        case 20015: 
            return IOS_EMPTY_USER_PROFILE_ED;

        case 20016: 
            return IOS_EMPTY_BOARD_ED_HELPER;

        case 20017: 
            return IOS_EMPTY_USER_PROFILE_ED_HELPER;

        case 20018: 
            return IOS_QA_NOTIFICATION_EDUCATION;

        case 20019: 
            return IOS_NUX_MANDATORY_MEN;

        case 20020: 
            return IOS_NUX_MANDATORY_WOMEN;

        case 20021: 
            return IOS_MSGS_NOTIFICATIONS_USER_ED;

        case 20022: 
            return IOS_MSGS_MESSAGE_LIST_USER_ED;

        case 20023: 
            return IOS_MSGS_MESSAGE_USER_ED;

        case 20024: 
            return IOS_MSGS_NOTIFICATIONS_USER_ED_IPAD;

        case 20025: 
            return IOS_MSGS_MESSAGE_USER_ED_IPAD;

        case 20026: 
            return IOS_MSGS_WELCOME_MESSAGE;

        case 20027: 
            return IOS_EMMY_AWARDS;

        case 20028: 
            return IOS_NAG_ADS_PRIVACY_UPDATE;

        case 20029: 
            return IOS_REPIN_ED;

        case 20030: 
            return IOS_REPIN_ED_HELPER;

        case 20031: 
            return IOS_REPIN_ED_IPAD;

        case 20032: 
            return IOS_REPIN_ED_HELPER_IPAD;

        case 20033: 
            return IOS_HOME_FEED_ED;

        case 20034: 
            return IOS_HOME_FEED_ED_HELPER;

        case 20035: 
            return IOS_NAG_REBUILD_FEED;

        case 20036: 
            return IOS_NAG_UNDO_REBUILD_FEED;

        case 20037: 
            return IOS_NUX_REBUILD_FEED;

        case 20038: 
            return IOS_CREATE_BUTTON_ED;

        case 20039: 
            return IOS_PUSH_NOTIFICATION_PERMISSION_PROMPT;

        case 20040: 
            return IOS_BOARD_FOLLOW_ED;

        case 20041: 
            return IOS_BOARD_FOLLOW_ED_HELPER;

        case 20042: 
            return IOS_PROFILE_FOLLOW_ED;

        case 20043: 
            return IOS_PROFILE_FOLLOW_ED_HELPER;

        case 20044: 
            return IOS_CLICKTHROUGH_ED;

        case 20045: 
            return IOS_CLICKTHROUGH_ED_HELPER;

        case 20046: 
            return IOS_COMBINED_SEARCH_ED;

        case 20047: 
            return IOS_COMBINED_SEARCH_ED_HELPER;

        case 20048: 
            return IOS_GUIDED_SEARCH_ED;

        case 20049: 
            return IOS_GUIDED_SEARCH_ED_HELPER;

        case 20050: 
            return IOS_CONTEXTUAL_MENU_ED;

        case 20051: 
            return IOS_MSGS_SEND_PIN_ED;

        case 20052: 
            return IOS_MSGS_SEND_PIN_ED_HELPER;

        case 20053: 
            return IOS_NAG_PINVITATIONAL;

        case 20054: 
            return IOS_NAG_PINVITATIONAL_REFRESH;

        case 20055: 
            return IOS_PINVITATIONAL_HOME_FEED_MODAL;

        case 20056: 
            return IOS_NUX_FIRST_BOARD;

        case 20057: 
            return IOS_NUX_BUILD_HOMEFEED;

        case 20058: 
            return IOS_NUX_SEARCH_WELCOME_HELPER;

        case 20059: 
            return IOS_NUX_SEARCH_LIVE_PROFILE_HELPER;

        case 20060: 
            return IOS_NUX_INTEREST_PICKER;

        case 20061: 
            return IOS_IN_APP_SURVEY;

        case 20062: 
            return IOS_SHARE_EXTENSION_EDUCATION;

        case 20063: 
            return IOS_SCREENSHOT_ED;

        case 20064: 
            return IOS_NUX_CORE_CONCEPTS_JAPAN_FEMALE;

        case 20065: 
            return IOS_NUX_CORE_CONCEPTS_JAPAN_MALE;

        case 20066: 
            return IOS_NAG_GLOBAL_INVITER;

        case 20067: 
            return IOS_PROFILE_HOME_FEED_HELPER;

        case 20068: 
            return IOS_COMMERCE_EDUCATION;

        case 20069: 
            return IOS_NOTIFICATION_PANE_PERMISSION_NAG;

        case 20070: 
            return IOS_SHARE_EXTENSION_EDUCATION_HOMEFEED_FULL_TAKEOVER;

        case 20071: 
            return IOS_SHARE_EXTENSION_EDUCATION_HOMEFEED_PARTIAL_TAKEOVER;

        case 20072: 
            return IOS_SHARE_EXTENSION_EDUCATION_PROFILE_PARTIAL_TAKEOVER;

        case 20073: 
            return IOS_NUX_FIRST_CLICKTHROUGH;

        case 20074: 
            return IOS_UNSEEN_NOTIFICATION_HOMEFEED_TOASTER;

        case 20075: 
            return IOS_NAG_APPLE_APP_STORE;

        case 20076: 
            return IOS_NUX_CORE_CONCEPTS_M5;

        case 20077: 
            return IOS_COMMERCE_HOMEFEED_EDUCATION;

        case 20078: 
            return IOS_COMMERCE_SEARCH_EDUCATION;

        case 20079: 
            return IOS_COMMERCE_CLOSEUP_BUY_EDUCATION;

        case 20080: 
            return IOS_COMMERCE_CHECKOUT_EDUCATION;

        case 20081: 
            return IOS_FIRST_PIN_TOOLTIP;

        case 20082: 
            return IOS_FIRST_CLICKTHROUGH_TOOLTIP;

        case 20083: 
            return IOS_FIRST_PIN_REPIN;

        case 20084: 
            return IOS_FACEBOOK_TRENDING_PIN_TOAST;

        case 20085: 
            return IOS_OWN_EMPTY_BOARD_ED;

        case 20086: 
            return IOS_OWN_EMPTY_USER_PROFILE_ED;

        case 20087: 
            return IOS_OWN_EMPTY_BOARD_ED_HELPER;

        case 20088: 
            return IOS_OWN_EMPTY_USER_PROFILE_ED_HELPER;

        case 20089: 
            return IOS_FIRST_PIN_BOARD_CREATE;

        case 20090: 
            return IOS_COMMERCE_CLOSEUP_MERCHANT_EDUCATION;

        case 20091: 
            return IOS_FIRST_PIN_HOMEFEED_SCROLL_HELPER;

        case 20092: 
            return IOS_FIRST_PIN_HOMEFEED_CLOSEUP_HELPER;

        case 20093: 
            return IOS_FIRST_PIN_HOMEFEED_BUILDER_TOOLTIP;

        case 20094: 
            return IOS_NAG_COMMERCE_SHOP_OUR_PICKS;

        case 20095: 
            return IOS_FIRST_FLASHLIGHT_ED;

        case 20096: 
            return IOS_OWN_LIBRARY_PROFILE_ED;

        case 20097: 
            return IOS_OWN_LIBRARY_ALL_PINS_ED;

        case 20098: 
            return IOS_FIRST_FLASHLIGHT_ICON_ED;

        case 20099: 
            return IOS_HOME_FEED_PROFILE_TAB_TOOLTIP;

        case 20100: 
            return IOS_NUX_COLD_USE_CASES;

        case 20101: 
            return IOS_NUX_COLD_HOMEFEED_INTRO_TAKEOVER;

        case 20102: 
            return IOS_NUX_COLD_HOMEFEED_INTEREST_GIFTWRAP;

        case 20103: 
            return IOS_NUX_COLD_INTEREST_GIFTWRAP_TAKEOVER;

        case 29999: 
            return IOS_TEST;

        case 30000: 
            return ANDROID_NOOP;

        case 30001: 
            return ANDROID_HERO_EMPTY_HOMEFEED;

        case 30002: 
            return ANDROID_NAG_CONFIRM_EMAIL;

        case 30003: 
            return ANDROID_NAG_WRITE_BANNED;

        case 30004: 
            return ANDROID_NAG_INVITER;

        case 30005: 
            return ANDROID_EMPTY_BOARD_ED;

        case 30006: 
            return ANDROID_EMPTY_USER_PROFILE_ED;

        case 30007: 
            return ANDROID_QA_EDUCATION;

        case 30008: 
            return ANDROID_QA_NOTIFICATION_EDUCATION;

        case 30009: 
            return ANDROID_EMPTY_BOARD_ED_HELPER;

        case 30010: 
            return ANDROID_EMPTY_USER_PROFILE_ED_HELPER;

        case 30011: 
            return ANDROID_NUX_MANDATORY_MEN;

        case 30012: 
            return ANDROID_NUX_MANDATORY_WOMEN;

        case 30013: 
            return ANDROID_EMPTY_BOARD_ED_TABLET;

        case 30014: 
            return ANDROID_EMPTY_BOARD_ED_HELPER_TABLET;

        case 30015: 
            return ANDROID_EMPTY_USER_PROFILE_ED_TABLET;

        case 30016: 
            return ANDROID_EMPTY_USER_PROFILE_ED_HELPER_TABLET;

        case 30017: 
            return ANDROID_CLICKTHROUGH_ED;

        case 30018: 
            return ANDROID_MSGS_WELCOME_MESSAGE;

        case 30019: 
            return ANDROID_EMMY_AWARDS;

        case 30020: 
            return ANDROID_HOME_FEED_ED;

        case 30021: 
            return ANDROID_REPIN_ED;

        case 30022: 
            return ANDROID_NAG_ADS_PRIVACY_UPDATE;

        case 30023: 
            return ANDROID_HOME_FEED_ED_HELPER;

        case 30024: 
            return ANDROID_HOME_FEED_ED_TABLET;

        case 30025: 
            return ANDROID_HOME_FEED_ED_HELPER_TABLET;

        case 30026: 
            return ANDROID_REPIN_ED_HELPER;

        case 30027: 
            return ANDROID_REPIN_ED_TABLET;

        case 30028: 
            return ANDROID_REPIN_ED_HELPER_TABLET;

        case 30029: 
            return ANDROID_CLICKTHROUGH_ED_HELPER;

        case 30030: 
            return ANDROID_CLICKTHROUGH_ED_TABLET;

        case 30031: 
            return ANDROID_CLICKTHROUGH_ED_HELPER_TABLET;

        case 30032: 
            return ANDROID_NAG_CONNECT_FACEBOOK;

        case 30033: 
            return ANDROID_NAG_UPLOAD_CONTACTS;

        case 30034: 
            return ANDROID_BOARD_FOLLOW_ED;

        case 30035: 
            return ANDROID_BOARD_FOLLOW_ED_HELPER;

        case 30036: 
            return ANDROID_BOARD_FOLLOW_ED_TABLET;

        case 30037: 
            return ANDROID_BOARD_FOLLOW_ED_HELPER_TABLET;

        case 30038: 
            return ANDROID_PROFILE_FOLLOW_ED;

        case 30039: 
            return ANDROID_PROFILE_FOLLOW_ED_HELPER;

        case 30040: 
            return ANDROID_PROFILE_FOLLOW_ED_TABLET;

        case 30041: 
            return ANDROID_PROFILE_FOLLOW_ED_HELPER_TABLET;

        case 30042: 
            return ANDROID_HERO_PROMPT_REBUILD_FEED;

        case 30043: 
            return ANDROID_HERO_UNDO_REBUILD_FEED;

        case 30044: 
            return ANDROID_NUX_REBUILD_FEED;

        case 30045: 
            return ANDROID_SURVEY_201501;

        case 30046: 
            return ANDROID_NAG_PINVITATIONAL;

        case 30047: 
            return ANDROID_PINVITATIONAL_CONFIRM_BOARD;

        case 30048: 
            return ANDROID_REPIN_ED_V2;

        case 30049: 
            return ANDROID_REPIN_ED_V2_HELPER;

        case 30050: 
            return ANDROID_PINVITATIONAL_HOME_FEED_MODAL;

        case 30051: 
            return ANDROID_HOME_FEED_ED_V2;

        case 30052: 
            return ANDROID_HOME_FEED_ED_V2_HELPER;

        case 30053: 
            return ANDROID_SURVEY_201504;

        case 30054: 
            return ANDROID_NEW_USER_SURVEY_201504;

        case 30055: 
            return ANDROID_RESURRECTED_USER_SURVEY_201505;

        case 30056: 
            return ANDROID_NAG_GLOBAL_INVITER;

        case 30057: 
            return ANDROID_FREE_RESPONSE_USER_SURVEY_201505;

        case 30058: 
            return ANDROID_PROFILE_OFFLINE_PIN_ED;

        case 30059: 
            return ANDROID_SHARE_SHEET_EXTENSION_ED;

        case 30060: 
            return ANDROID_ADS_SURVEY_201507;

        case 30061: 
            return ANDROID_NUX_FIRST_PIN;

        case 30062: 
            return ANDROID_HOME_FIRST_PIN_CLOSEUP_PROMPT;

        case 30063: 
            return ANDROID_NUX_CORE_CONCEPTS_M5;

        case 30064: 
            return ANDROID_HOMEFEED_BUILDER_TOOLTIP;

        case 30065: 
            return ANDROID_SURVEY_WOM;

        case 30066: 
            return ANDROID_HOME_FEED_PROFILE_TAB_TOOLTIP;

        case 30067: 
            return ANDROID_OWN_LIBRARY_PROFILE_ED;

        case 30068: 
            return ANDROID_OWN_LIBRARY_ALL_PINS_ED;

        case 30069: 
            return ANDROID_COMMERCE_HOME_FEED_ED;

        case 30070: 
            return ANDROID_COMMERCE_CLOSEUP_BUY_ED;

        case 30071: 
            return ANDROID_COMMERCE_CHECKOUT_ED;

        case 30072: 
            return ANDROID_COMMERCE_SEARCH_ED;

        case 30073: 
            return ANDROID_COMMERCE_CLOSEUP_MERCHANT_ED;

        case 30074: 
            return ANDROID_PINIT_BTN_TOOLTIP;

        case 30075: 
            return ANDROID_CLICKTHROUGH_BTN_TOOLTIP;

        case 30076: 
            return ANDROID_FIRST_PIN_SCROLL_PROMPT;

        case 30077: 
            return ANDROID_FIRST_PIN_TAP_PROMPT;

        case 30078: 
            return ANDROID_FLASHLIGHT_BUTTON_TOOLTIP;

        case 30079: 
            return ANDROID_FIRST_FLASHLIGHT_ED;

        case 30080: 
            return ANDROID_SHARE_EXTENSION_EDUCATION_HOMEFEED_PARTIAL_TAKEOVER;

        case 30081: 
            return ANDROID_WARM_SEO_NUX_HOMEFEED_INTRO;

        case 30082: 
            return ANDROID_WARM_SEO_NUX_GIFTWRAP_INTEREST_PICKER;

        case 30083: 
            return ANDROID_STATEMENT_CREDIT_HOME_FEED;

        case 30084: 
            return ANDROID_STATEMENT_CREDIT_PIN_CLOSEUP;

        case 30085: 
            return ANDROID_STATEMENT_CREDIT_CHECKOUT;

        case 40000: 
            return WEB_MOBILE_NOOP;

        case 40001: 
            return WEB_MOBILE_NUX_MANDATORY;

        case 40002: 
            return WEB_MOBILE_NUX_INTERESTS;

        case 50000: 
            return PUSH_NOTIFICATION_NOOP;

        case 50001: 
            return PUSH_NOTIFICATION_SIMILAR_REPINS;

        case 50002: 
            return PUSH_NOTIFICATION_PIN_TWINS;

        case 50003: 
            return PUSH_NOTIFICATION_FRIEND_PIN;

        case 60000: 
            return ANALYTICS_NOOP;

        case 60001: 
            return ANALYTICS_HOME_USER_ED;

        case 60002: 
            return ANALYTICS_AUDIENCE_SELECTOR_USER_ED;

        case 70000: 
            return EMAIL_NOOP;

        case 70001: 
            return EMAIL_USER_ED_TIP_EMPTY_BOARD;

        case 70002: 
            return EMAIL_USER_ED_TIP_REPIN;

        case 70003: 
            return EMAIL_USER_ED_TIP_CLICKTHROUGH;

        case 70004: 
            return EMAIL_USER_ED_TIP_SEARCH;

        case 70005: 
            return EMAIL_USER_ED_TIP_EMAIL_VERIFY;

        case 70006: 
            return EMAIL_USER_ED_TIP_PIN_CREATE;

        case 70007: 
            return EMAIL_USER_ED_TIP_PINIT_BUTTON;

        case 80000: 
            return BATCH_NOOP;

        case 80001: 
            return BATCH_EMAIL_FIRST_BOARD_CREATE;

        case 80002: 
            return BATCH_EMAIL_INTEREST_RECOMMENDATIONS;

        case 80003: 
            return BATCH_EMAIL_EMPTY_BOARD;

        case 80004: 
            return BATCH_EMAIL_GUIDED_SEARCH;

        case 80005: 
            return BATCH_EMAIL_FIRST_PIN_CREATE;

        case 80006: 
            return BATCH_EMAIL_FIRST_CLICKTHROUGH;

        case 80007: 
            return BATCH_EMAIL_MOBILE_APP_DOWNLOAD;

        case 80008: 
            return BATCH_EMAIL_POPULAR_PINS;

        case 80009: 
            return BATCH_PUSH_NOTIFICATION_HOLIDAY_GUIDE;

        case 80010: 
            return BATCH_PUSH_NOTIFICATION_ATHELETES_OUTDOORS;

        case 80011: 
            return BATCH_PUSH_NOTIFICATION_GARDENING;

        case 80012: 
            return BATCH_PUSH_NOTIFICATION_FOOD;

        case 80013: 
            return BATCH_PUSH_NOTIFICATION_KIDS;

        case 80014: 
            return BATCH_PUSH_NOTIFICATION_CREATE_RESOLUTION_BOARD;

        case 80015: 
            return BATCH_PUSH_NOTIFICATION_RESOLUTION_IDEAS;

        case 80016: 
            return BATCH_PUSH_NOTIFICATION_SHARE_BOARD;

        case 80017: 
            return BATCH_EMAIL_HOMEFEED_NEW_PINS;

        case 80018: 
            return BATCH_PUSH_NOTIFICATION_NEW_USER_DAY_1;

        case 80019: 
            return BATCH_PUSH_NOTIFICATION_NEW_USER_DAY_2;

        case 80020: 
            return BATCH_PUSH_NOTIFICATION_NEW_USER_DAY_3;

        case 80021: 
            return BATCH_NETWORK_STORY_VALENTINE;

        case 80022: 
            return BATCH_EMAIL_PIN_ON_ANOTHER_BOARD;

        case 80023: 
            return BATCH_NETWORK_STORY_FATHERS_DAY;

        case 80024: 
            return BATCH_NETWORK_STORY_BACK_TO_SCHOOL_PARENTS;

        case 80025: 
            return BATCH_NETWORK_STORY_BACK_TO_SCHOOL_TEACHERS;

        case 80026: 
            return BATCH_NETWORK_STORY_SHOP_OUR_PICKS;

        case 80027: 
            return BATCH_NETWORK_STORY_GAME_DAY;

        case 80033: 
            return BATCH_EMAIL_PIN_TWINS;

        case 80034: 
            return BATCH_EMAIL_NON_NUX_INTEREST_RECOMMENDATIONS;

        case 80035: 
            return BATCH_EMAIL_BOARD_CREATE_RECOMMENDATIONS;

        case 80036: 
            return BATCH_EMAIL_BOARD_FOLLOW_RECOMMENDATIONS;

        case 80037: 
            return BATCH_EMAIL_NETWORK_STORY_DIGEST;

        case 80038: 
            return BATCH_EMAIL_FIND_FRIEND;

        case 80039: 
            return BATCH_EMAIL_EDITORIAL_POPULAR_PINS;

        case 80040: 
            return BATCH_EMAIL_PROMOTE_GOODIES;

        case 80041: 
            return BATCH_EMAIL_EDITORIAL;

        case 80042: 
            return BATCH_EMAIL_POPULAR_PINS_M5;

        case 80043: 
            return BATCH_PUSH_NOTIFICATION_NUJ_BUILD_HOMEFEED;

        case 80044: 
            return BATCH_EMAIL_FRIENDS_INTERESTS;

        case 80045: 
            return BATCH_EMAIL_EDITORIAL_POPULAR_PINS_M5;

        case 80046: 
            return BATCH_EMAIL_RECOMMENDATIONS_DIGEST;

        case 80047: 
            return BATCH_EMAIL_TRENDING_PINS;

        case 80048: 
            return BATCH_EMAIL_DORMANT_BOARD_RECOMMENDATIONS;

        case 80049: 
            return BATCH_EMAIL_NO_SIGNAL;

        case 80050: 
            return BATCH_EMAIL_PIN_PRICE_DROP;

        case 80051: 
            return BATCH_EMAIL_PIN_BECOMES_BUYABLE;

        case 80052: 
            return BATCH_EMAIL_PIN_FREE_SHIPPING;

        case 80053: 
            return BATCH_EMAIL_TRENDING_SEARCHES;

        case 80054: 
            return BATCH_EMAIL_CART_ABANDONMENT;

        case 90000: 
            return STERLING_NOOP;

        case 90001: 
            return STERLING_DASHBOARD_USER_ED;

        case 100000: 
            return CAMPBELL_SIDE_NAV_USER_ED;

        case 110000: 
            return HOMEFEED_NOOP;

        case 110001: 
            return HOMEFEED_SEO_BOARD_MULTI_BOARDS;

        case 110002: 
            return HOMEFEED_CELEB_TOPIC_MULTI_BOARDS;

        case 110003: 
            return HOMEFEED_LOCAL_TOPIC_MULTI_BOARDS;
        }
    }

    public static Experience valueOf(String s)
    {
        return (Experience)Enum.valueOf(com/pinterest/schemas/experiences/Experience, s);
    }

    public static Experience[] values()
    {
        return (Experience[])$VALUES.clone();
    }

    public final int getValue()
    {
        return value;
    }

    static 
    {
        NOOP = new Experience("NOOP", 0, 1);
        CONFIRM_EMAIL = new Experience("CONFIRM_EMAIL", 1, 2);
        WEB_NOOP = new Experience("WEB_NOOP", 2, 10000);
        WEB_FEED_EDITOR_USER_ED = new Experience("WEB_FEED_EDITOR_USER_ED", 3, 10001);
        WEB_PIN_CLOSEUP_LITE = new Experience("WEB_PIN_CLOSEUP_LITE", 4, 10002);
        WEB_PIN_CLOSEUP_AUTOBAHN = new Experience("WEB_PIN_CLOSEUP_AUTOBAHN", 5, 10003);
        WEB_MANDATORY_AUTOBAHN = new Experience("WEB_MANDATORY_AUTOBAHN", 6, 10004);
        WEB_FIRST_PIN_SUCCESS = new Experience("WEB_FIRST_PIN_SUCCESS", 7, 10005);
        WEB_SEARCH_DISCOVER_TOOLTIP = new Experience("WEB_SEARCH_DISCOVER_TOOLTIP", 8, 10006);
        WEB_FIRST_FOLLOW = new Experience("WEB_FIRST_FOLLOW", 9, 10007);
        WEB_PINIT_BOOKMARKLET = new Experience("WEB_PINIT_BOOKMARKLET", 10, 10008);
        WEB_BLANK_SESSION = new Experience("WEB_BLANK_SESSION", 11, 10009);
        WEB_FIRST_PIN_USER_ED = new Experience("WEB_FIRST_PIN_USER_ED", 12, 10010);
        WEB_YOUR_BOARDS_USER_ED = new Experience("WEB_YOUR_BOARDS_USER_ED", 13, 10011);
        WEB_FAST_FOLLOW_USER_ED = new Experience("WEB_FAST_FOLLOW_USER_ED", 14, 10012);
        WEB_FIND_FRIENDS_USER_ED = new Experience("WEB_FIND_FRIENDS_USER_ED", 15, 10013);
        WEB_CATEGORY_SEARCH_USER_ED = new Experience("WEB_CATEGORY_SEARCH_USER_ED", 16, 10014);
        WEB_PLACE_PINS_TOOLTIP = new Experience("WEB_PLACE_PINS_TOOLTIP", 17, 10015);
        WEB_EMPTY_PLACES_BOARD_USER_ED = new Experience("WEB_EMPTY_PLACES_BOARD_USER_ED", 18, 10016);
        WEB_FILLED_PLACES_BOARD_USER_ED = new Experience("WEB_FILLED_PLACES_BOARD_USER_ED", 19, 10017);
        WEB_FIRST_BOARD_USER_ED = new Experience("WEB_FIRST_BOARD_USER_ED", 20, 10018);
        WEB_EXPLORE_BUTTON_USER_ED = new Experience("WEB_EXPLORE_BUTTON_USER_ED", 21, 10019);
        WEB_EXPLORE_PAGE_USER_ED = new Experience("WEB_EXPLORE_PAGE_USER_ED", 22, 10020);
        WEB_MODERN_HEADER_USER_ED = new Experience("WEB_MODERN_HEADER_USER_ED", 23, 10021);
        WEB_PIN_SUCCESS_EXTENSION_UPSELL = new Experience("WEB_PIN_SUCCESS_EXTENSION_UPSELL", 24, 10022);
        WEB_EXPLORE_HEADER_USER_ED = new Experience("WEB_EXPLORE_HEADER_USER_ED", 25, 10023);
        WEB_VISUAL_OBJECT_SEARCH_CLOSEUP_USER_ED = new Experience("WEB_VISUAL_OBJECT_SEARCH_CLOSEUP_USER_ED", 26, 10024);
        WEB_MSGS_WELCOME_MESSAGE = new Experience("WEB_MSGS_WELCOME_MESSAGE", 27, 10025);
        WEB_USER_NEWS_APP_UPSELL = new Experience("WEB_USER_NEWS_APP_UPSELL", 28, 10026);
        WEB_INTL_PIN_USER_ED = new Experience("WEB_INTL_PIN_USER_ED", 29, 10027);
        WEB_FACEBOOK_CONNECT_HERO = new Experience("WEB_FACEBOOK_CONNECT_HERO", 30, 10028);
        WEB_FACEBOOK_PUBLISH_HERO = new Experience("WEB_FACEBOOK_PUBLISH_HERO", 31, 10029);
        WEB_HOMEFEED_CAROUSEL = new Experience("WEB_HOMEFEED_CAROUSEL", 32, 10030);
        WEB_REBUILD_FEED = new Experience("WEB_REBUILD_FEED", 33, 10031);
        WEB_GUIDED_SEARCH_HEADER_USER_ED = new Experience("WEB_GUIDED_SEARCH_HEADER_USER_ED", 34, 10032);
        WEB_GUIDED_SEARCH_USER_ED = new Experience("WEB_GUIDED_SEARCH_USER_ED", 35, 10033);
        WEB_BOARD_BULK_EDIT_ED = new Experience("WEB_BOARD_BULK_EDIT_ED", 36, 10034);
        WEB_FLEXIBLE_SET_UP = new Experience("WEB_FLEXIBLE_SET_UP", 37, 10035);
        WEB_SURVEY_201501 = new Experience("WEB_SURVEY_201501", 38, 10036);
        WEB_PINVITATIONAL_HOMEFEED_MODAL = new Experience("WEB_PINVITATIONAL_HOMEFEED_MODAL", 39, 10037);
        WEB_SURVEY_201504 = new Experience("WEB_SURVEY_201504", 40, 10038);
        WEB_PROMPT_INTEREST_SEARCH_REBUILD_FEED = new Experience("WEB_PROMPT_INTEREST_SEARCH_REBUILD_FEED", 41, 10039);
        WEB_NEW_USER_SURVEY_201504 = new Experience("WEB_NEW_USER_SURVEY_201504", 42, 10040);
        WEB_RESURRECTED_USER_SURVEY_201505 = new Experience("WEB_RESURRECTED_USER_SURVEY_201505", 43, 10041);
        WEB_FREE_RESPONSE_USER_SURVEY_201505 = new Experience("WEB_FREE_RESPONSE_USER_SURVEY_201505", 44, 10042);
        WEB_ADS_SURVEY_201507 = new Experience("WEB_ADS_SURVEY_201507", 45, 10043);
        WEB_SURVEY_BR_201509 = new Experience("WEB_SURVEY_BR_201509", 46, 10044);
        WEB_SURVEY_DE_201509 = new Experience("WEB_SURVEY_DE_201509", 47, 10045);
        WEB_SURVEY_FR_201509 = new Experience("WEB_SURVEY_FR_201509", 48, 10046);
        WEB_SURVEY_JP_201509 = new Experience("WEB_SURVEY_JP_201509", 49, 10047);
        WEB_SURVEY_UK_201509 = new Experience("WEB_SURVEY_UK_201509", 50, 10048);
        WEB_SURVEY_US_201509 = new Experience("WEB_SURVEY_US_201509", 51, 10049);
        WEB_HERO_INVITE_FRIENDS = new Experience("WEB_HERO_INVITE_FRIENDS", 52, 10050);
        WEB_HERO_EMPTY_HOMEFEED = new Experience("WEB_HERO_EMPTY_HOMEFEED", 53, 10051);
        WEB_HERO_INSTALL_APP = new Experience("WEB_HERO_INSTALL_APP", 54, 10052);
        WEB_HERO_PINIT_BUTTON = new Experience("WEB_HERO_PINIT_BUTTON", 55, 10053);
        WEB_HERO_LANGUAGE = new Experience("WEB_HERO_LANGUAGE", 56, 10054);
        WEB_HERO_PINIT_WEBMASTER = new Experience("WEB_HERO_PINIT_WEBMASTER", 57, 10055);
        WEB_HERO_PLACE_PINS = new Experience("WEB_HERO_PLACE_PINS", 58, 10056);
        WEB_HERO_PLACE_PINS_BOARD = new Experience("WEB_HERO_PLACE_PINS_BOARD", 59, 10057);
        WEB_HERO_HOLIDAY_GUIDE = new Experience("WEB_HERO_HOLIDAY_GUIDE", 60, 10058);
        WEB_HERO_VALENTINES = new Experience("WEB_HERO_VALENTINES", 61, 10059);
        WEB_HERO_INSTALL_EXTENSION = new Experience("WEB_HERO_INSTALL_EXTENSION", 62, 10060);
        WEB_HERO_LANGUAGE_BROWSER_SAFE = new Experience("WEB_HERO_LANGUAGE_BROWSER_SAFE", 63, 10061);
        WEB_HERO_PINIT_BUTTON_INTERNATIONAL = new Experience("WEB_HERO_PINIT_BUTTON_INTERNATIONAL", 64, 10062);
        WEB_HERO_CONVERT_TO_BUSINESS = new Experience("WEB_HERO_CONVERT_TO_BUSINESS", 65, 10063);
        WEB_HERO_PROMOTE_A_PIN = new Experience("WEB_HERO_PROMOTE_A_PIN", 66, 10064);
        WEB_HERO_WORLD_CUP = new Experience("WEB_HERO_WORLD_CUP", 67, 10065);
        WEB_HERO_SCOOTER_PINNER_STORY = new Experience("WEB_HERO_SCOOTER_PINNER_STORY", 68, 10066);
        WEB_HERO_PROMOTED_PINS_BETA_REMINDER = new Experience("WEB_HERO_PROMOTED_PINS_BETA_REMINDER", 69, 10067);
        WEB_HERO_NEW_ANALYTICS_NAG = new Experience("WEB_HERO_NEW_ANALYTICS_NAG", 70, 10068);
        WEB_HERO_APP_UPSELL = new Experience("WEB_HERO_APP_UPSELL", 71, 10069);
        WEB_HERO_NEW_ANALYTICS_CONVERT_TO_BIZ_NAG = new Experience("WEB_HERO_NEW_ANALYTICS_CONVERT_TO_BIZ_NAG", 72, 10070);
        WEB_HERO_EMMY_AWARDS = new Experience("WEB_HERO_EMMY_AWARDS", 73, 10071);
        WEB_HERO_PROMPT_REBUILD_FEED = new Experience("WEB_HERO_PROMPT_REBUILD_FEED", 74, 10072);
        WEB_HERO_UNDO_REBUILD_FEED = new Experience("WEB_HERO_UNDO_REBUILD_FEED", 75, 10073);
        WEB_HERO_ADS_PRIVACY_UPDATE = new Experience("WEB_HERO_ADS_PRIVACY_UPDATE", 76, 10074);
        WEB_HERO_BUSINESS_HOLIDAY_BOARD_NAG = new Experience("WEB_HERO_BUSINESS_HOLIDAY_BOARD_NAG", 77, 10075);
        WEB_HERO_PINNER_HOLIDAY_BOARD_NAG = new Experience("WEB_HERO_PINNER_HOLIDAY_BOARD_NAG", 78, 10076);
        WEB_HOME_HERO_PROMOTED_PINS_BETA_REMINDER = new Experience("WEB_HOME_HERO_PROMOTED_PINS_BETA_REMINDER", 79, 10077);
        WEB_HERO_PINVITATIONAL_INVITE_NAG = new Experience("WEB_HERO_PINVITATIONAL_INVITE_NAG", 80, 10078);
        WEB_HERO_REBUILD_EMPTY_HOME_FEED = new Experience("WEB_HERO_REBUILD_EMPTY_HOME_FEED", 81, 10079);
        WEB_HERO_WEB_PUSH_NOTIFICATION_NAG = new Experience("WEB_HERO_WEB_PUSH_NOTIFICATION_NAG", 82, 10080);
        WEB_HERO_WEEK_INVITER_NAG = new Experience("WEB_HERO_WEEK_INVITER_NAG", 83, 10081);
        WEB_HERO_CONVERT_TO_BUSINESS_REDUX = new Experience("WEB_HERO_CONVERT_TO_BUSINESS_REDUX", 84, 10082);
        WEB_HERO_CPE_PROMOTED_PINS_INVITE = new Experience("WEB_HERO_CPE_PROMOTED_PINS_INVITE", 85, 10083);
        WEB_HOME_HERO_CPE_PROMOTED_PINS_INVITE = new Experience("WEB_HOME_HERO_CPE_PROMOTED_PINS_INVITE", 86, 10084);
        WEB_HERO_FIX_EMAIL_NAG = new Experience("WEB_HERO_FIX_EMAIL_NAG", 87, 10085);
        WEB_PARTNER_PERFORMANCE_HERO = new Experience("WEB_PARTNER_PERFORMANCE_HERO", 88, 10086);
        WEB_HERO_BID_GUIDANCE = new Experience("WEB_HERO_BID_GUIDANCE", 89, 10087);
        WEB_HOME_HERO_BID_GUIDANCE = new Experience("WEB_HOME_HERO_BID_GUIDANCE", 90, 10088);
        WEB_PARTNER_PERFORMANCE_HERO_V2 = new Experience("WEB_PARTNER_PERFORMANCE_HERO_V2", 91, 10089);
        WEB_HERO_BUYABLE_PIN_FROM_EMAIL = new Experience("WEB_HERO_BUYABLE_PIN_FROM_EMAIL", 92, 10090);
        WEB_PIN_SUCCESS_NEW_EXTENSION_UPSELL = new Experience("WEB_PIN_SUCCESS_NEW_EXTENSION_UPSELL", 93, 10100);
        WEB_PIN_SUCCESS_EXTENSION_ED_DOMAIN = new Experience("WEB_PIN_SUCCESS_EXTENSION_ED_DOMAIN", 94, 10101);
        WEB_PIN_SUCCESS_EXTENSION_ED_ODD_CONTENTS = new Experience("WEB_PIN_SUCCESS_EXTENSION_ED_ODD_CONTENTS", 95, 10102);
        WEB_PIN_SUCCESS_EXTENSION_ED_CATEGORY_BOXED = new Experience("WEB_PIN_SUCCESS_EXTENSION_ED_CATEGORY_BOXED", 96, 10103);
        WEB_PIN_SUCCESS_EXTENSION_ED_BOARD_BOXED = new Experience("WEB_PIN_SUCCESS_EXTENSION_ED_BOARD_BOXED", 97, 10104);
        WEB_FLEXIBLE_NUX = new Experience("WEB_FLEXIBLE_NUX", 98, 10105);
        WEB_NUX_CORE_CONCEPTS_JAPAN = new Experience("WEB_NUX_CORE_CONCEPTS_JAPAN", 99, 10106);
        WEB_NUX_CORE_CONCEPTS_M5 = new Experience("WEB_NUX_CORE_CONCEPTS_M5", 100, 10107);
        WEB_SEO_NUX = new Experience("WEB_SEO_NUX", 101, 10108);
        WEB_NAG_ADS_PRIVACY_UPDATE = new Experience("WEB_NAG_ADS_PRIVACY_UPDATE", 102, 10200);
        WEB_NAG_LIMITED_LOGIN = new Experience("WEB_NAG_LIMITED_LOGIN", 103, 10201);
        WEB_NAG_CHROME_PUSH = new Experience("WEB_NAG_CHROME_PUSH", 104, 10202);
        WEB_NAG_LIMITED_LOGIN_V2 = new Experience("WEB_NAG_LIMITED_LOGIN_V2", 105, 10203);
        WEB_NAG_LOCALE_CHANGED_NOTIFICATION = new Experience("WEB_NAG_LOCALE_CHANGED_NOTIFICATION", 106, 10204);
        WEB_NAG_PARTNER_CONFIRM_WEBSITE = new Experience("WEB_NAG_PARTNER_CONFIRM_WEBSITE", 107, 10205);
        WEB_NAG_SUBDOMAIN_REDIRECT = new Experience("WEB_NAG_SUBDOMAIN_REDIRECT", 108, 10206);
        WEB_QA_CLOSEUP_USER_ED = new Experience("WEB_QA_CLOSEUP_USER_ED", 109, 11000);
        WEB_QA_CLOSEUP_NOTIFICATION_USER_ED = new Experience("WEB_QA_CLOSEUP_NOTIFICATION_USER_ED", 110, 11001);
        WEB_EMPTY_BOARD_ED = new Experience("WEB_EMPTY_BOARD_ED", 111, 11002);
        WEB_EMPTY_PROFILE_ED = new Experience("WEB_EMPTY_PROFILE_ED", 112, 11003);
        WEB_EMPTY_BOARD_ED_MANUAL = new Experience("WEB_EMPTY_BOARD_ED_MANUAL", 113, 11004);
        WEB_EMPTY_PROFILE_ED_MANUAL = new Experience("WEB_EMPTY_PROFILE_ED_MANUAL", 114, 11005);
        WEB_HOME_FEED_ED = new Experience("WEB_HOME_FEED_ED", 115, 11006);
        WEB_REPIN_ED = new Experience("WEB_REPIN_ED", 116, 11007);
        WEB_HOME_FEED_ED_MANUAL = new Experience("WEB_HOME_FEED_ED_MANUAL", 117, 11008);
        WEB_REPIN_ED_MANUAL = new Experience("WEB_REPIN_ED_MANUAL", 118, 11009);
        WEB_CLICKTHROUGH_ED = new Experience("WEB_CLICKTHROUGH_ED", 119, 11010);
        WEB_CLICKTHROUGH_ED_MANUAL = new Experience("WEB_CLICKTHROUGH_ED_MANUAL", 120, 11011);
        WEB_HOME_FEED_ED_V2 = new Experience("WEB_HOME_FEED_ED_V2", 121, 11012);
        WEB_HOME_FEED_ED_V2_MANUAL = new Experience("WEB_HOME_FEED_ED_V2_MANUAL", 122, 11013);
        WEB_BOARD_FOLLOW_ED = new Experience("WEB_BOARD_FOLLOW_ED", 123, 11014);
        WEB_BOARD_FOLLOW_ED_MANUAL = new Experience("WEB_BOARD_FOLLOW_ED_MANUAL", 124, 11015);
        WEB_PROFILE_FOLLOW_ED = new Experience("WEB_PROFILE_FOLLOW_ED", 125, 11016);
        WEB_PROFILE_FOLLOW_ED_MANUAL = new Experience("WEB_PROFILE_FOLLOW_ED_MANUAL", 126, 11017);
        WEB_PIN_CREATE_SUCCESS_EXTENSION_UPSELL = new Experience("WEB_PIN_CREATE_SUCCESS_EXTENSION_UPSELL", 127, 11018);
        WEB_SEO_NUX_HOMEFEED_WELCOME = new Experience("WEB_SEO_NUX_HOMEFEED_WELCOME", 128, 11019);
        WEB_SEO_NUX_FIRST_PIN_TOOLTIP = new Experience("WEB_SEO_NUX_FIRST_PIN_TOOLTIP", 129, 11020);
        WEB_SEO_NUX_FIRST_CLICKTHROUGH_TOOLTIP = new Experience("WEB_SEO_NUX_FIRST_CLICKTHROUGH_TOOLTIP", 130, 11021);
        WEB_SEO_NUX_CREATE_BOARD = new Experience("WEB_SEO_NUX_CREATE_BOARD", 131, 11022);
        WEB_SEO_NUX_HOMEFEED_PIN_SUCCESS_BANNER = new Experience("WEB_SEO_NUX_HOMEFEED_PIN_SUCCESS_BANNER", 132, 11023);
        WEB_FLASHLIGHT_ED = new Experience("WEB_FLASHLIGHT_ED", 133, 11024);
        WEB_FLASHLIGHT_ED_MANUAL = new Experience("WEB_FLASHLIGHT_ED_MANUAL", 134, 11025);
        WEB_FLASHLIGHT_ED_PULSER = new Experience("WEB_FLASHLIGHT_ED_PULSER", 135, 11026);
        WEB_SURVEY_WOM = new Experience("WEB_SURVEY_WOM", 136, 11100);
        WEB_SURVEY_SEARCH = new Experience("WEB_SURVEY_SEARCH", 137, 11101);
        WEB_UNAUTH_PIN_CLOSEUP = new Experience("WEB_UNAUTH_PIN_CLOSEUP", 138, 12000);
        WEB_NOTIFICATION_NAG_CHROME_PUSH = new Experience("WEB_NOTIFICATION_NAG_CHROME_PUSH", 139, 13000);
        WEB_EU_COOKIE_BANNER = new Experience("WEB_EU_COOKIE_BANNER", 140, 14000);
        WEB_ADD_PIN_EXTENSION_INSTALL_MODAL = new Experience("WEB_ADD_PIN_EXTENSION_INSTALL_MODAL", 141, 15000);
        WEB_TEST = new Experience("WEB_TEST", 142, 19999);
        IOS_NOOP = new Experience("IOS_NOOP", 143, 20000);
        IOS_NAG_CONFIRM_EMAIL = new Experience("IOS_NAG_CONFIRM_EMAIL", 144, 20001);
        IOS_NAG_PLACE_PINS = new Experience("IOS_NAG_PLACE_PINS", 145, 20002);
        IOS_NAG_INVITER = new Experience("IOS_NAG_INVITER", 146, 20003);
        IOS_NUX_FIRST_PIN = new Experience("IOS_NUX_FIRST_PIN", 147, 20004);
        IOS_NUX_MANDATORY = new Experience("IOS_NUX_MANDATORY", 148, 20005);
        IOS_HOME_WELCOME_HELPER = new Experience("IOS_HOME_WELCOME_HELPER", 149, 20006);
        IOS_PINS_LIVE_PROFILE_HELPER = new Experience("IOS_PINS_LIVE_PROFILE_HELPER", 150, 20007);
        IOS_NAG_WRITE_BANNED = new Experience("IOS_NAG_WRITE_BANNED", 151, 20008);
        IOS_NAG_CONFIRM_EMAIL_V3_5_1 = new Experience("IOS_NAG_CONFIRM_EMAIL_V3_5_1", 152, 20009);
        IOS_QA_EDUCATION = new Experience("IOS_QA_EDUCATION", 153, 20010);
        IOS_CONTACTS_PERMISSIONS = new Experience("IOS_CONTACTS_PERMISSIONS", 154, 20011);
        IOS_CONTACTS_AND_FACEBOOK_PERMISSIONS = new Experience("IOS_CONTACTS_AND_FACEBOOK_PERMISSIONS", 155, 20012);
        IOS_UPDATE_APP_HELPER = new Experience("IOS_UPDATE_APP_HELPER", 156, 20013);
        IOS_EMPTY_BOARD_ED = new Experience("IOS_EMPTY_BOARD_ED", 157, 20014);
        IOS_EMPTY_USER_PROFILE_ED = new Experience("IOS_EMPTY_USER_PROFILE_ED", 158, 20015);
        IOS_EMPTY_BOARD_ED_HELPER = new Experience("IOS_EMPTY_BOARD_ED_HELPER", 159, 20016);
        IOS_EMPTY_USER_PROFILE_ED_HELPER = new Experience("IOS_EMPTY_USER_PROFILE_ED_HELPER", 160, 20017);
        IOS_QA_NOTIFICATION_EDUCATION = new Experience("IOS_QA_NOTIFICATION_EDUCATION", 161, 20018);
        IOS_NUX_MANDATORY_MEN = new Experience("IOS_NUX_MANDATORY_MEN", 162, 20019);
        IOS_NUX_MANDATORY_WOMEN = new Experience("IOS_NUX_MANDATORY_WOMEN", 163, 20020);
        IOS_MSGS_NOTIFICATIONS_USER_ED = new Experience("IOS_MSGS_NOTIFICATIONS_USER_ED", 164, 20021);
        IOS_MSGS_MESSAGE_LIST_USER_ED = new Experience("IOS_MSGS_MESSAGE_LIST_USER_ED", 165, 20022);
        IOS_MSGS_MESSAGE_USER_ED = new Experience("IOS_MSGS_MESSAGE_USER_ED", 166, 20023);
        IOS_MSGS_NOTIFICATIONS_USER_ED_IPAD = new Experience("IOS_MSGS_NOTIFICATIONS_USER_ED_IPAD", 167, 20024);
        IOS_MSGS_MESSAGE_USER_ED_IPAD = new Experience("IOS_MSGS_MESSAGE_USER_ED_IPAD", 168, 20025);
        IOS_MSGS_WELCOME_MESSAGE = new Experience("IOS_MSGS_WELCOME_MESSAGE", 169, 20026);
        IOS_EMMY_AWARDS = new Experience("IOS_EMMY_AWARDS", 170, 20027);
        IOS_NAG_ADS_PRIVACY_UPDATE = new Experience("IOS_NAG_ADS_PRIVACY_UPDATE", 171, 20028);
        IOS_REPIN_ED = new Experience("IOS_REPIN_ED", 172, 20029);
        IOS_REPIN_ED_HELPER = new Experience("IOS_REPIN_ED_HELPER", 173, 20030);
        IOS_REPIN_ED_IPAD = new Experience("IOS_REPIN_ED_IPAD", 174, 20031);
        IOS_REPIN_ED_HELPER_IPAD = new Experience("IOS_REPIN_ED_HELPER_IPAD", 175, 20032);
        IOS_HOME_FEED_ED = new Experience("IOS_HOME_FEED_ED", 176, 20033);
        IOS_HOME_FEED_ED_HELPER = new Experience("IOS_HOME_FEED_ED_HELPER", 177, 20034);
        IOS_NAG_REBUILD_FEED = new Experience("IOS_NAG_REBUILD_FEED", 178, 20035);
        IOS_NAG_UNDO_REBUILD_FEED = new Experience("IOS_NAG_UNDO_REBUILD_FEED", 179, 20036);
        IOS_NUX_REBUILD_FEED = new Experience("IOS_NUX_REBUILD_FEED", 180, 20037);
        IOS_CREATE_BUTTON_ED = new Experience("IOS_CREATE_BUTTON_ED", 181, 20038);
        IOS_PUSH_NOTIFICATION_PERMISSION_PROMPT = new Experience("IOS_PUSH_NOTIFICATION_PERMISSION_PROMPT", 182, 20039);
        IOS_BOARD_FOLLOW_ED = new Experience("IOS_BOARD_FOLLOW_ED", 183, 20040);
        IOS_BOARD_FOLLOW_ED_HELPER = new Experience("IOS_BOARD_FOLLOW_ED_HELPER", 184, 20041);
        IOS_PROFILE_FOLLOW_ED = new Experience("IOS_PROFILE_FOLLOW_ED", 185, 20042);
        IOS_PROFILE_FOLLOW_ED_HELPER = new Experience("IOS_PROFILE_FOLLOW_ED_HELPER", 186, 20043);
        IOS_CLICKTHROUGH_ED = new Experience("IOS_CLICKTHROUGH_ED", 187, 20044);
        IOS_CLICKTHROUGH_ED_HELPER = new Experience("IOS_CLICKTHROUGH_ED_HELPER", 188, 20045);
        IOS_COMBINED_SEARCH_ED = new Experience("IOS_COMBINED_SEARCH_ED", 189, 20046);
        IOS_COMBINED_SEARCH_ED_HELPER = new Experience("IOS_COMBINED_SEARCH_ED_HELPER", 190, 20047);
        IOS_GUIDED_SEARCH_ED = new Experience("IOS_GUIDED_SEARCH_ED", 191, 20048);
        IOS_GUIDED_SEARCH_ED_HELPER = new Experience("IOS_GUIDED_SEARCH_ED_HELPER", 192, 20049);
        IOS_CONTEXTUAL_MENU_ED = new Experience("IOS_CONTEXTUAL_MENU_ED", 193, 20050);
        IOS_MSGS_SEND_PIN_ED = new Experience("IOS_MSGS_SEND_PIN_ED", 194, 20051);
        IOS_MSGS_SEND_PIN_ED_HELPER = new Experience("IOS_MSGS_SEND_PIN_ED_HELPER", 195, 20052);
        IOS_NAG_PINVITATIONAL = new Experience("IOS_NAG_PINVITATIONAL", 196, 20053);
        IOS_NAG_PINVITATIONAL_REFRESH = new Experience("IOS_NAG_PINVITATIONAL_REFRESH", 197, 20054);
        IOS_PINVITATIONAL_HOME_FEED_MODAL = new Experience("IOS_PINVITATIONAL_HOME_FEED_MODAL", 198, 20055);
        IOS_NUX_FIRST_BOARD = new Experience("IOS_NUX_FIRST_BOARD", 199, 20056);
        IOS_NUX_BUILD_HOMEFEED = new Experience("IOS_NUX_BUILD_HOMEFEED", 200, 20057);
        IOS_NUX_SEARCH_WELCOME_HELPER = new Experience("IOS_NUX_SEARCH_WELCOME_HELPER", 201, 20058);
        IOS_NUX_SEARCH_LIVE_PROFILE_HELPER = new Experience("IOS_NUX_SEARCH_LIVE_PROFILE_HELPER", 202, 20059);
        IOS_NUX_INTEREST_PICKER = new Experience("IOS_NUX_INTEREST_PICKER", 203, 20060);
        IOS_IN_APP_SURVEY = new Experience("IOS_IN_APP_SURVEY", 204, 20061);
        IOS_SHARE_EXTENSION_EDUCATION = new Experience("IOS_SHARE_EXTENSION_EDUCATION", 205, 20062);
        IOS_SCREENSHOT_ED = new Experience("IOS_SCREENSHOT_ED", 206, 20063);
        IOS_NUX_CORE_CONCEPTS_JAPAN_FEMALE = new Experience("IOS_NUX_CORE_CONCEPTS_JAPAN_FEMALE", 207, 20064);
        IOS_NUX_CORE_CONCEPTS_JAPAN_MALE = new Experience("IOS_NUX_CORE_CONCEPTS_JAPAN_MALE", 208, 20065);
        IOS_NAG_GLOBAL_INVITER = new Experience("IOS_NAG_GLOBAL_INVITER", 209, 20066);
        IOS_PROFILE_HOME_FEED_HELPER = new Experience("IOS_PROFILE_HOME_FEED_HELPER", 210, 20067);
        IOS_COMMERCE_EDUCATION = new Experience("IOS_COMMERCE_EDUCATION", 211, 20068);
        IOS_NOTIFICATION_PANE_PERMISSION_NAG = new Experience("IOS_NOTIFICATION_PANE_PERMISSION_NAG", 212, 20069);
        IOS_SHARE_EXTENSION_EDUCATION_HOMEFEED_FULL_TAKEOVER = new Experience("IOS_SHARE_EXTENSION_EDUCATION_HOMEFEED_FULL_TAKEOVER", 213, 20070);
        IOS_SHARE_EXTENSION_EDUCATION_HOMEFEED_PARTIAL_TAKEOVER = new Experience("IOS_SHARE_EXTENSION_EDUCATION_HOMEFEED_PARTIAL_TAKEOVER", 214, 20071);
        IOS_SHARE_EXTENSION_EDUCATION_PROFILE_PARTIAL_TAKEOVER = new Experience("IOS_SHARE_EXTENSION_EDUCATION_PROFILE_PARTIAL_TAKEOVER", 215, 20072);
        IOS_NUX_FIRST_CLICKTHROUGH = new Experience("IOS_NUX_FIRST_CLICKTHROUGH", 216, 20073);
        IOS_UNSEEN_NOTIFICATION_HOMEFEED_TOASTER = new Experience("IOS_UNSEEN_NOTIFICATION_HOMEFEED_TOASTER", 217, 20074);
        IOS_NAG_APPLE_APP_STORE = new Experience("IOS_NAG_APPLE_APP_STORE", 218, 20075);
        IOS_NUX_CORE_CONCEPTS_M5 = new Experience("IOS_NUX_CORE_CONCEPTS_M5", 219, 20076);
        IOS_COMMERCE_HOMEFEED_EDUCATION = new Experience("IOS_COMMERCE_HOMEFEED_EDUCATION", 220, 20077);
        IOS_COMMERCE_SEARCH_EDUCATION = new Experience("IOS_COMMERCE_SEARCH_EDUCATION", 221, 20078);
        IOS_COMMERCE_CLOSEUP_BUY_EDUCATION = new Experience("IOS_COMMERCE_CLOSEUP_BUY_EDUCATION", 222, 20079);
        IOS_COMMERCE_CHECKOUT_EDUCATION = new Experience("IOS_COMMERCE_CHECKOUT_EDUCATION", 223, 20080);
        IOS_FIRST_PIN_TOOLTIP = new Experience("IOS_FIRST_PIN_TOOLTIP", 224, 20081);
        IOS_FIRST_CLICKTHROUGH_TOOLTIP = new Experience("IOS_FIRST_CLICKTHROUGH_TOOLTIP", 225, 20082);
        IOS_FIRST_PIN_REPIN = new Experience("IOS_FIRST_PIN_REPIN", 226, 20083);
        IOS_FACEBOOK_TRENDING_PIN_TOAST = new Experience("IOS_FACEBOOK_TRENDING_PIN_TOAST", 227, 20084);
        IOS_OWN_EMPTY_BOARD_ED = new Experience("IOS_OWN_EMPTY_BOARD_ED", 228, 20085);
        IOS_OWN_EMPTY_USER_PROFILE_ED = new Experience("IOS_OWN_EMPTY_USER_PROFILE_ED", 229, 20086);
        IOS_OWN_EMPTY_BOARD_ED_HELPER = new Experience("IOS_OWN_EMPTY_BOARD_ED_HELPER", 230, 20087);
        IOS_OWN_EMPTY_USER_PROFILE_ED_HELPER = new Experience("IOS_OWN_EMPTY_USER_PROFILE_ED_HELPER", 231, 20088);
        IOS_FIRST_PIN_BOARD_CREATE = new Experience("IOS_FIRST_PIN_BOARD_CREATE", 232, 20089);
        IOS_COMMERCE_CLOSEUP_MERCHANT_EDUCATION = new Experience("IOS_COMMERCE_CLOSEUP_MERCHANT_EDUCATION", 233, 20090);
        IOS_FIRST_PIN_HOMEFEED_SCROLL_HELPER = new Experience("IOS_FIRST_PIN_HOMEFEED_SCROLL_HELPER", 234, 20091);
        IOS_FIRST_PIN_HOMEFEED_CLOSEUP_HELPER = new Experience("IOS_FIRST_PIN_HOMEFEED_CLOSEUP_HELPER", 235, 20092);
        IOS_FIRST_PIN_HOMEFEED_BUILDER_TOOLTIP = new Experience("IOS_FIRST_PIN_HOMEFEED_BUILDER_TOOLTIP", 236, 20093);
        IOS_NAG_COMMERCE_SHOP_OUR_PICKS = new Experience("IOS_NAG_COMMERCE_SHOP_OUR_PICKS", 237, 20094);
        IOS_FIRST_FLASHLIGHT_ED = new Experience("IOS_FIRST_FLASHLIGHT_ED", 238, 20095);
        IOS_OWN_LIBRARY_PROFILE_ED = new Experience("IOS_OWN_LIBRARY_PROFILE_ED", 239, 20096);
        IOS_OWN_LIBRARY_ALL_PINS_ED = new Experience("IOS_OWN_LIBRARY_ALL_PINS_ED", 240, 20097);
        IOS_FIRST_FLASHLIGHT_ICON_ED = new Experience("IOS_FIRST_FLASHLIGHT_ICON_ED", 241, 20098);
        IOS_HOME_FEED_PROFILE_TAB_TOOLTIP = new Experience("IOS_HOME_FEED_PROFILE_TAB_TOOLTIP", 242, 20099);
        IOS_NUX_COLD_USE_CASES = new Experience("IOS_NUX_COLD_USE_CASES", 243, 20100);
        IOS_NUX_COLD_HOMEFEED_INTRO_TAKEOVER = new Experience("IOS_NUX_COLD_HOMEFEED_INTRO_TAKEOVER", 244, 20101);
        IOS_NUX_COLD_HOMEFEED_INTEREST_GIFTWRAP = new Experience("IOS_NUX_COLD_HOMEFEED_INTEREST_GIFTWRAP", 245, 20102);
        IOS_NUX_COLD_INTEREST_GIFTWRAP_TAKEOVER = new Experience("IOS_NUX_COLD_INTEREST_GIFTWRAP_TAKEOVER", 246, 20103);
        IOS_TEST = new Experience("IOS_TEST", 247, 29999);
        ANDROID_NOOP = new Experience("ANDROID_NOOP", 248, 30000);
        ANDROID_HERO_EMPTY_HOMEFEED = new Experience("ANDROID_HERO_EMPTY_HOMEFEED", 249, 30001);
        ANDROID_NAG_CONFIRM_EMAIL = new Experience("ANDROID_NAG_CONFIRM_EMAIL", 250, 30002);
        ANDROID_NAG_WRITE_BANNED = new Experience("ANDROID_NAG_WRITE_BANNED", 251, 30003);
        ANDROID_NAG_INVITER = new Experience("ANDROID_NAG_INVITER", 252, 30004);
        ANDROID_EMPTY_BOARD_ED = new Experience("ANDROID_EMPTY_BOARD_ED", 253, 30005);
        ANDROID_EMPTY_USER_PROFILE_ED = new Experience("ANDROID_EMPTY_USER_PROFILE_ED", 254, 30006);
        ANDROID_QA_EDUCATION = new Experience("ANDROID_QA_EDUCATION", 255, 30007);
        ANDROID_QA_NOTIFICATION_EDUCATION = new Experience("ANDROID_QA_NOTIFICATION_EDUCATION", 256, 30008);
        ANDROID_EMPTY_BOARD_ED_HELPER = new Experience("ANDROID_EMPTY_BOARD_ED_HELPER", 257, 30009);
        ANDROID_EMPTY_USER_PROFILE_ED_HELPER = new Experience("ANDROID_EMPTY_USER_PROFILE_ED_HELPER", 258, 30010);
        ANDROID_NUX_MANDATORY_MEN = new Experience("ANDROID_NUX_MANDATORY_MEN", 259, 30011);
        ANDROID_NUX_MANDATORY_WOMEN = new Experience("ANDROID_NUX_MANDATORY_WOMEN", 260, 30012);
        ANDROID_EMPTY_BOARD_ED_TABLET = new Experience("ANDROID_EMPTY_BOARD_ED_TABLET", 261, 30013);
        ANDROID_EMPTY_BOARD_ED_HELPER_TABLET = new Experience("ANDROID_EMPTY_BOARD_ED_HELPER_TABLET", 262, 30014);
        ANDROID_EMPTY_USER_PROFILE_ED_TABLET = new Experience("ANDROID_EMPTY_USER_PROFILE_ED_TABLET", 263, 30015);
        ANDROID_EMPTY_USER_PROFILE_ED_HELPER_TABLET = new Experience("ANDROID_EMPTY_USER_PROFILE_ED_HELPER_TABLET", 264, 30016);
        ANDROID_CLICKTHROUGH_ED = new Experience("ANDROID_CLICKTHROUGH_ED", 265, 30017);
        ANDROID_MSGS_WELCOME_MESSAGE = new Experience("ANDROID_MSGS_WELCOME_MESSAGE", 266, 30018);
        ANDROID_EMMY_AWARDS = new Experience("ANDROID_EMMY_AWARDS", 267, 30019);
        ANDROID_HOME_FEED_ED = new Experience("ANDROID_HOME_FEED_ED", 268, 30020);
        ANDROID_REPIN_ED = new Experience("ANDROID_REPIN_ED", 269, 30021);
        ANDROID_NAG_ADS_PRIVACY_UPDATE = new Experience("ANDROID_NAG_ADS_PRIVACY_UPDATE", 270, 30022);
        ANDROID_HOME_FEED_ED_HELPER = new Experience("ANDROID_HOME_FEED_ED_HELPER", 271, 30023);
        ANDROID_HOME_FEED_ED_TABLET = new Experience("ANDROID_HOME_FEED_ED_TABLET", 272, 30024);
        ANDROID_HOME_FEED_ED_HELPER_TABLET = new Experience("ANDROID_HOME_FEED_ED_HELPER_TABLET", 273, 30025);
        ANDROID_REPIN_ED_HELPER = new Experience("ANDROID_REPIN_ED_HELPER", 274, 30026);
        ANDROID_REPIN_ED_TABLET = new Experience("ANDROID_REPIN_ED_TABLET", 275, 30027);
        ANDROID_REPIN_ED_HELPER_TABLET = new Experience("ANDROID_REPIN_ED_HELPER_TABLET", 276, 30028);
        ANDROID_CLICKTHROUGH_ED_HELPER = new Experience("ANDROID_CLICKTHROUGH_ED_HELPER", 277, 30029);
        ANDROID_CLICKTHROUGH_ED_TABLET = new Experience("ANDROID_CLICKTHROUGH_ED_TABLET", 278, 30030);
        ANDROID_CLICKTHROUGH_ED_HELPER_TABLET = new Experience("ANDROID_CLICKTHROUGH_ED_HELPER_TABLET", 279, 30031);
        ANDROID_NAG_CONNECT_FACEBOOK = new Experience("ANDROID_NAG_CONNECT_FACEBOOK", 280, 30032);
        ANDROID_NAG_UPLOAD_CONTACTS = new Experience("ANDROID_NAG_UPLOAD_CONTACTS", 281, 30033);
        ANDROID_BOARD_FOLLOW_ED = new Experience("ANDROID_BOARD_FOLLOW_ED", 282, 30034);
        ANDROID_BOARD_FOLLOW_ED_HELPER = new Experience("ANDROID_BOARD_FOLLOW_ED_HELPER", 283, 30035);
        ANDROID_BOARD_FOLLOW_ED_TABLET = new Experience("ANDROID_BOARD_FOLLOW_ED_TABLET", 284, 30036);
        ANDROID_BOARD_FOLLOW_ED_HELPER_TABLET = new Experience("ANDROID_BOARD_FOLLOW_ED_HELPER_TABLET", 285, 30037);
        ANDROID_PROFILE_FOLLOW_ED = new Experience("ANDROID_PROFILE_FOLLOW_ED", 286, 30038);
        ANDROID_PROFILE_FOLLOW_ED_HELPER = new Experience("ANDROID_PROFILE_FOLLOW_ED_HELPER", 287, 30039);
        ANDROID_PROFILE_FOLLOW_ED_TABLET = new Experience("ANDROID_PROFILE_FOLLOW_ED_TABLET", 288, 30040);
        ANDROID_PROFILE_FOLLOW_ED_HELPER_TABLET = new Experience("ANDROID_PROFILE_FOLLOW_ED_HELPER_TABLET", 289, 30041);
        ANDROID_HERO_PROMPT_REBUILD_FEED = new Experience("ANDROID_HERO_PROMPT_REBUILD_FEED", 290, 30042);
        ANDROID_HERO_UNDO_REBUILD_FEED = new Experience("ANDROID_HERO_UNDO_REBUILD_FEED", 291, 30043);
        ANDROID_NUX_REBUILD_FEED = new Experience("ANDROID_NUX_REBUILD_FEED", 292, 30044);
        ANDROID_SURVEY_201501 = new Experience("ANDROID_SURVEY_201501", 293, 30045);
        ANDROID_NAG_PINVITATIONAL = new Experience("ANDROID_NAG_PINVITATIONAL", 294, 30046);
        ANDROID_PINVITATIONAL_CONFIRM_BOARD = new Experience("ANDROID_PINVITATIONAL_CONFIRM_BOARD", 295, 30047);
        ANDROID_REPIN_ED_V2 = new Experience("ANDROID_REPIN_ED_V2", 296, 30048);
        ANDROID_REPIN_ED_V2_HELPER = new Experience("ANDROID_REPIN_ED_V2_HELPER", 297, 30049);
        ANDROID_PINVITATIONAL_HOME_FEED_MODAL = new Experience("ANDROID_PINVITATIONAL_HOME_FEED_MODAL", 298, 30050);
        ANDROID_HOME_FEED_ED_V2 = new Experience("ANDROID_HOME_FEED_ED_V2", 299, 30051);
        ANDROID_HOME_FEED_ED_V2_HELPER = new Experience("ANDROID_HOME_FEED_ED_V2_HELPER", 300, 30052);
        ANDROID_SURVEY_201504 = new Experience("ANDROID_SURVEY_201504", 301, 30053);
        ANDROID_NEW_USER_SURVEY_201504 = new Experience("ANDROID_NEW_USER_SURVEY_201504", 302, 30054);
        ANDROID_RESURRECTED_USER_SURVEY_201505 = new Experience("ANDROID_RESURRECTED_USER_SURVEY_201505", 303, 30055);
        ANDROID_NAG_GLOBAL_INVITER = new Experience("ANDROID_NAG_GLOBAL_INVITER", 304, 30056);
        ANDROID_FREE_RESPONSE_USER_SURVEY_201505 = new Experience("ANDROID_FREE_RESPONSE_USER_SURVEY_201505", 305, 30057);
        ANDROID_PROFILE_OFFLINE_PIN_ED = new Experience("ANDROID_PROFILE_OFFLINE_PIN_ED", 306, 30058);
        ANDROID_SHARE_SHEET_EXTENSION_ED = new Experience("ANDROID_SHARE_SHEET_EXTENSION_ED", 307, 30059);
        ANDROID_ADS_SURVEY_201507 = new Experience("ANDROID_ADS_SURVEY_201507", 308, 30060);
        ANDROID_NUX_FIRST_PIN = new Experience("ANDROID_NUX_FIRST_PIN", 309, 30061);
        ANDROID_HOME_FIRST_PIN_CLOSEUP_PROMPT = new Experience("ANDROID_HOME_FIRST_PIN_CLOSEUP_PROMPT", 310, 30062);
        ANDROID_NUX_CORE_CONCEPTS_M5 = new Experience("ANDROID_NUX_CORE_CONCEPTS_M5", 311, 30063);
        ANDROID_HOMEFEED_BUILDER_TOOLTIP = new Experience("ANDROID_HOMEFEED_BUILDER_TOOLTIP", 312, 30064);
        ANDROID_SURVEY_WOM = new Experience("ANDROID_SURVEY_WOM", 313, 30065);
        ANDROID_HOME_FEED_PROFILE_TAB_TOOLTIP = new Experience("ANDROID_HOME_FEED_PROFILE_TAB_TOOLTIP", 314, 30066);
        ANDROID_OWN_LIBRARY_PROFILE_ED = new Experience("ANDROID_OWN_LIBRARY_PROFILE_ED", 315, 30067);
        ANDROID_OWN_LIBRARY_ALL_PINS_ED = new Experience("ANDROID_OWN_LIBRARY_ALL_PINS_ED", 316, 30068);
        ANDROID_COMMERCE_HOME_FEED_ED = new Experience("ANDROID_COMMERCE_HOME_FEED_ED", 317, 30069);
        ANDROID_COMMERCE_CLOSEUP_BUY_ED = new Experience("ANDROID_COMMERCE_CLOSEUP_BUY_ED", 318, 30070);
        ANDROID_COMMERCE_CHECKOUT_ED = new Experience("ANDROID_COMMERCE_CHECKOUT_ED", 319, 30071);
        ANDROID_COMMERCE_SEARCH_ED = new Experience("ANDROID_COMMERCE_SEARCH_ED", 320, 30072);
        ANDROID_COMMERCE_CLOSEUP_MERCHANT_ED = new Experience("ANDROID_COMMERCE_CLOSEUP_MERCHANT_ED", 321, 30073);
        ANDROID_PINIT_BTN_TOOLTIP = new Experience("ANDROID_PINIT_BTN_TOOLTIP", 322, 30074);
        ANDROID_CLICKTHROUGH_BTN_TOOLTIP = new Experience("ANDROID_CLICKTHROUGH_BTN_TOOLTIP", 323, 30075);
        ANDROID_FIRST_PIN_SCROLL_PROMPT = new Experience("ANDROID_FIRST_PIN_SCROLL_PROMPT", 324, 30076);
        ANDROID_FIRST_PIN_TAP_PROMPT = new Experience("ANDROID_FIRST_PIN_TAP_PROMPT", 325, 30077);
        ANDROID_FLASHLIGHT_BUTTON_TOOLTIP = new Experience("ANDROID_FLASHLIGHT_BUTTON_TOOLTIP", 326, 30078);
        ANDROID_FIRST_FLASHLIGHT_ED = new Experience("ANDROID_FIRST_FLASHLIGHT_ED", 327, 30079);
        ANDROID_SHARE_EXTENSION_EDUCATION_HOMEFEED_PARTIAL_TAKEOVER = new Experience("ANDROID_SHARE_EXTENSION_EDUCATION_HOMEFEED_PARTIAL_TAKEOVER", 328, 30080);
        ANDROID_WARM_SEO_NUX_HOMEFEED_INTRO = new Experience("ANDROID_WARM_SEO_NUX_HOMEFEED_INTRO", 329, 30081);
        ANDROID_WARM_SEO_NUX_GIFTWRAP_INTEREST_PICKER = new Experience("ANDROID_WARM_SEO_NUX_GIFTWRAP_INTEREST_PICKER", 330, 30082);
        ANDROID_STATEMENT_CREDIT_HOME_FEED = new Experience("ANDROID_STATEMENT_CREDIT_HOME_FEED", 331, 30083);
        ANDROID_STATEMENT_CREDIT_PIN_CLOSEUP = new Experience("ANDROID_STATEMENT_CREDIT_PIN_CLOSEUP", 332, 30084);
        ANDROID_STATEMENT_CREDIT_CHECKOUT = new Experience("ANDROID_STATEMENT_CREDIT_CHECKOUT", 333, 30085);
        WEB_MOBILE_NOOP = new Experience("WEB_MOBILE_NOOP", 334, 40000);
        WEB_MOBILE_NUX_MANDATORY = new Experience("WEB_MOBILE_NUX_MANDATORY", 335, 40001);
        WEB_MOBILE_NUX_INTERESTS = new Experience("WEB_MOBILE_NUX_INTERESTS", 336, 40002);
        PUSH_NOTIFICATION_NOOP = new Experience("PUSH_NOTIFICATION_NOOP", 337, 50000);
        PUSH_NOTIFICATION_SIMILAR_REPINS = new Experience("PUSH_NOTIFICATION_SIMILAR_REPINS", 338, 50001);
        PUSH_NOTIFICATION_PIN_TWINS = new Experience("PUSH_NOTIFICATION_PIN_TWINS", 339, 50002);
        PUSH_NOTIFICATION_FRIEND_PIN = new Experience("PUSH_NOTIFICATION_FRIEND_PIN", 340, 50003);
        ANALYTICS_NOOP = new Experience("ANALYTICS_NOOP", 341, 60000);
        ANALYTICS_HOME_USER_ED = new Experience("ANALYTICS_HOME_USER_ED", 342, 60001);
        ANALYTICS_AUDIENCE_SELECTOR_USER_ED = new Experience("ANALYTICS_AUDIENCE_SELECTOR_USER_ED", 343, 60002);
        EMAIL_NOOP = new Experience("EMAIL_NOOP", 344, 0x11170);
        EMAIL_USER_ED_TIP_EMPTY_BOARD = new Experience("EMAIL_USER_ED_TIP_EMPTY_BOARD", 345, 0x11171);
        EMAIL_USER_ED_TIP_REPIN = new Experience("EMAIL_USER_ED_TIP_REPIN", 346, 0x11172);
        EMAIL_USER_ED_TIP_CLICKTHROUGH = new Experience("EMAIL_USER_ED_TIP_CLICKTHROUGH", 347, 0x11173);
        EMAIL_USER_ED_TIP_SEARCH = new Experience("EMAIL_USER_ED_TIP_SEARCH", 348, 0x11174);
        EMAIL_USER_ED_TIP_EMAIL_VERIFY = new Experience("EMAIL_USER_ED_TIP_EMAIL_VERIFY", 349, 0x11175);
        EMAIL_USER_ED_TIP_PIN_CREATE = new Experience("EMAIL_USER_ED_TIP_PIN_CREATE", 350, 0x11176);
        EMAIL_USER_ED_TIP_PINIT_BUTTON = new Experience("EMAIL_USER_ED_TIP_PINIT_BUTTON", 351, 0x11177);
        BATCH_NOOP = new Experience("BATCH_NOOP", 352, 0x13880);
        BATCH_EMAIL_FIRST_BOARD_CREATE = new Experience("BATCH_EMAIL_FIRST_BOARD_CREATE", 353, 0x13881);
        BATCH_EMAIL_INTEREST_RECOMMENDATIONS = new Experience("BATCH_EMAIL_INTEREST_RECOMMENDATIONS", 354, 0x13882);
        BATCH_EMAIL_EMPTY_BOARD = new Experience("BATCH_EMAIL_EMPTY_BOARD", 355, 0x13883);
        BATCH_EMAIL_GUIDED_SEARCH = new Experience("BATCH_EMAIL_GUIDED_SEARCH", 356, 0x13884);
        BATCH_EMAIL_FIRST_PIN_CREATE = new Experience("BATCH_EMAIL_FIRST_PIN_CREATE", 357, 0x13885);
        BATCH_EMAIL_FIRST_CLICKTHROUGH = new Experience("BATCH_EMAIL_FIRST_CLICKTHROUGH", 358, 0x13886);
        BATCH_EMAIL_MOBILE_APP_DOWNLOAD = new Experience("BATCH_EMAIL_MOBILE_APP_DOWNLOAD", 359, 0x13887);
        BATCH_EMAIL_POPULAR_PINS = new Experience("BATCH_EMAIL_POPULAR_PINS", 360, 0x13888);
        BATCH_PUSH_NOTIFICATION_HOLIDAY_GUIDE = new Experience("BATCH_PUSH_NOTIFICATION_HOLIDAY_GUIDE", 361, 0x13889);
        BATCH_PUSH_NOTIFICATION_ATHELETES_OUTDOORS = new Experience("BATCH_PUSH_NOTIFICATION_ATHELETES_OUTDOORS", 362, 0x1388a);
        BATCH_PUSH_NOTIFICATION_GARDENING = new Experience("BATCH_PUSH_NOTIFICATION_GARDENING", 363, 0x1388b);
        BATCH_PUSH_NOTIFICATION_FOOD = new Experience("BATCH_PUSH_NOTIFICATION_FOOD", 364, 0x1388c);
        BATCH_PUSH_NOTIFICATION_KIDS = new Experience("BATCH_PUSH_NOTIFICATION_KIDS", 365, 0x1388d);
        BATCH_PUSH_NOTIFICATION_CREATE_RESOLUTION_BOARD = new Experience("BATCH_PUSH_NOTIFICATION_CREATE_RESOLUTION_BOARD", 366, 0x1388e);
        BATCH_PUSH_NOTIFICATION_RESOLUTION_IDEAS = new Experience("BATCH_PUSH_NOTIFICATION_RESOLUTION_IDEAS", 367, 0x1388f);
        BATCH_PUSH_NOTIFICATION_SHARE_BOARD = new Experience("BATCH_PUSH_NOTIFICATION_SHARE_BOARD", 368, 0x13890);
        BATCH_EMAIL_HOMEFEED_NEW_PINS = new Experience("BATCH_EMAIL_HOMEFEED_NEW_PINS", 369, 0x13891);
        BATCH_PUSH_NOTIFICATION_NEW_USER_DAY_1 = new Experience("BATCH_PUSH_NOTIFICATION_NEW_USER_DAY_1", 370, 0x13892);
        BATCH_PUSH_NOTIFICATION_NEW_USER_DAY_2 = new Experience("BATCH_PUSH_NOTIFICATION_NEW_USER_DAY_2", 371, 0x13893);
        BATCH_PUSH_NOTIFICATION_NEW_USER_DAY_3 = new Experience("BATCH_PUSH_NOTIFICATION_NEW_USER_DAY_3", 372, 0x13894);
        BATCH_NETWORK_STORY_VALENTINE = new Experience("BATCH_NETWORK_STORY_VALENTINE", 373, 0x13895);
        BATCH_EMAIL_PIN_ON_ANOTHER_BOARD = new Experience("BATCH_EMAIL_PIN_ON_ANOTHER_BOARD", 374, 0x13896);
        BATCH_NETWORK_STORY_FATHERS_DAY = new Experience("BATCH_NETWORK_STORY_FATHERS_DAY", 375, 0x13897);
        BATCH_NETWORK_STORY_BACK_TO_SCHOOL_PARENTS = new Experience("BATCH_NETWORK_STORY_BACK_TO_SCHOOL_PARENTS", 376, 0x13898);
        BATCH_NETWORK_STORY_BACK_TO_SCHOOL_TEACHERS = new Experience("BATCH_NETWORK_STORY_BACK_TO_SCHOOL_TEACHERS", 377, 0x13899);
        BATCH_NETWORK_STORY_SHOP_OUR_PICKS = new Experience("BATCH_NETWORK_STORY_SHOP_OUR_PICKS", 378, 0x1389a);
        BATCH_NETWORK_STORY_GAME_DAY = new Experience("BATCH_NETWORK_STORY_GAME_DAY", 379, 0x1389b);
        BATCH_EMAIL_PIN_TWINS = new Experience("BATCH_EMAIL_PIN_TWINS", 380, 0x138a1);
        BATCH_EMAIL_NON_NUX_INTEREST_RECOMMENDATIONS = new Experience("BATCH_EMAIL_NON_NUX_INTEREST_RECOMMENDATIONS", 381, 0x138a2);
        BATCH_EMAIL_BOARD_CREATE_RECOMMENDATIONS = new Experience("BATCH_EMAIL_BOARD_CREATE_RECOMMENDATIONS", 382, 0x138a3);
        BATCH_EMAIL_BOARD_FOLLOW_RECOMMENDATIONS = new Experience("BATCH_EMAIL_BOARD_FOLLOW_RECOMMENDATIONS", 383, 0x138a4);
        BATCH_EMAIL_NETWORK_STORY_DIGEST = new Experience("BATCH_EMAIL_NETWORK_STORY_DIGEST", 384, 0x138a5);
        BATCH_EMAIL_FIND_FRIEND = new Experience("BATCH_EMAIL_FIND_FRIEND", 385, 0x138a6);
        BATCH_EMAIL_EDITORIAL_POPULAR_PINS = new Experience("BATCH_EMAIL_EDITORIAL_POPULAR_PINS", 386, 0x138a7);
        BATCH_EMAIL_PROMOTE_GOODIES = new Experience("BATCH_EMAIL_PROMOTE_GOODIES", 387, 0x138a8);
        BATCH_EMAIL_EDITORIAL = new Experience("BATCH_EMAIL_EDITORIAL", 388, 0x138a9);
        BATCH_EMAIL_POPULAR_PINS_M5 = new Experience("BATCH_EMAIL_POPULAR_PINS_M5", 389, 0x138aa);
        BATCH_PUSH_NOTIFICATION_NUJ_BUILD_HOMEFEED = new Experience("BATCH_PUSH_NOTIFICATION_NUJ_BUILD_HOMEFEED", 390, 0x138ab);
        BATCH_EMAIL_FRIENDS_INTERESTS = new Experience("BATCH_EMAIL_FRIENDS_INTERESTS", 391, 0x138ac);
        BATCH_EMAIL_EDITORIAL_POPULAR_PINS_M5 = new Experience("BATCH_EMAIL_EDITORIAL_POPULAR_PINS_M5", 392, 0x138ad);
        BATCH_EMAIL_RECOMMENDATIONS_DIGEST = new Experience("BATCH_EMAIL_RECOMMENDATIONS_DIGEST", 393, 0x138ae);
        BATCH_EMAIL_TRENDING_PINS = new Experience("BATCH_EMAIL_TRENDING_PINS", 394, 0x138af);
        BATCH_EMAIL_DORMANT_BOARD_RECOMMENDATIONS = new Experience("BATCH_EMAIL_DORMANT_BOARD_RECOMMENDATIONS", 395, 0x138b0);
        BATCH_EMAIL_NO_SIGNAL = new Experience("BATCH_EMAIL_NO_SIGNAL", 396, 0x138b1);
        BATCH_EMAIL_PIN_PRICE_DROP = new Experience("BATCH_EMAIL_PIN_PRICE_DROP", 397, 0x138b2);
        BATCH_EMAIL_PIN_BECOMES_BUYABLE = new Experience("BATCH_EMAIL_PIN_BECOMES_BUYABLE", 398, 0x138b3);
        BATCH_EMAIL_PIN_FREE_SHIPPING = new Experience("BATCH_EMAIL_PIN_FREE_SHIPPING", 399, 0x138b4);
        BATCH_EMAIL_TRENDING_SEARCHES = new Experience("BATCH_EMAIL_TRENDING_SEARCHES", 400, 0x138b5);
        BATCH_EMAIL_CART_ABANDONMENT = new Experience("BATCH_EMAIL_CART_ABANDONMENT", 401, 0x138b6);
        STERLING_NOOP = new Experience("STERLING_NOOP", 402, 0x15f90);
        STERLING_DASHBOARD_USER_ED = new Experience("STERLING_DASHBOARD_USER_ED", 403, 0x15f91);
        CAMPBELL_SIDE_NAV_USER_ED = new Experience("CAMPBELL_SIDE_NAV_USER_ED", 404, 0x186a0);
        HOMEFEED_NOOP = new Experience("HOMEFEED_NOOP", 405, 0x1adb0);
        HOMEFEED_SEO_BOARD_MULTI_BOARDS = new Experience("HOMEFEED_SEO_BOARD_MULTI_BOARDS", 406, 0x1adb1);
        HOMEFEED_CELEB_TOPIC_MULTI_BOARDS = new Experience("HOMEFEED_CELEB_TOPIC_MULTI_BOARDS", 407, 0x1adb2);
        HOMEFEED_LOCAL_TOPIC_MULTI_BOARDS = new Experience("HOMEFEED_LOCAL_TOPIC_MULTI_BOARDS", 408, 0x1adb3);
        $VALUES = (new Experience[] {
            NOOP, CONFIRM_EMAIL, WEB_NOOP, WEB_FEED_EDITOR_USER_ED, WEB_PIN_CLOSEUP_LITE, WEB_PIN_CLOSEUP_AUTOBAHN, WEB_MANDATORY_AUTOBAHN, WEB_FIRST_PIN_SUCCESS, WEB_SEARCH_DISCOVER_TOOLTIP, WEB_FIRST_FOLLOW, 
            WEB_PINIT_BOOKMARKLET, WEB_BLANK_SESSION, WEB_FIRST_PIN_USER_ED, WEB_YOUR_BOARDS_USER_ED, WEB_FAST_FOLLOW_USER_ED, WEB_FIND_FRIENDS_USER_ED, WEB_CATEGORY_SEARCH_USER_ED, WEB_PLACE_PINS_TOOLTIP, WEB_EMPTY_PLACES_BOARD_USER_ED, WEB_FILLED_PLACES_BOARD_USER_ED, 
            WEB_FIRST_BOARD_USER_ED, WEB_EXPLORE_BUTTON_USER_ED, WEB_EXPLORE_PAGE_USER_ED, WEB_MODERN_HEADER_USER_ED, WEB_PIN_SUCCESS_EXTENSION_UPSELL, WEB_EXPLORE_HEADER_USER_ED, WEB_VISUAL_OBJECT_SEARCH_CLOSEUP_USER_ED, WEB_MSGS_WELCOME_MESSAGE, WEB_USER_NEWS_APP_UPSELL, WEB_INTL_PIN_USER_ED, 
            WEB_FACEBOOK_CONNECT_HERO, WEB_FACEBOOK_PUBLISH_HERO, WEB_HOMEFEED_CAROUSEL, WEB_REBUILD_FEED, WEB_GUIDED_SEARCH_HEADER_USER_ED, WEB_GUIDED_SEARCH_USER_ED, WEB_BOARD_BULK_EDIT_ED, WEB_FLEXIBLE_SET_UP, WEB_SURVEY_201501, WEB_PINVITATIONAL_HOMEFEED_MODAL, 
            WEB_SURVEY_201504, WEB_PROMPT_INTEREST_SEARCH_REBUILD_FEED, WEB_NEW_USER_SURVEY_201504, WEB_RESURRECTED_USER_SURVEY_201505, WEB_FREE_RESPONSE_USER_SURVEY_201505, WEB_ADS_SURVEY_201507, WEB_SURVEY_BR_201509, WEB_SURVEY_DE_201509, WEB_SURVEY_FR_201509, WEB_SURVEY_JP_201509, 
            WEB_SURVEY_UK_201509, WEB_SURVEY_US_201509, WEB_HERO_INVITE_FRIENDS, WEB_HERO_EMPTY_HOMEFEED, WEB_HERO_INSTALL_APP, WEB_HERO_PINIT_BUTTON, WEB_HERO_LANGUAGE, WEB_HERO_PINIT_WEBMASTER, WEB_HERO_PLACE_PINS, WEB_HERO_PLACE_PINS_BOARD, 
            WEB_HERO_HOLIDAY_GUIDE, WEB_HERO_VALENTINES, WEB_HERO_INSTALL_EXTENSION, WEB_HERO_LANGUAGE_BROWSER_SAFE, WEB_HERO_PINIT_BUTTON_INTERNATIONAL, WEB_HERO_CONVERT_TO_BUSINESS, WEB_HERO_PROMOTE_A_PIN, WEB_HERO_WORLD_CUP, WEB_HERO_SCOOTER_PINNER_STORY, WEB_HERO_PROMOTED_PINS_BETA_REMINDER, 
            WEB_HERO_NEW_ANALYTICS_NAG, WEB_HERO_APP_UPSELL, WEB_HERO_NEW_ANALYTICS_CONVERT_TO_BIZ_NAG, WEB_HERO_EMMY_AWARDS, WEB_HERO_PROMPT_REBUILD_FEED, WEB_HERO_UNDO_REBUILD_FEED, WEB_HERO_ADS_PRIVACY_UPDATE, WEB_HERO_BUSINESS_HOLIDAY_BOARD_NAG, WEB_HERO_PINNER_HOLIDAY_BOARD_NAG, WEB_HOME_HERO_PROMOTED_PINS_BETA_REMINDER, 
            WEB_HERO_PINVITATIONAL_INVITE_NAG, WEB_HERO_REBUILD_EMPTY_HOME_FEED, WEB_HERO_WEB_PUSH_NOTIFICATION_NAG, WEB_HERO_WEEK_INVITER_NAG, WEB_HERO_CONVERT_TO_BUSINESS_REDUX, WEB_HERO_CPE_PROMOTED_PINS_INVITE, WEB_HOME_HERO_CPE_PROMOTED_PINS_INVITE, WEB_HERO_FIX_EMAIL_NAG, WEB_PARTNER_PERFORMANCE_HERO, WEB_HERO_BID_GUIDANCE, 
            WEB_HOME_HERO_BID_GUIDANCE, WEB_PARTNER_PERFORMANCE_HERO_V2, WEB_HERO_BUYABLE_PIN_FROM_EMAIL, WEB_PIN_SUCCESS_NEW_EXTENSION_UPSELL, WEB_PIN_SUCCESS_EXTENSION_ED_DOMAIN, WEB_PIN_SUCCESS_EXTENSION_ED_ODD_CONTENTS, WEB_PIN_SUCCESS_EXTENSION_ED_CATEGORY_BOXED, WEB_PIN_SUCCESS_EXTENSION_ED_BOARD_BOXED, WEB_FLEXIBLE_NUX, WEB_NUX_CORE_CONCEPTS_JAPAN, 
            WEB_NUX_CORE_CONCEPTS_M5, WEB_SEO_NUX, WEB_NAG_ADS_PRIVACY_UPDATE, WEB_NAG_LIMITED_LOGIN, WEB_NAG_CHROME_PUSH, WEB_NAG_LIMITED_LOGIN_V2, WEB_NAG_LOCALE_CHANGED_NOTIFICATION, WEB_NAG_PARTNER_CONFIRM_WEBSITE, WEB_NAG_SUBDOMAIN_REDIRECT, WEB_QA_CLOSEUP_USER_ED, 
            WEB_QA_CLOSEUP_NOTIFICATION_USER_ED, WEB_EMPTY_BOARD_ED, WEB_EMPTY_PROFILE_ED, WEB_EMPTY_BOARD_ED_MANUAL, WEB_EMPTY_PROFILE_ED_MANUAL, WEB_HOME_FEED_ED, WEB_REPIN_ED, WEB_HOME_FEED_ED_MANUAL, WEB_REPIN_ED_MANUAL, WEB_CLICKTHROUGH_ED, 
            WEB_CLICKTHROUGH_ED_MANUAL, WEB_HOME_FEED_ED_V2, WEB_HOME_FEED_ED_V2_MANUAL, WEB_BOARD_FOLLOW_ED, WEB_BOARD_FOLLOW_ED_MANUAL, WEB_PROFILE_FOLLOW_ED, WEB_PROFILE_FOLLOW_ED_MANUAL, WEB_PIN_CREATE_SUCCESS_EXTENSION_UPSELL, WEB_SEO_NUX_HOMEFEED_WELCOME, WEB_SEO_NUX_FIRST_PIN_TOOLTIP, 
            WEB_SEO_NUX_FIRST_CLICKTHROUGH_TOOLTIP, WEB_SEO_NUX_CREATE_BOARD, WEB_SEO_NUX_HOMEFEED_PIN_SUCCESS_BANNER, WEB_FLASHLIGHT_ED, WEB_FLASHLIGHT_ED_MANUAL, WEB_FLASHLIGHT_ED_PULSER, WEB_SURVEY_WOM, WEB_SURVEY_SEARCH, WEB_UNAUTH_PIN_CLOSEUP, WEB_NOTIFICATION_NAG_CHROME_PUSH, 
            WEB_EU_COOKIE_BANNER, WEB_ADD_PIN_EXTENSION_INSTALL_MODAL, WEB_TEST, IOS_NOOP, IOS_NAG_CONFIRM_EMAIL, IOS_NAG_PLACE_PINS, IOS_NAG_INVITER, IOS_NUX_FIRST_PIN, IOS_NUX_MANDATORY, IOS_HOME_WELCOME_HELPER, 
            IOS_PINS_LIVE_PROFILE_HELPER, IOS_NAG_WRITE_BANNED, IOS_NAG_CONFIRM_EMAIL_V3_5_1, IOS_QA_EDUCATION, IOS_CONTACTS_PERMISSIONS, IOS_CONTACTS_AND_FACEBOOK_PERMISSIONS, IOS_UPDATE_APP_HELPER, IOS_EMPTY_BOARD_ED, IOS_EMPTY_USER_PROFILE_ED, IOS_EMPTY_BOARD_ED_HELPER, 
            IOS_EMPTY_USER_PROFILE_ED_HELPER, IOS_QA_NOTIFICATION_EDUCATION, IOS_NUX_MANDATORY_MEN, IOS_NUX_MANDATORY_WOMEN, IOS_MSGS_NOTIFICATIONS_USER_ED, IOS_MSGS_MESSAGE_LIST_USER_ED, IOS_MSGS_MESSAGE_USER_ED, IOS_MSGS_NOTIFICATIONS_USER_ED_IPAD, IOS_MSGS_MESSAGE_USER_ED_IPAD, IOS_MSGS_WELCOME_MESSAGE, 
            IOS_EMMY_AWARDS, IOS_NAG_ADS_PRIVACY_UPDATE, IOS_REPIN_ED, IOS_REPIN_ED_HELPER, IOS_REPIN_ED_IPAD, IOS_REPIN_ED_HELPER_IPAD, IOS_HOME_FEED_ED, IOS_HOME_FEED_ED_HELPER, IOS_NAG_REBUILD_FEED, IOS_NAG_UNDO_REBUILD_FEED, 
            IOS_NUX_REBUILD_FEED, IOS_CREATE_BUTTON_ED, IOS_PUSH_NOTIFICATION_PERMISSION_PROMPT, IOS_BOARD_FOLLOW_ED, IOS_BOARD_FOLLOW_ED_HELPER, IOS_PROFILE_FOLLOW_ED, IOS_PROFILE_FOLLOW_ED_HELPER, IOS_CLICKTHROUGH_ED, IOS_CLICKTHROUGH_ED_HELPER, IOS_COMBINED_SEARCH_ED, 
            IOS_COMBINED_SEARCH_ED_HELPER, IOS_GUIDED_SEARCH_ED, IOS_GUIDED_SEARCH_ED_HELPER, IOS_CONTEXTUAL_MENU_ED, IOS_MSGS_SEND_PIN_ED, IOS_MSGS_SEND_PIN_ED_HELPER, IOS_NAG_PINVITATIONAL, IOS_NAG_PINVITATIONAL_REFRESH, IOS_PINVITATIONAL_HOME_FEED_MODAL, IOS_NUX_FIRST_BOARD, 
            IOS_NUX_BUILD_HOMEFEED, IOS_NUX_SEARCH_WELCOME_HELPER, IOS_NUX_SEARCH_LIVE_PROFILE_HELPER, IOS_NUX_INTEREST_PICKER, IOS_IN_APP_SURVEY, IOS_SHARE_EXTENSION_EDUCATION, IOS_SCREENSHOT_ED, IOS_NUX_CORE_CONCEPTS_JAPAN_FEMALE, IOS_NUX_CORE_CONCEPTS_JAPAN_MALE, IOS_NAG_GLOBAL_INVITER, 
            IOS_PROFILE_HOME_FEED_HELPER, IOS_COMMERCE_EDUCATION, IOS_NOTIFICATION_PANE_PERMISSION_NAG, IOS_SHARE_EXTENSION_EDUCATION_HOMEFEED_FULL_TAKEOVER, IOS_SHARE_EXTENSION_EDUCATION_HOMEFEED_PARTIAL_TAKEOVER, IOS_SHARE_EXTENSION_EDUCATION_PROFILE_PARTIAL_TAKEOVER, IOS_NUX_FIRST_CLICKTHROUGH, IOS_UNSEEN_NOTIFICATION_HOMEFEED_TOASTER, IOS_NAG_APPLE_APP_STORE, IOS_NUX_CORE_CONCEPTS_M5, 
            IOS_COMMERCE_HOMEFEED_EDUCATION, IOS_COMMERCE_SEARCH_EDUCATION, IOS_COMMERCE_CLOSEUP_BUY_EDUCATION, IOS_COMMERCE_CHECKOUT_EDUCATION, IOS_FIRST_PIN_TOOLTIP, IOS_FIRST_CLICKTHROUGH_TOOLTIP, IOS_FIRST_PIN_REPIN, IOS_FACEBOOK_TRENDING_PIN_TOAST, IOS_OWN_EMPTY_BOARD_ED, IOS_OWN_EMPTY_USER_PROFILE_ED, 
            IOS_OWN_EMPTY_BOARD_ED_HELPER, IOS_OWN_EMPTY_USER_PROFILE_ED_HELPER, IOS_FIRST_PIN_BOARD_CREATE, IOS_COMMERCE_CLOSEUP_MERCHANT_EDUCATION, IOS_FIRST_PIN_HOMEFEED_SCROLL_HELPER, IOS_FIRST_PIN_HOMEFEED_CLOSEUP_HELPER, IOS_FIRST_PIN_HOMEFEED_BUILDER_TOOLTIP, IOS_NAG_COMMERCE_SHOP_OUR_PICKS, IOS_FIRST_FLASHLIGHT_ED, IOS_OWN_LIBRARY_PROFILE_ED, 
            IOS_OWN_LIBRARY_ALL_PINS_ED, IOS_FIRST_FLASHLIGHT_ICON_ED, IOS_HOME_FEED_PROFILE_TAB_TOOLTIP, IOS_NUX_COLD_USE_CASES, IOS_NUX_COLD_HOMEFEED_INTRO_TAKEOVER, IOS_NUX_COLD_HOMEFEED_INTEREST_GIFTWRAP, IOS_NUX_COLD_INTEREST_GIFTWRAP_TAKEOVER, IOS_TEST, ANDROID_NOOP, ANDROID_HERO_EMPTY_HOMEFEED, 
            ANDROID_NAG_CONFIRM_EMAIL, ANDROID_NAG_WRITE_BANNED, ANDROID_NAG_INVITER, ANDROID_EMPTY_BOARD_ED, ANDROID_EMPTY_USER_PROFILE_ED, ANDROID_QA_EDUCATION, ANDROID_QA_NOTIFICATION_EDUCATION, ANDROID_EMPTY_BOARD_ED_HELPER, ANDROID_EMPTY_USER_PROFILE_ED_HELPER, ANDROID_NUX_MANDATORY_MEN, 
            ANDROID_NUX_MANDATORY_WOMEN, ANDROID_EMPTY_BOARD_ED_TABLET, ANDROID_EMPTY_BOARD_ED_HELPER_TABLET, ANDROID_EMPTY_USER_PROFILE_ED_TABLET, ANDROID_EMPTY_USER_PROFILE_ED_HELPER_TABLET, ANDROID_CLICKTHROUGH_ED, ANDROID_MSGS_WELCOME_MESSAGE, ANDROID_EMMY_AWARDS, ANDROID_HOME_FEED_ED, ANDROID_REPIN_ED, 
            ANDROID_NAG_ADS_PRIVACY_UPDATE, ANDROID_HOME_FEED_ED_HELPER, ANDROID_HOME_FEED_ED_TABLET, ANDROID_HOME_FEED_ED_HELPER_TABLET, ANDROID_REPIN_ED_HELPER, ANDROID_REPIN_ED_TABLET, ANDROID_REPIN_ED_HELPER_TABLET, ANDROID_CLICKTHROUGH_ED_HELPER, ANDROID_CLICKTHROUGH_ED_TABLET, ANDROID_CLICKTHROUGH_ED_HELPER_TABLET, 
            ANDROID_NAG_CONNECT_FACEBOOK, ANDROID_NAG_UPLOAD_CONTACTS, ANDROID_BOARD_FOLLOW_ED, ANDROID_BOARD_FOLLOW_ED_HELPER, ANDROID_BOARD_FOLLOW_ED_TABLET, ANDROID_BOARD_FOLLOW_ED_HELPER_TABLET, ANDROID_PROFILE_FOLLOW_ED, ANDROID_PROFILE_FOLLOW_ED_HELPER, ANDROID_PROFILE_FOLLOW_ED_TABLET, ANDROID_PROFILE_FOLLOW_ED_HELPER_TABLET, 
            ANDROID_HERO_PROMPT_REBUILD_FEED, ANDROID_HERO_UNDO_REBUILD_FEED, ANDROID_NUX_REBUILD_FEED, ANDROID_SURVEY_201501, ANDROID_NAG_PINVITATIONAL, ANDROID_PINVITATIONAL_CONFIRM_BOARD, ANDROID_REPIN_ED_V2, ANDROID_REPIN_ED_V2_HELPER, ANDROID_PINVITATIONAL_HOME_FEED_MODAL, ANDROID_HOME_FEED_ED_V2, 
            ANDROID_HOME_FEED_ED_V2_HELPER, ANDROID_SURVEY_201504, ANDROID_NEW_USER_SURVEY_201504, ANDROID_RESURRECTED_USER_SURVEY_201505, ANDROID_NAG_GLOBAL_INVITER, ANDROID_FREE_RESPONSE_USER_SURVEY_201505, ANDROID_PROFILE_OFFLINE_PIN_ED, ANDROID_SHARE_SHEET_EXTENSION_ED, ANDROID_ADS_SURVEY_201507, ANDROID_NUX_FIRST_PIN, 
            ANDROID_HOME_FIRST_PIN_CLOSEUP_PROMPT, ANDROID_NUX_CORE_CONCEPTS_M5, ANDROID_HOMEFEED_BUILDER_TOOLTIP, ANDROID_SURVEY_WOM, ANDROID_HOME_FEED_PROFILE_TAB_TOOLTIP, ANDROID_OWN_LIBRARY_PROFILE_ED, ANDROID_OWN_LIBRARY_ALL_PINS_ED, ANDROID_COMMERCE_HOME_FEED_ED, ANDROID_COMMERCE_CLOSEUP_BUY_ED, ANDROID_COMMERCE_CHECKOUT_ED, 
            ANDROID_COMMERCE_SEARCH_ED, ANDROID_COMMERCE_CLOSEUP_MERCHANT_ED, ANDROID_PINIT_BTN_TOOLTIP, ANDROID_CLICKTHROUGH_BTN_TOOLTIP, ANDROID_FIRST_PIN_SCROLL_PROMPT, ANDROID_FIRST_PIN_TAP_PROMPT, ANDROID_FLASHLIGHT_BUTTON_TOOLTIP, ANDROID_FIRST_FLASHLIGHT_ED, ANDROID_SHARE_EXTENSION_EDUCATION_HOMEFEED_PARTIAL_TAKEOVER, ANDROID_WARM_SEO_NUX_HOMEFEED_INTRO, 
            ANDROID_WARM_SEO_NUX_GIFTWRAP_INTEREST_PICKER, ANDROID_STATEMENT_CREDIT_HOME_FEED, ANDROID_STATEMENT_CREDIT_PIN_CLOSEUP, ANDROID_STATEMENT_CREDIT_CHECKOUT, WEB_MOBILE_NOOP, WEB_MOBILE_NUX_MANDATORY, WEB_MOBILE_NUX_INTERESTS, PUSH_NOTIFICATION_NOOP, PUSH_NOTIFICATION_SIMILAR_REPINS, PUSH_NOTIFICATION_PIN_TWINS, 
            PUSH_NOTIFICATION_FRIEND_PIN, ANALYTICS_NOOP, ANALYTICS_HOME_USER_ED, ANALYTICS_AUDIENCE_SELECTOR_USER_ED, EMAIL_NOOP, EMAIL_USER_ED_TIP_EMPTY_BOARD, EMAIL_USER_ED_TIP_REPIN, EMAIL_USER_ED_TIP_CLICKTHROUGH, EMAIL_USER_ED_TIP_SEARCH, EMAIL_USER_ED_TIP_EMAIL_VERIFY, 
            EMAIL_USER_ED_TIP_PIN_CREATE, EMAIL_USER_ED_TIP_PINIT_BUTTON, BATCH_NOOP, BATCH_EMAIL_FIRST_BOARD_CREATE, BATCH_EMAIL_INTEREST_RECOMMENDATIONS, BATCH_EMAIL_EMPTY_BOARD, BATCH_EMAIL_GUIDED_SEARCH, BATCH_EMAIL_FIRST_PIN_CREATE, BATCH_EMAIL_FIRST_CLICKTHROUGH, BATCH_EMAIL_MOBILE_APP_DOWNLOAD, 
            BATCH_EMAIL_POPULAR_PINS, BATCH_PUSH_NOTIFICATION_HOLIDAY_GUIDE, BATCH_PUSH_NOTIFICATION_ATHELETES_OUTDOORS, BATCH_PUSH_NOTIFICATION_GARDENING, BATCH_PUSH_NOTIFICATION_FOOD, BATCH_PUSH_NOTIFICATION_KIDS, BATCH_PUSH_NOTIFICATION_CREATE_RESOLUTION_BOARD, BATCH_PUSH_NOTIFICATION_RESOLUTION_IDEAS, BATCH_PUSH_NOTIFICATION_SHARE_BOARD, BATCH_EMAIL_HOMEFEED_NEW_PINS, 
            BATCH_PUSH_NOTIFICATION_NEW_USER_DAY_1, BATCH_PUSH_NOTIFICATION_NEW_USER_DAY_2, BATCH_PUSH_NOTIFICATION_NEW_USER_DAY_3, BATCH_NETWORK_STORY_VALENTINE, BATCH_EMAIL_PIN_ON_ANOTHER_BOARD, BATCH_NETWORK_STORY_FATHERS_DAY, BATCH_NETWORK_STORY_BACK_TO_SCHOOL_PARENTS, BATCH_NETWORK_STORY_BACK_TO_SCHOOL_TEACHERS, BATCH_NETWORK_STORY_SHOP_OUR_PICKS, BATCH_NETWORK_STORY_GAME_DAY, 
            BATCH_EMAIL_PIN_TWINS, BATCH_EMAIL_NON_NUX_INTEREST_RECOMMENDATIONS, BATCH_EMAIL_BOARD_CREATE_RECOMMENDATIONS, BATCH_EMAIL_BOARD_FOLLOW_RECOMMENDATIONS, BATCH_EMAIL_NETWORK_STORY_DIGEST, BATCH_EMAIL_FIND_FRIEND, BATCH_EMAIL_EDITORIAL_POPULAR_PINS, BATCH_EMAIL_PROMOTE_GOODIES, BATCH_EMAIL_EDITORIAL, BATCH_EMAIL_POPULAR_PINS_M5, 
            BATCH_PUSH_NOTIFICATION_NUJ_BUILD_HOMEFEED, BATCH_EMAIL_FRIENDS_INTERESTS, BATCH_EMAIL_EDITORIAL_POPULAR_PINS_M5, BATCH_EMAIL_RECOMMENDATIONS_DIGEST, BATCH_EMAIL_TRENDING_PINS, BATCH_EMAIL_DORMANT_BOARD_RECOMMENDATIONS, BATCH_EMAIL_NO_SIGNAL, BATCH_EMAIL_PIN_PRICE_DROP, BATCH_EMAIL_PIN_BECOMES_BUYABLE, BATCH_EMAIL_PIN_FREE_SHIPPING, 
            BATCH_EMAIL_TRENDING_SEARCHES, BATCH_EMAIL_CART_ABANDONMENT, STERLING_NOOP, STERLING_DASHBOARD_USER_ED, CAMPBELL_SIDE_NAV_USER_ED, HOMEFEED_NOOP, HOMEFEED_SEO_BOARD_MULTI_BOARDS, HOMEFEED_CELEB_TOPIC_MULTI_BOARDS, HOMEFEED_LOCAL_TOPIC_MULTI_BOARDS
        });
    }
}
