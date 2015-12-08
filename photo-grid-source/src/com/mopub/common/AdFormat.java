// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.common;


public final class AdFormat extends Enum
{

    public static final AdFormat BANNER;
    public static final AdFormat INTERSTITIAL;
    public static final AdFormat NATIVE;
    public static final AdFormat REWARDED_VIDEO;
    private static final AdFormat a[];

    private AdFormat(String s, int i)
    {
        super(s, i);
    }

    public static AdFormat valueOf(String s)
    {
        return (AdFormat)Enum.valueOf(com/mopub/common/AdFormat, s);
    }

    public static AdFormat[] values()
    {
        return (AdFormat[])a.clone();
    }

    static 
    {
        BANNER = new AdFormat("BANNER", 0);
        INTERSTITIAL = new AdFormat("INTERSTITIAL", 1);
        NATIVE = new AdFormat("NATIVE", 2);
        REWARDED_VIDEO = new AdFormat("REWARDED_VIDEO", 3);
        a = (new AdFormat[] {
            BANNER, INTERSTITIAL, NATIVE, REWARDED_VIDEO
        });
    }
}
