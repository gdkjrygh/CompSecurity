// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.music.spotlets.tracking.adjust;


public final class AdjustDeepLinkAttributionFlag extends Enum
{

    public static final AdjustDeepLinkAttributionFlag a;
    public static final AdjustDeepLinkAttributionFlag b;
    private static final AdjustDeepLinkAttributionFlag c[];

    private AdjustDeepLinkAttributionFlag(String s, int i)
    {
        super(s, i);
    }

    public static AdjustDeepLinkAttributionFlag valueOf(String s)
    {
        return (AdjustDeepLinkAttributionFlag)Enum.valueOf(com/spotify/music/spotlets/tracking/adjust/AdjustDeepLinkAttributionFlag, s);
    }

    public static AdjustDeepLinkAttributionFlag[] values()
    {
        return (AdjustDeepLinkAttributionFlag[])c.clone();
    }

    static 
    {
        a = new AdjustDeepLinkAttributionFlag("CONTROL", 0);
        b = new AdjustDeepLinkAttributionFlag("ENABLED", 1);
        c = (new AdjustDeepLinkAttributionFlag[] {
            a, b
        });
    }
}
