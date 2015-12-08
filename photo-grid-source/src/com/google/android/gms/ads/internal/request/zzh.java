// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.request;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.ads.internal.request:
//            AdResponseParcel, LargeParcelTeleporter

public class zzh
    implements android.os.Parcelable.Creator
{

    public zzh()
    {
    }

    static void a(AdResponseParcel adresponseparcel, Parcel parcel, int i)
    {
        int j = c.a(parcel);
        c.a(parcel, 1, adresponseparcel.versionCode);
        c.a(parcel, 2, adresponseparcel.zzBF, false);
        c.a(parcel, 3, adresponseparcel.body, false);
        c.a(parcel, 4, adresponseparcel.zzyY, false);
        c.a(parcel, 5, adresponseparcel.errorCode);
        c.a(parcel, 6, adresponseparcel.zzyZ, false);
        c.a(parcel, 7, adresponseparcel.zzEJ);
        c.a(parcel, 8, adresponseparcel.zzEK);
        c.a(parcel, 9, adresponseparcel.zzEL);
        c.a(parcel, 10, adresponseparcel.zzEM, false);
        c.a(parcel, 11, adresponseparcel.zzzc);
        c.a(parcel, 12, adresponseparcel.orientation);
        c.a(parcel, 13, adresponseparcel.zzEN, false);
        c.a(parcel, 14, adresponseparcel.zzEO);
        c.a(parcel, 15, adresponseparcel.zzEP, false);
        c.a(parcel, 19, adresponseparcel.zzER, false);
        c.a(parcel, 18, adresponseparcel.zzEQ);
        c.a(parcel, 21, adresponseparcel.zzES, false);
        c.a(parcel, 23, adresponseparcel.zzth);
        c.a(parcel, 22, adresponseparcel.zzET);
        c.a(parcel, 25, adresponseparcel.zzEU);
        c.a(parcel, 24, adresponseparcel.zzEv);
        c.a(parcel, 27, adresponseparcel.zzEW);
        c.a(parcel, 26, adresponseparcel.zzEV);
        c.a(parcel, 29, adresponseparcel.zzEY, false);
        c.a(parcel, 28, adresponseparcel.zzEX, i, false);
        c.a(parcel, 31, adresponseparcel.zzti);
        c.a(parcel, 30, adresponseparcel.zzEZ, false);
        c.a(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzj(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzE(i);
    }

    public AdResponseParcel[] zzE(int i)
    {
        return new AdResponseParcel[i];
    }

    public AdResponseParcel zzj(Parcel parcel)
    {
        int i1 = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
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
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, j1);
                    break;

                case 1: // '\001'
                    l = com.google.android.gms.common.internal.safeparcel.a.d(parcel, j1);
                    break;

                case 2: // '\002'
                    s7 = com.google.android.gms.common.internal.safeparcel.a.j(parcel, j1);
                    break;

                case 3: // '\003'
                    s6 = com.google.android.gms.common.internal.safeparcel.a.j(parcel, j1);
                    break;

                case 4: // '\004'
                    arraylist2 = com.google.android.gms.common.internal.safeparcel.a.q(parcel, j1);
                    break;

                case 5: // '\005'
                    k = com.google.android.gms.common.internal.safeparcel.a.d(parcel, j1);
                    break;

                case 6: // '\006'
                    arraylist1 = com.google.android.gms.common.internal.safeparcel.a.q(parcel, j1);
                    break;

                case 7: // '\007'
                    l4 = com.google.android.gms.common.internal.safeparcel.a.e(parcel, j1);
                    break;

                case 8: // '\b'
                    flag7 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, j1);
                    break;

                case 9: // '\t'
                    l3 = com.google.android.gms.common.internal.safeparcel.a.e(parcel, j1);
                    break;

                case 10: // '\n'
                    arraylist = com.google.android.gms.common.internal.safeparcel.a.q(parcel, j1);
                    break;

                case 11: // '\013'
                    l2 = com.google.android.gms.common.internal.safeparcel.a.e(parcel, j1);
                    break;

                case 12: // '\f'
                    j = com.google.android.gms.common.internal.safeparcel.a.d(parcel, j1);
                    break;

                case 13: // '\r'
                    s5 = com.google.android.gms.common.internal.safeparcel.a.j(parcel, j1);
                    break;

                case 14: // '\016'
                    l1 = com.google.android.gms.common.internal.safeparcel.a.e(parcel, j1);
                    break;

                case 15: // '\017'
                    s4 = com.google.android.gms.common.internal.safeparcel.a.j(parcel, j1);
                    break;

                case 19: // '\023'
                    s3 = com.google.android.gms.common.internal.safeparcel.a.j(parcel, j1);
                    break;

                case 18: // '\022'
                    flag6 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, j1);
                    break;

                case 21: // '\025'
                    s2 = com.google.android.gms.common.internal.safeparcel.a.j(parcel, j1);
                    break;

                case 23: // '\027'
                    flag4 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, j1);
                    break;

                case 22: // '\026'
                    flag5 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, j1);
                    break;

                case 25: // '\031'
                    flag2 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, j1);
                    break;

                case 24: // '\030'
                    flag3 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, j1);
                    break;

                case 27: // '\033'
                    i = com.google.android.gms.common.internal.safeparcel.a.d(parcel, j1);
                    break;

                case 26: // '\032'
                    flag1 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, j1);
                    break;

                case 29: // '\035'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.j(parcel, j1);
                    break;

                case 28: // '\034'
                    largeparcelteleporter = (LargeParcelTeleporter)com.google.android.gms.common.internal.safeparcel.a.a(parcel, j1, LargeParcelTeleporter.CREATOR);
                    break;

                case 31: // '\037'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, j1);
                    break;

                case 30: // '\036'
                    s = com.google.android.gms.common.internal.safeparcel.a.j(parcel, j1);
                    break;
                }
            } else
            if (parcel.dataPosition() != i1)
            {
                throw new b((new StringBuilder("Overread allowed size end=")).append(i1).toString(), parcel);
            } else
            {
                return new AdResponseParcel(l, s7, s6, arraylist2, k, arraylist1, l4, flag7, l3, arraylist, l2, j, s5, l1, s4, flag6, s3, s2, flag5, flag4, flag3, flag2, flag1, i, largeparcelteleporter, s1, s, flag);
            }
        } while (true);
    }
}
