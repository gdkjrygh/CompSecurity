// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.maps.model:
//            LatLngBounds, LatLng

public class zzd
    implements android.os.Parcelable.Creator
{

    public zzd()
    {
    }

    static void a(LatLngBounds latlngbounds, Parcel parcel, int i)
    {
        int j = zzb.a(parcel);
        zzb.a(parcel, 1, latlngbounds.a());
        zzb.a(parcel, 2, latlngbounds.a, i, false);
        zzb.a(parcel, 3, latlngbounds.b, i, false);
        zzb.a(parcel, j);
    }

    public LatLngBounds a(Parcel parcel)
    {
        LatLng latlng = null;
        int j = zza.b(parcel);
        int i = 0;
        LatLng latlng1 = null;
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
                    latlng1 = (LatLng)zza.a(parcel, k, LatLng.CREATOR);
                    break;

                case 3: // '\003'
                    latlng = (LatLng)zza.a(parcel, k, LatLng.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new LatLngBounds(i, latlng1, latlng);
            }
        } while (true);
    }

    public LatLngBounds[] a(int i)
    {
        return new LatLngBounds[i];
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
