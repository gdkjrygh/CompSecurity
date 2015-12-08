// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import com.google.android.gms.internal.hm;

// Referenced classes of package com.google.android.gms.maps.model:
//            LatLngBounds, LatLng

public static final class aaN
{

    private double aaK;
    private double aaL;
    private double aaM;
    private double aaN;

    private boolean d(double d1)
    {
        boolean flag = false;
        if (aaM <= aaN)
        {
            return aaM <= d1 && d1 <= aaN;
        }
        if (aaM <= d1 || d1 <= aaN)
        {
            flag = true;
        }
        return flag;
    }

    public LatLngBounds build()
    {
        boolean flag;
        if (!Double.isNaN(aaM))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        hm.a(flag, "no included points");
        return new LatLngBounds(new LatLng(aaK, aaM), new LatLng(aaL, aaN));
    }

    public aaN include(LatLng latlng)
    {
        aaK = Math.min(aaK, latlng.latitude);
        aaL = Math.max(aaL, latlng.latitude);
        double d1 = latlng.longitude;
        if (Double.isNaN(aaM))
        {
            aaM = d1;
            aaN = d1;
        } else
        if (!d(d1))
        {
            if (LatLngBounds.d(aaM, d1) < LatLngBounds.e(aaN, d1))
            {
                aaM = d1;
                return this;
            } else
            {
                aaN = d1;
                return this;
            }
        }
        return this;
    }

    public ()
    {
        aaK = (1.0D / 0.0D);
        aaL = (-1.0D / 0.0D);
        aaM = (0.0D / 0.0D);
        aaN = (0.0D / 0.0D);
    }
}
