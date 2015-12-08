// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.maps.model:
//            GroundOverlayOptions, LatLng, LatLngBounds

public class zzc
    implements android.os.Parcelable.Creator
{

    public zzc()
    {
    }

    static void a(GroundOverlayOptions groundoverlayoptions, Parcel parcel, int i)
    {
        int j = zzb.a(parcel);
        zzb.a(parcel, 1, groundoverlayoptions.b());
        zzb.a(parcel, 2, groundoverlayoptions.a(), false);
        zzb.a(parcel, 3, groundoverlayoptions.c(), i, false);
        zzb.a(parcel, 4, groundoverlayoptions.d());
        zzb.a(parcel, 5, groundoverlayoptions.e());
        zzb.a(parcel, 6, groundoverlayoptions.f(), i, false);
        zzb.a(parcel, 7, groundoverlayoptions.g());
        zzb.a(parcel, 8, groundoverlayoptions.h());
        zzb.a(parcel, 9, groundoverlayoptions.l());
        zzb.a(parcel, 10, groundoverlayoptions.i());
        zzb.a(parcel, 11, groundoverlayoptions.j());
        zzb.a(parcel, 12, groundoverlayoptions.k());
        zzb.a(parcel, j);
    }

    public GroundOverlayOptions a(Parcel parcel)
    {
        int j = zza.b(parcel);
        int i = 0;
        android.os.IBinder ibinder = null;
        LatLng latlng = null;
        float f6 = 0.0F;
        float f5 = 0.0F;
        LatLngBounds latlngbounds = null;
        float f4 = 0.0F;
        float f3 = 0.0F;
        boolean flag = false;
        float f2 = 0.0F;
        float f1 = 0.0F;
        float f = 0.0F;
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
                    ibinder = zza.n(parcel, k);
                    break;

                case 3: // '\003'
                    latlng = (LatLng)zza.a(parcel, k, LatLng.CREATOR);
                    break;

                case 4: // '\004'
                    f6 = zza.j(parcel, k);
                    break;

                case 5: // '\005'
                    f5 = zza.j(parcel, k);
                    break;

                case 6: // '\006'
                    latlngbounds = (LatLngBounds)zza.a(parcel, k, LatLngBounds.CREATOR);
                    break;

                case 7: // '\007'
                    f4 = zza.j(parcel, k);
                    break;

                case 8: // '\b'
                    f3 = zza.j(parcel, k);
                    break;

                case 9: // '\t'
                    flag = zza.c(parcel, k);
                    break;

                case 10: // '\n'
                    f2 = zza.j(parcel, k);
                    break;

                case 11: // '\013'
                    f1 = zza.j(parcel, k);
                    break;

                case 12: // '\f'
                    f = zza.j(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new GroundOverlayOptions(i, ibinder, latlng, f6, f5, latlngbounds, f4, f3, flag, f2, f1, f);
            }
        } while (true);
    }

    public GroundOverlayOptions[] a(int i)
    {
        return new GroundOverlayOptions[i];
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
