// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.os.Parcel;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.common.internal:
//            ValidateAccountRequest

public class zzaa
    implements android.os.Parcelable.Creator
{

    public zzaa()
    {
    }

    static void a(ValidateAccountRequest validateaccountrequest, Parcel parcel, int i)
    {
        int j = zzb.a(parcel);
        zzb.a(parcel, 1, validateaccountrequest.a);
        zzb.a(parcel, 2, validateaccountrequest.a());
        zzb.a(parcel, 3, validateaccountrequest.b, false);
        zzb.a(parcel, 4, validateaccountrequest.b(), i, false);
        zzb.a(parcel, 5, validateaccountrequest.d(), false);
        zzb.a(parcel, 6, validateaccountrequest.c(), false);
        zzb.a(parcel, j);
    }

    public ValidateAccountRequest a(Parcel parcel)
    {
        int i = 0;
        String s = null;
        int k = zza.b(parcel);
        android.os.Bundle bundle = null;
        Scope ascope[] = null;
        android.os.IBinder ibinder = null;
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
                    i = zza.f(parcel, l);
                    break;

                case 3: // '\003'
                    ibinder = zza.n(parcel, l);
                    break;

                case 4: // '\004'
                    ascope = (Scope[])zza.b(parcel, l, Scope.CREATOR);
                    break;

                case 5: // '\005'
                    bundle = zza.o(parcel, l);
                    break;

                case 6: // '\006'
                    s = zza.m(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            } else
            {
                return new ValidateAccountRequest(j, i, ibinder, ascope, bundle, s);
            }
        } while (true);
    }

    public ValidateAccountRequest[] a(int i)
    {
        return new ValidateAccountRequest[i];
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
