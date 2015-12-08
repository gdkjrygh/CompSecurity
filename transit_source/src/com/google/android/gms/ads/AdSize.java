// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.gms.internal.cm;
import com.google.android.gms.internal.x;

public final class AdSize
{

    public static final int AUTO_HEIGHT = -2;
    public static final AdSize BANNER = new AdSize(320, 50, "320x50_mb");
    public static final AdSize FULL_BANNER = new AdSize(468, 60, "468x60_as");
    public static final int FULL_WIDTH = -1;
    public static final AdSize LEADERBOARD = new AdSize(728, 90, "728x90_as");
    public static final AdSize MEDIUM_RECTANGLE = new AdSize(300, 250, "300x250_as");
    public static final AdSize SMART_BANNER = new AdSize(-1, -2, "smart_banner");
    public static final AdSize WIDE_SKYSCRAPER = new AdSize(160, 600, "160x600_as");
    private final int dP;
    private final int dQ;
    private final String dR;

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

    public AdSize(int i, int j, String s)
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
            dP = i;
            dQ = j;
            dR = s;
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
            if (dP != ((AdSize) (obj)).dP || dQ != ((AdSize) (obj)).dQ || !dR.equals(((AdSize) (obj)).dR))
            {
                return false;
            }
        }
        return true;
    }

    public int getHeight()
    {
        return dQ;
    }

    public int getHeightInPixels(Context context)
    {
        if (dQ == -2)
        {
            return x.b(context.getResources().getDisplayMetrics());
        } else
        {
            return cm.a(context, dQ);
        }
    }

    public int getWidth()
    {
        return dP;
    }

    public int getWidthInPixels(Context context)
    {
        if (dP == -1)
        {
            return x.a(context.getResources().getDisplayMetrics());
        } else
        {
            return cm.a(context, dP);
        }
    }

    public int hashCode()
    {
        return dR.hashCode();
    }

    public boolean isAutoHeight()
    {
        return dQ == -2;
    }

    public boolean isFullWidth()
    {
        return dP == -1;
    }

    public String toString()
    {
        return dR;
    }

}
