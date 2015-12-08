// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;

// Referenced classes of package com.google.android.gms.maps:
//            StreetViewPanoramaOptions

public final class b
    implements android.os.Parcelable.Creator
{

    public b()
    {
    }

    static void a(StreetViewPanoramaOptions streetviewpanoramaoptions, Parcel parcel, int i)
    {
        int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, streetviewpanoramaoptions.a);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 2, streetviewpanoramaoptions.b, i);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 3, streetviewpanoramaoptions.c);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 4, streetviewpanoramaoptions.d, i);
        Integer integer = streetviewpanoramaoptions.e;
        if (integer != null)
        {
            com.google.android.gms.common.internal.safeparcel.a.a(parcel, 5, 4);
            parcel.writeInt(integer.intValue());
        }
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 6, com.google.android.gms.maps.a.a.a(streetviewpanoramaoptions.f));
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 7, com.google.android.gms.maps.a.a.a(streetviewpanoramaoptions.g));
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 8, com.google.android.gms.maps.a.a.a(streetviewpanoramaoptions.h));
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 9, com.google.android.gms.maps.a.a.a(streetviewpanoramaoptions.i));
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 10, com.google.android.gms.maps.a.a.a(streetviewpanoramaoptions.j));
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        byte byte0 = 0;
        int j = zza.a(parcel);
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
                    streetviewpanoramacamera = (StreetViewPanoramaCamera)zza.a(parcel, k, StreetViewPanoramaCamera.CREATOR);
                    break;

                case 3: // '\003'
                    s = zza.l(parcel, k);
                    break;

                case 4: // '\004'
                    latlng = (LatLng)zza.a(parcel, k, LatLng.CREATOR);
                    break;

                case 5: // '\005'
                    k = zza.a(parcel, k);
                    if (k == 0)
                    {
                        integer = null;
                    } else
                    {
                        zza.b(parcel, k, 4);
                        integer = Integer.valueOf(parcel.readInt());
                    }
                    break;

                case 6: // '\006'
                    byte4 = zza.d(parcel, k);
                    break;

                case 7: // '\007'
                    byte3 = zza.d(parcel, k);
                    break;

                case 8: // '\b'
                    byte2 = zza.d(parcel, k);
                    break;

                case 9: // '\t'
                    byte1 = zza.d(parcel, k);
                    break;

                case 10: // '\n'
                    byte0 = zza.d(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new StreetViewPanoramaOptions(i, streetviewpanoramacamera, s, latlng, integer, byte4, byte3, byte2, byte1, byte0);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new StreetViewPanoramaOptions[i];
    }
}
