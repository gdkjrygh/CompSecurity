// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.nodex.startup.splashscreen;


public final class resIdButtonText extends Enum
{

    private static final NONE $VALUES[];
    public static final NONE APP_SETTINGS;
    public static final NONE NONE;
    public static final NONE UNINSTALL;
    public final String resIdButtonText;

    public static resIdButtonText valueOf(String s)
    {
        return (resIdButtonText)Enum.valueOf(com/facebook/nodex/startup/splashscreen/NodexErrorActivity$Action, s);
    }

    public static resIdButtonText[] values()
    {
        return (resIdButtonText[])$VALUES.clone();
    }

    static 
    {
        UNINSTALL = new <init>("UNINSTALL", 0, "nodex_uninstall_string");
        APP_SETTINGS = new <init>("APP_SETTINGS", 1, "nodex_app_settings_string");
        NONE = new <init>("NONE", 2, null);
        $VALUES = (new .VALUES[] {
            UNINSTALL, APP_SETTINGS, NONE
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        resIdButtonText = s1;
    }
}
