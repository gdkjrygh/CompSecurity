// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.common.internal:
//            zzz

public class zzy
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzz();
    final int zzFG;
    private final Account zzFN;
    private final int zzQs;

    zzy(int i, Account account, int j)
    {
        zzFG = i;
        zzFN = account;
        zzQs = j;
    }

    public zzy(Account account, int i)
    {
        this(1, account, i);
    }

    public int describeContents()
    {
        return 0;
    }

    public Account getAccount()
    {
        return zzFN;
    }

    public int getSessionId()
    {
        return zzQs;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzz.zza(this, parcel, i);
    }

}
