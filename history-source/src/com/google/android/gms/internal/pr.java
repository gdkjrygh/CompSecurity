// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.HashSet;
import java.util.Set;

public class pr
    implements android.os.Parcelable.Creator
{

    public pr()
    {
    }

    static void a(pi.g g, Parcel parcel, int i)
    {
        i = b.H(parcel);
        Set set = g.aon;
        if (set.contains(Integer.valueOf(1)))
        {
            b.c(parcel, 1, g.CK);
        }
        if (set.contains(Integer.valueOf(2)))
        {
            b.a(parcel, 2, g.apR);
        }
        if (set.contains(Integer.valueOf(3)))
        {
            b.a(parcel, 3, g.mValue, true);
        }
        b.H(parcel, i);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return dH(parcel);
    }

    public pi.g dH(Parcel parcel)
    {
        boolean flag = false;
        int j = com.google.android.gms.common.internal.safeparcel.a.G(parcel);
        HashSet hashset = new HashSet();
        String s = null;
        int i = 0;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = com.google.android.gms.common.internal.safeparcel.a.F(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.aH(k))
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
                    s = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    hashset.add(Integer.valueOf(3));
                    break;
                }
            } else
            {
                if (parcel.dataPosition() != j)
                {
                    throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
                }
                return new pi.g(hashset, i, flag, s);
            }
        } while (true);
    }

    public pi.g[] fF(int i)
    {
        return new pi.g[i];
    }

    public Object[] newArray(int i)
    {
        return fF(i);
    }
}
