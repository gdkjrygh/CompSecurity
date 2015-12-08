// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.internal:
//            zzgq

public class zzgr
    implements android.os.Parcelable.Creator
{

    public zzgr()
    {
    }

    static void zza(zzgq zzgq1, Parcel parcel, int i)
    {
        i = zzb.zzK(parcel);
        zzb.zzc(parcel, 1, zzgq1.versionCode);
        zzb.zza(parcel, 2, zzgq1.zzus, false);
        zzb.zza(parcel, 3, zzgq1.zzwG, false);
        zzb.zzb(parcel, 4, zzgq1.zzst, false);
        zzb.zzc(parcel, 5, zzgq1.errorCode);
        zzb.zzb(parcel, 6, zzgq1.zzsu, false);
        zzb.zza(parcel, 7, zzgq1.zzwH);
        zzb.zza(parcel, 8, zzgq1.zzwI);
        zzb.zza(parcel, 9, zzgq1.zzwJ);
        zzb.zzb(parcel, 10, zzgq1.zzwK, false);
        zzb.zza(parcel, 11, zzgq1.zzsx);
        zzb.zzc(parcel, 12, zzgq1.orientation);
        zzb.zza(parcel, 13, zzgq1.zzwL, false);
        zzb.zza(parcel, 14, zzgq1.zzwM);
        zzb.zza(parcel, 15, zzgq1.zzwN, false);
        zzb.zza(parcel, 19, zzgq1.zzwP, false);
        zzb.zza(parcel, 18, zzgq1.zzwO);
        zzb.zza(parcel, 21, zzgq1.zzwQ, false);
        zzb.zza(parcel, 23, zzgq1.zzwS);
        zzb.zza(parcel, 22, zzgq1.zzwR);
        zzb.zza(parcel, 25, zzgq1.zzwT);
        zzb.zza(parcel, 24, zzgq1.zzwv);
        zzb.zza(parcel, 26, zzgq1.zzwU);
        zzb.zzH(parcel, i);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzi(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzw(i);
    }

    public zzgq zzi(Parcel parcel)
    {
        int l = com.google.android.gms.common.internal.safeparcel.zza.zzJ(parcel);
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
                int i1 = com.google.android.gms.common.internal.safeparcel.zza.zzI(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.zza.zzaP(i1))
                {
                case 16: // '\020'
                case 17: // '\021'
                case 20: // '\024'
                default:
                    com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel, i1);
                    break;

                case 1: // '\001'
                    k = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, i1);
                    break;

                case 2: // '\002'
                    s5 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, i1);
                    break;

                case 3: // '\003'
                    s4 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, i1);
                    break;

                case 4: // '\004'
                    arraylist2 = com.google.android.gms.common.internal.safeparcel.zza.zzC(parcel, i1);
                    break;

                case 5: // '\005'
                    j = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, i1);
                    break;

                case 6: // '\006'
                    arraylist1 = com.google.android.gms.common.internal.safeparcel.zza.zzC(parcel, i1);
                    break;

                case 7: // '\007'
                    l4 = com.google.android.gms.common.internal.safeparcel.zza.zzi(parcel, i1);
                    break;

                case 8: // '\b'
                    flag6 = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, i1);
                    break;

                case 9: // '\t'
                    l3 = com.google.android.gms.common.internal.safeparcel.zza.zzi(parcel, i1);
                    break;

                case 10: // '\n'
                    arraylist = com.google.android.gms.common.internal.safeparcel.zza.zzC(parcel, i1);
                    break;

                case 11: // '\013'
                    l2 = com.google.android.gms.common.internal.safeparcel.zza.zzi(parcel, i1);
                    break;

                case 12: // '\f'
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, i1);
                    break;

                case 13: // '\r'
                    s3 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, i1);
                    break;

                case 14: // '\016'
                    l1 = com.google.android.gms.common.internal.safeparcel.zza.zzi(parcel, i1);
                    break;

                case 15: // '\017'
                    s2 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, i1);
                    break;

                case 19: // '\023'
                    s1 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, i1);
                    break;

                case 18: // '\022'
                    flag5 = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, i1);
                    break;

                case 21: // '\025'
                    s = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, i1);
                    break;

                case 23: // '\027'
                    flag3 = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, i1);
                    break;

                case 22: // '\026'
                    flag4 = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, i1);
                    break;

                case 25: // '\031'
                    flag1 = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, i1);
                    break;

                case 24: // '\030'
                    flag2 = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, i1);
                    break;

                case 26: // '\032'
                    flag = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder("Overread allowed size end=")).append(l).toString(), parcel);
            } else
            {
                return new zzgq(k, s5, s4, arraylist2, j, arraylist1, l4, flag6, l3, arraylist, l2, i, s3, l1, s2, flag5, s1, s, flag4, flag3, flag2, flag1, flag);
            }
        } while (true);
    }

    public zzgq[] zzw(int i)
    {
        return new zzgq[i];
    }
}
