// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.common.internal:
//            ResolveAccountRequest

public final class z
    implements android.os.Parcelable.Creator
{

    public z()
    {
    }

    static void a(ResolveAccountRequest resolveaccountrequest, Parcel parcel, int i)
    {
        int j = b.a(parcel);
        b.a(parcel, 1, resolveaccountrequest.a);
        b.a(parcel, 2, resolveaccountrequest.a(), i);
        b.a(parcel, 3, resolveaccountrequest.b());
        b.a(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int k = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
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
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, l);
                    break;

                case 1: // '\001'
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, l);
                    break;

                case 2: // '\002'
                    account = (Account)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, Account.CREATOR);
                    break;

                case 3: // '\003'
                    j = com.google.android.gms.common.internal.safeparcel.a.f(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new ResolveAccountRequest(i, account, j);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new ResolveAccountRequest[i];
    }
}
