// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.activity.dynamicupsell;


public final class DynamicUpsellsFlag extends Enum
{

    public static final DynamicUpsellsFlag a;
    public static final DynamicUpsellsFlag b;
    private static final DynamicUpsellsFlag c[];

    private DynamicUpsellsFlag(String s, int i)
    {
        super(s, i);
    }

    public static DynamicUpsellsFlag valueOf(String s)
    {
        return (DynamicUpsellsFlag)Enum.valueOf(com/spotify/mobile/android/ui/activity/dynamicupsell/DynamicUpsellsFlag, s);
    }

    public static DynamicUpsellsFlag[] values()
    {
        return (DynamicUpsellsFlag[])c.clone();
    }

    static 
    {
        a = new DynamicUpsellsFlag("ENABLED", 0);
        b = new DynamicUpsellsFlag("CONTROL", 1);
        c = (new DynamicUpsellsFlag[] {
            a, b
        });
    }
}
