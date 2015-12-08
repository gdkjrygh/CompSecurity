// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.schemas.event;

import org.apache.thrift.TEnum;

public final class ViewType extends Enum
    implements TEnum
{

    private static final ViewType $VALUES[];
    public static final ViewType ABOUT;
    public static final ViewType ACTION_SHEET;
    public static final ViewType AGGREGATED_PIN_FEED;
    public static final ViewType ANALYTICS_DOMAIN;
    public static final ViewType ANALYTICS_PROFILE;
    public static final ViewType ANDROID_WIDGET;
    public static final ViewType ANDROID_WIDGET_FEED;
    public static final ViewType BOARD;
    public static final ViewType BOARD_PICKER;
    public static final ViewType BOOKMARKLET;
    public static final ViewType BROWSER;
    public static final ViewType CAMERA;
    public static final ViewType CATEGORY_GRID;
    public static final ViewType CHECKOUT;
    public static final ViewType COMMERCE_USER_EDUCATION;
    public static final ViewType CONTACT_UPLOAD;
    public static final ViewType CONVERSATION;
    public static final ViewType CRAWLED_SEARCH_RESULT;
    public static final ViewType DEEP_LINKING;
    public static final ViewType DISCOVER;
    public static final ViewType EDUCATION;
    public static final ViewType EMAIL;
    public static final ViewType EMPTY_STATE;
    public static final ViewType ERROR;
    public static final ViewType EXPLORE_FEED;
    public static final ViewType EXPLORE_PAGE;
    public static final ViewType FEED;
    public static final ViewType FEED_EDITOR;
    public static final ViewType FIND_FRIENDS;
    public static final ViewType FLASHLIGHT;
    public static final ViewType FRIEND_INVITER;
    public static final ViewType FRIEND_MULTI_INVITER;
    public static final ViewType HOMEFEED_BUILDER;
    public static final ViewType LIBRARY;
    public static final ViewType LIBRARY_PROFILE_EDUCATION;
    public static final ViewType LOGIN;
    public static final ViewType NEWS;
    public static final ViewType ORIENTATION;
    public static final ViewType OTHER_EXTERNAL;
    public static final ViewType PIN;
    public static final ViewType PINPICKS;
    public static final ViewType PINVITATIONAL;
    public static final ViewType PINVITATIONAL_UNAUTH_CONFIRM;
    public static final ViewType PINVITATIONAL_UNAUTH_EMAIL;
    public static final ViewType PLACE;
    public static final ViewType PUSH_NOTIFICATION;
    public static final ViewType REGISTRATION;
    public static final ViewType REPORT;
    public static final ViewType SAVE;
    public static final ViewType SEARCH;
    public static final ViewType SEND_SHARE;
    public static final ViewType SERVICE_ENTRY_SEO;
    public static final ViewType SERVICE_ENTRY_SOCIAL;
    public static final ViewType SETTINGS;
    public static final ViewType SHARE_EXTENSION;
    public static final ViewType SHARE_EXTENSION_CREATE_BOARD;
    public static final ViewType SHARE_EXTENSION_IMAGE_PICKER;
    public static final ViewType SHARE_EXTENSION_SELECT_BOARD;
    public static final ViewType SPLASH;
    public static final ViewType STERLING_ADMIN;
    public static final ViewType STERLING_ADVERTISER;
    public static final ViewType STERLING_BILLING_HISTORY;
    public static final ViewType STERLING_BILLING_PROFILE;
    public static final ViewType STERLING_BULK_EDITOR;
    public static final ViewType STERLING_CAMPAIGN;
    public static final ViewType STERLING_CONVERSION_TAG;
    public static final ViewType STERLING_CONVERSION_TAGS;
    public static final ViewType STERLING_CREATION_FLOW;
    public static final ViewType STERLING_HOME;
    public static final ViewType STERLING_OBJECTIVE;
    public static final ViewType STERLING_PIN_PROMOTION;
    public static final ViewType STORIES;
    public static final ViewType USER;
    public static final ViewType VISUAL_SEARCH;
    private final int value;

    private ViewType(String s, int i, int j)
    {
        super(s, i);
        value = j;
    }

    public static ViewType findByValue(int i)
    {
        switch (i)
        {
        case 49: // '1'
        default:
            return null;

        case 1: // '\001'
            return FEED;

        case 2: // '\002'
            return SEARCH;

        case 3: // '\003'
            return PIN;

        case 4: // '\004'
            return USER;

        case 5: // '\005'
            return BOARD;

        case 6: // '\006'
            return ABOUT;

        case 7: // '\007'
            return SETTINGS;

        case 8: // '\b'
            return FRIEND_INVITER;

        case 9: // '\t'
            return LOGIN;

        case 10: // '\n'
            return REGISTRATION;

        case 11: // '\013'
            return BROWSER;

        case 12: // '\f'
            return BOOKMARKLET;

        case 13: // '\r'
            return ANDROID_WIDGET;

        case 14: // '\016'
            return SPLASH;

        case 15: // '\017'
            return CAMERA;

        case 16: // '\020'
            return REPORT;

        case 17: // '\021'
            return ERROR;

        case 18: // '\022'
            return NEWS;

        case 41: // ')'
            return STORIES;

        case 19: // '\023'
            return CATEGORY_GRID;

        case 20: // '\024'
            return DEEP_LINKING;

        case 21: // '\025'
            return BOARD_PICKER;

        case 22: // '\026'
            return DISCOVER;

        case 23: // '\027'
            return EDUCATION;

        case 24: // '\030'
            return ORIENTATION;

        case 25: // '\031'
            return FEED_EDITOR;

        case 26: // '\032'
            return ANDROID_WIDGET_FEED;

        case 27: // '\033'
            return EXPLORE_PAGE;

        case 28: // '\034'
            return EXPLORE_FEED;

        case 29: // '\035'
            return FRIEND_MULTI_INVITER;

        case 30: // '\036'
            return FIND_FRIENDS;

        case 31: // '\037'
            return EMAIL;

        case 32: // ' '
            return OTHER_EXTERNAL;

        case 33: // '!'
            return SERVICE_ENTRY_SOCIAL;

        case 34: // '"'
            return SERVICE_ENTRY_SEO;

        case 35: // '#'
            return STERLING_CREATION_FLOW;

        case 36: // '$'
            return STERLING_ADVERTISER;

        case 37: // '%'
            return STERLING_CAMPAIGN;

        case 38: // '&'
            return STERLING_PIN_PROMOTION;

        case 39: // '\''
            return ANALYTICS_PROFILE;

        case 40: // '('
            return ANALYTICS_DOMAIN;

        case 42: // '*'
            return CONVERSATION;

        case 43: // '+'
            return VISUAL_SEARCH;

        case 44: // ','
            return PINPICKS;

        case 45: // '-'
            return PINVITATIONAL_UNAUTH_EMAIL;

        case 46: // '.'
            return PINVITATIONAL_UNAUTH_CONFIRM;

        case 47: // '/'
            return PINVITATIONAL;

        case 48: // '0'
            return ACTION_SHEET;

        case 51: // '3'
            return EMPTY_STATE;

        case 52: // '4'
            return SAVE;

        case 53: // '5'
            return STERLING_ADMIN;

        case 54: // '6'
            return STERLING_BILLING_PROFILE;

        case 55: // '7'
            return STERLING_BILLING_HISTORY;

        case 56: // '8'
            return STERLING_CONVERSION_TAGS;

        case 57: // '9'
            return STERLING_CONVERSION_TAG;

        case 58: // ':'
            return STERLING_OBJECTIVE;

        case 59: // ';'
            return STERLING_HOME;

        case 73: // 'I'
            return STERLING_BULK_EDITOR;

        case 60: // '<'
            return CHECKOUT;

        case 50: // '2'
            return SHARE_EXTENSION;

        case 61: // '='
            return SHARE_EXTENSION_IMAGE_PICKER;

        case 62: // '>'
            return SHARE_EXTENSION_CREATE_BOARD;

        case 63: // '?'
            return SHARE_EXTENSION_SELECT_BOARD;

        case 64: // '@'
            return COMMERCE_USER_EDUCATION;

        case 65: // 'A'
            return CRAWLED_SEARCH_RESULT;

        case 66: // 'B'
            return PLACE;

        case 67: // 'C'
            return PUSH_NOTIFICATION;

        case 68: // 'D'
            return LIBRARY_PROFILE_EDUCATION;

        case 69: // 'E'
            return LIBRARY;

        case 70: // 'F'
            return SEND_SHARE;

        case 74: // 'J'
            return CONTACT_UPLOAD;

        case 71: // 'G'
            return HOMEFEED_BUILDER;

        case 72: // 'H'
            return FLASHLIGHT;

        case 75: // 'K'
            return AGGREGATED_PIN_FEED;
        }
    }

    public static ViewType valueOf(String s)
    {
        return (ViewType)Enum.valueOf(com/pinterest/schemas/event/ViewType, s);
    }

    public static ViewType[] values()
    {
        return (ViewType[])$VALUES.clone();
    }

    public final int getValue()
    {
        return value;
    }

    static 
    {
        FEED = new ViewType("FEED", 0, 1);
        SEARCH = new ViewType("SEARCH", 1, 2);
        PIN = new ViewType("PIN", 2, 3);
        USER = new ViewType("USER", 3, 4);
        BOARD = new ViewType("BOARD", 4, 5);
        ABOUT = new ViewType("ABOUT", 5, 6);
        SETTINGS = new ViewType("SETTINGS", 6, 7);
        FRIEND_INVITER = new ViewType("FRIEND_INVITER", 7, 8);
        LOGIN = new ViewType("LOGIN", 8, 9);
        REGISTRATION = new ViewType("REGISTRATION", 9, 10);
        BROWSER = new ViewType("BROWSER", 10, 11);
        BOOKMARKLET = new ViewType("BOOKMARKLET", 11, 12);
        ANDROID_WIDGET = new ViewType("ANDROID_WIDGET", 12, 13);
        SPLASH = new ViewType("SPLASH", 13, 14);
        CAMERA = new ViewType("CAMERA", 14, 15);
        REPORT = new ViewType("REPORT", 15, 16);
        ERROR = new ViewType("ERROR", 16, 17);
        NEWS = new ViewType("NEWS", 17, 18);
        STORIES = new ViewType("STORIES", 18, 41);
        CATEGORY_GRID = new ViewType("CATEGORY_GRID", 19, 19);
        DEEP_LINKING = new ViewType("DEEP_LINKING", 20, 20);
        BOARD_PICKER = new ViewType("BOARD_PICKER", 21, 21);
        DISCOVER = new ViewType("DISCOVER", 22, 22);
        EDUCATION = new ViewType("EDUCATION", 23, 23);
        ORIENTATION = new ViewType("ORIENTATION", 24, 24);
        FEED_EDITOR = new ViewType("FEED_EDITOR", 25, 25);
        ANDROID_WIDGET_FEED = new ViewType("ANDROID_WIDGET_FEED", 26, 26);
        EXPLORE_PAGE = new ViewType("EXPLORE_PAGE", 27, 27);
        EXPLORE_FEED = new ViewType("EXPLORE_FEED", 28, 28);
        FRIEND_MULTI_INVITER = new ViewType("FRIEND_MULTI_INVITER", 29, 29);
        FIND_FRIENDS = new ViewType("FIND_FRIENDS", 30, 30);
        EMAIL = new ViewType("EMAIL", 31, 31);
        OTHER_EXTERNAL = new ViewType("OTHER_EXTERNAL", 32, 32);
        SERVICE_ENTRY_SOCIAL = new ViewType("SERVICE_ENTRY_SOCIAL", 33, 33);
        SERVICE_ENTRY_SEO = new ViewType("SERVICE_ENTRY_SEO", 34, 34);
        STERLING_CREATION_FLOW = new ViewType("STERLING_CREATION_FLOW", 35, 35);
        STERLING_ADVERTISER = new ViewType("STERLING_ADVERTISER", 36, 36);
        STERLING_CAMPAIGN = new ViewType("STERLING_CAMPAIGN", 37, 37);
        STERLING_PIN_PROMOTION = new ViewType("STERLING_PIN_PROMOTION", 38, 38);
        ANALYTICS_PROFILE = new ViewType("ANALYTICS_PROFILE", 39, 39);
        ANALYTICS_DOMAIN = new ViewType("ANALYTICS_DOMAIN", 40, 40);
        CONVERSATION = new ViewType("CONVERSATION", 41, 42);
        VISUAL_SEARCH = new ViewType("VISUAL_SEARCH", 42, 43);
        PINPICKS = new ViewType("PINPICKS", 43, 44);
        PINVITATIONAL_UNAUTH_EMAIL = new ViewType("PINVITATIONAL_UNAUTH_EMAIL", 44, 45);
        PINVITATIONAL_UNAUTH_CONFIRM = new ViewType("PINVITATIONAL_UNAUTH_CONFIRM", 45, 46);
        PINVITATIONAL = new ViewType("PINVITATIONAL", 46, 47);
        ACTION_SHEET = new ViewType("ACTION_SHEET", 47, 48);
        EMPTY_STATE = new ViewType("EMPTY_STATE", 48, 51);
        SAVE = new ViewType("SAVE", 49, 52);
        STERLING_ADMIN = new ViewType("STERLING_ADMIN", 50, 53);
        STERLING_BILLING_PROFILE = new ViewType("STERLING_BILLING_PROFILE", 51, 54);
        STERLING_BILLING_HISTORY = new ViewType("STERLING_BILLING_HISTORY", 52, 55);
        STERLING_CONVERSION_TAGS = new ViewType("STERLING_CONVERSION_TAGS", 53, 56);
        STERLING_CONVERSION_TAG = new ViewType("STERLING_CONVERSION_TAG", 54, 57);
        STERLING_OBJECTIVE = new ViewType("STERLING_OBJECTIVE", 55, 58);
        STERLING_HOME = new ViewType("STERLING_HOME", 56, 59);
        STERLING_BULK_EDITOR = new ViewType("STERLING_BULK_EDITOR", 57, 73);
        CHECKOUT = new ViewType("CHECKOUT", 58, 60);
        SHARE_EXTENSION = new ViewType("SHARE_EXTENSION", 59, 50);
        SHARE_EXTENSION_IMAGE_PICKER = new ViewType("SHARE_EXTENSION_IMAGE_PICKER", 60, 61);
        SHARE_EXTENSION_CREATE_BOARD = new ViewType("SHARE_EXTENSION_CREATE_BOARD", 61, 62);
        SHARE_EXTENSION_SELECT_BOARD = new ViewType("SHARE_EXTENSION_SELECT_BOARD", 62, 63);
        COMMERCE_USER_EDUCATION = new ViewType("COMMERCE_USER_EDUCATION", 63, 64);
        CRAWLED_SEARCH_RESULT = new ViewType("CRAWLED_SEARCH_RESULT", 64, 65);
        PLACE = new ViewType("PLACE", 65, 66);
        PUSH_NOTIFICATION = new ViewType("PUSH_NOTIFICATION", 66, 67);
        LIBRARY_PROFILE_EDUCATION = new ViewType("LIBRARY_PROFILE_EDUCATION", 67, 68);
        LIBRARY = new ViewType("LIBRARY", 68, 69);
        SEND_SHARE = new ViewType("SEND_SHARE", 69, 70);
        CONTACT_UPLOAD = new ViewType("CONTACT_UPLOAD", 70, 74);
        HOMEFEED_BUILDER = new ViewType("HOMEFEED_BUILDER", 71, 71);
        FLASHLIGHT = new ViewType("FLASHLIGHT", 72, 72);
        AGGREGATED_PIN_FEED = new ViewType("AGGREGATED_PIN_FEED", 73, 75);
        $VALUES = (new ViewType[] {
            FEED, SEARCH, PIN, USER, BOARD, ABOUT, SETTINGS, FRIEND_INVITER, LOGIN, REGISTRATION, 
            BROWSER, BOOKMARKLET, ANDROID_WIDGET, SPLASH, CAMERA, REPORT, ERROR, NEWS, STORIES, CATEGORY_GRID, 
            DEEP_LINKING, BOARD_PICKER, DISCOVER, EDUCATION, ORIENTATION, FEED_EDITOR, ANDROID_WIDGET_FEED, EXPLORE_PAGE, EXPLORE_FEED, FRIEND_MULTI_INVITER, 
            FIND_FRIENDS, EMAIL, OTHER_EXTERNAL, SERVICE_ENTRY_SOCIAL, SERVICE_ENTRY_SEO, STERLING_CREATION_FLOW, STERLING_ADVERTISER, STERLING_CAMPAIGN, STERLING_PIN_PROMOTION, ANALYTICS_PROFILE, 
            ANALYTICS_DOMAIN, CONVERSATION, VISUAL_SEARCH, PINPICKS, PINVITATIONAL_UNAUTH_EMAIL, PINVITATIONAL_UNAUTH_CONFIRM, PINVITATIONAL, ACTION_SHEET, EMPTY_STATE, SAVE, 
            STERLING_ADMIN, STERLING_BILLING_PROFILE, STERLING_BILLING_HISTORY, STERLING_CONVERSION_TAGS, STERLING_CONVERSION_TAG, STERLING_OBJECTIVE, STERLING_HOME, STERLING_BULK_EDITOR, CHECKOUT, SHARE_EXTENSION, 
            SHARE_EXTENSION_IMAGE_PICKER, SHARE_EXTENSION_CREATE_BOARD, SHARE_EXTENSION_SELECT_BOARD, COMMERCE_USER_EDUCATION, CRAWLED_SEARCH_RESULT, PLACE, PUSH_NOTIFICATION, LIBRARY_PROFILE_EDUCATION, LIBRARY, SEND_SHARE, 
            CONTACT_UPLOAD, HOMEFEED_BUILDER, FLASHLIGHT, AGGREGATED_PIN_FEED
        });
    }
}
