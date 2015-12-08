// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.HashSet;
import java.util.Set;

public class kz
    implements android.os.Parcelable.Creator
{

    public kz()
    {
    }

    static void a(ks.d d, Parcel parcel, int i)
    {
        i = b.C(parcel);
        Set set = d.kk();
        if (set.contains(Integer.valueOf(1)))
        {
            b.c(parcel, 1, d.getVersionCode());
        }
        if (set.contains(Integer.valueOf(2)))
        {
            b.a(parcel, 2, d.getFamilyName(), true);
        }
        if (set.contains(Integer.valueOf(3)))
        {
            b.a(parcel, 3, d.getFormatted(), true);
        }
        if (set.contains(Integer.valueOf(4)))
        {
            b.a(parcel, 4, d.getGivenName(), true);
        }
        if (set.contains(Integer.valueOf(5)))
        {
            b.a(parcel, 5, d.getHonorificPrefix(), true);
        }
        if (set.contains(Integer.valueOf(6)))
        {
            b.a(parcel, 6, d.getHonorificSuffix(), true);
        }
        if (set.contains(Integer.valueOf(7)))
        {
            b.a(parcel, 7, d.getMiddleName(), true);
        }
        b.G(parcel, i);
    }

    public ks.d bM(Parcel parcel)
    {
        String s = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.B(parcel);
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
                int k = com.google.android.gms.common.internal.safeparcel.a.A(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.ar(k))
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
                return new ks.d(hashset, i, s5, s4, s3, s2, s1, s);
            }
        } while (true);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return bM(parcel);
    }

    public ks.d[] dj(int i)
    {
        return new ks.d[i];
    }

    public Object[] newArray(int i)
    {
        return dj(i);
    }
}
