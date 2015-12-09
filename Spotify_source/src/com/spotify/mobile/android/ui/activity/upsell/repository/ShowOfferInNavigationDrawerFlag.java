// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.activity.upsell.repository;


public final class ShowOfferInNavigationDrawerFlag extends Enum
{

    public static final ShowOfferInNavigationDrawerFlag a;
    public static final ShowOfferInNavigationDrawerFlag b;
    private static final ShowOfferInNavigationDrawerFlag c[];

    private ShowOfferInNavigationDrawerFlag(String s, int i)
    {
        super(s, i);
    }

    public static ShowOfferInNavigationDrawerFlag valueOf(String s)
    {
        return (ShowOfferInNavigationDrawerFlag)Enum.valueOf(com/spotify/mobile/android/ui/activity/upsell/repository/ShowOfferInNavigationDrawerFlag, s);
    }

    public static ShowOfferInNavigationDrawerFlag[] values()
    {
        return (ShowOfferInNavigationDrawerFlag[])c.clone();
    }

    static 
    {
        a = new ShowOfferInNavigationDrawerFlag("CONTROL", 0);
        b = new ShowOfferInNavigationDrawerFlag("SHOW_OFFER", 1);
        c = (new ShowOfferInNavigationDrawerFlag[] {
            a, b
        });
    }
}
