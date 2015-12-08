// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class eb
    implements android.os.Parcelable.Creator
{

    public eb()
    {
    }

    static void a(dz.a a1, Parcel parcel, int i)
    {
        i = b.k(parcel);
        b.c(parcel, 1, a1.versionCode);
        b.a(parcel, 2, a1.className, false);
        b.b(parcel, 3, a1.lM, false);
        b.C(parcel, i);
    }

    public dz.a[] F(int i)
    {
        return new dz.a[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return r(parcel);
    }

    public Object[] newArray(int i)
    {
        return F(i);
    }

    public dz.a r(Parcel parcel)
    {
        java.util.ArrayList arraylist = null;
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
                    arraylist = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k, dz.b.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new dz.a(i, s, arraylist);
            }
        } while (true);
    }
}
