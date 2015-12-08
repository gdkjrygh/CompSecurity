// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.request.LargeParcelTeleporter;
import com.google.android.gms.common.internal.safeparcel.zza;

public final class bjc
    implements android.os.Parcelable.Creator
{

    public bjc()
    {
    }

    public static AdResponseParcel a(Parcel parcel)
    {
        int i1 = zza.a(parcel);
        int l = 0;
        String s7 = null;
        String s6 = null;
        java.util.ArrayList arraylist2 = null;
        int k = 0;
        java.util.ArrayList arraylist1 = null;
        long l4 = 0L;
        boolean flag7 = false;
        long l3 = 0L;
        java.util.ArrayList arraylist = null;
        long l2 = 0L;
        int j = 0;
        String s5 = null;
        long l1 = 0L;
        String s4 = null;
        boolean flag6 = false;
        String s3 = null;
        String s2 = null;
        boolean flag5 = false;
        boolean flag4 = false;
        boolean flag3 = false;
        boolean flag2 = false;
        boolean flag1 = false;
        int i = 0;
        LargeParcelTeleporter largeparcelteleporter = null;
        String s1 = null;
        String s = null;
        boolean flag = false;
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
                    zza.b(parcel, j1);
                    break;

                case 1: // '\001'
                    l = zza.e(parcel, j1);
                    break;

                case 2: // '\002'
                    s7 = zza.h(parcel, j1);
                    break;

                case 3: // '\003'
                    s6 = zza.h(parcel, j1);
                    break;

                case 4: // '\004'
                    arraylist2 = zza.l(parcel, j1);
                    break;

                case 5: // '\005'
                    k = zza.e(parcel, j1);
                    break;

                case 6: // '\006'
                    arraylist1 = zza.l(parcel, j1);
                    break;

                case 7: // '\007'
                    l4 = zza.f(parcel, j1);
                    break;

                case 8: // '\b'
                    flag7 = zza.c(parcel, j1);
                    break;

                case 9: // '\t'
                    l3 = zza.f(parcel, j1);
                    break;

                case 10: // '\n'
                    arraylist = zza.l(parcel, j1);
                    break;

                case 11: // '\013'
                    l2 = zza.f(parcel, j1);
                    break;

                case 12: // '\f'
                    j = zza.e(parcel, j1);
                    break;

                case 13: // '\r'
                    s5 = zza.h(parcel, j1);
                    break;

                case 14: // '\016'
                    l1 = zza.f(parcel, j1);
                    break;

                case 15: // '\017'
                    s4 = zza.h(parcel, j1);
                    break;

                case 19: // '\023'
                    s3 = zza.h(parcel, j1);
                    break;

                case 18: // '\022'
                    flag6 = zza.c(parcel, j1);
                    break;

                case 21: // '\025'
                    s2 = zza.h(parcel, j1);
                    break;

                case 23: // '\027'
                    flag4 = zza.c(parcel, j1);
                    break;

                case 22: // '\026'
                    flag5 = zza.c(parcel, j1);
                    break;

                case 25: // '\031'
                    flag2 = zza.c(parcel, j1);
                    break;

                case 24: // '\030'
                    flag3 = zza.c(parcel, j1);
                    break;

                case 27: // '\033'
                    i = zza.e(parcel, j1);
                    break;

                case 26: // '\032'
                    flag1 = zza.c(parcel, j1);
                    break;

                case 29: // '\035'
                    s1 = zza.h(parcel, j1);
                    break;

                case 28: // '\034'
                    largeparcelteleporter = (LargeParcelTeleporter)zza.a(parcel, j1, LargeParcelTeleporter.CREATOR);
                    break;

                case 31: // '\037'
                    flag = zza.c(parcel, j1);
                    break;

                case 30: // '\036'
                    s = zza.h(parcel, j1);
                    break;
                }
            } else
            if (parcel.dataPosition() != i1)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder("Overread allowed size end=")).append(i1).toString(), parcel);
            } else
            {
                return new AdResponseParcel(l, s7, s6, arraylist2, k, arraylist1, l4, flag7, l3, arraylist, l2, j, s5, l1, s4, flag6, s3, s2, flag5, flag4, flag3, flag2, flag1, i, largeparcelteleporter, s1, s, flag);
            }
        } while (true);
    }

    public static void a(AdResponseParcel adresponseparcel, Parcel parcel, int i)
    {
        int j = brp.a(parcel, 20293);
        brp.b(parcel, 1, adresponseparcel.a);
        brp.a(parcel, 2, adresponseparcel.b);
        brp.a(parcel, 3, adresponseparcel.c);
        brp.a(parcel, 4, adresponseparcel.d);
        brp.b(parcel, 5, adresponseparcel.e);
        brp.a(parcel, 6, adresponseparcel.f);
        brp.a(parcel, 7, adresponseparcel.g);
        brp.a(parcel, 8, adresponseparcel.h);
        brp.a(parcel, 9, adresponseparcel.i);
        brp.a(parcel, 10, adresponseparcel.j);
        brp.a(parcel, 11, adresponseparcel.k);
        brp.b(parcel, 12, adresponseparcel.l);
        brp.a(parcel, 13, adresponseparcel.m);
        brp.a(parcel, 14, adresponseparcel.n);
        brp.a(parcel, 15, adresponseparcel.o);
        brp.a(parcel, 19, adresponseparcel.q);
        brp.a(parcel, 18, adresponseparcel.p);
        brp.a(parcel, 21, adresponseparcel.r);
        brp.a(parcel, 23, adresponseparcel.t);
        brp.a(parcel, 22, adresponseparcel.s);
        brp.a(parcel, 25, adresponseparcel.v);
        brp.a(parcel, 24, adresponseparcel.u);
        brp.b(parcel, 27, adresponseparcel.x);
        brp.a(parcel, 26, adresponseparcel.w);
        brp.a(parcel, 29, adresponseparcel.z);
        brp.a(parcel, 28, adresponseparcel.y, i);
        brp.a(parcel, 31, adresponseparcel.B);
        brp.a(parcel, 30, adresponseparcel.A);
        brp.b(parcel, j);
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
