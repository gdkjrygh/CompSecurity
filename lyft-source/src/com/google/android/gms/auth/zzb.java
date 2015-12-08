// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;

// Referenced classes of package com.google.android.gms.auth:
//            AccountChangeEventsRequest

public class zzb
    implements android.os.Parcelable.Creator
{

    public zzb()
    {
    }

    static void a(AccountChangeEventsRequest accountchangeeventsrequest, Parcel parcel, int i)
    {
        int j = com.google.android.gms.common.internal.safeparcel.zzb.a(parcel);
        com.google.android.gms.common.internal.safeparcel.zzb.a(parcel, 1, accountchangeeventsrequest.a);
        com.google.android.gms.common.internal.safeparcel.zzb.a(parcel, 2, accountchangeeventsrequest.b);
        com.google.android.gms.common.internal.safeparcel.zzb.a(parcel, 3, accountchangeeventsrequest.c, false);
        com.google.android.gms.common.internal.safeparcel.zzb.a(parcel, 4, accountchangeeventsrequest.d, i, false);
        com.google.android.gms.common.internal.safeparcel.zzb.a(parcel, j);
    }

    public AccountChangeEventsRequest a(Parcel parcel)
    {
        Account account = null;
        int j = 0;
        int k = zza.b(parcel);
        String s = null;
        int i = 0;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = zza.a(parcel);
                switch (zza.a(l))
                {
                default:
                    zza.b(parcel, l);
                    break;

                case 1: // '\001'
                    i = zza.f(parcel, l);
                    break;

                case 2: // '\002'
                    j = zza.f(parcel, l);
                    break;

                case 3: // '\003'
                    s = zza.m(parcel, l);
                    break;

                case 4: // '\004'
                    account = (Account)zza.a(parcel, l, Account.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            } else
            {
                return new AccountChangeEventsRequest(i, j, s, account);
            }
        } while (true);
    }

    public AccountChangeEventsRequest[] a(int i)
    {
        return new AccountChangeEventsRequest[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object[] newArray(int i)
    {
        return a(i);
    }
}
