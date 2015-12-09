// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.BitSet;

// Referenced classes of package com.google.android.gms.internal:
//            gk, gq, zzir

public class zzin
    implements SafeParcelable
{

    public static final gk CREATOR = new gk();
    final int a;
    final zzir b[];
    public final String c;
    public final boolean d;
    public final Account e;

    zzin(int i, zzir azzir[], String s, boolean flag, Account account)
    {
        a = i;
        b = azzir;
        c = s;
        d = flag;
        e = account;
    }

    transient zzin(String s, boolean flag, Account account, zzir azzir[])
    {
        this(1, azzir, s, flag, account);
        s = new BitSet(gq.a());
        for (int i = 0; i < azzir.length; i++)
        {
            int j = azzir[i].e;
            if (j == -1)
            {
                continue;
            }
            if (s.get(j))
            {
                throw new IllegalArgumentException((new StringBuilder("Duplicate global search section type ")).append(gq.a(j)).toString());
            }
            s.set(j);
        }

    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        gk.a(this, parcel, i);
    }

}
