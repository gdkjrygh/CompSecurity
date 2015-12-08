// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.j;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.m4b.maps.g.a;
import com.google.android.m4b.maps.k.c;

// Referenced classes of package com.google.android.m4b.maps.j:
//            ab

public final class y
    implements c
{

    public static final android.os.Parcelable.Creator CREATOR = new ab();
    final int a;
    public IBinder b;
    public a c;
    public boolean d;
    public boolean e;

    public y()
    {
        this(new a(8, null));
    }

    y(int i, IBinder ibinder, a a1, boolean flag, boolean flag1)
    {
        a = i;
        b = ibinder;
        c = a1;
        d = flag;
        e = flag1;
    }

    private y(a a1)
    {
        this(1, null, a1, false, false);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof y))
            {
                return false;
            }
            obj = (y)obj;
            if (!c.equals(((y) (obj)).c) || !com.google.android.m4b.maps.j.q.a.a(b).equals(com.google.android.m4b.maps.j.q.a.a(((y) (obj)).b)))
            {
                return false;
            }
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.m4b.maps.j.ab.a(this, parcel, i);
    }

}
