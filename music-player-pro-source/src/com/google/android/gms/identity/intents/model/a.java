// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.identity.intents.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.identity.intents.model:
//            CountrySpecification

public class a
    implements android.os.Parcelable.Creator
{

    public a()
    {
    }

    static void a(CountrySpecification countryspecification, Parcel parcel, int i)
    {
        i = b.H(parcel);
        b.c(parcel, 1, countryspecification.getVersionCode());
        b.a(parcel, 2, countryspecification.vk, false);
        b.H(parcel, i);
    }

    public CountrySpecification cG(Parcel parcel)
    {
        int j = com.google.android.gms.common.internal.safeparcel.a.G(parcel);
        int i = 0;
        String s = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = com.google.android.gms.common.internal.safeparcel.a.F(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.aH(k))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
                    break;

                case 2: // '\002'
                    s = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new CountrySpecification(i, s);
            }
        } while (true);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return cG(parcel);
    }

    public CountrySpecification[] et(int i)
    {
        return new CountrySpecification[i];
    }

    public Object[] newArray(int i)
    {
        return et(i);
    }
}
