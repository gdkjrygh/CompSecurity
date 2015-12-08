// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places.personalized;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.location.places.personalized.internal.TestDataImpl;

// Referenced classes of package com.google.android.gms.location.places.personalized:
//            PlaceUserData, PlaceAlias, HereContent

public class zze
    implements android.os.Parcelable.Creator
{

    public zze()
    {
    }

    static void a(PlaceUserData placeuserdata, Parcel parcel, int i)
    {
        i = zzb.a(parcel);
        zzb.a(parcel, 1, placeuserdata.a(), false);
        zzb.a(parcel, 1000, placeuserdata.a);
        zzb.a(parcel, 2, placeuserdata.b(), false);
        zzb.c(parcel, 5, placeuserdata.e(), false);
        zzb.c(parcel, 6, placeuserdata.c(), false);
        zzb.c(parcel, 7, placeuserdata.d(), false);
        zzb.a(parcel, i);
    }

    public PlaceUserData a(Parcel parcel)
    {
        java.util.ArrayList arraylist = null;
        int j = zza.b(parcel);
        int i = 0;
        java.util.ArrayList arraylist1 = null;
        java.util.ArrayList arraylist2 = null;
        String s = null;
        String s1 = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = zza.a(parcel);
                switch (zza.a(k))
                {
                default:
                    zza.b(parcel, k);
                    break;

                case 1: // '\001'
                    s1 = zza.m(parcel, k);
                    break;

                case 1000: 
                    i = zza.f(parcel, k);
                    break;

                case 2: // '\002'
                    s = zza.m(parcel, k);
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
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new PlaceUserData(i, s1, s, arraylist2, arraylist1, arraylist);
            }
        } while (true);
    }

    public PlaceUserData[] a(int i)
    {
        return new PlaceUserData[i];
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
