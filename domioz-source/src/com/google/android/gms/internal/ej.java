// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.internal:
//            zzgq

public final class ej
    implements android.os.Parcelable.Creator
{

    public ej()
    {
    }

    static void a(zzgq zzgq1, Parcel parcel)
    {
        int i = c.a(parcel);
        c.a(parcel, 1, zzgq1.a);
        c.a(parcel, 2, zzgq1.b);
        c.a(parcel, 3, zzgq1.c);
        c.b(parcel, 4, zzgq1.d);
        c.a(parcel, 5, zzgq1.e);
        c.b(parcel, 6, zzgq1.f);
        c.a(parcel, 7, zzgq1.g);
        c.a(parcel, 8, zzgq1.h);
        c.a(parcel, 9, zzgq1.i);
        c.b(parcel, 10, zzgq1.j);
        c.a(parcel, 11, zzgq1.k);
        c.a(parcel, 12, zzgq1.l);
        c.a(parcel, 13, zzgq1.m);
        c.a(parcel, 14, zzgq1.n);
        c.a(parcel, 15, zzgq1.o);
        c.a(parcel, 19, zzgq1.q);
        c.a(parcel, 18, zzgq1.p);
        c.a(parcel, 21, zzgq1.r);
        c.a(parcel, 23, zzgq1.t);
        c.a(parcel, 22, zzgq1.s);
        c.a(parcel, 25, zzgq1.v);
        c.a(parcel, 24, zzgq1.u);
        c.a(parcel, 26, zzgq1.w);
        c.a(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int l = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        int k = 0;
        String s5 = null;
        String s4 = null;
        java.util.ArrayList arraylist2 = null;
        int j = 0;
        java.util.ArrayList arraylist1 = null;
        long l4 = 0L;
        boolean flag6 = false;
        long l3 = 0L;
        java.util.ArrayList arraylist = null;
        long l2 = 0L;
        int i = 0;
        String s3 = null;
        long l1 = 0L;
        String s2 = null;
        boolean flag5 = false;
        String s1 = null;
        String s = null;
        boolean flag4 = false;
        boolean flag3 = false;
        boolean flag2 = false;
        boolean flag1 = false;
        boolean flag = false;
        do
        {
            if (parcel.dataPosition() < l)
            {
                int i1 = parcel.readInt();
                switch (0xffff & i1)
                {
                case 16: // '\020'
                case 17: // '\021'
                case 20: // '\024'
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, i1);
                    break;

                case 1: // '\001'
                    k = com.google.android.gms.common.internal.safeparcel.a.f(parcel, i1);
                    break;

                case 2: // '\002'
                    s5 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, i1);
                    break;

                case 3: // '\003'
                    s4 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, i1);
                    break;

                case 4: // '\004'
                    arraylist2 = com.google.android.gms.common.internal.safeparcel.a.t(parcel, i1);
                    break;

                case 5: // '\005'
                    j = com.google.android.gms.common.internal.safeparcel.a.f(parcel, i1);
                    break;

                case 6: // '\006'
                    arraylist1 = com.google.android.gms.common.internal.safeparcel.a.t(parcel, i1);
                    break;

                case 7: // '\007'
                    l4 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 8: // '\b'
                    flag6 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, i1);
                    break;

                case 9: // '\t'
                    l3 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 10: // '\n'
                    arraylist = com.google.android.gms.common.internal.safeparcel.a.t(parcel, i1);
                    break;

                case 11: // '\013'
                    l2 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 12: // '\f'
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, i1);
                    break;

                case 13: // '\r'
                    s3 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, i1);
                    break;

                case 14: // '\016'
                    l1 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 15: // '\017'
                    s2 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, i1);
                    break;

                case 19: // '\023'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, i1);
                    break;

                case 18: // '\022'
                    flag5 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, i1);
                    break;

                case 21: // '\025'
                    s = com.google.android.gms.common.internal.safeparcel.a.l(parcel, i1);
                    break;

                case 23: // '\027'
                    flag3 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, i1);
                    break;

                case 22: // '\026'
                    flag4 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, i1);
                    break;

                case 25: // '\031'
                    flag1 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, i1);
                    break;

                case 24: // '\030'
                    flag2 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, i1);
                    break;

                case 26: // '\032'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new b((new StringBuilder("Overread allowed size end=")).append(l).toString(), parcel);
            } else
            {
                return new zzgq(k, s5, s4, arraylist2, j, arraylist1, l4, flag6, l3, arraylist, l2, i, s3, l1, s2, flag5, s1, s, flag4, flag3, flag2, flag1, flag);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new zzgq[i];
    }
}
