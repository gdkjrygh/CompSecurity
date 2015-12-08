// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.model;

import android.os.Parcel;
import com.google.android.m4b.maps.k.a;
import com.google.android.m4b.maps.k.b;

// Referenced classes of package com.google.android.m4b.maps.model:
//            LatLng, LatLngBounds, VisibleRegion

public final class v
    implements android.os.Parcelable.Creator
{

    public v()
    {
    }

    public static VisibleRegion a(Parcel parcel)
    {
        LatLngBounds latlngbounds = null;
        int j = com.google.android.m4b.maps.k.a.a(parcel);
        int i = 0;
        LatLng latlng = null;
        LatLng latlng1 = null;
        LatLng latlng2 = null;
        LatLng latlng3 = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = parcel.readInt();
                switch (0xffff & k)
                {
                default:
                    com.google.android.m4b.maps.k.a.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = com.google.android.m4b.maps.k.a.e(parcel, k);
                    break;

                case 2: // '\002'
                    latlng3 = (LatLng)com.google.android.m4b.maps.k.a.a(parcel, k, LatLng.CREATOR);
                    break;

                case 3: // '\003'
                    latlng2 = (LatLng)com.google.android.m4b.maps.k.a.a(parcel, k, LatLng.CREATOR);
                    break;

                case 4: // '\004'
                    latlng1 = (LatLng)com.google.android.m4b.maps.k.a.a(parcel, k, LatLng.CREATOR);
                    break;

                case 5: // '\005'
                    latlng = (LatLng)com.google.android.m4b.maps.k.a.a(parcel, k, LatLng.CREATOR);
                    break;

                case 6: // '\006'
                    latlngbounds = (LatLngBounds)com.google.android.m4b.maps.k.a.a(parcel, k, LatLngBounds.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.m4b.maps.k.a.a((new StringBuilder(37)).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new VisibleRegion(i, latlng3, latlng2, latlng1, latlng, latlngbounds);
            }
        } while (true);
    }

    static void a(VisibleRegion visibleregion, Parcel parcel, int i)
    {
        int j = b.a(parcel, 20293);
        b.b(parcel, 1, visibleregion.a);
        b.a(parcel, 2, visibleregion.b, i);
        b.a(parcel, 3, visibleregion.c, i);
        b.a(parcel, 4, visibleregion.d, i);
        b.a(parcel, 5, visibleregion.e, i);
        b.a(parcel, 6, visibleregion.f, i);
        b.b(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public final volatile Object[] newArray(int i)
    {
        return new VisibleRegion[i];
    }
}
