// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.gms.internal.am;
import com.google.android.gms.internal.eu;

public final class AdSize
{

    public static final int AUTO_HEIGHT = -2;
    public static final AdSize BANNER = new AdSize(320, 50, "320x50_mb");
    public static final AdSize FULL_BANNER = new AdSize(468, 60, "468x60_as");
    public static final int FULL_WIDTH = -1;
    public static final AdSize LARGE_BANNER = new AdSize(320, 100, "320x100_as");
    public static final AdSize LEADERBOARD = new AdSize(728, 90, "728x90_as");
    public static final AdSize MEDIUM_RECTANGLE = new AdSize(300, 250, "300x250_as");
    public static final AdSize SMART_BANNER = new AdSize(-1, -2, "smart_banner");
    public static final AdSize WIDE_SKYSCRAPER = new AdSize(160, 600, "160x600_as");
    private final int ks;
    private final int kt;
    private final String ku;

    public AdSize(int i, int j)
    {
        StringBuilder stringbuilder = new StringBuilder();
        String s;
        if (i == -1)
        {
            s = "FULL";
        } else
        {
            s = String.valueOf(i);
        }
        stringbuilder = stringbuilder.append(s).append("x");
        if (j == -2)
        {
            s = "AUTO";
        } else
        {
            s = String.valueOf(j);
        }
        this(i, j, stringbuilder.append(s).append("_as").toString());
    }

    AdSize(int i, int j, String s)
    {
        if (i < 0 && i != -1)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Invalid width for AdSize: ").append(i).toString());
        }
        if (j < 0 && j != -2)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Invalid height for AdSize: ").append(j).toString());
        } else
        {
            ks = i;
            kt = j;
            ku = s;
            return;
        }
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof AdSize))
            {
                return false;
            }
            obj = (AdSize)obj;
            if (ks != ((AdSize) (obj)).ks || kt != ((AdSize) (obj)).kt || !ku.equals(((AdSize) (obj)).ku))
            {
                return false;
            }
        }
        return true;
    }

    public int getHeight()
    {
        return kt;
    }

    public int getHeightInPixels(Context context)
    {
        if (kt == -2)
        {
            return am.b(context.getResources().getDisplayMetrics());
        } else
        {
            return eu.a(context, kt);
        }
    }

    public int getWidth()
    {
        return ks;
    }

    public int getWidthInPixels(Context context)
    {
        if (ks == -1)
        {
            return am.a(context.getResources().getDisplayMetrics());
        } else
        {
            return eu.a(context, ks);
        }
    }

    public int hashCode()
    {
        return ku.hashCode();
    }

    public boolean isAutoHeight()
    {
        return kt == -2;
    }

    public boolean isFullWidth()
    {
        return ks == -1;
    }

    public String toString()
    {
        return ku;
    }

}
