// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.internal.model.moments;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.google.android.gms.plus.internal.model.moments:
//            ItemScopeEntity

public final class a
    implements android.os.Parcelable.Creator
{

    public a()
    {
    }

    static void a(ItemScopeEntity itemscopeentity, Parcel parcel, int i)
    {
        int j = c.a(parcel);
        Set set = itemscopeentity.a;
        if (set.contains(Integer.valueOf(1)))
        {
            c.a(parcel, 1, itemscopeentity.b);
        }
        if (set.contains(Integer.valueOf(2)))
        {
            c.a(parcel, 2, itemscopeentity.c, i, true);
        }
        if (set.contains(Integer.valueOf(3)))
        {
            c.a(parcel, 3, itemscopeentity.d, true);
        }
        if (set.contains(Integer.valueOf(4)))
        {
            c.a(parcel, 4, itemscopeentity.e, i, true);
        }
        if (set.contains(Integer.valueOf(5)))
        {
            c.a(parcel, 5, itemscopeentity.f, true);
        }
        if (set.contains(Integer.valueOf(6)))
        {
            c.a(parcel, 6, itemscopeentity.g, true);
        }
        if (set.contains(Integer.valueOf(7)))
        {
            c.a(parcel, 7, itemscopeentity.h, true);
        }
        if (set.contains(Integer.valueOf(8)))
        {
            c.b(parcel, 8, itemscopeentity.i, true);
        }
        if (set.contains(Integer.valueOf(9)))
        {
            c.a(parcel, 9, itemscopeentity.j);
        }
        if (set.contains(Integer.valueOf(10)))
        {
            c.b(parcel, 10, itemscopeentity.k, true);
        }
        if (set.contains(Integer.valueOf(11)))
        {
            c.a(parcel, 11, itemscopeentity.l, i, true);
        }
        if (set.contains(Integer.valueOf(12)))
        {
            c.b(parcel, 12, itemscopeentity.m, true);
        }
        if (set.contains(Integer.valueOf(13)))
        {
            c.a(parcel, 13, itemscopeentity.n, true);
        }
        if (set.contains(Integer.valueOf(14)))
        {
            c.a(parcel, 14, itemscopeentity.o, true);
        }
        if (set.contains(Integer.valueOf(15)))
        {
            c.a(parcel, 15, itemscopeentity.p, i, true);
        }
        if (set.contains(Integer.valueOf(17)))
        {
            c.a(parcel, 17, itemscopeentity.r, true);
        }
        if (set.contains(Integer.valueOf(16)))
        {
            c.a(parcel, 16, itemscopeentity.q, true);
        }
        if (set.contains(Integer.valueOf(19)))
        {
            c.b(parcel, 19, itemscopeentity.t, true);
        }
        if (set.contains(Integer.valueOf(18)))
        {
            c.a(parcel, 18, itemscopeentity.s, true);
        }
        if (set.contains(Integer.valueOf(21)))
        {
            c.a(parcel, 21, itemscopeentity.v, true);
        }
        if (set.contains(Integer.valueOf(20)))
        {
            c.a(parcel, 20, itemscopeentity.u, true);
        }
        if (set.contains(Integer.valueOf(23)))
        {
            c.a(parcel, 23, itemscopeentity.x, true);
        }
        if (set.contains(Integer.valueOf(22)))
        {
            c.a(parcel, 22, itemscopeentity.w, true);
        }
        if (set.contains(Integer.valueOf(25)))
        {
            c.a(parcel, 25, itemscopeentity.z, true);
        }
        if (set.contains(Integer.valueOf(24)))
        {
            c.a(parcel, 24, itemscopeentity.y, true);
        }
        if (set.contains(Integer.valueOf(27)))
        {
            c.a(parcel, 27, itemscopeentity.B, true);
        }
        if (set.contains(Integer.valueOf(26)))
        {
            c.a(parcel, 26, itemscopeentity.A, true);
        }
        if (set.contains(Integer.valueOf(29)))
        {
            c.a(parcel, 29, itemscopeentity.D, i, true);
        }
        if (set.contains(Integer.valueOf(28)))
        {
            c.a(parcel, 28, itemscopeentity.C, true);
        }
        if (set.contains(Integer.valueOf(31)))
        {
            c.a(parcel, 31, itemscopeentity.F, true);
        }
        if (set.contains(Integer.valueOf(30)))
        {
            c.a(parcel, 30, itemscopeentity.E, true);
        }
        if (set.contains(Integer.valueOf(34)))
        {
            c.a(parcel, 34, itemscopeentity.I, i, true);
        }
        if (set.contains(Integer.valueOf(32)))
        {
            c.a(parcel, 32, itemscopeentity.G, true);
        }
        if (set.contains(Integer.valueOf(33)))
        {
            c.a(parcel, 33, itemscopeentity.H, true);
        }
        if (set.contains(Integer.valueOf(38)))
        {
            c.a(parcel, 38, itemscopeentity.L);
        }
        if (set.contains(Integer.valueOf(39)))
        {
            c.a(parcel, 39, itemscopeentity.M, true);
        }
        if (set.contains(Integer.valueOf(36)))
        {
            c.a(parcel, 36, itemscopeentity.J);
        }
        if (set.contains(Integer.valueOf(37)))
        {
            c.a(parcel, 37, itemscopeentity.K, i, true);
        }
        if (set.contains(Integer.valueOf(42)))
        {
            c.a(parcel, 42, itemscopeentity.P, true);
        }
        if (set.contains(Integer.valueOf(43)))
        {
            c.a(parcel, 43, itemscopeentity.Q, true);
        }
        if (set.contains(Integer.valueOf(40)))
        {
            c.a(parcel, 40, itemscopeentity.N, i, true);
        }
        if (set.contains(Integer.valueOf(41)))
        {
            c.b(parcel, 41, itemscopeentity.O, true);
        }
        if (set.contains(Integer.valueOf(46)))
        {
            c.a(parcel, 46, itemscopeentity.T, i, true);
        }
        if (set.contains(Integer.valueOf(47)))
        {
            c.a(parcel, 47, itemscopeentity.U, true);
        }
        if (set.contains(Integer.valueOf(44)))
        {
            c.a(parcel, 44, itemscopeentity.R, true);
        }
        if (set.contains(Integer.valueOf(45)))
        {
            c.a(parcel, 45, itemscopeentity.S, true);
        }
        if (set.contains(Integer.valueOf(51)))
        {
            c.a(parcel, 51, itemscopeentity.Y, true);
        }
        if (set.contains(Integer.valueOf(50)))
        {
            c.a(parcel, 50, itemscopeentity.X, i, true);
        }
        if (set.contains(Integer.valueOf(49)))
        {
            c.a(parcel, 49, itemscopeentity.W, true);
        }
        if (set.contains(Integer.valueOf(48)))
        {
            c.a(parcel, 48, itemscopeentity.V, true);
        }
        if (set.contains(Integer.valueOf(55)))
        {
            c.a(parcel, 55, itemscopeentity.ac, true);
        }
        if (set.contains(Integer.valueOf(54)))
        {
            c.a(parcel, 54, itemscopeentity.ab, true);
        }
        if (set.contains(Integer.valueOf(53)))
        {
            c.a(parcel, 53, itemscopeentity.aa, true);
        }
        if (set.contains(Integer.valueOf(52)))
        {
            c.a(parcel, 52, itemscopeentity.Z, true);
        }
        if (set.contains(Integer.valueOf(56)))
        {
            c.a(parcel, 56, itemscopeentity.ad, true);
        }
        c.a(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int k = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        HashSet hashset = new HashSet();
        int j = 0;
        ItemScopeEntity itemscopeentity9 = null;
        java.util.ArrayList arraylist5 = null;
        ItemScopeEntity itemscopeentity8 = null;
        String s34 = null;
        String s33 = null;
        String s32 = null;
        java.util.ArrayList arraylist4 = null;
        int i = 0;
        java.util.ArrayList arraylist3 = null;
        ItemScopeEntity itemscopeentity7 = null;
        java.util.ArrayList arraylist2 = null;
        String s31 = null;
        String s30 = null;
        ItemScopeEntity itemscopeentity6 = null;
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
        ItemScopeEntity itemscopeentity5 = null;
        String s17 = null;
        String s16 = null;
        String s15 = null;
        String s14 = null;
        ItemScopeEntity itemscopeentity4 = null;
        double d1 = 0.0D;
        ItemScopeEntity itemscopeentity3 = null;
        double d = 0.0D;
        String s13 = null;
        ItemScopeEntity itemscopeentity2 = null;
        java.util.ArrayList arraylist = null;
        String s12 = null;
        String s11 = null;
        String s10 = null;
        String s9 = null;
        ItemScopeEntity itemscopeentity1 = null;
        String s8 = null;
        String s7 = null;
        String s6 = null;
        ItemScopeEntity itemscopeentity = null;
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
                int l = parcel.readInt();
                switch (0xffff & l)
                {
                case 35: // '#'
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, l);
                    break;

                case 1: // '\001'
                    j = com.google.android.gms.common.internal.safeparcel.a.d(parcel, l);
                    hashset.add(Integer.valueOf(1));
                    break;

                case 2: // '\002'
                    itemscopeentity9 = (ItemScopeEntity)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, ItemScopeEntity.CREATOR);
                    hashset.add(Integer.valueOf(2));
                    break;

                case 3: // '\003'
                    arraylist5 = com.google.android.gms.common.internal.safeparcel.a.q(parcel, l);
                    hashset.add(Integer.valueOf(3));
                    break;

                case 4: // '\004'
                    itemscopeentity8 = (ItemScopeEntity)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, ItemScopeEntity.CREATOR);
                    hashset.add(Integer.valueOf(4));
                    break;

                case 5: // '\005'
                    s34 = com.google.android.gms.common.internal.safeparcel.a.j(parcel, l);
                    hashset.add(Integer.valueOf(5));
                    break;

                case 6: // '\006'
                    s33 = com.google.android.gms.common.internal.safeparcel.a.j(parcel, l);
                    hashset.add(Integer.valueOf(6));
                    break;

                case 7: // '\007'
                    s32 = com.google.android.gms.common.internal.safeparcel.a.j(parcel, l);
                    hashset.add(Integer.valueOf(7));
                    break;

                case 8: // '\b'
                    arraylist4 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l, ItemScopeEntity.CREATOR);
                    hashset.add(Integer.valueOf(8));
                    break;

                case 9: // '\t'
                    i = com.google.android.gms.common.internal.safeparcel.a.d(parcel, l);
                    hashset.add(Integer.valueOf(9));
                    break;

                case 10: // '\n'
                    arraylist3 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l, ItemScopeEntity.CREATOR);
                    hashset.add(Integer.valueOf(10));
                    break;

                case 11: // '\013'
                    itemscopeentity7 = (ItemScopeEntity)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, ItemScopeEntity.CREATOR);
                    hashset.add(Integer.valueOf(11));
                    break;

                case 12: // '\f'
                    arraylist2 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l, ItemScopeEntity.CREATOR);
                    hashset.add(Integer.valueOf(12));
                    break;

                case 13: // '\r'
                    s31 = com.google.android.gms.common.internal.safeparcel.a.j(parcel, l);
                    hashset.add(Integer.valueOf(13));
                    break;

                case 14: // '\016'
                    s30 = com.google.android.gms.common.internal.safeparcel.a.j(parcel, l);
                    hashset.add(Integer.valueOf(14));
                    break;

                case 15: // '\017'
                    itemscopeentity6 = (ItemScopeEntity)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, ItemScopeEntity.CREATOR);
                    hashset.add(Integer.valueOf(15));
                    break;

                case 17: // '\021'
                    s28 = com.google.android.gms.common.internal.safeparcel.a.j(parcel, l);
                    hashset.add(Integer.valueOf(17));
                    break;

                case 16: // '\020'
                    s29 = com.google.android.gms.common.internal.safeparcel.a.j(parcel, l);
                    hashset.add(Integer.valueOf(16));
                    break;

                case 19: // '\023'
                    arraylist1 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l, ItemScopeEntity.CREATOR);
                    hashset.add(Integer.valueOf(19));
                    break;

                case 18: // '\022'
                    s27 = com.google.android.gms.common.internal.safeparcel.a.j(parcel, l);
                    hashset.add(Integer.valueOf(18));
                    break;

                case 21: // '\025'
                    s25 = com.google.android.gms.common.internal.safeparcel.a.j(parcel, l);
                    hashset.add(Integer.valueOf(21));
                    break;

                case 20: // '\024'
                    s26 = com.google.android.gms.common.internal.safeparcel.a.j(parcel, l);
                    hashset.add(Integer.valueOf(20));
                    break;

                case 23: // '\027'
                    s23 = com.google.android.gms.common.internal.safeparcel.a.j(parcel, l);
                    hashset.add(Integer.valueOf(23));
                    break;

                case 22: // '\026'
                    s24 = com.google.android.gms.common.internal.safeparcel.a.j(parcel, l);
                    hashset.add(Integer.valueOf(22));
                    break;

                case 25: // '\031'
                    s21 = com.google.android.gms.common.internal.safeparcel.a.j(parcel, l);
                    hashset.add(Integer.valueOf(25));
                    break;

                case 24: // '\030'
                    s22 = com.google.android.gms.common.internal.safeparcel.a.j(parcel, l);
                    hashset.add(Integer.valueOf(24));
                    break;

                case 27: // '\033'
                    s19 = com.google.android.gms.common.internal.safeparcel.a.j(parcel, l);
                    hashset.add(Integer.valueOf(27));
                    break;

                case 26: // '\032'
                    s20 = com.google.android.gms.common.internal.safeparcel.a.j(parcel, l);
                    hashset.add(Integer.valueOf(26));
                    break;

                case 29: // '\035'
                    itemscopeentity5 = (ItemScopeEntity)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, ItemScopeEntity.CREATOR);
                    hashset.add(Integer.valueOf(29));
                    break;

                case 28: // '\034'
                    s18 = com.google.android.gms.common.internal.safeparcel.a.j(parcel, l);
                    hashset.add(Integer.valueOf(28));
                    break;

                case 31: // '\037'
                    s16 = com.google.android.gms.common.internal.safeparcel.a.j(parcel, l);
                    hashset.add(Integer.valueOf(31));
                    break;

                case 30: // '\036'
                    s17 = com.google.android.gms.common.internal.safeparcel.a.j(parcel, l);
                    hashset.add(Integer.valueOf(30));
                    break;

                case 34: // '"'
                    itemscopeentity4 = (ItemScopeEntity)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, ItemScopeEntity.CREATOR);
                    hashset.add(Integer.valueOf(34));
                    break;

                case 32: // ' '
                    s15 = com.google.android.gms.common.internal.safeparcel.a.j(parcel, l);
                    hashset.add(Integer.valueOf(32));
                    break;

                case 33: // '!'
                    s14 = com.google.android.gms.common.internal.safeparcel.a.j(parcel, l);
                    hashset.add(Integer.valueOf(33));
                    break;

                case 38: // '&'
                    d = com.google.android.gms.common.internal.safeparcel.a.h(parcel, l);
                    hashset.add(Integer.valueOf(38));
                    break;

                case 39: // '\''
                    s13 = com.google.android.gms.common.internal.safeparcel.a.j(parcel, l);
                    hashset.add(Integer.valueOf(39));
                    break;

                case 36: // '$'
                    d1 = com.google.android.gms.common.internal.safeparcel.a.h(parcel, l);
                    hashset.add(Integer.valueOf(36));
                    break;

                case 37: // '%'
                    itemscopeentity3 = (ItemScopeEntity)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, ItemScopeEntity.CREATOR);
                    hashset.add(Integer.valueOf(37));
                    break;

                case 42: // '*'
                    s12 = com.google.android.gms.common.internal.safeparcel.a.j(parcel, l);
                    hashset.add(Integer.valueOf(42));
                    break;

                case 43: // '+'
                    s11 = com.google.android.gms.common.internal.safeparcel.a.j(parcel, l);
                    hashset.add(Integer.valueOf(43));
                    break;

                case 40: // '('
                    itemscopeentity2 = (ItemScopeEntity)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, ItemScopeEntity.CREATOR);
                    hashset.add(Integer.valueOf(40));
                    break;

                case 41: // ')'
                    arraylist = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l, ItemScopeEntity.CREATOR);
                    hashset.add(Integer.valueOf(41));
                    break;

                case 46: // '.'
                    itemscopeentity1 = (ItemScopeEntity)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, ItemScopeEntity.CREATOR);
                    hashset.add(Integer.valueOf(46));
                    break;

                case 47: // '/'
                    s8 = com.google.android.gms.common.internal.safeparcel.a.j(parcel, l);
                    hashset.add(Integer.valueOf(47));
                    break;

                case 44: // ','
                    s10 = com.google.android.gms.common.internal.safeparcel.a.j(parcel, l);
                    hashset.add(Integer.valueOf(44));
                    break;

                case 45: // '-'
                    s9 = com.google.android.gms.common.internal.safeparcel.a.j(parcel, l);
                    hashset.add(Integer.valueOf(45));
                    break;

                case 51: // '3'
                    s5 = com.google.android.gms.common.internal.safeparcel.a.j(parcel, l);
                    hashset.add(Integer.valueOf(51));
                    break;

                case 50: // '2'
                    itemscopeentity = (ItemScopeEntity)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, ItemScopeEntity.CREATOR);
                    hashset.add(Integer.valueOf(50));
                    break;

                case 49: // '1'
                    s6 = com.google.android.gms.common.internal.safeparcel.a.j(parcel, l);
                    hashset.add(Integer.valueOf(49));
                    break;

                case 48: // '0'
                    s7 = com.google.android.gms.common.internal.safeparcel.a.j(parcel, l);
                    hashset.add(Integer.valueOf(48));
                    break;

                case 55: // '7'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.j(parcel, l);
                    hashset.add(Integer.valueOf(55));
                    break;

                case 54: // '6'
                    s2 = com.google.android.gms.common.internal.safeparcel.a.j(parcel, l);
                    hashset.add(Integer.valueOf(54));
                    break;

                case 53: // '5'
                    s3 = com.google.android.gms.common.internal.safeparcel.a.j(parcel, l);
                    hashset.add(Integer.valueOf(53));
                    break;

                case 52: // '4'
                    s4 = com.google.android.gms.common.internal.safeparcel.a.j(parcel, l);
                    hashset.add(Integer.valueOf(52));
                    break;

                case 56: // '8'
                    s = com.google.android.gms.common.internal.safeparcel.a.j(parcel, l);
                    hashset.add(Integer.valueOf(56));
                    break;
                }
            } else
            {
                if (parcel.dataPosition() != k)
                {
                    throw new b((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
                }
                return new ItemScopeEntity(hashset, j, itemscopeentity9, arraylist5, itemscopeentity8, s34, s33, s32, arraylist4, i, arraylist3, itemscopeentity7, arraylist2, s31, s30, itemscopeentity6, s29, s28, s27, arraylist1, s26, s25, s24, s23, s22, s21, s20, s19, s18, itemscopeentity5, s17, s16, s15, s14, itemscopeentity4, d1, itemscopeentity3, d, s13, itemscopeentity2, arraylist, s12, s11, s10, s9, itemscopeentity1, s8, s7, s6, itemscopeentity, s5, s4, s3, s2, s1, s);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new ItemScopeEntity[i];
    }
}
