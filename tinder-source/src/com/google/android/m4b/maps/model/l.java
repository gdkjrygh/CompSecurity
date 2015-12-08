// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.model;

import android.os.Parcel;
import com.google.android.m4b.maps.k.a;
import com.google.android.m4b.maps.k.b;

// Referenced classes of package com.google.android.m4b.maps.model:
//            LatLng, PointOfInterest

public final class l
    implements android.os.Parcelable.Creator
{

    public l()
    {
    }

    public static PointOfInterest a(Parcel parcel)
    {
        int j = com.google.android.m4b.maps.k.a.a(parcel);
        String s = null;
        LatLng latlng = null;
        int i = 0;
        String s1 = null;
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
                    s = com.google.android.m4b.maps.k.a.i(parcel, k);
                    break;

                case 4: // '\004'
                    s1 = com.google.android.m4b.maps.k.a.i(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.m4b.maps.k.a.a((new StringBuilder(37)).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new PointOfInterest(i, latlng, s, s1);
            }
        } while (true);
    }

    static void a(PointOfInterest pointofinterest, Parcel parcel, int i)
    {
        int j = b.a(parcel, 20293);
        b.b(parcel, 1, pointofinterest.a);
        b.a(parcel, 2, pointofinterest.b, i);
        b.a(parcel, 3, pointofinterest.c);
        b.a(parcel, 4, pointofinterest.d);
        b.b(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public final volatile Object[] newArray(int i)
    {
        return new PointOfInterest[i];
    }
}
