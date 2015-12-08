// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads;


public final class AdSize extends Enum
{

    public static final AdSize BANNER_320_50;
    public static final AdSize BANNER_HEIGHT_50;
    public static final AdSize BANNER_HEIGHT_90;
    public static final AdSize INTERSTITIAL;
    public static final AdSize RECTANGLE_HEIGHT_250;
    private static final AdSize c[];
    private final int a;
    private final int b;

    private AdSize(String s, int i, int j, int k)
    {
        super(s, i);
        a = j;
        b = k;
    }

    private static boolean a(AdSize adsize, int i, int j)
    {
        return adsize != null && adsize.a == i && adsize.b == j;
    }

    public static AdSize fromWidthAndHeight(int i, int j)
    {
        AdSize aadsize[] = (AdSize[])com/facebook/ads/AdSize.getEnumConstants();
        int l = aadsize.length;
        for (int k = 0; k < l; k++)
        {
            AdSize adsize = aadsize[k];
            if (a(adsize, i, j))
            {
                return adsize;
            }
        }

        return null;
    }

    public static AdSize valueOf(String s)
    {
        return (AdSize)Enum.valueOf(com/facebook/ads/AdSize, s);
    }

    public static AdSize[] values()
    {
        return (AdSize[])c.clone();
    }

    public int getHeight()
    {
        return b;
    }

    public int getWidth()
    {
        return a;
    }

    static 
    {
        BANNER_320_50 = new AdSize("BANNER_320_50", 0, 320, 50);
        INTERSTITIAL = new AdSize("INTERSTITIAL", 1, 0, 0);
        BANNER_HEIGHT_50 = new AdSize("BANNER_HEIGHT_50", 2, -1, 50);
        BANNER_HEIGHT_90 = new AdSize("BANNER_HEIGHT_90", 3, -1, 90);
        RECTANGLE_HEIGHT_250 = new AdSize("RECTANGLE_HEIGHT_250", 4, -1, 250);
        c = (new AdSize[] {
            BANNER_320_50, INTERSTITIAL, BANNER_HEIGHT_50, BANNER_HEIGHT_90, RECTANGLE_HEIGHT_250
        });
    }
}
