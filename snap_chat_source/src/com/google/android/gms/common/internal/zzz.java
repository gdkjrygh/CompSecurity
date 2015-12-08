// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.common.internal:
//            zzy

public class zzz
    implements android.os.Parcelable.Creator
{

    public zzz()
    {
    }

    static void zza(zzy zzy1, Parcel parcel, int i)
    {
        int j = zzb.zzK(parcel);
        zzb.zzc(parcel, 1, zzy1.zzFG);
        zzb.zza(parcel, 2, zzy1.getAccount(), i, false);
        zzb.zzc(parcel, 3, zzy1.getSessionId());
        zzb.zzH(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzF(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzaM(i);
    }

    public zzy zzF(Parcel parcel)
    {
        int k = com.google.android.gms.common.internal.safeparcel.zza.zzJ(parcel);
        Account account = null;
        int i = 0;
        int j = 0;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = com.google.android.gms.common.internal.safeparcel.zza.zzI(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.zza.zzaP(l))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel, l);
                    break;

                case 1: // '\001'
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, l);
                    break;

                case 2: // '\002'
                    account = (Account)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, l, Account.CREATOR);
                    break;

                case 3: // '\003'
                    j = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new zzy(i, account, j);
            }
        } while (true);
    }

    public zzy[] zzaM(int i)
    {
        return new zzy[i];
    }
}
