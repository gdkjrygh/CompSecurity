// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.video.analytics;


public final class value extends Enum
{

    private static final VIDEO_CHAINING_REQUEST_RESULT $VALUES[];
    public static final VIDEO_CHAINING_REQUEST_RESULT VIDEO_CHAINING_IMPRESSION;
    public static final VIDEO_CHAINING_REQUEST_RESULT VIDEO_CHAINING_REQUEST_RESULT;
    public static final VIDEO_CHAINING_REQUEST_RESULT VIDEO_CHAINING_TAP;
    public final String value;

    public static value valueOf(String s)
    {
        return (value)Enum.valueOf(com/facebook/video/analytics/VideoAnalytics$VideoChainingAnalyticsEvents, s);
    }

    public static value[] values()
    {
        return (value[])$VALUES.clone();
    }

    static 
    {
        VIDEO_CHAINING_TAP = new <init>("VIDEO_CHAINING_TAP", 0, "video_chaining_tap");
        VIDEO_CHAINING_IMPRESSION = new <init>("VIDEO_CHAINING_IMPRESSION", 1, "video_chaining_impression");
        VIDEO_CHAINING_REQUEST_RESULT = new <init>("VIDEO_CHAINING_REQUEST_RESULT", 2, "video_chaining_request_result");
        $VALUES = (new .VALUES[] {
            VIDEO_CHAINING_TAP, VIDEO_CHAINING_IMPRESSION, VIDEO_CHAINING_REQUEST_RESULT
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        value = s1;
    }
}
