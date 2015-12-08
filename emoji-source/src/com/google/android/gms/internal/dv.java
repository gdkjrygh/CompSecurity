// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.internal:
//            du

public class dv
    implements android.os.Parcelable.Creator
{

    public dv()
    {
    }

    static void a(du du1, Parcel parcel, int j)
    {
        j = b.C(parcel);
        b.c(parcel, 1, du1.versionCode);
        b.a(parcel, 2, du1.oA, false);
        b.a(parcel, 3, du1.qe, false);
        b.a(parcel, 4, du1.nt, false);
        b.c(parcel, 5, du1.errorCode);
        b.a(parcel, 6, du1.nu, false);
        b.a(parcel, 7, du1.qf);
        b.a(parcel, 8, du1.qg);
        b.a(parcel, 9, du1.qh);
        b.a(parcel, 10, du1.qi, false);
        b.a(parcel, 11, du1.nx);
        b.c(parcel, 12, du1.orientation);
        b.a(parcel, 13, du1.qj, false);
        b.a(parcel, 14, du1.qk);
        b.a(parcel, 15, du1.ql, false);
        b.a(parcel, 19, du1.qn, false);
        b.a(parcel, 18, du1.qm);
        b.a(parcel, 21, du1.qo, false);
        b.G(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return i(parcel);
    }

    public du i(Parcel parcel)
    {
        int i1 = com.google.android.gms.common.internal.safeparcel.a.B(parcel);
        int l = 0;
        String s5 = null;
        String s4 = null;
        java.util.ArrayList arraylist2 = null;
        int k = 0;
        java.util.ArrayList arraylist1 = null;
        long l4 = 0L;
        boolean flag1 = false;
        long l3 = 0L;
        java.util.ArrayList arraylist = null;
        long l2 = 0L;
        int j = 0;
        String s3 = null;
        long l1 = 0L;
        String s2 = null;
        boolean flag = false;
        String s1 = null;
        String s = null;
        do
        {
            if (parcel.dataPosition() < i1)
            {
                int j1 = com.google.android.gms.common.internal.safeparcel.a.A(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.ar(j1))
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
                    arraylist2 = com.google.android.gms.common.internal.safeparcel.a.B(parcel, j1);
                    break;

                case 5: // '\005'
                    k = com.google.android.gms.common.internal.safeparcel.a.g(parcel, j1);
                    break;

                case 6: // '\006'
                    arraylist1 = com.google.android.gms.common.internal.safeparcel.a.B(parcel, j1);
                    break;

                case 7: // '\007'
                    l4 = com.google.android.gms.common.internal.safeparcel.a.i(parcel, j1);
                    break;

                case 8: // '\b'
                    flag1 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, j1);
                    break;

                case 9: // '\t'
                    l3 = com.google.android.gms.common.internal.safeparcel.a.i(parcel, j1);
                    break;

                case 10: // '\n'
                    arraylist = com.google.android.gms.common.internal.safeparcel.a.B(parcel, j1);
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
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, j1);
                    break;

                case 21: // '\025'
                    s = com.google.android.gms.common.internal.safeparcel.a.o(parcel, j1);
                    break;
                }
            } else
            if (parcel.dataPosition() != i1)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(i1).toString(), parcel);
            } else
            {
                return new du(l, s5, s4, arraylist2, k, arraylist1, l4, flag1, l3, arraylist, l2, j, s3, l1, s2, flag, s1, s);
            }
        } while (true);
    }

    public du[] n(int j)
    {
        return new du[j];
    }

    public Object[] newArray(int j)
    {
        return n(j);
    }
}
