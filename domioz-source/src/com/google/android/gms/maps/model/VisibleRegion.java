// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.an;
import com.google.android.gms.common.internal.ao;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.maps.internal.ag;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.maps.model:
//            w, LatLng, LatLngBounds

public final class VisibleRegion
    implements SafeParcelable
{

    public static final w CREATOR = new w();
    public final LatLng a;
    public final LatLng b;
    public final LatLng c;
    public final LatLng d;
    public final LatLngBounds e;
    private final int f;

    VisibleRegion(int i, LatLng latlng, LatLng latlng1, LatLng latlng2, LatLng latlng3, LatLngBounds latlngbounds)
    {
        f = i;
        a = latlng;
        b = latlng1;
        c = latlng2;
        d = latlng3;
        e = latlngbounds;
    }

    final int a()
    {
        return f;
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
            if (!a.equals(((VisibleRegion) (obj)).a) || !b.equals(((VisibleRegion) (obj)).b) || !c.equals(((VisibleRegion) (obj)).c) || !d.equals(((VisibleRegion) (obj)).d) || !e.equals(((VisibleRegion) (obj)).e))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            a, b, c, d, e
        });
    }

    public final String toString()
    {
        return an.a(this).a("nearLeft", a).a("nearRight", b).a("farLeft", c).a("farRight", d).a("latLngBounds", e).toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        if (ag.a())
        {
            int j = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, f);
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, a, i);
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, b, i);
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, c, i);
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, d, i);
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 6, e, i);
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, j);
            return;
        } else
        {
            w.a(this, parcel, i);
            return;
        }
    }

}
