// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.model;

import android.os.Parcel;
import com.google.android.m4b.maps.k.a;
import com.google.android.m4b.maps.k.b;

// Referenced classes of package com.google.android.m4b.maps.model:
//            StreetViewPanoramaCamera

public final class o
    implements android.os.Parcelable.Creator
{

    public o()
    {
    }

    public static StreetViewPanoramaCamera a(Parcel parcel)
    {
        float f2 = 0.0F;
        int j = com.google.android.m4b.maps.k.a.a(parcel);
        float f = 0.0F;
        int i = 0;
        float f1 = 0.0F;
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
                    f = com.google.android.m4b.maps.k.a.g(parcel, k);
                    break;

                case 3: // '\003'
                    f1 = com.google.android.m4b.maps.k.a.g(parcel, k);
                    break;

                case 4: // '\004'
                    f2 = com.google.android.m4b.maps.k.a.g(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.m4b.maps.k.a.a((new StringBuilder(37)).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new StreetViewPanoramaCamera(i, f, f1, f2);
            }
        } while (true);
    }

    static void a(StreetViewPanoramaCamera streetviewpanoramacamera, Parcel parcel)
    {
        int i = b.a(parcel, 20293);
        b.b(parcel, 1, streetviewpanoramacamera.a);
        b.a(parcel, 2, streetviewpanoramacamera.b);
        b.a(parcel, 3, streetviewpanoramacamera.c);
        b.a(parcel, 4, streetviewpanoramacamera.d);
        b.b(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public final volatile Object[] newArray(int i)
    {
        return new StreetViewPanoramaCamera[i];
    }
}
