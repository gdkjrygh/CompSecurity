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
//            pi

public class pj
    implements android.os.Parcelable.Creator
{

    public pj()
    {
    }

    static void a(pi pi1, Parcel parcel, int i)
    {
        int j = b.H(parcel);
        Set set = pi1.aon;
        if (set.contains(Integer.valueOf(1)))
        {
            b.c(parcel, 1, pi1.CK);
        }
        if (set.contains(Integer.valueOf(2)))
        {
            b.a(parcel, 2, pi1.apl, true);
        }
        if (set.contains(Integer.valueOf(3)))
        {
            b.a(parcel, 3, pi1.apm, i, true);
        }
        if (set.contains(Integer.valueOf(4)))
        {
            b.a(parcel, 4, pi1.apn, true);
        }
        if (set.contains(Integer.valueOf(5)))
        {
            b.a(parcel, 5, pi1.apo, true);
        }
        if (set.contains(Integer.valueOf(6)))
        {
            b.c(parcel, 6, pi1.app);
        }
        if (set.contains(Integer.valueOf(7)))
        {
            b.a(parcel, 7, pi1.apq, i, true);
        }
        if (set.contains(Integer.valueOf(8)))
        {
            b.a(parcel, 8, pi1.apr, true);
        }
        if (set.contains(Integer.valueOf(9)))
        {
            b.a(parcel, 9, pi1.OS, true);
        }
        if (set.contains(Integer.valueOf(12)))
        {
            b.c(parcel, 12, pi1.ow);
        }
        if (set.contains(Integer.valueOf(14)))
        {
            b.a(parcel, 14, pi1.CE, true);
        }
        if (set.contains(Integer.valueOf(15)))
        {
            b.a(parcel, 15, pi1.aps, i, true);
        }
        if (set.contains(Integer.valueOf(16)))
        {
            b.a(parcel, 16, pi1.apt);
        }
        if (set.contains(Integer.valueOf(19)))
        {
            b.a(parcel, 19, pi1.apu, i, true);
        }
        if (set.contains(Integer.valueOf(18)))
        {
            b.a(parcel, 18, pi1.FR, true);
        }
        if (set.contains(Integer.valueOf(21)))
        {
            b.c(parcel, 21, pi1.apw);
        }
        if (set.contains(Integer.valueOf(20)))
        {
            b.a(parcel, 20, pi1.apv, true);
        }
        if (set.contains(Integer.valueOf(23)))
        {
            b.c(parcel, 23, pi1.apy, true);
        }
        if (set.contains(Integer.valueOf(22)))
        {
            b.c(parcel, 22, pi1.apx, true);
        }
        if (set.contains(Integer.valueOf(25)))
        {
            b.c(parcel, 25, pi1.apA);
        }
        if (set.contains(Integer.valueOf(24)))
        {
            b.c(parcel, 24, pi1.apz);
        }
        if (set.contains(Integer.valueOf(27)))
        {
            b.a(parcel, 27, pi1.vf, true);
        }
        if (set.contains(Integer.valueOf(26)))
        {
            b.a(parcel, 26, pi1.apB, true);
        }
        if (set.contains(Integer.valueOf(29)))
        {
            b.a(parcel, 29, pi1.apD);
        }
        if (set.contains(Integer.valueOf(28)))
        {
            b.c(parcel, 28, pi1.apC, true);
        }
        b.H(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return dz(parcel);
    }

    public pi dz(Parcel parcel)
    {
        int k1 = com.google.android.gms.common.internal.safeparcel.a.G(parcel);
        HashSet hashset = new HashSet();
        int j1 = 0;
        String s9 = null;
        pi.a a1 = null;
        String s8 = null;
        String s7 = null;
        int i1 = 0;
        pi.b b1 = null;
        String s6 = null;
        String s5 = null;
        int l = 0;
        String s4 = null;
        pi.c c = null;
        boolean flag1 = false;
        String s3 = null;
        pi.d d = null;
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
                int l1 = com.google.android.gms.common.internal.safeparcel.a.F(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.aH(l1))
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
                    a1 = (pi.a)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l1, pi.a.CREATOR);
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
                    b1 = (pi.b)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l1, pi.b.CREATOR);
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
                    c = (pi.c)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l1, pi.c.CREATOR);
                    hashset.add(Integer.valueOf(15));
                    break;

                case 16: // '\020'
                    flag1 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l1);
                    hashset.add(Integer.valueOf(16));
                    break;

                case 19: // '\023'
                    d = (pi.d)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l1, pi.d.CREATOR);
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
                    arraylist1 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l1, pi.g.CREATOR);
                    hashset.add(Integer.valueOf(23));
                    break;

                case 22: // '\026'
                    arraylist2 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l1, pi.f.CREATOR);
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
                    arraylist = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l1, pi.h.CREATOR);
                    hashset.add(Integer.valueOf(28));
                    break;
                }
            } else
            if (parcel.dataPosition() != k1)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(k1).toString(), parcel);
            } else
            {
                return new pi(hashset, j1, s9, a1, s8, s7, i1, b1, s6, s5, l, s4, c, flag1, s3, d, s2, k, arraylist2, arraylist1, j, i, s1, s, arraylist, flag);
            }
        } while (true);
    }

    public pi[] fx(int i)
    {
        return new pi[i];
    }

    public Object[] newArray(int i)
    {
        return fx(i);
    }
}
