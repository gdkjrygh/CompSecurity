// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class jl
    implements android.os.Parcelable.Creator
{

    public jl()
    {
    }

    static void a(jm.b b1, Parcel parcel, int i)
    {
        int j = b.D(parcel);
        b.c(parcel, 1, b1.versionCode);
        b.a(parcel, 2, b1.fv, false);
        b.a(parcel, 3, b1.MM, i, false);
        b.H(parcel, j);
    }

    public jm.b J(Parcel parcel)
    {
        ji.a a1 = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.C(parcel);
        int i = 0;
        String s = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = com.google.android.gms.common.internal.safeparcel.a.B(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.aD(k))
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
                    a1 = (ji.a)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, ji.a.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new jm.b(i, s, a1);
            }
        } while (true);
    }

    public jm.b[] aJ(int i)
    {
        return new jm.b[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return J(parcel);
    }

    public Object[] newArray(int i)
    {
        return aJ(i);
    }
}
