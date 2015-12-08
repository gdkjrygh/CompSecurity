// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.zza;

// Referenced classes of package com.google.android.gms.common.internal:
//            GetServiceRequest

public final class i
    implements android.os.Parcelable.Creator
{

    public i()
    {
    }

    static void a(GetServiceRequest getservicerequest, Parcel parcel, int j)
    {
        int k = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, getservicerequest.a);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 2, getservicerequest.b);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 3, getservicerequest.c);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 4, getservicerequest.d);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 5, getservicerequest.e);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 6, getservicerequest.f, j);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 7, getservicerequest.g);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 8, getservicerequest.h, j);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, k);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int j = 0;
        Account account = null;
        int i1 = zza.a(parcel);
        android.os.Bundle bundle = null;
        Scope ascope[] = null;
        android.os.IBinder ibinder = null;
        String s = null;
        int k = 0;
        int l = 0;
        do
        {
            if (parcel.dataPosition() < i1)
            {
                int j1 = parcel.readInt();
                switch (0xffff & j1)
                {
                default:
                    zza.b(parcel, j1);
                    break;

                case 1: // '\001'
                    l = zza.e(parcel, j1);
                    break;

                case 2: // '\002'
                    k = zza.e(parcel, j1);
                    break;

                case 3: // '\003'
                    j = zza.e(parcel, j1);
                    break;

                case 4: // '\004'
                    s = zza.l(parcel, j1);
                    break;

                case 5: // '\005'
                    ibinder = zza.m(parcel, j1);
                    break;

                case 6: // '\006'
                    ascope = (Scope[])zza.b(parcel, j1, Scope.CREATOR);
                    break;

                case 7: // '\007'
                    bundle = zza.n(parcel, j1);
                    break;

                case 8: // '\b'
                    account = (Account)zza.a(parcel, j1, Account.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != i1)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder("Overread allowed size end=")).append(i1).toString(), parcel);
            } else
            {
                return new GetServiceRequest(l, k, j, s, ibinder, ascope, bundle, account);
            }
        } while (true);
    }

    public final Object[] newArray(int j)
    {
        return new GetServiceRequest[j];
    }
}
