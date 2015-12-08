// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.j;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.m4b.maps.g.g;
import com.google.android.m4b.maps.h.o;
import com.google.android.m4b.maps.k.c;

// Referenced classes of package com.google.android.m4b.maps.j:
//            k, a

public final class i
    implements c
{

    public static final android.os.Parcelable.Creator CREATOR = new k();
    final int a;
    final int b;
    int c;
    String d;
    IBinder e;
    o f[];
    Bundle g;
    Account h;

    public i(int j)
    {
        a = 2;
        c = g.a;
        b = j;
    }

    i(int j, int l, int i1, String s, IBinder ibinder, o ao[], Bundle bundle, 
            Account account)
    {
        a = j;
        b = l;
        c = i1;
        d = s;
        if (j < 2)
        {
            s = null;
            if (ibinder != null)
            {
                s = com.google.android.m4b.maps.j.a.a(q.a.a(ibinder));
            }
            h = s;
        } else
        {
            e = ibinder;
            h = account;
        }
        f = ao;
        g = bundle;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int j)
    {
        k.a(this, parcel, j);
    }

}
