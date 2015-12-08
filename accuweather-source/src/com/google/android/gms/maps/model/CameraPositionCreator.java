// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.maps.model:
//            CameraPosition, LatLng

public class CameraPositionCreator
    implements android.os.Parcelable.Creator
{

    public static final int CONTENT_DESCRIPTION = 0;

    public CameraPositionCreator()
    {
    }

    static void a(CameraPosition cameraposition, Parcel parcel, int i)
    {
        int j = b.C(parcel);
        b.c(parcel, 1, cameraposition.getVersionCode());
        b.a(parcel, 2, cameraposition.target, i, false);
        b.a(parcel, 3, cameraposition.zoom);
        b.a(parcel, 4, cameraposition.tilt);
        b.a(parcel, 5, cameraposition.bearing);
        b.G(parcel, j);
    }

    public CameraPosition createFromParcel(Parcel parcel)
    {
        float f = 0.0F;
        int j = com.google.android.gms.common.internal.safeparcel.a.B(parcel);
        int i = 0;
        LatLng latlng = null;
        float f1 = 0.0F;
        float f2 = 0.0F;
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
                    latlng = (LatLng)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, LatLng.CREATOR);
                    break;

                case 3: // '\003'
                    f2 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, k);
                    break;

                case 4: // '\004'
                    f1 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, k);
                    break;

                case 5: // '\005'
                    f = com.google.android.gms.common.internal.safeparcel.a.l(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new CameraPosition(i, latlng, f2, f1, f);
            }
        } while (true);
    }

    public volatile Object createFromParcel(Parcel parcel)
    {
        return createFromParcel(parcel);
    }

    public CameraPosition[] newArray(int i)
    {
        return new CameraPosition[i];
    }

    public volatile Object[] newArray(int i)
    {
        return newArray(i);
    }
}
