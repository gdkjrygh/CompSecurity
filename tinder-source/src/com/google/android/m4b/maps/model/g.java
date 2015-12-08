// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.model;

import android.os.Parcel;
import com.google.android.m4b.maps.k.a;
import com.google.android.m4b.maps.k.b;

// Referenced classes of package com.google.android.m4b.maps.model:
//            LatLng

public final class g
    implements android.os.Parcelable.Creator
{

    public g()
    {
    }

    public static LatLng a(Parcel parcel)
    {
        double d = 0.0D;
        int j = com.google.android.m4b.maps.k.a.a(parcel);
        int i = 0;
        double d1 = 0.0D;
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
                    d1 = com.google.android.m4b.maps.k.a.h(parcel, k);
                    break;

                case 3: // '\003'
                    d = com.google.android.m4b.maps.k.a.h(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.m4b.maps.k.a.a((new StringBuilder(37)).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new LatLng(i, d1, d);
            }
        } while (true);
    }

    static void a(LatLng latlng, Parcel parcel)
    {
        int i = b.a(parcel, 20293);
        b.b(parcel, 1, latlng.a);
        b.a(parcel, 2, latlng.b);
        b.a(parcel, 3, latlng.c);
        b.b(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public final volatile Object[] newArray(int i)
    {
        return new LatLng[i];
    }
}
