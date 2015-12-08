// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appdatasearch;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.zza;

public final class e
    implements android.os.Parcelable.Creator
{

    public e()
    {
    }

    static void a(GetRecentContextCall.Request request, Parcel parcel, int i)
    {
        int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 1, request.b, i);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1000, request.a);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 2, request.c);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 3, request.d);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 4, request.e);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 5, request.f);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        String s = null;
        boolean flag = false;
        int j = zza.a(parcel);
        boolean flag1 = false;
        boolean flag2 = false;
        Account account = null;
        int i = 0;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = parcel.readInt();
                switch (0xffff & k)
                {
                default:
                    zza.b(parcel, k);
                    break;

                case 1: // '\001'
                    account = (Account)zza.a(parcel, k, Account.CREATOR);
                    break;

                case 1000: 
                    i = zza.e(parcel, k);
                    break;

                case 2: // '\002'
                    flag2 = zza.c(parcel, k);
                    break;

                case 3: // '\003'
                    flag1 = zza.c(parcel, k);
                    break;

                case 4: // '\004'
                    flag = zza.c(parcel, k);
                    break;

                case 5: // '\005'
                    s = zza.l(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new GetRecentContextCall.Request(i, account, flag2, flag1, flag, s);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new GetRecentContextCall.Request[i];
    }
}
