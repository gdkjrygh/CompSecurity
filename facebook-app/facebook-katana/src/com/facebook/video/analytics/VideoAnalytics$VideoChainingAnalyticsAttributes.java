// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.video.analytics;


public final class value extends Enum
{

    private static final VIDEO_CHAINING_SOURCE $VALUES[];
    public static final VIDEO_CHAINING_SOURCE VIDEO_CHAINING_DEPTH_LEVEL;
    public static final VIDEO_CHAINING_SOURCE VIDEO_CHAINING_SESSION_ID;
    public static final VIDEO_CHAINING_SOURCE VIDEO_CHAINING_SOURCE;
    public final String value;

    public static value valueOf(String s)
    {
        return (value)Enum.valueOf(com/facebook/video/analytics/VideoAnalytics$VideoChainingAnalyticsAttributes, s);
    }

    public static value[] values()
    {
        return (value[])$VALUES.clone();
    }

    static 
    {
        VIDEO_CHAINING_DEPTH_LEVEL = new <init>("VIDEO_CHAINING_DEPTH_LEVEL", 0, "video_chaining_depth_level");
        VIDEO_CHAINING_SESSION_ID = new <init>("VIDEO_CHAINING_SESSION_ID", 1, "video_chaining_session_id");
        VIDEO_CHAINING_SOURCE = new <init>("VIDEO_CHAINING_SOURCE", 2, "video_chaining_source");
        $VALUES = (new .VALUES[] {
            VIDEO_CHAINING_DEPTH_LEVEL, VIDEO_CHAINING_SESSION_ID, VIDEO_CHAINING_SOURCE
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        value = s1;
    }
}
