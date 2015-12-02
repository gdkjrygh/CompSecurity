// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.video.analytics;


public final class value extends Enum
{

    private static final EXIT_CHANNEL_VIEW $VALUES[];
    public static final EXIT_CHANNEL_VIEW CHANNEL_LIST_TAP;
    public static final EXIT_CHANNEL_VIEW EXIT_CHANNEL_VIEW;
    public static final EXIT_CHANNEL_VIEW SKIP_AD_BUTTON;
    public final String value;

    public static value valueOf(String s)
    {
        return (value)Enum.valueOf(com/facebook/video/analytics/VideoAnalytics$SkipAdReason, s);
    }

    public static value[] values()
    {
        return (value[])$VALUES.clone();
    }

    static 
    {
        SKIP_AD_BUTTON = new <init>("SKIP_AD_BUTTON", 0, "skip_ad_button");
        CHANNEL_LIST_TAP = new <init>("CHANNEL_LIST_TAP", 1, "channel_list_tap");
        EXIT_CHANNEL_VIEW = new <init>("EXIT_CHANNEL_VIEW", 2, "exit_channel_view");
        $VALUES = (new .VALUES[] {
            SKIP_AD_BUTTON, CHANNEL_LIST_TAP, EXIT_CHANNEL_VIEW
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        value = s1;
    }
}
