// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.common.internal.u;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.maps.model:
//            f, LatLng

public final class LatLngBounds
    implements SafeParcelable
{

    public static final f CREATOR = new f();
    final int a;
    public final LatLng b;
    public final LatLng c;

    LatLngBounds(int i, LatLng latlng, LatLng latlng1)
    {
        u.a(latlng, "null southwest");
        u.a(latlng1, "null northeast");
        boolean flag;
        if (latlng1.b >= latlng.b)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        u.a(flag, "southern latitude exceeds northern latitude (%s > %s)", new Object[] {
            Double.valueOf(latlng.b), Double.valueOf(latlng1.b)
        });
        a = i;
        b = latlng;
        c = latlng1;
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
        return t.a(this).a("southwest", b).a("northeast", c).toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        f.a(this, parcel, i);
    }

}
