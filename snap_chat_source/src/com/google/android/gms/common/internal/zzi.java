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
//            zzj, zza, zzq

public class zzi
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzj();
    final int version;
    int zzPA;
    String zzPB;
    IBinder zzPC;
    Scope zzPD[];
    Bundle zzPE;
    Account zzPF;
    final int zzPz;

    public zzi(int i)
    {
        version = 2;
        zzPA = 0x6c42d8;
        zzPz = i;
    }

    zzi(int i, int j, int k, String s, IBinder ibinder, Scope ascope[], Bundle bundle, 
            Account account)
    {
        version = i;
        zzPz = j;
        zzPA = k;
        zzPB = s;
        if (i < 2)
        {
            zzPF = zzQ(ibinder);
        } else
        {
            zzPC = ibinder;
            zzPF = account;
        }
        zzPD = ascope;
        zzPE = bundle;
    }

    private Account zzQ(IBinder ibinder)
    {
        Account account = null;
        if (ibinder != null)
        {
            account = com.google.android.gms.common.internal.zza.zzc(zzq.zza.zzR(ibinder));
        }
        return account;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzj.zza(this, parcel, i);
    }

    public zzi zza(Scope ascope[])
    {
        zzPD = ascope;
        return this;
    }

    public zzi zzb(Account account)
    {
        zzPF = account;
        return this;
    }

    public zzi zzbg(String s)
    {
        zzPB = s;
        return this;
    }

    public zzi zzd(zzq zzq1)
    {
        if (zzq1 != null)
        {
            zzPC = zzq1.asBinder();
        }
        return this;
    }

    public zzi zzi(Bundle bundle)
    {
        zzPE = bundle;
        return this;
    }

}
