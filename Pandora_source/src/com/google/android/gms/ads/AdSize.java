// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.zzj;
import com.google.android.gms.ads.internal.util.client.zza;

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
    private final int zzma;
    private final int zzmb;
    private final String zzmc;

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
            zzma = i;
            zzmb = j;
            zzmc = s;
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
            if (zzma != ((AdSize) (obj)).zzma || zzmb != ((AdSize) (obj)).zzmb || !zzmc.equals(((AdSize) (obj)).zzmc))
            {
                return false;
            }
        }
        return true;
    }

    public int getHeight()
    {
        return zzmb;
    }

    public int getHeightInPixels(Context context)
    {
        if (zzmb == -2)
        {
            return AdSizeParcel.zzb(context.getResources().getDisplayMetrics());
        } else
        {
            return zzj.zzbJ().zzb(context, zzmb);
        }
    }

    public int getWidth()
    {
        return zzma;
    }

    public int getWidthInPixels(Context context)
    {
        if (zzma == -1)
        {
            return AdSizeParcel.zza(context.getResources().getDisplayMetrics());
        } else
        {
            return zzj.zzbJ().zzb(context, zzma);
        }
    }

    public int hashCode()
    {
        return zzmc.hashCode();
    }

    public boolean isAutoHeight()
    {
        return zzmb == -2;
    }

    public boolean isFullWidth()
    {
        return zzma == -1;
    }

    public String toString()
    {
        return zzmc;
    }

}
