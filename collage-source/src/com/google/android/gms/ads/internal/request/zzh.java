// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.request;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.ads.internal.request:
//            AdResponseParcel, LargeParcelTeleporter

public class zzh
    implements android.os.Parcelable.Creator
{

    public zzh()
    {
    }

    static void zza(AdResponseParcel adresponseparcel, Parcel parcel, int i)
    {
        int j = b.a(parcel);
        b.a(parcel, 1, adresponseparcel.versionCode);
        b.a(parcel, 2, adresponseparcel.zzAT, false);
        b.a(parcel, 3, adresponseparcel.body, false);
        b.a(parcel, 4, adresponseparcel.zzyw, false);
        b.a(parcel, 5, adresponseparcel.errorCode);
        b.a(parcel, 6, adresponseparcel.zzyx, false);
        b.a(parcel, 7, adresponseparcel.zzDW);
        b.a(parcel, 8, adresponseparcel.zzDX);
        b.a(parcel, 9, adresponseparcel.zzDY);
        b.a(parcel, 10, adresponseparcel.zzDZ, false);
        b.a(parcel, 11, adresponseparcel.zzyA);
        b.a(parcel, 12, adresponseparcel.orientation);
        b.a(parcel, 13, adresponseparcel.zzEa, false);
        b.a(parcel, 14, adresponseparcel.zzEb);
        b.a(parcel, 15, adresponseparcel.zzEc, false);
        b.a(parcel, 19, adresponseparcel.zzEe, false);
        b.a(parcel, 18, adresponseparcel.zzEd);
        b.a(parcel, 21, adresponseparcel.zzEf, false);
        b.a(parcel, 23, adresponseparcel.zzsJ);
        b.a(parcel, 22, adresponseparcel.zzEg);
        b.a(parcel, 25, adresponseparcel.zzEh);
        b.a(parcel, 24, adresponseparcel.zzDG);
        b.a(parcel, 27, adresponseparcel.zzEj);
        b.a(parcel, 26, adresponseparcel.zzEi);
        b.a(parcel, 29, adresponseparcel.zzEl, false);
        b.a(parcel, 28, adresponseparcel.zzEk, i, false);
        b.a(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzk(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzD(i);
    }

    public AdResponseParcel[] zzD(int i)
    {
        return new AdResponseParcel[i];
    }

    public AdResponseParcel zzk(Parcel parcel)
    {
        int i1 = a.b(parcel);
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
                int j1 = a.a(parcel);
                switch (a.a(j1))
                {
                case 16: // '\020'
                case 17: // '\021'
                case 20: // '\024'
                default:
                    a.b(parcel, j1);
                    break;

                case 1: // '\001'
                    l = a.d(parcel, j1);
                    break;

                case 2: // '\002'
                    s6 = a.g(parcel, j1);
                    break;

                case 3: // '\003'
                    s5 = a.g(parcel, j1);
                    break;

                case 4: // '\004'
                    arraylist2 = a.m(parcel, j1);
                    break;

                case 5: // '\005'
                    k = a.d(parcel, j1);
                    break;

                case 6: // '\006'
                    arraylist1 = a.m(parcel, j1);
                    break;

                case 7: // '\007'
                    l4 = a.e(parcel, j1);
                    break;

                case 8: // '\b'
                    flag6 = a.c(parcel, j1);
                    break;

                case 9: // '\t'
                    l3 = a.e(parcel, j1);
                    break;

                case 10: // '\n'
                    arraylist = a.m(parcel, j1);
                    break;

                case 11: // '\013'
                    l2 = a.e(parcel, j1);
                    break;

                case 12: // '\f'
                    j = a.d(parcel, j1);
                    break;

                case 13: // '\r'
                    s4 = a.g(parcel, j1);
                    break;

                case 14: // '\016'
                    l1 = a.e(parcel, j1);
                    break;

                case 15: // '\017'
                    s3 = a.g(parcel, j1);
                    break;

                case 19: // '\023'
                    s2 = a.g(parcel, j1);
                    break;

                case 18: // '\022'
                    flag5 = a.c(parcel, j1);
                    break;

                case 21: // '\025'
                    s1 = a.g(parcel, j1);
                    break;

                case 23: // '\027'
                    flag3 = a.c(parcel, j1);
                    break;

                case 22: // '\026'
                    flag4 = a.c(parcel, j1);
                    break;

                case 25: // '\031'
                    flag1 = a.c(parcel, j1);
                    break;

                case 24: // '\030'
                    flag2 = a.c(parcel, j1);
                    break;

                case 27: // '\033'
                    i = a.d(parcel, j1);
                    break;

                case 26: // '\032'
                    flag = a.c(parcel, j1);
                    break;

                case 29: // '\035'
                    s = a.g(parcel, j1);
                    break;

                case 28: // '\034'
                    largeparcelteleporter = (LargeParcelTeleporter)a.a(parcel, j1, LargeParcelTeleporter.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != i1)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(i1).toString(), parcel);
            } else
            {
                return new AdResponseParcel(l, s6, s5, arraylist2, k, arraylist1, l4, flag6, l3, arraylist, l2, j, s4, l1, s3, flag5, s2, s1, flag4, flag3, flag2, flag1, flag, i, largeparcelteleporter, s);
            }
        } while (true);
    }
}
