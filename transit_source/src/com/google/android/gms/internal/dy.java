// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class dy
    implements android.os.Parcelable.Creator
{

    public dy()
    {
    }

    static void a(dz.b b1, Parcel parcel, int i)
    {
        int j = b.k(parcel);
        b.c(parcel, 1, b1.versionCode);
        b.a(parcel, 2, b1.lN, false);
        b.a(parcel, 3, b1.lO, i, false);
        b.C(parcel, j);
    }

    public dz.b[] D(int i)
    {
        return new dz.b[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return p(parcel);
    }

    public Object[] newArray(int i)
    {
        return D(i);
    }

    public dz.b p(Parcel parcel)
    {
        dw.a a1 = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.j(parcel);
        int i = 0;
        String s = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = com.google.android.gms.common.internal.safeparcel.a.i(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.y(k))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, k);
                    break;

                case 2: // '\002'
                    s = com.google.android.gms.common.internal.safeparcel.a.l(parcel, k);
                    break;

                case 3: // '\003'
                    a1 = (dw.a)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, dw.a.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new dz.b(i, s, a1);
            }
        } while (true);
    }
}
