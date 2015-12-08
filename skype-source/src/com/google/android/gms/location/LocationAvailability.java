// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.location:
//            e

public final class LocationAvailability
    implements SafeParcelable
{

    public static final e CREATOR = new e();
    int a;
    int b;
    long c;
    int d;
    private final int e;

    LocationAvailability(int i, int j, int k, int l, long l1)
    {
        e = i;
        d = j;
        a = k;
        b = l;
        c = l1;
    }

    final int a()
    {
        return e;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof LocationAvailability)
        {
            if (d == ((LocationAvailability) (obj = (LocationAvailability)obj)).d && a == ((LocationAvailability) (obj)).a && b == ((LocationAvailability) (obj)).b && c == ((LocationAvailability) (obj)).c)
            {
                return true;
            }
        }
        return false;
    }

    public final int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            Integer.valueOf(d), Integer.valueOf(a), Integer.valueOf(b), Long.valueOf(c)
        });
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder("LocationAvailability[isLocationAvailable: ");
        boolean flag;
        if (d < 1000)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return stringbuilder.append(flag).append("]").toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.location.e.a(this, parcel);
    }

}
