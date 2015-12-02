// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.video.analytics;


public final class value extends Enum
{

    private static final CHANNEL $VALUES[];
    public static final CHANNEL CARDS;
    public static final CHANNEL CAROUSEL;
    public static final CHANNEL CHANNEL;
    public static final CHANNEL INLINE_FEED;
    public static final CHANNEL POSTPLAY;
    public final String value;

    public static value valueOf(String s)
    {
        return (value)Enum.valueOf(com/facebook/video/analytics/VideoAnalytics$VideoChainingSource, s);
    }

    public static value[] values()
    {
        return (value[])$VALUES.clone();
    }

    static 
    {
        CAROUSEL = new <init>("CAROUSEL", 0, "carousel");
        CARDS = new <init>("CARDS", 1, "cards");
        POSTPLAY = new <init>("POSTPLAY", 2, "postplay");
        INLINE_FEED = new <init>("INLINE_FEED", 3, "inline_feed");
        CHANNEL = new <init>("CHANNEL", 4, "channel");
        $VALUES = (new .VALUES[] {
            CAROUSEL, CARDS, POSTPLAY, INLINE_FEED, CHANNEL
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        value = s1;
    }
}
