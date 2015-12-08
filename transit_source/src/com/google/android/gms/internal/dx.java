// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.internal:
//            dr

public class dx
    implements android.os.Parcelable.Creator
{

    public dx()
    {
    }

    static void a(dw.a a1, Parcel parcel, int i)
    {
        int j = b.k(parcel);
        b.c(parcel, 1, a1.getVersionCode());
        b.c(parcel, 2, a1.bn());
        b.a(parcel, 3, a1.bt());
        b.c(parcel, 4, a1.bo());
        b.a(parcel, 5, a1.bu());
        b.a(parcel, 6, a1.bv(), false);
        b.c(parcel, 7, a1.bw());
        b.a(parcel, 8, a1.by(), false);
        b.a(parcel, 9, a1.bA(), i, false);
        b.C(parcel, j);
    }

    public dw.a[] C(int i)
    {
        return new dw.a[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return o(parcel);
    }

    public Object[] newArray(int i)
    {
        return C(i);
    }

    public dw.a o(Parcel parcel)
    {
        dr dr1 = null;
        int i = 0;
        int i1 = com.google.android.gms.common.internal.safeparcel.a.j(parcel);
        String s = null;
        String s1 = null;
        boolean flag = false;
        int j = 0;
        boolean flag1 = false;
        int k = 0;
        int l = 0;
        do
        {
            if (parcel.dataPosition() < i1)
            {
                int j1 = com.google.android.gms.common.internal.safeparcel.a.i(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.y(j1))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, j1);
                    break;

                case 1: // '\001'
                    l = com.google.android.gms.common.internal.safeparcel.a.f(parcel, j1);
                    break;

                case 2: // '\002'
                    k = com.google.android.gms.common.internal.safeparcel.a.f(parcel, j1);
                    break;

                case 3: // '\003'
                    flag1 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, j1);
                    break;

                case 4: // '\004'
                    j = com.google.android.gms.common.internal.safeparcel.a.f(parcel, j1);
                    break;

                case 5: // '\005'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, j1);
                    break;

                case 6: // '\006'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, j1);
                    break;

                case 7: // '\007'
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, j1);
                    break;

                case 8: // '\b'
                    s = com.google.android.gms.common.internal.safeparcel.a.l(parcel, j1);
                    break;

                case 9: // '\t'
                    dr1 = (dr)com.google.android.gms.common.internal.safeparcel.a.a(parcel, j1, dr.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != i1)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(i1).toString(), parcel);
            } else
            {
                return new dw.a(l, k, flag1, j, flag, s1, i, s, dr1);
            }
        } while (true);
    }
}
