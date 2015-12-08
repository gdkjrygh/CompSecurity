// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.t;
import java.util.Arrays;
import java.util.Set;

// Referenced classes of package com.google.android.gms.location.places:
//            j, PlaceFilter, NearbyAlertFilter

public final class NearbyAlertRequest
    implements SafeParcelable
{

    public static final j CREATOR = new j();
    final int a;
    final int b;
    final int c;
    final NearbyAlertFilter d;
    final boolean e;
    final int f;
    private final PlaceFilter g = null;

    NearbyAlertRequest(int i, int k, int l, PlaceFilter placefilter, NearbyAlertFilter nearbyalertfilter, boolean flag, int i1)
    {
        a = i;
        b = k;
        c = l;
        e = flag;
        if (nearbyalertfilter != null)
        {
            d = nearbyalertfilter;
        } else
        if (placefilter != null)
        {
            if (placefilter.f != null && !placefilter.f.isEmpty() || placefilter.h != null && !placefilter.h.isEmpty() || placefilter.g != null && !placefilter.g.isEmpty())
            {
                i = 1;
            } else
            {
                i = 0;
            }
            if (i != 0)
            {
                d = NearbyAlertFilter.a(placefilter.h, placefilter.f, placefilter.g);
            } else
            {
                d = null;
            }
        } else
        {
            d = null;
        }
        f = i1;
    }

    public static PlaceFilter a()
    {
        return null;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof NearbyAlertRequest))
            {
                return false;
            }
            obj = (NearbyAlertRequest)obj;
            if (b != ((NearbyAlertRequest) (obj)).b || c != ((NearbyAlertRequest) (obj)).c || !t.a(g, ((NearbyAlertRequest) (obj)).g) || !t.a(d, ((NearbyAlertRequest) (obj)).d))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            Integer.valueOf(b), Integer.valueOf(c)
        });
    }

    public final String toString()
    {
        return t.a(this).a("transitionTypes", Integer.valueOf(b)).a("loiteringTimeMillis", Integer.valueOf(c)).a("nearbyAlertFilter", d).toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        j.a(this, parcel, i);
    }

}
