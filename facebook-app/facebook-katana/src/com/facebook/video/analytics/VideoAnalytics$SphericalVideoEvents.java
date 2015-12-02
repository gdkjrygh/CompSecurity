// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.video.analytics;


public final class value extends Enum
{

    private static final SPHERICAL_VIDEO_VIEWPORT_CHANGE $VALUES[];
    public static final SPHERICAL_VIDEO_VIEWPORT_CHANGE SPHERICAL_VIDEO_VIEWPORT_CHANGE;
    public final String value;

    public static value valueOf(String s)
    {
        return (value)Enum.valueOf(com/facebook/video/analytics/VideoAnalytics$SphericalVideoEvents, s);
    }

    public static value[] values()
    {
        return (value[])$VALUES.clone();
    }

    static 
    {
        SPHERICAL_VIDEO_VIEWPORT_CHANGE = new <init>("SPHERICAL_VIDEO_VIEWPORT_CHANGE", 0, "spherical_video_viewport_change");
        $VALUES = (new .VALUES[] {
            SPHERICAL_VIDEO_VIEWPORT_CHANGE
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        value = s1;
    }
}
