// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.InterstitialAdParameterParcel;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.internal.zzbq;
import com.google.android.gms.internal.zzbu;
import com.google.android.gms.internal.zzgd;

// Referenced classes of package com.google.android.gms.ads.internal.overlay:
//            zze, zzf, zzi, AdLauncherIntentInfoParcel

public final class AdOverlayInfoParcel
    implements SafeParcelable
{

    public static final com.google.android.gms.ads.internal.overlay.zze CREATOR = new com.google.android.gms.ads.internal.overlay.zze();
    public final int orientation;
    public final int versionCode;
    public final VersionInfoParcel zzmJ;
    public final zzbq zzwA;
    public final String zzwB;
    public final boolean zzwC;
    public final String zzwD;
    public final zzi zzwE;
    public final int zzwF;
    public final zzbu zzwG;
    public final String zzwH;
    public final InterstitialAdParameterParcel zzwI;
    public final String zzwa;
    public final AdLauncherIntentInfoParcel zzww;
    public final zza zzwx;
    public final zzf zzwy;
    public final zzgd zzwz;

    AdOverlayInfoParcel(int i, AdLauncherIntentInfoParcel adlauncherintentinfoparcel, IBinder ibinder, IBinder ibinder1, IBinder ibinder2, IBinder ibinder3, String s, 
            boolean flag, String s1, IBinder ibinder4, int j, int k, String s2, VersionInfoParcel versioninfoparcel, 
            IBinder ibinder5, String s3, InterstitialAdParameterParcel interstitialadparameterparcel)
    {
        versionCode = i;
        zzww = adlauncherintentinfoparcel;
        zzwx = (zza)zze.zzg(com.google.android.gms.dynamic.zzd.zza.zzat(ibinder));
        zzwy = (zzf)zze.zzg(com.google.android.gms.dynamic.zzd.zza.zzat(ibinder1));
        zzwz = (zzgd)zze.zzg(com.google.android.gms.dynamic.zzd.zza.zzat(ibinder2));
        zzwA = (zzbq)zze.zzg(com.google.android.gms.dynamic.zzd.zza.zzat(ibinder3));
        zzwB = s;
        zzwC = flag;
        zzwD = s1;
        zzwE = (zzi)zze.zzg(com.google.android.gms.dynamic.zzd.zza.zzat(ibinder4));
        orientation = j;
        zzwF = k;
        zzwa = s2;
        zzmJ = versioninfoparcel;
        zzwG = (zzbu)zze.zzg(com.google.android.gms.dynamic.zzd.zza.zzat(ibinder5));
        zzwH = s3;
        zzwI = interstitialadparameterparcel;
    }

    public AdOverlayInfoParcel(zza zza1, zzf zzf1, zzi zzi1, zzgd zzgd1, int i, VersionInfoParcel versioninfoparcel, String s, 
            InterstitialAdParameterParcel interstitialadparameterparcel)
    {
        versionCode = 4;
        zzww = null;
        zzwx = zza1;
        zzwy = zzf1;
        zzwz = zzgd1;
        zzwA = null;
        zzwB = null;
        zzwC = false;
        zzwD = null;
        zzwE = zzi1;
        orientation = i;
        zzwF = 1;
        zzwa = null;
        zzmJ = versioninfoparcel;
        zzwG = null;
        zzwH = s;
        zzwI = interstitialadparameterparcel;
    }

    public AdOverlayInfoParcel(zza zza1, zzf zzf1, zzi zzi1, zzgd zzgd1, boolean flag, int i, VersionInfoParcel versioninfoparcel)
    {
        versionCode = 4;
        zzww = null;
        zzwx = zza1;
        zzwy = zzf1;
        zzwz = zzgd1;
        zzwA = null;
        zzwB = null;
        zzwC = flag;
        zzwD = null;
        zzwE = zzi1;
        orientation = i;
        zzwF = 2;
        zzwa = null;
        zzmJ = versioninfoparcel;
        zzwG = null;
        zzwH = null;
        zzwI = null;
    }

    public AdOverlayInfoParcel(zza zza1, zzf zzf1, zzbq zzbq1, zzi zzi1, zzgd zzgd1, boolean flag, int i, 
            String s, VersionInfoParcel versioninfoparcel, zzbu zzbu1)
    {
        versionCode = 4;
        zzww = null;
        zzwx = zza1;
        zzwy = zzf1;
        zzwz = zzgd1;
        zzwA = zzbq1;
        zzwB = null;
        zzwC = flag;
        zzwD = null;
        zzwE = zzi1;
        orientation = i;
        zzwF = 3;
        zzwa = s;
        zzmJ = versioninfoparcel;
        zzwG = zzbu1;
        zzwH = null;
        zzwI = null;
    }

    public AdOverlayInfoParcel(zza zza1, zzf zzf1, zzbq zzbq1, zzi zzi1, zzgd zzgd1, boolean flag, int i, 
            String s, String s1, VersionInfoParcel versioninfoparcel, zzbu zzbu1)
    {
        versionCode = 4;
        zzww = null;
        zzwx = zza1;
        zzwy = zzf1;
        zzwz = zzgd1;
        zzwA = zzbq1;
        zzwB = s1;
        zzwC = flag;
        zzwD = s;
        zzwE = zzi1;
        orientation = i;
        zzwF = 3;
        zzwa = null;
        zzmJ = versioninfoparcel;
        zzwG = zzbu1;
        zzwH = null;
        zzwI = null;
    }

    public AdOverlayInfoParcel(AdLauncherIntentInfoParcel adlauncherintentinfoparcel, zza zza1, zzf zzf1, zzi zzi1, VersionInfoParcel versioninfoparcel)
    {
        versionCode = 4;
        zzww = adlauncherintentinfoparcel;
        zzwx = zza1;
        zzwy = zzf1;
        zzwz = null;
        zzwA = null;
        zzwB = null;
        zzwC = false;
        zzwD = null;
        zzwE = zzi1;
        orientation = -1;
        zzwF = 4;
        zzwa = null;
        zzmJ = versioninfoparcel;
        zzwG = null;
        zzwH = null;
        zzwI = null;
    }

    public static void zza(Intent intent, AdOverlayInfoParcel adoverlayinfoparcel)
    {
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", adoverlayinfoparcel);
        intent.putExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", bundle);
    }

    public static AdOverlayInfoParcel zzb(Intent intent)
    {
        try
        {
            intent = intent.getBundleExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
            intent.setClassLoader(com/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel.getClassLoader());
            intent = (AdOverlayInfoParcel)intent.getParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            return null;
        }
        return intent;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.ads.internal.overlay.zze.zza(this, parcel, i);
    }

    IBinder zzdA()
    {
        return zze.zzt(zzwy).asBinder();
    }

    IBinder zzdB()
    {
        return zze.zzt(zzwz).asBinder();
    }

    IBinder zzdC()
    {
        return zze.zzt(zzwA).asBinder();
    }

    IBinder zzdD()
    {
        return zze.zzt(zzwG).asBinder();
    }

    IBinder zzdE()
    {
        return zze.zzt(zzwE).asBinder();
    }

    IBinder zzdz()
    {
        return zze.zzt(zzwx).asBinder();
    }

}
