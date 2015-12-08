// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.identity.intents.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.identity.intents.model:
//            CountrySpecification

public class zza
    implements android.os.Parcelable.Creator
{

    public zza()
    {
    }

    static void a(CountrySpecification countryspecification, Parcel parcel, int i)
    {
        i = zzb.a(parcel);
        zzb.a(parcel, 1, countryspecification.a());
        zzb.a(parcel, 2, countryspecification.a, false);
        zzb.a(parcel, i);
    }

    public CountrySpecification a(Parcel parcel)
    {
        int j = com.google.android.gms.common.internal.safeparcel.zza.b(parcel);
        int i = 0;
        String s = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = com.google.android.gms.common.internal.safeparcel.zza.a(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.zza.a(k))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.zza.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = com.google.android.gms.common.internal.safeparcel.zza.f(parcel, k);
                    break;

                case 2: // '\002'
                    s = com.google.android.gms.common.internal.safeparcel.zza.m(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new CountrySpecification(i, s);
            }
        } while (true);
    }

    public CountrySpecification[] a(int i)
    {
        return new CountrySpecification[i];
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
