// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads;

import android.content.Context;

public final class AdSize
{

    public static final int AUTO_HEIGHT = -2;
    public static final AdSize BANNER = new AdSize(320, 50, "mb");
    public static final int FULL_WIDTH = -1;
    public static final AdSize IAB_BANNER = new AdSize(468, 60, "as");
    public static final AdSize IAB_LEADERBOARD = new AdSize(728, 90, "as");
    public static final AdSize IAB_MRECT = new AdSize(300, 250, "as");
    public static final AdSize IAB_WIDE_SKYSCRAPER = new AdSize(160, 600, "as");
    public static final int LANDSCAPE_AD_HEIGHT = 32;
    public static final int LARGE_AD_HEIGHT = 90;
    public static final int PORTRAIT_AD_HEIGHT = 50;
    public static final AdSize SMART_BANNER = new AdSize(-1, -2, "mb");
    private final com.google.android.gms.ads.AdSize zzaJ;

    public AdSize(int i, int j)
    {
        this(new com.google.android.gms.ads.AdSize(i, j));
    }

    private AdSize(int i, int j, String s)
    {
        this(new com.google.android.gms.ads.AdSize(i, j));
    }

    public AdSize(com.google.android.gms.ads.AdSize adsize)
    {
        zzaJ = adsize;
    }

    public final boolean equals(Object obj)
    {
        if (!(obj instanceof AdSize))
        {
            return false;
        } else
        {
            obj = (AdSize)obj;
            return zzaJ.equals(((AdSize) (obj)).zzaJ);
        }
    }

    public final transient AdSize findBestSize(AdSize aadsize[])
    {
        AdSize adsize;
        AdSize adsize1;
        adsize = null;
        adsize1 = null;
        if (aadsize != null) goto _L2; else goto _L1
_L1:
        return adsize1;
_L2:
        float f;
        int i;
        int j;
        int k;
        int l;
        f = 0.0F;
        j = getWidth();
        k = getHeight();
        l = aadsize.length;
        i = 0;
_L4:
        adsize1 = adsize;
        if (i >= l) goto _L1; else goto _L3
_L3:
        float f1;
        AdSize adsize2 = aadsize[i];
        int i1 = adsize2.getWidth();
        int j1 = adsize2.getHeight();
        if (!isSizeAppropriate(i1, j1))
        {
            break MISSING_BLOCK_LABEL_127;
        }
        float f2 = (float)(i1 * j1) / (float)(j * k);
        f1 = f2;
        if (f2 > 1.0F)
        {
            f1 = 1.0F / f2;
        }
        if (f1 <= f)
        {
            break MISSING_BLOCK_LABEL_127;
        }
        adsize = adsize2;
_L5:
        i++;
        f = f1;
          goto _L4
        f1 = f;
          goto _L5
    }

    public final int getHeight()
    {
        return zzaJ.getHeight();
    }

    public final int getHeightInPixels(Context context)
    {
        return zzaJ.getHeightInPixels(context);
    }

    public final int getWidth()
    {
        return zzaJ.getWidth();
    }

    public final int getWidthInPixels(Context context)
    {
        return zzaJ.getWidthInPixels(context);
    }

    public final int hashCode()
    {
        return zzaJ.hashCode();
    }

    public final boolean isAutoHeight()
    {
        return zzaJ.isAutoHeight();
    }

    public final boolean isCustomAdSize()
    {
        return false;
    }

    public final boolean isFullWidth()
    {
        return zzaJ.isFullWidth();
    }

    public final boolean isSizeAppropriate(int i, int j)
    {
        int k = getWidth();
        int l = getHeight();
        return (float)i <= (float)k * 1.25F && (float)i >= (float)k * 0.8F && (float)j <= (float)l * 1.25F && (float)j >= (float)l * 0.8F;
    }

    public final String toString()
    {
        return zzaJ.toString();
    }

}
