// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.HashSet;
import java.util.Set;

public class og
    implements android.os.Parcelable.Creator
{

    public og()
    {
    }

    static void a(nz.d d, Parcel parcel, int i)
    {
        i = b.D(parcel);
        Set set = d.amc;
        if (set.contains(Integer.valueOf(1)))
        {
            b.c(parcel, 1, d.BR);
        }
        if (set.contains(Integer.valueOf(2)))
        {
            b.a(parcel, 2, d.amA, true);
        }
        if (set.contains(Integer.valueOf(3)))
        {
            b.a(parcel, 3, d.anA, true);
        }
        if (set.contains(Integer.valueOf(4)))
        {
            b.a(parcel, 4, d.amD, true);
        }
        if (set.contains(Integer.valueOf(5)))
        {
            b.a(parcel, 5, d.anB, true);
        }
        if (set.contains(Integer.valueOf(6)))
        {
            b.a(parcel, 6, d.anC, true);
        }
        if (set.contains(Integer.valueOf(7)))
        {
            b.a(parcel, 7, d.anD, true);
        }
        b.H(parcel, i);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return dj(parcel);
    }

    public nz.d dj(Parcel parcel)
    {
        String s = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.C(parcel);
        HashSet hashset = new HashSet();
        int i = 0;
        String s1 = null;
        String s2 = null;
        String s3 = null;
        String s4 = null;
        String s5 = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = com.google.android.gms.common.internal.safeparcel.a.B(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.aD(k))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
                    hashset.add(Integer.valueOf(1));
                    break;

                case 2: // '\002'
                    s5 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    hashset.add(Integer.valueOf(2));
                    break;

                case 3: // '\003'
                    s4 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    hashset.add(Integer.valueOf(3));
                    break;

                case 4: // '\004'
                    s3 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    hashset.add(Integer.valueOf(4));
                    break;

                case 5: // '\005'
                    s2 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    hashset.add(Integer.valueOf(5));
                    break;

                case 6: // '\006'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    hashset.add(Integer.valueOf(6));
                    break;

                case 7: // '\007'
                    s = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    hashset.add(Integer.valueOf(7));
                    break;
                }
            } else
            {
                if (parcel.dataPosition() != j)
                {
                    throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
                }
                return new nz.d(hashset, i, s5, s4, s3, s2, s1, s);
            }
        } while (true);
    }

    public nz.d[] fb(int i)
    {
        return new nz.d[i];
    }

    public Object[] newArray(int i)
    {
        return fb(i);
    }
}
