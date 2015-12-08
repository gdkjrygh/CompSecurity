// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.location.Location;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.location:
//            LocationResult

public class zzf
    implements android.os.Parcelable.Creator
{

    public zzf()
    {
    }

    static void a(LocationResult locationresult, Parcel parcel, int i)
    {
        i = zzb.a(parcel);
        zzb.c(parcel, 1, locationresult.a(), false);
        zzb.a(parcel, 1000, locationresult.b());
        zzb.a(parcel, i);
    }

    public LocationResult a(Parcel parcel)
    {
        int j = zza.b(parcel);
        int i = 0;
        Object obj = LocationResult.a;
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
                    obj = zza.c(parcel, k, Location.CREATOR);
                    break;

                case 1000: 
                    i = zza.f(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new LocationResult(i, ((java.util.List) (obj)));
            }
        } while (true);
    }

    public LocationResult[] a(int i)
    {
        return new LocationResult[i];
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
