// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.HashSet;
import java.util.Set;

public class gc
    implements android.os.Parcelable.Creator
{

    public gc()
    {
    }

    static void a(fv.d d, Parcel parcel, int i)
    {
        i = b.k(parcel);
        Set set = d.di();
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
        b.C(parcel, i);
    }

    public fv.d J(Parcel parcel)
    {
        String s = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.j(parcel);
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
                int k = com.google.android.gms.common.internal.safeparcel.a.i(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.y(k))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, k);
                    hashset.add(Integer.valueOf(1));
                    break;

                case 2: // '\002'
                    s5 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, k);
                    hashset.add(Integer.valueOf(2));
                    break;

                case 3: // '\003'
                    s4 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, k);
                    hashset.add(Integer.valueOf(3));
                    break;

                case 4: // '\004'
                    s3 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, k);
                    hashset.add(Integer.valueOf(4));
                    break;

                case 5: // '\005'
                    s2 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, k);
                    hashset.add(Integer.valueOf(5));
                    break;

                case 6: // '\006'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, k);
                    hashset.add(Integer.valueOf(6));
                    break;

                case 7: // '\007'
                    s = com.google.android.gms.common.internal.safeparcel.a.l(parcel, k);
                    hashset.add(Integer.valueOf(7));
                    break;
                }
            } else
            {
                if (parcel.dataPosition() != j)
                {
                    throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
                }
                return new fv.d(hashset, i, s5, s4, s3, s2, s1, s);
            }
        } while (true);
    }

    public fv.d[] ao(int i)
    {
        return new fv.d[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return J(parcel);
    }

    public Object[] newArray(int i)
    {
        return ao(i);
    }
}
