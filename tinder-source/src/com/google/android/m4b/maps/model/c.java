// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.model;

import android.os.Parcel;
import com.google.android.m4b.maps.k.a;
import com.google.android.m4b.maps.k.b;

// Referenced classes of package com.google.android.m4b.maps.model:
//            LatLng, CameraPosition

public final class c
    implements android.os.Parcelable.Creator
{

    public c()
    {
    }

    public static CameraPosition a(Parcel parcel)
    {
        float f = 0.0F;
        int j = com.google.android.m4b.maps.k.a.a(parcel);
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
                    com.google.android.m4b.maps.k.a.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = com.google.android.m4b.maps.k.a.e(parcel, k);
                    break;

                case 2: // '\002'
                    latlng = (LatLng)com.google.android.m4b.maps.k.a.a(parcel, k, LatLng.CREATOR);
                    break;

                case 3: // '\003'
                    f2 = com.google.android.m4b.maps.k.a.g(parcel, k);
                    break;

                case 4: // '\004'
                    f1 = com.google.android.m4b.maps.k.a.g(parcel, k);
                    break;

                case 5: // '\005'
                    f = com.google.android.m4b.maps.k.a.g(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.m4b.maps.k.a.a((new StringBuilder(37)).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new CameraPosition(i, latlng, f2, f1, f);
            }
        } while (true);
    }

    static void a(CameraPosition cameraposition, Parcel parcel, int i)
    {
        int j = b.a(parcel, 20293);
        b.b(parcel, 1, cameraposition.a);
        b.a(parcel, 2, cameraposition.b, i);
        b.a(parcel, 3, cameraposition.c);
        b.a(parcel, 4, cameraposition.d);
        b.a(parcel, 5, cameraposition.e);
        b.b(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public final volatile Object[] newArray(int i)
    {
        return new CameraPosition[i];
    }
}
