// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads;

import android.content.Context;

public final class AdSize
{

    public static final AdSize a = new AdSize(-1, -2, "mb");
    public static final AdSize b = new AdSize(320, 50, "mb");
    public static final AdSize c = new AdSize(300, 250, "as");
    public static final AdSize d = new AdSize(468, 60, "as");
    public static final AdSize e = new AdSize(728, 90, "as");
    public static final AdSize f = new AdSize(160, 600, "as");
    private final com.google.android.gms.ads.AdSize g;

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
        g = adsize;
    }

    public int a()
    {
        return g.getWidth();
    }

    public int a(Context context)
    {
        return g.getWidthInPixels(context);
    }

    public transient AdSize a(AdSize aadsize[])
    {
        AdSize adsize;
        AdSize adsize1;
        adsize = null;
        adsize1 = null;
        if (aadsize != null) goto _L2; else goto _L1
_L1:
        return adsize1;
_L2:
        float f1;
        int i;
        int j;
        int k;
        int l;
        f1 = 0.0F;
        j = a();
        k = b();
        l = aadsize.length;
        i = 0;
_L4:
        adsize1 = adsize;
        if (i >= l) goto _L1; else goto _L3
_L3:
        float f2;
        AdSize adsize2 = aadsize[i];
        int i1 = adsize2.a();
        int j1 = adsize2.b();
        if (!a(i1, j1))
        {
            break MISSING_BLOCK_LABEL_127;
        }
        float f3 = (float)(i1 * j1) / (float)(j * k);
        f2 = f3;
        if (f3 > 1.0F)
        {
            f2 = 1.0F / f3;
        }
        if (f2 <= f1)
        {
            break MISSING_BLOCK_LABEL_127;
        }
        adsize = adsize2;
_L5:
        i++;
        f1 = f2;
          goto _L4
        f2 = f1;
          goto _L5
    }

    public boolean a(int i, int j)
    {
        int k = a();
        int l = b();
        return (float)i <= (float)k * 1.25F && (float)i >= (float)k * 0.8F && (float)j <= (float)l * 1.25F && (float)j >= (float)l * 0.8F;
    }

    public int b()
    {
        return g.getHeight();
    }

    public int b(Context context)
    {
        return g.getHeightInPixels(context);
    }

    public boolean equals(Object obj)
    {
        if (!(obj instanceof AdSize))
        {
            return false;
        } else
        {
            obj = (AdSize)obj;
            return g.equals(((AdSize) (obj)).g);
        }
    }

    public int hashCode()
    {
        return g.hashCode();
    }

    public String toString()
    {
        return g.toString();
    }

}
