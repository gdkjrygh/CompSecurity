// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.analytics;


public final class name extends Enum
{

    private static final ERROR $VALUES[];
    public static final ERROR BUTTON;
    public static final ERROR CHECKBOX;
    public static final ERROR ERROR;
    public static final ERROR LINK;
    public static final ERROR LOAD;
    private String name;

    public static name valueOf(String s)
    {
        return (name)Enum.valueOf(com/dominos/android/sdk/core/analytics/AnalyticsConstants$Category, s);
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
        BUTTON = new <init>("BUTTON", 0, "Button");
        CHECKBOX = new <init>("CHECKBOX", 1, "Checkbox");
        LINK = new <init>("LINK", 2, "Link");
        LOAD = new <init>("LOAD", 3, "Load");
        ERROR = new <init>("ERROR", 4, "Error");
        $VALUES = (new .VALUES[] {
            BUTTON, CHECKBOX, LINK, LOAD, ERROR
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        name = s1;
    }
}
