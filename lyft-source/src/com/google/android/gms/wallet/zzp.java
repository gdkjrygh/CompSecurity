// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.wallet:
//            PaymentMethodTokenizationParameters

public class zzp
    implements android.os.Parcelable.Creator
{

    public zzp()
    {
    }

    static void a(PaymentMethodTokenizationParameters paymentmethodtokenizationparameters, Parcel parcel, int i)
    {
        i = zzb.a(parcel);
        zzb.a(parcel, 1, paymentmethodtokenizationparameters.b());
        zzb.a(parcel, 2, paymentmethodtokenizationparameters.a);
        zzb.a(parcel, 3, paymentmethodtokenizationparameters.b, false);
        zzb.a(parcel, i);
    }

    public PaymentMethodTokenizationParameters a(Parcel parcel)
    {
        int j = 0;
        int k = zza.b(parcel);
        android.os.Bundle bundle = null;
        int i = 0;
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
                    i = zza.f(parcel, l);
                    break;

                case 2: // '\002'
                    j = zza.f(parcel, l);
                    break;

                case 3: // '\003'
                    bundle = zza.o(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            } else
            {
                return new PaymentMethodTokenizationParameters(i, j, bundle);
            }
        } while (true);
    }

    public PaymentMethodTokenizationParameters[] a(int i)
    {
        return new PaymentMethodTokenizationParameters[i];
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
