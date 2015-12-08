// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.maps.model:
//            VisibleRegion, LatLng, LatLngBounds

public class zzo
    implements android.os.Parcelable.Creator
{

    public zzo()
    {
    }

    static void a(VisibleRegion visibleregion, Parcel parcel, int i)
    {
        int j = zzb.a(parcel);
        zzb.a(parcel, 1, visibleregion.a());
        zzb.a(parcel, 2, visibleregion.a, i, false);
        zzb.a(parcel, 3, visibleregion.b, i, false);
        zzb.a(parcel, 4, visibleregion.c, i, false);
        zzb.a(parcel, 5, visibleregion.d, i, false);
        zzb.a(parcel, 6, visibleregion.e, i, false);
        zzb.a(parcel, j);
    }

    public VisibleRegion a(Parcel parcel)
    {
        LatLngBounds latlngbounds = null;
        int j = zza.b(parcel);
        int i = 0;
        LatLng latlng = null;
        LatLng latlng1 = null;
        LatLng latlng2 = null;
        LatLng latlng3 = null;
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
                    latlng3 = (LatLng)zza.a(parcel, k, LatLng.CREATOR);
                    break;

                case 3: // '\003'
                    latlng2 = (LatLng)zza.a(parcel, k, LatLng.CREATOR);
                    break;

                case 4: // '\004'
                    latlng1 = (LatLng)zza.a(parcel, k, LatLng.CREATOR);
                    break;

                case 5: // '\005'
                    latlng = (LatLng)zza.a(parcel, k, LatLng.CREATOR);
                    break;

                case 6: // '\006'
                    latlngbounds = (LatLngBounds)zza.a(parcel, k, LatLngBounds.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new VisibleRegion(i, latlng3, latlng2, latlng1, latlng, latlngbounds);
            }
        } while (true);
    }

    public VisibleRegion[] a(int i)
    {
        return new VisibleRegion[i];
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
