// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.location.places:
//            PlaceFilter, UserDataType

public class zzf
    implements android.os.Parcelable.Creator
{

    public zzf()
    {
    }

    static void a(PlaceFilter placefilter, Parcel parcel, int i)
    {
        i = zzb.a(parcel);
        zzb.a(parcel, 1, placefilter.b, false);
        zzb.a(parcel, 1000, placefilter.a);
        zzb.a(parcel, 3, placefilter.c);
        zzb.c(parcel, 4, placefilter.d, false);
        zzb.b(parcel, 6, placefilter.e, false);
        zzb.a(parcel, i);
    }

    public PlaceFilter a(Parcel parcel)
    {
        boolean flag = false;
        java.util.ArrayList arraylist = null;
        int j = zza.b(parcel);
        java.util.ArrayList arraylist1 = null;
        java.util.ArrayList arraylist2 = null;
        int i = 0;
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
                    arraylist2 = zza.z(parcel, k);
                    break;

                case 1000: 
                    i = zza.f(parcel, k);
                    break;

                case 3: // '\003'
                    flag = zza.c(parcel, k);
                    break;

                case 4: // '\004'
                    arraylist = zza.c(parcel, k, UserDataType.CREATOR);
                    break;

                case 6: // '\006'
                    arraylist1 = zza.A(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new PlaceFilter(i, arraylist2, flag, arraylist1, arraylist);
            }
        } while (true);
    }

    public PlaceFilter[] a(int i)
    {
        return new PlaceFilter[i];
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
