// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.schemas.event;

import org.apache.thrift.TEnum;

public final class ViewParameterType extends Enum
    implements TEnum
{

    private static final ViewParameterType $VALUES[];
    public static final ViewParameterType ABOUT_ABOUT;
    public static final ViewParameterType ABOUT_BOOKMARKLET;
    public static final ViewParameterType ABOUT_CAREERS;
    public static final ViewParameterType ABOUT_COPYRIGHT;
    public static final ViewParameterType ABOUT_ETIQUETTE;
    public static final ViewParameterType ABOUT_GOODIES;
    public static final ViewParameterType ABOUT_PRESS;
    public static final ViewParameterType ABOUT_PRIVACY;
    public static final ViewParameterType ABOUT_SUPPORT;
    public static final ViewParameterType ABOUT_TEAM;
    public static final ViewParameterType ABOUT_TERMS;
    public static final ViewParameterType ABOUT_USE;
    public static final ViewParameterType ACTIVITY_V2;
    public static final ViewParameterType ANALYTICS_DOMAIN_ALL_TIME;
    public static final ViewParameterType ANALYTICS_DOMAIN_CLICKS;
    public static final ViewParameterType ANALYTICS_DOMAIN_IMPRESSIONS;
    public static final ViewParameterType ANALYTICS_DOMAIN_ORIGINAL_PINS;
    public static final ViewParameterType ANALYTICS_DOMAIN_REPINS;
    public static final ViewParameterType ANALYTICS_PROFILE_ALL_TIME;
    public static final ViewParameterType ANALYTICS_PROFILE_CLICKS;
    public static final ViewParameterType ANALYTICS_PROFILE_IMPRESSIONS;
    public static final ViewParameterType ANALYTICS_PROFILE_REPINS;
    public static final ViewParameterType API_ENVIRONMENTS;
    public static final ViewParameterType BOARD_CHOOSE_COVER;
    public static final ViewParameterType BOARD_COLLABORATORS;
    public static final ViewParameterType BOARD_CREATE;
    public static final ViewParameterType BOARD_CROP_COVER;
    public static final ViewParameterType BOARD_EDIT;
    public static final ViewParameterType BOARD_EDIT_COLLABORATORS;
    public static final ViewParameterType BOARD_EMPTY;
    public static final ViewParameterType BOARD_FOLLOWERS;
    public static final ViewParameterType BOARD_MAP;
    public static final ViewParameterType BOARD_PLACE;
    public static final ViewParameterType BOARD_SETTINGS;
    public static final ViewParameterType BROWSER;
    public static final ViewParameterType BUYABLE_ADDRESS_CONTACTS;
    public static final ViewParameterType BUYABLE_ADDRESS_RECENTS;
    public static final ViewParameterType BUYABLE_CHECKOUT_APPLE_PAY_OPTION;
    public static final ViewParameterType BUYABLE_CHECKOUT_SUMMARY;
    public static final ViewParameterType BUYABLE_CONFIRMATION;
    public static final ViewParameterType BUYABLE_MERCHANT_RETURN_POLICY;
    public static final ViewParameterType BUYABLE_ORDER_DETAILS;
    public static final ViewParameterType BUYABLE_ORDER_HISTORY;
    public static final ViewParameterType BUYABLE_PAYMENT_FORM;
    public static final ViewParameterType BUYABLE_SELECT_PAYMENT;
    public static final ViewParameterType BUYABLE_SELECT_SHIPPING_ADDRESS;
    public static final ViewParameterType BUYABLE_SELECT_SHIPPING_METHOD;
    public static final ViewParameterType BUYABLE_SHIPPING_ADDRESS_FORM;
    public static final ViewParameterType BUYABLE_VARIANT_OPTIONS;
    public static final ViewParameterType CAMERA_ALBUM_PICKER;
    public static final ViewParameterType CAMERA_PHOTO_PICKER;
    public static final ViewParameterType CATEGORY_DISCOVER;
    public static final ViewParameterType CONFIRM_WEBSITE_BY_NAG;
    public static final ViewParameterType CONVERSATION_ADD_PIN;
    public static final ViewParameterType CONVERSATION_CREATE;
    public static final ViewParameterType CONVERSATION_INBOX;
    public static final ViewParameterType CONVERSATION_THREAD;
    public static final ViewParameterType CONVERSATION_USERS;
    public static final ViewParameterType DEEP_LINKING_APP;
    public static final ViewParameterType DEEP_LINKING_FACEBOOK;
    public static final ViewParameterType DEPRECATED_DEEP_LINKING_EMAIL;
    public static final ViewParameterType DEPRECATED_DEEP_LINKING_WEB;
    public static final ViewParameterType DISCOVER_CATEGORY;
    public static final ViewParameterType DISCOVER_INTEREST;
    public static final ViewParameterType DISCOVER_SEARCH_INTERESTS;
    public static final ViewParameterType EDUCATION_CONTEXTUAL_MENU;
    public static final ViewParameterType EDUCATION_FLYOUT;
    public static final ViewParameterType EDUCATION_GUIDED_SEARCH;
    public static final ViewParameterType EDUCATION_LONGPRESS;
    public static final ViewParameterType EDUCATION_RELATED_PINS;
    public static final ViewParameterType EDUCATION_SAVE;
    public static final ViewParameterType EDUCATION_SECRET_BOARD;
    public static final ViewParameterType EMAIL_ACTIVITY_AGGREGATION;
    public static final ViewParameterType EMAIL_ANSWER_CREATE;
    public static final ViewParameterType EMAIL_ANSWER_LIKE;
    public static final ViewParameterType EMAIL_BOARD_COLLABORATION;
    public static final ViewParameterType EMAIL_BOARD_RECOMMENDATIONS;
    public static final ViewParameterType EMAIL_COMMENT_AND_MENTION;
    public static final ViewParameterType EMAIL_CONVERSATIONS;
    public static final ViewParameterType EMAIL_EDITORIAL;
    public static final ViewParameterType EMAIL_FIREHOSE_ANSWER_CREATE;
    public static final ViewParameterType EMAIL_FIREHOSE_QUESTION_CREATE;
    public static final ViewParameterType EMAIL_FIREHOSE_REPLY_CREATE;
    public static final ViewParameterType EMAIL_FRIEND_JOINED;
    public static final ViewParameterType EMAIL_HOMEFEED_NEW_PINS;
    public static final ViewParameterType EMAIL_INTEREST_RECOMMENDATIONS;
    public static final ViewParameterType EMAIL_LEGAL;
    public static final ViewParameterType EMAIL_NETWORK_STORY_DIGEST;
    public static final ViewParameterType EMAIL_NO_SIGNAL;
    public static final ViewParameterType EMAIL_PARTNER;
    public static final ViewParameterType EMAIL_PINVITATIONAL_ACCESS;
    public static final ViewParameterType EMAIL_PINVITATIONAL_RALLYING_CALL;
    public static final ViewParameterType EMAIL_PIN_RECOMMENDATIONS;
    public static final ViewParameterType EMAIL_QUESTION_CREATE;
    public static final ViewParameterType EMAIL_QUESTION_LIKE;
    public static final ViewParameterType EMAIL_RECOMMENDATIONS_DIGEST;
    public static final ViewParameterType EMAIL_REPLY_CREATE;
    public static final ViewParameterType EMAIL_RESTART_FEED;
    public static final ViewParameterType EMAIL_SECURITY;
    public static final ViewParameterType EMAIL_SEND_BOARD;
    public static final ViewParameterType EMAIL_SEND_PIN;
    public static final ViewParameterType EMAIL_SEND_PINNER;
    public static final ViewParameterType EMAIL_SOCIAL_DIGEST;
    public static final ViewParameterType EMAIL_TRANSACTIONAL;
    public static final ViewParameterType EMAIL_UNKNOWN;
    public static final ViewParameterType EMAIL_USECASES;
    public static final ViewParameterType EMAIL_USER_RECOMMENDATIONS;
    public static final ViewParameterType EMAIL_WEEK_IN_REVIEW;
    public static final ViewParameterType EMAIL_WELCOME;
    public static final ViewParameterType ERROR_NO_ACTIVITY;
    public static final ViewParameterType ERROR_NO_BOARD;
    public static final ViewParameterType ERROR_NO_INTERNET;
    public static final ViewParameterType ERROR_NO_PIN;
    public static final ViewParameterType ERROR_NO_USER;
    public static final ViewParameterType EXTENSION_INSTALLED;
    public static final ViewParameterType EXTENSION_NOT_INSTALLED;
    public static final ViewParameterType EXTENSION_UPSELL_MODAL;
    public static final ViewParameterType EXTENSION_UPSELL_NAG;
    public static final ViewParameterType EXTENSION_UPSELL_NAG_PIN_CREATE;
    public static final ViewParameterType EXTENSION_UPSELL_NUX;
    public static final ViewParameterType EXTENSION_UPSELL_TOAST;
    public static final ViewParameterType EXTERNAL_SOURCE_OTHER;
    public static final ViewParameterType FEED_BUYABLE_CATEGORY;
    public static final ViewParameterType FEED_CATEGORY;
    public static final ViewParameterType FEED_CATEGORY_ANIMALS;
    public static final ViewParameterType FEED_CATEGORY_ARCHITECTURE;
    public static final ViewParameterType FEED_CATEGORY_ART;
    public static final ViewParameterType FEED_CATEGORY_CARS_MOTORCYCLES;
    public static final ViewParameterType FEED_CATEGORY_CELEBRITIES;
    public static final ViewParameterType FEED_CATEGORY_CHRISTMAS_SWEATER;
    public static final ViewParameterType FEED_CATEGORY_DESIGN;
    public static final ViewParameterType FEED_CATEGORY_DIY_CRAFTS;
    public static final ViewParameterType FEED_CATEGORY_EDUCATION;
    public static final ViewParameterType FEED_CATEGORY_FILM_MUSIC_BOOKS;
    public static final ViewParameterType FEED_CATEGORY_FOOD_DRINK;
    public static final ViewParameterType FEED_CATEGORY_GARDENING;
    public static final ViewParameterType FEED_CATEGORY_GEEK;
    public static final ViewParameterType FEED_CATEGORY_HAIR_BEAUTY;
    public static final ViewParameterType FEED_CATEGORY_HEALTH_FITNESS;
    public static final ViewParameterType FEED_CATEGORY_HISTORY;
    public static final ViewParameterType FEED_CATEGORY_HOLIDAYS_EVENTS;
    public static final ViewParameterType FEED_CATEGORY_HOLIDAY_FOR_ALL;
    public static final ViewParameterType FEED_CATEGORY_HOLIDAY_FOR_HER;
    public static final ViewParameterType FEED_CATEGORY_HOLIDAY_FOR_HIM;
    public static final ViewParameterType FEED_CATEGORY_HOLIDAY_FOR_KIDS;
    public static final ViewParameterType FEED_CATEGORY_HOME_DECOR;
    public static final ViewParameterType FEED_CATEGORY_HUMOR;
    public static final ViewParameterType FEED_CATEGORY_ILLUSTRATIONS_POSTERS;
    public static final ViewParameterType FEED_CATEGORY_KIDS;
    public static final ViewParameterType FEED_CATEGORY_MENS_FASHION;
    public static final ViewParameterType FEED_CATEGORY_OUTDOORS;
    public static final ViewParameterType FEED_CATEGORY_PHOTOGRAPHY;
    public static final ViewParameterType FEED_CATEGORY_PRODUCTS;
    public static final ViewParameterType FEED_CATEGORY_QUOTES;
    public static final ViewParameterType FEED_CATEGORY_SCIENCE_NATURE;
    public static final ViewParameterType FEED_CATEGORY_SPORTS;
    public static final ViewParameterType FEED_CATEGORY_TATTOOS;
    public static final ViewParameterType FEED_CATEGORY_TECHNOLOGY;
    public static final ViewParameterType FEED_CATEGORY_TOPIC;
    public static final ViewParameterType FEED_CATEGORY_TRAVEL;
    public static final ViewParameterType FEED_CATEGORY_WEDDINGS;
    public static final ViewParameterType FEED_CATEGORY_WOMENS_FASHION;
    public static final ViewParameterType FEED_COMMERCE;
    public static final ViewParameterType FEED_COMMERCE_BUYABLE;
    public static final ViewParameterType FEED_COMMERCE_PICKS;
    public static final ViewParameterType FEED_DIGEST;
    public static final ViewParameterType FEED_DIGEST_STORY;
    public static final ViewParameterType FEED_DOMAIN;
    public static final ViewParameterType FEED_DYNAMIC_GRID;
    public static final ViewParameterType FEED_EDITOR_FOLLOW_BOARDS;
    public static final ViewParameterType FEED_EDITOR_UNFOLLOW_BOARDS;
    public static final ViewParameterType FEED_EVERYTHING;
    public static final ViewParameterType FEED_FOLLOWING;
    public static final ViewParameterType FEED_FRIENDS;
    public static final ViewParameterType FEED_GIFTS;
    public static final ViewParameterType FEED_GIFTS_100_200;
    public static final ViewParameterType FEED_GIFTS_20;
    public static final ViewParameterType FEED_GIFTS_200_500;
    public static final ViewParameterType FEED_GIFTS_20_50;
    public static final ViewParameterType FEED_GIFTS_500;
    public static final ViewParameterType FEED_GIFTS_50_100;
    public static final ViewParameterType FEED_HOME;
    public static final ViewParameterType FEED_INTEREST;
    public static final ViewParameterType FEED_PLACES;
    public static final ViewParameterType FEED_POPULAR;
    public static final ViewParameterType FEED_RELATED_BOARD;
    public static final ViewParameterType FEED_RELATED_INTEREST;
    public static final ViewParameterType FEED_SHOP_SPACE;
    public static final ViewParameterType FEED_SOURCE;
    public static final ViewParameterType FEED_SUBCATEGORY;
    public static final ViewParameterType FEED_TODAYS_PICKS;
    public static final ViewParameterType FEED_TOP_PICKS;
    public static final ViewParameterType FEED_TOP_SHOPS;
    public static final ViewParameterType FEED_VIDEOS;
    public static final ViewParameterType FEED_WELCOME;
    public static final ViewParameterType FIND_FRIENDS;
    public static final ViewParameterType FIND_FRIENDS_ADDRESS_BOOK;
    public static final ViewParameterType FIND_FRIENDS_FACEBOOK;
    public static final ViewParameterType FIND_FRIENDS_INVITE_ALL;
    public static final ViewParameterType FIND_FRIENDS_MORE;
    public static final ViewParameterType FIND_FRIENDS_TWITTER;
    public static final ViewParameterType FPE_CREATE_FIRST_BOARD;
    public static final ViewParameterType FRIEND_INVITER_EMAIL;
    public static final ViewParameterType FRIEND_INVITER_FACEBOOK;
    public static final ViewParameterType FRIEND_INVITER_FIND_FRIENDS;
    public static final ViewParameterType FRIEND_INVITER_GMAIL;
    public static final ViewParameterType FRIEND_INVITER_INVITE;
    public static final ViewParameterType FRIEND_INVITER_TWITTER;
    public static final ViewParameterType FRIEND_INVITER_YAHOO;
    public static final ViewParameterType HOMEFEED_BUILDER;
    public static final ViewParameterType HOMEFEED_BUILDER_MY_BOARDS;
    public static final ViewParameterType HOMEFEED_BUILDER_MY_TOPICS;
    public static final ViewParameterType HOMEFEED_BUILDER_MY_USERS;
    public static final ViewParameterType HOMEFEED_BUILDER_REC_BOARDS;
    public static final ViewParameterType HOMEFEED_BUILDER_REC_TOPICS;
    public static final ViewParameterType HOMEFEED_BUILDER_REC_USERS;
    public static final ViewParameterType HOMEFEED_BUILDER_SPLASH;
    public static final ViewParameterType LIBRARY_ALL_PINS;
    public static final ViewParameterType LIBRARY_FOLLOWERS;
    public static final ViewParameterType LIBRARY_FOLLOWING;
    public static final ViewParameterType LIBRARY_HOME;
    public static final ViewParameterType LIBRARY_LIKES;
    public static final ViewParameterType LOGIN_EMAIL;
    public static final ViewParameterType LOGIN_FACEBOOK;
    public static final ViewParameterType LOGIN_TWITTER;
    public static final ViewParameterType MOBILE_ORIENTATION_COLLECT;
    public static final ViewParameterType MOBILE_ORIENTATION_DISCOVER;
    public static final ViewParameterType MOBILE_ORIENTATION_FUNCTIONAL;
    public static final ViewParameterType MOBILE_ORIENTATION_STORY;
    public static final ViewParameterType NEWS_NETWORK_STORY;
    public static final ViewParameterType NEWS_YOUR_STORY;
    public static final ViewParameterType ORIENTATION_END;
    public static final ViewParameterType ORIENTATION_FAST_FOLLOW;
    public static final ViewParameterType ORIENTATION_INTEREST_PICKER;
    public static final ViewParameterType ORIENTATION_START;
    public static final ViewParameterType ORIENTATION_USER_PICKER;
    public static final ViewParameterType PICKED_FOR_YOU_FEED;
    public static final ViewParameterType PINVITATIONAL_AUTH_CONFIRM;
    public static final ViewParameterType PINVITATIONAL_HOME_FEED_MODAL;
    public static final ViewParameterType PINVITATIONAL_PIN_SUMMARY;
    public static final ViewParameterType PINVITATIONAL_SIGNUP_REDEMPTION;
    public static final ViewParameterType PINVITATIONAL_UNAUTH_CONFIRM;
    public static final ViewParameterType PINVITATIONAL_UNAUTH_EMAIL;
    public static final ViewParameterType PIN_ANSWERS;
    public static final ViewParameterType PIN_ARTICLE;
    public static final ViewParameterType PIN_CLOSEUP_BODY;
    public static final ViewParameterType PIN_CLOSEUP_RELATED_PINS;
    public static final ViewParameterType PIN_COMMENTS;
    public static final ViewParameterType PIN_CREATE;
    public static final ViewParameterType PIN_CREATE_PINMARKLET;
    public static final ViewParameterType PIN_CREATE_PLACES;
    public static final ViewParameterType PIN_CREATE_REPIN;
    public static final ViewParameterType PIN_CREATE_SDK;
    public static final ViewParameterType PIN_EDIT;
    public static final ViewParameterType PIN_FLASHLIGHT_RESULTS;
    public static final ViewParameterType PIN_LIKES;
    public static final ViewParameterType PIN_LOOKBOOK;
    public static final ViewParameterType PIN_MOVIE;
    public static final ViewParameterType PIN_OTHER;
    public static final ViewParameterType PIN_PLACE;
    public static final ViewParameterType PIN_PRODUCT;
    public static final ViewParameterType PIN_PRODUCT_MERCHANT;
    public static final ViewParameterType PIN_QUESTIONS;
    public static final ViewParameterType PIN_RECIPE;
    public static final ViewParameterType PIN_REGULAR;
    public static final ViewParameterType PIN_REPIN_BOARDS;
    public static final ViewParameterType PIN_REPLIES;
    public static final ViewParameterType PIN_SEND_TO;
    public static final ViewParameterType PIN_TWINS;
    public static final ViewParameterType PLACE_VIEW_HEADER;
    public static final ViewParameterType PLACE_VIEW_RELATED_PINS;
    public static final ViewParameterType PUSH_NOTIFICATION_ACTION;
    public static final ViewParameterType PUSH_NOTIFICATION_CONVERSATION;
    public static final ViewParameterType PUSH_NOTIFICATION_EDITORIAL;
    public static final ViewParameterType PUSH_NOTIFICATION_FRIEND_NEWS;
    public static final ViewParameterType PUSH_NOTIFICATION_INTERACTION;
    public static final ViewParameterType PUSH_NOTIFICATION_SYSTEM_NEWS;
    public static final ViewParameterType PUSH_NOTIFICATION_UNKNOWN;
    public static final ViewParameterType REBUILD_FEED_END;
    public static final ViewParameterType REBUILD_FEED_INTEREST_PICKER;
    public static final ViewParameterType REGISTRATION_AGE_GENDER;
    public static final ViewParameterType REGISTRATION_BOARDS;
    public static final ViewParameterType REGISTRATION_LANDING;
    public static final ViewParameterType REGISTRATION_LOCAL_INFO;
    public static final ViewParameterType REGISTRATION_SIGNUP;
    public static final ViewParameterType REGISTRATION_SIGNUP_BUSINESS;
    public static final ViewParameterType REPORT_PIN;
    public static final ViewParameterType REPORT_USER;
    public static final ViewParameterType SEARCH_AUTOCOMPLETE;
    public static final ViewParameterType SEARCH_BOARDS;
    public static final ViewParameterType SEARCH_BUYABLE;
    public static final ViewParameterType SEARCH_INTERESTS;
    public static final ViewParameterType SEARCH_MY_PINS;
    public static final ViewParameterType SEARCH_PINS;
    public static final ViewParameterType SEARCH_PLACES;
    public static final ViewParameterType SEARCH_PLACE_BOARDS;
    public static final ViewParameterType SEARCH_USERS;
    public static final ViewParameterType SEND_SHARE_MAIN;
    public static final ViewParameterType SERVICE_ENTRY_SEO_BING;
    public static final ViewParameterType SERVICE_ENTRY_SEO_GOOGLE;
    public static final ViewParameterType SERVICE_ENTRY_SEO_YAHOO;
    public static final ViewParameterType SERVICE_ENTRY_SOCIAL_FACEBOOK;
    public static final ViewParameterType SERVICE_ENTRY_SOCIAL_TWITTER;
    public static final ViewParameterType SETTINGS_OFFLINE_BOARD;
    public static final ViewParameterType SETTINGS_SEARCH_PRIVACY;
    public static final ViewParameterType SHARE_EXTENSION;
    public static final ViewParameterType SPLASH_BRIO_WALL;
    public static final ViewParameterType SPLASH_CONTINUE_EMAIL;
    public static final ViewParameterType SPLASH_INSPIRED_WALL;
    public static final ViewParameterType SPLASH_LOADING;
    public static final ViewParameterType SPLASH_MULTISTEP;
    public static final ViewParameterType STERLING_ACCOUNT_DASHBOARD;
    public static final ViewParameterType STERLING_ADVERTISER_DASHBOARD;
    public static final ViewParameterType STERLING_ADVERTISER_EDIT;
    public static final ViewParameterType STERLING_CAMPAIGN_DASHBOARD;
    public static final ViewParameterType STERLING_CAMPAIGN_EDIT;
    public static final ViewParameterType STERLING_CONVERSION_TAG_CREATE;
    public static final ViewParameterType STERLING_CONVERSION_TAG_EDIT;
    public static final ViewParameterType STERLING_CPA_OBJECTIVE_DASHBOARD;
    public static final ViewParameterType STERLING_CPC_OBJECTIVE_DASHBOARD;
    public static final ViewParameterType STERLING_CPE_OBJECTIVE_DASHBOARD;
    public static final ViewParameterType STERLING_CPM_OBJECTIVE_DASHBOARD;
    public static final ViewParameterType STERLING_CREATION_FLOW_BILLING;
    public static final ViewParameterType STERLING_CREATION_FLOW_CHOOSE_OBJECTIVE;
    public static final ViewParameterType STERLING_CREATION_FLOW_PICK_A_PIN;
    public static final ViewParameterType STERLING_CREATION_FLOW_SETUP_DETAILS;
    public static final ViewParameterType STERLING_PIN_PROMOTION_DASHBOARD;
    public static final ViewParameterType STERLING_PIN_PROMOTION_EDIT;
    public static final ViewParameterType STORIES_RELATED_BOARDS;
    public static final ViewParameterType STORIES_RELATED_INTERESTS;
    public static final ViewParameterType STORIES_RELATED_PINS;
    public static final ViewParameterType STORIES_RELATED_USERS;
    public static final ViewParameterType USER_ABOUT;
    public static final ViewParameterType USER_ACTIVITY;
    public static final ViewParameterType USER_BOARDS;
    public static final ViewParameterType USER_EDIT;
    public static final ViewParameterType USER_FOLLOWERS;
    public static final ViewParameterType USER_FOLLOWING;
    public static final ViewParameterType USER_FYP;
    public static final ViewParameterType USER_INTERESTS;
    public static final ViewParameterType USER_LIKES;
    public static final ViewParameterType USER_PINS;
    private final int value;

    private ViewParameterType(String s, int i, int j)
    {
        super(s, i);
        value = j;
    }

    public static ViewParameterType findByValue(int i)
    {
        switch (i)
        {
        default:
            return null;

        case 0: // '\0'
            return FEED_FOLLOWING;

        case 1: // '\001'
            return FEED_FRIENDS;

        case 2: // '\002'
            return FEED_EVERYTHING;

        case 3: // '\003'
            return FEED_POPULAR;

        case 4: // '\004'
            return FEED_SOURCE;

        case 92: // '\\'
            return FEED_HOME;

        case 111: // 'o'
            return FEED_TOP_PICKS;

        case 118: // 'v'
            return FEED_WELCOME;

        case 119: // 'w'
            return PIN_CREATE_PINMARKLET;

        case 120: // 'x'
            return FEED_SUBCATEGORY;

        case 136: 
            return FEED_INTEREST;

        case 207: 
            return FEED_DIGEST;

        case 208: 
            return FEED_DIGEST_STORY;

        case 209: 
            return FEED_DYNAMIC_GRID;

        case 91: // '['
            return CATEGORY_DISCOVER;

        case 5: // '\005'
            return FEED_CATEGORY_ANIMALS;

        case 6: // '\006'
            return FEED_CATEGORY_ARCHITECTURE;

        case 7: // '\007'
            return FEED_CATEGORY_ART;

        case 8: // '\b'
            return FEED_CATEGORY_CARS_MOTORCYCLES;

        case 9: // '\t'
            return FEED_CATEGORY_CELEBRITIES;

        case 10: // '\n'
            return FEED_CATEGORY_DESIGN;

        case 11: // '\013'
            return FEED_CATEGORY_DIY_CRAFTS;

        case 12: // '\f'
            return FEED_CATEGORY_EDUCATION;

        case 13: // '\r'
            return FEED_CATEGORY_FILM_MUSIC_BOOKS;

        case 14: // '\016'
            return FEED_CATEGORY_FOOD_DRINK;

        case 15: // '\017'
            return FEED_CATEGORY_GARDENING;

        case 16: // '\020'
            return FEED_CATEGORY_GEEK;

        case 17: // '\021'
            return FEED_CATEGORY_HAIR_BEAUTY;

        case 18: // '\022'
            return FEED_CATEGORY_HEALTH_FITNESS;

        case 19: // '\023'
            return FEED_CATEGORY_HISTORY;

        case 20: // '\024'
            return FEED_CATEGORY_HOLIDAYS_EVENTS;

        case 21: // '\025'
            return FEED_CATEGORY_HOME_DECOR;

        case 22: // '\026'
            return FEED_CATEGORY_HUMOR;

        case 23: // '\027'
            return FEED_CATEGORY_ILLUSTRATIONS_POSTERS;

        case 24: // '\030'
            return FEED_CATEGORY_KIDS;

        case 25: // '\031'
            return FEED_CATEGORY_MENS_FASHION;

        case 26: // '\032'
            return FEED_CATEGORY_OUTDOORS;

        case 27: // '\033'
            return FEED_CATEGORY_PHOTOGRAPHY;

        case 28: // '\034'
            return FEED_CATEGORY_PRODUCTS;

        case 29: // '\035'
            return FEED_CATEGORY_QUOTES;

        case 30: // '\036'
            return FEED_CATEGORY_SCIENCE_NATURE;

        case 31: // '\037'
            return FEED_CATEGORY_SPORTS;

        case 32: // ' '
            return FEED_CATEGORY_TATTOOS;

        case 33: // '!'
            return FEED_CATEGORY_TECHNOLOGY;

        case 34: // '"'
            return FEED_CATEGORY_TRAVEL;

        case 35: // '#'
            return FEED_CATEGORY_WEDDINGS;

        case 36: // '$'
            return FEED_CATEGORY_WOMENS_FASHION;

        case 124: // '|'
            return FEED_CATEGORY_HOLIDAY_FOR_HIM;

        case 125: // '}'
            return FEED_CATEGORY_HOLIDAY_FOR_HER;

        case 126: // '~'
            return FEED_CATEGORY_HOLIDAY_FOR_KIDS;

        case 127: // '\177'
            return FEED_CATEGORY_HOLIDAY_FOR_ALL;

        case 130: 
            return FEED_CATEGORY_CHRISTMAS_SWEATER;

        case 400: 
            return FEED_CATEGORY;

        case 401: 
            return FEED_CATEGORY_TOPIC;

        case 85: // 'U'
            return FEED_GIFTS;

        case 37: // '%'
            return FEED_GIFTS_20;

        case 38: // '&'
            return FEED_GIFTS_20_50;

        case 39: // '\''
            return FEED_GIFTS_50_100;

        case 40: // '('
            return FEED_GIFTS_100_200;

        case 41: // ')'
            return FEED_GIFTS_200_500;

        case 42: // '*'
            return FEED_GIFTS_500;

        case 128: 
            return FEED_VIDEOS;

        case 129: 
            return FEED_DOMAIN;

        case 200: 
            return FEED_PLACES;

        case 226: 
            return FEED_COMMERCE;

        case 247: 
            return FEED_COMMERCE_BUYABLE;

        case 250: 
            return FEED_COMMERCE_PICKS;

        case 137: 
            return DISCOVER_CATEGORY;

        case 138: 
            return DISCOVER_INTEREST;

        case 185: 
            return DISCOVER_SEARCH_INTERESTS;

        case 43: // '+'
            return SEARCH_PINS;

        case 44: // ','
            return SEARCH_BOARDS;

        case 45: // '-'
            return SEARCH_USERS;

        case 103: // 'g'
            return SEARCH_AUTOCOMPLETE;

        case 107: // 'k'
            return SEARCH_MY_PINS;

        case 123: // '{'
            return SEARCH_PLACES;

        case 181: 
            return SEARCH_PLACE_BOARDS;

        case 182: 
            return SEARCH_INTERESTS;

        case 254: 
            return SEARCH_BUYABLE;

        case 46: // '.'
            return REGISTRATION_LANDING;

        case 47: // '/'
            return REGISTRATION_SIGNUP;

        case 48: // '0'
            return REGISTRATION_BOARDS;

        case 300: 
            return REGISTRATION_SIGNUP_BUSINESS;

        case 301: 
            return REGISTRATION_LOCAL_INFO;

        case 302: 
            return REGISTRATION_AGE_GENDER;

        case 49: // '1'
            return USER_BOARDS;

        case 50: // '2'
            return USER_FOLLOWERS;

        case 51: // '3'
            return USER_FOLLOWING;

        case 52: // '4'
            return USER_LIKES;

        case 53: // '5'
            return USER_ACTIVITY;

        case 74: // 'J'
            return USER_PINS;

        case 93: // ']'
            return USER_EDIT;

        case 183: 
            return USER_INTERESTS;

        case 189: 
            return USER_FYP;

        case 54: // '6'
            return BOARD_FOLLOWERS;

        case 55: // '7'
            return BOARD_SETTINGS;

        case 87: // 'W'
            return BOARD_CREATE;

        case 88: // 'X'
            return BOARD_EDIT;

        case 104: // 'h'
            return BOARD_EDIT_COLLABORATORS;

        case 228: 
            return BOARD_CHOOSE_COVER;

        case 229: 
            return BOARD_CROP_COVER;

        case 121: // 'y'
            return BOARD_PLACE;

        case 122: // 'z'
            return BOARD_MAP;

        case 230: 
            return BOARD_EMPTY;

        case 56: // '8'
            return FRIEND_INVITER_EMAIL;

        case 57: // '9'
            return FRIEND_INVITER_FACEBOOK;

        case 131: 
            return FRIEND_INVITER_FIND_FRIENDS;

        case 58: // ':'
            return FRIEND_INVITER_GMAIL;

        case 132: 
            return FRIEND_INVITER_INVITE;

        case 133: 
            return FRIEND_INVITER_TWITTER;

        case 59: // ';'
            return FRIEND_INVITER_YAHOO;

        case 60: // '<'
            return ABOUT_TERMS;

        case 61: // '='
            return ABOUT_SUPPORT;

        case 62: // '>'
            return ABOUT_BOOKMARKLET;

        case 76: // 'L'
            return ABOUT_ETIQUETTE;

        case 77: // 'M'
            return ABOUT_ABOUT;

        case 78: // 'N'
            return ABOUT_GOODIES;

        case 79: // 'O'
            return ABOUT_CAREERS;

        case 80: // 'P'
            return ABOUT_TEAM;

        case 81: // 'Q'
            return ABOUT_PRESS;

        case 82: // 'R'
            return ABOUT_PRIVACY;

        case 83: // 'S'
            return ABOUT_USE;

        case 84: // 'T'
            return ABOUT_COPYRIGHT;

        case 63: // '?'
            return LOGIN_EMAIL;

        case 64: // '@'
            return LOGIN_FACEBOOK;

        case 65: // 'A'
            return LOGIN_TWITTER;

        case 66: // 'B'
            return ERROR_NO_INTERNET;

        case 67: // 'C'
            return ERROR_NO_PIN;

        case 68: // 'D'
            return ERROR_NO_BOARD;

        case 69: // 'E'
            return ERROR_NO_USER;

        case 70: // 'F'
            return ERROR_NO_ACTIVITY;

        case 71: // 'G'
            return REPORT_PIN;

        case 86: // 'V'
            return REPORT_USER;

        case 72: // 'H'
            return PIN_CREATE_REPIN;

        case 73: // 'I'
            return PIN_CREATE;

        case 100: // 'd'
            return PIN_CREATE_SDK;

        case 89: // 'Y'
            return PIN_EDIT;

        case 105: // 'i'
            return PIN_SEND_TO;

        case 75: // 'K'
            return USER_ABOUT;

        case 90: // 'Z'
            return BOARD_COLLABORATORS;

        case 94: // '^'
            return EDUCATION_LONGPRESS;

        case 101: // 'e'
            return EDUCATION_RELATED_PINS;

        case 95: // '_'
            return EDUCATION_SECRET_BOARD;

        case 108: // 'l'
            return EDUCATION_CONTEXTUAL_MENU;

        case 184: 
            return EDUCATION_GUIDED_SEARCH;

        case 221: 
            return EDUCATION_FLYOUT;

        case 231: 
            return EDUCATION_SAVE;

        case 96: // '`'
            return MOBILE_ORIENTATION_DISCOVER;

        case 97: // 'a'
            return MOBILE_ORIENTATION_COLLECT;

        case 98: // 'b'
            return MOBILE_ORIENTATION_FUNCTIONAL;

        case 99: // 'c'
            return MOBILE_ORIENTATION_STORY;

        case 102: // 'f'
            return ORIENTATION_FAST_FOLLOW;

        case 106: // 'j'
            return PICKED_FOR_YOU_FEED;

        case 109: // 'm'
            return FEED_EDITOR_FOLLOW_BOARDS;

        case 110: // 'n'
            return FEED_EDITOR_UNFOLLOW_BOARDS;

        case 112: // 'p'
            return DEPRECATED_DEEP_LINKING_EMAIL;

        case 113: // 'q'
            return DEPRECATED_DEEP_LINKING_WEB;

        case 114: // 'r'
            return DEEP_LINKING_FACEBOOK;

        case 115: // 's'
            return DEEP_LINKING_APP;

        case 116: // 't'
            return FEED_RELATED_BOARD;

        case 117: // 'u'
            return FEED_RELATED_INTEREST;

        case 135: 
            return FIND_FRIENDS;

        case 139: 
            return PIN_OTHER;

        case 140: 
            return PIN_REGULAR;

        case 141: 
            return PIN_ARTICLE;

        case 142: 
            return PIN_MOVIE;

        case 143: 
            return PIN_PLACE;

        case 144: 
            return PIN_PRODUCT;

        case 145: 
            return PIN_RECIPE;

        case 146: 
            return PIN_LOOKBOOK;

        case 147: 
            return PIN_PRODUCT_MERCHANT;

        case 150: 
            return PIN_CREATE_PLACES;

        case 151: 
            return PIN_LIKES;

        case 152: 
            return PIN_COMMENTS;

        case 153: 
            return PIN_REPIN_BOARDS;

        case 154: 
            return PIN_CLOSEUP_BODY;

        case 155: 
            return PIN_CLOSEUP_RELATED_PINS;

        case 186: 
            return PIN_QUESTIONS;

        case 187: 
            return PIN_ANSWERS;

        case 188: 
            return PIN_REPLIES;

        case 160: 
            return SPLASH_LOADING;

        case 161: 
            return SPLASH_INSPIRED_WALL;

        case 162: 
            return SPLASH_BRIO_WALL;

        case 163: 
            return SPLASH_CONTINUE_EMAIL;

        case 164: 
            return SPLASH_MULTISTEP;

        case 170: 
            return ORIENTATION_START;

        case 171: 
            return ORIENTATION_END;

        case 172: 
            return ORIENTATION_INTEREST_PICKER;

        case 173: 
            return ORIENTATION_USER_PICKER;

        case 222: 
            return REBUILD_FEED_INTEREST_PICKER;

        case 223: 
            return REBUILD_FEED_END;

        case 190: 
            return STORIES_RELATED_PINS;

        case 191: 
            return STORIES_RELATED_USERS;

        case 192: 
            return STORIES_RELATED_BOARDS;

        case 193: 
            return STORIES_RELATED_INTERESTS;

        case 195: 
            return BROWSER;

        case 201: 
            return CONVERSATION_CREATE;

        case 202: 
            return CONVERSATION_THREAD;

        case 203: 
            return CONVERSATION_INBOX;

        case 204: 
            return CONVERSATION_ADD_PIN;

        case 205: 
            return CONVERSATION_USERS;

        case 210: 
            return NEWS_NETWORK_STORY;

        case 211: 
            return NEWS_YOUR_STORY;

        case 224: 
            return PIN_TWINS;

        case 225: 
            return ACTIVITY_V2;

        case 232: 
            return BUYABLE_MERCHANT_RETURN_POLICY;

        case 233: 
            return BUYABLE_VARIANT_OPTIONS;

        case 234: 
            return BUYABLE_CHECKOUT_APPLE_PAY_OPTION;

        case 235: 
            return BUYABLE_CHECKOUT_SUMMARY;

        case 236: 
            return BUYABLE_SELECT_SHIPPING_ADDRESS;

        case 237: 
            return BUYABLE_SHIPPING_ADDRESS_FORM;

        case 238: 
            return BUYABLE_SELECT_SHIPPING_METHOD;

        case 239: 
            return BUYABLE_SELECT_PAYMENT;

        case 240: 
            return BUYABLE_PAYMENT_FORM;

        case 241: 
            return BUYABLE_CONFIRMATION;

        case 242: 
            return BUYABLE_ORDER_HISTORY;

        case 243: 
            return BUYABLE_ORDER_DETAILS;

        case 244: 
            return BUYABLE_ADDRESS_CONTACTS;

        case 245: 
            return BUYABLE_ADDRESS_RECENTS;

        case 248: 
            return PLACE_VIEW_HEADER;

        case 249: 
            return PLACE_VIEW_RELATED_PINS;

        case 1900: 
            return EXTERNAL_SOURCE_OTHER;

        case 2000: 
            return EMAIL_UNKNOWN;

        case 2001: 
            return EMAIL_TRANSACTIONAL;

        case 2002: 
            return EMAIL_EDITORIAL;

        case 2003: 
            return EMAIL_ACTIVITY_AGGREGATION;

        case 2004: 
            return EMAIL_RECOMMENDATIONS_DIGEST;

        case 2005: 
            return EMAIL_SOCIAL_DIGEST;

        case 2006: 
            return EMAIL_SEND_PIN;

        case 2007: 
            return EMAIL_SEND_BOARD;

        case 2008: 
            return EMAIL_SEND_PINNER;

        case 2009: 
            return EMAIL_FRIEND_JOINED;

        case 2010: 
            return EMAIL_WELCOME;

        case 2011: 
            return EMAIL_BOARD_RECOMMENDATIONS;

        case 2012: 
            return EMAIL_PIN_RECOMMENDATIONS;

        case 2013: 
            return EMAIL_COMMENT_AND_MENTION;

        case 2014: 
            return EMAIL_USECASES;

        case 2015: 
            return EMAIL_FIREHOSE_QUESTION_CREATE;

        case 2016: 
            return EMAIL_FIREHOSE_ANSWER_CREATE;

        case 2017: 
            return EMAIL_FIREHOSE_REPLY_CREATE;

        case 2018: 
            return EMAIL_QUESTION_CREATE;

        case 2019: 
            return EMAIL_ANSWER_CREATE;

        case 2020: 
            return EMAIL_QUESTION_LIKE;

        case 2021: 
            return EMAIL_ANSWER_LIKE;

        case 2022: 
            return EMAIL_REPLY_CREATE;

        case 2023: 
            return EMAIL_PARTNER;

        case 2024: 
            return EMAIL_INTEREST_RECOMMENDATIONS;

        case 2025: 
            return EMAIL_HOMEFEED_NEW_PINS;

        case 2026: 
            return EMAIL_NETWORK_STORY_DIGEST;

        case 2027: 
            return EMAIL_PINVITATIONAL_ACCESS;

        case 2028: 
            return EMAIL_RESTART_FEED;

        case 2029: 
            return EMAIL_PINVITATIONAL_RALLYING_CALL;

        case 2030: 
            return EMAIL_WEEK_IN_REVIEW;

        case 2031: 
            return EMAIL_NO_SIGNAL;

        case 2032: 
            return EMAIL_USER_RECOMMENDATIONS;

        case 2033: 
            return EMAIL_BOARD_COLLABORATION;

        case 2034: 
            return EMAIL_CONVERSATIONS;

        case 2035: 
            return EMAIL_LEGAL;

        case 2036: 
            return EMAIL_SECURITY;

        case 2101: 
            return SERVICE_ENTRY_SOCIAL_FACEBOOK;

        case 2102: 
            return SERVICE_ENTRY_SOCIAL_TWITTER;

        case 2110: 
            return SERVICE_ENTRY_SEO_GOOGLE;

        case 2111: 
            return SERVICE_ENTRY_SEO_YAHOO;

        case 2112: 
            return SERVICE_ENTRY_SEO_BING;

        case 2201: 
            return STERLING_CREATION_FLOW_PICK_A_PIN;

        case 2202: 
            return STERLING_CREATION_FLOW_SETUP_DETAILS;

        case 2203: 
            return STERLING_CREATION_FLOW_BILLING;

        case 2204: 
            return STERLING_PIN_PROMOTION_DASHBOARD;

        case 2205: 
            return STERLING_PIN_PROMOTION_EDIT;

        case 2206: 
            return STERLING_CAMPAIGN_DASHBOARD;

        case 2207: 
            return STERLING_CAMPAIGN_EDIT;

        case 2208: 
            return STERLING_ADVERTISER_DASHBOARD;

        case 2209: 
            return STERLING_ADVERTISER_EDIT;

        case 2210: 
            return STERLING_CONVERSION_TAG_CREATE;

        case 2211: 
            return STERLING_CONVERSION_TAG_EDIT;

        case 2212: 
            return STERLING_CPA_OBJECTIVE_DASHBOARD;

        case 2213: 
            return STERLING_CPC_OBJECTIVE_DASHBOARD;

        case 2214: 
            return STERLING_CPE_OBJECTIVE_DASHBOARD;

        case 2215: 
            return STERLING_CPM_OBJECTIVE_DASHBOARD;

        case 2216: 
            return STERLING_ACCOUNT_DASHBOARD;

        case 2217: 
            return STERLING_CREATION_FLOW_CHOOSE_OBJECTIVE;

        case 2301: 
            return ANALYTICS_PROFILE_IMPRESSIONS;

        case 2302: 
            return ANALYTICS_PROFILE_REPINS;

        case 2303: 
            return ANALYTICS_PROFILE_CLICKS;

        case 2304: 
            return ANALYTICS_PROFILE_ALL_TIME;

        case 2311: 
            return ANALYTICS_DOMAIN_IMPRESSIONS;

        case 2312: 
            return ANALYTICS_DOMAIN_REPINS;

        case 2313: 
            return ANALYTICS_DOMAIN_CLICKS;

        case 2314: 
            return ANALYTICS_DOMAIN_ORIGINAL_PINS;

        case 2315: 
            return ANALYTICS_DOMAIN_ALL_TIME;

        case 2401: 
            return PINVITATIONAL_UNAUTH_EMAIL;

        case 2402: 
            return PINVITATIONAL_UNAUTH_CONFIRM;

        case 2403: 
            return PINVITATIONAL_AUTH_CONFIRM;

        case 2404: 
            return PINVITATIONAL_SIGNUP_REDEMPTION;

        case 2405: 
            return PINVITATIONAL_HOME_FEED_MODAL;

        case 2406: 
            return PINVITATIONAL_PIN_SUMMARY;

        case 227: 
            return SETTINGS_SEARCH_PRIVACY;

        case 246: 
            return SETTINGS_OFFLINE_BOARD;

        case 2500: 
            return SHARE_EXTENSION;

        case 2510: 
            return EXTENSION_UPSELL_TOAST;

        case 2511: 
            return EXTENSION_UPSELL_MODAL;

        case 2512: 
            return EXTENSION_UPSELL_NUX;

        case 2513: 
            return EXTENSION_INSTALLED;

        case 2514: 
            return EXTENSION_NOT_INSTALLED;

        case 2515: 
            return EXTENSION_UPSELL_NAG;

        case 2516: 
            return EXTENSION_UPSELL_NAG_PIN_CREATE;

        case 2601: 
            return FIND_FRIENDS_ADDRESS_BOOK;

        case 2602: 
            return FIND_FRIENDS_FACEBOOK;

        case 2603: 
            return FIND_FRIENDS_TWITTER;

        case 2604: 
            return FIND_FRIENDS_MORE;

        case 2605: 
            return FIND_FRIENDS_INVITE_ALL;

        case 2701: 
            return HOMEFEED_BUILDER;

        case 2702: 
            return HOMEFEED_BUILDER_SPLASH;

        case 2703: 
            return HOMEFEED_BUILDER_MY_TOPICS;

        case 2704: 
            return HOMEFEED_BUILDER_MY_BOARDS;

        case 2705: 
            return HOMEFEED_BUILDER_MY_USERS;

        case 2706: 
            return HOMEFEED_BUILDER_REC_TOPICS;

        case 2707: 
            return HOMEFEED_BUILDER_REC_BOARDS;

        case 2708: 
            return HOMEFEED_BUILDER_REC_USERS;

        case 251: 
            return CAMERA_PHOTO_PICKER;

        case 252: 
            return CAMERA_ALBUM_PICKER;

        case 253: 
            return API_ENVIRONMENTS;

        case 255: 
            return FPE_CREATE_FIRST_BOARD;

        case 2900: 
            return PUSH_NOTIFICATION_CONVERSATION;

        case 2901: 
            return PUSH_NOTIFICATION_ACTION;

        case 2902: 
            return PUSH_NOTIFICATION_SYSTEM_NEWS;

        case 2903: 
            return PUSH_NOTIFICATION_INTERACTION;

        case 2904: 
            return PUSH_NOTIFICATION_FRIEND_NEWS;

        case 2905: 
            return PUSH_NOTIFICATION_EDITORIAL;

        case 2906: 
            return PUSH_NOTIFICATION_UNKNOWN;

        case 256: 
            return SEND_SHARE_MAIN;

        case 3000: 
            return LIBRARY_HOME;

        case 3001: 
            return LIBRARY_FOLLOWERS;

        case 3002: 
            return LIBRARY_FOLLOWING;

        case 3003: 
            return LIBRARY_LIKES;

        case 3004: 
            return LIBRARY_ALL_PINS;

        case 3050: 
            return PIN_FLASHLIGHT_RESULTS;

        case 3051: 
            return FEED_SHOP_SPACE;

        case 3052: 
            return FEED_TODAYS_PICKS;

        case 3053: 
            return FEED_BUYABLE_CATEGORY;

        case 3054: 
            return FEED_TOP_SHOPS;

        case 3055: 
            return CONFIRM_WEBSITE_BY_NAG;
        }
    }

    public static ViewParameterType valueOf(String s)
    {
        return (ViewParameterType)Enum.valueOf(com/pinterest/schemas/event/ViewParameterType, s);
    }

    public static ViewParameterType[] values()
    {
        return (ViewParameterType[])$VALUES.clone();
    }

    public final int getValue()
    {
        return value;
    }

    static 
    {
        FEED_FOLLOWING = new ViewParameterType("FEED_FOLLOWING", 0, 0);
        FEED_FRIENDS = new ViewParameterType("FEED_FRIENDS", 1, 1);
        FEED_EVERYTHING = new ViewParameterType("FEED_EVERYTHING", 2, 2);
        FEED_POPULAR = new ViewParameterType("FEED_POPULAR", 3, 3);
        FEED_SOURCE = new ViewParameterType("FEED_SOURCE", 4, 4);
        FEED_HOME = new ViewParameterType("FEED_HOME", 5, 92);
        FEED_TOP_PICKS = new ViewParameterType("FEED_TOP_PICKS", 6, 111);
        FEED_WELCOME = new ViewParameterType("FEED_WELCOME", 7, 118);
        PIN_CREATE_PINMARKLET = new ViewParameterType("PIN_CREATE_PINMARKLET", 8, 119);
        FEED_SUBCATEGORY = new ViewParameterType("FEED_SUBCATEGORY", 9, 120);
        FEED_INTEREST = new ViewParameterType("FEED_INTEREST", 10, 136);
        FEED_DIGEST = new ViewParameterType("FEED_DIGEST", 11, 207);
        FEED_DIGEST_STORY = new ViewParameterType("FEED_DIGEST_STORY", 12, 208);
        FEED_DYNAMIC_GRID = new ViewParameterType("FEED_DYNAMIC_GRID", 13, 209);
        CATEGORY_DISCOVER = new ViewParameterType("CATEGORY_DISCOVER", 14, 91);
        FEED_CATEGORY_ANIMALS = new ViewParameterType("FEED_CATEGORY_ANIMALS", 15, 5);
        FEED_CATEGORY_ARCHITECTURE = new ViewParameterType("FEED_CATEGORY_ARCHITECTURE", 16, 6);
        FEED_CATEGORY_ART = new ViewParameterType("FEED_CATEGORY_ART", 17, 7);
        FEED_CATEGORY_CARS_MOTORCYCLES = new ViewParameterType("FEED_CATEGORY_CARS_MOTORCYCLES", 18, 8);
        FEED_CATEGORY_CELEBRITIES = new ViewParameterType("FEED_CATEGORY_CELEBRITIES", 19, 9);
        FEED_CATEGORY_DESIGN = new ViewParameterType("FEED_CATEGORY_DESIGN", 20, 10);
        FEED_CATEGORY_DIY_CRAFTS = new ViewParameterType("FEED_CATEGORY_DIY_CRAFTS", 21, 11);
        FEED_CATEGORY_EDUCATION = new ViewParameterType("FEED_CATEGORY_EDUCATION", 22, 12);
        FEED_CATEGORY_FILM_MUSIC_BOOKS = new ViewParameterType("FEED_CATEGORY_FILM_MUSIC_BOOKS", 23, 13);
        FEED_CATEGORY_FOOD_DRINK = new ViewParameterType("FEED_CATEGORY_FOOD_DRINK", 24, 14);
        FEED_CATEGORY_GARDENING = new ViewParameterType("FEED_CATEGORY_GARDENING", 25, 15);
        FEED_CATEGORY_GEEK = new ViewParameterType("FEED_CATEGORY_GEEK", 26, 16);
        FEED_CATEGORY_HAIR_BEAUTY = new ViewParameterType("FEED_CATEGORY_HAIR_BEAUTY", 27, 17);
        FEED_CATEGORY_HEALTH_FITNESS = new ViewParameterType("FEED_CATEGORY_HEALTH_FITNESS", 28, 18);
        FEED_CATEGORY_HISTORY = new ViewParameterType("FEED_CATEGORY_HISTORY", 29, 19);
        FEED_CATEGORY_HOLIDAYS_EVENTS = new ViewParameterType("FEED_CATEGORY_HOLIDAYS_EVENTS", 30, 20);
        FEED_CATEGORY_HOME_DECOR = new ViewParameterType("FEED_CATEGORY_HOME_DECOR", 31, 21);
        FEED_CATEGORY_HUMOR = new ViewParameterType("FEED_CATEGORY_HUMOR", 32, 22);
        FEED_CATEGORY_ILLUSTRATIONS_POSTERS = new ViewParameterType("FEED_CATEGORY_ILLUSTRATIONS_POSTERS", 33, 23);
        FEED_CATEGORY_KIDS = new ViewParameterType("FEED_CATEGORY_KIDS", 34, 24);
        FEED_CATEGORY_MENS_FASHION = new ViewParameterType("FEED_CATEGORY_MENS_FASHION", 35, 25);
        FEED_CATEGORY_OUTDOORS = new ViewParameterType("FEED_CATEGORY_OUTDOORS", 36, 26);
        FEED_CATEGORY_PHOTOGRAPHY = new ViewParameterType("FEED_CATEGORY_PHOTOGRAPHY", 37, 27);
        FEED_CATEGORY_PRODUCTS = new ViewParameterType("FEED_CATEGORY_PRODUCTS", 38, 28);
        FEED_CATEGORY_QUOTES = new ViewParameterType("FEED_CATEGORY_QUOTES", 39, 29);
        FEED_CATEGORY_SCIENCE_NATURE = new ViewParameterType("FEED_CATEGORY_SCIENCE_NATURE", 40, 30);
        FEED_CATEGORY_SPORTS = new ViewParameterType("FEED_CATEGORY_SPORTS", 41, 31);
        FEED_CATEGORY_TATTOOS = new ViewParameterType("FEED_CATEGORY_TATTOOS", 42, 32);
        FEED_CATEGORY_TECHNOLOGY = new ViewParameterType("FEED_CATEGORY_TECHNOLOGY", 43, 33);
        FEED_CATEGORY_TRAVEL = new ViewParameterType("FEED_CATEGORY_TRAVEL", 44, 34);
        FEED_CATEGORY_WEDDINGS = new ViewParameterType("FEED_CATEGORY_WEDDINGS", 45, 35);
        FEED_CATEGORY_WOMENS_FASHION = new ViewParameterType("FEED_CATEGORY_WOMENS_FASHION", 46, 36);
        FEED_CATEGORY_HOLIDAY_FOR_HIM = new ViewParameterType("FEED_CATEGORY_HOLIDAY_FOR_HIM", 47, 124);
        FEED_CATEGORY_HOLIDAY_FOR_HER = new ViewParameterType("FEED_CATEGORY_HOLIDAY_FOR_HER", 48, 125);
        FEED_CATEGORY_HOLIDAY_FOR_KIDS = new ViewParameterType("FEED_CATEGORY_HOLIDAY_FOR_KIDS", 49, 126);
        FEED_CATEGORY_HOLIDAY_FOR_ALL = new ViewParameterType("FEED_CATEGORY_HOLIDAY_FOR_ALL", 50, 127);
        FEED_CATEGORY_CHRISTMAS_SWEATER = new ViewParameterType("FEED_CATEGORY_CHRISTMAS_SWEATER", 51, 130);
        FEED_CATEGORY = new ViewParameterType("FEED_CATEGORY", 52, 400);
        FEED_CATEGORY_TOPIC = new ViewParameterType("FEED_CATEGORY_TOPIC", 53, 401);
        FEED_GIFTS = new ViewParameterType("FEED_GIFTS", 54, 85);
        FEED_GIFTS_20 = new ViewParameterType("FEED_GIFTS_20", 55, 37);
        FEED_GIFTS_20_50 = new ViewParameterType("FEED_GIFTS_20_50", 56, 38);
        FEED_GIFTS_50_100 = new ViewParameterType("FEED_GIFTS_50_100", 57, 39);
        FEED_GIFTS_100_200 = new ViewParameterType("FEED_GIFTS_100_200", 58, 40);
        FEED_GIFTS_200_500 = new ViewParameterType("FEED_GIFTS_200_500", 59, 41);
        FEED_GIFTS_500 = new ViewParameterType("FEED_GIFTS_500", 60, 42);
        FEED_VIDEOS = new ViewParameterType("FEED_VIDEOS", 61, 128);
        FEED_DOMAIN = new ViewParameterType("FEED_DOMAIN", 62, 129);
        FEED_PLACES = new ViewParameterType("FEED_PLACES", 63, 200);
        FEED_COMMERCE = new ViewParameterType("FEED_COMMERCE", 64, 226);
        FEED_COMMERCE_BUYABLE = new ViewParameterType("FEED_COMMERCE_BUYABLE", 65, 247);
        FEED_COMMERCE_PICKS = new ViewParameterType("FEED_COMMERCE_PICKS", 66, 250);
        DISCOVER_CATEGORY = new ViewParameterType("DISCOVER_CATEGORY", 67, 137);
        DISCOVER_INTEREST = new ViewParameterType("DISCOVER_INTEREST", 68, 138);
        DISCOVER_SEARCH_INTERESTS = new ViewParameterType("DISCOVER_SEARCH_INTERESTS", 69, 185);
        SEARCH_PINS = new ViewParameterType("SEARCH_PINS", 70, 43);
        SEARCH_BOARDS = new ViewParameterType("SEARCH_BOARDS", 71, 44);
        SEARCH_USERS = new ViewParameterType("SEARCH_USERS", 72, 45);
        SEARCH_AUTOCOMPLETE = new ViewParameterType("SEARCH_AUTOCOMPLETE", 73, 103);
        SEARCH_MY_PINS = new ViewParameterType("SEARCH_MY_PINS", 74, 107);
        SEARCH_PLACES = new ViewParameterType("SEARCH_PLACES", 75, 123);
        SEARCH_PLACE_BOARDS = new ViewParameterType("SEARCH_PLACE_BOARDS", 76, 181);
        SEARCH_INTERESTS = new ViewParameterType("SEARCH_INTERESTS", 77, 182);
        SEARCH_BUYABLE = new ViewParameterType("SEARCH_BUYABLE", 78, 254);
        REGISTRATION_LANDING = new ViewParameterType("REGISTRATION_LANDING", 79, 46);
        REGISTRATION_SIGNUP = new ViewParameterType("REGISTRATION_SIGNUP", 80, 47);
        REGISTRATION_BOARDS = new ViewParameterType("REGISTRATION_BOARDS", 81, 48);
        REGISTRATION_SIGNUP_BUSINESS = new ViewParameterType("REGISTRATION_SIGNUP_BUSINESS", 82, 300);
        REGISTRATION_LOCAL_INFO = new ViewParameterType("REGISTRATION_LOCAL_INFO", 83, 301);
        REGISTRATION_AGE_GENDER = new ViewParameterType("REGISTRATION_AGE_GENDER", 84, 302);
        USER_BOARDS = new ViewParameterType("USER_BOARDS", 85, 49);
        USER_FOLLOWERS = new ViewParameterType("USER_FOLLOWERS", 86, 50);
        USER_FOLLOWING = new ViewParameterType("USER_FOLLOWING", 87, 51);
        USER_LIKES = new ViewParameterType("USER_LIKES", 88, 52);
        USER_ACTIVITY = new ViewParameterType("USER_ACTIVITY", 89, 53);
        USER_PINS = new ViewParameterType("USER_PINS", 90, 74);
        USER_EDIT = new ViewParameterType("USER_EDIT", 91, 93);
        USER_INTERESTS = new ViewParameterType("USER_INTERESTS", 92, 183);
        USER_FYP = new ViewParameterType("USER_FYP", 93, 189);
        BOARD_FOLLOWERS = new ViewParameterType("BOARD_FOLLOWERS", 94, 54);
        BOARD_SETTINGS = new ViewParameterType("BOARD_SETTINGS", 95, 55);
        BOARD_CREATE = new ViewParameterType("BOARD_CREATE", 96, 87);
        BOARD_EDIT = new ViewParameterType("BOARD_EDIT", 97, 88);
        BOARD_EDIT_COLLABORATORS = new ViewParameterType("BOARD_EDIT_COLLABORATORS", 98, 104);
        BOARD_CHOOSE_COVER = new ViewParameterType("BOARD_CHOOSE_COVER", 99, 228);
        BOARD_CROP_COVER = new ViewParameterType("BOARD_CROP_COVER", 100, 229);
        BOARD_PLACE = new ViewParameterType("BOARD_PLACE", 101, 121);
        BOARD_MAP = new ViewParameterType("BOARD_MAP", 102, 122);
        BOARD_EMPTY = new ViewParameterType("BOARD_EMPTY", 103, 230);
        FRIEND_INVITER_EMAIL = new ViewParameterType("FRIEND_INVITER_EMAIL", 104, 56);
        FRIEND_INVITER_FACEBOOK = new ViewParameterType("FRIEND_INVITER_FACEBOOK", 105, 57);
        FRIEND_INVITER_FIND_FRIENDS = new ViewParameterType("FRIEND_INVITER_FIND_FRIENDS", 106, 131);
        FRIEND_INVITER_GMAIL = new ViewParameterType("FRIEND_INVITER_GMAIL", 107, 58);
        FRIEND_INVITER_INVITE = new ViewParameterType("FRIEND_INVITER_INVITE", 108, 132);
        FRIEND_INVITER_TWITTER = new ViewParameterType("FRIEND_INVITER_TWITTER", 109, 133);
        FRIEND_INVITER_YAHOO = new ViewParameterType("FRIEND_INVITER_YAHOO", 110, 59);
        ABOUT_TERMS = new ViewParameterType("ABOUT_TERMS", 111, 60);
        ABOUT_SUPPORT = new ViewParameterType("ABOUT_SUPPORT", 112, 61);
        ABOUT_BOOKMARKLET = new ViewParameterType("ABOUT_BOOKMARKLET", 113, 62);
        ABOUT_ETIQUETTE = new ViewParameterType("ABOUT_ETIQUETTE", 114, 76);
        ABOUT_ABOUT = new ViewParameterType("ABOUT_ABOUT", 115, 77);
        ABOUT_GOODIES = new ViewParameterType("ABOUT_GOODIES", 116, 78);
        ABOUT_CAREERS = new ViewParameterType("ABOUT_CAREERS", 117, 79);
        ABOUT_TEAM = new ViewParameterType("ABOUT_TEAM", 118, 80);
        ABOUT_PRESS = new ViewParameterType("ABOUT_PRESS", 119, 81);
        ABOUT_PRIVACY = new ViewParameterType("ABOUT_PRIVACY", 120, 82);
        ABOUT_USE = new ViewParameterType("ABOUT_USE", 121, 83);
        ABOUT_COPYRIGHT = new ViewParameterType("ABOUT_COPYRIGHT", 122, 84);
        LOGIN_EMAIL = new ViewParameterType("LOGIN_EMAIL", 123, 63);
        LOGIN_FACEBOOK = new ViewParameterType("LOGIN_FACEBOOK", 124, 64);
        LOGIN_TWITTER = new ViewParameterType("LOGIN_TWITTER", 125, 65);
        ERROR_NO_INTERNET = new ViewParameterType("ERROR_NO_INTERNET", 126, 66);
        ERROR_NO_PIN = new ViewParameterType("ERROR_NO_PIN", 127, 67);
        ERROR_NO_BOARD = new ViewParameterType("ERROR_NO_BOARD", 128, 68);
        ERROR_NO_USER = new ViewParameterType("ERROR_NO_USER", 129, 69);
        ERROR_NO_ACTIVITY = new ViewParameterType("ERROR_NO_ACTIVITY", 130, 70);
        REPORT_PIN = new ViewParameterType("REPORT_PIN", 131, 71);
        REPORT_USER = new ViewParameterType("REPORT_USER", 132, 86);
        PIN_CREATE_REPIN = new ViewParameterType("PIN_CREATE_REPIN", 133, 72);
        PIN_CREATE = new ViewParameterType("PIN_CREATE", 134, 73);
        PIN_CREATE_SDK = new ViewParameterType("PIN_CREATE_SDK", 135, 100);
        PIN_EDIT = new ViewParameterType("PIN_EDIT", 136, 89);
        PIN_SEND_TO = new ViewParameterType("PIN_SEND_TO", 137, 105);
        USER_ABOUT = new ViewParameterType("USER_ABOUT", 138, 75);
        BOARD_COLLABORATORS = new ViewParameterType("BOARD_COLLABORATORS", 139, 90);
        EDUCATION_LONGPRESS = new ViewParameterType("EDUCATION_LONGPRESS", 140, 94);
        EDUCATION_RELATED_PINS = new ViewParameterType("EDUCATION_RELATED_PINS", 141, 101);
        EDUCATION_SECRET_BOARD = new ViewParameterType("EDUCATION_SECRET_BOARD", 142, 95);
        EDUCATION_CONTEXTUAL_MENU = new ViewParameterType("EDUCATION_CONTEXTUAL_MENU", 143, 108);
        EDUCATION_GUIDED_SEARCH = new ViewParameterType("EDUCATION_GUIDED_SEARCH", 144, 184);
        EDUCATION_FLYOUT = new ViewParameterType("EDUCATION_FLYOUT", 145, 221);
        EDUCATION_SAVE = new ViewParameterType("EDUCATION_SAVE", 146, 231);
        MOBILE_ORIENTATION_DISCOVER = new ViewParameterType("MOBILE_ORIENTATION_DISCOVER", 147, 96);
        MOBILE_ORIENTATION_COLLECT = new ViewParameterType("MOBILE_ORIENTATION_COLLECT", 148, 97);
        MOBILE_ORIENTATION_FUNCTIONAL = new ViewParameterType("MOBILE_ORIENTATION_FUNCTIONAL", 149, 98);
        MOBILE_ORIENTATION_STORY = new ViewParameterType("MOBILE_ORIENTATION_STORY", 150, 99);
        ORIENTATION_FAST_FOLLOW = new ViewParameterType("ORIENTATION_FAST_FOLLOW", 151, 102);
        PICKED_FOR_YOU_FEED = new ViewParameterType("PICKED_FOR_YOU_FEED", 152, 106);
        FEED_EDITOR_FOLLOW_BOARDS = new ViewParameterType("FEED_EDITOR_FOLLOW_BOARDS", 153, 109);
        FEED_EDITOR_UNFOLLOW_BOARDS = new ViewParameterType("FEED_EDITOR_UNFOLLOW_BOARDS", 154, 110);
        DEPRECATED_DEEP_LINKING_EMAIL = new ViewParameterType("DEPRECATED_DEEP_LINKING_EMAIL", 155, 112);
        DEPRECATED_DEEP_LINKING_WEB = new ViewParameterType("DEPRECATED_DEEP_LINKING_WEB", 156, 113);
        DEEP_LINKING_FACEBOOK = new ViewParameterType("DEEP_LINKING_FACEBOOK", 157, 114);
        DEEP_LINKING_APP = new ViewParameterType("DEEP_LINKING_APP", 158, 115);
        FEED_RELATED_BOARD = new ViewParameterType("FEED_RELATED_BOARD", 159, 116);
        FEED_RELATED_INTEREST = new ViewParameterType("FEED_RELATED_INTEREST", 160, 117);
        FIND_FRIENDS = new ViewParameterType("FIND_FRIENDS", 161, 135);
        PIN_OTHER = new ViewParameterType("PIN_OTHER", 162, 139);
        PIN_REGULAR = new ViewParameterType("PIN_REGULAR", 163, 140);
        PIN_ARTICLE = new ViewParameterType("PIN_ARTICLE", 164, 141);
        PIN_MOVIE = new ViewParameterType("PIN_MOVIE", 165, 142);
        PIN_PLACE = new ViewParameterType("PIN_PLACE", 166, 143);
        PIN_PRODUCT = new ViewParameterType("PIN_PRODUCT", 167, 144);
        PIN_RECIPE = new ViewParameterType("PIN_RECIPE", 168, 145);
        PIN_LOOKBOOK = new ViewParameterType("PIN_LOOKBOOK", 169, 146);
        PIN_PRODUCT_MERCHANT = new ViewParameterType("PIN_PRODUCT_MERCHANT", 170, 147);
        PIN_CREATE_PLACES = new ViewParameterType("PIN_CREATE_PLACES", 171, 150);
        PIN_LIKES = new ViewParameterType("PIN_LIKES", 172, 151);
        PIN_COMMENTS = new ViewParameterType("PIN_COMMENTS", 173, 152);
        PIN_REPIN_BOARDS = new ViewParameterType("PIN_REPIN_BOARDS", 174, 153);
        PIN_CLOSEUP_BODY = new ViewParameterType("PIN_CLOSEUP_BODY", 175, 154);
        PIN_CLOSEUP_RELATED_PINS = new ViewParameterType("PIN_CLOSEUP_RELATED_PINS", 176, 155);
        PIN_QUESTIONS = new ViewParameterType("PIN_QUESTIONS", 177, 186);
        PIN_ANSWERS = new ViewParameterType("PIN_ANSWERS", 178, 187);
        PIN_REPLIES = new ViewParameterType("PIN_REPLIES", 179, 188);
        SPLASH_LOADING = new ViewParameterType("SPLASH_LOADING", 180, 160);
        SPLASH_INSPIRED_WALL = new ViewParameterType("SPLASH_INSPIRED_WALL", 181, 161);
        SPLASH_BRIO_WALL = new ViewParameterType("SPLASH_BRIO_WALL", 182, 162);
        SPLASH_CONTINUE_EMAIL = new ViewParameterType("SPLASH_CONTINUE_EMAIL", 183, 163);
        SPLASH_MULTISTEP = new ViewParameterType("SPLASH_MULTISTEP", 184, 164);
        ORIENTATION_START = new ViewParameterType("ORIENTATION_START", 185, 170);
        ORIENTATION_END = new ViewParameterType("ORIENTATION_END", 186, 171);
        ORIENTATION_INTEREST_PICKER = new ViewParameterType("ORIENTATION_INTEREST_PICKER", 187, 172);
        ORIENTATION_USER_PICKER = new ViewParameterType("ORIENTATION_USER_PICKER", 188, 173);
        REBUILD_FEED_INTEREST_PICKER = new ViewParameterType("REBUILD_FEED_INTEREST_PICKER", 189, 222);
        REBUILD_FEED_END = new ViewParameterType("REBUILD_FEED_END", 190, 223);
        STORIES_RELATED_PINS = new ViewParameterType("STORIES_RELATED_PINS", 191, 190);
        STORIES_RELATED_USERS = new ViewParameterType("STORIES_RELATED_USERS", 192, 191);
        STORIES_RELATED_BOARDS = new ViewParameterType("STORIES_RELATED_BOARDS", 193, 192);
        STORIES_RELATED_INTERESTS = new ViewParameterType("STORIES_RELATED_INTERESTS", 194, 193);
        BROWSER = new ViewParameterType("BROWSER", 195, 195);
        CONVERSATION_CREATE = new ViewParameterType("CONVERSATION_CREATE", 196, 201);
        CONVERSATION_THREAD = new ViewParameterType("CONVERSATION_THREAD", 197, 202);
        CONVERSATION_INBOX = new ViewParameterType("CONVERSATION_INBOX", 198, 203);
        CONVERSATION_ADD_PIN = new ViewParameterType("CONVERSATION_ADD_PIN", 199, 204);
        CONVERSATION_USERS = new ViewParameterType("CONVERSATION_USERS", 200, 205);
        NEWS_NETWORK_STORY = new ViewParameterType("NEWS_NETWORK_STORY", 201, 210);
        NEWS_YOUR_STORY = new ViewParameterType("NEWS_YOUR_STORY", 202, 211);
        PIN_TWINS = new ViewParameterType("PIN_TWINS", 203, 224);
        ACTIVITY_V2 = new ViewParameterType("ACTIVITY_V2", 204, 225);
        BUYABLE_MERCHANT_RETURN_POLICY = new ViewParameterType("BUYABLE_MERCHANT_RETURN_POLICY", 205, 232);
        BUYABLE_VARIANT_OPTIONS = new ViewParameterType("BUYABLE_VARIANT_OPTIONS", 206, 233);
        BUYABLE_CHECKOUT_APPLE_PAY_OPTION = new ViewParameterType("BUYABLE_CHECKOUT_APPLE_PAY_OPTION", 207, 234);
        BUYABLE_CHECKOUT_SUMMARY = new ViewParameterType("BUYABLE_CHECKOUT_SUMMARY", 208, 235);
        BUYABLE_SELECT_SHIPPING_ADDRESS = new ViewParameterType("BUYABLE_SELECT_SHIPPING_ADDRESS", 209, 236);
        BUYABLE_SHIPPING_ADDRESS_FORM = new ViewParameterType("BUYABLE_SHIPPING_ADDRESS_FORM", 210, 237);
        BUYABLE_SELECT_SHIPPING_METHOD = new ViewParameterType("BUYABLE_SELECT_SHIPPING_METHOD", 211, 238);
        BUYABLE_SELECT_PAYMENT = new ViewParameterType("BUYABLE_SELECT_PAYMENT", 212, 239);
        BUYABLE_PAYMENT_FORM = new ViewParameterType("BUYABLE_PAYMENT_FORM", 213, 240);
        BUYABLE_CONFIRMATION = new ViewParameterType("BUYABLE_CONFIRMATION", 214, 241);
        BUYABLE_ORDER_HISTORY = new ViewParameterType("BUYABLE_ORDER_HISTORY", 215, 242);
        BUYABLE_ORDER_DETAILS = new ViewParameterType("BUYABLE_ORDER_DETAILS", 216, 243);
        BUYABLE_ADDRESS_CONTACTS = new ViewParameterType("BUYABLE_ADDRESS_CONTACTS", 217, 244);
        BUYABLE_ADDRESS_RECENTS = new ViewParameterType("BUYABLE_ADDRESS_RECENTS", 218, 245);
        PLACE_VIEW_HEADER = new ViewParameterType("PLACE_VIEW_HEADER", 219, 248);
        PLACE_VIEW_RELATED_PINS = new ViewParameterType("PLACE_VIEW_RELATED_PINS", 220, 249);
        EXTERNAL_SOURCE_OTHER = new ViewParameterType("EXTERNAL_SOURCE_OTHER", 221, 1900);
        EMAIL_UNKNOWN = new ViewParameterType("EMAIL_UNKNOWN", 222, 2000);
        EMAIL_TRANSACTIONAL = new ViewParameterType("EMAIL_TRANSACTIONAL", 223, 2001);
        EMAIL_EDITORIAL = new ViewParameterType("EMAIL_EDITORIAL", 224, 2002);
        EMAIL_ACTIVITY_AGGREGATION = new ViewParameterType("EMAIL_ACTIVITY_AGGREGATION", 225, 2003);
        EMAIL_RECOMMENDATIONS_DIGEST = new ViewParameterType("EMAIL_RECOMMENDATIONS_DIGEST", 226, 2004);
        EMAIL_SOCIAL_DIGEST = new ViewParameterType("EMAIL_SOCIAL_DIGEST", 227, 2005);
        EMAIL_SEND_PIN = new ViewParameterType("EMAIL_SEND_PIN", 228, 2006);
        EMAIL_SEND_BOARD = new ViewParameterType("EMAIL_SEND_BOARD", 229, 2007);
        EMAIL_SEND_PINNER = new ViewParameterType("EMAIL_SEND_PINNER", 230, 2008);
        EMAIL_FRIEND_JOINED = new ViewParameterType("EMAIL_FRIEND_JOINED", 231, 2009);
        EMAIL_WELCOME = new ViewParameterType("EMAIL_WELCOME", 232, 2010);
        EMAIL_BOARD_RECOMMENDATIONS = new ViewParameterType("EMAIL_BOARD_RECOMMENDATIONS", 233, 2011);
        EMAIL_PIN_RECOMMENDATIONS = new ViewParameterType("EMAIL_PIN_RECOMMENDATIONS", 234, 2012);
        EMAIL_COMMENT_AND_MENTION = new ViewParameterType("EMAIL_COMMENT_AND_MENTION", 235, 2013);
        EMAIL_USECASES = new ViewParameterType("EMAIL_USECASES", 236, 2014);
        EMAIL_FIREHOSE_QUESTION_CREATE = new ViewParameterType("EMAIL_FIREHOSE_QUESTION_CREATE", 237, 2015);
        EMAIL_FIREHOSE_ANSWER_CREATE = new ViewParameterType("EMAIL_FIREHOSE_ANSWER_CREATE", 238, 2016);
        EMAIL_FIREHOSE_REPLY_CREATE = new ViewParameterType("EMAIL_FIREHOSE_REPLY_CREATE", 239, 2017);
        EMAIL_QUESTION_CREATE = new ViewParameterType("EMAIL_QUESTION_CREATE", 240, 2018);
        EMAIL_ANSWER_CREATE = new ViewParameterType("EMAIL_ANSWER_CREATE", 241, 2019);
        EMAIL_QUESTION_LIKE = new ViewParameterType("EMAIL_QUESTION_LIKE", 242, 2020);
        EMAIL_ANSWER_LIKE = new ViewParameterType("EMAIL_ANSWER_LIKE", 243, 2021);
        EMAIL_REPLY_CREATE = new ViewParameterType("EMAIL_REPLY_CREATE", 244, 2022);
        EMAIL_PARTNER = new ViewParameterType("EMAIL_PARTNER", 245, 2023);
        EMAIL_INTEREST_RECOMMENDATIONS = new ViewParameterType("EMAIL_INTEREST_RECOMMENDATIONS", 246, 2024);
        EMAIL_HOMEFEED_NEW_PINS = new ViewParameterType("EMAIL_HOMEFEED_NEW_PINS", 247, 2025);
        EMAIL_NETWORK_STORY_DIGEST = new ViewParameterType("EMAIL_NETWORK_STORY_DIGEST", 248, 2026);
        EMAIL_PINVITATIONAL_ACCESS = new ViewParameterType("EMAIL_PINVITATIONAL_ACCESS", 249, 2027);
        EMAIL_RESTART_FEED = new ViewParameterType("EMAIL_RESTART_FEED", 250, 2028);
        EMAIL_PINVITATIONAL_RALLYING_CALL = new ViewParameterType("EMAIL_PINVITATIONAL_RALLYING_CALL", 251, 2029);
        EMAIL_WEEK_IN_REVIEW = new ViewParameterType("EMAIL_WEEK_IN_REVIEW", 252, 2030);
        EMAIL_NO_SIGNAL = new ViewParameterType("EMAIL_NO_SIGNAL", 253, 2031);
        EMAIL_USER_RECOMMENDATIONS = new ViewParameterType("EMAIL_USER_RECOMMENDATIONS", 254, 2032);
        EMAIL_BOARD_COLLABORATION = new ViewParameterType("EMAIL_BOARD_COLLABORATION", 255, 2033);
        EMAIL_CONVERSATIONS = new ViewParameterType("EMAIL_CONVERSATIONS", 256, 2034);
        EMAIL_LEGAL = new ViewParameterType("EMAIL_LEGAL", 257, 2035);
        EMAIL_SECURITY = new ViewParameterType("EMAIL_SECURITY", 258, 2036);
        SERVICE_ENTRY_SOCIAL_FACEBOOK = new ViewParameterType("SERVICE_ENTRY_SOCIAL_FACEBOOK", 259, 2101);
        SERVICE_ENTRY_SOCIAL_TWITTER = new ViewParameterType("SERVICE_ENTRY_SOCIAL_TWITTER", 260, 2102);
        SERVICE_ENTRY_SEO_GOOGLE = new ViewParameterType("SERVICE_ENTRY_SEO_GOOGLE", 261, 2110);
        SERVICE_ENTRY_SEO_YAHOO = new ViewParameterType("SERVICE_ENTRY_SEO_YAHOO", 262, 2111);
        SERVICE_ENTRY_SEO_BING = new ViewParameterType("SERVICE_ENTRY_SEO_BING", 263, 2112);
        STERLING_CREATION_FLOW_PICK_A_PIN = new ViewParameterType("STERLING_CREATION_FLOW_PICK_A_PIN", 264, 2201);
        STERLING_CREATION_FLOW_SETUP_DETAILS = new ViewParameterType("STERLING_CREATION_FLOW_SETUP_DETAILS", 265, 2202);
        STERLING_CREATION_FLOW_BILLING = new ViewParameterType("STERLING_CREATION_FLOW_BILLING", 266, 2203);
        STERLING_PIN_PROMOTION_DASHBOARD = new ViewParameterType("STERLING_PIN_PROMOTION_DASHBOARD", 267, 2204);
        STERLING_PIN_PROMOTION_EDIT = new ViewParameterType("STERLING_PIN_PROMOTION_EDIT", 268, 2205);
        STERLING_CAMPAIGN_DASHBOARD = new ViewParameterType("STERLING_CAMPAIGN_DASHBOARD", 269, 2206);
        STERLING_CAMPAIGN_EDIT = new ViewParameterType("STERLING_CAMPAIGN_EDIT", 270, 2207);
        STERLING_ADVERTISER_DASHBOARD = new ViewParameterType("STERLING_ADVERTISER_DASHBOARD", 271, 2208);
        STERLING_ADVERTISER_EDIT = new ViewParameterType("STERLING_ADVERTISER_EDIT", 272, 2209);
        STERLING_CONVERSION_TAG_CREATE = new ViewParameterType("STERLING_CONVERSION_TAG_CREATE", 273, 2210);
        STERLING_CONVERSION_TAG_EDIT = new ViewParameterType("STERLING_CONVERSION_TAG_EDIT", 274, 2211);
        STERLING_CPA_OBJECTIVE_DASHBOARD = new ViewParameterType("STERLING_CPA_OBJECTIVE_DASHBOARD", 275, 2212);
        STERLING_CPC_OBJECTIVE_DASHBOARD = new ViewParameterType("STERLING_CPC_OBJECTIVE_DASHBOARD", 276, 2213);
        STERLING_CPE_OBJECTIVE_DASHBOARD = new ViewParameterType("STERLING_CPE_OBJECTIVE_DASHBOARD", 277, 2214);
        STERLING_CPM_OBJECTIVE_DASHBOARD = new ViewParameterType("STERLING_CPM_OBJECTIVE_DASHBOARD", 278, 2215);
        STERLING_ACCOUNT_DASHBOARD = new ViewParameterType("STERLING_ACCOUNT_DASHBOARD", 279, 2216);
        STERLING_CREATION_FLOW_CHOOSE_OBJECTIVE = new ViewParameterType("STERLING_CREATION_FLOW_CHOOSE_OBJECTIVE", 280, 2217);
        ANALYTICS_PROFILE_IMPRESSIONS = new ViewParameterType("ANALYTICS_PROFILE_IMPRESSIONS", 281, 2301);
        ANALYTICS_PROFILE_REPINS = new ViewParameterType("ANALYTICS_PROFILE_REPINS", 282, 2302);
        ANALYTICS_PROFILE_CLICKS = new ViewParameterType("ANALYTICS_PROFILE_CLICKS", 283, 2303);
        ANALYTICS_PROFILE_ALL_TIME = new ViewParameterType("ANALYTICS_PROFILE_ALL_TIME", 284, 2304);
        ANALYTICS_DOMAIN_IMPRESSIONS = new ViewParameterType("ANALYTICS_DOMAIN_IMPRESSIONS", 285, 2311);
        ANALYTICS_DOMAIN_REPINS = new ViewParameterType("ANALYTICS_DOMAIN_REPINS", 286, 2312);
        ANALYTICS_DOMAIN_CLICKS = new ViewParameterType("ANALYTICS_DOMAIN_CLICKS", 287, 2313);
        ANALYTICS_DOMAIN_ORIGINAL_PINS = new ViewParameterType("ANALYTICS_DOMAIN_ORIGINAL_PINS", 288, 2314);
        ANALYTICS_DOMAIN_ALL_TIME = new ViewParameterType("ANALYTICS_DOMAIN_ALL_TIME", 289, 2315);
        PINVITATIONAL_UNAUTH_EMAIL = new ViewParameterType("PINVITATIONAL_UNAUTH_EMAIL", 290, 2401);
        PINVITATIONAL_UNAUTH_CONFIRM = new ViewParameterType("PINVITATIONAL_UNAUTH_CONFIRM", 291, 2402);
        PINVITATIONAL_AUTH_CONFIRM = new ViewParameterType("PINVITATIONAL_AUTH_CONFIRM", 292, 2403);
        PINVITATIONAL_SIGNUP_REDEMPTION = new ViewParameterType("PINVITATIONAL_SIGNUP_REDEMPTION", 293, 2404);
        PINVITATIONAL_HOME_FEED_MODAL = new ViewParameterType("PINVITATIONAL_HOME_FEED_MODAL", 294, 2405);
        PINVITATIONAL_PIN_SUMMARY = new ViewParameterType("PINVITATIONAL_PIN_SUMMARY", 295, 2406);
        SETTINGS_SEARCH_PRIVACY = new ViewParameterType("SETTINGS_SEARCH_PRIVACY", 296, 227);
        SETTINGS_OFFLINE_BOARD = new ViewParameterType("SETTINGS_OFFLINE_BOARD", 297, 246);
        SHARE_EXTENSION = new ViewParameterType("SHARE_EXTENSION", 298, 2500);
        EXTENSION_UPSELL_TOAST = new ViewParameterType("EXTENSION_UPSELL_TOAST", 299, 2510);
        EXTENSION_UPSELL_MODAL = new ViewParameterType("EXTENSION_UPSELL_MODAL", 300, 2511);
        EXTENSION_UPSELL_NUX = new ViewParameterType("EXTENSION_UPSELL_NUX", 301, 2512);
        EXTENSION_INSTALLED = new ViewParameterType("EXTENSION_INSTALLED", 302, 2513);
        EXTENSION_NOT_INSTALLED = new ViewParameterType("EXTENSION_NOT_INSTALLED", 303, 2514);
        EXTENSION_UPSELL_NAG = new ViewParameterType("EXTENSION_UPSELL_NAG", 304, 2515);
        EXTENSION_UPSELL_NAG_PIN_CREATE = new ViewParameterType("EXTENSION_UPSELL_NAG_PIN_CREATE", 305, 2516);
        FIND_FRIENDS_ADDRESS_BOOK = new ViewParameterType("FIND_FRIENDS_ADDRESS_BOOK", 306, 2601);
        FIND_FRIENDS_FACEBOOK = new ViewParameterType("FIND_FRIENDS_FACEBOOK", 307, 2602);
        FIND_FRIENDS_TWITTER = new ViewParameterType("FIND_FRIENDS_TWITTER", 308, 2603);
        FIND_FRIENDS_MORE = new ViewParameterType("FIND_FRIENDS_MORE", 309, 2604);
        FIND_FRIENDS_INVITE_ALL = new ViewParameterType("FIND_FRIENDS_INVITE_ALL", 310, 2605);
        HOMEFEED_BUILDER = new ViewParameterType("HOMEFEED_BUILDER", 311, 2701);
        HOMEFEED_BUILDER_SPLASH = new ViewParameterType("HOMEFEED_BUILDER_SPLASH", 312, 2702);
        HOMEFEED_BUILDER_MY_TOPICS = new ViewParameterType("HOMEFEED_BUILDER_MY_TOPICS", 313, 2703);
        HOMEFEED_BUILDER_MY_BOARDS = new ViewParameterType("HOMEFEED_BUILDER_MY_BOARDS", 314, 2704);
        HOMEFEED_BUILDER_MY_USERS = new ViewParameterType("HOMEFEED_BUILDER_MY_USERS", 315, 2705);
        HOMEFEED_BUILDER_REC_TOPICS = new ViewParameterType("HOMEFEED_BUILDER_REC_TOPICS", 316, 2706);
        HOMEFEED_BUILDER_REC_BOARDS = new ViewParameterType("HOMEFEED_BUILDER_REC_BOARDS", 317, 2707);
        HOMEFEED_BUILDER_REC_USERS = new ViewParameterType("HOMEFEED_BUILDER_REC_USERS", 318, 2708);
        CAMERA_PHOTO_PICKER = new ViewParameterType("CAMERA_PHOTO_PICKER", 319, 251);
        CAMERA_ALBUM_PICKER = new ViewParameterType("CAMERA_ALBUM_PICKER", 320, 252);
        API_ENVIRONMENTS = new ViewParameterType("API_ENVIRONMENTS", 321, 253);
        FPE_CREATE_FIRST_BOARD = new ViewParameterType("FPE_CREATE_FIRST_BOARD", 322, 255);
        PUSH_NOTIFICATION_CONVERSATION = new ViewParameterType("PUSH_NOTIFICATION_CONVERSATION", 323, 2900);
        PUSH_NOTIFICATION_ACTION = new ViewParameterType("PUSH_NOTIFICATION_ACTION", 324, 2901);
        PUSH_NOTIFICATION_SYSTEM_NEWS = new ViewParameterType("PUSH_NOTIFICATION_SYSTEM_NEWS", 325, 2902);
        PUSH_NOTIFICATION_INTERACTION = new ViewParameterType("PUSH_NOTIFICATION_INTERACTION", 326, 2903);
        PUSH_NOTIFICATION_FRIEND_NEWS = new ViewParameterType("PUSH_NOTIFICATION_FRIEND_NEWS", 327, 2904);
        PUSH_NOTIFICATION_EDITORIAL = new ViewParameterType("PUSH_NOTIFICATION_EDITORIAL", 328, 2905);
        PUSH_NOTIFICATION_UNKNOWN = new ViewParameterType("PUSH_NOTIFICATION_UNKNOWN", 329, 2906);
        SEND_SHARE_MAIN = new ViewParameterType("SEND_SHARE_MAIN", 330, 256);
        LIBRARY_HOME = new ViewParameterType("LIBRARY_HOME", 331, 3000);
        LIBRARY_FOLLOWERS = new ViewParameterType("LIBRARY_FOLLOWERS", 332, 3001);
        LIBRARY_FOLLOWING = new ViewParameterType("LIBRARY_FOLLOWING", 333, 3002);
        LIBRARY_LIKES = new ViewParameterType("LIBRARY_LIKES", 334, 3003);
        LIBRARY_ALL_PINS = new ViewParameterType("LIBRARY_ALL_PINS", 335, 3004);
        PIN_FLASHLIGHT_RESULTS = new ViewParameterType("PIN_FLASHLIGHT_RESULTS", 336, 3050);
        FEED_SHOP_SPACE = new ViewParameterType("FEED_SHOP_SPACE", 337, 3051);
        FEED_TODAYS_PICKS = new ViewParameterType("FEED_TODAYS_PICKS", 338, 3052);
        FEED_BUYABLE_CATEGORY = new ViewParameterType("FEED_BUYABLE_CATEGORY", 339, 3053);
        FEED_TOP_SHOPS = new ViewParameterType("FEED_TOP_SHOPS", 340, 3054);
        CONFIRM_WEBSITE_BY_NAG = new ViewParameterType("CONFIRM_WEBSITE_BY_NAG", 341, 3055);
        $VALUES = (new ViewParameterType[] {
            FEED_FOLLOWING, FEED_FRIENDS, FEED_EVERYTHING, FEED_POPULAR, FEED_SOURCE, FEED_HOME, FEED_TOP_PICKS, FEED_WELCOME, PIN_CREATE_PINMARKLET, FEED_SUBCATEGORY, 
            FEED_INTEREST, FEED_DIGEST, FEED_DIGEST_STORY, FEED_DYNAMIC_GRID, CATEGORY_DISCOVER, FEED_CATEGORY_ANIMALS, FEED_CATEGORY_ARCHITECTURE, FEED_CATEGORY_ART, FEED_CATEGORY_CARS_MOTORCYCLES, FEED_CATEGORY_CELEBRITIES, 
            FEED_CATEGORY_DESIGN, FEED_CATEGORY_DIY_CRAFTS, FEED_CATEGORY_EDUCATION, FEED_CATEGORY_FILM_MUSIC_BOOKS, FEED_CATEGORY_FOOD_DRINK, FEED_CATEGORY_GARDENING, FEED_CATEGORY_GEEK, FEED_CATEGORY_HAIR_BEAUTY, FEED_CATEGORY_HEALTH_FITNESS, FEED_CATEGORY_HISTORY, 
            FEED_CATEGORY_HOLIDAYS_EVENTS, FEED_CATEGORY_HOME_DECOR, FEED_CATEGORY_HUMOR, FEED_CATEGORY_ILLUSTRATIONS_POSTERS, FEED_CATEGORY_KIDS, FEED_CATEGORY_MENS_FASHION, FEED_CATEGORY_OUTDOORS, FEED_CATEGORY_PHOTOGRAPHY, FEED_CATEGORY_PRODUCTS, FEED_CATEGORY_QUOTES, 
            FEED_CATEGORY_SCIENCE_NATURE, FEED_CATEGORY_SPORTS, FEED_CATEGORY_TATTOOS, FEED_CATEGORY_TECHNOLOGY, FEED_CATEGORY_TRAVEL, FEED_CATEGORY_WEDDINGS, FEED_CATEGORY_WOMENS_FASHION, FEED_CATEGORY_HOLIDAY_FOR_HIM, FEED_CATEGORY_HOLIDAY_FOR_HER, FEED_CATEGORY_HOLIDAY_FOR_KIDS, 
            FEED_CATEGORY_HOLIDAY_FOR_ALL, FEED_CATEGORY_CHRISTMAS_SWEATER, FEED_CATEGORY, FEED_CATEGORY_TOPIC, FEED_GIFTS, FEED_GIFTS_20, FEED_GIFTS_20_50, FEED_GIFTS_50_100, FEED_GIFTS_100_200, FEED_GIFTS_200_500, 
            FEED_GIFTS_500, FEED_VIDEOS, FEED_DOMAIN, FEED_PLACES, FEED_COMMERCE, FEED_COMMERCE_BUYABLE, FEED_COMMERCE_PICKS, DISCOVER_CATEGORY, DISCOVER_INTEREST, DISCOVER_SEARCH_INTERESTS, 
            SEARCH_PINS, SEARCH_BOARDS, SEARCH_USERS, SEARCH_AUTOCOMPLETE, SEARCH_MY_PINS, SEARCH_PLACES, SEARCH_PLACE_BOARDS, SEARCH_INTERESTS, SEARCH_BUYABLE, REGISTRATION_LANDING, 
            REGISTRATION_SIGNUP, REGISTRATION_BOARDS, REGISTRATION_SIGNUP_BUSINESS, REGISTRATION_LOCAL_INFO, REGISTRATION_AGE_GENDER, USER_BOARDS, USER_FOLLOWERS, USER_FOLLOWING, USER_LIKES, USER_ACTIVITY, 
            USER_PINS, USER_EDIT, USER_INTERESTS, USER_FYP, BOARD_FOLLOWERS, BOARD_SETTINGS, BOARD_CREATE, BOARD_EDIT, BOARD_EDIT_COLLABORATORS, BOARD_CHOOSE_COVER, 
            BOARD_CROP_COVER, BOARD_PLACE, BOARD_MAP, BOARD_EMPTY, FRIEND_INVITER_EMAIL, FRIEND_INVITER_FACEBOOK, FRIEND_INVITER_FIND_FRIENDS, FRIEND_INVITER_GMAIL, FRIEND_INVITER_INVITE, FRIEND_INVITER_TWITTER, 
            FRIEND_INVITER_YAHOO, ABOUT_TERMS, ABOUT_SUPPORT, ABOUT_BOOKMARKLET, ABOUT_ETIQUETTE, ABOUT_ABOUT, ABOUT_GOODIES, ABOUT_CAREERS, ABOUT_TEAM, ABOUT_PRESS, 
            ABOUT_PRIVACY, ABOUT_USE, ABOUT_COPYRIGHT, LOGIN_EMAIL, LOGIN_FACEBOOK, LOGIN_TWITTER, ERROR_NO_INTERNET, ERROR_NO_PIN, ERROR_NO_BOARD, ERROR_NO_USER, 
            ERROR_NO_ACTIVITY, REPORT_PIN, REPORT_USER, PIN_CREATE_REPIN, PIN_CREATE, PIN_CREATE_SDK, PIN_EDIT, PIN_SEND_TO, USER_ABOUT, BOARD_COLLABORATORS, 
            EDUCATION_LONGPRESS, EDUCATION_RELATED_PINS, EDUCATION_SECRET_BOARD, EDUCATION_CONTEXTUAL_MENU, EDUCATION_GUIDED_SEARCH, EDUCATION_FLYOUT, EDUCATION_SAVE, MOBILE_ORIENTATION_DISCOVER, MOBILE_ORIENTATION_COLLECT, MOBILE_ORIENTATION_FUNCTIONAL, 
            MOBILE_ORIENTATION_STORY, ORIENTATION_FAST_FOLLOW, PICKED_FOR_YOU_FEED, FEED_EDITOR_FOLLOW_BOARDS, FEED_EDITOR_UNFOLLOW_BOARDS, DEPRECATED_DEEP_LINKING_EMAIL, DEPRECATED_DEEP_LINKING_WEB, DEEP_LINKING_FACEBOOK, DEEP_LINKING_APP, FEED_RELATED_BOARD, 
            FEED_RELATED_INTEREST, FIND_FRIENDS, PIN_OTHER, PIN_REGULAR, PIN_ARTICLE, PIN_MOVIE, PIN_PLACE, PIN_PRODUCT, PIN_RECIPE, PIN_LOOKBOOK, 
            PIN_PRODUCT_MERCHANT, PIN_CREATE_PLACES, PIN_LIKES, PIN_COMMENTS, PIN_REPIN_BOARDS, PIN_CLOSEUP_BODY, PIN_CLOSEUP_RELATED_PINS, PIN_QUESTIONS, PIN_ANSWERS, PIN_REPLIES, 
            SPLASH_LOADING, SPLASH_INSPIRED_WALL, SPLASH_BRIO_WALL, SPLASH_CONTINUE_EMAIL, SPLASH_MULTISTEP, ORIENTATION_START, ORIENTATION_END, ORIENTATION_INTEREST_PICKER, ORIENTATION_USER_PICKER, REBUILD_FEED_INTEREST_PICKER, 
            REBUILD_FEED_END, STORIES_RELATED_PINS, STORIES_RELATED_USERS, STORIES_RELATED_BOARDS, STORIES_RELATED_INTERESTS, BROWSER, CONVERSATION_CREATE, CONVERSATION_THREAD, CONVERSATION_INBOX, CONVERSATION_ADD_PIN, 
            CONVERSATION_USERS, NEWS_NETWORK_STORY, NEWS_YOUR_STORY, PIN_TWINS, ACTIVITY_V2, BUYABLE_MERCHANT_RETURN_POLICY, BUYABLE_VARIANT_OPTIONS, BUYABLE_CHECKOUT_APPLE_PAY_OPTION, BUYABLE_CHECKOUT_SUMMARY, BUYABLE_SELECT_SHIPPING_ADDRESS, 
            BUYABLE_SHIPPING_ADDRESS_FORM, BUYABLE_SELECT_SHIPPING_METHOD, BUYABLE_SELECT_PAYMENT, BUYABLE_PAYMENT_FORM, BUYABLE_CONFIRMATION, BUYABLE_ORDER_HISTORY, BUYABLE_ORDER_DETAILS, BUYABLE_ADDRESS_CONTACTS, BUYABLE_ADDRESS_RECENTS, PLACE_VIEW_HEADER, 
            PLACE_VIEW_RELATED_PINS, EXTERNAL_SOURCE_OTHER, EMAIL_UNKNOWN, EMAIL_TRANSACTIONAL, EMAIL_EDITORIAL, EMAIL_ACTIVITY_AGGREGATION, EMAIL_RECOMMENDATIONS_DIGEST, EMAIL_SOCIAL_DIGEST, EMAIL_SEND_PIN, EMAIL_SEND_BOARD, 
            EMAIL_SEND_PINNER, EMAIL_FRIEND_JOINED, EMAIL_WELCOME, EMAIL_BOARD_RECOMMENDATIONS, EMAIL_PIN_RECOMMENDATIONS, EMAIL_COMMENT_AND_MENTION, EMAIL_USECASES, EMAIL_FIREHOSE_QUESTION_CREATE, EMAIL_FIREHOSE_ANSWER_CREATE, EMAIL_FIREHOSE_REPLY_CREATE, 
            EMAIL_QUESTION_CREATE, EMAIL_ANSWER_CREATE, EMAIL_QUESTION_LIKE, EMAIL_ANSWER_LIKE, EMAIL_REPLY_CREATE, EMAIL_PARTNER, EMAIL_INTEREST_RECOMMENDATIONS, EMAIL_HOMEFEED_NEW_PINS, EMAIL_NETWORK_STORY_DIGEST, EMAIL_PINVITATIONAL_ACCESS, 
            EMAIL_RESTART_FEED, EMAIL_PINVITATIONAL_RALLYING_CALL, EMAIL_WEEK_IN_REVIEW, EMAIL_NO_SIGNAL, EMAIL_USER_RECOMMENDATIONS, EMAIL_BOARD_COLLABORATION, EMAIL_CONVERSATIONS, EMAIL_LEGAL, EMAIL_SECURITY, SERVICE_ENTRY_SOCIAL_FACEBOOK, 
            SERVICE_ENTRY_SOCIAL_TWITTER, SERVICE_ENTRY_SEO_GOOGLE, SERVICE_ENTRY_SEO_YAHOO, SERVICE_ENTRY_SEO_BING, STERLING_CREATION_FLOW_PICK_A_PIN, STERLING_CREATION_FLOW_SETUP_DETAILS, STERLING_CREATION_FLOW_BILLING, STERLING_PIN_PROMOTION_DASHBOARD, STERLING_PIN_PROMOTION_EDIT, STERLING_CAMPAIGN_DASHBOARD, 
            STERLING_CAMPAIGN_EDIT, STERLING_ADVERTISER_DASHBOARD, STERLING_ADVERTISER_EDIT, STERLING_CONVERSION_TAG_CREATE, STERLING_CONVERSION_TAG_EDIT, STERLING_CPA_OBJECTIVE_DASHBOARD, STERLING_CPC_OBJECTIVE_DASHBOARD, STERLING_CPE_OBJECTIVE_DASHBOARD, STERLING_CPM_OBJECTIVE_DASHBOARD, STERLING_ACCOUNT_DASHBOARD, 
            STERLING_CREATION_FLOW_CHOOSE_OBJECTIVE, ANALYTICS_PROFILE_IMPRESSIONS, ANALYTICS_PROFILE_REPINS, ANALYTICS_PROFILE_CLICKS, ANALYTICS_PROFILE_ALL_TIME, ANALYTICS_DOMAIN_IMPRESSIONS, ANALYTICS_DOMAIN_REPINS, ANALYTICS_DOMAIN_CLICKS, ANALYTICS_DOMAIN_ORIGINAL_PINS, ANALYTICS_DOMAIN_ALL_TIME, 
            PINVITATIONAL_UNAUTH_EMAIL, PINVITATIONAL_UNAUTH_CONFIRM, PINVITATIONAL_AUTH_CONFIRM, PINVITATIONAL_SIGNUP_REDEMPTION, PINVITATIONAL_HOME_FEED_MODAL, PINVITATIONAL_PIN_SUMMARY, SETTINGS_SEARCH_PRIVACY, SETTINGS_OFFLINE_BOARD, SHARE_EXTENSION, EXTENSION_UPSELL_TOAST, 
            EXTENSION_UPSELL_MODAL, EXTENSION_UPSELL_NUX, EXTENSION_INSTALLED, EXTENSION_NOT_INSTALLED, EXTENSION_UPSELL_NAG, EXTENSION_UPSELL_NAG_PIN_CREATE, FIND_FRIENDS_ADDRESS_BOOK, FIND_FRIENDS_FACEBOOK, FIND_FRIENDS_TWITTER, FIND_FRIENDS_MORE, 
            FIND_FRIENDS_INVITE_ALL, HOMEFEED_BUILDER, HOMEFEED_BUILDER_SPLASH, HOMEFEED_BUILDER_MY_TOPICS, HOMEFEED_BUILDER_MY_BOARDS, HOMEFEED_BUILDER_MY_USERS, HOMEFEED_BUILDER_REC_TOPICS, HOMEFEED_BUILDER_REC_BOARDS, HOMEFEED_BUILDER_REC_USERS, CAMERA_PHOTO_PICKER, 
            CAMERA_ALBUM_PICKER, API_ENVIRONMENTS, FPE_CREATE_FIRST_BOARD, PUSH_NOTIFICATION_CONVERSATION, PUSH_NOTIFICATION_ACTION, PUSH_NOTIFICATION_SYSTEM_NEWS, PUSH_NOTIFICATION_INTERACTION, PUSH_NOTIFICATION_FRIEND_NEWS, PUSH_NOTIFICATION_EDITORIAL, PUSH_NOTIFICATION_UNKNOWN, 
            SEND_SHARE_MAIN, LIBRARY_HOME, LIBRARY_FOLLOWERS, LIBRARY_FOLLOWING, LIBRARY_LIKES, LIBRARY_ALL_PINS, PIN_FLASHLIGHT_RESULTS, FEED_SHOP_SPACE, FEED_TODAYS_PICKS, FEED_BUYABLE_CATEGORY, 
            FEED_TOP_SHOPS, CONFIRM_WEBSITE_BY_NAG
        });
    }
}
