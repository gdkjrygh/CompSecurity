// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.zza;

// Referenced classes of package com.google.android.gms.maps.model:
//            StreetViewPanoramaLocation, StreetViewPanoramaLink, LatLng

public final class n
    implements android.os.Parcelable.Creator
{

    public n()
    {
    }

    static void a(StreetViewPanoramaLocation streetviewpanoramalocation, Parcel parcel, int i)
    {
        int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, streetviewpanoramalocation.a);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 2, streetviewpanoramalocation.b, i);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 3, streetviewpanoramalocation.c, i);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 4, streetviewpanoramalocation.d);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int j = zza.a(parcel);
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
                    zza.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = zza.e(parcel, k);
                    break;

                case 2: // '\002'
                    astreetviewpanoramalink = (StreetViewPanoramaLink[])zza.b(parcel, k, StreetViewPanoramaLink.CREATOR);
                    break;

                case 3: // '\003'
                    latlng = (LatLng)zza.a(parcel, k, LatLng.CREATOR);
                    break;

                case 4: // '\004'
                    s = zza.l(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new StreetViewPanoramaLocation(i, astreetviewpanoramalink, latlng, s);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new StreetViewPanoramaLocation[i];
    }
}
