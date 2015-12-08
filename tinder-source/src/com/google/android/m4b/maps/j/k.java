// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.j;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.m4b.maps.h.o;
import com.google.android.m4b.maps.k.a;
import com.google.android.m4b.maps.k.b;

// Referenced classes of package com.google.android.m4b.maps.j:
//            i

public final class k
    implements android.os.Parcelable.Creator
{

    public k()
    {
    }

    static void a(i j, Parcel parcel, int l)
    {
        int i1 = b.a(parcel, 20293);
        b.b(parcel, 1, j.a);
        b.b(parcel, 2, j.b);
        b.b(parcel, 3, j.c);
        b.a(parcel, 4, j.d);
        b.a(parcel, 5, j.e);
        b.a(parcel, 6, j.f, l);
        b.a(parcel, 7, j.g);
        b.a(parcel, 8, j.h, l);
        b.b(parcel, i1);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int j = 0;
        Account account = null;
        int j1 = com.google.android.m4b.maps.k.a.a(parcel);
        android.os.Bundle bundle = null;
        o ao[] = null;
        android.os.IBinder ibinder = null;
        String s = null;
        int l = 0;
        int i1 = 0;
        do
        {
            if (parcel.dataPosition() < j1)
            {
                int k1 = parcel.readInt();
                switch (0xffff & k1)
                {
                default:
                    com.google.android.m4b.maps.k.a.b(parcel, k1);
                    break;

                case 1: // '\001'
                    i1 = com.google.android.m4b.maps.k.a.e(parcel, k1);
                    break;

                case 2: // '\002'
                    l = com.google.android.m4b.maps.k.a.e(parcel, k1);
                    break;

                case 3: // '\003'
                    j = com.google.android.m4b.maps.k.a.e(parcel, k1);
                    break;

                case 4: // '\004'
                    s = com.google.android.m4b.maps.k.a.i(parcel, k1);
                    break;

                case 5: // '\005'
                    ibinder = com.google.android.m4b.maps.k.a.j(parcel, k1);
                    break;

                case 6: // '\006'
                    ao = (o[])com.google.android.m4b.maps.k.a.b(parcel, k1, o.CREATOR);
                    break;

                case 7: // '\007'
                    bundle = com.google.android.m4b.maps.k.a.k(parcel, k1);
                    break;

                case 8: // '\b'
                    account = (Account)com.google.android.m4b.maps.k.a.a(parcel, k1, Account.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j1)
            {
                throw new com.google.android.m4b.maps.k.a.a((new StringBuilder(37)).append("Overread allowed size end=").append(j1).toString(), parcel);
            } else
            {
                return new i(i1, l, j, s, ibinder, ao, bundle, account);
            }
        } while (true);
    }

    public final Object[] newArray(int j)
    {
        return new i[j];
    }
}
