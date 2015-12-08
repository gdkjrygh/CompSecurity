// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.zza;

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
        int i = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 1, placefilter.b);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1000, placefilter.a);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 3, placefilter.c);
        com.google.android.gms.common.internal.safeparcel.a.c(parcel, 4, placefilter.d);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 6, placefilter.e);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        boolean flag = false;
        java.util.ArrayList arraylist = null;
        int j = zza.a(parcel);
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
                    zza.b(parcel, l);
                    break;

                case 1: // '\001'
                    arraylist2 = zza.s(parcel, l);
                    break;

                case 1000: 
                    i = zza.e(parcel, l);
                    break;

                case 3: // '\003'
                    flag = zza.c(parcel, l);
                    break;

                case 4: // '\004'
                    arraylist = zza.c(parcel, l, UserDataType.CREATOR);
                    break;

                case 6: // '\006'
                    arraylist1 = zza.t(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
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
