// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.location.Location;
import com.google.android.gms.ads.b.j;
import com.google.android.gms.ads.formats.b;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import java.util.Date;
import java.util.List;
import java.util.Set;

public final class dr
    implements j
{

    private final Date a;
    private final int b;
    private final Set c;
    private final boolean d;
    private final Location e;
    private final int f;
    private final NativeAdOptionsParcel g;
    private final List h;

    public dr(Date date, int k, Set set, Location location, boolean flag, int l, NativeAdOptionsParcel nativeadoptionsparcel, 
            List list)
    {
        a = date;
        b = k;
        c = set;
        e = location;
        d = flag;
        f = l;
        g = nativeadoptionsparcel;
        h = list;
    }

    public final Date a()
    {
        return a;
    }

    public final int b()
    {
        return b;
    }

    public final Set c()
    {
        return c;
    }

    public final Location d()
    {
        return e;
    }

    public final int e()
    {
        return f;
    }

    public final boolean f()
    {
        return d;
    }

    public final b g()
    {
        if (g == null)
        {
            return null;
        } else
        {
            return (new com.google.android.gms.ads.formats.b.a()).a(g.b).a(g.c).b(g.d).a();
        }
    }

    public final boolean h()
    {
        return h != null && h.contains("2");
    }

    public final boolean i()
    {
        return h != null && h.contains("1");
    }
}
