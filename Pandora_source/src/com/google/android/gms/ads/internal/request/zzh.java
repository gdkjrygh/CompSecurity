// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.request;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

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
        int j = zzb.zzM(parcel);
        zzb.zzc(parcel, 1, adresponseparcel.versionCode);
        zzb.zza(parcel, 2, adresponseparcel.zzwB, false);
        zzb.zza(parcel, 3, adresponseparcel.zzzr, false);
        zzb.zzb(parcel, 4, adresponseparcel.zzuC, false);
        zzb.zzc(parcel, 5, adresponseparcel.errorCode);
        zzb.zzb(parcel, 6, adresponseparcel.zzuD, false);
        zzb.zza(parcel, 7, adresponseparcel.zzzs);
        zzb.zza(parcel, 8, adresponseparcel.zzzt);
        zzb.zza(parcel, 9, adresponseparcel.zzzu);
        zzb.zzb(parcel, 10, adresponseparcel.zzzv, false);
        zzb.zza(parcel, 11, adresponseparcel.zzuG);
        zzb.zzc(parcel, 12, adresponseparcel.orientation);
        zzb.zza(parcel, 13, adresponseparcel.zzzw, false);
        zzb.zza(parcel, 14, adresponseparcel.zzzx);
        zzb.zza(parcel, 15, adresponseparcel.zzzy, false);
        zzb.zza(parcel, 19, adresponseparcel.zzzA, false);
        zzb.zza(parcel, 18, adresponseparcel.zzzz);
        zzb.zza(parcel, 21, adresponseparcel.zzzB, false);
        zzb.zza(parcel, 23, adresponseparcel.zzqa);
        zzb.zza(parcel, 22, adresponseparcel.zzzC);
        zzb.zza(parcel, 25, adresponseparcel.zzzD);
        zzb.zza(parcel, 24, adresponseparcel.zzze);
        zzb.zzc(parcel, 27, adresponseparcel.zzzF);
        zzb.zza(parcel, 26, adresponseparcel.zzzE);
        zzb.zza(parcel, 28, adresponseparcel.zzzG, i, false);
        zzb.zzH(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzi(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzx(i);
    }

    public AdResponseParcel zzi(Parcel parcel)
    {
        int i1 = com.google.android.gms.common.internal.safeparcel.zza.zzL(parcel);
        int l = 0;
        String s5 = null;
        String s4 = null;
        java.util.ArrayList arraylist2 = null;
        int k = 0;
        java.util.ArrayList arraylist1 = null;
        long l4 = 0L;
        boolean flag6 = false;
        long l3 = 0L;
        java.util.ArrayList arraylist = null;
        long l2 = 0L;
        int j = 0;
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
        int i = 0;
        LargeParcelTeleporter largeparcelteleporter = null;
        do
        {
            if (parcel.dataPosition() < i1)
            {
                int j1 = com.google.android.gms.common.internal.safeparcel.zza.zzK(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.zza.zzaV(j1))
                {
                case 16: // '\020'
                case 17: // '\021'
                case 20: // '\024'
                default:
                    com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel, j1);
                    break;

                case 1: // '\001'
                    l = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, j1);
                    break;

                case 2: // '\002'
                    s5 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, j1);
                    break;

                case 3: // '\003'
                    s4 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, j1);
                    break;

                case 4: // '\004'
                    arraylist2 = com.google.android.gms.common.internal.safeparcel.zza.zzC(parcel, j1);
                    break;

                case 5: // '\005'
                    k = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, j1);
                    break;

                case 6: // '\006'
                    arraylist1 = com.google.android.gms.common.internal.safeparcel.zza.zzC(parcel, j1);
                    break;

                case 7: // '\007'
                    l4 = com.google.android.gms.common.internal.safeparcel.zza.zzi(parcel, j1);
                    break;

                case 8: // '\b'
                    flag6 = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, j1);
                    break;

                case 9: // '\t'
                    l3 = com.google.android.gms.common.internal.safeparcel.zza.zzi(parcel, j1);
                    break;

                case 10: // '\n'
                    arraylist = com.google.android.gms.common.internal.safeparcel.zza.zzC(parcel, j1);
                    break;

                case 11: // '\013'
                    l2 = com.google.android.gms.common.internal.safeparcel.zza.zzi(parcel, j1);
                    break;

                case 12: // '\f'
                    j = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, j1);
                    break;

                case 13: // '\r'
                    s3 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, j1);
                    break;

                case 14: // '\016'
                    l1 = com.google.android.gms.common.internal.safeparcel.zza.zzi(parcel, j1);
                    break;

                case 15: // '\017'
                    s2 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, j1);
                    break;

                case 19: // '\023'
                    s1 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, j1);
                    break;

                case 18: // '\022'
                    flag5 = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, j1);
                    break;

                case 21: // '\025'
                    s = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, j1);
                    break;

                case 23: // '\027'
                    flag3 = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, j1);
                    break;

                case 22: // '\026'
                    flag4 = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, j1);
                    break;

                case 25: // '\031'
                    flag1 = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, j1);
                    break;

                case 24: // '\030'
                    flag2 = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, j1);
                    break;

                case 27: // '\033'
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, j1);
                    break;

                case 26: // '\032'
                    flag = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, j1);
                    break;

                case 28: // '\034'
                    largeparcelteleporter = (LargeParcelTeleporter)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, j1, LargeParcelTeleporter.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != i1)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(i1).toString(), parcel);
            } else
            {
                return new AdResponseParcel(l, s5, s4, arraylist2, k, arraylist1, l4, flag6, l3, arraylist, l2, j, s3, l1, s2, flag5, s1, s, flag4, flag3, flag2, flag1, flag, i, largeparcelteleporter);
            }
        } while (true);
    }

    public AdResponseParcel[] zzx(int i)
    {
        return new AdResponseParcel[i];
    }
}
