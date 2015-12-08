// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import com.google.android.gms.internal.dm;

// Referenced classes of package com.google.android.gms.maps.model:
//            LatLngBounds, LatLng

public static final class qy
{

    private double qv;
    private double qw;
    private double qx;
    private double qy;

    private boolean b(double d)
    {
        boolean flag = false;
        if (qx <= qy)
        {
            return qx <= d && d <= qy;
        }
        if (qx <= d || d <= qy)
        {
            flag = true;
        }
        return flag;
    }

    public LatLngBounds build()
    {
        boolean flag;
        if (!Double.isNaN(qx))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        dm.a(flag, "no included points");
        return new LatLngBounds(new LatLng(qv, qx), new LatLng(qw, qy));
    }

    public qy include(LatLng latlng)
    {
        qv = Math.min(qv, latlng.latitude);
        qw = Math.max(qw, latlng.latitude);
        double d = latlng.longitude;
        if (Double.isNaN(qx))
        {
            qx = d;
            qy = d;
        } else
        if (!b(d))
        {
            if (LatLngBounds.d(qx, d) < LatLngBounds.e(qy, d))
            {
                qx = d;
                return this;
            } else
            {
                qy = d;
                return this;
            }
        }
        return this;
    }

    public ()
    {
        qv = (1.0D / 0.0D);
        qw = (-1.0D / 0.0D);
        qx = (0.0D / 0.0D);
        qy = (0.0D / 0.0D);
    }
}
