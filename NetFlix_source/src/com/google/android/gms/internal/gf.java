// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class gf
    implements android.os.Parcelable.Creator
{

    public gf()
    {
    }

    static void a(gd.a a1, Parcel parcel, int i)
    {
        i = b.p(parcel);
        b.c(parcel, 1, a1.versionCode);
        b.a(parcel, 2, a1.className, false);
        b.b(parcel, 3, a1.El, false);
        b.F(parcel, i);
    }

    public gd.a[] Y(int i)
    {
        return new gd.a[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return w(parcel);
    }

    public Object[] newArray(int i)
    {
        return Y(i);
    }

    public gd.a w(Parcel parcel)
    {
        java.util.ArrayList arraylist = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.o(parcel);
        int i = 0;
        String s = null;
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
                    break;

                case 2: // '\002'
                    s = com.google.android.gms.common.internal.safeparcel.a.n(parcel, k);
                    break;

                case 3: // '\003'
                    arraylist = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k, gd.b.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new gd.a(i, s, arraylist);
            }
        } while (true);
    }
}
