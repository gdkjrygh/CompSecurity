// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
import lgs;

public final class LocationAvailability
    implements SafeParcelable
{

    public static final lgs CREATOR = new lgs();
    public final int a;
    public int b;
    public int c;
    public long d;
    public int e;

    public LocationAvailability(int i, int j, int k, int l, long l1)
    {
        a = i;
        e = j;
        b = k;
        c = l;
        d = l1;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof LocationAvailability)
        {
            if (e == ((LocationAvailability) (obj = (LocationAvailability)obj)).e && b == ((LocationAvailability) (obj)).b && c == ((LocationAvailability) (obj)).c && d == ((LocationAvailability) (obj)).d)
            {
                return true;
            }
        }
        return false;
    }

    public final int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            Integer.valueOf(e), Integer.valueOf(b), Integer.valueOf(c), Long.valueOf(d)
        });
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder("LocationAvailability[isLocationAvailable: ");
        boolean flag;
        if (e < 1000)
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
        lgs.a(this, parcel);
    }

}
