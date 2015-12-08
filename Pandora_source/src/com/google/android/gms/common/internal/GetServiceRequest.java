// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.common.internal:
//            zzh, zza, zzo

public class GetServiceRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzh();
    final int version;
    final int zzTh;
    int zzTi;
    String zzTj;
    IBinder zzTk;
    Scope zzTl[];
    Bundle zzTm;
    Account zzTn;

    public GetServiceRequest(int i)
    {
        version = 2;
        zzTi = 0x6fcd18;
        zzTh = i;
    }

    GetServiceRequest(int i, int j, int k, String s, IBinder ibinder, Scope ascope[], Bundle bundle, 
            Account account)
    {
        version = i;
        zzTh = j;
        zzTi = k;
        zzTj = s;
        if (i < 2)
        {
            zzTn = zzP(ibinder);
        } else
        {
            zzTk = ibinder;
            zzTn = account;
        }
        zzTl = ascope;
        zzTm = bundle;
    }

    private Account zzP(IBinder ibinder)
    {
        Account account = null;
        if (ibinder != null)
        {
            account = com.google.android.gms.common.internal.zza.zzb(zzo.zza.zzQ(ibinder));
        }
        return account;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzh.zza(this, parcel, i);
    }

    public GetServiceRequest zza(Scope ascope[])
    {
        zzTl = ascope;
        return this;
    }

    public GetServiceRequest zzb(Account account)
    {
        zzTn = account;
        return this;
    }

    public GetServiceRequest zzbL(String s)
    {
        zzTj = s;
        return this;
    }

    public GetServiceRequest zzc(zzo zzo1)
    {
        if (zzo1 != null)
        {
            zzTk = zzo1.asBinder();
        }
        return this;
    }

    public GetServiceRequest zzf(Bundle bundle)
    {
        zzTm = bundle;
        return this;
    }

}
