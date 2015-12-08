// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.auth:
//            AccountChangeEventsRequest

public class AccountChangeEventsRequestCreator
    implements android.os.Parcelable.Creator
{

    public AccountChangeEventsRequestCreator()
    {
    }

    static void zza(AccountChangeEventsRequest accountchangeeventsrequest, Parcel parcel, int i)
    {
        int j = zzb.zzK(parcel);
        zzb.zzc(parcel, 1, accountchangeeventsrequest.zzHe);
        zzb.zzc(parcel, 2, accountchangeeventsrequest.zzHi);
        zzb.zza(parcel, 3, accountchangeeventsrequest.zzHg, false);
        zzb.zza(parcel, 4, accountchangeeventsrequest.zzFN, i, false);
        zzb.zzH(parcel, j);
    }

    public AccountChangeEventsRequest createFromParcel(Parcel parcel)
    {
        Account account = null;
        int k = com.google.android.gms.common.internal.safeparcel.zza.zzJ(parcel);
        int j = 0;
        int i = 0;
        String s = null;
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
                    j = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, l);
                    break;

                case 3: // '\003'
                    s = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, l);
                    break;

                case 4: // '\004'
                    account = (Account)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, l, Account.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new AccountChangeEventsRequest(i, j, s, account);
            }
        } while (true);
    }

    public volatile Object createFromParcel(Parcel parcel)
    {
        return createFromParcel(parcel);
    }

    public AccountChangeEventsRequest[] newArray(int i)
    {
        return new AccountChangeEventsRequest[i];
    }

    public volatile Object[] newArray(int i)
    {
        return newArray(i);
    }
}
