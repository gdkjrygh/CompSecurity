// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.location:
//            LocationAvailability

public class LocationAvailabilityCreator
    implements android.os.Parcelable.Creator
{

    public LocationAvailabilityCreator()
    {
    }

    static void a(LocationAvailability locationavailability, Parcel parcel, int i)
    {
        i = zzb.a(parcel);
        zzb.a(parcel, 1, locationavailability.a);
        zzb.a(parcel, 1000, locationavailability.b());
        zzb.a(parcel, 2, locationavailability.b);
        zzb.a(parcel, 3, locationavailability.c);
        zzb.a(parcel, 4, locationavailability.d);
        zzb.a(parcel, i);
    }

    public LocationAvailability a(Parcel parcel)
    {
        int i = 1;
        int i1 = zza.b(parcel);
        int l = 0;
        int k = 1000;
        long l1 = 0L;
        int j = 1;
        do
        {
            if (parcel.dataPosition() < i1)
            {
                int j1 = zza.a(parcel);
                switch (zza.a(j1))
                {
                default:
                    zza.b(parcel, j1);
                    break;

                case 1: // '\001'
                    j = zza.f(parcel, j1);
                    break;

                case 1000: 
                    l = zza.f(parcel, j1);
                    break;

                case 2: // '\002'
                    i = zza.f(parcel, j1);
                    break;

                case 3: // '\003'
                    l1 = zza.h(parcel, j1);
                    break;

                case 4: // '\004'
                    k = zza.f(parcel, j1);
                    break;
                }
            } else
            if (parcel.dataPosition() != i1)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(i1).toString(), parcel);
            } else
            {
                return new LocationAvailability(l, k, j, i, l1);
            }
        } while (true);
    }

    public LocationAvailability[] a(int i)
    {
        return new LocationAvailability[i];
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
