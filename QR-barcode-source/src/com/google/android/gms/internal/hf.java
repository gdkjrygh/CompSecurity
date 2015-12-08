// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.internal:
//            he, hi

public class hf
    implements android.os.Parcelable.Creator
{

    public hf()
    {
    }

    static void a(he he1, Parcel parcel, int i)
    {
        int j = b.D(parcel);
        b.a(parcel, 1, he1.BS, i, false);
        b.c(parcel, 1000, he1.BR);
        b.a(parcel, 2, he1.BT, false);
        b.a(parcel, 3, he1.BU);
        b.a(parcel, 4, he1.account, i, false);
        b.H(parcel, j);
    }

    public he[] I(int i)
    {
        return new he[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return l(parcel);
    }

    public he l(Parcel parcel)
    {
        boolean flag = false;
        Account account = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.C(parcel);
        String s = null;
        hi ahi[] = null;
        int i = 0;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = com.google.android.gms.common.internal.safeparcel.a.B(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.aD(k))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, k);
                    break;

                case 1: // '\001'
                    ahi = (hi[])com.google.android.gms.common.internal.safeparcel.a.b(parcel, k, hi.CREATOR);
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
                return new he(i, ahi, s, flag, account);
            }
        } while (true);
    }

    public Object[] newArray(int i)
    {
        return I(i);
    }
}
