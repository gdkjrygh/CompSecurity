// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class dv
    implements android.os.Parcelable.Creator
{

    public dv()
    {
    }

    static void a(dt.a a1, Parcel parcel, int i)
    {
        i = b.k(parcel);
        b.c(parcel, 1, a1.versionCode);
        b.a(parcel, 2, a1.lx, false);
        b.c(parcel, 3, a1.ly);
        b.C(parcel, i);
    }

    public dt.a[] B(int i)
    {
        return new dt.a[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return n(parcel);
    }

    public dt.a n(Parcel parcel)
    {
        int j = 0;
        int k = com.google.android.gms.common.internal.safeparcel.a.j(parcel);
        String s = null;
        int i = 0;
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
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, l);
                    break;

                case 2: // '\002'
                    s = com.google.android.gms.common.internal.safeparcel.a.l(parcel, l);
                    break;

                case 3: // '\003'
                    j = com.google.android.gms.common.internal.safeparcel.a.f(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            } else
            {
                return new dt.a(i, s, j);
            }
        } while (true);
    }

    public Object[] newArray(int i)
    {
        return B(i);
    }
}
