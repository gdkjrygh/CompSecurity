// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.maps.model:
//            LatLng, LatLngBounds, GroundOverlayOptions

public final class g
    implements android.os.Parcelable.Creator
{

    public g()
    {
    }

    public static GroundOverlayOptions a(Parcel parcel)
    {
        boolean flag = false;
        LatLngBounds latlngbounds = null;
        float f = 0.0F;
        int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        float f1 = 0.0F;
        float f2 = 0.0F;
        float f3 = 0.0F;
        float f4 = 0.0F;
        float f5 = 0.0F;
        float f6 = 0.0F;
        LatLng latlng = null;
        android.os.IBinder ibinder = null;
        int i = 0;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = parcel.readInt();
                switch (0xffff & k)
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, k);
                    break;

                case 2: // '\002'
                    ibinder = com.google.android.gms.common.internal.safeparcel.a.m(parcel, k);
                    break;

                case 3: // '\003'
                    latlng = (LatLng)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, LatLng.CREATOR);
                    break;

                case 4: // '\004'
                    f6 = com.google.android.gms.common.internal.safeparcel.a.i(parcel, k);
                    break;

                case 5: // '\005'
                    f5 = com.google.android.gms.common.internal.safeparcel.a.i(parcel, k);
                    break;

                case 6: // '\006'
                    latlngbounds = (LatLngBounds)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, LatLngBounds.CREATOR);
                    break;

                case 7: // '\007'
                    f4 = com.google.android.gms.common.internal.safeparcel.a.i(parcel, k);
                    break;

                case 8: // '\b'
                    f3 = com.google.android.gms.common.internal.safeparcel.a.i(parcel, k);
                    break;

                case 9: // '\t'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k);
                    break;

                case 10: // '\n'
                    f2 = com.google.android.gms.common.internal.safeparcel.a.i(parcel, k);
                    break;

                case 11: // '\013'
                    f1 = com.google.android.gms.common.internal.safeparcel.a.i(parcel, k);
                    break;

                case 12: // '\f'
                    f = com.google.android.gms.common.internal.safeparcel.a.i(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new GroundOverlayOptions(i, ibinder, latlng, f6, f5, latlngbounds, f4, f3, flag, f2, f1, f);
            }
        } while (true);
    }

    static void a(GroundOverlayOptions groundoverlayoptions, Parcel parcel, int i)
    {
        int j = b.a(parcel);
        b.a(parcel, 1, groundoverlayoptions.b());
        b.a(parcel, 2, groundoverlayoptions.a());
        b.a(parcel, 3, groundoverlayoptions.c(), i);
        b.a(parcel, 4, groundoverlayoptions.d());
        b.a(parcel, 5, groundoverlayoptions.e());
        b.a(parcel, 6, groundoverlayoptions.f(), i);
        b.a(parcel, 7, groundoverlayoptions.g());
        b.a(parcel, 8, groundoverlayoptions.h());
        b.a(parcel, 9, groundoverlayoptions.l());
        b.a(parcel, 10, groundoverlayoptions.i());
        b.a(parcel, 11, groundoverlayoptions.j());
        b.a(parcel, 12, groundoverlayoptions.k());
        b.a(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public final Object[] newArray(int i)
    {
        return new GroundOverlayOptions[i];
    }
}
