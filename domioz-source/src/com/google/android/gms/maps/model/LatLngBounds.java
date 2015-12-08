// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.an;
import com.google.android.gms.common.internal.ao;
import com.google.android.gms.common.internal.ap;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.maps.internal.ag;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.maps.model:
//            l, LatLng

public final class LatLngBounds
    implements SafeParcelable
{

    public static final l CREATOR = new l();
    public final LatLng a;
    public final LatLng b;
    private final int c;

    LatLngBounds(int i, LatLng latlng, LatLng latlng1)
    {
        ap.a(latlng, "null southwest");
        ap.a(latlng1, "null northeast");
        double d;
        double d1;
        boolean flag;
        if (latlng1.a >= latlng.a)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        d = latlng.a;
        d1 = latlng1.a;
        if (!flag)
        {
            throw new IllegalArgumentException(String.format("southern latitude exceeds northern latitude (%s > %s)", new Object[] {
                Double.valueOf(d), Double.valueOf(d1)
            }));
        } else
        {
            c = i;
            a = latlng;
            b = latlng1;
            return;
        }
    }

    final int a()
    {
        return c;
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
            if (!a.equals(((LatLngBounds) (obj)).a) || !b.equals(((LatLngBounds) (obj)).b))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            a, b
        });
    }

    public final String toString()
    {
        return an.a(this).a("southwest", a).a("northeast", b).toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        if (ag.a())
        {
            int j = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, c);
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, a, i);
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, b, i);
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, j);
            return;
        } else
        {
            l.a(this, parcel, i);
            return;
        }
    }

}
