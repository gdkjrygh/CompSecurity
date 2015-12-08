// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.internal:
//            gt

public class gu
    implements android.os.Parcelable.Creator
{

    public gu()
    {
    }

    static void a(gt gt1, Parcel parcel, int i)
    {
        i = b.D(parcel);
        b.c(parcel, 1, gt1.versionCode);
        b.a(parcel, 2, gt1.wD, false);
        b.c(parcel, 3, gt1.wE);
        b.c(parcel, 4, gt1.wF);
        b.a(parcel, 5, gt1.wG);
        b.H(parcel, i);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return j(parcel);
    }

    public gt j(Parcel parcel)
    {
        boolean flag = false;
        int i1 = com.google.android.gms.common.internal.safeparcel.a.C(parcel);
        String s = null;
        int i = 0;
        int k = 0;
        int l = 0;
        do
        {
            if (parcel.dataPosition() < i1)
            {
                int j1 = com.google.android.gms.common.internal.safeparcel.a.B(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.aD(j1))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, j1);
                    break;

                case 1: // '\001'
                    l = com.google.android.gms.common.internal.safeparcel.a.g(parcel, j1);
                    break;

                case 2: // '\002'
                    s = com.google.android.gms.common.internal.safeparcel.a.o(parcel, j1);
                    break;

                case 3: // '\003'
                    k = com.google.android.gms.common.internal.safeparcel.a.g(parcel, j1);
                    break;

                case 4: // '\004'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, j1);
                    break;

                case 5: // '\005'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, j1);
                    break;
                }
            } else
            if (parcel.dataPosition() != i1)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(i1).toString(), parcel);
            } else
            {
                return new gt(l, s, k, i, flag);
            }
        } while (true);
    }

    public Object[] newArray(int i)
    {
        return v(i);
    }

    public gt[] v(int i)
    {
        return new gt[i];
    }
}
