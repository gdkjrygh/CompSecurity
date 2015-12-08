// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places;

import android.os.Parcel;
import com.google.android.gms.common.internal.an;
import com.google.android.gms.common.internal.ao;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.location.places:
//            f, PlaceFilter

public final class zzf
    implements SafeParcelable
{

    public static final f CREATOR = new f();
    static final long a;
    final int b;
    private final PlaceFilter c;
    private final long d;
    private final int e;
    private final long f;

    public zzf(int i, PlaceFilter placefilter, long l, int j, long l1)
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
            if (!(obj instanceof zzf))
            {
                return false;
            }
            obj = (zzf)obj;
            if (!an.a(c, ((zzf) (obj)).c) || d != ((zzf) (obj)).d || e != ((zzf) (obj)).e || f != ((zzf) (obj)).f)
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
        return an.a(this).a("filter", c).a("interval", Long.valueOf(d)).a("priority", Integer.valueOf(e)).a("expireAt", Long.valueOf(f)).toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.location.places.f.a(this, parcel, i);
    }

    static 
    {
        a = TimeUnit.HOURS.toMillis(1L);
    }
}
