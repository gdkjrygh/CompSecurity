// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.analytics.appboy;


public final class AppboyAttributeName extends Enum
{

    private static final AppboyAttributeName $VALUES[];
    public static final AppboyAttributeName CATEGORY;
    public static final AppboyAttributeName CREATOR_DISPLAY_NAME;
    public static final AppboyAttributeName CREATOR_URN;
    public static final AppboyAttributeName GENRE;
    public static final AppboyAttributeName PLAYABLE_TITLE;
    public static final AppboyAttributeName PLAYABLE_TYPE;
    public static final AppboyAttributeName PLAYABLE_URN;
    public static final AppboyAttributeName PLAYLIST_TITLE;
    public static final AppboyAttributeName PLAYLIST_URN;
    private final String appBoyKey;
    private final String eventKey;

    private AppboyAttributeName(String s, int i, String s1, String s2)
    {
        super(s, i);
        appBoyKey = s1;
        eventKey = s2;
    }

    public static AppboyAttributeName valueOf(String s)
    {
        return (AppboyAttributeName)Enum.valueOf(com/soundcloud/android/analytics/appboy/AppboyAttributeName, s);
    }

    public static AppboyAttributeName[] values()
    {
        return (AppboyAttributeName[])$VALUES.clone();
    }

    final String getAppBoyKey()
    {
        return appBoyKey;
    }

    final String getEventKey()
    {
        return eventKey;
    }

    static 
    {
        CREATOR_DISPLAY_NAME = new AppboyAttributeName("CREATOR_DISPLAY_NAME", 0, "creator_display_name", "creator_display_name");
        CREATOR_URN = new AppboyAttributeName("CREATOR_URN", 1, "creator_urn", "creator_urn");
        PLAYABLE_TITLE = new AppboyAttributeName("PLAYABLE_TITLE", 2, "playable_title", "playable_title");
        PLAYABLE_URN = new AppboyAttributeName("PLAYABLE_URN", 3, "playable_urn", "playable_urn");
        PLAYABLE_TYPE = new AppboyAttributeName("PLAYABLE_TYPE", 4, "playable_type", "playable_type");
        PLAYLIST_TITLE = new AppboyAttributeName("PLAYLIST_TITLE", 5, "playlist_title", "playable_title");
        PLAYLIST_URN = new AppboyAttributeName("PLAYLIST_URN", 6, "playlist_urn", "playable_urn");
        CATEGORY = new AppboyAttributeName("CATEGORY", 7, "category", "screen");
        GENRE = new AppboyAttributeName("GENRE", 8, "genre", "genre");
        $VALUES = (new AppboyAttributeName[] {
            CREATOR_DISPLAY_NAME, CREATOR_URN, PLAYABLE_TITLE, PLAYABLE_URN, PLAYABLE_TYPE, PLAYLIST_TITLE, PLAYLIST_URN, CATEGORY, GENRE
        });
    }
}
