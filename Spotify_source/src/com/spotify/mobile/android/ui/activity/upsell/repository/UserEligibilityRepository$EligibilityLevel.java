// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.activity.upsell.repository;


public final class i extends Enum
{

    public static final c a;
    public static final c b;
    public static final c c;
    private static final c d[];

    public static i valueOf(String s)
    {
        return (i)Enum.valueOf(com/spotify/mobile/android/ui/activity/upsell/repository/UserEligibilityRepository$EligibilityLevel, s);
    }

    public static i[] values()
    {
        return (i[])d.clone();
    }

    static 
    {
        a = new <init>("OPT_IN_TRIAL", 0);
        b = new <init>("MARKET_OFFER", 1);
        c = new <init>("NO_OFFER", 2);
        d = (new d[] {
            a, b, c
        });
    }

    private i(String s, int i)
    {
        super(s, i);
    }
}
