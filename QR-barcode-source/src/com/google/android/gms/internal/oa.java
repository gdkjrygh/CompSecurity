// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            nz

public class oa
    implements android.os.Parcelable.Creator
{

    public oa()
    {
    }

    static void a(nz nz1, Parcel parcel, int i)
    {
        int j = b.D(parcel);
        Set set = nz1.amc;
        if (set.contains(Integer.valueOf(1)))
        {
            b.c(parcel, 1, nz1.BR);
        }
        if (set.contains(Integer.valueOf(2)))
        {
            b.a(parcel, 2, nz1.ana, true);
        }
        if (set.contains(Integer.valueOf(3)))
        {
            b.a(parcel, 3, nz1.anb, i, true);
        }
        if (set.contains(Integer.valueOf(4)))
        {
            b.a(parcel, 4, nz1.anc, true);
        }
        if (set.contains(Integer.valueOf(5)))
        {
            b.a(parcel, 5, nz1.and, true);
        }
        if (set.contains(Integer.valueOf(6)))
        {
            b.c(parcel, 6, nz1.ane);
        }
        if (set.contains(Integer.valueOf(7)))
        {
            b.a(parcel, 7, nz1.anf, i, true);
        }
        if (set.contains(Integer.valueOf(8)))
        {
            b.a(parcel, 8, nz1.ang, true);
        }
        if (set.contains(Integer.valueOf(9)))
        {
            b.a(parcel, 9, nz1.NH, true);
        }
        if (set.contains(Integer.valueOf(12)))
        {
            b.c(parcel, 12, nz1.om);
        }
        if (set.contains(Integer.valueOf(14)))
        {
            b.a(parcel, 14, nz1.BL, true);
        }
        if (set.contains(Integer.valueOf(15)))
        {
            b.a(parcel, 15, nz1.anh, i, true);
        }
        if (set.contains(Integer.valueOf(16)))
        {
            b.a(parcel, 16, nz1.ani);
        }
        if (set.contains(Integer.valueOf(19)))
        {
            b.a(parcel, 19, nz1.anj, i, true);
        }
        if (set.contains(Integer.valueOf(18)))
        {
            b.a(parcel, 18, nz1.Fc, true);
        }
        if (set.contains(Integer.valueOf(21)))
        {
            b.c(parcel, 21, nz1.anl);
        }
        if (set.contains(Integer.valueOf(20)))
        {
            b.a(parcel, 20, nz1.ank, true);
        }
        if (set.contains(Integer.valueOf(23)))
        {
            b.c(parcel, 23, nz1.ann, true);
        }
        if (set.contains(Integer.valueOf(22)))
        {
            b.c(parcel, 22, nz1.anm, true);
        }
        if (set.contains(Integer.valueOf(25)))
        {
            b.c(parcel, 25, nz1.anp);
        }
        if (set.contains(Integer.valueOf(24)))
        {
            b.c(parcel, 24, nz1.ano);
        }
        if (set.contains(Integer.valueOf(27)))
        {
            b.a(parcel, 27, nz1.uR, true);
        }
        if (set.contains(Integer.valueOf(26)))
        {
            b.a(parcel, 26, nz1.anq, true);
        }
        if (set.contains(Integer.valueOf(29)))
        {
            b.a(parcel, 29, nz1.ans);
        }
        if (set.contains(Integer.valueOf(28)))
        {
            b.c(parcel, 28, nz1.anr, true);
        }
        b.H(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return dd(parcel);
    }

    public nz dd(Parcel parcel)
    {
        int k1 = com.google.android.gms.common.internal.safeparcel.a.C(parcel);
        HashSet hashset = new HashSet();
        int j1 = 0;
        String s9 = null;
        nz.a a1 = null;
        String s8 = null;
        String s7 = null;
        int i1 = 0;
        nz.b b1 = null;
        String s6 = null;
        String s5 = null;
        int l = 0;
        String s4 = null;
        nz.c c = null;
        boolean flag1 = false;
        String s3 = null;
        nz.d d = null;
        String s2 = null;
        int k = 0;
        java.util.ArrayList arraylist2 = null;
        java.util.ArrayList arraylist1 = null;
        int j = 0;
        int i = 0;
        String s1 = null;
        String s = null;
        java.util.ArrayList arraylist = null;
        boolean flag = false;
        do
        {
            if (parcel.dataPosition() < k1)
            {
                int l1 = com.google.android.gms.common.internal.safeparcel.a.B(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.aD(l1))
                {
                case 10: // '\n'
                case 11: // '\013'
                case 13: // '\r'
                case 17: // '\021'
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, l1);
                    break;

                case 1: // '\001'
                    j1 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l1);
                    hashset.add(Integer.valueOf(1));
                    break;

                case 2: // '\002'
                    s9 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, l1);
                    hashset.add(Integer.valueOf(2));
                    break;

                case 3: // '\003'
                    a1 = (nz.a)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l1, nz.a.CREATOR);
                    hashset.add(Integer.valueOf(3));
                    break;

                case 4: // '\004'
                    s8 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, l1);
                    hashset.add(Integer.valueOf(4));
                    break;

                case 5: // '\005'
                    s7 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, l1);
                    hashset.add(Integer.valueOf(5));
                    break;

                case 6: // '\006'
                    i1 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l1);
                    hashset.add(Integer.valueOf(6));
                    break;

                case 7: // '\007'
                    b1 = (nz.b)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l1, nz.b.CREATOR);
                    hashset.add(Integer.valueOf(7));
                    break;

                case 8: // '\b'
                    s6 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, l1);
                    hashset.add(Integer.valueOf(8));
                    break;

                case 9: // '\t'
                    s5 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, l1);
                    hashset.add(Integer.valueOf(9));
                    break;

                case 12: // '\f'
                    l = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l1);
                    hashset.add(Integer.valueOf(12));
                    break;

                case 14: // '\016'
                    s4 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, l1);
                    hashset.add(Integer.valueOf(14));
                    break;

                case 15: // '\017'
                    c = (nz.c)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l1, nz.c.CREATOR);
                    hashset.add(Integer.valueOf(15));
                    break;

                case 16: // '\020'
                    flag1 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l1);
                    hashset.add(Integer.valueOf(16));
                    break;

                case 19: // '\023'
                    d = (nz.d)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l1, nz.d.CREATOR);
                    hashset.add(Integer.valueOf(19));
                    break;

                case 18: // '\022'
                    s3 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, l1);
                    hashset.add(Integer.valueOf(18));
                    break;

                case 21: // '\025'
                    k = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l1);
                    hashset.add(Integer.valueOf(21));
                    break;

                case 20: // '\024'
                    s2 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, l1);
                    hashset.add(Integer.valueOf(20));
                    break;

                case 23: // '\027'
                    arraylist1 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l1, nz.g.CREATOR);
                    hashset.add(Integer.valueOf(23));
                    break;

                case 22: // '\026'
                    arraylist2 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l1, nz.f.CREATOR);
                    hashset.add(Integer.valueOf(22));
                    break;

                case 25: // '\031'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l1);
                    hashset.add(Integer.valueOf(25));
                    break;

                case 24: // '\030'
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l1);
                    hashset.add(Integer.valueOf(24));
                    break;

                case 27: // '\033'
                    s = com.google.android.gms.common.internal.safeparcel.a.o(parcel, l1);
                    hashset.add(Integer.valueOf(27));
                    break;

                case 26: // '\032'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, l1);
                    hashset.add(Integer.valueOf(26));
                    break;

                case 29: // '\035'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l1);
                    hashset.add(Integer.valueOf(29));
                    break;

                case 28: // '\034'
                    arraylist = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l1, nz.h.CREATOR);
                    hashset.add(Integer.valueOf(28));
                    break;
                }
            } else
            if (parcel.dataPosition() != k1)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(k1).toString(), parcel);
            } else
            {
                return new nz(hashset, j1, s9, a1, s8, s7, i1, b1, s6, s5, l, s4, c, flag1, s3, d, s2, k, arraylist2, arraylist1, j, i, s1, s, arraylist, flag);
            }
        } while (true);
    }

    public nz[] eV(int i)
    {
        return new nz[i];
    }

    public Object[] newArray(int i)
    {
        return eV(i);
    }
}
