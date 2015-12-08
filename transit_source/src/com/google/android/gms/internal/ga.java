// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.HashSet;
import java.util.Set;

public class ga
    implements android.os.Parcelable.Creator
{

    public ga()
    {
    }

    static void a(fv.b.b b1, Parcel parcel, int i)
    {
        i = b.k(parcel);
        Set set = b1.di();
        if (set.contains(Integer.valueOf(1)))
        {
            b.c(parcel, 1, b1.getVersionCode());
        }
        if (set.contains(Integer.valueOf(2)))
        {
            b.c(parcel, 2, b1.getHeight());
        }
        if (set.contains(Integer.valueOf(3)))
        {
            b.a(parcel, 3, b1.getUrl(), true);
        }
        if (set.contains(Integer.valueOf(4)))
        {
            b.c(parcel, 4, b1.getWidth());
        }
        b.C(parcel, i);
    }

    public fv.b.b H(Parcel parcel)
    {
        int i = 0;
        int l = com.google.android.gms.common.internal.safeparcel.a.j(parcel);
        HashSet hashset = new HashSet();
        String s = null;
        int j = 0;
        int k = 0;
        do
        {
            if (parcel.dataPosition() < l)
            {
                int i1 = com.google.android.gms.common.internal.safeparcel.a.i(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.y(i1))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, i1);
                    break;

                case 1: // '\001'
                    k = com.google.android.gms.common.internal.safeparcel.a.f(parcel, i1);
                    hashset.add(Integer.valueOf(1));
                    break;

                case 2: // '\002'
                    j = com.google.android.gms.common.internal.safeparcel.a.f(parcel, i1);
                    hashset.add(Integer.valueOf(2));
                    break;

                case 3: // '\003'
                    s = com.google.android.gms.common.internal.safeparcel.a.l(parcel, i1);
                    hashset.add(Integer.valueOf(3));
                    break;

                case 4: // '\004'
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, i1);
                    hashset.add(Integer.valueOf(4));
                    break;
                }
            } else
            {
                if (parcel.dataPosition() != l)
                {
                    throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(l).toString(), parcel);
                }
                return new fv.b.b(hashset, k, j, s, i);
            }
        } while (true);
    }

    public fv.b.b[] am(int i)
    {
        return new fv.b.b[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return H(parcel);
    }

    public Object[] newArray(int i)
    {
        return am(i);
    }
}
