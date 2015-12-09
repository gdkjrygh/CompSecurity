// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.location.places:
//            PlaceType

public final class h
    implements android.os.Parcelable.Creator
{

    public h()
    {
    }

    static void a(PlaceType placetype, Parcel parcel, int i)
    {
        i = b.bU(parcel);
        b.a(parcel, 1, placetype.vc, false);
        b.c(parcel, 1000, placetype.mVersionCode);
        b.J(parcel, i);
    }

    private static PlaceType fR(Parcel parcel)
    {
        int j = com.google.android.gms.common.internal.safeparcel.a.bT(parcel);
        int i = 0;
        String s = null;
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
                    s = com.google.android.gms.common.internal.safeparcel.a.p(parcel, k);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new PlaceType(i, s);
            }
        } while (true);
    }

    private static PlaceType[] im(int i)
    {
        return new PlaceType[i];
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return fR(parcel);
    }

    public final Object[] newArray(int i)
    {
        return im(i);
    }
}
