// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.video.analytics;


public final class value extends Enum
{

    private static final VIDEO_PREFETCH $VALUES[];
    public static final VIDEO_PREFETCH LAUNCH_SERVER;
    public static final VIDEO_PREFETCH SHUTDOWN_SERVER;
    public static final VIDEO_PREFETCH VIDEO_CACHE_REQUEST_ABORTED;
    public static final VIDEO_PREFETCH VIDEO_CACHE_REQUEST_FAILED;
    public static final VIDEO_PREFETCH VIDEO_CACHE_REQUEST_FINISHED;
    public static final VIDEO_PREFETCH VIDEO_PREFETCH;
    public final String value;

    public static value valueOf(String s)
    {
        return (value)Enum.valueOf(com/facebook/video/analytics/VideoAnalytics$VideoServerAnalyticEvents, s);
    }

    public static value[] values()
    {
        return (value[])$VALUES.clone();
    }

    static 
    {
        LAUNCH_SERVER = new <init>("LAUNCH_SERVER", 0, "launch_video_server");
        SHUTDOWN_SERVER = new <init>("SHUTDOWN_SERVER", 1, "shutdown_video_server");
        VIDEO_CACHE_REQUEST_FINISHED = new <init>("VIDEO_CACHE_REQUEST_FINISHED", 2, "video_cache_request_finished");
        VIDEO_CACHE_REQUEST_ABORTED = new <init>("VIDEO_CACHE_REQUEST_ABORTED", 3, "video_cache_request_aborted");
        VIDEO_CACHE_REQUEST_FAILED = new <init>("VIDEO_CACHE_REQUEST_FAILED", 4, "video_cache_request_failed");
        VIDEO_PREFETCH = new <init>("VIDEO_PREFETCH", 5, "video_prefetch");
        $VALUES = (new .VALUES[] {
            LAUNCH_SERVER, SHUTDOWN_SERVER, VIDEO_CACHE_REQUEST_FINISHED, VIDEO_CACHE_REQUEST_ABORTED, VIDEO_CACHE_REQUEST_FAILED, VIDEO_PREFETCH
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        value = s1;
    }
}
