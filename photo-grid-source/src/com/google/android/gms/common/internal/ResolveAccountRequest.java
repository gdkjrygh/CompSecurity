// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.common.internal:
//            bm

public class ResolveAccountRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new bm();
    final int a;
    private final Account b;
    private final int c;

    ResolveAccountRequest(int i, Account account, int j)
    {
        a = i;
        b = account;
        c = j;
    }

    public ResolveAccountRequest(Account account, int i)
    {
        this(1, account, i);
    }

    public final Account a()
    {
        return b;
    }

    public final int b()
    {
        return c;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        bm.a(this, parcel, i);
    }

}
