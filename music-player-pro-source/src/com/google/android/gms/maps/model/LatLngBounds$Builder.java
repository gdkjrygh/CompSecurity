// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import com.google.android.gms.internal.jx;

// Referenced classes of package com.google.android.gms.maps.model:
//            LatLngBounds, LatLng

public static final class amn
{

    private double amk;
    private double aml;
    private double amm;
    private double amn;

    private boolean d(double d1)
    {
        boolean flag = false;
        if (amm <= amn)
        {
            return amm <= d1 && d1 <= amn;
        }
        if (amm <= d1 || d1 <= amn)
        {
            flag = true;
        }
        return flag;
    }

    public LatLngBounds build()
    {
        boolean flag;
        if (!Double.isNaN(amm))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        jx.a(flag, "no included points");
        return new LatLngBounds(new LatLng(amk, amm), new LatLng(aml, amn));
    }

    public amn include(LatLng latlng)
    {
        amk = Math.min(amk, latlng.latitude);
        aml = Math.max(aml, latlng.latitude);
        double d1 = latlng.longitude;
        if (Double.isNaN(amm))
        {
            amm = d1;
            amn = d1;
        } else
        if (!d(d1))
        {
            if (LatLngBounds.d(amm, d1) < LatLngBounds.e(amn, d1))
            {
                amm = d1;
                return this;
            } else
            {
                amn = d1;
                return this;
            }
        }
        return this;
    }

    public ()
    {
        amk = (1.0D / 0.0D);
        aml = (-1.0D / 0.0D);
        amm = (0.0D / 0.0D);
        amn = (0.0D / 0.0D);
    }
}
