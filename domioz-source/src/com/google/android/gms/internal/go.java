// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

public final class go
    implements android.os.Parcelable.Creator
{

    public go()
    {
    }

    public static zziv.zza a(Parcel parcel)
    {
        boolean flag = false;
        int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        Account account = null;
        boolean flag1 = false;
        boolean flag2 = false;
        int i = 0;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = parcel.readInt();
                switch (0xffff & k)
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, k);
                    break;

                case 1: // '\001'
                    account = (Account)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, Account.CREATOR);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, k);
                    break;

                case 2: // '\002'
                    flag2 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k);
                    break;

                case 3: // '\003'
                    flag1 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k);
                    break;

                case 4: // '\004'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new b((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new zziv.zza(i, account, flag2, flag1, flag);
            }
        } while (true);
    }

    static void a(zziv.zza zza, Parcel parcel, int i)
    {
        int j = c.a(parcel);
        c.a(parcel, 1, zza.b, i);
        c.a(parcel, 1000, zza.a);
        c.a(parcel, 2, zza.c);
        c.a(parcel, 3, zza.d);
        c.a(parcel, 4, zza.e);
        c.a(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public final Object[] newArray(int i)
    {
        return new zziv.zza[i];
    }
}
