// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps;

import android.os.Parcel;
import com.google.android.m4b.maps.k.a;
import com.google.android.m4b.maps.k.b;
import com.google.android.m4b.maps.model.LatLng;
import com.google.android.m4b.maps.model.StreetViewPanoramaCamera;

// Referenced classes of package com.google.android.m4b.maps:
//            StreetViewPanoramaOptions

public final class i
    implements android.os.Parcelable.Creator
{

    public i()
    {
    }

    public static StreetViewPanoramaOptions a(Parcel parcel)
    {
        byte byte0 = 0;
        int k = com.google.android.m4b.maps.k.a.a(parcel);
        byte byte1 = 0;
        byte byte2 = 0;
        byte byte3 = 0;
        byte byte4 = 0;
        Object obj = null;
        LatLng latlng = null;
        String s = null;
        StreetViewPanoramaCamera streetviewpanoramacamera = null;
        int j = 0;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = parcel.readInt();
                switch (0xffff & l)
                {
                default:
                    com.google.android.m4b.maps.k.a.b(parcel, l);
                    break;

                case 1: // '\001'
                    j = com.google.android.m4b.maps.k.a.e(parcel, l);
                    break;

                case 2: // '\002'
                    streetviewpanoramacamera = (StreetViewPanoramaCamera)com.google.android.m4b.maps.k.a.a(parcel, l, StreetViewPanoramaCamera.CREATOR);
                    break;

                case 3: // '\003'
                    s = com.google.android.m4b.maps.k.a.i(parcel, l);
                    break;

                case 4: // '\004'
                    latlng = (LatLng)com.google.android.m4b.maps.k.a.a(parcel, l, LatLng.CREATOR);
                    break;

                case 5: // '\005'
                    l = com.google.android.m4b.maps.k.a.a(parcel, l);
                    if (l == 0)
                    {
                        obj = null;
                    } else
                    {
                        if (l != 4)
                        {
                            obj = String.valueOf(Integer.toHexString(l));
                            throw new com.google.android.m4b.maps.k.a.a((new StringBuilder(String.valueOf(obj).length() + 46)).append("Expected size 4 got ").append(l).append(" (0x").append(((String) (obj))).append(")").toString(), parcel);
                        }
                        obj = Integer.valueOf(parcel.readInt());
                    }
                    break;

                case 6: // '\006'
                    byte4 = com.google.android.m4b.maps.k.a.d(parcel, l);
                    break;

                case 7: // '\007'
                    byte3 = com.google.android.m4b.maps.k.a.d(parcel, l);
                    break;

                case 8: // '\b'
                    byte2 = com.google.android.m4b.maps.k.a.d(parcel, l);
                    break;

                case 9: // '\t'
                    byte1 = com.google.android.m4b.maps.k.a.d(parcel, l);
                    break;

                case 10: // '\n'
                    byte0 = com.google.android.m4b.maps.k.a.d(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.m4b.maps.k.a.a((new StringBuilder(37)).append("Overread allowed size end=").append(k).toString(), parcel);
            } else
            {
                return new StreetViewPanoramaOptions(j, streetviewpanoramacamera, s, latlng, ((Integer) (obj)), byte4, byte3, byte2, byte1, byte0);
            }
        } while (true);
    }

    static void a(StreetViewPanoramaOptions streetviewpanoramaoptions, Parcel parcel, int j)
    {
        int k = b.a(parcel, 20293);
        b.b(parcel, 1, streetviewpanoramaoptions.a);
        b.a(parcel, 2, streetviewpanoramaoptions.b, j);
        b.a(parcel, 3, streetviewpanoramaoptions.c);
        b.a(parcel, 4, streetviewpanoramaoptions.d, j);
        Integer integer = streetviewpanoramaoptions.e;
        if (integer != null)
        {
            b.a(parcel, 5, 4);
            parcel.writeInt(integer.intValue());
        }
        b.a(parcel, 6, com.google.android.m4b.maps.df.a.a(streetviewpanoramaoptions.f));
        b.a(parcel, 7, com.google.android.m4b.maps.df.a.a(streetviewpanoramaoptions.g));
        b.a(parcel, 8, com.google.android.m4b.maps.df.a.a(streetviewpanoramaoptions.h));
        b.a(parcel, 9, com.google.android.m4b.maps.df.a.a(streetviewpanoramaoptions.i));
        b.a(parcel, 10, com.google.android.m4b.maps.df.a.a(streetviewpanoramaoptions.j));
        b.b(parcel, k);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public final volatile Object[] newArray(int j)
    {
        return new StreetViewPanoramaOptions[j];
    }
}
