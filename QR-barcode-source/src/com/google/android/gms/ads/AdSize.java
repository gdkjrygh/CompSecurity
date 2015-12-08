// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.gms.internal.ay;
import com.google.android.gms.internal.gr;

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
    private final int lf;
    private final int lg;
    private final String lh;

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
            lf = i;
            lg = j;
            lh = s;
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
            if (lf != ((AdSize) (obj)).lf || lg != ((AdSize) (obj)).lg || !lh.equals(((AdSize) (obj)).lh))
            {
                return false;
            }
        }
        return true;
    }

    public int getHeight()
    {
        return lg;
    }

    public int getHeightInPixels(Context context)
    {
        if (lg == -2)
        {
            return ay.b(context.getResources().getDisplayMetrics());
        } else
        {
            return gr.a(context, lg);
        }
    }

    public int getWidth()
    {
        return lf;
    }

    public int getWidthInPixels(Context context)
    {
        if (lf == -1)
        {
            return ay.a(context.getResources().getDisplayMetrics());
        } else
        {
            return gr.a(context, lf);
        }
    }

    public int hashCode()
    {
        return lh.hashCode();
    }

    public boolean isAutoHeight()
    {
        return lg == -2;
    }

    public boolean isFullWidth()
    {
        return lf == -1;
    }

    public String toString()
    {
        return lh;
    }

}
