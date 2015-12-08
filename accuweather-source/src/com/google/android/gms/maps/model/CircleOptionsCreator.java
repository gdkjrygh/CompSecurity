// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.maps.model:
//            CircleOptions, LatLng

public class CircleOptionsCreator
    implements android.os.Parcelable.Creator
{

    public static final int CONTENT_DESCRIPTION = 0;

    public CircleOptionsCreator()
    {
    }

    static void a(CircleOptions circleoptions, Parcel parcel, int i)
    {
        int j = b.C(parcel);
        b.c(parcel, 1, circleoptions.getVersionCode());
        b.a(parcel, 2, circleoptions.getCenter(), i, false);
        b.a(parcel, 3, circleoptions.getRadius());
        b.a(parcel, 4, circleoptions.getStrokeWidth());
        b.c(parcel, 5, circleoptions.getStrokeColor());
        b.c(parcel, 6, circleoptions.getFillColor());
        b.a(parcel, 7, circleoptions.getZIndex());
        b.a(parcel, 8, circleoptions.isVisible());
        b.G(parcel, j);
    }

    public CircleOptions createFromParcel(Parcel parcel)
    {
        float f = 0.0F;
        boolean flag = false;
        int l = com.google.android.gms.common.internal.safeparcel.a.B(parcel);
        LatLng latlng = null;
        double d = 0.0D;
        int i = 0;
        int j = 0;
        float f1 = 0.0F;
        int k = 0;
        do
        {
            if (parcel.dataPosition() < l)
            {
                int i1 = com.google.android.gms.common.internal.safeparcel.a.A(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.ar(i1))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, i1);
                    break;

                case 1: // '\001'
                    k = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 2: // '\002'
                    latlng = (LatLng)com.google.android.gms.common.internal.safeparcel.a.a(parcel, i1, LatLng.CREATOR);
                    break;

                case 3: // '\003'
                    d = com.google.android.gms.common.internal.safeparcel.a.m(parcel, i1);
                    break;

                case 4: // '\004'
                    f1 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, i1);
                    break;

                case 5: // '\005'
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 6: // '\006'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 7: // '\007'
                    f = com.google.android.gms.common.internal.safeparcel.a.l(parcel, i1);
                    break;

                case 8: // '\b'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(l).toString(), parcel);
            } else
            {
                return new CircleOptions(k, latlng, d, f1, j, i, f, flag);
            }
        } while (true);
    }

    public volatile Object createFromParcel(Parcel parcel)
    {
        return createFromParcel(parcel);
    }

    public CircleOptions[] newArray(int i)
    {
        return new CircleOptions[i];
    }

    public volatile Object[] newArray(int i)
    {
        return newArray(i);
    }
}
