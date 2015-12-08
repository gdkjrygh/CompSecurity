// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class ku
    implements android.os.Parcelable.Creator
{

    public ku()
    {
    }

    static void a(kv.b b1, Parcel parcel, int i)
    {
        int j = b.H(parcel);
        b.c(parcel, 1, b1.versionCode);
        b.a(parcel, 2, b1.fv, false);
        b.a(parcel, 3, b1.NZ, i, false);
        b.H(parcel, j);
    }

    public kv.b N(Parcel parcel)
    {
        kr.a a1 = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.G(parcel);
        int i = 0;
        String s = null;
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
                    break;

                case 2: // '\002'
                    s = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    break;

                case 3: // '\003'
                    a1 = (kr.a)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, kr.a.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new kv.b(i, s, a1);
            }
        } while (true);
    }

    public kv.b[] aO(int i)
    {
        return new kv.b[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return N(parcel);
    }

    public Object[] newArray(int i)
    {
        return aO(i);
    }
}
