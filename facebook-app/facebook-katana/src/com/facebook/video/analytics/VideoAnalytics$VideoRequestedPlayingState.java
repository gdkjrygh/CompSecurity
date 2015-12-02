// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.video.analytics;


public final class value extends Enum
{

    private static final UNPAUSED $VALUES[];
    public static final UNPAUSED STARTED;
    public static final UNPAUSED UNPAUSED;
    public final String value;

    public static value valueOf(String s)
    {
        return (value)Enum.valueOf(com/facebook/video/analytics/VideoAnalytics$VideoRequestedPlayingState, s);
    }

    public static value[] values()
    {
        return (value[])$VALUES.clone();
    }

    static 
    {
        STARTED = new <init>("STARTED", 0, "started");
        UNPAUSED = new <init>("UNPAUSED", 1, "unpaused");
        $VALUES = (new .VALUES[] {
            STARTED, UNPAUSED
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        value = s1;
    }
}
