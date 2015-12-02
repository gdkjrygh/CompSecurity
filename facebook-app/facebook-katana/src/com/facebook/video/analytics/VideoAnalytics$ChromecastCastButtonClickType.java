// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.video.analytics;


public final class value extends Enum
{

    private static final SHOW_CAST_MENU $VALUES[];
    public static final SHOW_CAST_MENU ATTEMPT_TO_CONNECT;
    public static final SHOW_CAST_MENU SHOW_CAST_MENU;
    public final String value;

    public static value valueOf(String s)
    {
        return (value)Enum.valueOf(com/facebook/video/analytics/VideoAnalytics$ChromecastCastButtonClickType, s);
    }

    public static value[] values()
    {
        return (value[])$VALUES.clone();
    }

    static 
    {
        ATTEMPT_TO_CONNECT = new <init>("ATTEMPT_TO_CONNECT", 0, "attempt_to_connect");
        SHOW_CAST_MENU = new <init>("SHOW_CAST_MENU", 1, "show_cast_menu");
        $VALUES = (new .VALUES[] {
            ATTEMPT_TO_CONNECT, SHOW_CAST_MENU
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        value = s1;
    }
}
