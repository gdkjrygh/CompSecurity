// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import com.google.android.gms.internal.hn;

// Referenced classes of package com.google.android.gms.maps.model:
//            LatLngBounds, LatLng

public static final class aaK
{

    private double aaH;
    private double aaI;
    private double aaJ;
    private double aaK;

    private boolean d(double d1)
    {
        boolean flag = false;
        if (aaJ <= aaK)
        {
            return aaJ <= d1 && d1 <= aaK;
        }
        if (aaJ <= d1 || d1 <= aaK)
        {
            flag = true;
        }
        return flag;
    }

    public LatLngBounds build()
    {
        boolean flag;
        if (!Double.isNaN(aaJ))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        hn.a(flag, "no included points");
        return new LatLngBounds(new LatLng(aaH, aaJ), new LatLng(aaI, aaK));
    }

    public aaK include(LatLng latlng)
    {
        aaH = Math.min(aaH, latlng.latitude);
        aaI = Math.max(aaI, latlng.latitude);
        double d1 = latlng.longitude;
        if (Double.isNaN(aaJ))
        {
            aaJ = d1;
            aaK = d1;
        } else
        if (!d(d1))
        {
            if (LatLngBounds.d(aaJ, d1) < LatLngBounds.e(aaK, d1))
            {
                aaJ = d1;
                return this;
            } else
            {
                aaK = d1;
                return this;
            }
        }
        return this;
    }

    public ()
    {
        aaH = (1.0D / 0.0D);
        aaI = (-1.0D / 0.0D);
        aaJ = (0.0D / 0.0D);
        aaK = (0.0D / 0.0D);
    }
}
