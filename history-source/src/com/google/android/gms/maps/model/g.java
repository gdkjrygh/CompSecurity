// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.maps.model:
//            LatLngBounds, LatLng

public class g
    implements android.os.Parcelable.Creator
{

    public g()
    {
    }

    static void a(LatLngBounds latlngbounds, Parcel parcel, int i)
    {
        int j = b.H(parcel);
        b.c(parcel, 1, latlngbounds.getVersionCode());
        b.a(parcel, 2, latlngbounds.southwest, i, false);
        b.a(parcel, 3, latlngbounds.northeast, i, false);
        b.H(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return dd(parcel);
    }

    public LatLngBounds dd(Parcel parcel)
    {
        LatLng latlng = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.G(parcel);
        int i = 0;
        LatLng latlng1 = null;
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
                    latlng1 = (LatLng)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, LatLng.CREATOR);
                    break;

                case 3: // '\003'
                    latlng = (LatLng)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, LatLng.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new LatLngBounds(i, latlng1, latlng);
            }
        } while (true);
    }

    public LatLngBounds[] eZ(int i)
    {
        return new LatLngBounds[i];
    }

    public Object[] newArray(int i)
    {
        return eZ(i);
    }
}
