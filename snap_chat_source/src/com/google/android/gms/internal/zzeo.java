// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zze;

// Referenced classes of package com.google.android.gms.internal:
//            zzen, zzat, zzep, zzic, 
//            zzct, zzes, zzcw, zzhy, 
//            zzek, zzx

public final class zzeo
    implements SafeParcelable
{

    public static final zzen CREATOR = new zzen();
    public final int orientation;
    public final int versionCode;
    public final zzhy zzlP;
    public final String zztR;
    public final zzek zzun;
    public final zzat zzuo;
    public final zzep zzup;
    public final zzic zzuq;
    public final zzct zzur;
    public final String zzus;
    public final boolean zzut;
    public final String zzuu;
    public final zzes zzuv;
    public final int zzuw;
    public final zzcw zzux;
    public final String zzuy;
    public final zzx zzuz;

    zzeo(int i, zzek zzek, IBinder ibinder, IBinder ibinder1, IBinder ibinder2, IBinder ibinder3, String s, 
            boolean flag, String s1, IBinder ibinder4, int j, int k, String s2, zzhy zzhy, 
            IBinder ibinder5, String s3, zzx zzx)
    {
        versionCode = i;
        zzun = zzek;
        zzuo = (zzat)zze.zzf(com.google.android.gms.dynamic.zzd.zza.zzau(ibinder));
        zzup = (zzep)zze.zzf(com.google.android.gms.dynamic.zzd.zza.zzau(ibinder1));
        zzuq = (zzic)zze.zzf(com.google.android.gms.dynamic.zzd.zza.zzau(ibinder2));
        zzur = (zzct)zze.zzf(com.google.android.gms.dynamic.zzd.zza.zzau(ibinder3));
        zzus = s;
        zzut = flag;
        zzuu = s1;
        zzuv = (zzes)zze.zzf(com.google.android.gms.dynamic.zzd.zza.zzau(ibinder4));
        orientation = j;
        zzuw = k;
        zztR = s2;
        zzlP = zzhy;
        zzux = (zzcw)zze.zzf(com.google.android.gms.dynamic.zzd.zza.zzau(ibinder5));
        zzuy = s3;
        zzuz = zzx;
    }

    public zzeo(zzat zzat1, zzep zzep1, zzct zzct1, zzes zzes1, zzic zzic1, boolean flag, int i, 
            String s, zzhy zzhy, zzcw zzcw1)
    {
        versionCode = 4;
        zzun = null;
        zzuo = zzat1;
        zzup = zzep1;
        zzuq = zzic1;
        zzur = zzct1;
        zzus = null;
        zzut = flag;
        zzuu = null;
        zzuv = zzes1;
        orientation = i;
        zzuw = 3;
        zztR = s;
        zzlP = zzhy;
        zzux = zzcw1;
        zzuy = null;
        zzuz = null;
    }

    public zzeo(zzat zzat1, zzep zzep1, zzct zzct1, zzes zzes1, zzic zzic1, boolean flag, int i, 
            String s, String s1, zzhy zzhy, zzcw zzcw1)
    {
        versionCode = 4;
        zzun = null;
        zzuo = zzat1;
        zzup = zzep1;
        zzuq = zzic1;
        zzur = zzct1;
        zzus = s1;
        zzut = flag;
        zzuu = s;
        zzuv = zzes1;
        orientation = i;
        zzuw = 3;
        zztR = null;
        zzlP = zzhy;
        zzux = zzcw1;
        zzuy = null;
        zzuz = null;
    }

    public zzeo(zzat zzat1, zzep zzep1, zzes zzes1, zzic zzic1, int i, zzhy zzhy, String s, 
            zzx zzx)
    {
        versionCode = 4;
        zzun = null;
        zzuo = zzat1;
        zzup = zzep1;
        zzuq = zzic1;
        zzur = null;
        zzus = null;
        zzut = false;
        zzuu = null;
        zzuv = zzes1;
        orientation = i;
        zzuw = 1;
        zztR = null;
        zzlP = zzhy;
        zzux = null;
        zzuy = s;
        zzuz = zzx;
    }

    public zzeo(zzat zzat1, zzep zzep1, zzes zzes1, zzic zzic1, boolean flag, int i, zzhy zzhy)
    {
        versionCode = 4;
        zzun = null;
        zzuo = zzat1;
        zzup = zzep1;
        zzuq = zzic1;
        zzur = null;
        zzus = null;
        zzut = flag;
        zzuu = null;
        zzuv = zzes1;
        orientation = i;
        zzuw = 2;
        zztR = null;
        zzlP = zzhy;
        zzux = null;
        zzuy = null;
        zzuz = null;
    }

    public zzeo(zzek zzek, zzat zzat1, zzep zzep1, zzes zzes1, zzhy zzhy)
    {
        versionCode = 4;
        zzun = zzek;
        zzuo = zzat1;
        zzup = zzep1;
        zzuq = null;
        zzur = null;
        zzus = null;
        zzut = false;
        zzuu = null;
        zzuv = zzes1;
        orientation = -1;
        zzuw = 4;
        zztR = null;
        zzlP = zzhy;
        zzux = null;
        zzuy = null;
        zzuz = null;
    }

    public static void zza(Intent intent, zzeo zzeo1)
    {
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", zzeo1);
        intent.putExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", bundle);
    }

    public static zzeo zzb(Intent intent)
    {
        try
        {
            intent = intent.getBundleExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
            intent.setClassLoader(com/google/android/gms/internal/zzeo.getClassLoader());
            intent = (zzeo)intent.getParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
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
        zzen.zza(this, parcel, i);
    }

    final IBinder zzdi()
    {
        return zze.zzn(zzuo).asBinder();
    }

    final IBinder zzdj()
    {
        return zze.zzn(zzup).asBinder();
    }

    final IBinder zzdk()
    {
        return zze.zzn(zzuq).asBinder();
    }

    final IBinder zzdl()
    {
        return zze.zzn(zzur).asBinder();
    }

    final IBinder zzdm()
    {
        return zze.zzn(zzux).asBinder();
    }

    final IBinder zzdn()
    {
        return zze.zzn(zzuv).asBinder();
    }

}
