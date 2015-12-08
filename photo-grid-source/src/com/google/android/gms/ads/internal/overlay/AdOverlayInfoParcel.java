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
import com.google.android.gms.b.b;
import com.google.android.gms.b.d;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.fl;
import com.google.android.gms.internal.gh;
import com.google.android.gms.internal.ry;

// Referenced classes of package com.google.android.gms.ads.internal.overlay:
//            zzf, zzg, zzn, AdLauncherIntentInfoParcel

public final class AdOverlayInfoParcel
    implements SafeParcelable
{

    public static final zzf CREATOR = new zzf();
    public final int orientation;
    public final String url;
    public final int versionCode;
    public final AdLauncherIntentInfoParcel zzBA;
    public final zza zzBB;
    public final zzg zzBC;
    public final ry zzBD;
    public final fl zzBE;
    public final String zzBF;
    public final boolean zzBG;
    public final String zzBH;
    public final zzn zzBI;
    public final int zzBJ;
    public final gh zzBK;
    public final String zzBL;
    public final InterstitialAdParameterParcel zzBM;
    public final VersionInfoParcel zzqj;

    AdOverlayInfoParcel(int i, AdLauncherIntentInfoParcel adlauncherintentinfoparcel, IBinder ibinder, IBinder ibinder1, IBinder ibinder2, IBinder ibinder3, String s, 
            boolean flag, String s1, IBinder ibinder4, int j, int k, String s2, VersionInfoParcel versioninfoparcel, 
            IBinder ibinder5, String s3, InterstitialAdParameterParcel interstitialadparameterparcel)
    {
        versionCode = i;
        zzBA = adlauncherintentinfoparcel;
        zzBB = (zza)d.a(b.a(ibinder));
        zzBC = (zzg)d.a(b.a(ibinder1));
        zzBD = (ry)d.a(b.a(ibinder2));
        zzBE = (fl)d.a(b.a(ibinder3));
        zzBF = s;
        zzBG = flag;
        zzBH = s1;
        zzBI = (zzn)d.a(b.a(ibinder4));
        orientation = j;
        zzBJ = k;
        url = s2;
        zzqj = versioninfoparcel;
        zzBK = (gh)d.a(b.a(ibinder5));
        zzBL = s3;
        zzBM = interstitialadparameterparcel;
    }

    public AdOverlayInfoParcel(zza zza1, zzg zzg1, zzn zzn1, ry ry1, int i, VersionInfoParcel versioninfoparcel, String s, 
            InterstitialAdParameterParcel interstitialadparameterparcel)
    {
        versionCode = 4;
        zzBA = null;
        zzBB = zza1;
        zzBC = zzg1;
        zzBD = ry1;
        zzBE = null;
        zzBF = null;
        zzBG = false;
        zzBH = null;
        zzBI = zzn1;
        orientation = i;
        zzBJ = 1;
        url = null;
        zzqj = versioninfoparcel;
        zzBK = null;
        zzBL = s;
        zzBM = interstitialadparameterparcel;
    }

    public AdOverlayInfoParcel(zza zza1, zzg zzg1, zzn zzn1, ry ry1, boolean flag, int i, VersionInfoParcel versioninfoparcel)
    {
        versionCode = 4;
        zzBA = null;
        zzBB = zza1;
        zzBC = zzg1;
        zzBD = ry1;
        zzBE = null;
        zzBF = null;
        zzBG = flag;
        zzBH = null;
        zzBI = zzn1;
        orientation = i;
        zzBJ = 2;
        url = null;
        zzqj = versioninfoparcel;
        zzBK = null;
        zzBL = null;
        zzBM = null;
    }

    public AdOverlayInfoParcel(zza zza1, zzg zzg1, fl fl1, zzn zzn1, ry ry1, boolean flag, int i, 
            String s, VersionInfoParcel versioninfoparcel, gh gh1)
    {
        versionCode = 4;
        zzBA = null;
        zzBB = zza1;
        zzBC = zzg1;
        zzBD = ry1;
        zzBE = fl1;
        zzBF = null;
        zzBG = flag;
        zzBH = null;
        zzBI = zzn1;
        orientation = i;
        zzBJ = 3;
        url = s;
        zzqj = versioninfoparcel;
        zzBK = gh1;
        zzBL = null;
        zzBM = null;
    }

    public AdOverlayInfoParcel(zza zza1, zzg zzg1, fl fl1, zzn zzn1, ry ry1, boolean flag, int i, 
            String s, String s1, VersionInfoParcel versioninfoparcel, gh gh1)
    {
        versionCode = 4;
        zzBA = null;
        zzBB = zza1;
        zzBC = zzg1;
        zzBD = ry1;
        zzBE = fl1;
        zzBF = s1;
        zzBG = flag;
        zzBH = s;
        zzBI = zzn1;
        orientation = i;
        zzBJ = 3;
        url = null;
        zzqj = versioninfoparcel;
        zzBK = gh1;
        zzBL = null;
        zzBM = null;
    }

    public AdOverlayInfoParcel(AdLauncherIntentInfoParcel adlauncherintentinfoparcel, zza zza1, zzg zzg1, zzn zzn1, VersionInfoParcel versioninfoparcel)
    {
        versionCode = 4;
        zzBA = adlauncherintentinfoparcel;
        zzBB = zza1;
        zzBC = zzg1;
        zzBD = null;
        zzBE = null;
        zzBF = null;
        zzBG = false;
        zzBH = null;
        zzBI = zzn1;
        orientation = -1;
        zzBJ = 4;
        url = null;
        zzqj = versioninfoparcel;
        zzBK = null;
        zzBL = null;
        zzBM = null;
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

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        zzf.a(this, parcel, i);
    }

}
