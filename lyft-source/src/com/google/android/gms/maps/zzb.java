// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;

// Referenced classes of package com.google.android.gms.maps:
//            StreetViewPanoramaOptions

public class zzb
    implements android.os.Parcelable.Creator
{

    public zzb()
    {
    }

    static void a(StreetViewPanoramaOptions streetviewpanoramaoptions, Parcel parcel, int i)
    {
        int j = com.google.android.gms.common.internal.safeparcel.zzb.a(parcel);
        com.google.android.gms.common.internal.safeparcel.zzb.a(parcel, 1, streetviewpanoramaoptions.a());
        com.google.android.gms.common.internal.safeparcel.zzb.a(parcel, 2, streetviewpanoramaoptions.g(), i, false);
        com.google.android.gms.common.internal.safeparcel.zzb.a(parcel, 3, streetviewpanoramaoptions.j(), false);
        com.google.android.gms.common.internal.safeparcel.zzb.a(parcel, 4, streetviewpanoramaoptions.h(), i, false);
        com.google.android.gms.common.internal.safeparcel.zzb.a(parcel, 5, streetviewpanoramaoptions.i(), false);
        com.google.android.gms.common.internal.safeparcel.zzb.a(parcel, 6, streetviewpanoramaoptions.b());
        com.google.android.gms.common.internal.safeparcel.zzb.a(parcel, 7, streetviewpanoramaoptions.c());
        com.google.android.gms.common.internal.safeparcel.zzb.a(parcel, 8, streetviewpanoramaoptions.d());
        com.google.android.gms.common.internal.safeparcel.zzb.a(parcel, 9, streetviewpanoramaoptions.e());
        com.google.android.gms.common.internal.safeparcel.zzb.a(parcel, 10, streetviewpanoramaoptions.f());
        com.google.android.gms.common.internal.safeparcel.zzb.a(parcel, j);
    }

    public StreetViewPanoramaOptions a(Parcel parcel)
    {
        Integer integer = null;
        byte byte0 = 0;
        int j = zza.b(parcel);
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
                    streetviewpanoramacamera = (StreetViewPanoramaCamera)zza.a(parcel, k, StreetViewPanoramaCamera.CREATOR);
                    break;

                case 3: // '\003'
                    s = zza.m(parcel, k);
                    break;

                case 4: // '\004'
                    latlng = (LatLng)zza.a(parcel, k, LatLng.CREATOR);
                    break;

                case 5: // '\005'
                    integer = zza.g(parcel, k);
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
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new StreetViewPanoramaOptions(i, streetviewpanoramacamera, s, latlng, integer, byte4, byte3, byte2, byte1, byte0);
            }
        } while (true);
    }

    public StreetViewPanoramaOptions[] a(int i)
    {
        return new StreetViewPanoramaOptions[i];
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
