// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import com.google.android.gms.common.internal.u;

// Referenced classes of package com.google.android.gms.maps.model:
//            LatLngBounds, LatLng

public final class d
{

    private double a;
    private double b;
    private double c;
    private double d;

    public d()
    {
        a = (1.0D / 0.0D);
        b = (-1.0D / 0.0D);
        c = (0.0D / 0.0D);
        d = (0.0D / 0.0D);
    }

    private boolean a(double d1)
    {
        boolean flag = false;
        if (c <= d)
        {
            return c <= d1 && d1 <= d;
        }
        if (c <= d1 || d1 <= d)
        {
            flag = true;
        }
        return flag;
    }

    public LatLngBounds a()
    {
        boolean flag;
        if (!Double.isNaN(c))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        u.a(flag, "no included points");
        return new LatLngBounds(new LatLng(a, c), new LatLng(b, d));
    }

    public d a(LatLng latlng)
    {
        a = Math.min(a, latlng.a);
        b = Math.max(b, latlng.a);
        double d1 = latlng.b;
        if (Double.isNaN(c))
        {
            c = d1;
            d = d1;
        } else
        if (!a(d1))
        {
            if (LatLngBounds.a(c, d1) < LatLngBounds.b(d, d1))
            {
                c = d1;
                return this;
            } else
            {
                d = d1;
                return this;
            }
        }
        return this;
    }
}
