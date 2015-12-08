// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.internal:
//            hq, hk

public class hr
    implements android.os.Parcelable.Creator
{

    public hr()
    {
    }

    static void a(hq hq1, Parcel parcel, int i)
    {
        int j = b.D(parcel);
        b.a(parcel, 1, hq1.name, false);
        b.c(parcel, 1000, hq1.BR);
        b.a(parcel, 2, hq1.Co, false);
        b.a(parcel, 3, hq1.Cp);
        b.c(parcel, 4, hq1.weight);
        b.a(parcel, 5, hq1.Cq);
        b.a(parcel, 6, hq1.Cr, false);
        b.a(parcel, 7, hq1.Cs, i, false);
        b.a(parcel, 8, hq1.Ct, false);
        b.a(parcel, 11, hq1.Cu, false);
        b.H(parcel, j);
    }

    public hq[] Q(int i)
    {
        return new hq[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return r(parcel);
    }

    public Object[] newArray(int i)
    {
        return Q(i);
    }

    public hq r(Parcel parcel)
    {
        boolean flag = false;
        String s = null;
        int k = com.google.android.gms.common.internal.safeparcel.a.C(parcel);
        int i = 1;
        int ai[] = null;
        hk ahk[] = null;
        String s1 = null;
        boolean flag1 = false;
        String s2 = null;
        String s3 = null;
        int j = 0;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = com.google.android.gms.common.internal.safeparcel.a.B(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.aD(l))
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
                    ahk = (hk[])com.google.android.gms.common.internal.safeparcel.a.b(parcel, l, hk.CREATOR);
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
                return new hq(j, s3, s2, flag1, i, flag, s1, ahk, ai, s);
            }
        } while (true);
    }
}
