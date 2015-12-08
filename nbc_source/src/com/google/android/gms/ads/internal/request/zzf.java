// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.request;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Messenger;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.ads.internal.request:
//            AdRequestInfoParcel

public class zzf
    implements android.os.Parcelable.Creator
{

    public zzf()
    {
    }

    static void zza(AdRequestInfoParcel adrequestinfoparcel, Parcel parcel, int i)
    {
        int j = zzb.zzac(parcel);
        zzb.zzc(parcel, 1, adrequestinfoparcel.versionCode);
        zzb.zza(parcel, 2, adrequestinfoparcel.zzCl, false);
        zzb.zza(parcel, 3, adrequestinfoparcel.zzCm, i, false);
        zzb.zza(parcel, 4, adrequestinfoparcel.zzpN, i, false);
        zzb.zza(parcel, 5, adrequestinfoparcel.zzpG, false);
        zzb.zza(parcel, 6, adrequestinfoparcel.applicationInfo, i, false);
        zzb.zza(parcel, 7, adrequestinfoparcel.zzCn, i, false);
        zzb.zza(parcel, 8, adrequestinfoparcel.zzCo, false);
        zzb.zza(parcel, 9, adrequestinfoparcel.zzCp, false);
        zzb.zza(parcel, 10, adrequestinfoparcel.zzCq, false);
        zzb.zza(parcel, 11, adrequestinfoparcel.zzpJ, i, false);
        zzb.zza(parcel, 12, adrequestinfoparcel.zzCr, false);
        zzb.zzc(parcel, 13, adrequestinfoparcel.zzCs);
        zzb.zzb(parcel, 14, adrequestinfoparcel.zzqd, false);
        zzb.zza(parcel, 15, adrequestinfoparcel.zzCt, false);
        zzb.zza(parcel, 17, adrequestinfoparcel.zzCv, i, false);
        zzb.zza(parcel, 16, adrequestinfoparcel.zzCu);
        zzb.zzc(parcel, 19, adrequestinfoparcel.zzCx);
        zzb.zzc(parcel, 18, adrequestinfoparcel.zzCw);
        zzb.zza(parcel, 21, adrequestinfoparcel.zzCz, false);
        zzb.zza(parcel, 20, adrequestinfoparcel.zzCy);
        zzb.zzc(parcel, 23, adrequestinfoparcel.zzCB);
        zzb.zza(parcel, 22, adrequestinfoparcel.zzCA);
        zzb.zza(parcel, 25, adrequestinfoparcel.zzCD);
        zzb.zza(parcel, 24, adrequestinfoparcel.zzCC, false);
        zzb.zzb(parcel, 27, adrequestinfoparcel.zzCF, false);
        zzb.zza(parcel, 26, adrequestinfoparcel.zzCE, false);
        zzb.zza(parcel, 29, adrequestinfoparcel.zzqb, i, false);
        zzb.zza(parcel, 28, adrequestinfoparcel.zzpF, false);
        zzb.zzb(parcel, 30, adrequestinfoparcel.zzCG, false);
        zzb.zzH(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzj(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzC(i);
    }

    public AdRequestInfoParcel[] zzC(int i)
    {
        return new AdRequestInfoParcel[i];
    }

    public AdRequestInfoParcel zzj(Parcel parcel)
    {
        int j1 = com.google.android.gms.common.internal.safeparcel.zza.zzab(parcel);
        int i1 = 0;
        android.os.Bundle bundle2 = null;
        AdRequestParcel adrequestparcel = null;
        AdSizeParcel adsizeparcel = null;
        String s7 = null;
        ApplicationInfo applicationinfo = null;
        PackageInfo packageinfo = null;
        String s6 = null;
        String s5 = null;
        String s4 = null;
        VersionInfoParcel versioninfoparcel = null;
        android.os.Bundle bundle1 = null;
        int l = 0;
        java.util.ArrayList arraylist2 = null;
        android.os.Bundle bundle = null;
        boolean flag1 = false;
        Messenger messenger = null;
        int k = 0;
        int j = 0;
        float f = 0.0F;
        String s3 = null;
        boolean flag = false;
        int i = 0;
        String s2 = null;
        long l1 = 0L;
        String s1 = null;
        java.util.ArrayList arraylist1 = null;
        String s = null;
        NativeAdOptionsParcel nativeadoptionsparcel = null;
        java.util.ArrayList arraylist = null;
        do
        {
            if (parcel.dataPosition() < j1)
            {
                int k1 = com.google.android.gms.common.internal.safeparcel.zza.zzaa(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.zza.zzbA(k1))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel, k1);
                    break;

                case 1: // '\001'
                    i1 = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, k1);
                    break;

                case 2: // '\002'
                    bundle2 = com.google.android.gms.common.internal.safeparcel.zza.zzq(parcel, k1);
                    break;

                case 3: // '\003'
                    adrequestparcel = (AdRequestParcel)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, k1, AdRequestParcel.CREATOR);
                    break;

                case 4: // '\004'
                    adsizeparcel = (AdSizeParcel)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, k1, AdSizeParcel.CREATOR);
                    break;

                case 5: // '\005'
                    s7 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k1);
                    break;

                case 6: // '\006'
                    applicationinfo = (ApplicationInfo)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, k1, ApplicationInfo.CREATOR);
                    break;

                case 7: // '\007'
                    packageinfo = (PackageInfo)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, k1, PackageInfo.CREATOR);
                    break;

                case 8: // '\b'
                    s6 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k1);
                    break;

                case 9: // '\t'
                    s5 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k1);
                    break;

                case 10: // '\n'
                    s4 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k1);
                    break;

                case 11: // '\013'
                    versioninfoparcel = (VersionInfoParcel)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, k1, VersionInfoParcel.CREATOR);
                    break;

                case 12: // '\f'
                    bundle1 = com.google.android.gms.common.internal.safeparcel.zza.zzq(parcel, k1);
                    break;

                case 13: // '\r'
                    l = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, k1);
                    break;

                case 14: // '\016'
                    arraylist2 = com.google.android.gms.common.internal.safeparcel.zza.zzC(parcel, k1);
                    break;

                case 15: // '\017'
                    bundle = com.google.android.gms.common.internal.safeparcel.zza.zzq(parcel, k1);
                    break;

                case 17: // '\021'
                    messenger = (Messenger)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, k1, Messenger.CREATOR);
                    break;

                case 16: // '\020'
                    flag1 = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, k1);
                    break;

                case 19: // '\023'
                    j = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, k1);
                    break;

                case 18: // '\022'
                    k = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, k1);
                    break;

                case 21: // '\025'
                    s3 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k1);
                    break;

                case 20: // '\024'
                    f = com.google.android.gms.common.internal.safeparcel.zza.zzl(parcel, k1);
                    break;

                case 23: // '\027'
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, k1);
                    break;

                case 22: // '\026'
                    flag = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, k1);
                    break;

                case 25: // '\031'
                    l1 = com.google.android.gms.common.internal.safeparcel.zza.zzi(parcel, k1);
                    break;

                case 24: // '\030'
                    s2 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k1);
                    break;

                case 27: // '\033'
                    arraylist1 = com.google.android.gms.common.internal.safeparcel.zza.zzC(parcel, k1);
                    break;

                case 26: // '\032'
                    s1 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k1);
                    break;

                case 29: // '\035'
                    nativeadoptionsparcel = (NativeAdOptionsParcel)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, k1, NativeAdOptionsParcel.CREATOR);
                    break;

                case 28: // '\034'
                    s = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k1);
                    break;

                case 30: // '\036'
                    arraylist = com.google.android.gms.common.internal.safeparcel.zza.zzC(parcel, k1);
                    break;
                }
            } else
            if (parcel.dataPosition() != j1)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j1).toString(), parcel);
            } else
            {
                return new AdRequestInfoParcel(i1, bundle2, adrequestparcel, adsizeparcel, s7, applicationinfo, packageinfo, s6, s5, s4, versioninfoparcel, bundle1, l, arraylist2, bundle, flag1, messenger, k, j, f, s3, flag, i, s2, l1, s1, arraylist1, s, nativeadoptionsparcel, arraylist);
            }
        } while (true);
    }
}
