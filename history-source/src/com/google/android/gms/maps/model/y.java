// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.maps.model:
//            VisibleRegion, LatLng, LatLngBounds

public class y
    implements android.os.Parcelable.Creator
{

    public y()
    {
    }

    static void a(VisibleRegion visibleregion, Parcel parcel, int i)
    {
        int j = b.H(parcel);
        b.c(parcel, 1, visibleregion.getVersionCode());
        b.a(parcel, 2, visibleregion.nearLeft, i, false);
        b.a(parcel, 3, visibleregion.nearRight, i, false);
        b.a(parcel, 4, visibleregion.farLeft, i, false);
        b.a(parcel, 5, visibleregion.farRight, i, false);
        b.a(parcel, 6, visibleregion.latLngBounds, i, false);
        b.H(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return _mthdo(parcel);
    }

    public VisibleRegion _mthdo(Parcel parcel)
    {
        LatLngBounds latlngbounds = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.G(parcel);
        int i = 0;
        LatLng latlng = null;
        LatLng latlng1 = null;
        LatLng latlng2 = null;
        LatLng latlng3 = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = com.google.android.gms.common.internal.safeparcel.a.F(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.aH(k))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
                    break;

                case 2: // '\002'
                    latlng3 = (LatLng)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, LatLng.CREATOR);
                    break;

                case 3: // '\003'
                    latlng2 = (LatLng)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, LatLng.CREATOR);
                    break;

                case 4: // '\004'
                    latlng1 = (LatLng)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, LatLng.CREATOR);
                    break;

                case 5: // '\005'
                    latlng = (LatLng)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, LatLng.CREATOR);
                    break;

                case 6: // '\006'
                    latlngbounds = (LatLngBounds)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, LatLngBounds.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new VisibleRegion(i, latlng3, latlng2, latlng1, latlng, latlngbounds);
            }
        } while (true);
    }

    public VisibleRegion[] fk(int i)
    {
        return new VisibleRegion[i];
    }

    public Object[] newArray(int i)
    {
        return fk(i);
    }
}
