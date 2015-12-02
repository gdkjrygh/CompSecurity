// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.video.analytics;


public final class value extends Enum
{

    private static final DISCONNECT_REASON_CODE $VALUES[];
    public static final DISCONNECT_REASON_CODE CAST_BUTTON_CLICK_TYPE;
    public static final DISCONNECT_REASON_CODE DISCONNECT_REASON_CODE;
    public final String value;

    public static value valueOf(String s)
    {
        return (value)Enum.valueOf(com/facebook/video/analytics/VideoAnalytics$ChromecastVideoAnalyticsAttributes, s);
    }

    public static value[] values()
    {
        return (value[])$VALUES.clone();
    }

    static 
    {
        CAST_BUTTON_CLICK_TYPE = new <init>("CAST_BUTTON_CLICK_TYPE", 0, "cast_button_click_type");
        DISCONNECT_REASON_CODE = new <init>("DISCONNECT_REASON_CODE", 1, "disconnect_reason_code");
        $VALUES = (new .VALUES[] {
            CAST_BUTTON_CLICK_TYPE, DISCONNECT_REASON_CODE
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        value = s1;
    }
}
