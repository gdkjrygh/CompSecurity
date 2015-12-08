// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.model;

import android.os.Parcel;
import com.google.android.m4b.maps.k.a;
import com.google.android.m4b.maps.k.b;

// Referenced classes of package com.google.android.m4b.maps.model:
//            LatLng, CircleOptions

public final class d
    implements android.os.Parcelable.Creator
{

    public d()
    {
    }

    public static CircleOptions a(Parcel parcel)
    {
        float f = 0.0F;
        boolean flag = false;
        int l = com.google.android.m4b.maps.k.a.a(parcel);
        LatLng latlng = null;
        double d1 = 0.0D;
        int i = 0;
        int j = 0;
        float f1 = 0.0F;
        int k = 0;
        do
        {
            if (parcel.dataPosition() < l)
            {
                int i1 = parcel.readInt();
                switch (0xffff & i1)
                {
                default:
                    com.google.android.m4b.maps.k.a.b(parcel, i1);
                    break;

                case 1: // '\001'
                    k = com.google.android.m4b.maps.k.a.e(parcel, i1);
                    break;

                case 2: // '\002'
                    latlng = (LatLng)com.google.android.m4b.maps.k.a.a(parcel, i1, LatLng.CREATOR);
                    break;

                case 3: // '\003'
                    d1 = com.google.android.m4b.maps.k.a.h(parcel, i1);
                    break;

                case 4: // '\004'
                    f1 = com.google.android.m4b.maps.k.a.g(parcel, i1);
                    break;

                case 5: // '\005'
                    j = com.google.android.m4b.maps.k.a.e(parcel, i1);
                    break;

                case 6: // '\006'
                    i = com.google.android.m4b.maps.k.a.e(parcel, i1);
                    break;

                case 7: // '\007'
                    f = com.google.android.m4b.maps.k.a.g(parcel, i1);
                    break;

                case 8: // '\b'
                    flag = com.google.android.m4b.maps.k.a.c(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.m4b.maps.k.a.a((new StringBuilder(37)).append("Overread allowed size end=").append(l).toString(), parcel);
            } else
            {
                return new CircleOptions(k, latlng, d1, f1, j, i, f, flag);
            }
        } while (true);
    }

    static void a(CircleOptions circleoptions, Parcel parcel, int i)
    {
        int j = b.a(parcel, 20293);
        b.b(parcel, 1, circleoptions.a);
        b.a(parcel, 2, circleoptions.b, i);
        b.a(parcel, 3, circleoptions.c);
        b.a(parcel, 4, circleoptions.d);
        b.b(parcel, 5, circleoptions.e);
        b.b(parcel, 6, circleoptions.f);
        b.a(parcel, 7, circleoptions.g);
        b.a(parcel, 8, circleoptions.h);
        b.b(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public final volatile Object[] newArray(int i)
    {
        return new CircleOptions[i];
    }
}
