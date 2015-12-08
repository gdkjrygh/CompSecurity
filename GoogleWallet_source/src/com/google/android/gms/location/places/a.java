// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.location.places:
//            AutocompleteFilter, PlaceType

public final class a
    implements android.os.Parcelable.Creator
{

    public a()
    {
    }

    static void a(AutocompleteFilter autocompletefilter, Parcel parcel, int i)
    {
        i = b.bU(parcel);
        b.a(parcel, 1, autocompletefilter.getRestrictToPlaces());
        b.c(parcel, 1000, autocompletefilter.mVersionCode);
        b.d(parcel, 2, autocompletefilter.avV, false);
        b.J(parcel, i);
    }

    public static AutocompleteFilter fK(Parcel parcel)
    {
        boolean flag = false;
        int j = com.google.android.gms.common.internal.safeparcel.a.bT(parcel);
        java.util.ArrayList arraylist = null;
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
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
                    break;

                case 2: // '\002'
                    arraylist = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k, PlaceType.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new AutocompleteFilter(i, flag, arraylist);
            }
        } while (true);
    }

    private static AutocompleteFilter[] id(int i)
    {
        return new AutocompleteFilter[i];
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return fK(parcel);
    }

    public final Object[] newArray(int i)
    {
        return id(i);
    }
}
