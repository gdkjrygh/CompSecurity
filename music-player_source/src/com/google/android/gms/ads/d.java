// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.gms.internal.ab;
import com.google.android.gms.internal.eh;

public final class d
{

    public static final d a = new d(320, 50, "320x50_mb");
    public static final d b = new d(468, 60, "468x60_as");
    public static final d c = new d(728, 90, "728x90_as");
    public static final d d = new d(300, 250, "300x250_as");
    public static final d e = new d(160, 600, "160x600_as");
    public static final d f = new d(-1, -2, "smart_banner");
    private final int g;
    private final int h;
    private final String i;

    public d(int j, int k)
    {
        StringBuilder stringbuilder = new StringBuilder();
        String s;
        if (j == -1)
        {
            s = "FULL";
        } else
        {
            s = String.valueOf(j);
        }
        stringbuilder = stringbuilder.append(s).append("x");
        if (k == -2)
        {
            s = "AUTO";
        } else
        {
            s = String.valueOf(k);
        }
        this(j, k, stringbuilder.append(s).append("_as").toString());
    }

    d(int j, int k, String s)
    {
        if (j < 0 && j != -1)
        {
            throw new IllegalArgumentException((new StringBuilder("Invalid width for AdSize: ")).append(j).toString());
        }
        if (k < 0 && k != -2)
        {
            throw new IllegalArgumentException((new StringBuilder("Invalid height for AdSize: ")).append(k).toString());
        } else
        {
            g = j;
            h = k;
            i = s;
            return;
        }
    }

    public final int a()
    {
        return h;
    }

    public final int a(Context context)
    {
        if (h == -2)
        {
            return ab.b(context.getResources().getDisplayMetrics());
        } else
        {
            return eh.a(context, h);
        }
    }

    public final int b()
    {
        return g;
    }

    public final int b(Context context)
    {
        if (g == -1)
        {
            return ab.a(context.getResources().getDisplayMetrics());
        } else
        {
            return eh.a(context, g);
        }
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof d))
            {
                return false;
            }
            obj = (d)obj;
            if (g != ((d) (obj)).g || h != ((d) (obj)).h || !i.equals(((d) (obj)).i))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return i.hashCode();
    }

    public final String toString()
    {
        return i;
    }

}
