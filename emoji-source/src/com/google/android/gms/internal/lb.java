// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.HashSet;
import java.util.Set;

public class lb
    implements android.os.Parcelable.Creator
{

    public lb()
    {
    }

    static void a(ks.g g, Parcel parcel, int i)
    {
        i = b.C(parcel);
        Set set = g.kk();
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
        b.G(parcel, i);
    }

    public ks.g bO(Parcel parcel)
    {
        boolean flag = false;
        int j = com.google.android.gms.common.internal.safeparcel.a.B(parcel);
        HashSet hashset = new HashSet();
        String s = null;
        int i = 0;
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
                return new ks.g(hashset, i, flag, s);
            }
        } while (true);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return bO(parcel);
    }

    public ks.g[] dl(int i)
    {
        return new ks.g[i];
    }

    public Object[] newArray(int i)
    {
        return dl(i);
    }
}
