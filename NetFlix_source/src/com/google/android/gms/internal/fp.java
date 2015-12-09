// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class fp
    implements android.os.Parcelable.Creator
{

    public fp()
    {
    }

    static void a(fc.a a1, Parcel parcel, int i)
    {
        i = b.p(parcel);
        b.a(parcel, 1, a1.getAccountName(), false);
        b.c(parcel, 1000, a1.getVersionCode());
        b.a(parcel, 2, a1.eE(), false);
        b.c(parcel, 3, a1.eD());
        b.a(parcel, 4, a1.eG(), false);
        b.F(parcel, i);
    }

    public fc.a[] Q(int i)
    {
        return new fc.a[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return m(parcel);
    }

    public fc.a m(Parcel parcel)
    {
        int i = 0;
        String s = null;
        int k = com.google.android.gms.common.internal.safeparcel.a.o(parcel);
        java.util.ArrayList arraylist = null;
        String s1 = null;
        int j = 0;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = com.google.android.gms.common.internal.safeparcel.a.n(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.R(l))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, l);
                    break;

                case 1: // '\001'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.n(parcel, l);
                    break;

                case 1000: 
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;

                case 2: // '\002'
                    arraylist = com.google.android.gms.common.internal.safeparcel.a.A(parcel, l);
                    break;

                case 3: // '\003'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;

                case 4: // '\004'
                    s = com.google.android.gms.common.internal.safeparcel.a.n(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            } else
            {
                return new fc.a(j, s1, arraylist, i, s);
            }
        } while (true);
    }

    public Object[] newArray(int i)
    {
        return Q(i);
    }
}
