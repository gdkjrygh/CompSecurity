// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.video.analytics;


public final class value extends Enum
{

    private static final COMPLETED $VALUES[];
    public static final COMPLETED COMPLETED;
    public static final COMPLETED PAUSED;
    public static final COMPLETED STREAM_SWITCH;
    public final String value;

    public static value valueOf(String s)
    {
        return (value)Enum.valueOf(com/facebook/video/analytics/VideoAnalytics$StreamRepresentationEventSource, s);
    }

    public static value[] values()
    {
        return (value[])$VALUES.clone();
    }

    static 
    {
        STREAM_SWITCH = new <init>("STREAM_SWITCH", 0, "stream_switch");
        PAUSED = new <init>("PAUSED", 1, "paused");
        COMPLETED = new <init>("COMPLETED", 2, "completed");
        $VALUES = (new .VALUES[] {
            STREAM_SWITCH, PAUSED, COMPLETED
        });
    }

    private Q(String s, int i, String s1)
    {
        super(s, i);
        value = s1;
    }
}
