// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;

// Referenced classes of package com.google.android.gms.maps:
//            StreetViewPanoramaOptions

public class zzc
    implements android.os.Parcelable.Creator
{

    public zzc()
    {
    }

    static void zza(StreetViewPanoramaOptions streetviewpanoramaoptions, Parcel parcel, int i)
    {
        int j = zzb.zzK(parcel);
        zzb.zzc(parcel, 1, streetviewpanoramaoptions.getVersionCode());
        zzb.zza(parcel, 2, streetviewpanoramaoptions.getStreetViewPanoramaCamera(), i, false);
        zzb.zza(parcel, 3, streetviewpanoramaoptions.getPanoramaId(), false);
        zzb.zza(parcel, 4, streetviewpanoramaoptions.getPosition(), i, false);
        zzb.zza(parcel, 5, streetviewpanoramaoptions.getRadius(), false);
        zzb.zza(parcel, 6, streetviewpanoramaoptions.zzqw());
        zzb.zza(parcel, 7, streetviewpanoramaoptions.zzqm());
        zzb.zza(parcel, 8, streetviewpanoramaoptions.zzqx());
        zzb.zza(parcel, 9, streetviewpanoramaoptions.zzqy());
        zzb.zza(parcel, 10, streetviewpanoramaoptions.zzqi());
        zzb.zzH(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzdQ(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzfT(i);
    }

    public StreetViewPanoramaOptions zzdQ(Parcel parcel)
    {
        Integer integer = null;
        byte byte0 = 0;
        int j = com.google.android.gms.common.internal.safeparcel.zza.zzJ(parcel);
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
                int k = com.google.android.gms.common.internal.safeparcel.zza.zzI(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.zza.zzaP(k))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel, k);
                    break;

                case 1: // '\001'
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, k);
                    break;

                case 2: // '\002'
                    streetviewpanoramacamera = (StreetViewPanoramaCamera)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, k, StreetViewPanoramaCamera.CREATOR);
                    break;

                case 3: // '\003'
                    s = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k);
                    break;

                case 4: // '\004'
                    latlng = (LatLng)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, k, LatLng.CREATOR);
                    break;

                case 5: // '\005'
                    integer = com.google.android.gms.common.internal.safeparcel.zza.zzh(parcel, k);
                    break;

                case 6: // '\006'
                    byte4 = com.google.android.gms.common.internal.safeparcel.zza.zze(parcel, k);
                    break;

                case 7: // '\007'
                    byte3 = com.google.android.gms.common.internal.safeparcel.zza.zze(parcel, k);
                    break;

                case 8: // '\b'
                    byte2 = com.google.android.gms.common.internal.safeparcel.zza.zze(parcel, k);
                    break;

                case 9: // '\t'
                    byte1 = com.google.android.gms.common.internal.safeparcel.zza.zze(parcel, k);
                    break;

                case 10: // '\n'
                    byte0 = com.google.android.gms.common.internal.safeparcel.zza.zze(parcel, k);
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

    public StreetViewPanoramaOptions[] zzfT(int i)
    {
        return new StreetViewPanoramaOptions[i];
    }
}
