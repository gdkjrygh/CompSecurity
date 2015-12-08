// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.internal.gq;
import com.google.android.gms.internal.gr;
import com.google.android.gms.internal.gt;
import com.google.android.gms.maps.a.b;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.maps.model:
//            f, LatLng

public final class LatLngBounds
    implements SafeParcelable
{

    public static final f a = new f();
    public final LatLng b;
    public final LatLng c;
    private final int d;

    LatLngBounds(int i, LatLng latlng, LatLng latlng1)
    {
        gt.a(latlng, "null southwest");
        gt.a(latlng1, "null northeast");
        double d1;
        double d2;
        boolean flag;
        if (latlng1.b >= latlng.b)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        d1 = latlng.b;
        d2 = latlng1.b;
        if (!flag)
        {
            throw new IllegalArgumentException(String.format("southern latitude exceeds northern latitude (%s > %s)", new Object[] {
                Double.valueOf(d1), Double.valueOf(d2)
            }));
        } else
        {
            d = i;
            b = latlng;
            c = latlng1;
            return;
        }
    }

    final int a()
    {
        return d;
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
        return gq.a(this).a("southwest", b).a("northeast", c).toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        if (com.google.android.gms.maps.a.b.a())
        {
            int j = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, d);
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, b, i, false);
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, c, i, false);
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, j);
            return;
        } else
        {
            f.a(this, parcel, i);
            return;
        }
    }

}
