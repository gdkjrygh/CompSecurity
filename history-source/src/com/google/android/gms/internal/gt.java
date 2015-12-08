// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.internal:
//            gs

public class gt
    implements android.os.Parcelable.Creator
{

    public gt()
    {
    }

    static void a(gs gs1, Parcel parcel, int i)
    {
        i = b.H(parcel);
        b.c(parcel, 1, gs1.versionCode);
        b.a(parcel, 2, gs1.wS, false);
        b.c(parcel, 3, gs1.wT);
        b.c(parcel, 4, gs1.wU);
        b.a(parcel, 5, gs1.wV);
        b.H(parcel, i);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return j(parcel);
    }

    public gs j(Parcel parcel)
    {
        boolean flag = false;
        int i1 = com.google.android.gms.common.internal.safeparcel.a.G(parcel);
        String s = null;
        int i = 0;
        int k = 0;
        int l = 0;
        do
        {
            if (parcel.dataPosition() < i1)
            {
                int j1 = com.google.android.gms.common.internal.safeparcel.a.F(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.aH(j1))
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
                return new gs(l, s, k, i, flag);
            }
        } while (true);
    }

    public Object[] newArray(int i)
    {
        return w(i);
    }

    public gs[] w(int i)
    {
        return new gs[i];
    }
}
