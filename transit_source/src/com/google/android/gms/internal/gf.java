// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.HashSet;
import java.util.Set;

public class gf
    implements android.os.Parcelable.Creator
{

    public gf()
    {
    }

    static void a(fv.h h, Parcel parcel, int i)
    {
        i = b.k(parcel);
        Set set = h.di();
        if (set.contains(Integer.valueOf(1)))
        {
            b.c(parcel, 1, h.getVersionCode());
        }
        if (set.contains(Integer.valueOf(3)))
        {
            b.c(parcel, 3, h.dV());
        }
        if (set.contains(Integer.valueOf(4)))
        {
            b.a(parcel, 4, h.getValue(), true);
        }
        if (set.contains(Integer.valueOf(5)))
        {
            b.a(parcel, 5, h.getLabel(), true);
        }
        if (set.contains(Integer.valueOf(6)))
        {
            b.c(parcel, 6, h.getType());
        }
        b.C(parcel, i);
    }

    public fv.h M(Parcel parcel)
    {
        String s = null;
        int i = 0;
        int l = com.google.android.gms.common.internal.safeparcel.a.j(parcel);
        HashSet hashset = new HashSet();
        int j = 0;
        String s1 = null;
        int k = 0;
        do
        {
            if (parcel.dataPosition() < l)
            {
                int i1 = com.google.android.gms.common.internal.safeparcel.a.i(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.y(i1))
                {
                case 2: // '\002'
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, i1);
                    break;

                case 1: // '\001'
                    k = com.google.android.gms.common.internal.safeparcel.a.f(parcel, i1);
                    hashset.add(Integer.valueOf(1));
                    break;

                case 3: // '\003'
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, i1);
                    hashset.add(Integer.valueOf(3));
                    break;

                case 4: // '\004'
                    s = com.google.android.gms.common.internal.safeparcel.a.l(parcel, i1);
                    hashset.add(Integer.valueOf(4));
                    break;

                case 5: // '\005'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, i1);
                    hashset.add(Integer.valueOf(5));
                    break;

                case 6: // '\006'
                    j = com.google.android.gms.common.internal.safeparcel.a.f(parcel, i1);
                    hashset.add(Integer.valueOf(6));
                    break;
                }
            } else
            {
                if (parcel.dataPosition() != l)
                {
                    throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(l).toString(), parcel);
                }
                return new fv.h(hashset, k, s1, j, s, i);
            }
        } while (true);
    }

    public fv.h[] ar(int i)
    {
        return new fv.h[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return M(parcel);
    }

    public Object[] newArray(int i)
    {
        return ar(i);
    }
}
