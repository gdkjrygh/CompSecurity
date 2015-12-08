// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.internal:
//            fq, fn

public class fr
    implements android.os.Parcelable.Creator
{

    public fr()
    {
    }

    static void a(fq fq1, Parcel parcel, int i)
    {
        int j = b.C(parcel);
        b.a(parcel, 1, fq1.name, false);
        b.c(parcel, 1000, fq1.xJ);
        b.a(parcel, 2, fq1.xY, false);
        b.a(parcel, 3, fq1.xZ);
        b.c(parcel, 4, fq1.weight);
        b.a(parcel, 5, fq1.ya);
        b.a(parcel, 6, fq1.yb, false);
        b.a(parcel, 7, fq1.yc, i, false);
        b.a(parcel, 8, fq1.yd, false);
        b.a(parcel, 11, fq1.ye, false);
        b.G(parcel, j);
    }

    public fq[] J(int i)
    {
        return new fq[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return p(parcel);
    }

    public Object[] newArray(int i)
    {
        return J(i);
    }

    public fq p(Parcel parcel)
    {
        boolean flag = false;
        String s = null;
        int k = com.google.android.gms.common.internal.safeparcel.a.B(parcel);
        int i = 1;
        int ai[] = null;
        fn afn[] = null;
        String s1 = null;
        boolean flag1 = false;
        String s2 = null;
        String s3 = null;
        int j = 0;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = com.google.android.gms.common.internal.safeparcel.a.A(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.ar(l))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, l);
                    break;

                case 1: // '\001'
                    s3 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, l);
                    break;

                case 1000: 
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;

                case 2: // '\002'
                    s2 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, l);
                    break;

                case 3: // '\003'
                    flag1 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l);
                    break;

                case 4: // '\004'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;

                case 5: // '\005'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l);
                    break;

                case 6: // '\006'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, l);
                    break;

                case 7: // '\007'
                    afn = (fn[])com.google.android.gms.common.internal.safeparcel.a.b(parcel, l, fn.CREATOR);
                    break;

                case 8: // '\b'
                    ai = com.google.android.gms.common.internal.safeparcel.a.u(parcel, l);
                    break;

                case 11: // '\013'
                    s = com.google.android.gms.common.internal.safeparcel.a.o(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            } else
            {
                return new fq(j, s3, s2, flag1, i, flag, s1, afn, ai, s);
            }
        } while (true);
    }
}
