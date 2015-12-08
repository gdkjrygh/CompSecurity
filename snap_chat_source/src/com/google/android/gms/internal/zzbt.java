// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.internal:
//            zzbs

public class zzbt
    implements android.os.Parcelable.Creator
{

    public zzbt()
    {
    }

    static void zza(zzbs zzbs1, Parcel parcel, int i)
    {
        i = zzb.zzK(parcel);
        zzb.zzc(parcel, 1, zzbs1.versionCode);
        zzb.zzc(parcel, 2, zzbs1.zzpN);
        zzb.zzc(parcel, 3, zzbs1.backgroundColor);
        zzb.zzc(parcel, 4, zzbs1.zzpO);
        zzb.zzc(parcel, 5, zzbs1.zzpP);
        zzb.zzc(parcel, 6, zzbs1.zzpQ);
        zzb.zzc(parcel, 7, zzbs1.zzpR);
        zzb.zzc(parcel, 8, zzbs1.zzpS);
        zzb.zzc(parcel, 9, zzbs1.zzpT);
        zzb.zza(parcel, 10, zzbs1.zzpU, false);
        zzb.zzc(parcel, 11, zzbs1.zzpV);
        zzb.zza(parcel, 12, zzbs1.zzpW, false);
        zzb.zzc(parcel, 13, zzbs1.zzpX);
        zzb.zzc(parcel, 14, zzbs1.zzpY);
        zzb.zza(parcel, 15, zzbs1.zzpZ, false);
        zzb.zzH(parcel, i);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzd(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzi(i);
    }

    public zzbs zzd(Parcel parcel)
    {
        int i3 = com.google.android.gms.common.internal.safeparcel.zza.zzJ(parcel);
        int l2 = 0;
        int k2 = 0;
        int j2 = 0;
        int i2 = 0;
        int l1 = 0;
        int k1 = 0;
        int j1 = 0;
        int i1 = 0;
        int l = 0;
        String s2 = null;
        int k = 0;
        String s1 = null;
        int j = 0;
        int i = 0;
        String s = null;
        do
        {
            if (parcel.dataPosition() < i3)
            {
                int j3 = com.google.android.gms.common.internal.safeparcel.zza.zzI(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.zza.zzaP(j3))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel, j3);
                    break;

                case 1: // '\001'
                    l2 = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, j3);
                    break;

                case 2: // '\002'
                    k2 = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, j3);
                    break;

                case 3: // '\003'
                    j2 = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, j3);
                    break;

                case 4: // '\004'
                    i2 = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, j3);
                    break;

                case 5: // '\005'
                    l1 = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, j3);
                    break;

                case 6: // '\006'
                    k1 = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, j3);
                    break;

                case 7: // '\007'
                    j1 = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, j3);
                    break;

                case 8: // '\b'
                    i1 = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, j3);
                    break;

                case 9: // '\t'
                    l = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, j3);
                    break;

                case 10: // '\n'
                    s2 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, j3);
                    break;

                case 11: // '\013'
                    k = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, j3);
                    break;

                case 12: // '\f'
                    s1 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, j3);
                    break;

                case 13: // '\r'
                    j = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, j3);
                    break;

                case 14: // '\016'
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, j3);
                    break;

                case 15: // '\017'
                    s = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, j3);
                    break;
                }
            } else
            if (parcel.dataPosition() != i3)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder("Overread allowed size end=")).append(i3).toString(), parcel);
            } else
            {
                return new zzbs(l2, k2, j2, i2, l1, k1, j1, i1, l, s2, k, s1, j, i, s);
            }
        } while (true);
    }

    public zzbs[] zzi(int i)
    {
        return new zzbs[i];
    }
}
