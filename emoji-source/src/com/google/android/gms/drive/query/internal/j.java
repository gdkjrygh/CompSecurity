// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.drive.query.internal:
//            NotFilter, FilterHolder

public class j
    implements android.os.Parcelable.Creator
{

    public j()
    {
    }

    static void a(NotFilter notfilter, Parcel parcel, int i)
    {
        int k = b.C(parcel);
        b.c(parcel, 1000, notfilter.xM);
        b.a(parcel, 1, notfilter.KZ, i, false);
        b.G(parcel, k);
    }

    public NotFilter aN(Parcel parcel)
    {
        int k = com.google.android.gms.common.internal.safeparcel.a.B(parcel);
        int i = 0;
        FilterHolder filterholder = null;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = com.google.android.gms.common.internal.safeparcel.a.A(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.ar(l))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, l);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;

                case 1: // '\001'
                    filterholder = (FilterHolder)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, FilterHolder.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            } else
            {
                return new NotFilter(i, filterholder);
            }
        } while (true);
    }

    public NotFilter[] bJ(int i)
    {
        return new NotFilter[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return aN(parcel);
    }

    public Object[] newArray(int i)
    {
        return bJ(i);
    }
}
