// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.drive.query.internal:
//            NotFilter, FilterHolder

public class k
    implements android.os.Parcelable.Creator
{

    public k()
    {
    }

    static void a(NotFilter notfilter, Parcel parcel, int i)
    {
        int j = b.H(parcel);
        b.c(parcel, 1000, notfilter.CK);
        b.a(parcel, 1, notfilter.Sv, i, false);
        b.H(parcel, j);
    }

    public NotFilter ba(Parcel parcel)
    {
        int j = com.google.android.gms.common.internal.safeparcel.a.G(parcel);
        int i = 0;
        FilterHolder filterholder = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int l = com.google.android.gms.common.internal.safeparcel.a.F(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.aH(l))
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
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new NotFilter(i, filterholder);
            }
        } while (true);
    }

    public NotFilter[] cp(int i)
    {
        return new NotFilter[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return ba(parcel);
    }

    public Object[] newArray(int i)
    {
        return cp(i);
    }
}
