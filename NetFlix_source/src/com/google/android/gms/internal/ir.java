// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.HashSet;
import java.util.Set;

public class ir
    implements android.os.Parcelable.Creator
{

    public ir()
    {
    }

    static void a(ih.h h, Parcel parcel, int i)
    {
        i = b.p(parcel);
        Set set = h.ja();
        if (set.contains(Integer.valueOf(1)))
        {
            b.c(parcel, 1, h.getVersionCode());
        }
        if (set.contains(Integer.valueOf(3)))
        {
            b.c(parcel, 3, h.jN());
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
        b.F(parcel, i);
    }

    public ih.h aW(Parcel parcel)
    {
        String s = null;
        int i = 0;
        int l = com.google.android.gms.common.internal.safeparcel.a.o(parcel);
        HashSet hashset = new HashSet();
        int j = 0;
        String s1 = null;
        int k = 0;
        do
        {
            if (parcel.dataPosition() < l)
            {
                int i1 = com.google.android.gms.common.internal.safeparcel.a.n(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.R(i1))
                {
                case 2: // '\002'
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, i1);
                    break;

                case 1: // '\001'
                    k = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    hashset.add(Integer.valueOf(1));
                    break;

                case 3: // '\003'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    hashset.add(Integer.valueOf(3));
                    break;

                case 4: // '\004'
                    s = com.google.android.gms.common.internal.safeparcel.a.n(parcel, i1);
                    hashset.add(Integer.valueOf(4));
                    break;

                case 5: // '\005'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.n(parcel, i1);
                    hashset.add(Integer.valueOf(5));
                    break;

                case 6: // '\006'
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    hashset.add(Integer.valueOf(6));
                    break;
                }
            } else
            {
                if (parcel.dataPosition() != l)
                {
                    throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(l).toString(), parcel);
                }
                return new ih.h(hashset, k, s1, j, s, i);
            }
        } while (true);
    }

    public ih.h[] bZ(int i)
    {
        return new ih.h[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return aW(parcel);
    }

    public Object[] newArray(int i)
    {
        return bZ(i);
    }
}
