// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.HashSet;
import java.util.Set;

public class fy
    implements android.os.Parcelable.Creator
{

    public fy()
    {
    }

    static void a(fv.b b1, Parcel parcel, int i)
    {
        int j = b.k(parcel);
        Set set = b1.di();
        if (set.contains(Integer.valueOf(1)))
        {
            b.c(parcel, 1, b1.getVersionCode());
        }
        if (set.contains(Integer.valueOf(2)))
        {
            b.a(parcel, 2, b1.dM(), i, true);
        }
        if (set.contains(Integer.valueOf(3)))
        {
            b.a(parcel, 3, b1.dN(), i, true);
        }
        if (set.contains(Integer.valueOf(4)))
        {
            b.c(parcel, 4, b1.getLayout());
        }
        b.C(parcel, j);
    }

    public fv.b F(Parcel parcel)
    {
        fv.b.b b1 = null;
        int i = 0;
        int k = com.google.android.gms.common.internal.safeparcel.a.j(parcel);
        HashSet hashset = new HashSet();
        fv.b.a a1 = null;
        int j = 0;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = com.google.android.gms.common.internal.safeparcel.a.i(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.y(l))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, l);
                    break;

                case 1: // '\001'
                    j = com.google.android.gms.common.internal.safeparcel.a.f(parcel, l);
                    hashset.add(Integer.valueOf(1));
                    break;

                case 2: // '\002'
                    a1 = (fv.b.a)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, fv.b.a.CREATOR);
                    hashset.add(Integer.valueOf(2));
                    break;

                case 3: // '\003'
                    b1 = (fv.b.b)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, fv.b.b.CREATOR);
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
                    throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
                }
                return new fv.b(hashset, j, a1, b1, i);
            }
        } while (true);
    }

    public fv.b[] ak(int i)
    {
        return new fv.b[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return F(parcel);
    }

    public Object[] newArray(int i)
    {
        return ak(i);
    }
}
