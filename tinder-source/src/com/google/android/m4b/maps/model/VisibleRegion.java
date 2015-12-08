// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.model;

import android.os.Parcel;
import com.google.android.m4b.maps.j.v;
import com.google.android.m4b.maps.k.c;
import java.util.Arrays;

// Referenced classes of package com.google.android.m4b.maps.model:
//            v, LatLng, LatLngBounds

public final class VisibleRegion
    implements c
{

    public static final com.google.android.m4b.maps.model.v CREATOR = new com.google.android.m4b.maps.model.v();
    final int a;
    public final LatLng b;
    public final LatLng c;
    public final LatLng d;
    public final LatLng e;
    public final LatLngBounds f;

    VisibleRegion(int i, LatLng latlng, LatLng latlng1, LatLng latlng2, LatLng latlng3, LatLngBounds latlngbounds)
    {
        a = i;
        b = latlng;
        c = latlng1;
        d = latlng2;
        e = latlng3;
        f = latlngbounds;
    }

    public VisibleRegion(LatLng latlng, LatLng latlng1, LatLng latlng2, LatLng latlng3, LatLngBounds latlngbounds)
    {
        this(1, latlng, latlng1, latlng2, latlng3, latlngbounds);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof VisibleRegion))
            {
                return false;
            }
            obj = (VisibleRegion)obj;
            if (!b.equals(((VisibleRegion) (obj)).b) || !c.equals(((VisibleRegion) (obj)).c) || !d.equals(((VisibleRegion) (obj)).d) || !e.equals(((VisibleRegion) (obj)).e) || !f.equals(((VisibleRegion) (obj)).f))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            b, c, d, e, f
        });
    }

    public final String toString()
    {
        return v.a(this).a("nearLeft", b).a("nearRight", c).a("farLeft", d).a("farRight", e).a("latLngBounds", f).toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        v.a(this, parcel, i);
    }

}
