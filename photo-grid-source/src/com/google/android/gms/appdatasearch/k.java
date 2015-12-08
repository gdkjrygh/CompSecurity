// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appdatasearch;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

public final class k
    implements android.os.Parcelable.Creator
{

    public k()
    {
    }

    public static GetRecentContextCall.Request a(Parcel parcel)
    {
        String s = null;
        boolean flag = false;
        int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        boolean flag1 = false;
        boolean flag2 = false;
        Account account = null;
        int i = 0;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int l = parcel.readInt();
                switch (0xffff & l)
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, l);
                    break;

                case 1: // '\001'
                    account = (Account)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, Account.CREATOR);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.a.d(parcel, l);
                    break;

                case 2: // '\002'
                    flag2 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l);
                    break;

                case 3: // '\003'
                    flag1 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l);
                    break;

                case 4: // '\004'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l);
                    break;

                case 5: // '\005'
                    s = com.google.android.gms.common.internal.safeparcel.a.j(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new b((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new GetRecentContextCall.Request(i, account, flag2, flag1, flag, s);
            }
        } while (true);
    }

    static void a(GetRecentContextCall.Request request, Parcel parcel, int i)
    {
        int j = c.a(parcel);
        c.a(parcel, 1, request.b, i, false);
        c.a(parcel, 1000, request.a);
        c.a(parcel, 2, request.c);
        c.a(parcel, 3, request.d);
        c.a(parcel, 4, request.e);
        c.a(parcel, 5, request.f, false);
        c.a(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public final Object[] newArray(int i)
    {
        return new GetRecentContextCall.Request[i];
    }
}
