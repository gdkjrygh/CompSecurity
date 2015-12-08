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
//            pd

public class pe
    implements android.os.Parcelable.Creator
{

    public pe()
    {
    }

    static void a(pd pd1, Parcel parcel, int i)
    {
        int j = b.H(parcel);
        Set set = pd1.aon;
        if (set.contains(Integer.valueOf(1)))
        {
            b.c(parcel, 1, pd1.CK);
        }
        if (set.contains(Integer.valueOf(2)))
        {
            b.a(parcel, 2, pd1.aoo, i, true);
        }
        if (set.contains(Integer.valueOf(3)))
        {
            b.b(parcel, 3, pd1.aop, true);
        }
        if (set.contains(Integer.valueOf(4)))
        {
            b.a(parcel, 4, pd1.aoq, i, true);
        }
        if (set.contains(Integer.valueOf(5)))
        {
            b.a(parcel, 5, pd1.aor, true);
        }
        if (set.contains(Integer.valueOf(6)))
        {
            b.a(parcel, 6, pd1.aos, true);
        }
        if (set.contains(Integer.valueOf(7)))
        {
            b.a(parcel, 7, pd1.aot, true);
        }
        if (set.contains(Integer.valueOf(8)))
        {
            b.c(parcel, 8, pd1.aou, true);
        }
        if (set.contains(Integer.valueOf(9)))
        {
            b.c(parcel, 9, pd1.aov);
        }
        if (set.contains(Integer.valueOf(10)))
        {
            b.c(parcel, 10, pd1.aow, true);
        }
        if (set.contains(Integer.valueOf(11)))
        {
            b.a(parcel, 11, pd1.aox, i, true);
        }
        if (set.contains(Integer.valueOf(12)))
        {
            b.c(parcel, 12, pd1.aoy, true);
        }
        if (set.contains(Integer.valueOf(13)))
        {
            b.a(parcel, 13, pd1.aoz, true);
        }
        if (set.contains(Integer.valueOf(14)))
        {
            b.a(parcel, 14, pd1.aoA, true);
        }
        if (set.contains(Integer.valueOf(15)))
        {
            b.a(parcel, 15, pd1.aoB, i, true);
        }
        if (set.contains(Integer.valueOf(17)))
        {
            b.a(parcel, 17, pd1.aoD, true);
        }
        if (set.contains(Integer.valueOf(16)))
        {
            b.a(parcel, 16, pd1.aoC, true);
        }
        if (set.contains(Integer.valueOf(19)))
        {
            b.c(parcel, 19, pd1.aoE, true);
        }
        if (set.contains(Integer.valueOf(18)))
        {
            b.a(parcel, 18, pd1.ov, true);
        }
        if (set.contains(Integer.valueOf(21)))
        {
            b.a(parcel, 21, pd1.aoG, true);
        }
        if (set.contains(Integer.valueOf(20)))
        {
            b.a(parcel, 20, pd1.aoF, true);
        }
        if (set.contains(Integer.valueOf(23)))
        {
            b.a(parcel, 23, pd1.UO, true);
        }
        if (set.contains(Integer.valueOf(22)))
        {
            b.a(parcel, 22, pd1.aoH, true);
        }
        if (set.contains(Integer.valueOf(25)))
        {
            b.a(parcel, 25, pd1.aoJ, true);
        }
        if (set.contains(Integer.valueOf(24)))
        {
            b.a(parcel, 24, pd1.aoI, true);
        }
        if (set.contains(Integer.valueOf(27)))
        {
            b.a(parcel, 27, pd1.aoL, true);
        }
        if (set.contains(Integer.valueOf(26)))
        {
            b.a(parcel, 26, pd1.aoK, true);
        }
        if (set.contains(Integer.valueOf(29)))
        {
            b.a(parcel, 29, pd1.aoN, i, true);
        }
        if (set.contains(Integer.valueOf(28)))
        {
            b.a(parcel, 28, pd1.aoM, true);
        }
        if (set.contains(Integer.valueOf(31)))
        {
            b.a(parcel, 31, pd1.aoP, true);
        }
        if (set.contains(Integer.valueOf(30)))
        {
            b.a(parcel, 30, pd1.aoO, true);
        }
        if (set.contains(Integer.valueOf(34)))
        {
            b.a(parcel, 34, pd1.aoR, i, true);
        }
        if (set.contains(Integer.valueOf(32)))
        {
            b.a(parcel, 32, pd1.CE, true);
        }
        if (set.contains(Integer.valueOf(33)))
        {
            b.a(parcel, 33, pd1.aoQ, true);
        }
        if (set.contains(Integer.valueOf(38)))
        {
            b.a(parcel, 38, pd1.agh);
        }
        if (set.contains(Integer.valueOf(39)))
        {
            b.a(parcel, 39, pd1.mName, true);
        }
        if (set.contains(Integer.valueOf(36)))
        {
            b.a(parcel, 36, pd1.agg);
        }
        if (set.contains(Integer.valueOf(37)))
        {
            b.a(parcel, 37, pd1.aoS, i, true);
        }
        if (set.contains(Integer.valueOf(42)))
        {
            b.a(parcel, 42, pd1.aoV, true);
        }
        if (set.contains(Integer.valueOf(43)))
        {
            b.a(parcel, 43, pd1.aoW, true);
        }
        if (set.contains(Integer.valueOf(40)))
        {
            b.a(parcel, 40, pd1.aoT, i, true);
        }
        if (set.contains(Integer.valueOf(41)))
        {
            b.c(parcel, 41, pd1.aoU, true);
        }
        if (set.contains(Integer.valueOf(46)))
        {
            b.a(parcel, 46, pd1.aoZ, i, true);
        }
        if (set.contains(Integer.valueOf(47)))
        {
            b.a(parcel, 47, pd1.apa, true);
        }
        if (set.contains(Integer.valueOf(44)))
        {
            b.a(parcel, 44, pd1.aoX, true);
        }
        if (set.contains(Integer.valueOf(45)))
        {
            b.a(parcel, 45, pd1.aoY, true);
        }
        if (set.contains(Integer.valueOf(51)))
        {
            b.a(parcel, 51, pd1.ape, true);
        }
        if (set.contains(Integer.valueOf(50)))
        {
            b.a(parcel, 50, pd1.apd, i, true);
        }
        if (set.contains(Integer.valueOf(49)))
        {
            b.a(parcel, 49, pd1.apc, true);
        }
        if (set.contains(Integer.valueOf(48)))
        {
            b.a(parcel, 48, pd1.apb, true);
        }
        if (set.contains(Integer.valueOf(55)))
        {
            b.a(parcel, 55, pd1.apg, true);
        }
        if (set.contains(Integer.valueOf(54)))
        {
            b.a(parcel, 54, pd1.vf, true);
        }
        if (set.contains(Integer.valueOf(53)))
        {
            b.a(parcel, 53, pd1.vc, true);
        }
        if (set.contains(Integer.valueOf(52)))
        {
            b.a(parcel, 52, pd1.apf, true);
        }
        if (set.contains(Integer.valueOf(56)))
        {
            b.a(parcel, 56, pd1.aph, true);
        }
        b.H(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return dx(parcel);
    }

    public pd dx(Parcel parcel)
    {
        int k = com.google.android.gms.common.internal.safeparcel.a.G(parcel);
        HashSet hashset = new HashSet();
        int j = 0;
        pd pd10 = null;
        java.util.ArrayList arraylist5 = null;
        pd pd9 = null;
        String s34 = null;
        String s33 = null;
        String s32 = null;
        java.util.ArrayList arraylist4 = null;
        int i = 0;
        java.util.ArrayList arraylist3 = null;
        pd pd8 = null;
        java.util.ArrayList arraylist2 = null;
        String s31 = null;
        String s30 = null;
        pd pd7 = null;
        String s29 = null;
        String s28 = null;
        String s27 = null;
        java.util.ArrayList arraylist1 = null;
        String s26 = null;
        String s25 = null;
        String s24 = null;
        String s23 = null;
        String s22 = null;
        String s21 = null;
        String s20 = null;
        String s19 = null;
        String s18 = null;
        pd pd6 = null;
        String s17 = null;
        String s16 = null;
        String s15 = null;
        String s14 = null;
        pd pd5 = null;
        double d1 = 0.0D;
        pd pd4 = null;
        double d = 0.0D;
        String s13 = null;
        pd pd3 = null;
        java.util.ArrayList arraylist = null;
        String s12 = null;
        String s11 = null;
        String s10 = null;
        String s9 = null;
        pd pd2 = null;
        String s8 = null;
        String s7 = null;
        String s6 = null;
        pd pd1 = null;
        String s5 = null;
        String s4 = null;
        String s3 = null;
        String s2 = null;
        String s1 = null;
        String s = null;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = com.google.android.gms.common.internal.safeparcel.a.F(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.aH(l))
                {
                case 35: // '#'
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, l);
                    break;

                case 1: // '\001'
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    hashset.add(Integer.valueOf(1));
                    break;

                case 2: // '\002'
                    pd10 = (pd)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, pd.CREATOR);
                    hashset.add(Integer.valueOf(2));
                    break;

                case 3: // '\003'
                    arraylist5 = com.google.android.gms.common.internal.safeparcel.a.C(parcel, l);
                    hashset.add(Integer.valueOf(3));
                    break;

                case 4: // '\004'
                    pd9 = (pd)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, pd.CREATOR);
                    hashset.add(Integer.valueOf(4));
                    break;

                case 5: // '\005'
                    s34 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, l);
                    hashset.add(Integer.valueOf(5));
                    break;

                case 6: // '\006'
                    s33 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, l);
                    hashset.add(Integer.valueOf(6));
                    break;

                case 7: // '\007'
                    s32 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, l);
                    hashset.add(Integer.valueOf(7));
                    break;

                case 8: // '\b'
                    arraylist4 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l, pd.CREATOR);
                    hashset.add(Integer.valueOf(8));
                    break;

                case 9: // '\t'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    hashset.add(Integer.valueOf(9));
                    break;

                case 10: // '\n'
                    arraylist3 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l, pd.CREATOR);
                    hashset.add(Integer.valueOf(10));
                    break;

                case 11: // '\013'
                    pd8 = (pd)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, pd.CREATOR);
                    hashset.add(Integer.valueOf(11));
                    break;

                case 12: // '\f'
                    arraylist2 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l, pd.CREATOR);
                    hashset.add(Integer.valueOf(12));
                    break;

                case 13: // '\r'
                    s31 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, l);
                    hashset.add(Integer.valueOf(13));
                    break;

                case 14: // '\016'
                    s30 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, l);
                    hashset.add(Integer.valueOf(14));
                    break;

                case 15: // '\017'
                    pd7 = (pd)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, pd.CREATOR);
                    hashset.add(Integer.valueOf(15));
                    break;

                case 17: // '\021'
                    s28 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, l);
                    hashset.add(Integer.valueOf(17));
                    break;

                case 16: // '\020'
                    s29 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, l);
                    hashset.add(Integer.valueOf(16));
                    break;

                case 19: // '\023'
                    arraylist1 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l, pd.CREATOR);
                    hashset.add(Integer.valueOf(19));
                    break;

                case 18: // '\022'
                    s27 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, l);
                    hashset.add(Integer.valueOf(18));
                    break;

                case 21: // '\025'
                    s25 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, l);
                    hashset.add(Integer.valueOf(21));
                    break;

                case 20: // '\024'
                    s26 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, l);
                    hashset.add(Integer.valueOf(20));
                    break;

                case 23: // '\027'
                    s23 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, l);
                    hashset.add(Integer.valueOf(23));
                    break;

                case 22: // '\026'
                    s24 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, l);
                    hashset.add(Integer.valueOf(22));
                    break;

                case 25: // '\031'
                    s21 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, l);
                    hashset.add(Integer.valueOf(25));
                    break;

                case 24: // '\030'
                    s22 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, l);
                    hashset.add(Integer.valueOf(24));
                    break;

                case 27: // '\033'
                    s19 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, l);
                    hashset.add(Integer.valueOf(27));
                    break;

                case 26: // '\032'
                    s20 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, l);
                    hashset.add(Integer.valueOf(26));
                    break;

                case 29: // '\035'
                    pd6 = (pd)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, pd.CREATOR);
                    hashset.add(Integer.valueOf(29));
                    break;

                case 28: // '\034'
                    s18 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, l);
                    hashset.add(Integer.valueOf(28));
                    break;

                case 31: // '\037'
                    s16 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, l);
                    hashset.add(Integer.valueOf(31));
                    break;

                case 30: // '\036'
                    s17 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, l);
                    hashset.add(Integer.valueOf(30));
                    break;

                case 34: // '"'
                    pd5 = (pd)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, pd.CREATOR);
                    hashset.add(Integer.valueOf(34));
                    break;

                case 32: // ' '
                    s15 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, l);
                    hashset.add(Integer.valueOf(32));
                    break;

                case 33: // '!'
                    s14 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, l);
                    hashset.add(Integer.valueOf(33));
                    break;

                case 38: // '&'
                    d = com.google.android.gms.common.internal.safeparcel.a.m(parcel, l);
                    hashset.add(Integer.valueOf(38));
                    break;

                case 39: // '\''
                    s13 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, l);
                    hashset.add(Integer.valueOf(39));
                    break;

                case 36: // '$'
                    d1 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, l);
                    hashset.add(Integer.valueOf(36));
                    break;

                case 37: // '%'
                    pd4 = (pd)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, pd.CREATOR);
                    hashset.add(Integer.valueOf(37));
                    break;

                case 42: // '*'
                    s12 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, l);
                    hashset.add(Integer.valueOf(42));
                    break;

                case 43: // '+'
                    s11 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, l);
                    hashset.add(Integer.valueOf(43));
                    break;

                case 40: // '('
                    pd3 = (pd)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, pd.CREATOR);
                    hashset.add(Integer.valueOf(40));
                    break;

                case 41: // ')'
                    arraylist = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l, pd.CREATOR);
                    hashset.add(Integer.valueOf(41));
                    break;

                case 46: // '.'
                    pd2 = (pd)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, pd.CREATOR);
                    hashset.add(Integer.valueOf(46));
                    break;

                case 47: // '/'
                    s8 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, l);
                    hashset.add(Integer.valueOf(47));
                    break;

                case 44: // ','
                    s10 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, l);
                    hashset.add(Integer.valueOf(44));
                    break;

                case 45: // '-'
                    s9 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, l);
                    hashset.add(Integer.valueOf(45));
                    break;

                case 51: // '3'
                    s5 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, l);
                    hashset.add(Integer.valueOf(51));
                    break;

                case 50: // '2'
                    pd1 = (pd)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, pd.CREATOR);
                    hashset.add(Integer.valueOf(50));
                    break;

                case 49: // '1'
                    s6 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, l);
                    hashset.add(Integer.valueOf(49));
                    break;

                case 48: // '0'
                    s7 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, l);
                    hashset.add(Integer.valueOf(48));
                    break;

                case 55: // '7'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, l);
                    hashset.add(Integer.valueOf(55));
                    break;

                case 54: // '6'
                    s2 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, l);
                    hashset.add(Integer.valueOf(54));
                    break;

                case 53: // '5'
                    s3 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, l);
                    hashset.add(Integer.valueOf(53));
                    break;

                case 52: // '4'
                    s4 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, l);
                    hashset.add(Integer.valueOf(52));
                    break;

                case 56: // '8'
                    s = com.google.android.gms.common.internal.safeparcel.a.o(parcel, l);
                    hashset.add(Integer.valueOf(56));
                    break;
                }
            } else
            {
                if (parcel.dataPosition() != k)
                {
                    throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
                }
                return new pd(hashset, j, pd10, arraylist5, pd9, s34, s33, s32, arraylist4, i, arraylist3, pd8, arraylist2, s31, s30, pd7, s29, s28, s27, arraylist1, s26, s25, s24, s23, s22, s21, s20, s19, s18, pd6, s17, s16, s15, s14, pd5, d1, pd4, d, s13, pd3, arraylist, s12, s11, s10, s9, pd2, s8, s7, s6, pd1, s5, s4, s3, s2, s1, s);
            }
        } while (true);
    }

    public pd[] fv(int i)
    {
        return new pd[i];
    }

    public Object[] newArray(int i)
    {
        return fv(i);
    }
}
