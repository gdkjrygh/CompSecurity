// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.internal:
//            fk

public class fl
    implements android.os.Parcelable.Creator
{

    public fl()
    {
    }

    static void a(fk fk1, Parcel parcel, int j)
    {
        j = b.D(parcel);
        b.c(parcel, 1, fk1.versionCode);
        b.a(parcel, 2, fk1.rP, false);
        b.a(parcel, 3, fk1.tG, false);
        b.b(parcel, 4, fk1.qf, false);
        b.c(parcel, 5, fk1.errorCode);
        b.b(parcel, 6, fk1.qg, false);
        b.a(parcel, 7, fk1.tH);
        b.a(parcel, 8, fk1.tI);
        b.a(parcel, 9, fk1.tJ);
        b.b(parcel, 10, fk1.tK, false);
        b.a(parcel, 11, fk1.qj);
        b.c(parcel, 12, fk1.orientation);
        b.a(parcel, 13, fk1.tL, false);
        b.a(parcel, 14, fk1.tM);
        b.a(parcel, 15, fk1.tN, false);
        b.a(parcel, 19, fk1.tP, false);
        b.a(parcel, 18, fk1.tO);
        b.a(parcel, 21, fk1.tQ, false);
        b.a(parcel, 23, fk1.tS);
        b.a(parcel, 22, fk1.tR);
        b.a(parcel, 25, fk1.tT);
        b.a(parcel, 24, fk1.tF);
        b.H(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return i(parcel);
    }

    public fk i(Parcel parcel)
    {
        int i1 = com.google.android.gms.common.internal.safeparcel.a.C(parcel);
        int l = 0;
        String s5 = null;
        String s4 = null;
        java.util.ArrayList arraylist2 = null;
        int k = 0;
        java.util.ArrayList arraylist1 = null;
        long l4 = 0L;
        boolean flag5 = false;
        long l3 = 0L;
        java.util.ArrayList arraylist = null;
        long l2 = 0L;
        int j = 0;
        String s3 = null;
        long l1 = 0L;
        String s2 = null;
        boolean flag4 = false;
        String s1 = null;
        String s = null;
        boolean flag3 = false;
        boolean flag2 = false;
        boolean flag1 = false;
        boolean flag = false;
        do
        {
            if (parcel.dataPosition() < i1)
            {
                int j1 = com.google.android.gms.common.internal.safeparcel.a.B(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.aD(j1))
                {
                case 16: // '\020'
                case 17: // '\021'
                case 20: // '\024'
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, j1);
                    break;

                case 1: // '\001'
                    l = com.google.android.gms.common.internal.safeparcel.a.g(parcel, j1);
                    break;

                case 2: // '\002'
                    s5 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, j1);
                    break;

                case 3: // '\003'
                    s4 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, j1);
                    break;

                case 4: // '\004'
                    arraylist2 = com.google.android.gms.common.internal.safeparcel.a.C(parcel, j1);
                    break;

                case 5: // '\005'
                    k = com.google.android.gms.common.internal.safeparcel.a.g(parcel, j1);
                    break;

                case 6: // '\006'
                    arraylist1 = com.google.android.gms.common.internal.safeparcel.a.C(parcel, j1);
                    break;

                case 7: // '\007'
                    l4 = com.google.android.gms.common.internal.safeparcel.a.i(parcel, j1);
                    break;

                case 8: // '\b'
                    flag5 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, j1);
                    break;

                case 9: // '\t'
                    l3 = com.google.android.gms.common.internal.safeparcel.a.i(parcel, j1);
                    break;

                case 10: // '\n'
                    arraylist = com.google.android.gms.common.internal.safeparcel.a.C(parcel, j1);
                    break;

                case 11: // '\013'
                    l2 = com.google.android.gms.common.internal.safeparcel.a.i(parcel, j1);
                    break;

                case 12: // '\f'
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, j1);
                    break;

                case 13: // '\r'
                    s3 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, j1);
                    break;

                case 14: // '\016'
                    l1 = com.google.android.gms.common.internal.safeparcel.a.i(parcel, j1);
                    break;

                case 15: // '\017'
                    s2 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, j1);
                    break;

                case 19: // '\023'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, j1);
                    break;

                case 18: // '\022'
                    flag4 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, j1);
                    break;

                case 21: // '\025'
                    s = com.google.android.gms.common.internal.safeparcel.a.o(parcel, j1);
                    break;

                case 23: // '\027'
                    flag2 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, j1);
                    break;

                case 22: // '\026'
                    flag3 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, j1);
                    break;

                case 25: // '\031'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, j1);
                    break;

                case 24: // '\030'
                    flag1 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, j1);
                    break;
                }
            } else
            if (parcel.dataPosition() != i1)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(i1).toString(), parcel);
            } else
            {
                return new fk(l, s5, s4, arraylist2, k, arraylist1, l4, flag5, l3, arraylist, l2, j, s3, l1, s2, flag4, s1, s, flag3, flag2, flag1, flag);
            }
        } while (true);
    }

    public Object[] newArray(int j)
    {
        return q(j);
    }

    public fk[] q(int j)
    {
        return new fk[j];
    }
}
