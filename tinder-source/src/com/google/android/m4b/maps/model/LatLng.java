// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.model;

import android.os.Parcel;
import com.google.android.m4b.maps.k.c;

// Referenced classes of package com.google.android.m4b.maps.model:
//            g

public final class LatLng
    implements c
{

    public static final g CREATOR = new g();
    final int a;
    public final double b;
    public final double c;

    public LatLng(double d, double d1)
    {
        this(1, d, d1);
    }

    LatLng(int i, double d, double d1)
    {
        a = i;
        if (-180D <= d1 && d1 < 180D)
        {
            c = d1;
        } else
        {
            c = ((d1 - 180D) % 360D + 360D) % 360D - 180D;
        }
        b = Math.max(-90D, Math.min(90D, d));
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof LatLng))
            {
                return false;
            }
            obj = (LatLng)obj;
            if (Double.doubleToLongBits(b) != Double.doubleToLongBits(((LatLng) (obj)).b) || Double.doubleToLongBits(c) != Double.doubleToLongBits(((LatLng) (obj)).c))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        long l = Double.doubleToLongBits(b);
        int i = (int)(l ^ l >>> 32);
        l = Double.doubleToLongBits(c);
        return (i + 31) * 31 + (int)(l ^ l >>> 32);
    }

    public final String toString()
    {
        double d = b;
        double d1 = c;
        return (new StringBuilder(60)).append("lat/lng: (").append(d).append(",").append(d1).append(")").toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        g.a(this, parcel);
    }

}
