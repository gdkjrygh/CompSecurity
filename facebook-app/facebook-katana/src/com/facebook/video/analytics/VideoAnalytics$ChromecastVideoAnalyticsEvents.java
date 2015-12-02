// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.video.analytics;


public final class value extends Enum
{

    private static final CHROMECAST_CAST_INVALID_EVENT $VALUES[];
    public static final CHROMECAST_CAST_INVALID_EVENT CHROMECAST_CAST_CLICKED;
    public static final CHROMECAST_CAST_INVALID_EVENT CHROMECAST_CAST_CONNECTED;
    public static final CHROMECAST_CAST_INVALID_EVENT CHROMECAST_CAST_DISABLED;
    public static final CHROMECAST_CAST_INVALID_EVENT CHROMECAST_CAST_DISCONNECTED;
    public static final CHROMECAST_CAST_INVALID_EVENT CHROMECAST_CAST_INVALID_EVENT;
    public static final CHROMECAST_CAST_INVALID_EVENT CHROMECAST_CAST_RECONNECTED;
    public static final CHROMECAST_CAST_INVALID_EVENT CHROMECAST_CAST_VISIBLE;
    public final String value;

    public static value asEvent(String s)
    {
        value avalue[] = values();
        int j = avalue.length;
        for (int i = 0; i < j; i++)
        {
            value value1 = avalue[i];
            if (s.equals(value1.value))
            {
                return value1;
            }
        }

        return CHROMECAST_CAST_INVALID_EVENT;
    }

    public static CHROMECAST_CAST_INVALID_EVENT valueOf(String s)
    {
        return (CHROMECAST_CAST_INVALID_EVENT)Enum.valueOf(com/facebook/video/analytics/VideoAnalytics$ChromecastVideoAnalyticsEvents, s);
    }

    public static CHROMECAST_CAST_INVALID_EVENT[] values()
    {
        return (CHROMECAST_CAST_INVALID_EVENT[])$VALUES.clone();
    }

    static 
    {
        CHROMECAST_CAST_VISIBLE = new <init>("CHROMECAST_CAST_VISIBLE", 0, "chromecast_button_visible");
        CHROMECAST_CAST_DISABLED = new <init>("CHROMECAST_CAST_DISABLED", 1, "chromecast_button_disabled");
        CHROMECAST_CAST_CLICKED = new <init>("CHROMECAST_CAST_CLICKED", 2, "chromecast_button_clicked");
        CHROMECAST_CAST_CONNECTED = new <init>("CHROMECAST_CAST_CONNECTED", 3, "chromecast_connected");
        CHROMECAST_CAST_RECONNECTED = new <init>("CHROMECAST_CAST_RECONNECTED", 4, "chromecast_reconnected");
        CHROMECAST_CAST_DISCONNECTED = new <init>("CHROMECAST_CAST_DISCONNECTED", 5, "chromecast_disconnected");
        CHROMECAST_CAST_INVALID_EVENT = new <init>("CHROMECAST_CAST_INVALID_EVENT", 6, "");
        $VALUES = (new .VALUES[] {
            CHROMECAST_CAST_VISIBLE, CHROMECAST_CAST_DISABLED, CHROMECAST_CAST_CLICKED, CHROMECAST_CAST_CONNECTED, CHROMECAST_CAST_RECONNECTED, CHROMECAST_CAST_DISCONNECTED, CHROMECAST_CAST_INVALID_EVENT
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        value = s1;
    }
}
