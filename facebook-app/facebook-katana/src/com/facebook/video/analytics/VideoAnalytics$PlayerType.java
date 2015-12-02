// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.video.analytics;


public final class value extends Enum
{

    private static final OTHERS $VALUES[];
    public static final OTHERS CHANNEL_PLAYER;
    public static final OTHERS CHROMECAST_PLAYER;
    public static final OTHERS FULL_SCREEN_PLAYER;
    public static final OTHERS INLINE_PLAYER;
    public static final OTHERS OTHERS;
    public static final OTHERS RICH_DOCUMENT;
    public static final OTHERS YOUTUBE_FULL_SCREEN_PLAYER;
    public final String value;

    public static value asPlayerType(String s)
    {
        try
        {
            s = valueOf(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return INLINE_PLAYER;
        }
        return s;
    }

    public static INLINE_PLAYER valueOf(String s)
    {
        return (INLINE_PLAYER)Enum.valueOf(com/facebook/video/analytics/VideoAnalytics$PlayerType, s);
    }

    public static INLINE_PLAYER[] values()
    {
        return (INLINE_PLAYER[])$VALUES.clone();
    }

    static 
    {
        CHANNEL_PLAYER = new <init>("CHANNEL_PLAYER", 0, "channel");
        INLINE_PLAYER = new <init>("INLINE_PLAYER", 1, "inline");
        FULL_SCREEN_PLAYER = new <init>("FULL_SCREEN_PLAYER", 2, "full_screen");
        YOUTUBE_FULL_SCREEN_PLAYER = new <init>("YOUTUBE_FULL_SCREEN_PLAYER", 3, "youtube_full_screen");
        CHROMECAST_PLAYER = new <init>("CHROMECAST_PLAYER", 4, "chromecast");
        RICH_DOCUMENT = new <init>("RICH_DOCUMENT", 5, "rich_document");
        OTHERS = new <init>("OTHERS", 6, "others");
        $VALUES = (new .VALUES[] {
            CHANNEL_PLAYER, INLINE_PLAYER, FULL_SCREEN_PLAYER, YOUTUBE_FULL_SCREEN_PLAYER, CHROMECAST_PLAYER, RICH_DOCUMENT, OTHERS
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        value = s1;
    }
}
