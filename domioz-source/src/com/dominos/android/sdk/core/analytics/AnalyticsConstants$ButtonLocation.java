// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.analytics;


public final class name extends Enum
{

    private static final FOOTER $VALUES[];
    public static final FOOTER FOOTER;
    public static final FOOTER HEADER;
    private String name;

    public static name valueOf(String s)
    {
        return (name)Enum.valueOf(com/dominos/android/sdk/core/analytics/AnalyticsConstants$ButtonLocation, s);
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
        HEADER = new <init>("HEADER", 0, "Header");
        FOOTER = new <init>("FOOTER", 1, "Footer");
        $VALUES = (new .VALUES[] {
            HEADER, FOOTER
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        name = s1;
    }
}
