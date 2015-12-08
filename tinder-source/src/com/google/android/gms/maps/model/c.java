// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.zza;

// Referenced classes of package com.google.android.gms.maps.model:
//            CameraPosition, LatLng

public final class c
    implements android.os.Parcelable.Creator
{

    public c()
    {
    }

    static void a(CameraPosition cameraposition, Parcel parcel, int i)
    {
        int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, cameraposition.a);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 2, cameraposition.b, i);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 3, cameraposition.c);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 4, cameraposition.d);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 5, cameraposition.e);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        float f = 0.0F;
        int j = zza.a(parcel);
        int i = 0;
        LatLng latlng = null;
        float f1 = 0.0F;
        float f2 = 0.0F;
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
                    latlng = (LatLng)zza.a(parcel, k, LatLng.CREATOR);
                    break;

                case 3: // '\003'
                    f2 = zza.i(parcel, k);
                    break;

                case 4: // '\004'
                    f1 = zza.i(parcel, k);
                    break;

                case 5: // '\005'
                    f = zza.i(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new CameraPosition(i, latlng, f2, f1, f);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new CameraPosition[i];
    }
}
