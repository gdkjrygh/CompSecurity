// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.maps.model:
//            g

public final class LatLng
    implements SafeParcelable
{

    public static final g CREATOR = new g();
    final int a;
    public final double b;
    public final double c;

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
        return (new StringBuilder("lat/lng: (")).append(b).append(",").append(c).append(")").toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        g.a(this, parcel);
    }

}
