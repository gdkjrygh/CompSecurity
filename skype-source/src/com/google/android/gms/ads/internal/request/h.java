// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.request;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.ads.internal.request:
//            LargeParcelTeleporter, AdResponseParcel

public final class h
    implements android.os.Parcelable.Creator
{

    public h()
    {
    }

    public static AdResponseParcel a(Parcel parcel)
    {
        int i1 = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        int l = 0;
        String s6 = null;
        String s5 = null;
        java.util.ArrayList arraylist2 = null;
        int k = 0;
        java.util.ArrayList arraylist1 = null;
        long l4 = 0L;
        boolean flag6 = false;
        long l3 = 0L;
        java.util.ArrayList arraylist = null;
        long l2 = 0L;
        int j = 0;
        String s4 = null;
        long l1 = 0L;
        String s3 = null;
        boolean flag5 = false;
        String s2 = null;
        String s1 = null;
        boolean flag4 = false;
        boolean flag3 = false;
        boolean flag2 = false;
        boolean flag1 = false;
        boolean flag = false;
        int i = 0;
        LargeParcelTeleporter largeparcelteleporter = null;
        String s = null;
        do
        {
            if (parcel.dataPosition() < i1)
            {
                int j1 = parcel.readInt();
                switch (0xffff & j1)
                {
                case 16: // '\020'
                case 17: // '\021'
                case 20: // '\024'
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, j1);
                    break;

                case 1: // '\001'
                    l = com.google.android.gms.common.internal.safeparcel.a.f(parcel, j1);
                    break;

                case 2: // '\002'
                    s6 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, j1);
                    break;

                case 3: // '\003'
                    s5 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, j1);
                    break;

                case 4: // '\004'
                    arraylist2 = com.google.android.gms.common.internal.safeparcel.a.t(parcel, j1);
                    break;

                case 5: // '\005'
                    k = com.google.android.gms.common.internal.safeparcel.a.f(parcel, j1);
                    break;

                case 6: // '\006'
                    arraylist1 = com.google.android.gms.common.internal.safeparcel.a.t(parcel, j1);
                    break;

                case 7: // '\007'
                    l4 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, j1);
                    break;

                case 8: // '\b'
                    flag6 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, j1);
                    break;

                case 9: // '\t'
                    l3 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, j1);
                    break;

                case 10: // '\n'
                    arraylist = com.google.android.gms.common.internal.safeparcel.a.t(parcel, j1);
                    break;

                case 11: // '\013'
                    l2 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, j1);
                    break;

                case 12: // '\f'
                    j = com.google.android.gms.common.internal.safeparcel.a.f(parcel, j1);
                    break;

                case 13: // '\r'
                    s4 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, j1);
                    break;

                case 14: // '\016'
                    l1 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, j1);
                    break;

                case 15: // '\017'
                    s3 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, j1);
                    break;

                case 19: // '\023'
                    s2 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, j1);
                    break;

                case 18: // '\022'
                    flag5 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, j1);
                    break;

                case 21: // '\025'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, j1);
                    break;

                case 23: // '\027'
                    flag3 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, j1);
                    break;

                case 22: // '\026'
                    flag4 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, j1);
                    break;

                case 25: // '\031'
                    flag1 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, j1);
                    break;

                case 24: // '\030'
                    flag2 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, j1);
                    break;

                case 27: // '\033'
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, j1);
                    break;

                case 26: // '\032'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, j1);
                    break;

                case 29: // '\035'
                    s = com.google.android.gms.common.internal.safeparcel.a.l(parcel, j1);
                    break;

                case 28: // '\034'
                    largeparcelteleporter = (LargeParcelTeleporter)com.google.android.gms.common.internal.safeparcel.a.a(parcel, j1, LargeParcelTeleporter.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != i1)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(i1).toString(), parcel);
            } else
            {
                return new AdResponseParcel(l, s6, s5, arraylist2, k, arraylist1, l4, flag6, l3, arraylist, l2, j, s4, l1, s3, flag5, s2, s1, flag4, flag3, flag2, flag1, flag, i, largeparcelteleporter, s);
            }
        } while (true);
    }

    static void a(AdResponseParcel adresponseparcel, Parcel parcel, int i)
    {
        int j = b.a(parcel);
        b.a(parcel, 1, adresponseparcel.a);
        b.a(parcel, 2, adresponseparcel.b);
        b.a(parcel, 3, adresponseparcel.c);
        b.b(parcel, 4, adresponseparcel.d);
        b.a(parcel, 5, adresponseparcel.e);
        b.b(parcel, 6, adresponseparcel.f);
        b.a(parcel, 7, adresponseparcel.g);
        b.a(parcel, 8, adresponseparcel.h);
        b.a(parcel, 9, adresponseparcel.i);
        b.b(parcel, 10, adresponseparcel.j);
        b.a(parcel, 11, adresponseparcel.k);
        b.a(parcel, 12, adresponseparcel.l);
        b.a(parcel, 13, adresponseparcel.m);
        b.a(parcel, 14, adresponseparcel.n);
        b.a(parcel, 15, adresponseparcel.o);
        b.a(parcel, 19, adresponseparcel.q);
        b.a(parcel, 18, adresponseparcel.p);
        b.a(parcel, 21, adresponseparcel.r);
        b.a(parcel, 23, adresponseparcel.t);
        b.a(parcel, 22, adresponseparcel.s);
        b.a(parcel, 25, adresponseparcel.v);
        b.a(parcel, 24, adresponseparcel.u);
        b.a(parcel, 27, adresponseparcel.x);
        b.a(parcel, 26, adresponseparcel.w);
        b.a(parcel, 29, adresponseparcel.z);
        b.a(parcel, 28, adresponseparcel.y, i);
        b.a(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public final Object[] newArray(int i)
    {
        return new AdResponseParcel[i];
    }
}
