// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.j;
import com.google.android.gms.ads.internal.util.client.a;

public final class c
{

    public static final c a = new c(320, 50, "320x50_mb");
    public static final c b = new c(468, 60, "468x60_as");
    public static final c c = new c(320, 100, "320x100_as");
    public static final c d = new c(728, 90, "728x90_as");
    public static final c e = new c(300, 250, "300x250_as");
    public static final c f = new c(160, 600, "160x600_as");
    public static final c g = new c(-1, -2, "smart_banner");
    public static final c h = new c(-3, -4, "fluid");
    public final int i;
    public final int j;
    private final String k;

    public c(int l, int i1)
    {
        StringBuilder stringbuilder = new StringBuilder();
        String s;
        if (l == -1)
        {
            s = "FULL";
        } else
        {
            s = String.valueOf(l);
        }
        stringbuilder = stringbuilder.append(s).append("x");
        if (i1 == -2)
        {
            s = "AUTO";
        } else
        {
            s = String.valueOf(i1);
        }
        this(l, i1, stringbuilder.append(s).append("_as").toString());
    }

    public c(int l, int i1, String s)
    {
        if (l < 0 && l != -1 && l != -3)
        {
            throw new IllegalArgumentException((new StringBuilder("Invalid width for AdSize: ")).append(l).toString());
        }
        if (i1 < 0 && i1 != -2 && i1 != -4)
        {
            throw new IllegalArgumentException((new StringBuilder("Invalid height for AdSize: ")).append(i1).toString());
        } else
        {
            i = l;
            j = i1;
            k = s;
            return;
        }
    }

    public final int a(Context context)
    {
        switch (j)
        {
        default:
            com.google.android.gms.ads.internal.client.j.a();
            return com.google.android.gms.ads.internal.util.client.a.a(context, j);

        case -2: 
            return AdSizeParcel.b(context.getResources().getDisplayMetrics());

        case -4: 
        case -3: 
            return -1;
        }
    }

    public final int b(Context context)
    {
        switch (i)
        {
        case -2: 
        default:
            com.google.android.gms.ads.internal.client.j.a();
            return com.google.android.gms.ads.internal.util.client.a.a(context, i);

        case -1: 
            return AdSizeParcel.a(context.getResources().getDisplayMetrics());

        case -4: 
        case -3: 
            return -1;
        }
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof c))
            {
                return false;
            }
            obj = (c)obj;
            if (i != ((c) (obj)).i || j != ((c) (obj)).j || !k.equals(((c) (obj)).k))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return k.hashCode();
    }

    public final String toString()
    {
        return k;
    }

}
