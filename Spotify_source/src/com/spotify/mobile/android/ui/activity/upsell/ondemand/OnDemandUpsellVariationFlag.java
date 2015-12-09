// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.activity.upsell.ondemand;


public final class OnDemandUpsellVariationFlag extends Enum
{

    public static final OnDemandUpsellVariationFlag a;
    public static final OnDemandUpsellVariationFlag b;
    public static final OnDemandUpsellVariationFlag c;
    public static final OnDemandUpsellVariationFlag d;
    private static final OnDemandUpsellVariationFlag e[];

    private OnDemandUpsellVariationFlag(String s, int i)
    {
        super(s, i);
    }

    public static OnDemandUpsellVariationFlag valueOf(String s)
    {
        return (OnDemandUpsellVariationFlag)Enum.valueOf(com/spotify/mobile/android/ui/activity/upsell/ondemand/OnDemandUpsellVariationFlag, s);
    }

    public static OnDemandUpsellVariationFlag[] values()
    {
        return (OnDemandUpsellVariationFlag[])e.clone();
    }

    static 
    {
        a = new OnDemandUpsellVariationFlag("CONTROL", 0);
        b = new OnDemandUpsellVariationFlag("POPUP", 1);
        c = new OnDemandUpsellVariationFlag("BANNER", 2);
        d = new OnDemandUpsellVariationFlag("TINKERBELL", 3);
        e = (new OnDemandUpsellVariationFlag[] {
            a, b, c, d
        });
    }
}
