// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.maps.model:
//            StreetViewPanoramaLink

public final class r
    implements android.os.Parcelable.Creator
{

    public r()
    {
    }

    static void a(StreetViewPanoramaLink streetviewpanoramalink, Parcel parcel, int i)
    {
        i = b.bU(parcel);
        b.c(parcel, 1, streetviewpanoramalink.getVersionCode());
        b.a(parcel, 2, streetviewpanoramalink.panoId, false);
        b.a(parcel, 3, streetviewpanoramalink.bearing);
        b.J(parcel, i);
    }

    private static StreetViewPanoramaLink gv(Parcel parcel)
    {
        int j = com.google.android.gms.common.internal.safeparcel.a.bT(parcel);
        int i = 0;
        String s = null;
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
                    s = com.google.android.gms.common.internal.safeparcel.a.p(parcel, k);
                    break;

                case 3: // '\003'
                    f = com.google.android.gms.common.internal.safeparcel.a.l(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new StreetViewPanoramaLink(i, s, f);
            }
        } while (true);
    }

    private static StreetViewPanoramaLink[] iU(int i)
    {
        return new StreetViewPanoramaLink[i];
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return gv(parcel);
    }

    public final Object[] newArray(int i)
    {
        return iU(i);
    }
}
