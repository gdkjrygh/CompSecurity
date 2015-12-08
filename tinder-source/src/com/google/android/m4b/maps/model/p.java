// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.model;

import android.os.Parcel;
import com.google.android.m4b.maps.k.a;
import com.google.android.m4b.maps.k.b;

// Referenced classes of package com.google.android.m4b.maps.model:
//            StreetViewPanoramaLink

public final class p
    implements android.os.Parcelable.Creator
{

    public p()
    {
    }

    static void a(StreetViewPanoramaLink streetviewpanoramalink, Parcel parcel)
    {
        int i = b.a(parcel, 20293);
        b.b(parcel, 1, streetviewpanoramalink.a);
        b.a(parcel, 2, streetviewpanoramalink.b);
        b.a(parcel, 3, streetviewpanoramalink.c);
        b.b(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int j = com.google.android.m4b.maps.k.a.a(parcel);
        int i = 0;
        String s = null;
        float f = 0.0F;
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
                    s = com.google.android.m4b.maps.k.a.i(parcel, k);
                    break;

                case 3: // '\003'
                    f = com.google.android.m4b.maps.k.a.g(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.m4b.maps.k.a.a((new StringBuilder(37)).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new StreetViewPanoramaLink(i, s, f);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new StreetViewPanoramaLink[i];
    }
}
