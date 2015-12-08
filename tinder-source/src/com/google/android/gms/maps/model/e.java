// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.zza;

// Referenced classes of package com.google.android.gms.maps.model:
//            GroundOverlayOptions, a, LatLng, LatLngBounds

public final class e
    implements android.os.Parcelable.Creator
{

    public e()
    {
    }

    static void a(GroundOverlayOptions groundoverlayoptions, Parcel parcel, int i)
    {
        int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, groundoverlayoptions.a);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 2, groundoverlayoptions.b.a.asBinder());
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 3, groundoverlayoptions.c, i);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 4, groundoverlayoptions.d);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 5, groundoverlayoptions.e);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 6, groundoverlayoptions.f, i);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 7, groundoverlayoptions.g);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 8, groundoverlayoptions.h);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 9, groundoverlayoptions.i);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 10, groundoverlayoptions.j);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 11, groundoverlayoptions.k);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 12, groundoverlayoptions.l);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int j = zza.a(parcel);
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
                    ibinder = zza.m(parcel, k);
                    break;

                case 3: // '\003'
                    latlng = (LatLng)zza.a(parcel, k, LatLng.CREATOR);
                    break;

                case 4: // '\004'
                    f6 = zza.i(parcel, k);
                    break;

                case 5: // '\005'
                    f5 = zza.i(parcel, k);
                    break;

                case 6: // '\006'
                    latlngbounds = (LatLngBounds)zza.a(parcel, k, LatLngBounds.CREATOR);
                    break;

                case 7: // '\007'
                    f4 = zza.i(parcel, k);
                    break;

                case 8: // '\b'
                    f3 = zza.i(parcel, k);
                    break;

                case 9: // '\t'
                    flag = zza.c(parcel, k);
                    break;

                case 10: // '\n'
                    f2 = zza.i(parcel, k);
                    break;

                case 11: // '\013'
                    f1 = zza.i(parcel, k);
                    break;

                case 12: // '\f'
                    f = zza.i(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new GroundOverlayOptions(i, ibinder, latlng, f6, f5, latlngbounds, f4, f3, flag, f2, f1, f);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new GroundOverlayOptions[i];
    }
}
