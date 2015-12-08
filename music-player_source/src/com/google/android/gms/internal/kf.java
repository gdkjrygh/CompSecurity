// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import java.util.HashSet;
import java.util.Set;

public final class kf
    implements android.os.Parcelable.Creator
{

    public kf()
    {
    }

    static void a(ir.h h, Parcel parcel)
    {
        int i = c.a(parcel);
        Set set = h.e();
        if (set.contains(Integer.valueOf(1)))
        {
            c.a(parcel, 1, h.f());
        }
        if (set.contains(Integer.valueOf(3)))
        {
            c.a(parcel, 3, ir.h.h());
        }
        if (set.contains(Integer.valueOf(4)))
        {
            c.a(parcel, 4, h.j(), true);
        }
        if (set.contains(Integer.valueOf(5)))
        {
            c.a(parcel, 5, h.g(), true);
        }
        if (set.contains(Integer.valueOf(6)))
        {
            c.a(parcel, 6, h.i());
        }
        c.a(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        String s = null;
        int i = 0;
        int k = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        HashSet hashset = new HashSet();
        String s1 = null;
        int j = 0;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = parcel.readInt();
                switch (0xffff & l)
                {
                case 2: // '\002'
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, l);
                    break;

                case 1: // '\001'
                    j = com.google.android.gms.common.internal.safeparcel.a.f(parcel, l);
                    hashset.add(Integer.valueOf(1));
                    break;

                case 3: // '\003'
                    com.google.android.gms.common.internal.safeparcel.a.f(parcel, l);
                    hashset.add(Integer.valueOf(3));
                    break;

                case 4: // '\004'
                    s = com.google.android.gms.common.internal.safeparcel.a.l(parcel, l);
                    hashset.add(Integer.valueOf(4));
                    break;

                case 5: // '\005'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, l);
                    hashset.add(Integer.valueOf(5));
                    break;

                case 6: // '\006'
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, l);
                    hashset.add(Integer.valueOf(6));
                    break;
                }
            } else
            {
                if (parcel.dataPosition() != k)
                {
                    throw new b((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
                }
                return new ir.h(hashset, j, s1, i, s);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new ir.h[i];
    }
}
