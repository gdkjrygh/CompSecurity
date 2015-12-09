// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.activity.upsell.repository;


public final class OptInTrialBypassFlag extends Enum
{

    public static final OptInTrialBypassFlag a;
    public static final OptInTrialBypassFlag b;
    private static final OptInTrialBypassFlag c[];

    private OptInTrialBypassFlag(String s, int i)
    {
        super(s, i);
    }

    public static OptInTrialBypassFlag valueOf(String s)
    {
        return (OptInTrialBypassFlag)Enum.valueOf(com/spotify/mobile/android/ui/activity/upsell/repository/OptInTrialBypassFlag, s);
    }

    public static OptInTrialBypassFlag[] values()
    {
        return (OptInTrialBypassFlag[])c.clone();
    }

    static 
    {
        a = new OptInTrialBypassFlag("CONTROL", 0);
        b = new OptInTrialBypassFlag("SHOW_INTRO_OFFER", 1);
        c = (new OptInTrialBypassFlag[] {
            a, b
        });
    }
}
