// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.overlay;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;

// Referenced classes of package com.google.android.gms.ads.internal.overlay:
//            AdLauncherIntentInfoParcel

public class zzb
    implements android.os.Parcelable.Creator
{

    public zzb()
    {
    }

    static void zza(AdLauncherIntentInfoParcel adlauncherintentinfoparcel, Parcel parcel, int i)
    {
        i = com.google.android.gms.common.internal.safeparcel.zzb.zzac(parcel);
        com.google.android.gms.common.internal.safeparcel.zzb.zzc(parcel, 1, adlauncherintentinfoparcel.versionCode);
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel, 2, adlauncherintentinfoparcel.zzze, false);
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel, 3, adlauncherintentinfoparcel.zzzf, false);
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel, 4, adlauncherintentinfoparcel.mimeType, false);
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel, 5, adlauncherintentinfoparcel.packageName, false);
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel, 6, adlauncherintentinfoparcel.zzzg, false);
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel, 7, adlauncherintentinfoparcel.zzzh, false);
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel, 8, adlauncherintentinfoparcel.zzzi, false);
        com.google.android.gms.common.internal.safeparcel.zzb.zzH(parcel, i);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzg(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzu(i);
    }

    public AdLauncherIntentInfoParcel zzg(Parcel parcel)
    {
        String s = null;
        int j = com.google.android.gms.common.internal.safeparcel.zza.zzab(parcel);
        int i = 0;
        String s1 = null;
        String s2 = null;
        String s3 = null;
        String s4 = null;
        String s5 = null;
        String s6 = null;
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
                    s6 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k);
                    break;

                case 3: // '\003'
                    s5 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k);
                    break;

                case 4: // '\004'
                    s4 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k);
                    break;

                case 5: // '\005'
                    s3 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k);
                    break;

                case 6: // '\006'
                    s2 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k);
                    break;

                case 7: // '\007'
                    s1 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k);
                    break;

                case 8: // '\b'
                    s = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new AdLauncherIntentInfoParcel(i, s6, s5, s4, s3, s2, s1, s);
            }
        } while (true);
    }

    public AdLauncherIntentInfoParcel[] zzu(int i)
    {
        return new AdLauncherIntentInfoParcel[i];
    }
}
