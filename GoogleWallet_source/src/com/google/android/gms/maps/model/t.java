// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.maps.model:
//            StreetViewPanoramaOrientation

public final class t
    implements android.os.Parcelable.Creator
{

    public t()
    {
    }

    static void a(StreetViewPanoramaOrientation streetviewpanoramaorientation, Parcel parcel, int i)
    {
        i = b.bU(parcel);
        b.c(parcel, 1, streetviewpanoramaorientation.getVersionCode());
        b.a(parcel, 2, streetviewpanoramaorientation.tilt);
        b.a(parcel, 3, streetviewpanoramaorientation.bearing);
        b.J(parcel, i);
    }

    public static StreetViewPanoramaOrientation gx(Parcel parcel)
    {
        float f1 = 0.0F;
        int j = com.google.android.gms.common.internal.safeparcel.a.bT(parcel);
        int i = 0;
        float f = 0.0F;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = com.google.android.gms.common.internal.safeparcel.a.bS(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.dk(k))
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
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new StreetViewPanoramaOrientation(i, f, f1);
            }
        } while (true);
    }

    private static StreetViewPanoramaOrientation[] iW(int i)
    {
        return new StreetViewPanoramaOrientation[i];
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return gx(parcel);
    }

    public final Object[] newArray(int i)
    {
        return iW(i);
    }
}
