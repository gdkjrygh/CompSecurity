// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.j;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.m4b.maps.g.g;
import com.google.android.m4b.maps.h.o;
import com.google.android.m4b.maps.k.c;

// Referenced classes of package com.google.android.m4b.maps.j:
//            c, q

public final class aa
    implements c
{

    public static final android.os.Parcelable.Creator CREATOR = new com.google.android.m4b.maps.j.c();
    final int a;
    final int b;
    final IBinder c;
    final o d[];
    final Bundle e;
    final String f;

    aa(int i, int j, IBinder ibinder, o ao[], Bundle bundle, String s)
    {
        a = i;
        b = j;
        c = ibinder;
        d = ao;
        e = bundle;
        f = s;
    }

    public aa(q q1, o ao[], String s)
    {
        int i = g.a;
        if (q1 == null)
        {
            q1 = null;
        } else
        {
            q1 = q1.asBinder();
        }
        this(1, i, ((IBinder) (q1)), ao, null, s);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.m4b.maps.j.c.a(this, parcel, i);
    }

}
