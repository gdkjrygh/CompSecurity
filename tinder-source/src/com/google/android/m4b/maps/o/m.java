// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.o;

import android.os.Parcel;
import com.google.android.m4b.maps.k.c;
import java.util.Arrays;

// Referenced classes of package com.google.android.m4b.maps.o:
//            o

public final class m
    implements c
{

    public static final o CREATOR = new o();
    final int a;
    int b;
    int c;
    long d;
    int e;

    m(int i, int j, int k, int l, long l1)
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
        if (obj instanceof m)
        {
            if (e == ((m) (obj = (m)obj)).e && b == ((m) (obj)).b && c == ((m) (obj)).c && d == ((m) (obj)).d)
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
        boolean flag;
        if (e < 1000)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return (new StringBuilder(48)).append("LocationAvailability[isLocationAvailable: ").append(flag).append("]").toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        o.a(this, parcel);
    }

}
