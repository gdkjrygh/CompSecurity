// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.common.internal:
//            ResolveAccountRequest

public class zzv
    implements android.os.Parcelable.Creator
{

    public zzv()
    {
    }

    static void a(ResolveAccountRequest resolveaccountrequest, Parcel parcel, int i)
    {
        int j = zzb.a(parcel);
        zzb.a(parcel, 1, resolveaccountrequest.a);
        zzb.a(parcel, 2, resolveaccountrequest.a(), i, false);
        zzb.a(parcel, 3, resolveaccountrequest.b());
        zzb.a(parcel, j);
    }

    public ResolveAccountRequest a(Parcel parcel)
    {
        int i = 0;
        int k = zza.b(parcel);
        Account account = null;
        int j = 0;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = zza.a(parcel);
                switch (zza.a(l))
                {
                default:
                    zza.b(parcel, l);
                    break;

                case 1: // '\001'
                    j = zza.f(parcel, l);
                    break;

                case 2: // '\002'
                    account = (Account)zza.a(parcel, l, Account.CREATOR);
                    break;

                case 3: // '\003'
                    i = zza.f(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            } else
            {
                return new ResolveAccountRequest(j, account, i);
            }
        } while (true);
    }

    public ResolveAccountRequest[] a(int i)
    {
        return new ResolveAccountRequest[i];
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
