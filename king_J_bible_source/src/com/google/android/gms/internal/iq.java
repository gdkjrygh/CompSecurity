// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.HashSet;
import java.util.Set;

public class iq
    implements android.os.Parcelable.Creator
{

    public iq()
    {
    }

    static void a(ih.g g, Parcel parcel, int i)
    {
        i = b.p(parcel);
        Set set = g.ja();
        if (set.contains(Integer.valueOf(1)))
        {
            b.c(parcel, 1, g.getVersionCode());
        }
        if (set.contains(Integer.valueOf(2)))
        {
            b.a(parcel, 2, g.isPrimary());
        }
        if (set.contains(Integer.valueOf(3)))
        {
            b.a(parcel, 3, g.getValue(), true);
        }
        b.F(parcel, i);
    }

    public ih.g aV(Parcel parcel)
    {
        boolean flag = false;
        int j = com.google.android.gms.common.internal.safeparcel.a.o(parcel);
        HashSet hashset = new HashSet();
        String s = null;
        int i = 0;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = com.google.android.gms.common.internal.safeparcel.a.n(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.R(k))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
                    hashset.add(Integer.valueOf(1));
                    break;

                case 2: // '\002'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k);
                    hashset.add(Integer.valueOf(2));
                    break;

                case 3: // '\003'
                    s = com.google.android.gms.common.internal.safeparcel.a.n(parcel, k);
                    hashset.add(Integer.valueOf(3));
                    break;
                }
            } else
            {
                if (parcel.dataPosition() != j)
                {
                    throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
                }
                return new ih.g(hashset, i, flag, s);
            }
        } while (true);
    }

    public ih.g[] bY(int i)
    {
        return new ih.g[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return aV(parcel);
    }

    public Object[] newArray(int i)
    {
        return bY(i);
    }
}
