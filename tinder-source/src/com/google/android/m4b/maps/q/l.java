// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.q;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.m4b.maps.k.c;
import com.google.android.m4b.maps.o.n;

// Referenced classes of package com.google.android.m4b.maps.q:
//            m, j

public final class l
    implements c
{

    public static final m CREATOR = new m();
    final int a;
    int b;
    j c;
    n d;
    PendingIntent e;
    com.google.android.m4b.maps.o.l f;

    l(int i, int j, j j1, IBinder ibinder, PendingIntent pendingintent, IBinder ibinder1)
    {
        Object obj = null;
        super();
        a = i;
        b = j;
        c = j1;
        if (ibinder == null)
        {
            j1 = null;
        } else
        {
            j1 = com.google.android.m4b.maps.o.n.a.a(ibinder);
        }
        d = j1;
        e = pendingintent;
        if (ibinder1 == null)
        {
            j1 = obj;
        } else
        {
            j1 = com.google.android.m4b.maps.o.a.a(ibinder1);
        }
        f = j1;
    }

    public static l a(com.google.android.m4b.maps.o.l l1)
    {
        return new l(1, 2, null, null, null, l1.asBinder());
    }

    public static l a(n n1)
    {
        return new l(1, 2, null, n1.asBinder(), null, null);
    }

    public static l a(j j, n n1)
    {
        return new l(1, 1, j, n1.asBinder(), null, null);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        m.a(this, parcel, i);
    }

}
