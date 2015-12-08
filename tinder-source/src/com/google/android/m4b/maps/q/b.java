// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.q;

import android.os.Parcel;
import com.google.android.m4b.maps.j.v;
import com.google.android.m4b.maps.k.c;

// Referenced classes of package com.google.android.m4b.maps.q:
//            c

public final class b
    implements c
{

    public static final com.google.android.m4b.maps.q.c CREATOR = new com.google.android.m4b.maps.q.c();
    final int a;
    public final int b;
    public final String c;

    b(int i, int j, String s)
    {
        a = i;
        b = j;
        c = s;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof b)
        {
            if (((b) (obj = (b)obj)).b == b && v.a(((b) (obj)).c, c))
            {
                return true;
            }
        }
        return false;
    }

    public final int hashCode()
    {
        return b;
    }

    public final String toString()
    {
        return String.format("%d:%s", new Object[] {
            Integer.valueOf(b), c
        });
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.m4b.maps.q.c.a(this, parcel);
    }

}
