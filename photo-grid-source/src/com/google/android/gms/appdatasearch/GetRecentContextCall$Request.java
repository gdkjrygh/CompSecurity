// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appdatasearch;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.appdatasearch:
//            k

public class <init>
    implements SafeParcelable
{

    public static final k CREATOR = new k();
    final int a;
    public final Account b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final String f;

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        k.a(this, parcel, i);
    }


    public ()
    {
        this(null, false, false, false, null);
    }

    <init>(int i, Account account, boolean flag, boolean flag1, boolean flag2, String s)
    {
        a = i;
        b = account;
        c = flag;
        d = flag1;
        e = flag2;
        f = s;
    }

    public f(Account account, boolean flag, boolean flag1, boolean flag2, String s)
    {
        this(1, account, flag, flag1, flag2, s);
    }
}
