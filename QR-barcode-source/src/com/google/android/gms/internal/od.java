// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.HashSet;
import java.util.Set;

public class od
    implements android.os.Parcelable.Creator
{

    public od()
    {
    }

    static void a(nz.b.a a1, Parcel parcel, int i)
    {
        i = b.D(parcel);
        Set set = a1.amc;
        if (set.contains(Integer.valueOf(1)))
        {
            b.c(parcel, 1, a1.BR);
        }
        if (set.contains(Integer.valueOf(2)))
        {
            b.c(parcel, 2, a1.any);
        }
        if (set.contains(Integer.valueOf(3)))
        {
            b.c(parcel, 3, a1.anz);
        }
        b.H(parcel, i);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return dg(parcel);
    }

    public nz.b.a dg(Parcel parcel)
    {
        int k = 0;
        int l = com.google.android.gms.common.internal.safeparcel.a.C(parcel);
        HashSet hashset = new HashSet();
        int j = 0;
        int i = 0;
        do
        {
            if (parcel.dataPosition() < l)
            {
                int i1 = com.google.android.gms.common.internal.safeparcel.a.B(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.aD(i1))
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
                return new nz.b.a(hashset, i, j, k);
            }
        } while (true);
    }

    public nz.b.a[] eY(int i)
    {
        return new nz.b.a[i];
    }

    public Object[] newArray(int i)
    {
        return eY(i);
    }
}
