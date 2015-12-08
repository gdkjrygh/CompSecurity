// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places.personalized;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.location.places.personalized.internal.TestDataImpl;

// Referenced classes of package com.google.android.gms.location.places.personalized:
//            PlaceUserData, PlaceAlias, HereContent

public final class d
    implements android.os.Parcelable.Creator
{

    public d()
    {
    }

    static void a(PlaceUserData placeuserdata, Parcel parcel)
    {
        int i = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 1, placeuserdata.b);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1000, placeuserdata.a);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 2, placeuserdata.c);
        com.google.android.gms.common.internal.safeparcel.a.c(parcel, 5, placeuserdata.d);
        com.google.android.gms.common.internal.safeparcel.a.c(parcel, 6, placeuserdata.e);
        com.google.android.gms.common.internal.safeparcel.a.c(parcel, 7, placeuserdata.f);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        java.util.ArrayList arraylist = null;
        int j = zza.a(parcel);
        int i = 0;
        java.util.ArrayList arraylist1 = null;
        java.util.ArrayList arraylist2 = null;
        String s = null;
        String s1 = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = parcel.readInt();
                switch (0xffff & k)
                {
                default:
                    zza.b(parcel, k);
                    break;

                case 1: // '\001'
                    s1 = zza.l(parcel, k);
                    break;

                case 1000: 
                    i = zza.e(parcel, k);
                    break;

                case 2: // '\002'
                    s = zza.l(parcel, k);
                    break;

                case 5: // '\005'
                    arraylist2 = zza.c(parcel, k, TestDataImpl.CREATOR);
                    break;

                case 6: // '\006'
                    arraylist1 = zza.c(parcel, k, PlaceAlias.CREATOR);
                    break;

                case 7: // '\007'
                    arraylist = zza.c(parcel, k, HereContent.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new PlaceUserData(i, s1, s, arraylist2, arraylist1, arraylist);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new PlaceUserData[i];
    }
}
