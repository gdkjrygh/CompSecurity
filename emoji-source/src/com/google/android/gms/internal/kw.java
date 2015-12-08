// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.HashSet;
import java.util.Set;

public class kw
    implements android.os.Parcelable.Creator
{

    public kw()
    {
    }

    static void a(ks.b.a a1, Parcel parcel, int i)
    {
        i = b.C(parcel);
        Set set = a1.kk();
        if (set.contains(Integer.valueOf(1)))
        {
            b.c(parcel, 1, a1.getVersionCode());
        }
        if (set.contains(Integer.valueOf(2)))
        {
            b.c(parcel, 2, a1.getLeftImageOffset());
        }
        if (set.contains(Integer.valueOf(3)))
        {
            b.c(parcel, 3, a1.getTopImageOffset());
        }
        b.G(parcel, i);
    }

    public ks.b.a bJ(Parcel parcel)
    {
        int k = 0;
        int l = com.google.android.gms.common.internal.safeparcel.a.B(parcel);
        HashSet hashset = new HashSet();
        int j = 0;
        int i = 0;
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
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    hashset.add(Integer.valueOf(1));
                    break;

                case 2: // '\002'
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    hashset.add(Integer.valueOf(2));
                    break;

                case 3: // '\003'
                    k = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    hashset.add(Integer.valueOf(3));
                    break;
                }
            } else
            {
                if (parcel.dataPosition() != l)
                {
                    throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(l).toString(), parcel);
                }
                return new ks.b.a(hashset, i, j, k);
            }
        } while (true);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return bJ(parcel);
    }

    public ks.b.a[] dg(int i)
    {
        return new ks.b.a[i];
    }

    public Object[] newArray(int i)
    {
        return dg(i);
    }
}
