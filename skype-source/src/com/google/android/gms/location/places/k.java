// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.location.places:
//            PlaceFilter, UserDataType

public final class k
    implements android.os.Parcelable.Creator
{

    public k()
    {
    }

    static void a(PlaceFilter placefilter, Parcel parcel)
    {
        int i = b.a(parcel);
        b.a(parcel, 1, placefilter.b);
        b.a(parcel, 1000, placefilter.a);
        b.a(parcel, 3, placefilter.c);
        b.c(parcel, 4, placefilter.d);
        b.b(parcel, 6, placefilter.e);
        b.a(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        boolean flag = false;
        java.util.ArrayList arraylist = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        java.util.ArrayList arraylist1 = null;
        java.util.ArrayList arraylist2 = null;
        int i = 0;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int l = parcel.readInt();
                switch (0xffff & l)
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, l);
                    break;

                case 1: // '\001'
                    arraylist2 = com.google.android.gms.common.internal.safeparcel.a.s(parcel, l);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, l);
                    break;

                case 3: // '\003'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l);
                    break;

                case 4: // '\004'
                    arraylist = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l, UserDataType.CREATOR);
                    break;

                case 6: // '\006'
                    arraylist1 = com.google.android.gms.common.internal.safeparcel.a.t(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new PlaceFilter(i, arraylist2, flag, arraylist1, arraylist);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new PlaceFilter[i];
    }
}
