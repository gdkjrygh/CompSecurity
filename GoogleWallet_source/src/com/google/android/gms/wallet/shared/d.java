// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.shared;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.wallet.shared:
//            LegalDocsForCountry

public final class d
    implements android.os.Parcelable.Creator
{

    public d()
    {
    }

    static void a(LegalDocsForCountry legaldocsforcountry, Parcel parcel, int i)
    {
        i = b.bU(parcel);
        b.c(parcel, 1, legaldocsforcountry.mVersionCode);
        b.a(parcel, 2, legaldocsforcountry.aVH, false);
        b.a(parcel, 3, legaldocsforcountry.aVI, false);
        b.a(parcel, 4, legaldocsforcountry.aVJ, false);
        b.J(parcel, i);
    }

    private static LegalDocsForCountry it(Parcel parcel)
    {
        String as[] = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.bT(parcel);
        String s = null;
        int i = 0;
        String s1 = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = com.google.android.gms.common.internal.safeparcel.a.bS(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.dk(k))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
                    break;

                case 2: // '\002'
                    s = com.google.android.gms.common.internal.safeparcel.a.p(parcel, k);
                    break;

                case 3: // '\003'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.p(parcel, k);
                    break;

                case 4: // '\004'
                    as = com.google.android.gms.common.internal.safeparcel.a.B(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new LegalDocsForCountry(i, s, s1, as);
            }
        } while (true);
    }

    private static LegalDocsForCountry[] ls(int i)
    {
        return new LegalDocsForCountry[i];
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return it(parcel);
    }

    public final Object[] newArray(int i)
    {
        return ls(i);
    }
}
