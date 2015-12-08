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
import com.google.android.gms.internal.zzfe;

// Referenced classes of package com.google.android.gms.ads.internal.purchase:
//            zza, zzk, zzj

public final class GInAppPurchaseManagerInfoParcel
    implements SafeParcelable
{

    public static final zza CREATOR = new zza();
    public final int versionCode;
    public final zzj zzAA;
    public final zzfe zzAy;
    public final Context zzAz;
    public final zzk zzqe;

    GInAppPurchaseManagerInfoParcel(int i, IBinder ibinder, IBinder ibinder1, IBinder ibinder2, IBinder ibinder3)
    {
        versionCode = i;
        zzqe = (zzk)zze.zzn(com.google.android.gms.dynamic.zzd.zza.zzbg(ibinder));
        zzAy = (zzfe)zze.zzn(com.google.android.gms.dynamic.zzd.zza.zzbg(ibinder1));
        zzAz = (Context)zze.zzn(com.google.android.gms.dynamic.zzd.zza.zzbg(ibinder2));
        zzAA = (zzj)zze.zzn(com.google.android.gms.dynamic.zzd.zza.zzbg(ibinder3));
    }

    public GInAppPurchaseManagerInfoParcel(Context context, zzk zzk1, zzfe zzfe1, zzj zzj1)
    {
        versionCode = 2;
        zzAz = context;
        zzqe = zzk1;
        zzAy = zzfe1;
        zzAA = zzj1;
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

    IBinder zzfa()
    {
        return zze.zzw(zzAA).asBinder();
    }

    IBinder zzfb()
    {
        return zze.zzw(zzqe).asBinder();
    }

    IBinder zzfc()
    {
        return zze.zzw(zzAy).asBinder();
    }

    IBinder zzfd()
    {
        return zze.zzw(zzAz).asBinder();
    }

}
