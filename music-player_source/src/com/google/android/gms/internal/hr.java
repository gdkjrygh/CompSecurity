// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.location.LocationRequest;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.internal:
//            jb, hn, gq, gr

public final class hr
    implements SafeParcelable
{

    public static final jb a = new jb();
    final int b;
    private final LocationRequest c;
    private final hn d;

    public hr(int i, LocationRequest locationrequest, hn hn1)
    {
        b = i;
        c = locationrequest;
        d = hn1;
    }

    public final LocationRequest a()
    {
        return c;
    }

    public final hn b()
    {
        return d;
    }

    public final int describeContents()
    {
        jb jb1 = a;
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof hr))
            {
                return false;
            }
            obj = (hr)obj;
            if (!c.equals(((hr) (obj)).c) || !d.equals(((hr) (obj)).d))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            c, d
        });
    }

    public final String toString()
    {
        return gq.a(this).a("locationRequest", c).a("filter", d).toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        jb jb1 = a;
        jb.a(this, parcel, i);
    }

}
