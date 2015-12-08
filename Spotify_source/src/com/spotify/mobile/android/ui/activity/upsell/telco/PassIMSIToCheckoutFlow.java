// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.activity.upsell.telco;


public final class PassIMSIToCheckoutFlow extends Enum
{

    public static final PassIMSIToCheckoutFlow a;
    public static final PassIMSIToCheckoutFlow b;
    private static final PassIMSIToCheckoutFlow c[];

    private PassIMSIToCheckoutFlow(String s, int i)
    {
        super(s, i);
    }

    public static PassIMSIToCheckoutFlow valueOf(String s)
    {
        return (PassIMSIToCheckoutFlow)Enum.valueOf(com/spotify/mobile/android/ui/activity/upsell/telco/PassIMSIToCheckoutFlow, s);
    }

    public static PassIMSIToCheckoutFlow[] values()
    {
        return (PassIMSIToCheckoutFlow[])c.clone();
    }

    static 
    {
        a = new PassIMSIToCheckoutFlow("DISABLED", 0);
        b = new PassIMSIToCheckoutFlow("ENABLED", 1);
        c = (new PassIMSIToCheckoutFlow[] {
            a, b
        });
    }
}
