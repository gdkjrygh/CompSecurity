// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.maps.model:
//            StreetViewPanoramaOrientation

public class StreetViewPanoramaOrientationCreator
    implements android.os.Parcelable.Creator
{

    public static final int CONTENT_DESCRIPTION = 0;

    public StreetViewPanoramaOrientationCreator()
    {
    }

    static void a(StreetViewPanoramaOrientation streetviewpanoramaorientation, Parcel parcel, int i)
    {
        i = b.C(parcel);
        b.c(parcel, 1, streetviewpanoramaorientation.getVersionCode());
        b.a(parcel, 2, streetviewpanoramaorientation.tilt);
        b.a(parcel, 3, streetviewpanoramaorientation.bearing);
        b.G(parcel, i);
    }

    public StreetViewPanoramaOrientation createFromParcel(Parcel parcel)
    {
        float f1 = 0.0F;
        int j = com.google.android.gms.common.internal.safeparcel.a.B(parcel);
        int i = 0;
        float f = 0.0F;
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
                    f = com.google.android.gms.common.internal.safeparcel.a.l(parcel, k);
                    break;

                case 3: // '\003'
                    f1 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new StreetViewPanoramaOrientation(i, f, f1);
            }
        } while (true);
    }

    public volatile Object createFromParcel(Parcel parcel)
    {
        return createFromParcel(parcel);
    }

    public StreetViewPanoramaOrientation[] newArray(int i)
    {
        return new StreetViewPanoramaOrientation[i];
    }

    public volatile Object[] newArray(int i)
    {
        return newArray(i);
    }
}
