// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.location.places:
//            PlaceFilter, PlaceType, UserDataType

public final class d
    implements android.os.Parcelable.Creator
{

    public d()
    {
    }

    static void a(PlaceFilter placefilter, Parcel parcel, int i)
    {
        i = b.bU(parcel);
        b.d(parcel, 1, placefilter.avV, false);
        b.c(parcel, 1000, placefilter.mVersionCode);
        b.a(parcel, 2, placefilter.getTextQuery(), false);
        b.a(parcel, 3, placefilter.getRequireOpenNow());
        b.d(parcel, 4, placefilter.awf, false);
        b.c(parcel, 6, placefilter.awg, false);
        b.J(parcel, i);
    }

    public static PlaceFilter fN(Parcel parcel)
    {
        boolean flag = false;
        java.util.ArrayList arraylist = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.bT(parcel);
        java.util.ArrayList arraylist1 = null;
        String s = null;
        java.util.ArrayList arraylist2 = null;
        int i = 0;
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
                    arraylist2 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k, PlaceType.CREATOR);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
                    break;

                case 2: // '\002'
                    s = com.google.android.gms.common.internal.safeparcel.a.p(parcel, k);
                    break;

                case 3: // '\003'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k);
                    break;

                case 4: // '\004'
                    arraylist1 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k, UserDataType.CREATOR);
                    break;

                case 6: // '\006'
                    arraylist = com.google.android.gms.common.internal.safeparcel.a.E(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new PlaceFilter(i, arraylist2, s, flag, arraylist1, arraylist);
            }
        } while (true);
    }

    private static PlaceFilter[] ig(int i)
    {
        return new PlaceFilter[i];
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return fN(parcel);
    }

    public final Object[] newArray(int i)
    {
        return ig(i);
    }
}
