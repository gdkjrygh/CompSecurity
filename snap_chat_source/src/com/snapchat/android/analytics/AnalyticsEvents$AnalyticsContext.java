// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.analytics;


// Referenced classes of package com.snapchat.android.analytics:
//            AnalyticsEvents

public static final class  extends Enum
{

    private static final UNKNOWN $VALUES[];
    public static final UNKNOWN CAMERA_PAGE;
    public static final UNKNOWN CONTACTS;
    public static final UNKNOWN FEED;
    public static final UNKNOWN HELP_PAGE;
    public static final UNKNOWN MY_FRIENDS_POPUP;
    public static final UNKNOWN NEW_USER_CONTACT_BOOK_PAGE;
    public static final UNKNOWN PROFILE_ADDED_ME_PAGE;
    public static final UNKNOWN PROFILE_ADD_FRIENDS_BY_CONTACTS_PAGE;
    public static final UNKNOWN PROFILE_ADD_FRIENDS_BY_USERNAME_PAGE;
    public static final UNKNOWN PROFILE_ADD_FRIENDS_MENU_PAGE;
    public static final UNKNOWN PROFILE_ADD_NEARBY_FRIENDS_PAGE;
    public static final UNKNOWN PROFILE_MAIN_PAGE;
    public static final UNKNOWN PROFILE_MY_CONTACTS_PAGE;
    public static final UNKNOWN PROFILE_MY_FRIENDS_PAGE;
    public static final UNKNOWN PROFILE_PICTURES_PAGE_VIEW;
    public static final UNKNOWN REQUESTS;
    public static final UNKNOWN SEARCH;
    public static final UNKNOWN SEND;
    public static final UNKNOWN SETTINGS;
    public static final UNKNOWN SETTINGS_DISPLAYNAME_CHANGE;
    public static final UNKNOWN SNAPCODE_PAGE;
    public static final UNKNOWN STORIES;
    public static final UNKNOWN TROPHY;
    public static final UNKNOWN UNKNOWN;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/snapchat/android/analytics/AnalyticsEvents$AnalyticsContext, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        MY_FRIENDS_POPUP = new <init>("MY_FRIENDS_POPUP", 0);
        REQUESTS = new <init>("REQUESTS", 1);
        SEARCH = new <init>("SEARCH", 2);
        CONTACTS = new <init>("CONTACTS", 3);
        SEND = new <init>("SEND", 4);
        STORIES = new <init>("STORIES", 5);
        FEED = new <init>("FEED", 6);
        PROFILE_MAIN_PAGE = new <init>("PROFILE_MAIN_PAGE", 7);
        PROFILE_ADDED_ME_PAGE = new <init>("PROFILE_ADDED_ME_PAGE", 8);
        PROFILE_ADD_FRIENDS_MENU_PAGE = new <init>("PROFILE_ADD_FRIENDS_MENU_PAGE", 9);
        PROFILE_ADD_FRIENDS_BY_USERNAME_PAGE = new <init>("PROFILE_ADD_FRIENDS_BY_USERNAME_PAGE", 10);
        PROFILE_ADD_NEARBY_FRIENDS_PAGE = new <init>("PROFILE_ADD_NEARBY_FRIENDS_PAGE", 11);
        PROFILE_ADD_FRIENDS_BY_CONTACTS_PAGE = new <init>("PROFILE_ADD_FRIENDS_BY_CONTACTS_PAGE", 12);
        PROFILE_MY_CONTACTS_PAGE = new <init>("PROFILE_MY_CONTACTS_PAGE", 13);
        PROFILE_MY_FRIENDS_PAGE = new <init>("PROFILE_MY_FRIENDS_PAGE", 14);
        PROFILE_PICTURES_PAGE_VIEW = new <init>("PROFILE_PICTURES_PAGE_VIEW", 15);
        NEW_USER_CONTACT_BOOK_PAGE = new <init>("NEW_USER_CONTACT_BOOK_PAGE", 16);
        SETTINGS = new <init>("SETTINGS", 17);
        SETTINGS_DISPLAYNAME_CHANGE = new <init>("SETTINGS_DISPLAYNAME_CHANGE", 18);
        CAMERA_PAGE = new <init>("CAMERA_PAGE", 19);
        HELP_PAGE = new <init>("HELP_PAGE", 20);
        SNAPCODE_PAGE = new <init>("SNAPCODE_PAGE", 21);
        TROPHY = new <init>("TROPHY", 22);
        UNKNOWN = new <init>("UNKNOWN", 23);
        $VALUES = (new .VALUES[] {
            MY_FRIENDS_POPUP, REQUESTS, SEARCH, CONTACTS, SEND, STORIES, FEED, PROFILE_MAIN_PAGE, PROFILE_ADDED_ME_PAGE, PROFILE_ADD_FRIENDS_MENU_PAGE, 
            PROFILE_ADD_FRIENDS_BY_USERNAME_PAGE, PROFILE_ADD_NEARBY_FRIENDS_PAGE, PROFILE_ADD_FRIENDS_BY_CONTACTS_PAGE, PROFILE_MY_CONTACTS_PAGE, PROFILE_MY_FRIENDS_PAGE, PROFILE_PICTURES_PAGE_VIEW, NEW_USER_CONTACT_BOOK_PAGE, SETTINGS, SETTINGS_DISPLAYNAME_CHANGE, CAMERA_PAGE, 
            HELP_PAGE, SNAPCODE_PAGE, TROPHY, UNKNOWN
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
