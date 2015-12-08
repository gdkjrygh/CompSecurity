// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.common.internal:
//            GetServiceRequest

public final class l
    implements android.os.Parcelable.Creator
{

    public l()
    {
    }

    static void a(GetServiceRequest getservicerequest, Parcel parcel, int i)
    {
        int j = b.a(parcel);
        b.a(parcel, 1, getservicerequest.a);
        b.a(parcel, 2, getservicerequest.b);
        b.a(parcel, 3, getservicerequest.c);
        b.a(parcel, 4, getservicerequest.d);
        b.a(parcel, 5, getservicerequest.e);
        b.a(parcel, 6, getservicerequest.f, i);
        b.a(parcel, 7, getservicerequest.g);
        b.a(parcel, 8, getservicerequest.h, i);
        b.a(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int i = 0;
        Account account = null;
        int i1 = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        android.os.Bundle bundle = null;
        Scope ascope[] = null;
        android.os.IBinder ibinder = null;
        String s = null;
        int j = 0;
        int k = 0;
        do
        {
            if (parcel.dataPosition() < i1)
            {
                int j1 = parcel.readInt();
                switch (0xffff & j1)
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, j1);
                    break;

                case 1: // '\001'
                    k = com.google.android.gms.common.internal.safeparcel.a.f(parcel, j1);
                    break;

                case 2: // '\002'
                    j = com.google.android.gms.common.internal.safeparcel.a.f(parcel, j1);
                    break;

                case 3: // '\003'
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, j1);
                    break;

                case 4: // '\004'
                    s = com.google.android.gms.common.internal.safeparcel.a.l(parcel, j1);
                    break;

                case 5: // '\005'
                    ibinder = com.google.android.gms.common.internal.safeparcel.a.m(parcel, j1);
                    break;

                case 6: // '\006'
                    ascope = (Scope[])com.google.android.gms.common.internal.safeparcel.a.b(parcel, j1, Scope.CREATOR);
                    break;

                case 7: // '\007'
                    bundle = com.google.android.gms.common.internal.safeparcel.a.n(parcel, j1);
                    break;

                case 8: // '\b'
                    account = (Account)com.google.android.gms.common.internal.safeparcel.a.a(parcel, j1, Account.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != i1)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(i1).toString(), parcel);
            } else
            {
                return new GetServiceRequest(k, j, i, s, ibinder, ascope, bundle, account);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new GetServiceRequest[i];
    }
}
