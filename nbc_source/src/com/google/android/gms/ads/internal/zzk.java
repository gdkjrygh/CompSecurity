// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.ads.internal:
//            InterstitialAdParameterParcel

public class zzk
    implements android.os.Parcelable.Creator
{

    public zzk()
    {
    }

    static void zza(InterstitialAdParameterParcel interstitialadparameterparcel, Parcel parcel, int i)
    {
        i = zzb.zzac(parcel);
        zzb.zzc(parcel, 1, interstitialadparameterparcel.versionCode);
        zzb.zza(parcel, 2, interstitialadparameterparcel.zzoU);
        zzb.zza(parcel, 3, interstitialadparameterparcel.zzoV);
        zzb.zzH(parcel, i);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zza(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzf(i);
    }

    public InterstitialAdParameterParcel zza(Parcel parcel)
    {
        boolean flag1 = false;
        int j = com.google.android.gms.common.internal.safeparcel.zza.zzab(parcel);
        boolean flag = false;
        int i = 0;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = com.google.android.gms.common.internal.safeparcel.zza.zzaa(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.zza.zzbA(k))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel, k);
                    break;

                case 1: // '\001'
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, k);
                    break;

                case 2: // '\002'
                    flag = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, k);
                    break;

                case 3: // '\003'
                    flag1 = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new InterstitialAdParameterParcel(i, flag, flag1);
            }
        } while (true);
    }

    public InterstitialAdParameterParcel[] zzf(int i)
    {
        return new InterstitialAdParameterParcel[i];
    }
}
