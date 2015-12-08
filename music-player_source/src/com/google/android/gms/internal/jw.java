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

public final class jw
    implements android.os.Parcelable.Creator
{

    public jw()
    {
    }

    static void a(ir.b b1, Parcel parcel, int i)
    {
        int j = c.a(parcel);
        Set set = b1.e();
        if (set.contains(Integer.valueOf(1)))
        {
            c.a(parcel, 1, b1.f());
        }
        if (set.contains(Integer.valueOf(2)))
        {
            c.a(parcel, 2, b1.g(), i, true);
        }
        if (set.contains(Integer.valueOf(3)))
        {
            c.a(parcel, 3, b1.h(), i, true);
        }
        if (set.contains(Integer.valueOf(4)))
        {
            c.a(parcel, 4, b1.i());
        }
        c.a(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        ir.b.b b1 = null;
        int i = 0;
        int k = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        HashSet hashset = new HashSet();
        ir.b.a a1 = null;
        int j = 0;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = parcel.readInt();
                switch (0xffff & l)
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, l);
                    break;

                case 1: // '\001'
                    j = com.google.android.gms.common.internal.safeparcel.a.f(parcel, l);
                    hashset.add(Integer.valueOf(1));
                    break;

                case 2: // '\002'
                    a1 = (ir.b.a)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, com.google.android.gms.internal.ir.b.a.a);
                    hashset.add(Integer.valueOf(2));
                    break;

                case 3: // '\003'
                    b1 = (ir.b.b)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, com.google.android.gms.internal.ir.b.b.a);
                    hashset.add(Integer.valueOf(3));
                    break;

                case 4: // '\004'
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, l);
                    hashset.add(Integer.valueOf(4));
                    break;
                }
            } else
            {
                if (parcel.dataPosition() != k)
                {
                    throw new b((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
                }
                return new ir.b(hashset, j, a1, b1, i);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new ir.b[i];
    }
}
