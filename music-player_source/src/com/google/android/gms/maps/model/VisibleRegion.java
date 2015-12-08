// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.internal.gq;
import com.google.android.gms.internal.gr;
import com.google.android.gms.maps.a.b;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.maps.model:
//            o, LatLng, LatLngBounds

public final class VisibleRegion
    implements SafeParcelable
{

    public static final o a = new o();
    public final LatLng b;
    public final LatLng c;
    public final LatLng d;
    public final LatLng e;
    public final LatLngBounds f;
    private final int g;

    VisibleRegion(int i, LatLng latlng, LatLng latlng1, LatLng latlng2, LatLng latlng3, LatLngBounds latlngbounds)
    {
        g = i;
        b = latlng;
        c = latlng1;
        d = latlng2;
        e = latlng3;
        f = latlngbounds;
    }

    final int a()
    {
        return g;
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
        return gq.a(this).a("nearLeft", b).a("nearRight", c).a("farLeft", d).a("farRight", e).a("latLngBounds", f).toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        if (com.google.android.gms.maps.a.b.a())
        {
            int j = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, g);
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, b, i, false);
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, c, i, false);
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, d, i, false);
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, e, i, false);
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 6, f, i, false);
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, j);
            return;
        } else
        {
            o.a(this, parcel, i);
            return;
        }
    }

}
