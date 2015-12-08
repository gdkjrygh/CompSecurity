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

public final class j
    implements android.os.Parcelable.Creator
{

    public j()
    {
    }

    public static StreetViewPanoramaOptions a(Parcel parcel)
    {
        byte byte0 = 0;
        int k = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        byte byte1 = 0;
        byte byte2 = 0;
        byte byte3 = 0;
        byte byte4 = 0;
        Integer integer = null;
        LatLng latlng = null;
        String s = null;
        StreetViewPanoramaCamera streetviewpanoramacamera = null;
        int i = 0;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = parcel.readInt();
                switch (0xffff & l)
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, l);
                    break;

                case 1: // '\001'
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, l);
                    break;

                case 2: // '\002'
                    streetviewpanoramacamera = (StreetViewPanoramaCamera)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, StreetViewPanoramaCamera.CREATOR);
                    break;

                case 3: // '\003'
                    s = com.google.android.gms.common.internal.safeparcel.a.l(parcel, l);
                    break;

                case 4: // '\004'
                    latlng = (LatLng)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, LatLng.CREATOR);
                    break;

                case 5: // '\005'
                    l = com.google.android.gms.common.internal.safeparcel.a.a(parcel, l);
                    if (l == 0)
                    {
                        integer = null;
                    } else
                    {
                        if (l != 4)
                        {
                            throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Expected size 4 got ")).append(l).append(" (0x").append(Integer.toHexString(l)).append(")").toString(), parcel);
                        }
                        integer = Integer.valueOf(parcel.readInt());
                    }
                    break;

                case 6: // '\006'
                    byte4 = com.google.android.gms.common.internal.safeparcel.a.d(parcel, l);
                    break;

                case 7: // '\007'
                    byte3 = com.google.android.gms.common.internal.safeparcel.a.d(parcel, l);
                    break;

                case 8: // '\b'
                    byte2 = com.google.android.gms.common.internal.safeparcel.a.d(parcel, l);
                    break;

                case 9: // '\t'
                    byte1 = com.google.android.gms.common.internal.safeparcel.a.d(parcel, l);
                    break;

                case 10: // '\n'
                    byte0 = com.google.android.gms.common.internal.safeparcel.a.d(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new StreetViewPanoramaOptions(i, streetviewpanoramacamera, s, latlng, integer, byte4, byte3, byte2, byte1, byte0);
            }
        } while (true);
    }

    static void a(StreetViewPanoramaOptions streetviewpanoramaoptions, Parcel parcel, int i)
    {
        int k = b.a(parcel);
        b.a(parcel, 1, streetviewpanoramaoptions.a());
        b.a(parcel, 2, streetviewpanoramaoptions.g(), i);
        b.a(parcel, 3, streetviewpanoramaoptions.j());
        b.a(parcel, 4, streetviewpanoramaoptions.h(), i);
        b.a(parcel, streetviewpanoramaoptions.i());
        b.a(parcel, 6, streetviewpanoramaoptions.b());
        b.a(parcel, 7, streetviewpanoramaoptions.c());
        b.a(parcel, 8, streetviewpanoramaoptions.d());
        b.a(parcel, 9, streetviewpanoramaoptions.e());
        b.a(parcel, 10, streetviewpanoramaoptions.f());
        b.a(parcel, k);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public final Object[] newArray(int i)
    {
        return new StreetViewPanoramaOptions[i];
    }
}
