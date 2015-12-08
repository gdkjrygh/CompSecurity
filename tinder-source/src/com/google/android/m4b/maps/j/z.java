// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.j;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.m4b.maps.k.a;
import com.google.android.m4b.maps.k.b;

// Referenced classes of package com.google.android.m4b.maps.j:
//            w

public final class z
    implements android.os.Parcelable.Creator
{

    public z()
    {
    }

    static void a(w w1, Parcel parcel, int i)
    {
        int j = b.a(parcel, 20293);
        b.b(parcel, 1, w1.a);
        b.a(parcel, 2, w1.b, i);
        b.b(parcel, 3, w1.c);
        b.b(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int k = com.google.android.m4b.maps.k.a.a(parcel);
        Account account = null;
        int i = 0;
        int j = 0;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = parcel.readInt();
                switch (0xffff & l)
                {
                default:
                    com.google.android.m4b.maps.k.a.b(parcel, l);
                    break;

                case 1: // '\001'
                    i = com.google.android.m4b.maps.k.a.e(parcel, l);
                    break;

                case 2: // '\002'
                    account = (Account)com.google.android.m4b.maps.k.a.a(parcel, l, Account.CREATOR);
                    break;

                case 3: // '\003'
                    j = com.google.android.m4b.maps.k.a.e(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.m4b.maps.k.a.a((new StringBuilder(37)).append("Overread allowed size end=").append(k).toString(), parcel);
            } else
            {
                return new w(i, account, j);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new w[i];
    }
}
