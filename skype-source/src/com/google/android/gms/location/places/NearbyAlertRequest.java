// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.x;
import java.util.Arrays;
import java.util.Set;

// Referenced classes of package com.google.android.gms.location.places:
//            j, PlaceFilter, NearbyAlertFilter

public final class NearbyAlertRequest
    implements SafeParcelable
{

    public static final j CREATOR = new j();
    private final int a;
    private final int b;
    private final int c;
    private final PlaceFilter d = null;
    private final NearbyAlertFilter e;
    private final boolean f;

    NearbyAlertRequest(int i, int k, int l, PlaceFilter placefilter, NearbyAlertFilter nearbyalertfilter, boolean flag)
    {
        a = i;
        b = k;
        c = l;
        f = flag;
        if (nearbyalertfilter != null)
        {
            e = nearbyalertfilter;
        } else
        if (placefilter != null)
        {
            if (placefilter.b() != null && !placefilter.b().isEmpty() || placefilter.a() != null && !placefilter.a().isEmpty() || placefilter.c() != null && !placefilter.c().isEmpty())
            {
                i = 1;
            } else
            {
                i = 0;
            }
            if (i != 0)
            {
                e = NearbyAlertFilter.a(placefilter.a(), placefilter.b(), placefilter.c());
            } else
            {
                e = null;
            }
        } else
        {
            e = null;
        }
    }

    public final int a()
    {
        return a;
    }

    public final int b()
    {
        return b;
    }

    public final int c()
    {
        return c;
    }

    public final PlaceFilter d()
    {
        return d;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final NearbyAlertFilter e()
    {
        return e;
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
            if (b != ((NearbyAlertRequest) (obj)).b || c != ((NearbyAlertRequest) (obj)).c || !x.a(d, ((NearbyAlertRequest) (obj)).d) || !x.a(e, ((NearbyAlertRequest) (obj)).e))
            {
                return false;
            }
        }
        return true;
    }

    public final boolean f()
    {
        return f;
    }

    public final int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            Integer.valueOf(b), Integer.valueOf(c)
        });
    }

    public final String toString()
    {
        return x.a(this).a("transitionTypes", Integer.valueOf(b)).a("loiteringTimeMillis", Integer.valueOf(c)).a("nearbyAlertFilter", e).toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        j.a(this, parcel, i);
    }

}
