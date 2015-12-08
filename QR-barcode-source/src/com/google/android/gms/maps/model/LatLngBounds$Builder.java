// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import com.google.android.gms.common.internal.o;

// Referenced classes of package com.google.android.gms.maps.model:
//            LatLngBounds, LatLng

public static final class akb
{

    private double ajY;
    private double ajZ;
    private double aka;
    private double akb;

    private boolean d(double d1)
    {
        boolean flag = false;
        if (aka <= akb)
        {
            return aka <= d1 && d1 <= akb;
        }
        if (aka <= d1 || d1 <= akb)
        {
            flag = true;
        }
        return flag;
    }

    public LatLngBounds build()
    {
        boolean flag;
        if (!Double.isNaN(aka))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        o.a(flag, "no included points");
        return new LatLngBounds(new LatLng(ajY, aka), new LatLng(ajZ, akb));
    }

    public akb include(LatLng latlng)
    {
        ajY = Math.min(ajY, latlng.latitude);
        ajZ = Math.max(ajZ, latlng.latitude);
        double d1 = latlng.longitude;
        if (Double.isNaN(aka))
        {
            aka = d1;
            akb = d1;
        } else
        if (!d(d1))
        {
            if (LatLngBounds.d(aka, d1) < LatLngBounds.e(akb, d1))
            {
                aka = d1;
                return this;
            } else
            {
                akb = d1;
                return this;
            }
        }
        return this;
    }

    public ()
    {
        ajY = (1.0D / 0.0D);
        ajZ = (-1.0D / 0.0D);
        aka = (0.0D / 0.0D);
        akb = (0.0D / 0.0D);
    }
}
