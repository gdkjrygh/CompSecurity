// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.gms.internal.zzba;
import com.google.android.gms.internal.zzbe;
import com.google.android.gms.internal.zzhw;

public final class AdSize
{

    public static final AdSize BANNER = new AdSize(320, 50, "320x50_mb");
    public static final AdSize FULL_BANNER = new AdSize(468, 60, "468x60_as");
    public static final AdSize LARGE_BANNER = new AdSize(320, 100, "320x100_as");
    public static final AdSize LEADERBOARD = new AdSize(728, 90, "728x90_as");
    public static final AdSize MEDIUM_RECTANGLE = new AdSize(300, 250, "300x250_as");
    public static final AdSize SMART_BANNER = new AdSize(-1, -2, "smart_banner");
    public static final AdSize WIDE_SKYSCRAPER = new AdSize(160, 600, "160x600_as");
    private final int zzli;
    private final int zzlj;
    private final String zzlk;

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
            throw new IllegalArgumentException((new StringBuilder("Invalid width for AdSize: ")).append(i).toString());
        }
        if (j < 0 && j != -2)
        {
            throw new IllegalArgumentException((new StringBuilder("Invalid height for AdSize: ")).append(j).toString());
        } else
        {
            zzli = i;
            zzlj = j;
            zzlk = s;
            return;
        }
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof AdSize))
            {
                return false;
            }
            obj = (AdSize)obj;
            if (zzli != ((AdSize) (obj)).zzli || zzlj != ((AdSize) (obj)).zzlj || !zzlk.equals(((AdSize) (obj)).zzlk))
            {
                return false;
            }
        }
        return true;
    }

    public final int getHeight()
    {
        return zzlj;
    }

    public final int getHeightInPixels(Context context)
    {
        if (zzlj == -2)
        {
            return zzba.zzb(context.getResources().getDisplayMetrics());
        } else
        {
            return zzbe.zzbD().zzb(context, zzlj);
        }
    }

    public final int getWidth()
    {
        return zzli;
    }

    public final int getWidthInPixels(Context context)
    {
        if (zzli == -1)
        {
            return zzba.zza(context.getResources().getDisplayMetrics());
        } else
        {
            return zzbe.zzbD().zzb(context, zzli);
        }
    }

    public final int hashCode()
    {
        return zzlk.hashCode();
    }

    public final String toString()
    {
        return zzlk;
    }

}
