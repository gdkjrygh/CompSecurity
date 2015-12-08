// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;

// Referenced classes of package com.google.android.gms.maps:
//            StreetViewPanoramaOptions

public class StreetViewPanoramaOptionsCreator
    implements android.os.Parcelable.Creator
{

    public static final int CONTENT_DESCRIPTION = 0;

    public StreetViewPanoramaOptionsCreator()
    {
    }

    static void a(StreetViewPanoramaOptions streetviewpanoramaoptions, Parcel parcel, int i)
    {
        int j = b.C(parcel);
        b.c(parcel, 1, streetviewpanoramaoptions.getVersionCode());
        b.a(parcel, 2, streetviewpanoramaoptions.getStreetViewPanoramaCamera(), i, false);
        b.a(parcel, 3, streetviewpanoramaoptions.getPanoramaId(), false);
        b.a(parcel, 4, streetviewpanoramaoptions.getPosition(), i, false);
        b.a(parcel, 5, streetviewpanoramaoptions.getRadius(), false);
        b.a(parcel, 6, streetviewpanoramaoptions.jD());
        b.a(parcel, 7, streetviewpanoramaoptions.jv());
        b.a(parcel, 8, streetviewpanoramaoptions.jE());
        b.a(parcel, 9, streetviewpanoramaoptions.jF());
        b.a(parcel, 10, streetviewpanoramaoptions.jr());
        b.G(parcel, j);
    }

    public StreetViewPanoramaOptions createFromParcel(Parcel parcel)
    {
        Integer integer = null;
        byte byte0 = 0;
        int j = com.google.android.gms.common.internal.safeparcel.a.B(parcel);
        byte byte1 = 0;
        byte byte2 = 0;
        byte byte3 = 0;
        byte byte4 = 0;
        LatLng latlng = null;
        String s = null;
        StreetViewPanoramaCamera streetviewpanoramacamera = null;
        int i = 0;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = com.google.android.gms.common.internal.safeparcel.a.A(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.ar(k))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
                    break;

                case 2: // '\002'
                    streetviewpanoramacamera = (StreetViewPanoramaCamera)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, StreetViewPanoramaCamera.CREATOR);
                    break;

                case 3: // '\003'
                    s = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    break;

                case 4: // '\004'
                    latlng = (LatLng)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, LatLng.CREATOR);
                    break;

                case 5: // '\005'
                    integer = com.google.android.gms.common.internal.safeparcel.a.h(parcel, k);
                    break;

                case 6: // '\006'
                    byte4 = com.google.android.gms.common.internal.safeparcel.a.e(parcel, k);
                    break;

                case 7: // '\007'
                    byte3 = com.google.android.gms.common.internal.safeparcel.a.e(parcel, k);
                    break;

                case 8: // '\b'
                    byte2 = com.google.android.gms.common.internal.safeparcel.a.e(parcel, k);
                    break;

                case 9: // '\t'
                    byte1 = com.google.android.gms.common.internal.safeparcel.a.e(parcel, k);
                    break;

                case 10: // '\n'
                    byte0 = com.google.android.gms.common.internal.safeparcel.a.e(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new StreetViewPanoramaOptions(i, streetviewpanoramacamera, s, latlng, integer, byte4, byte3, byte2, byte1, byte0);
            }
        } while (true);
    }

    public volatile Object createFromParcel(Parcel parcel)
    {
        return createFromParcel(parcel);
    }

    public StreetViewPanoramaOptions[] newArray(int i)
    {
        return new StreetViewPanoramaOptions[i];
    }

    public volatile Object[] newArray(int i)
    {
        return newArray(i);
    }
}
