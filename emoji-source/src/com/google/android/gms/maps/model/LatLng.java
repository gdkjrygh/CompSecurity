// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.internal.v;

// Referenced classes of package com.google.android.gms.maps.model:
//            LatLngCreator, e

public final class LatLng
    implements SafeParcelable
{

    public static final LatLngCreator CREATOR = new LatLngCreator();
    public final double latitude;
    public final double longitude;
    private final int xM;

    public LatLng(double d, double d1)
    {
        this(1, d, d1);
    }

    LatLng(int i, double d, double d1)
    {
        xM = i;
        if (-180D <= d1 && d1 < 180D)
        {
            longitude = d1;
        } else
        {
            longitude = ((d1 - 180D) % 360D + 360D) % 360D - 180D;
        }
        latitude = Math.max(-90D, Math.min(90D, d));
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof LatLng))
            {
                return false;
            }
            obj = (LatLng)obj;
            if (Double.doubleToLongBits(latitude) != Double.doubleToLongBits(((LatLng) (obj)).latitude) || Double.doubleToLongBits(longitude) != Double.doubleToLongBits(((LatLng) (obj)).longitude))
            {
                return false;
            }
        }
        return true;
    }

    int getVersionCode()
    {
        return xM;
    }

    public int hashCode()
    {
        long l = Double.doubleToLongBits(latitude);
        int i = (int)(l ^ l >>> 32);
        l = Double.doubleToLongBits(longitude);
        return (i + 31) * 31 + (int)(l ^ l >>> 32);
    }

    public String toString()
    {
        return (new StringBuilder()).append("lat/lng: (").append(latitude).append(",").append(longitude).append(")").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        if (v.jL())
        {
            e.a(this, parcel, i);
            return;
        } else
        {
            LatLngCreator.a(this, parcel, i);
            return;
        }
    }

}
