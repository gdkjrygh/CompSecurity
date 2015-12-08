// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.x;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.location.places:
//            o, PlaceFilter

public final class PlaceRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new o();
    static final long a;
    final int b;
    private final PlaceFilter c;
    private final long d;
    private final int e;
    private final long f;

    public PlaceRequest(int i, PlaceFilter placefilter, long l, int j, long l1)
    {
        b = i;
        c = placefilter;
        d = l;
        e = j;
        f = l1;
    }

    public final PlaceFilter a()
    {
        return c;
    }

    public final long b()
    {
        return d;
    }

    public final int c()
    {
        return e;
    }

    public final long d()
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
            if (!(obj instanceof PlaceRequest))
            {
                return false;
            }
            obj = (PlaceRequest)obj;
            if (!x.a(c, ((PlaceRequest) (obj)).c) || d != ((PlaceRequest) (obj)).d || e != ((PlaceRequest) (obj)).e || f != ((PlaceRequest) (obj)).f)
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            c, Long.valueOf(d), Integer.valueOf(e), Long.valueOf(f)
        });
    }

    public final String toString()
    {
        return x.a(this).a("filter", c).a("interval", Long.valueOf(d)).a("priority", Integer.valueOf(e)).a("expireAt", Long.valueOf(f)).toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        o.a(this, parcel, i);
    }

    static 
    {
        a = TimeUnit.HOURS.toMillis(1L);
    }
}
