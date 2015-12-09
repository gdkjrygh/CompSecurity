// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.location.places:
//            PlaceReport

public final class f
    implements android.os.Parcelable.Creator
{

    public f()
    {
    }

    static void a(PlaceReport placereport, Parcel parcel, int i)
    {
        i = b.bU(parcel);
        b.c(parcel, 1, placereport.mVersionCode);
        b.a(parcel, 2, placereport.getPlaceId(), false);
        b.a(parcel, 3, placereport.getTag(), false);
        b.a(parcel, 4, placereport.getSource(), false);
        b.J(parcel, i);
    }

    public static PlaceReport fP(Parcel parcel)
    {
        String s2 = null;
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
                    s2 = com.google.android.gms.common.internal.safeparcel.a.p(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new PlaceReport(i, s, s1, s2);
            }
        } while (true);
    }

    private static PlaceReport[] ij(int i)
    {
        return new PlaceReport[i];
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return fP(parcel);
    }

    public final Object[] newArray(int i)
    {
        return ij(i);
    }
}
