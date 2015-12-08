// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.schemas.event;

import org.apache.thrift.TEnum;

public final class ComponentType extends Enum
    implements TEnum
{

    private static final ComponentType $VALUES[];
    public static final ComponentType BOARD_INFO_BAR;
    public static final ComponentType BOARD_PINS_GRID;
    public static final ComponentType BOARD_RECOMMENDATION_DROPDOWN;
    public static final ComponentType BRAND_SURVEY_DIALOG;
    public static final ComponentType BROWSER;
    public static final ComponentType BULK_INVITE;
    public static final ComponentType BUYABLE_PINS_CAROUSEL;
    public static final ComponentType CAMPBELL_NAV_DRAWER;
    public static final ComponentType CAMPBELL_NAV_TOP_LINKS;
    public static final ComponentType CATEGORIES_CAROUSEL;
    public static final ComponentType CLOSEUP_INLINE_CAROUSEL;
    public static final ComponentType CLOSEUP_LINK_MODULE;
    public static final ComponentType CLOSEUP_NAV_BUTTON;
    public static final ComponentType CLOSEUP_PLACE_MODULE;
    public static final ComponentType CLOSEUP_SHORTCUT_BUTTON;
    public static final ComponentType CLOSEUP_ZOOMED_GALLERY;
    public static final ComponentType COLD_NUX_INTERESTS_GIFTWRAP;
    public static final ComponentType COLD_NUX_USE_CASE_INTEREST_PICKER;
    public static final ComponentType COLD_NUX_USE_CASE_PICKER;
    public static final ComponentType COMMERCE_SEARCH_PRICE_FILTER;
    public static final ComponentType CONTEXTUAL_MENU;
    public static final ComponentType CONTEXTUAL_STORY;
    public static final ComponentType CONTEXTUAL_USER_EDUCATION;
    public static final ComponentType CONVERSATION_MESSAGES;
    public static final ComponentType CSR_CLOSEUP;
    public static final ComponentType DIGEST_STORY;
    public static final ComponentType DIGEST_STORY_CELL;
    public static final ComponentType DIGEST_STORY_CELL_CAROUSEL;
    public static final ComponentType DIGEST_STORY_FEEDBACK_DIALOG;
    public static final ComponentType DIGEST_STORY_HEADER;
    public static final ComponentType DISCOVER_FEATURED_CAROUSEL;
    public static final ComponentType DISCOVER_FRIEND_MERCHANDISING_BOARD_RECS;
    public static final ComponentType DISCOVER_FRIEND_MERCHANDISING_CONNECT_TO_FACEBOOK;
    public static final ComponentType DISCOVER_FRIEND_MERCHANDISING_EMPTY_STATE;
    public static final ComponentType DISCOVER_FRIEND_MERCHANDISING_INVITE_FRIENDS;
    public static final ComponentType DOMAIN;
    public static final ComponentType DYNAMIC_GRID_STORY;
    public static final ComponentType EDUCATION;
    public static final ComponentType EDUCATION_TOOLTIP_POPUP;
    public static final ComponentType EDUCATION_TOOLTIP_PULSER;
    public static final ComponentType FIND_FRIENDS_SOURCE_HEADER;
    public static final ComponentType FLOWED_BOARD;
    public static final ComponentType FLOWED_CATEGORY;
    public static final ComponentType FLOWED_PIN;
    public static final ComponentType FORCE_TOUCH_PEEK_PINS_COLLECTION;
    public static final ComponentType FORCE_TOUCH_PEEK_PIN_CLOSEUP;
    public static final ComponentType FORCE_TOUCH_PEEK_PROFILE;
    public static final ComponentType FORCE_TOUCH_PEEK_WEB_BROWSER;
    public static final ComponentType FPE_CREATE_FIRST_BOARD_MODAL;
    public static final ComponentType FPE_CREATE_FIRST_BOARD_RECS_LIST;
    public static final ComponentType FRIEND_CENTER_MODULE;
    public static final ComponentType GOOGLE_APP_INDEXING_UNAUTH_PAGE;
    public static final ComponentType HOMEFEED_INVITE_MODULE;
    public static final ComponentType INTEREST_CAROUSEL;
    public static final ComponentType INTEREST_GRID;
    public static final ComponentType INTEREST_PICKER;
    public static final ComponentType INTEREST_RELATED_CAROUSEL;
    public static final ComponentType LIBRARY_PROFILE_ALL_PINS;
    public static final ComponentType LIBRARY_PROFILE_BOARD;
    public static final ComponentType LIST_HEADER;
    public static final ComponentType LOOKBOOK_ACTION_BAR;
    public static final ComponentType LOOKBOOK_FRAME;
    public static final ComponentType MAP;
    public static final ComponentType MODAL_ADD_PIN;
    public static final ComponentType MODAL_CREATE_BOARD;
    public static final ComponentType MODAL_DIALOG;
    public static final ComponentType MODAL_PIN;
    public static final ComponentType MODAL_POST_REPIN;
    public static final ComponentType MODAL_REPIN;
    public static final ComponentType MODAL_SEARCH_PRIVACY;
    public static final ComponentType NAG;
    public static final ComponentType NAG_CLIPBOARD_URL;
    public static final ComponentType NAVIGATION;
    public static final ComponentType NEWS_FEED;
    public static final ComponentType NOTIFICATIONS_CONVERSATIONS_DROPDOWN;
    public static final ComponentType NUX_INTEREST_PICKER;
    public static final ComponentType ORIENTATION;
    public static final ComponentType PARTNER_PERFORMANCE_MODULE;
    public static final ComponentType PARTNER_PERFORMANCE_MODULE_V2;
    public static final ComponentType PASSWORD_RESET_PAGE;
    public static final ComponentType PINNER_CAROUSEL;
    public static final ComponentType PIN_CLOSEUP_AGGREGATED;
    public static final ComponentType PIN_CLOSEUP_ATTRIBUTION;
    public static final ComponentType PIN_CLOSEUP_BASIC;
    public static final ComponentType PIN_CLOSEUP_BODY;
    public static final ComponentType PIN_CLOSEUP_COMMERCE;
    public static final ComponentType PIN_CLOSEUP_FOLLOW;
    public static final ComponentType PIN_CLOSEUP_GALLERY;
    public static final ComponentType PIN_CLOSEUP_IMAGE;
    public static final ComponentType PIN_CLOSEUP_LINK;
    public static final ComponentType PIN_CLOSEUP_MOVIE;
    public static final ComponentType PIN_CLOSEUP_PLACE;
    public static final ComponentType PIN_CLOSEUP_PRICE;
    public static final ComponentType PIN_CLOSEUP_PROMOTED;
    public static final ComponentType PIN_CLOSEUP_RECIPE;
    public static final ComponentType PIN_CLOSEUP_RELATED_PINS;
    public static final ComponentType PIN_CLOSEUP_SOURCE;
    public static final ComponentType PIN_CLOSEUP_SOURCE_DESCRIPTION;
    public static final ComponentType PIN_CLOSEUP_STATS;
    public static final ComponentType PIN_CLOSEUP_TITLE;
    public static final ComponentType PIN_CLOSEUP_TRANSITION_IMAGE;
    public static final ComponentType PIN_CLOSEUP_VARIANT_SELECTOR;
    public static final ComponentType PIN_FEEDBACK_DIALOG_BOARD;
    public static final ComponentType PIN_FEEDBACK_DIALOG_FOLLOWING;
    public static final ComponentType PIN_FEEDBACK_DIALOG_INTEREST;
    public static final ComponentType PIN_FEEDBACK_DIALOG_PFY;
    public static final ComponentType PIN_FEEDBACK_DIALOG_PFY_NEW;
    public static final ComponentType PIN_FEEDBACK_DIALOG_PFY_REASON;
    public static final ComponentType PIN_FEEDBACK_DIALOG_PFY_SURVEY_1;
    public static final ComponentType PIN_FEEDBACK_DIALOG_PFY_SURVEY_2;
    public static final ComponentType PIN_FEEDBACK_DIALOG_PROMOTED;
    public static final ComponentType PIN_FEEDBACK_DIALOG_PROMOTED_NEW;
    public static final ComponentType PIN_FEEDBACK_DIALOG_PROMOTED_REASON;
    public static final ComponentType PIN_FEEDBACK_DIALOG_SEARCH;
    public static final ComponentType PIN_FEEDBACK_PIN_CELL_HIDDEN_NO_REASON;
    public static final ComponentType PIN_FEEDBACK_PIN_DIALOG_INTEREST;
    public static final ComponentType PLACE_VIEW;
    public static final ComponentType PLACE_VIEW_MAP;
    public static final ComponentType REGISTRATION;
    public static final ComponentType RELATED_BOARDS;
    public static final ComponentType RELATED_INTERESTS;
    public static final ComponentType RELATED_PIN;
    public static final ComponentType RELATED_PINS_GRID_ITEM;
    public static final ComponentType SAFARI_KEYCHAIN_USE_PROMPT;
    public static final ComponentType SAVE_AUTOCOMPLETE;
    public static final ComponentType SEARCH_BOX;
    public static final ComponentType SEARCH_GUIDES_CONTAINER;
    public static final ComponentType SEARCH_HERO;
    public static final ComponentType SEARCH_INTEREST_RESULTS_GRID;
    public static final ComponentType SEARCH_RELATED_CATEGORIES;
    public static final ComponentType SEARCH_RELATED_QUERIES;
    public static final ComponentType SEGMENTED_CONTROL;
    public static final ComponentType SEND_OBJECT;
    public static final ComponentType SEND_SHARE;
    public static final ComponentType SEND_SHARE_SEARCH_CONTACT;
    public static final ComponentType SHARE_EXTENSION_BOARD_CREATE;
    public static final ComponentType SHARE_EXTENSION_BOARD_PICKER;
    public static final ComponentType SHARE_EXTENSION_BOARD_PICKER_NO_IMAGE_PICKER;
    public static final ComponentType SHARE_EXTENSION_IMAGE_PICKER;
    public static final ComponentType SHARE_EXTENSION_PICK_BOARD;
    public static final ComponentType SHEET;
    public static final ComponentType SHOP_SPACE_BANNER;
    public static final ComponentType SHOP_SPACE_BUYABLE_CATEGORY;
    public static final ComponentType SHOP_SPACE_TODAYS_PICKS;
    public static final ComponentType SHOP_SPACE_TOP_SHOPS;
    public static final ComponentType SIMILAR_BOARDS;
    public static final ComponentType STERLING_ACCOUNT_DASHBOARD_HEADER;
    public static final ComponentType STERLING_ADS_TOS;
    public static final ComponentType STERLING_BID_CONTAINER;
    public static final ComponentType STERLING_BILLING_FORM;
    public static final ComponentType STERLING_BREADCRUMB_NAV;
    public static final ComponentType STERLING_BULK_EDITOR_BUTTON_AREA;
    public static final ComponentType STERLING_BULK_EDITOR_CREATE;
    public static final ComponentType STERLING_BULK_EDITOR_EDIT;
    public static final ComponentType STERLING_BULK_EDITOR_REVIEW;
    public static final ComponentType STERLING_CAMPAIGN_DASHBOARD_HEADER;
    public static final ComponentType STERLING_CAMPAIGN_OBJECTIVES_BUTTONS_BAR;
    public static final ComponentType STERLING_CAMPAIGN_OBJECTIVES_CONTAINER;
    public static final ComponentType STERLING_CAMPAIGN_SPEC_FORM;
    public static final ComponentType STERLING_CONVERSION_TAG_CODE_SNIPPET_MODULE;
    public static final ComponentType STERLING_CONVERSION_TAG_DASHBOARD_HEADER;
    public static final ComponentType STERLING_CONVERSION_TAG_FORM_BUTTONS_BAR;
    public static final ComponentType STERLING_CONVERSION_TAG_TABLE_EMPTY_STATE;
    public static final ComponentType STERLING_CONVERSION_TAG_TABLE_ROW;
    public static final ComponentType STERLING_DASHBOARD_TABS;
    public static final ComponentType STERLING_DATE_PICKER;
    public static final ComponentType STERLING_GRAPH_SERIES_DROPDOWN;
    public static final ComponentType STERLING_IMPORT_TERMS_MODAL;
    public static final ComponentType STERLING_METRICS_GRAPH;
    public static final ComponentType STERLING_NAV_RECENT_CAMPAIGNS_MENU;
    public static final ComponentType STERLING_NAV_REPORTS_MENU;
    public static final ComponentType STERLING_NAV_TOOLS_MENU;
    public static final ComponentType STERLING_OBJECTIVE_SUMMARY_STATS;
    public static final ComponentType STERLING_OBJECTIVE_SUMMARY_STATS_ROW;
    public static final ComponentType STERLING_PICK_A_PIN_GRID;
    public static final ComponentType STERLING_PICK_A_PIN_SECTION_HEADER;
    public static final ComponentType STERLING_PICK_A_PIN_SEGMENTED_CONTROLLER;
    public static final ComponentType STERLING_PINTEREST_GUIDE;
    public static final ComponentType STERLING_PIN_PROMOTION_DASHBOARD_HEADER;
    public static final ComponentType STERLING_PROMOTED_PIN_PERFORMANCE_TABLE;
    public static final ComponentType STERLING_PROMOTED_PIN_SPEC_FORM;
    public static final ComponentType STERLING_SETUP_DETAILS_BUTTONS_BAR;
    public static final ComponentType STERLING_TARGETING_SUMMARY;
    public static final ComponentType STERLING_TARGETING_TERMS_TABLE;
    public static final ComponentType STERLING_TERMS_DELIMITER_DROPDOWN;
    public static final ComponentType STORIES_FEED;
    public static final ComponentType SUGGESTED_USERS;
    public static final ComponentType TOAST;
    public static final ComponentType TRENDING_CATEGORIES;
    public static final ComponentType TYPEAHEAD_SUGGESTIONS;
    public static final ComponentType USER_EDUCATION_DROPDOWN;
    public static final ComponentType USER_FEED;
    public static final ComponentType USER_MENU_DROPDOWN;
    public static final ComponentType USER_NEWS;
    public static final ComponentType USER_REPINS_FROM;
    public static final ComponentType USER_SELECT_SEARCH_BOX;
    public static final ComponentType VISUAL_SEARCH_GRID;
    public static final ComponentType WIDGET_ACTION_BAR;
    public static final ComponentType WIDGET_FOOTER;
    public static final ComponentType WIDGET_HEADER;
    private final int value;

    private ComponentType(String s, int i, int j)
    {
        super(s, i);
        value = j;
    }

    public static ComponentType findByValue(int i)
    {
        switch (i)
        {
        default:
            return null;

        case 0: // '\0'
            return FLOWED_PIN;

        case 1: // '\001'
            return FLOWED_BOARD;

        case 2: // '\002'
            return SUGGESTED_USERS;

        case 3: // '\003'
            return NEWS_FEED;

        case 4: // '\004'
            return MODAL_PIN;

        case 5: // '\005'
            return MODAL_REPIN;

        case 6: // '\006'
            return MODAL_POST_REPIN;

        case 7: // '\007'
            return MODAL_ADD_PIN;

        case 12: // '\f'
            return MODAL_CREATE_BOARD;

        case 74: // 'J'
            return MODAL_SEARCH_PRIVACY;

        case 8: // '\b'
            return NAVIGATION;

        case 9: // '\t'
            return MODAL_DIALOG;

        case 10: // '\n'
            return USER_FEED;

        case 11: // '\013'
            return FLOWED_CATEGORY;

        case 13: // '\r'
            return SHEET;

        case 14: // '\016'
            return EDUCATION;

        case 15: // '\017'
            return REGISTRATION;

        case 16: // '\020'
            return ORIENTATION;

        case 17: // '\021'
            return BROWSER;

        case 18: // '\022'
            return CONTEXTUAL_MENU;

        case 19: // '\023'
            return NAG;

        case 20: // '\024'
            return TOAST;

        case 21: // '\025'
            return WIDGET_ACTION_BAR;

        case 22: // '\026'
            return WIDGET_HEADER;

        case 23: // '\027'
            return WIDGET_FOOTER;

        case 24: // '\030'
            return HOMEFEED_INVITE_MODULE;

        case 25: // '\031'
            return TRENDING_CATEGORIES;

        case 26: // '\032'
            return MAP;

        case 27: // '\033'
            return LIST_HEADER;

        case 28: // '\034'
            return USER_REPINS_FROM;

        case 29: // '\035'
            return BOARD_PINS_GRID;

        case 30: // '\036'
            return DOMAIN;

        case 31: // '\037'
            return RELATED_BOARDS;

        case 32: // ' '
            return SEARCH_RELATED_QUERIES;

        case 33: // '!'
            return SEARCH_RELATED_CATEGORIES;

        case 34: // '"'
            return USER_SELECT_SEARCH_BOX;

        case 35: // '#'
            return TYPEAHEAD_SUGGESTIONS;

        case 36: // '$'
            return INTEREST_GRID;

        case 40: // '('
            return INTEREST_CAROUSEL;

        case 41: // ')'
            return INTEREST_RELATED_CAROUSEL;

        case 42: // '*'
            return CATEGORIES_CAROUSEL;

        case 43: // '+'
            return SEARCH_BOX;

        case 44: // ','
            return SEARCH_INTEREST_RESULTS_GRID;

        case 37: // '%'
            return BULK_INVITE;

        case 38: // '&'
            return USER_NEWS;

        case 39: // '\''
            return RELATED_INTERESTS;

        case 45: // '-'
            return VISUAL_SEARCH_GRID;

        case 46: // '.'
            return USER_MENU_DROPDOWN;

        case 47: // '/'
            return SEARCH_GUIDES_CONTAINER;

        case 48: // '0'
            return STORIES_FEED;

        case 49: // '1'
            return DISCOVER_FEATURED_CAROUSEL;

        case 50: // '2'
            return PINNER_CAROUSEL;

        case 51: // '3'
            return SEGMENTED_CONTROL;

        case 52: // '4'
            return CONTEXTUAL_USER_EDUCATION;

        case 53: // '5'
            return NAG_CLIPBOARD_URL;

        case 54: // '6'
            return NOTIFICATIONS_CONVERSATIONS_DROPDOWN;

        case 55: // '7'
            return CONVERSATION_MESSAGES;

        case 56: // '8'
            return SEND_OBJECT;

        case 57: // '9'
            return USER_EDUCATION_DROPDOWN;

        case 58: // ':'
            return PIN_FEEDBACK_DIALOG_PFY;

        case 59: // ';'
            return PIN_FEEDBACK_DIALOG_PFY_REASON;

        case 60: // '<'
            return PIN_FEEDBACK_DIALOG_PROMOTED;

        case 61: // '='
            return PIN_FEEDBACK_DIALOG_PROMOTED_REASON;

        case 62: // '>'
            return PIN_FEEDBACK_PIN_CELL_HIDDEN_NO_REASON;

        case 100: // 'd'
            return PIN_FEEDBACK_PIN_DIALOG_INTEREST;

        case 63: // '?'
            return DIGEST_STORY;

        case 71: // 'G'
            return DIGEST_STORY_FEEDBACK_DIALOG;

        case 72: // 'H'
            return DIGEST_STORY_HEADER;

        case 73: // 'I'
            return DIGEST_STORY_CELL;

        case 75: // 'K'
            return DIGEST_STORY_CELL_CAROUSEL;

        case 64: // '@'
            return LOOKBOOK_FRAME;

        case 65: // 'A'
            return LOOKBOOK_ACTION_BAR;

        case 66: // 'B'
            return INTEREST_PICKER;

        case 67: // 'C'
            return SAFARI_KEYCHAIN_USE_PROMPT;

        case 68: // 'D'
            return RELATED_PINS_GRID_ITEM;

        case 69: // 'E'
            return BOARD_INFO_BAR;

        case 70: // 'F'
            return RELATED_PIN;

        case 80: // 'P'
            return FIND_FRIENDS_SOURCE_HEADER;

        case 81: // 'Q'
            return BRAND_SURVEY_DIALOG;

        case 82: // 'R'
            return CLOSEUP_NAV_BUTTON;

        case 83: // 'S'
            return CLOSEUP_SHORTCUT_BUTTON;

        case 84: // 'T'
            return PIN_CLOSEUP_TRANSITION_IMAGE;

        case 85: // 'U'
            return PIN_CLOSEUP_BODY;

        case 86: // 'V'
            return PIN_CLOSEUP_RELATED_PINS;

        case 91: // '['
            return GOOGLE_APP_INDEXING_UNAUTH_PAGE;

        case 200: 
            return DYNAMIC_GRID_STORY;

        case 90: // 'Z'
            return SHARE_EXTENSION_PICK_BOARD;

        case 92: // '\\'
            return SHARE_EXTENSION_IMAGE_PICKER;

        case 97: // 'a'
            return SHARE_EXTENSION_BOARD_PICKER;

        case 94: // '^'
            return SHARE_EXTENSION_BOARD_PICKER_NO_IMAGE_PICKER;

        case 95: // '_'
            return SHARE_EXTENSION_BOARD_CREATE;

        case 96: // '`'
            return SAVE_AUTOCOMPLETE;

        case 93: // ']'
            return CLOSEUP_ZOOMED_GALLERY;

        case 98: // 'b'
            return COMMERCE_SEARCH_PRICE_FILTER;

        case 99: // 'c'
            return BUYABLE_PINS_CAROUSEL;

        case 101: // 'e'
            return CLOSEUP_INLINE_CAROUSEL;

        case 102: // 'f'
            return CLOSEUP_LINK_MODULE;

        case 103: // 'g'
            return FRIEND_CENTER_MODULE;

        case 104: // 'h'
            return CLOSEUP_PLACE_MODULE;

        case 105: // 'i'
            return PLACE_VIEW;

        case 106: // 'j'
            return PLACE_VIEW_MAP;

        case 107: // 'k'
            return PIN_FEEDBACK_DIALOG_FOLLOWING;

        case 109: // 'm'
            return PIN_FEEDBACK_DIALOG_PFY_SURVEY_1;

        case 110: // 'n'
            return PIN_FEEDBACK_DIALOG_PFY_SURVEY_2;

        case 111: // 'o'
            return PIN_FEEDBACK_DIALOG_INTEREST;

        case 112: // 'p'
            return PIN_FEEDBACK_DIALOG_SEARCH;

        case 113: // 'q'
            return PIN_FEEDBACK_DIALOG_BOARD;

        case 114: // 'r'
            return PIN_FEEDBACK_DIALOG_PFY_NEW;

        case 115: // 's'
            return PIN_FEEDBACK_DIALOG_PROMOTED_NEW;

        case 108: // 'l'
            return PARTNER_PERFORMANCE_MODULE;

        case 139: 
            return PARTNER_PERFORMANCE_MODULE_V2;

        case 116: // 't'
            return EDUCATION_TOOLTIP_PULSER;

        case 117: // 'u'
            return EDUCATION_TOOLTIP_POPUP;

        case 118: // 'v'
            return FPE_CREATE_FIRST_BOARD_MODAL;

        case 148: 
            return FPE_CREATE_FIRST_BOARD_RECS_LIST;

        case 119: // 'w'
            return FORCE_TOUCH_PEEK_PIN_CLOSEUP;

        case 120: // 'x'
            return FORCE_TOUCH_PEEK_PINS_COLLECTION;

        case 121: // 'y'
            return FORCE_TOUCH_PEEK_PROFILE;

        case 122: // 'z'
            return FORCE_TOUCH_PEEK_WEB_BROWSER;

        case 123: // '{'
            return PIN_CLOSEUP_ATTRIBUTION;

        case 124: // '|'
            return PIN_CLOSEUP_BASIC;

        case 125: // '}'
            return PIN_CLOSEUP_COMMERCE;

        case 126: // '~'
            return PIN_CLOSEUP_FOLLOW;

        case 127: // '\177'
            return PIN_CLOSEUP_GALLERY;

        case 128: 
            return PIN_CLOSEUP_IMAGE;

        case 129: 
            return PIN_CLOSEUP_LINK;

        case 130: 
            return PIN_CLOSEUP_MOVIE;

        case 131: 
            return PIN_CLOSEUP_PLACE;

        case 132: 
            return PIN_CLOSEUP_PRICE;

        case 133: 
            return PIN_CLOSEUP_PROMOTED;

        case 134: 
            return PIN_CLOSEUP_RECIPE;

        case 135: 
            return PIN_CLOSEUP_SOURCE_DESCRIPTION;

        case 136: 
            return PIN_CLOSEUP_SOURCE;

        case 137: 
            return PIN_CLOSEUP_STATS;

        case 138: 
            return PIN_CLOSEUP_TITLE;

        case 143: 
            return PIN_CLOSEUP_VARIANT_SELECTOR;

        case 13004: 
            return PIN_CLOSEUP_AGGREGATED;

        case 140: 
            return BOARD_RECOMMENDATION_DROPDOWN;

        case 141: 
            return PASSWORD_RESET_PAGE;

        case 142: 
            return SIMILAR_BOARDS;

        case 144: 
            return SHOP_SPACE_BANNER;

        case 145: 
            return SHOP_SPACE_TODAYS_PICKS;

        case 146: 
            return SHOP_SPACE_BUYABLE_CATEGORY;

        case 147: 
            return SHOP_SPACE_TOP_SHOPS;

        case 149: 
            return NUX_INTEREST_PICKER;

        case 150: 
            return COLD_NUX_USE_CASE_PICKER;

        case 151: 
            return COLD_NUX_USE_CASE_INTEREST_PICKER;

        case 152: 
            return COLD_NUX_INTERESTS_GIFTWRAP;

        case 153: 
            return SEND_SHARE;

        case 154: 
            return SEND_SHARE_SEARCH_CONTACT;

        case 10029: 
            return STERLING_CAMPAIGN_OBJECTIVES_CONTAINER;

        case 10030: 
            return STERLING_CAMPAIGN_OBJECTIVES_BUTTONS_BAR;

        case 10000: 
            return STERLING_PICK_A_PIN_GRID;

        case 10001: 
            return STERLING_PICK_A_PIN_SEGMENTED_CONTROLLER;

        case 10002: 
            return STERLING_PICK_A_PIN_SECTION_HEADER;

        case 10003: 
            return STERLING_PROMOTED_PIN_SPEC_FORM;

        case 10004: 
            return STERLING_TARGETING_TERMS_TABLE;

        case 10005: 
            return STERLING_TARGETING_SUMMARY;

        case 10006: 
            return STERLING_IMPORT_TERMS_MODAL;

        case 10027: 
            return STERLING_TERMS_DELIMITER_DROPDOWN;

        case 10007: 
            return STERLING_CAMPAIGN_SPEC_FORM;

        case 10008: 
            return STERLING_SETUP_DETAILS_BUTTONS_BAR;

        case 10009: 
            return STERLING_ADS_TOS;

        case 10010: 
            return STERLING_BILLING_FORM;

        case 10034: 
            return STERLING_BID_CONTAINER;

        case 10011: 
            return STERLING_BREADCRUMB_NAV;

        case 10012: 
            return STERLING_CAMPAIGN_DASHBOARD_HEADER;

        case 10013: 
            return STERLING_PIN_PROMOTION_DASHBOARD_HEADER;

        case 10014: 
            return STERLING_DASHBOARD_TABS;

        case 10015: 
            return STERLING_METRICS_GRAPH;

        case 10025: 
            return STERLING_DATE_PICKER;

        case 10028: 
            return STERLING_GRAPH_SERIES_DROPDOWN;

        case 10026: 
            return STERLING_OBJECTIVE_SUMMARY_STATS;

        case 10016: 
            return STERLING_OBJECTIVE_SUMMARY_STATS_ROW;

        case 10017: 
            return STERLING_PROMOTED_PIN_PERFORMANCE_TABLE;

        case 10018: 
            return STERLING_PINTEREST_GUIDE;

        case 10019: 
            return STERLING_ACCOUNT_DASHBOARD_HEADER;

        case 10020: 
            return STERLING_CONVERSION_TAG_DASHBOARD_HEADER;

        case 10021: 
            return STERLING_CONVERSION_TAG_TABLE_EMPTY_STATE;

        case 10022: 
            return STERLING_CONVERSION_TAG_TABLE_ROW;

        case 10023: 
            return STERLING_CONVERSION_TAG_CODE_SNIPPET_MODULE;

        case 10024: 
            return STERLING_CONVERSION_TAG_FORM_BUTTONS_BAR;

        case 10031: 
            return STERLING_NAV_REPORTS_MENU;

        case 10032: 
            return STERLING_NAV_TOOLS_MENU;

        case 10033: 
            return STERLING_NAV_RECENT_CAMPAIGNS_MENU;

        case 10040: 
            return STERLING_BULK_EDITOR_BUTTON_AREA;

        case 10041: 
            return STERLING_BULK_EDITOR_CREATE;

        case 10042: 
            return STERLING_BULK_EDITOR_EDIT;

        case 10043: 
            return STERLING_BULK_EDITOR_REVIEW;

        case 10038: 
            return CAMPBELL_NAV_DRAWER;

        case 10039: 
            return CAMPBELL_NAV_TOP_LINKS;

        case 11000: 
            return CSR_CLOSEUP;

        case 12000: 
            return DISCOVER_FRIEND_MERCHANDISING_INVITE_FRIENDS;

        case 12001: 
            return DISCOVER_FRIEND_MERCHANDISING_BOARD_RECS;

        case 12002: 
            return DISCOVER_FRIEND_MERCHANDISING_CONNECT_TO_FACEBOOK;

        case 12003: 
            return DISCOVER_FRIEND_MERCHANDISING_EMPTY_STATE;

        case 13000: 
            return LIBRARY_PROFILE_ALL_PINS;

        case 13001: 
            return LIBRARY_PROFILE_BOARD;

        case 13002: 
            return CONTEXTUAL_STORY;

        case 13003: 
            return SEARCH_HERO;
        }
    }

    public static ComponentType valueOf(String s)
    {
        return (ComponentType)Enum.valueOf(com/pinterest/schemas/event/ComponentType, s);
    }

    public static ComponentType[] values()
    {
        return (ComponentType[])$VALUES.clone();
    }

    public final int getValue()
    {
        return value;
    }

    static 
    {
        FLOWED_PIN = new ComponentType("FLOWED_PIN", 0, 0);
        FLOWED_BOARD = new ComponentType("FLOWED_BOARD", 1, 1);
        SUGGESTED_USERS = new ComponentType("SUGGESTED_USERS", 2, 2);
        NEWS_FEED = new ComponentType("NEWS_FEED", 3, 3);
        MODAL_PIN = new ComponentType("MODAL_PIN", 4, 4);
        MODAL_REPIN = new ComponentType("MODAL_REPIN", 5, 5);
        MODAL_POST_REPIN = new ComponentType("MODAL_POST_REPIN", 6, 6);
        MODAL_ADD_PIN = new ComponentType("MODAL_ADD_PIN", 7, 7);
        MODAL_CREATE_BOARD = new ComponentType("MODAL_CREATE_BOARD", 8, 12);
        MODAL_SEARCH_PRIVACY = new ComponentType("MODAL_SEARCH_PRIVACY", 9, 74);
        NAVIGATION = new ComponentType("NAVIGATION", 10, 8);
        MODAL_DIALOG = new ComponentType("MODAL_DIALOG", 11, 9);
        USER_FEED = new ComponentType("USER_FEED", 12, 10);
        FLOWED_CATEGORY = new ComponentType("FLOWED_CATEGORY", 13, 11);
        SHEET = new ComponentType("SHEET", 14, 13);
        EDUCATION = new ComponentType("EDUCATION", 15, 14);
        REGISTRATION = new ComponentType("REGISTRATION", 16, 15);
        ORIENTATION = new ComponentType("ORIENTATION", 17, 16);
        BROWSER = new ComponentType("BROWSER", 18, 17);
        CONTEXTUAL_MENU = new ComponentType("CONTEXTUAL_MENU", 19, 18);
        NAG = new ComponentType("NAG", 20, 19);
        TOAST = new ComponentType("TOAST", 21, 20);
        WIDGET_ACTION_BAR = new ComponentType("WIDGET_ACTION_BAR", 22, 21);
        WIDGET_HEADER = new ComponentType("WIDGET_HEADER", 23, 22);
        WIDGET_FOOTER = new ComponentType("WIDGET_FOOTER", 24, 23);
        HOMEFEED_INVITE_MODULE = new ComponentType("HOMEFEED_INVITE_MODULE", 25, 24);
        TRENDING_CATEGORIES = new ComponentType("TRENDING_CATEGORIES", 26, 25);
        MAP = new ComponentType("MAP", 27, 26);
        LIST_HEADER = new ComponentType("LIST_HEADER", 28, 27);
        USER_REPINS_FROM = new ComponentType("USER_REPINS_FROM", 29, 28);
        BOARD_PINS_GRID = new ComponentType("BOARD_PINS_GRID", 30, 29);
        DOMAIN = new ComponentType("DOMAIN", 31, 30);
        RELATED_BOARDS = new ComponentType("RELATED_BOARDS", 32, 31);
        SEARCH_RELATED_QUERIES = new ComponentType("SEARCH_RELATED_QUERIES", 33, 32);
        SEARCH_RELATED_CATEGORIES = new ComponentType("SEARCH_RELATED_CATEGORIES", 34, 33);
        USER_SELECT_SEARCH_BOX = new ComponentType("USER_SELECT_SEARCH_BOX", 35, 34);
        TYPEAHEAD_SUGGESTIONS = new ComponentType("TYPEAHEAD_SUGGESTIONS", 36, 35);
        INTEREST_GRID = new ComponentType("INTEREST_GRID", 37, 36);
        INTEREST_CAROUSEL = new ComponentType("INTEREST_CAROUSEL", 38, 40);
        INTEREST_RELATED_CAROUSEL = new ComponentType("INTEREST_RELATED_CAROUSEL", 39, 41);
        CATEGORIES_CAROUSEL = new ComponentType("CATEGORIES_CAROUSEL", 40, 42);
        SEARCH_BOX = new ComponentType("SEARCH_BOX", 41, 43);
        SEARCH_INTEREST_RESULTS_GRID = new ComponentType("SEARCH_INTEREST_RESULTS_GRID", 42, 44);
        BULK_INVITE = new ComponentType("BULK_INVITE", 43, 37);
        USER_NEWS = new ComponentType("USER_NEWS", 44, 38);
        RELATED_INTERESTS = new ComponentType("RELATED_INTERESTS", 45, 39);
        VISUAL_SEARCH_GRID = new ComponentType("VISUAL_SEARCH_GRID", 46, 45);
        USER_MENU_DROPDOWN = new ComponentType("USER_MENU_DROPDOWN", 47, 46);
        SEARCH_GUIDES_CONTAINER = new ComponentType("SEARCH_GUIDES_CONTAINER", 48, 47);
        STORIES_FEED = new ComponentType("STORIES_FEED", 49, 48);
        DISCOVER_FEATURED_CAROUSEL = new ComponentType("DISCOVER_FEATURED_CAROUSEL", 50, 49);
        PINNER_CAROUSEL = new ComponentType("PINNER_CAROUSEL", 51, 50);
        SEGMENTED_CONTROL = new ComponentType("SEGMENTED_CONTROL", 52, 51);
        CONTEXTUAL_USER_EDUCATION = new ComponentType("CONTEXTUAL_USER_EDUCATION", 53, 52);
        NAG_CLIPBOARD_URL = new ComponentType("NAG_CLIPBOARD_URL", 54, 53);
        NOTIFICATIONS_CONVERSATIONS_DROPDOWN = new ComponentType("NOTIFICATIONS_CONVERSATIONS_DROPDOWN", 55, 54);
        CONVERSATION_MESSAGES = new ComponentType("CONVERSATION_MESSAGES", 56, 55);
        SEND_OBJECT = new ComponentType("SEND_OBJECT", 57, 56);
        USER_EDUCATION_DROPDOWN = new ComponentType("USER_EDUCATION_DROPDOWN", 58, 57);
        PIN_FEEDBACK_DIALOG_PFY = new ComponentType("PIN_FEEDBACK_DIALOG_PFY", 59, 58);
        PIN_FEEDBACK_DIALOG_PFY_REASON = new ComponentType("PIN_FEEDBACK_DIALOG_PFY_REASON", 60, 59);
        PIN_FEEDBACK_DIALOG_PROMOTED = new ComponentType("PIN_FEEDBACK_DIALOG_PROMOTED", 61, 60);
        PIN_FEEDBACK_DIALOG_PROMOTED_REASON = new ComponentType("PIN_FEEDBACK_DIALOG_PROMOTED_REASON", 62, 61);
        PIN_FEEDBACK_PIN_CELL_HIDDEN_NO_REASON = new ComponentType("PIN_FEEDBACK_PIN_CELL_HIDDEN_NO_REASON", 63, 62);
        PIN_FEEDBACK_PIN_DIALOG_INTEREST = new ComponentType("PIN_FEEDBACK_PIN_DIALOG_INTEREST", 64, 100);
        DIGEST_STORY = new ComponentType("DIGEST_STORY", 65, 63);
        DIGEST_STORY_FEEDBACK_DIALOG = new ComponentType("DIGEST_STORY_FEEDBACK_DIALOG", 66, 71);
        DIGEST_STORY_HEADER = new ComponentType("DIGEST_STORY_HEADER", 67, 72);
        DIGEST_STORY_CELL = new ComponentType("DIGEST_STORY_CELL", 68, 73);
        DIGEST_STORY_CELL_CAROUSEL = new ComponentType("DIGEST_STORY_CELL_CAROUSEL", 69, 75);
        LOOKBOOK_FRAME = new ComponentType("LOOKBOOK_FRAME", 70, 64);
        LOOKBOOK_ACTION_BAR = new ComponentType("LOOKBOOK_ACTION_BAR", 71, 65);
        INTEREST_PICKER = new ComponentType("INTEREST_PICKER", 72, 66);
        SAFARI_KEYCHAIN_USE_PROMPT = new ComponentType("SAFARI_KEYCHAIN_USE_PROMPT", 73, 67);
        RELATED_PINS_GRID_ITEM = new ComponentType("RELATED_PINS_GRID_ITEM", 74, 68);
        BOARD_INFO_BAR = new ComponentType("BOARD_INFO_BAR", 75, 69);
        RELATED_PIN = new ComponentType("RELATED_PIN", 76, 70);
        FIND_FRIENDS_SOURCE_HEADER = new ComponentType("FIND_FRIENDS_SOURCE_HEADER", 77, 80);
        BRAND_SURVEY_DIALOG = new ComponentType("BRAND_SURVEY_DIALOG", 78, 81);
        CLOSEUP_NAV_BUTTON = new ComponentType("CLOSEUP_NAV_BUTTON", 79, 82);
        CLOSEUP_SHORTCUT_BUTTON = new ComponentType("CLOSEUP_SHORTCUT_BUTTON", 80, 83);
        PIN_CLOSEUP_TRANSITION_IMAGE = new ComponentType("PIN_CLOSEUP_TRANSITION_IMAGE", 81, 84);
        PIN_CLOSEUP_BODY = new ComponentType("PIN_CLOSEUP_BODY", 82, 85);
        PIN_CLOSEUP_RELATED_PINS = new ComponentType("PIN_CLOSEUP_RELATED_PINS", 83, 86);
        GOOGLE_APP_INDEXING_UNAUTH_PAGE = new ComponentType("GOOGLE_APP_INDEXING_UNAUTH_PAGE", 84, 91);
        DYNAMIC_GRID_STORY = new ComponentType("DYNAMIC_GRID_STORY", 85, 200);
        SHARE_EXTENSION_PICK_BOARD = new ComponentType("SHARE_EXTENSION_PICK_BOARD", 86, 90);
        SHARE_EXTENSION_IMAGE_PICKER = new ComponentType("SHARE_EXTENSION_IMAGE_PICKER", 87, 92);
        SHARE_EXTENSION_BOARD_PICKER = new ComponentType("SHARE_EXTENSION_BOARD_PICKER", 88, 97);
        SHARE_EXTENSION_BOARD_PICKER_NO_IMAGE_PICKER = new ComponentType("SHARE_EXTENSION_BOARD_PICKER_NO_IMAGE_PICKER", 89, 94);
        SHARE_EXTENSION_BOARD_CREATE = new ComponentType("SHARE_EXTENSION_BOARD_CREATE", 90, 95);
        SAVE_AUTOCOMPLETE = new ComponentType("SAVE_AUTOCOMPLETE", 91, 96);
        CLOSEUP_ZOOMED_GALLERY = new ComponentType("CLOSEUP_ZOOMED_GALLERY", 92, 93);
        COMMERCE_SEARCH_PRICE_FILTER = new ComponentType("COMMERCE_SEARCH_PRICE_FILTER", 93, 98);
        BUYABLE_PINS_CAROUSEL = new ComponentType("BUYABLE_PINS_CAROUSEL", 94, 99);
        CLOSEUP_INLINE_CAROUSEL = new ComponentType("CLOSEUP_INLINE_CAROUSEL", 95, 101);
        CLOSEUP_LINK_MODULE = new ComponentType("CLOSEUP_LINK_MODULE", 96, 102);
        FRIEND_CENTER_MODULE = new ComponentType("FRIEND_CENTER_MODULE", 97, 103);
        CLOSEUP_PLACE_MODULE = new ComponentType("CLOSEUP_PLACE_MODULE", 98, 104);
        PLACE_VIEW = new ComponentType("PLACE_VIEW", 99, 105);
        PLACE_VIEW_MAP = new ComponentType("PLACE_VIEW_MAP", 100, 106);
        PIN_FEEDBACK_DIALOG_FOLLOWING = new ComponentType("PIN_FEEDBACK_DIALOG_FOLLOWING", 101, 107);
        PIN_FEEDBACK_DIALOG_PFY_SURVEY_1 = new ComponentType("PIN_FEEDBACK_DIALOG_PFY_SURVEY_1", 102, 109);
        PIN_FEEDBACK_DIALOG_PFY_SURVEY_2 = new ComponentType("PIN_FEEDBACK_DIALOG_PFY_SURVEY_2", 103, 110);
        PIN_FEEDBACK_DIALOG_INTEREST = new ComponentType("PIN_FEEDBACK_DIALOG_INTEREST", 104, 111);
        PIN_FEEDBACK_DIALOG_SEARCH = new ComponentType("PIN_FEEDBACK_DIALOG_SEARCH", 105, 112);
        PIN_FEEDBACK_DIALOG_BOARD = new ComponentType("PIN_FEEDBACK_DIALOG_BOARD", 106, 113);
        PIN_FEEDBACK_DIALOG_PFY_NEW = new ComponentType("PIN_FEEDBACK_DIALOG_PFY_NEW", 107, 114);
        PIN_FEEDBACK_DIALOG_PROMOTED_NEW = new ComponentType("PIN_FEEDBACK_DIALOG_PROMOTED_NEW", 108, 115);
        PARTNER_PERFORMANCE_MODULE = new ComponentType("PARTNER_PERFORMANCE_MODULE", 109, 108);
        PARTNER_PERFORMANCE_MODULE_V2 = new ComponentType("PARTNER_PERFORMANCE_MODULE_V2", 110, 139);
        EDUCATION_TOOLTIP_PULSER = new ComponentType("EDUCATION_TOOLTIP_PULSER", 111, 116);
        EDUCATION_TOOLTIP_POPUP = new ComponentType("EDUCATION_TOOLTIP_POPUP", 112, 117);
        FPE_CREATE_FIRST_BOARD_MODAL = new ComponentType("FPE_CREATE_FIRST_BOARD_MODAL", 113, 118);
        FPE_CREATE_FIRST_BOARD_RECS_LIST = new ComponentType("FPE_CREATE_FIRST_BOARD_RECS_LIST", 114, 148);
        FORCE_TOUCH_PEEK_PIN_CLOSEUP = new ComponentType("FORCE_TOUCH_PEEK_PIN_CLOSEUP", 115, 119);
        FORCE_TOUCH_PEEK_PINS_COLLECTION = new ComponentType("FORCE_TOUCH_PEEK_PINS_COLLECTION", 116, 120);
        FORCE_TOUCH_PEEK_PROFILE = new ComponentType("FORCE_TOUCH_PEEK_PROFILE", 117, 121);
        FORCE_TOUCH_PEEK_WEB_BROWSER = new ComponentType("FORCE_TOUCH_PEEK_WEB_BROWSER", 118, 122);
        PIN_CLOSEUP_ATTRIBUTION = new ComponentType("PIN_CLOSEUP_ATTRIBUTION", 119, 123);
        PIN_CLOSEUP_BASIC = new ComponentType("PIN_CLOSEUP_BASIC", 120, 124);
        PIN_CLOSEUP_COMMERCE = new ComponentType("PIN_CLOSEUP_COMMERCE", 121, 125);
        PIN_CLOSEUP_FOLLOW = new ComponentType("PIN_CLOSEUP_FOLLOW", 122, 126);
        PIN_CLOSEUP_GALLERY = new ComponentType("PIN_CLOSEUP_GALLERY", 123, 127);
        PIN_CLOSEUP_IMAGE = new ComponentType("PIN_CLOSEUP_IMAGE", 124, 128);
        PIN_CLOSEUP_LINK = new ComponentType("PIN_CLOSEUP_LINK", 125, 129);
        PIN_CLOSEUP_MOVIE = new ComponentType("PIN_CLOSEUP_MOVIE", 126, 130);
        PIN_CLOSEUP_PLACE = new ComponentType("PIN_CLOSEUP_PLACE", 127, 131);
        PIN_CLOSEUP_PRICE = new ComponentType("PIN_CLOSEUP_PRICE", 128, 132);
        PIN_CLOSEUP_PROMOTED = new ComponentType("PIN_CLOSEUP_PROMOTED", 129, 133);
        PIN_CLOSEUP_RECIPE = new ComponentType("PIN_CLOSEUP_RECIPE", 130, 134);
        PIN_CLOSEUP_SOURCE_DESCRIPTION = new ComponentType("PIN_CLOSEUP_SOURCE_DESCRIPTION", 131, 135);
        PIN_CLOSEUP_SOURCE = new ComponentType("PIN_CLOSEUP_SOURCE", 132, 136);
        PIN_CLOSEUP_STATS = new ComponentType("PIN_CLOSEUP_STATS", 133, 137);
        PIN_CLOSEUP_TITLE = new ComponentType("PIN_CLOSEUP_TITLE", 134, 138);
        PIN_CLOSEUP_VARIANT_SELECTOR = new ComponentType("PIN_CLOSEUP_VARIANT_SELECTOR", 135, 143);
        PIN_CLOSEUP_AGGREGATED = new ComponentType("PIN_CLOSEUP_AGGREGATED", 136, 13004);
        BOARD_RECOMMENDATION_DROPDOWN = new ComponentType("BOARD_RECOMMENDATION_DROPDOWN", 137, 140);
        PASSWORD_RESET_PAGE = new ComponentType("PASSWORD_RESET_PAGE", 138, 141);
        SIMILAR_BOARDS = new ComponentType("SIMILAR_BOARDS", 139, 142);
        SHOP_SPACE_BANNER = new ComponentType("SHOP_SPACE_BANNER", 140, 144);
        SHOP_SPACE_TODAYS_PICKS = new ComponentType("SHOP_SPACE_TODAYS_PICKS", 141, 145);
        SHOP_SPACE_BUYABLE_CATEGORY = new ComponentType("SHOP_SPACE_BUYABLE_CATEGORY", 142, 146);
        SHOP_SPACE_TOP_SHOPS = new ComponentType("SHOP_SPACE_TOP_SHOPS", 143, 147);
        NUX_INTEREST_PICKER = new ComponentType("NUX_INTEREST_PICKER", 144, 149);
        COLD_NUX_USE_CASE_PICKER = new ComponentType("COLD_NUX_USE_CASE_PICKER", 145, 150);
        COLD_NUX_USE_CASE_INTEREST_PICKER = new ComponentType("COLD_NUX_USE_CASE_INTEREST_PICKER", 146, 151);
        COLD_NUX_INTERESTS_GIFTWRAP = new ComponentType("COLD_NUX_INTERESTS_GIFTWRAP", 147, 152);
        SEND_SHARE = new ComponentType("SEND_SHARE", 148, 153);
        SEND_SHARE_SEARCH_CONTACT = new ComponentType("SEND_SHARE_SEARCH_CONTACT", 149, 154);
        STERLING_CAMPAIGN_OBJECTIVES_CONTAINER = new ComponentType("STERLING_CAMPAIGN_OBJECTIVES_CONTAINER", 150, 10029);
        STERLING_CAMPAIGN_OBJECTIVES_BUTTONS_BAR = new ComponentType("STERLING_CAMPAIGN_OBJECTIVES_BUTTONS_BAR", 151, 10030);
        STERLING_PICK_A_PIN_GRID = new ComponentType("STERLING_PICK_A_PIN_GRID", 152, 10000);
        STERLING_PICK_A_PIN_SEGMENTED_CONTROLLER = new ComponentType("STERLING_PICK_A_PIN_SEGMENTED_CONTROLLER", 153, 10001);
        STERLING_PICK_A_PIN_SECTION_HEADER = new ComponentType("STERLING_PICK_A_PIN_SECTION_HEADER", 154, 10002);
        STERLING_PROMOTED_PIN_SPEC_FORM = new ComponentType("STERLING_PROMOTED_PIN_SPEC_FORM", 155, 10003);
        STERLING_TARGETING_TERMS_TABLE = new ComponentType("STERLING_TARGETING_TERMS_TABLE", 156, 10004);
        STERLING_TARGETING_SUMMARY = new ComponentType("STERLING_TARGETING_SUMMARY", 157, 10005);
        STERLING_IMPORT_TERMS_MODAL = new ComponentType("STERLING_IMPORT_TERMS_MODAL", 158, 10006);
        STERLING_TERMS_DELIMITER_DROPDOWN = new ComponentType("STERLING_TERMS_DELIMITER_DROPDOWN", 159, 10027);
        STERLING_CAMPAIGN_SPEC_FORM = new ComponentType("STERLING_CAMPAIGN_SPEC_FORM", 160, 10007);
        STERLING_SETUP_DETAILS_BUTTONS_BAR = new ComponentType("STERLING_SETUP_DETAILS_BUTTONS_BAR", 161, 10008);
        STERLING_ADS_TOS = new ComponentType("STERLING_ADS_TOS", 162, 10009);
        STERLING_BILLING_FORM = new ComponentType("STERLING_BILLING_FORM", 163, 10010);
        STERLING_BID_CONTAINER = new ComponentType("STERLING_BID_CONTAINER", 164, 10034);
        STERLING_BREADCRUMB_NAV = new ComponentType("STERLING_BREADCRUMB_NAV", 165, 10011);
        STERLING_CAMPAIGN_DASHBOARD_HEADER = new ComponentType("STERLING_CAMPAIGN_DASHBOARD_HEADER", 166, 10012);
        STERLING_PIN_PROMOTION_DASHBOARD_HEADER = new ComponentType("STERLING_PIN_PROMOTION_DASHBOARD_HEADER", 167, 10013);
        STERLING_DASHBOARD_TABS = new ComponentType("STERLING_DASHBOARD_TABS", 168, 10014);
        STERLING_METRICS_GRAPH = new ComponentType("STERLING_METRICS_GRAPH", 169, 10015);
        STERLING_DATE_PICKER = new ComponentType("STERLING_DATE_PICKER", 170, 10025);
        STERLING_GRAPH_SERIES_DROPDOWN = new ComponentType("STERLING_GRAPH_SERIES_DROPDOWN", 171, 10028);
        STERLING_OBJECTIVE_SUMMARY_STATS = new ComponentType("STERLING_OBJECTIVE_SUMMARY_STATS", 172, 10026);
        STERLING_OBJECTIVE_SUMMARY_STATS_ROW = new ComponentType("STERLING_OBJECTIVE_SUMMARY_STATS_ROW", 173, 10016);
        STERLING_PROMOTED_PIN_PERFORMANCE_TABLE = new ComponentType("STERLING_PROMOTED_PIN_PERFORMANCE_TABLE", 174, 10017);
        STERLING_PINTEREST_GUIDE = new ComponentType("STERLING_PINTEREST_GUIDE", 175, 10018);
        STERLING_ACCOUNT_DASHBOARD_HEADER = new ComponentType("STERLING_ACCOUNT_DASHBOARD_HEADER", 176, 10019);
        STERLING_CONVERSION_TAG_DASHBOARD_HEADER = new ComponentType("STERLING_CONVERSION_TAG_DASHBOARD_HEADER", 177, 10020);
        STERLING_CONVERSION_TAG_TABLE_EMPTY_STATE = new ComponentType("STERLING_CONVERSION_TAG_TABLE_EMPTY_STATE", 178, 10021);
        STERLING_CONVERSION_TAG_TABLE_ROW = new ComponentType("STERLING_CONVERSION_TAG_TABLE_ROW", 179, 10022);
        STERLING_CONVERSION_TAG_CODE_SNIPPET_MODULE = new ComponentType("STERLING_CONVERSION_TAG_CODE_SNIPPET_MODULE", 180, 10023);
        STERLING_CONVERSION_TAG_FORM_BUTTONS_BAR = new ComponentType("STERLING_CONVERSION_TAG_FORM_BUTTONS_BAR", 181, 10024);
        STERLING_NAV_REPORTS_MENU = new ComponentType("STERLING_NAV_REPORTS_MENU", 182, 10031);
        STERLING_NAV_TOOLS_MENU = new ComponentType("STERLING_NAV_TOOLS_MENU", 183, 10032);
        STERLING_NAV_RECENT_CAMPAIGNS_MENU = new ComponentType("STERLING_NAV_RECENT_CAMPAIGNS_MENU", 184, 10033);
        STERLING_BULK_EDITOR_BUTTON_AREA = new ComponentType("STERLING_BULK_EDITOR_BUTTON_AREA", 185, 10040);
        STERLING_BULK_EDITOR_CREATE = new ComponentType("STERLING_BULK_EDITOR_CREATE", 186, 10041);
        STERLING_BULK_EDITOR_EDIT = new ComponentType("STERLING_BULK_EDITOR_EDIT", 187, 10042);
        STERLING_BULK_EDITOR_REVIEW = new ComponentType("STERLING_BULK_EDITOR_REVIEW", 188, 10043);
        CAMPBELL_NAV_DRAWER = new ComponentType("CAMPBELL_NAV_DRAWER", 189, 10038);
        CAMPBELL_NAV_TOP_LINKS = new ComponentType("CAMPBELL_NAV_TOP_LINKS", 190, 10039);
        CSR_CLOSEUP = new ComponentType("CSR_CLOSEUP", 191, 11000);
        DISCOVER_FRIEND_MERCHANDISING_INVITE_FRIENDS = new ComponentType("DISCOVER_FRIEND_MERCHANDISING_INVITE_FRIENDS", 192, 12000);
        DISCOVER_FRIEND_MERCHANDISING_BOARD_RECS = new ComponentType("DISCOVER_FRIEND_MERCHANDISING_BOARD_RECS", 193, 12001);
        DISCOVER_FRIEND_MERCHANDISING_CONNECT_TO_FACEBOOK = new ComponentType("DISCOVER_FRIEND_MERCHANDISING_CONNECT_TO_FACEBOOK", 194, 12002);
        DISCOVER_FRIEND_MERCHANDISING_EMPTY_STATE = new ComponentType("DISCOVER_FRIEND_MERCHANDISING_EMPTY_STATE", 195, 12003);
        LIBRARY_PROFILE_ALL_PINS = new ComponentType("LIBRARY_PROFILE_ALL_PINS", 196, 13000);
        LIBRARY_PROFILE_BOARD = new ComponentType("LIBRARY_PROFILE_BOARD", 197, 13001);
        CONTEXTUAL_STORY = new ComponentType("CONTEXTUAL_STORY", 198, 13002);
        SEARCH_HERO = new ComponentType("SEARCH_HERO", 199, 13003);
        $VALUES = (new ComponentType[] {
            FLOWED_PIN, FLOWED_BOARD, SUGGESTED_USERS, NEWS_FEED, MODAL_PIN, MODAL_REPIN, MODAL_POST_REPIN, MODAL_ADD_PIN, MODAL_CREATE_BOARD, MODAL_SEARCH_PRIVACY, 
            NAVIGATION, MODAL_DIALOG, USER_FEED, FLOWED_CATEGORY, SHEET, EDUCATION, REGISTRATION, ORIENTATION, BROWSER, CONTEXTUAL_MENU, 
            NAG, TOAST, WIDGET_ACTION_BAR, WIDGET_HEADER, WIDGET_FOOTER, HOMEFEED_INVITE_MODULE, TRENDING_CATEGORIES, MAP, LIST_HEADER, USER_REPINS_FROM, 
            BOARD_PINS_GRID, DOMAIN, RELATED_BOARDS, SEARCH_RELATED_QUERIES, SEARCH_RELATED_CATEGORIES, USER_SELECT_SEARCH_BOX, TYPEAHEAD_SUGGESTIONS, INTEREST_GRID, INTEREST_CAROUSEL, INTEREST_RELATED_CAROUSEL, 
            CATEGORIES_CAROUSEL, SEARCH_BOX, SEARCH_INTEREST_RESULTS_GRID, BULK_INVITE, USER_NEWS, RELATED_INTERESTS, VISUAL_SEARCH_GRID, USER_MENU_DROPDOWN, SEARCH_GUIDES_CONTAINER, STORIES_FEED, 
            DISCOVER_FEATURED_CAROUSEL, PINNER_CAROUSEL, SEGMENTED_CONTROL, CONTEXTUAL_USER_EDUCATION, NAG_CLIPBOARD_URL, NOTIFICATIONS_CONVERSATIONS_DROPDOWN, CONVERSATION_MESSAGES, SEND_OBJECT, USER_EDUCATION_DROPDOWN, PIN_FEEDBACK_DIALOG_PFY, 
            PIN_FEEDBACK_DIALOG_PFY_REASON, PIN_FEEDBACK_DIALOG_PROMOTED, PIN_FEEDBACK_DIALOG_PROMOTED_REASON, PIN_FEEDBACK_PIN_CELL_HIDDEN_NO_REASON, PIN_FEEDBACK_PIN_DIALOG_INTEREST, DIGEST_STORY, DIGEST_STORY_FEEDBACK_DIALOG, DIGEST_STORY_HEADER, DIGEST_STORY_CELL, DIGEST_STORY_CELL_CAROUSEL, 
            LOOKBOOK_FRAME, LOOKBOOK_ACTION_BAR, INTEREST_PICKER, SAFARI_KEYCHAIN_USE_PROMPT, RELATED_PINS_GRID_ITEM, BOARD_INFO_BAR, RELATED_PIN, FIND_FRIENDS_SOURCE_HEADER, BRAND_SURVEY_DIALOG, CLOSEUP_NAV_BUTTON, 
            CLOSEUP_SHORTCUT_BUTTON, PIN_CLOSEUP_TRANSITION_IMAGE, PIN_CLOSEUP_BODY, PIN_CLOSEUP_RELATED_PINS, GOOGLE_APP_INDEXING_UNAUTH_PAGE, DYNAMIC_GRID_STORY, SHARE_EXTENSION_PICK_BOARD, SHARE_EXTENSION_IMAGE_PICKER, SHARE_EXTENSION_BOARD_PICKER, SHARE_EXTENSION_BOARD_PICKER_NO_IMAGE_PICKER, 
            SHARE_EXTENSION_BOARD_CREATE, SAVE_AUTOCOMPLETE, CLOSEUP_ZOOMED_GALLERY, COMMERCE_SEARCH_PRICE_FILTER, BUYABLE_PINS_CAROUSEL, CLOSEUP_INLINE_CAROUSEL, CLOSEUP_LINK_MODULE, FRIEND_CENTER_MODULE, CLOSEUP_PLACE_MODULE, PLACE_VIEW, 
            PLACE_VIEW_MAP, PIN_FEEDBACK_DIALOG_FOLLOWING, PIN_FEEDBACK_DIALOG_PFY_SURVEY_1, PIN_FEEDBACK_DIALOG_PFY_SURVEY_2, PIN_FEEDBACK_DIALOG_INTEREST, PIN_FEEDBACK_DIALOG_SEARCH, PIN_FEEDBACK_DIALOG_BOARD, PIN_FEEDBACK_DIALOG_PFY_NEW, PIN_FEEDBACK_DIALOG_PROMOTED_NEW, PARTNER_PERFORMANCE_MODULE, 
            PARTNER_PERFORMANCE_MODULE_V2, EDUCATION_TOOLTIP_PULSER, EDUCATION_TOOLTIP_POPUP, FPE_CREATE_FIRST_BOARD_MODAL, FPE_CREATE_FIRST_BOARD_RECS_LIST, FORCE_TOUCH_PEEK_PIN_CLOSEUP, FORCE_TOUCH_PEEK_PINS_COLLECTION, FORCE_TOUCH_PEEK_PROFILE, FORCE_TOUCH_PEEK_WEB_BROWSER, PIN_CLOSEUP_ATTRIBUTION, 
            PIN_CLOSEUP_BASIC, PIN_CLOSEUP_COMMERCE, PIN_CLOSEUP_FOLLOW, PIN_CLOSEUP_GALLERY, PIN_CLOSEUP_IMAGE, PIN_CLOSEUP_LINK, PIN_CLOSEUP_MOVIE, PIN_CLOSEUP_PLACE, PIN_CLOSEUP_PRICE, PIN_CLOSEUP_PROMOTED, 
            PIN_CLOSEUP_RECIPE, PIN_CLOSEUP_SOURCE_DESCRIPTION, PIN_CLOSEUP_SOURCE, PIN_CLOSEUP_STATS, PIN_CLOSEUP_TITLE, PIN_CLOSEUP_VARIANT_SELECTOR, PIN_CLOSEUP_AGGREGATED, BOARD_RECOMMENDATION_DROPDOWN, PASSWORD_RESET_PAGE, SIMILAR_BOARDS, 
            SHOP_SPACE_BANNER, SHOP_SPACE_TODAYS_PICKS, SHOP_SPACE_BUYABLE_CATEGORY, SHOP_SPACE_TOP_SHOPS, NUX_INTEREST_PICKER, COLD_NUX_USE_CASE_PICKER, COLD_NUX_USE_CASE_INTEREST_PICKER, COLD_NUX_INTERESTS_GIFTWRAP, SEND_SHARE, SEND_SHARE_SEARCH_CONTACT, 
            STERLING_CAMPAIGN_OBJECTIVES_CONTAINER, STERLING_CAMPAIGN_OBJECTIVES_BUTTONS_BAR, STERLING_PICK_A_PIN_GRID, STERLING_PICK_A_PIN_SEGMENTED_CONTROLLER, STERLING_PICK_A_PIN_SECTION_HEADER, STERLING_PROMOTED_PIN_SPEC_FORM, STERLING_TARGETING_TERMS_TABLE, STERLING_TARGETING_SUMMARY, STERLING_IMPORT_TERMS_MODAL, STERLING_TERMS_DELIMITER_DROPDOWN, 
            STERLING_CAMPAIGN_SPEC_FORM, STERLING_SETUP_DETAILS_BUTTONS_BAR, STERLING_ADS_TOS, STERLING_BILLING_FORM, STERLING_BID_CONTAINER, STERLING_BREADCRUMB_NAV, STERLING_CAMPAIGN_DASHBOARD_HEADER, STERLING_PIN_PROMOTION_DASHBOARD_HEADER, STERLING_DASHBOARD_TABS, STERLING_METRICS_GRAPH, 
            STERLING_DATE_PICKER, STERLING_GRAPH_SERIES_DROPDOWN, STERLING_OBJECTIVE_SUMMARY_STATS, STERLING_OBJECTIVE_SUMMARY_STATS_ROW, STERLING_PROMOTED_PIN_PERFORMANCE_TABLE, STERLING_PINTEREST_GUIDE, STERLING_ACCOUNT_DASHBOARD_HEADER, STERLING_CONVERSION_TAG_DASHBOARD_HEADER, STERLING_CONVERSION_TAG_TABLE_EMPTY_STATE, STERLING_CONVERSION_TAG_TABLE_ROW, 
            STERLING_CONVERSION_TAG_CODE_SNIPPET_MODULE, STERLING_CONVERSION_TAG_FORM_BUTTONS_BAR, STERLING_NAV_REPORTS_MENU, STERLING_NAV_TOOLS_MENU, STERLING_NAV_RECENT_CAMPAIGNS_MENU, STERLING_BULK_EDITOR_BUTTON_AREA, STERLING_BULK_EDITOR_CREATE, STERLING_BULK_EDITOR_EDIT, STERLING_BULK_EDITOR_REVIEW, CAMPBELL_NAV_DRAWER, 
            CAMPBELL_NAV_TOP_LINKS, CSR_CLOSEUP, DISCOVER_FRIEND_MERCHANDISING_INVITE_FRIENDS, DISCOVER_FRIEND_MERCHANDISING_BOARD_RECS, DISCOVER_FRIEND_MERCHANDISING_CONNECT_TO_FACEBOOK, DISCOVER_FRIEND_MERCHANDISING_EMPTY_STATE, LIBRARY_PROFILE_ALL_PINS, LIBRARY_PROFILE_BOARD, CONTEXTUAL_STORY, SEARCH_HERO
        });
    }
}
