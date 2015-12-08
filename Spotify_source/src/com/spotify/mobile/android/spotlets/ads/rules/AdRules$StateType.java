// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.ads.rules;


public final class  extends Enum
{

    public static final g a;
    public static final g b;
    public static final g c;
    public static final g d;
    public static final g e;
    public static final g f;
    public static final g g;
    private static final g h[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/spotify/mobile/android/spotlets/ads/rules/AdRules$StateType, s);
    }

    public static [] values()
    {
        return ([])h.clone();
    }

    static 
    {
        a = new <init>("CAR_CONNECTED", 0);
        b = new <init>("DISABLED_NAVIGATION_ITEM", 1);
        c = new <init>("MIDROLL_VIDEO_ADS", 2);
        d = new <init>("ON_SPONSORED_PAGE", 3);
        e = new <init>("PLAYING_FROM_SPONSORED_CONTEXT", 4);
        f = new <init>("WATCH_NOW_SLOT", 5);
        g = new <init>("STREAMING_AD_IN_PROGRESS", 6);
        h = (new h[] {
            a, b, c, d, e, f, g
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
