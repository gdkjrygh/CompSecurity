// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.maps.model:
//            StreetViewPanoramaLink

public class r
    implements android.os.Parcelable.Creator
{

    public r()
    {
    }

    static void a(StreetViewPanoramaLink streetviewpanoramalink, Parcel parcel, int i)
    {
        i = b.H(parcel);
        b.c(parcel, 1, streetviewpanoramalink.getVersionCode());
        b.a(parcel, 2, streetviewpanoramalink.panoId, false);
        b.a(parcel, 3, streetviewpanoramalink.bearing);
        b.H(parcel, i);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return dj(parcel);
    }

    public StreetViewPanoramaLink dj(Parcel parcel)
    {
        int j = com.google.android.gms.common.internal.safeparcel.a.G(parcel);
        int i = 0;
        String s = null;
        float f = 0.0F;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = com.google.android.gms.common.internal.safeparcel.a.F(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.aH(k))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
                    break;

                case 2: // '\002'
                    s = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    break;

                case 3: // '\003'
                    f = com.google.android.gms.common.internal.safeparcel.a.l(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new StreetViewPanoramaLink(i, s, f);
            }
        } while (true);
    }

    public StreetViewPanoramaLink[] ff(int i)
    {
        return new StreetViewPanoramaLink[i];
    }

    public Object[] newArray(int i)
    {
        return ff(i);
    }
}
