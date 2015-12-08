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

public final class f
    implements android.os.Parcelable.Creator
{

    public f()
    {
    }

    static void a(AccountChangeEventsRequest accountchangeeventsrequest, Parcel parcel, int i)
    {
        int j = zzb.zzak(parcel);
        zzb.zzc(parcel, 1, accountchangeeventsrequest.a);
        zzb.zzc(parcel, 2, accountchangeeventsrequest.b);
        zzb.zza(parcel, 3, accountchangeeventsrequest.c, false);
        zzb.zza(parcel, 4, accountchangeeventsrequest.d, i, false);
        zzb.zzH(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        Account account = null;
        int k = zza.zzaj(parcel);
        int j = 0;
        int i = 0;
        String s = null;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = zza.zzai(parcel);
                switch (zza.zzbH(l))
                {
                default:
                    zza.zzb(parcel, l);
                    break;

                case 1: // '\001'
                    i = zza.zzg(parcel, l);
                    break;

                case 2: // '\002'
                    j = zza.zzg(parcel, l);
                    break;

                case 3: // '\003'
                    s = zza.zzo(parcel, l);
                    break;

                case 4: // '\004'
                    account = (Account)zza.zza(parcel, l, Account.CREATOR);
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

    public final Object[] newArray(int i)
    {
        return new AccountChangeEventsRequest[i];
    }
}
