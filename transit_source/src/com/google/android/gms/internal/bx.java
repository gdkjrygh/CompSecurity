// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.internal:
//            bw

public class bx
    implements android.os.Parcelable.Creator
{

    public bx()
    {
    }

    static void a(bw bw1, Parcel parcel, int i)
    {
        i = b.k(parcel);
        b.c(parcel, 1, bw1.versionCode);
        b.a(parcel, 2, bw1.fW, false);
        b.a(parcel, 3, bw1.gG, false);
        b.a(parcel, 4, bw1.eW, false);
        b.c(parcel, 5, bw1.errorCode);
        b.a(parcel, 6, bw1.eX, false);
        b.a(parcel, 7, bw1.gH);
        b.a(parcel, 8, bw1.gI);
        b.a(parcel, 9, bw1.gJ);
        b.a(parcel, 10, bw1.gK, false);
        b.a(parcel, 11, bw1.fa);
        b.c(parcel, 12, bw1.orientation);
        b.C(parcel, i);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return f(parcel);
    }

    public bw f(Parcel parcel)
    {
        int i1 = com.google.android.gms.common.internal.safeparcel.a.j(parcel);
        int l = 0;
        String s1 = null;
        String s = null;
        java.util.ArrayList arraylist2 = null;
        int k = 0;
        java.util.ArrayList arraylist1 = null;
        long l3 = 0L;
        boolean flag = false;
        long l2 = 0L;
        java.util.ArrayList arraylist = null;
        long l1 = 0L;
        int i = 0;
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
                    s1 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, j1);
                    break;

                case 3: // '\003'
                    s = com.google.android.gms.common.internal.safeparcel.a.l(parcel, j1);
                    break;

                case 4: // '\004'
                    arraylist2 = com.google.android.gms.common.internal.safeparcel.a.x(parcel, j1);
                    break;

                case 5: // '\005'
                    k = com.google.android.gms.common.internal.safeparcel.a.f(parcel, j1);
                    break;

                case 6: // '\006'
                    arraylist1 = com.google.android.gms.common.internal.safeparcel.a.x(parcel, j1);
                    break;

                case 7: // '\007'
                    l3 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, j1);
                    break;

                case 8: // '\b'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, j1);
                    break;

                case 9: // '\t'
                    l2 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, j1);
                    break;

                case 10: // '\n'
                    arraylist = com.google.android.gms.common.internal.safeparcel.a.x(parcel, j1);
                    break;

                case 11: // '\013'
                    l1 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, j1);
                    break;

                case 12: // '\f'
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, j1);
                    break;
                }
            } else
            if (parcel.dataPosition() != i1)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(i1).toString(), parcel);
            } else
            {
                return new bw(l, s1, s, arraylist2, k, arraylist1, l3, flag, l2, arraylist, l1, i);
            }
        } while (true);
    }

    public bw[] j(int i)
    {
        return new bw[i];
    }

    public Object[] newArray(int i)
    {
        return j(i);
    }
}
