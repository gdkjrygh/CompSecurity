// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import com.google.android.gms.internal.fq;

// Referenced classes of package com.google.android.gms.maps.model:
//            LatLngBounds, LatLng

public static final class Td
{

    private double Ta;
    private double Tb;
    private double Tc;
    private double Td;

    private boolean d(double d1)
    {
        boolean flag = false;
        if (Tc <= Td)
        {
            return Tc <= d1 && d1 <= Td;
        }
        if (Tc <= d1 || d1 <= Td)
        {
            flag = true;
        }
        return flag;
    }

    public LatLngBounds build()
    {
        boolean flag;
        if (!Double.isNaN(Tc))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        fq.a(flag, "no included points");
        return new LatLngBounds(new LatLng(Ta, Tc), new LatLng(Tb, Td));
    }

    public Td include(LatLng latlng)
    {
        Ta = Math.min(Ta, latlng.latitude);
        Tb = Math.max(Tb, latlng.latitude);
        double d1 = latlng.longitude;
        if (Double.isNaN(Tc))
        {
            Tc = d1;
            Td = d1;
        } else
        if (!d(d1))
        {
            if (LatLngBounds.d(Tc, d1) < LatLngBounds.e(Td, d1))
            {
                Tc = d1;
                return this;
            } else
            {
                Td = d1;
                return this;
            }
        }
        return this;
    }

    public ()
    {
        Ta = (1.0D / 0.0D);
        Tb = (-1.0D / 0.0D);
        Tc = (0.0D / 0.0D);
        Td = (0.0D / 0.0D);
    }
}
