// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.analytics.f;


public final class a extends Enum
{

    private static final a $VALUES[];
    public static final a ADD_CONTACT_BY_PHONE_ACTIVITY_NAME;
    public static final a ADD_LOCATION_CATEGORY_MODULE;
    public static final a ADD_LOCATION_MODULE;
    public static final a ADD_MEMBERS_ACTIVITY_NAME;
    public static final a APPLICATION_SETTINGS;
    public static final a APP_CENTER_BROWSE;
    public static final a APP_CENTER_DETAIL;
    public static final a AUDIO_RECORD_ACTIVITY_NAME;
    public static final a CAMERA_MODULE;
    public static final a CAMERA_REIVEW_AND_TAG_VIEW;
    public static final a CANONICAL_THREAD_HANDLER_ACTIVITY_NAME;
    public static final a COMPOSER;
    public static final a CONFIRM_PHONE_NUMBER_ACTIVITY_NAME;
    public static final a CONTACT_PICKER_IDENTITY_CHOOSER_ACTIVITY_NAME;
    public static final a CREATE_BROADCAST_ACTIVITY_NAME;
    public static final a CREATE_THREAD_ACTIVITY_NAME;
    public static final a DASH_ACTIVITY_NAME;
    public static final a DASH_SPLASH_ANALYTICS_NAME;
    public static final a DELETE_MESSAGES_ACTIVITY_NAME;
    public static final a DELETE_THREAD_ACTIVITY_NAME;
    public static final a EDIT_MESSAGING_FAVORITES_ACTIVITY;
    public static final a ENTER_PHONE_NUMBER_ACTIVITY_NAME;
    public static final a FACEWEB_ACTIVITY;
    public static final a FB4A_SPLASH_SCREEN_ACTIVITY;
    public static final a FIRST_PARTY_SSO_ACTIVITY_NAME;
    public static final a FRIENDS_SEARCH_VIEW;
    public static final a GROUP;
    public static final a IMAGE_SEARCH_ACTIVITY_NAME;
    public static final a LEAVE_THREAD_ACTIVITY_NAME;
    public static final a LOGIN_ACTIVITY;
    public static final a LOGIN_APPROVAL_ACTIVITY_NAME;
    public static final a LOGIN_SCREEN_ACTIVITY_NAME;
    public static final a MEDIA_PICKER_ACTIVITY_NAME;
    public static final a MEMBER_ACTIVITY_NAME;
    public static final a MESSAGE_VIEW_ACTIVITY_NAME;
    public static final a MULTI_FRIEND_SELECTOR_MODULE;
    public static final a MULTI_GROUP_MEMBER_SELECTOR_MODULE;
    public static final a NEARBY_ACTIVITY_VIEW;
    public static final a NEWSFEED;
    public static final a NOTIFICATIONS_VIEW;
    public static final a NUX_ACTIVITY_NAME;
    public static final a ORCA_ADVANCED_PREFERENCE_ACTIVITY_NAME;
    public static final a ORCA_CONTACTS_PREFERENCE_ACTIVITY_NAME;
    public static final a ORCA_INTERNAL_PREFERENCE_ACTIVITY_NAME;
    public static final a ORCA_LOGOUT_ACTIVITY;
    public static final a ORCA_PREFERENCE_ACTIVITY_NAME;
    public static final a ORCA_ROOT_PREFERENCE_ACTIVITY_NAME;
    public static final a ORCA_TESTER_PREFERENCE_ACTIVITY_NAME;
    public static final a PAGE_ADMIN_MODULE_NAME;
    public static final a PAGE_CHILD_LOCATION_LIST_ACTIVITY;
    public static final a PAGE_EVENTS_LIST_ACTIVITY;
    public static final a PAGE_FRIENDS_INFO_LIST;
    public static final a PAGE_INFOMATION;
    public static final a PAGE_MENU;
    public static final a PAGE_MODULE_NAME;
    public static final a PAGE_NATIVE_TIMELINE_MODULE_NAME;
    public static final a PAGE_PHOTOS_BY_FRIENDS;
    public static final a PAGE_RECOMMANDATION_LIST;
    public static final a PAGE_RECOMMENDATION;
    public static final a PHOTOS_TABS;
    public static final a PHOTO_ALBUM;
    public static final a PHOTO_ALBUMS_VIEW;
    public static final a PHOTO_GALLERY_VIEWER;
    public static final a PHOTO_VIEW_ACTIVITY_NAME;
    public static final a RECOMMENDATIONS_MODULE_NAME;
    public static final a REMOVE_MEMBER_ACTIVITY_NAME;
    public static final a RESEND_MESSAGE_ACTIVITY_NAME;
    public static final a SEARCH_MODULE_NAME;
    public static final a SET_COVER_PHOTO;
    public static final a SHARE_LAUNCHER_ACTIVITY_NAME;
    public static final a SILENT_LOGIN_ACTIVITY_NAME;
    public static final a SPLASH_SCREEN_ACTIVITY;
    public static final a START_SCREEN_ACTIVITY_NAME;
    public static final a START_THREAD_ACTIVITY_NAME;
    public static final a STORY_VIEW;
    public static final a TAG_LOCATION_MODULE;
    public static final a THREAD_ICON_PICKER_ACTIVITY_NAME;
    public static final a THREAD_LIST_ACTIVITY_NAME;
    public static final a THREAD_VIEW_ACTIVITY_NAME;
    public static final a THREAD_VIEW_MAP_ACTIVITY_NAME;
    public static final a TIMELINE;
    public static final a TIMELINE_COLLECTIONS_COLLECTION;
    public static final a TIMELINE_COLLECTIONS_SECTION;
    public static final a TIMELINE_COLLECTIONS_SUMMARY;
    public static final a UBERBAR_ACTIVITY_NAME;
    public static final a UNKNOWN;
    public static final a UPGRADE_SCREEN_ACTIVITY_NAME;
    public static final a WILDFIRE_REG_NAME_ACTIVITY_NAME;
    public static final a WILDFIRE_REG_PHONE_NUMBER_ACTIVITY_NAME;
    public static final a WILDFIRE_REG_SMS_CODE_ACTIVITY_NAME;
    public static final a WILDFIRE_REG_START_ACTIVITY_NAME;
    public static final a ZERO_EXTRA_CHARGES_DIALOG;
    private final String mName;

    private a(String s, int i, String s1)
    {
        super(s, i);
        mName = s1;
    }

    public static a valueOf(String s)
    {
        return (a)Enum.valueOf(com/facebook/analytics/f/a, s);
    }

    public static a[] values()
    {
        return (a[])$VALUES.clone();
    }

    public String toString()
    {
        return mName;
    }

    static 
    {
        UNKNOWN = new a("UNKNOWN", 0, "unknown");
        FB4A_SPLASH_SCREEN_ACTIVITY = new a("FB4A_SPLASH_SCREEN_ACTIVITY", 1, "fb4a_splash_screen");
        LOGIN_ACTIVITY = new a("LOGIN_ACTIVITY", 2, "login_screen");
        NEARBY_ACTIVITY_VIEW = new a("NEARBY_ACTIVITY_VIEW", 3, "nearby_activity_view");
        PHOTO_ALBUM = new a("PHOTO_ALBUM", 4, "photos_album");
        PHOTOS_TABS = new a("PHOTOS_TABS", 5, "photos_tabs");
        APPLICATION_SETTINGS = new a("APPLICATION_SETTINGS", 6, "app_settings");
        COMPOSER = new a("COMPOSER", 7, "composer");
        CAMERA_MODULE = new a("CAMERA_MODULE", 8, "camera");
        APP_CENTER_BROWSE = new a("APP_CENTER_BROWSE", 9, "app_center_browse");
        APP_CENTER_DETAIL = new a("APP_CENTER_DETAIL", 10, "app_center_detail");
        CAMERA_REIVEW_AND_TAG_VIEW = new a("CAMERA_REIVEW_AND_TAG_VIEW", 11, "photo_tag_friends");
        TAG_LOCATION_MODULE = new a("TAG_LOCATION_MODULE", 12, "tag_places_view");
        ADD_LOCATION_MODULE = new a("ADD_LOCATION_MODULE", 13, "add_location_module");
        ADD_LOCATION_CATEGORY_MODULE = new a("ADD_LOCATION_CATEGORY_MODULE", 14, "add_location_category_module");
        MULTI_FRIEND_SELECTOR_MODULE = new a("MULTI_FRIEND_SELECTOR_MODULE", 15, "select_friends_view");
        MULTI_GROUP_MEMBER_SELECTOR_MODULE = new a("MULTI_GROUP_MEMBER_SELECTOR_MODULE", 16, "select_group_members_view");
        NOTIFICATIONS_VIEW = new a("NOTIFICATIONS_VIEW", 17, "notifications_view");
        FACEWEB_ACTIVITY = new a("FACEWEB_ACTIVITY", 18, "faceweb_view");
        RECOMMENDATIONS_MODULE_NAME = new a("RECOMMENDATIONS_MODULE_NAME", 19, "places_recommendations");
        SEARCH_MODULE_NAME = new a("SEARCH_MODULE_NAME", 20, "places_search");
        FRIENDS_SEARCH_VIEW = new a("FRIENDS_SEARCH_VIEW", 21, "friends_view");
        PAGE_PHOTOS_BY_FRIENDS = new a("PAGE_PHOTOS_BY_FRIENDS", 22, "page_photos_by_friends");
        ADD_CONTACT_BY_PHONE_ACTIVITY_NAME = new a("ADD_CONTACT_BY_PHONE_ACTIVITY_NAME", 23, "add_contact_by_phone");
        PHOTO_VIEW_ACTIVITY_NAME = new a("PHOTO_VIEW_ACTIVITY_NAME", 24, "photo");
        PHOTO_ALBUMS_VIEW = new a("PHOTO_ALBUMS_VIEW", 25, "photos_albums_view");
        CONTACT_PICKER_IDENTITY_CHOOSER_ACTIVITY_NAME = new a("CONTACT_PICKER_IDENTITY_CHOOSER_ACTIVITY_NAME", 26, "cp_chooser");
        MEMBER_ACTIVITY_NAME = new a("MEMBER_ACTIVITY_NAME", 27, "member");
        ENTER_PHONE_NUMBER_ACTIVITY_NAME = new a("ENTER_PHONE_NUMBER_ACTIVITY_NAME", 28, "enter_phone");
        THREAD_LIST_ACTIVITY_NAME = new a("THREAD_LIST_ACTIVITY_NAME", 29, "thread_list");
        THREAD_VIEW_ACTIVITY_NAME = new a("THREAD_VIEW_ACTIVITY_NAME", 30, "thread_view");
        CREATE_THREAD_ACTIVITY_NAME = new a("CREATE_THREAD_ACTIVITY_NAME", 31, "create_thread");
        START_THREAD_ACTIVITY_NAME = new a("START_THREAD_ACTIVITY_NAME", 32, "start_thread");
        AUDIO_RECORD_ACTIVITY_NAME = new a("AUDIO_RECORD_ACTIVITY_NAME", 33, "audio_record");
        CONFIRM_PHONE_NUMBER_ACTIVITY_NAME = new a("CONFIRM_PHONE_NUMBER_ACTIVITY_NAME", 34, "confirm_phone");
        START_SCREEN_ACTIVITY_NAME = new a("START_SCREEN_ACTIVITY_NAME", 35, "start_screen");
        FIRST_PARTY_SSO_ACTIVITY_NAME = new a("FIRST_PARTY_SSO_ACTIVITY_NAME", 36, "login_sso");
        SILENT_LOGIN_ACTIVITY_NAME = new a("SILENT_LOGIN_ACTIVITY_NAME", 37, "login_silent");
        WILDFIRE_REG_START_ACTIVITY_NAME = new a("WILDFIRE_REG_START_ACTIVITY_NAME", 38, "wildfire_reg");
        WILDFIRE_REG_NAME_ACTIVITY_NAME = new a("WILDFIRE_REG_NAME_ACTIVITY_NAME", 39, "wildfire_reg_name");
        WILDFIRE_REG_PHONE_NUMBER_ACTIVITY_NAME = new a("WILDFIRE_REG_PHONE_NUMBER_ACTIVITY_NAME", 40, "wildfire_reg_phone_number");
        WILDFIRE_REG_SMS_CODE_ACTIVITY_NAME = new a("WILDFIRE_REG_SMS_CODE_ACTIVITY_NAME", 41, "wildfire_reg_sms_code");
        SPLASH_SCREEN_ACTIVITY = new a("SPLASH_SCREEN_ACTIVITY", 42, "splash_screen");
        UPGRADE_SCREEN_ACTIVITY_NAME = new a("UPGRADE_SCREEN_ACTIVITY_NAME", 43, "upgrade_screen");
        LOGIN_APPROVAL_ACTIVITY_NAME = new a("LOGIN_APPROVAL_ACTIVITY_NAME", 44, "login_approval");
        LOGIN_SCREEN_ACTIVITY_NAME = new a("LOGIN_SCREEN_ACTIVITY_NAME", 45, "login_screen");
        ADD_MEMBERS_ACTIVITY_NAME = new a("ADD_MEMBERS_ACTIVITY_NAME", 46, "add_members");
        SHARE_LAUNCHER_ACTIVITY_NAME = new a("SHARE_LAUNCHER_ACTIVITY_NAME", 47, "share_launcher");
        CANONICAL_THREAD_HANDLER_ACTIVITY_NAME = new a("CANONICAL_THREAD_HANDLER_ACTIVITY_NAME", 48, "canonical_thread_handler");
        DELETE_MESSAGES_ACTIVITY_NAME = new a("DELETE_MESSAGES_ACTIVITY_NAME", 49, "delete_messages");
        REMOVE_MEMBER_ACTIVITY_NAME = new a("REMOVE_MEMBER_ACTIVITY_NAME", 50, "remove_member");
        RESEND_MESSAGE_ACTIVITY_NAME = new a("RESEND_MESSAGE_ACTIVITY_NAME", 51, "resend_message");
        DELETE_THREAD_ACTIVITY_NAME = new a("DELETE_THREAD_ACTIVITY_NAME", 52, "delete_thread");
        LEAVE_THREAD_ACTIVITY_NAME = new a("LEAVE_THREAD_ACTIVITY_NAME", 53, "leave_thread");
        IMAGE_SEARCH_ACTIVITY_NAME = new a("IMAGE_SEARCH_ACTIVITY_NAME", 54, "image_search");
        THREAD_VIEW_MAP_ACTIVITY_NAME = new a("THREAD_VIEW_MAP_ACTIVITY_NAME", 55, "thread_view_map");
        THREAD_ICON_PICKER_ACTIVITY_NAME = new a("THREAD_ICON_PICKER_ACTIVITY_NAME", 56, "thread_icon");
        ORCA_ADVANCED_PREFERENCE_ACTIVITY_NAME = new a("ORCA_ADVANCED_PREFERENCE_ACTIVITY_NAME", 57, "prefs_advanced");
        ORCA_CONTACTS_PREFERENCE_ACTIVITY_NAME = new a("ORCA_CONTACTS_PREFERENCE_ACTIVITY_NAME", 58, "prefs_contacts");
        ORCA_INTERNAL_PREFERENCE_ACTIVITY_NAME = new a("ORCA_INTERNAL_PREFERENCE_ACTIVITY_NAME", 59, "prefs_internal");
        ORCA_TESTER_PREFERENCE_ACTIVITY_NAME = new a("ORCA_TESTER_PREFERENCE_ACTIVITY_NAME", 60, "prefs_tester");
        ORCA_ROOT_PREFERENCE_ACTIVITY_NAME = new a("ORCA_ROOT_PREFERENCE_ACTIVITY_NAME", 61, "prefs_root");
        ORCA_PREFERENCE_ACTIVITY_NAME = new a("ORCA_PREFERENCE_ACTIVITY_NAME", 62, "about");
        NUX_ACTIVITY_NAME = new a("NUX_ACTIVITY_NAME", 63, "nux");
        ORCA_LOGOUT_ACTIVITY = new a("ORCA_LOGOUT_ACTIVITY", 64, "logout");
        EDIT_MESSAGING_FAVORITES_ACTIVITY = new a("EDIT_MESSAGING_FAVORITES_ACTIVITY", 65, "edit_messaging_favorites");
        TIMELINE = new a("TIMELINE", 66, "timeline");
        TIMELINE_COLLECTIONS_SUMMARY = new a("TIMELINE_COLLECTIONS_SUMMARY", 67, "collections_overview");
        TIMELINE_COLLECTIONS_SECTION = new a("TIMELINE_COLLECTIONS_SECTION", 68, "collections_section");
        TIMELINE_COLLECTIONS_COLLECTION = new a("TIMELINE_COLLECTIONS_COLLECTION", 69, "collections_collection");
        SET_COVER_PHOTO = new a("SET_COVER_PHOTO", 70, "set_cover_photo");
        NEWSFEED = new a("NEWSFEED", 71, "newsfeed");
        GROUP = new a("GROUP", 72, "group");
        STORY_VIEW = new a("STORY_VIEW", 73, "story_view");
        PHOTO_GALLERY_VIEWER = new a("PHOTO_GALLERY_VIEWER", 74, "photo_viewer");
        CREATE_BROADCAST_ACTIVITY_NAME = new a("CREATE_BROADCAST_ACTIVITY_NAME", 75, "create_broadcast");
        MEDIA_PICKER_ACTIVITY_NAME = new a("MEDIA_PICKER_ACTIVITY_NAME", 76, "media_picker");
        UBERBAR_ACTIVITY_NAME = new a("UBERBAR_ACTIVITY_NAME", 77, "sidebar_search");
        DASH_ACTIVITY_NAME = new a("DASH_ACTIVITY_NAME", 78, "dash");
        DASH_SPLASH_ANALYTICS_NAME = new a("DASH_SPLASH_ANALYTICS_NAME", 79, "dash_splash_screen");
        PAGE_MODULE_NAME = new a("PAGE_MODULE_NAME", 80, "pages_public_view");
        PAGE_ADMIN_MODULE_NAME = new a("PAGE_ADMIN_MODULE_NAME", 81, "pages_admin_panel");
        PAGE_NATIVE_TIMELINE_MODULE_NAME = new a("PAGE_NATIVE_TIMELINE_MODULE_NAME", 82, "page_native_timeline");
        PAGE_CHILD_LOCATION_LIST_ACTIVITY = new a("PAGE_CHILD_LOCATION_LIST_ACTIVITY", 83, "page_child_locations_list_activity");
        PAGE_EVENTS_LIST_ACTIVITY = new a("PAGE_EVENTS_LIST_ACTIVITY", 84, "page_events_list_activity");
        PAGE_INFOMATION = new a("PAGE_INFOMATION", 85, "page_information");
        PAGE_MENU = new a("PAGE_MENU", 86, "page_menu");
        PAGE_RECOMMENDATION = new a("PAGE_RECOMMENDATION", 87, "page_recommendation");
        PAGE_RECOMMANDATION_LIST = new a("PAGE_RECOMMANDATION_LIST", 88, "page_recommendation_list");
        PAGE_FRIENDS_INFO_LIST = new a("PAGE_FRIENDS_INFO_LIST", 89, "page_friends_info_list");
        MESSAGE_VIEW_ACTIVITY_NAME = new a("MESSAGE_VIEW_ACTIVITY_NAME", 90, "message");
        ZERO_EXTRA_CHARGES_DIALOG = new a("ZERO_EXTRA_CHARGES_DIALOG", 91, "zero_extra_charges_dialog");
        $VALUES = (new a[] {
            UNKNOWN, FB4A_SPLASH_SCREEN_ACTIVITY, LOGIN_ACTIVITY, NEARBY_ACTIVITY_VIEW, PHOTO_ALBUM, PHOTOS_TABS, APPLICATION_SETTINGS, COMPOSER, CAMERA_MODULE, APP_CENTER_BROWSE, 
            APP_CENTER_DETAIL, CAMERA_REIVEW_AND_TAG_VIEW, TAG_LOCATION_MODULE, ADD_LOCATION_MODULE, ADD_LOCATION_CATEGORY_MODULE, MULTI_FRIEND_SELECTOR_MODULE, MULTI_GROUP_MEMBER_SELECTOR_MODULE, NOTIFICATIONS_VIEW, FACEWEB_ACTIVITY, RECOMMENDATIONS_MODULE_NAME, 
            SEARCH_MODULE_NAME, FRIENDS_SEARCH_VIEW, PAGE_PHOTOS_BY_FRIENDS, ADD_CONTACT_BY_PHONE_ACTIVITY_NAME, PHOTO_VIEW_ACTIVITY_NAME, PHOTO_ALBUMS_VIEW, CONTACT_PICKER_IDENTITY_CHOOSER_ACTIVITY_NAME, MEMBER_ACTIVITY_NAME, ENTER_PHONE_NUMBER_ACTIVITY_NAME, THREAD_LIST_ACTIVITY_NAME, 
            THREAD_VIEW_ACTIVITY_NAME, CREATE_THREAD_ACTIVITY_NAME, START_THREAD_ACTIVITY_NAME, AUDIO_RECORD_ACTIVITY_NAME, CONFIRM_PHONE_NUMBER_ACTIVITY_NAME, START_SCREEN_ACTIVITY_NAME, FIRST_PARTY_SSO_ACTIVITY_NAME, SILENT_LOGIN_ACTIVITY_NAME, WILDFIRE_REG_START_ACTIVITY_NAME, WILDFIRE_REG_NAME_ACTIVITY_NAME, 
            WILDFIRE_REG_PHONE_NUMBER_ACTIVITY_NAME, WILDFIRE_REG_SMS_CODE_ACTIVITY_NAME, SPLASH_SCREEN_ACTIVITY, UPGRADE_SCREEN_ACTIVITY_NAME, LOGIN_APPROVAL_ACTIVITY_NAME, LOGIN_SCREEN_ACTIVITY_NAME, ADD_MEMBERS_ACTIVITY_NAME, SHARE_LAUNCHER_ACTIVITY_NAME, CANONICAL_THREAD_HANDLER_ACTIVITY_NAME, DELETE_MESSAGES_ACTIVITY_NAME, 
            REMOVE_MEMBER_ACTIVITY_NAME, RESEND_MESSAGE_ACTIVITY_NAME, DELETE_THREAD_ACTIVITY_NAME, LEAVE_THREAD_ACTIVITY_NAME, IMAGE_SEARCH_ACTIVITY_NAME, THREAD_VIEW_MAP_ACTIVITY_NAME, THREAD_ICON_PICKER_ACTIVITY_NAME, ORCA_ADVANCED_PREFERENCE_ACTIVITY_NAME, ORCA_CONTACTS_PREFERENCE_ACTIVITY_NAME, ORCA_INTERNAL_PREFERENCE_ACTIVITY_NAME, 
            ORCA_TESTER_PREFERENCE_ACTIVITY_NAME, ORCA_ROOT_PREFERENCE_ACTIVITY_NAME, ORCA_PREFERENCE_ACTIVITY_NAME, NUX_ACTIVITY_NAME, ORCA_LOGOUT_ACTIVITY, EDIT_MESSAGING_FAVORITES_ACTIVITY, TIMELINE, TIMELINE_COLLECTIONS_SUMMARY, TIMELINE_COLLECTIONS_SECTION, TIMELINE_COLLECTIONS_COLLECTION, 
            SET_COVER_PHOTO, NEWSFEED, GROUP, STORY_VIEW, PHOTO_GALLERY_VIEWER, CREATE_BROADCAST_ACTIVITY_NAME, MEDIA_PICKER_ACTIVITY_NAME, UBERBAR_ACTIVITY_NAME, DASH_ACTIVITY_NAME, DASH_SPLASH_ANALYTICS_NAME, 
            PAGE_MODULE_NAME, PAGE_ADMIN_MODULE_NAME, PAGE_NATIVE_TIMELINE_MODULE_NAME, PAGE_CHILD_LOCATION_LIST_ACTIVITY, PAGE_EVENTS_LIST_ACTIVITY, PAGE_INFOMATION, PAGE_MENU, PAGE_RECOMMENDATION, PAGE_RECOMMANDATION_LIST, PAGE_FRIENDS_INFO_LIST, 
            MESSAGE_VIEW_ACTIVITY_NAME, ZERO_EXTRA_CHARGES_DIALOG
        });
    }
}
