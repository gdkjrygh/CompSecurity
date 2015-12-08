// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.analytics;


public final class name extends Enum
{

    private static final NONE $VALUES[];
    public static final NONE NAVIGATION;
    public static final NONE NONE;
    private String name;

    public static name valueOf(String s)
    {
        return (name)Enum.valueOf(com/dominos/android/sdk/core/analytics/AnalyticsConstants$Label, s);
    }

    public static name[] values()
    {
        return (name[])$VALUES.clone();
    }

    public final String getName()
    {
        return name;
    }

    static 
    {
        NAVIGATION = new <init>("NAVIGATION", 0, "Navigation");
        NONE = new <init>("NONE", 1, "None");
        $VALUES = (new .VALUES[] {
            NAVIGATION, NONE
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        name = s1;
    }
}
