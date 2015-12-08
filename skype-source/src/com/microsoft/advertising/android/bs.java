// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.advertising.android;


// Referenced classes of package com.microsoft.advertising.android:
//            ao, ap, ab, bx, 
//            l

final class bs extends ao
{

    private final String c;
    private final boolean d;
    private final boolean e;

    bs(ap ap1, l l)
    {
        super(ap1.m, ap1.n, l);
        c = ap1.f;
        d = ap1.k;
        e = ap1.l;
    }

    public final float d()
    {
        int k;
        if (d)
        {
            k = ab.a().a("MRAID_AD_VISIBILITY_SCREEN_AREA_PP");
        } else
        {
            k = ab.a().a("AD_VISIBILITY_SCREEN_AREA_PP");
        }
        return (float)k / 100F;
    }

    public final d.a e()
    {
        return d.a.c;
    }

    public final boolean f()
    {
        return true;
    }

    final String h()
    {
        return c;
    }

    public final boolean i()
    {
        return d;
    }

    public final boolean j()
    {
        return e;
    }
}
