// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.internal:
//            hd, hh

public class he
    implements android.os.Parcelable.Creator
{

    public he()
    {
    }

    static void a(hd hd1, Parcel parcel, int i)
    {
        int j = b.H(parcel);
        b.a(parcel, 1, hd1.CL, i, false);
        b.c(parcel, 1000, hd1.CK);
        b.a(parcel, 2, hd1.CM, false);
        b.a(parcel, 3, hd1.CN);
        b.a(parcel, 4, hd1.account, i, false);
        b.H(parcel, j);
    }

    public hd[] J(int i)
    {
        return new hd[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return l(parcel);
    }

    public hd l(Parcel parcel)
    {
        boolean flag = false;
        Account account = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.G(parcel);
        String s = null;
        hh ahh[] = null;
        int i = 0;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = com.google.android.gms.common.internal.safeparcel.a.F(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.aH(k))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, k);
                    break;

                case 1: // '\001'
                    ahh = (hh[])com.google.android.gms.common.internal.safeparcel.a.b(parcel, k, hh.CREATOR);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
                    break;

                case 2: // '\002'
                    s = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    break;

                case 3: // '\003'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k);
                    break;

                case 4: // '\004'
                    account = (Account)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, Account.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new hd(i, ahh, s, flag, account);
            }
        } while (true);
    }

    public Object[] newArray(int i)
    {
        return J(i);
    }
}
