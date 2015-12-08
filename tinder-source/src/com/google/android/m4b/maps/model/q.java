// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.model;

import android.os.Parcel;
import com.google.android.m4b.maps.k.a;
import com.google.android.m4b.maps.k.b;

// Referenced classes of package com.google.android.m4b.maps.model:
//            StreetViewPanoramaLink, LatLng, StreetViewPanoramaLocation

public final class q
    implements android.os.Parcelable.Creator
{

    public q()
    {
    }

    public static StreetViewPanoramaLocation a(Parcel parcel)
    {
        int j = com.google.android.m4b.maps.k.a.a(parcel);
        LatLng latlng = null;
        StreetViewPanoramaLink astreetviewpanoramalink[] = null;
        int i = 0;
        String s = null;
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
                    astreetviewpanoramalink = (StreetViewPanoramaLink[])com.google.android.m4b.maps.k.a.b(parcel, k, StreetViewPanoramaLink.CREATOR);
                    break;

                case 3: // '\003'
                    latlng = (LatLng)com.google.android.m4b.maps.k.a.a(parcel, k, LatLng.CREATOR);
                    break;

                case 4: // '\004'
                    s = com.google.android.m4b.maps.k.a.i(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.m4b.maps.k.a.a((new StringBuilder(37)).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new StreetViewPanoramaLocation(i, astreetviewpanoramalink, latlng, s);
            }
        } while (true);
    }

    static void a(StreetViewPanoramaLocation streetviewpanoramalocation, Parcel parcel, int i)
    {
        int j = b.a(parcel, 20293);
        b.b(parcel, 1, streetviewpanoramalocation.a);
        b.a(parcel, 2, streetviewpanoramalocation.b, i);
        b.a(parcel, 3, streetviewpanoramalocation.c, i);
        b.a(parcel, 4, streetviewpanoramalocation.d);
        b.b(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public final volatile Object[] newArray(int i)
    {
        return new StreetViewPanoramaLocation[i];
    }
}
