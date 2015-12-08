// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.internal:
//            fp, fm

public class fq
    implements android.os.Parcelable.Creator
{

    public fq()
    {
    }

    static void a(fp fp1, Parcel parcel, int i)
    {
        int j = b.C(parcel);
        b.a(parcel, 1, fp1.name, false);
        b.c(parcel, 1000, fp1.xM);
        b.a(parcel, 2, fp1.yb, false);
        b.a(parcel, 3, fp1.yc);
        b.c(parcel, 4, fp1.weight);
        b.a(parcel, 5, fp1.yd);
        b.a(parcel, 6, fp1.ye, false);
        b.a(parcel, 7, fp1.yf, i, false);
        b.a(parcel, 8, fp1.yg, false);
        b.a(parcel, 11, fp1.yh, false);
        b.G(parcel, j);
    }

    public fp[] J(int i)
    {
        return new fp[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return p(parcel);
    }

    public Object[] newArray(int i)
    {
        return J(i);
    }

    public fp p(Parcel parcel)
    {
        boolean flag = false;
        String s = null;
        int k = com.google.android.gms.common.internal.safeparcel.a.B(parcel);
        int i = 1;
        int ai[] = null;
        fm afm[] = null;
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
                    afm = (fm[])com.google.android.gms.common.internal.safeparcel.a.b(parcel, l, fm.CREATOR);
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
                return new fp(j, s3, s2, flag1, i, flag, s1, afm, ai, s);
            }
        } while (true);
    }
}
