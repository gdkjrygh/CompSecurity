// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import b;
import c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
import kct;
import lit;
import liu;

// Referenced classes of package com.google.android.gms.maps.model:
//            LatLng

public final class LatLngBounds
    implements SafeParcelable
{

    public static final liu CREATOR = new liu();
    public final int a;
    public final LatLng b;
    public final LatLng c;

    public LatLngBounds(int i, LatLng latlng, LatLng latlng1)
    {
        b.f(latlng, "null southwest");
        b.f(latlng1, "null northeast");
        boolean flag;
        if (latlng1.b >= latlng.b)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b.a(flag, "southern latitude exceeds northern latitude (%s > %s)", new Object[] {
            Double.valueOf(latlng.b), Double.valueOf(latlng1.b)
        });
        a = i;
        b = latlng;
        c = latlng1;
    }

    public LatLngBounds(LatLng latlng, LatLng latlng1)
    {
        this(1, latlng, latlng1);
    }

    public static double a(double d, double d1)
    {
        return ((d - d1) + 360D) % 360D;
    }

    public static lit a()
    {
        return new lit();
    }

    public static double b(double d, double d1)
    {
        return ((d1 - d) + 360D) % 360D;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof LatLngBounds))
            {
                return false;
            }
            obj = (LatLngBounds)obj;
            if (!b.equals(((LatLngBounds) (obj)).b) || !c.equals(((LatLngBounds) (obj)).c))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            b, c
        });
    }

    public final String toString()
    {
        return c.b(this).a("southwest", b).a("northeast", c).toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        liu.a(this, parcel, i);
    }

}
