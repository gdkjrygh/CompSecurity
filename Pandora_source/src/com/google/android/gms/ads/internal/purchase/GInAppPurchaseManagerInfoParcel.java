// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.purchase;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.internal.zzdq;

// Referenced classes of package com.google.android.gms.ads.internal.purchase:
//            zza, zzk, zzj

public final class GInAppPurchaseManagerInfoParcel
    implements SafeParcelable
{

    public static final zza CREATOR = new zza();
    public final int versionCode;
    public final zzk zzna;
    public final zzdq zzxm;
    public final Context zzxn;
    public final zzj zzxo;

    GInAppPurchaseManagerInfoParcel(int i, IBinder ibinder, IBinder ibinder1, IBinder ibinder2, IBinder ibinder3)
    {
        versionCode = i;
        zzna = (zzk)zze.zzg(com.google.android.gms.dynamic.zzd.zza.zzat(ibinder));
        zzxm = (zzdq)zze.zzg(com.google.android.gms.dynamic.zzd.zza.zzat(ibinder1));
        zzxn = (Context)zze.zzg(com.google.android.gms.dynamic.zzd.zza.zzat(ibinder2));
        zzxo = (zzj)zze.zzg(com.google.android.gms.dynamic.zzd.zza.zzat(ibinder3));
    }

    public GInAppPurchaseManagerInfoParcel(Context context, zzk zzk1, zzdq zzdq1, zzj zzj1)
    {
        versionCode = 2;
        zzxn = context;
        zzna = zzk1;
        zzxm = zzdq1;
        zzxo = zzj1;
    }

    public static void zza(Intent intent, GInAppPurchaseManagerInfoParcel ginapppurchasemanagerinfoparcel)
    {
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("com.google.android.gms.ads.internal.purchase.InAppPurchaseManagerInfo", ginapppurchasemanagerinfoparcel);
        intent.putExtra("com.google.android.gms.ads.internal.purchase.InAppPurchaseManagerInfo", bundle);
    }

    public static GInAppPurchaseManagerInfoParcel zzc(Intent intent)
    {
        try
        {
            intent = intent.getBundleExtra("com.google.android.gms.ads.internal.purchase.InAppPurchaseManagerInfo");
            intent.setClassLoader(com/google/android/gms/ads/internal/purchase/GInAppPurchaseManagerInfoParcel.getClassLoader());
            intent = (GInAppPurchaseManagerInfoParcel)intent.getParcelable("com.google.android.gms.ads.internal.purchase.InAppPurchaseManagerInfo");
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
        com.google.android.gms.ads.internal.purchase.zza.zza(this, parcel, i);
    }

    IBinder zzdT()
    {
        return zze.zzt(zzxo).asBinder();
    }

    IBinder zzdU()
    {
        return zze.zzt(zzna).asBinder();
    }

    IBinder zzdV()
    {
        return zze.zzt(zzxm).asBinder();
    }

    IBinder zzdW()
    {
        return zze.zzt(zzxn).asBinder();
    }

}
