// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.common.internal:
//            GetServiceRequest

public class zzh
    implements android.os.Parcelable.Creator
{

    public zzh()
    {
    }

    static void a(GetServiceRequest getservicerequest, Parcel parcel, int i)
    {
        int j = zzb.a(parcel);
        zzb.a(parcel, 1, getservicerequest.a);
        zzb.a(parcel, 2, getservicerequest.b);
        zzb.a(parcel, 3, getservicerequest.c);
        zzb.a(parcel, 4, getservicerequest.d, false);
        zzb.a(parcel, 5, getservicerequest.e, false);
        zzb.a(parcel, 6, getservicerequest.f, i, false);
        zzb.a(parcel, 7, getservicerequest.g, false);
        zzb.a(parcel, 8, getservicerequest.h, i, false);
        zzb.a(parcel, j);
    }

    public GetServiceRequest a(Parcel parcel)
    {
        int i = 0;
        Account account = null;
        int l = zza.b(parcel);
        android.os.Bundle bundle = null;
        Scope ascope[] = null;
        android.os.IBinder ibinder = null;
        String s = null;
        int j = 0;
        int k = 0;
        do
        {
            if (parcel.dataPosition() < l)
            {
                int i1 = zza.a(parcel);
                switch (zza.a(i1))
                {
                default:
                    zza.b(parcel, i1);
                    break;

                case 1: // '\001'
                    k = zza.f(parcel, i1);
                    break;

                case 2: // '\002'
                    j = zza.f(parcel, i1);
                    break;

                case 3: // '\003'
                    i = zza.f(parcel, i1);
                    break;

                case 4: // '\004'
                    s = zza.m(parcel, i1);
                    break;

                case 5: // '\005'
                    ibinder = zza.n(parcel, i1);
                    break;

                case 6: // '\006'
                    ascope = (Scope[])zza.b(parcel, i1, Scope.CREATOR);
                    break;

                case 7: // '\007'
                    bundle = zza.o(parcel, i1);
                    break;

                case 8: // '\b'
                    account = (Account)zza.a(parcel, i1, Account.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(l).toString(), parcel);
            } else
            {
                return new GetServiceRequest(k, j, i, s, ibinder, ascope, bundle, account);
            }
        } while (true);
    }

    public GetServiceRequest[] a(int i)
    {
        return new GetServiceRequest[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object[] newArray(int i)
    {
        return a(i);
    }
}
