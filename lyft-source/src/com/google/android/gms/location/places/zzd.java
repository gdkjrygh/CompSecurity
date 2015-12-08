// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.location.places:
//            NearbyAlertFilter, UserDataType

public class zzd
    implements android.os.Parcelable.Creator
{

    public zzd()
    {
    }

    static void a(NearbyAlertFilter nearbyalertfilter, Parcel parcel, int i)
    {
        i = zzb.a(parcel);
        zzb.b(parcel, 1, nearbyalertfilter.b, false);
        zzb.a(parcel, 1000, nearbyalertfilter.a);
        zzb.a(parcel, 2, nearbyalertfilter.c, false);
        zzb.c(parcel, 3, nearbyalertfilter.d, false);
        zzb.a(parcel, i);
    }

    public NearbyAlertFilter a(Parcel parcel)
    {
        java.util.ArrayList arraylist2 = null;
        int j = zza.b(parcel);
        int i = 0;
        java.util.ArrayList arraylist1 = null;
        java.util.ArrayList arraylist = null;
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
                    arraylist = zza.A(parcel, k);
                    break;

                case 1000: 
                    i = zza.f(parcel, k);
                    break;

                case 2: // '\002'
                    arraylist1 = zza.z(parcel, k);
                    break;

                case 3: // '\003'
                    arraylist2 = zza.c(parcel, k, UserDataType.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new NearbyAlertFilter(i, arraylist, arraylist1, arraylist2);
            }
        } while (true);
    }

    public NearbyAlertFilter[] a(int i)
    {
        return new NearbyAlertFilter[i];
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
