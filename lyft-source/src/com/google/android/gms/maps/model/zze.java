// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.maps.model:
//            LatLng

public class zze
    implements android.os.Parcelable.Creator
{

    public zze()
    {
    }

    static void a(LatLng latlng, Parcel parcel, int i)
    {
        i = zzb.a(parcel);
        zzb.a(parcel, 1, latlng.a());
        zzb.a(parcel, 2, latlng.a);
        zzb.a(parcel, 3, latlng.b);
        zzb.a(parcel, i);
    }

    public LatLng a(Parcel parcel)
    {
        double d = 0.0D;
        int j = zza.b(parcel);
        int i = 0;
        double d1 = 0.0D;
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
                    i = zza.f(parcel, k);
                    break;

                case 2: // '\002'
                    d1 = zza.k(parcel, k);
                    break;

                case 3: // '\003'
                    d = zza.k(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new LatLng(i, d1, d);
            }
        } while (true);
    }

    public LatLng[] a(int i)
    {
        return new LatLng[i];
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
