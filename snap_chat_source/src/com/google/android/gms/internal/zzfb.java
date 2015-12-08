// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zze;

// Referenced classes of package com.google.android.gms.internal:
//            zzfa, zzfl, zzfn, zzfk

public final class zzfb
    implements SafeParcelable
{

    public static final zzfa CREATOR = new zzfa();
    public final int versionCode;
    public final zzfl zzmg;
    public final zzfn zzuS;
    public final Context zzuT;
    public final zzfk zzuU;

    zzfb(int i, IBinder ibinder, IBinder ibinder1, IBinder ibinder2, IBinder ibinder3)
    {
        versionCode = i;
        zzmg = (zzfl)zze.zzf(com.google.android.gms.dynamic.zzd.zza.zzau(ibinder));
        zzuS = (zzfn)zze.zzf(com.google.android.gms.dynamic.zzd.zza.zzau(ibinder1));
        zzuT = (Context)zze.zzf(com.google.android.gms.dynamic.zzd.zza.zzau(ibinder2));
        zzuU = (zzfk)zze.zzf(com.google.android.gms.dynamic.zzd.zza.zzau(ibinder3));
    }

    public zzfb(Context context, zzfl zzfl1, zzfn zzfn1, zzfk zzfk1)
    {
        versionCode = 2;
        zzuT = context;
        zzmg = zzfl1;
        zzuS = zzfn1;
        zzuU = zzfk1;
    }

    public static void zza(Intent intent, zzfb zzfb1)
    {
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("com.google.android.gms.ads.internal.purchase.InAppPurchaseManagerInfo", zzfb1);
        intent.putExtra("com.google.android.gms.ads.internal.purchase.InAppPurchaseManagerInfo", bundle);
    }

    public static zzfb zzc(Intent intent)
    {
        try
        {
            intent = intent.getBundleExtra("com.google.android.gms.ads.internal.purchase.InAppPurchaseManagerInfo");
            intent.setClassLoader(com/google/android/gms/internal/zzfb.getClassLoader());
            intent = (zzfb)intent.getParcelable("com.google.android.gms.ads.internal.purchase.InAppPurchaseManagerInfo");
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
        zzfa.zza(this, parcel, i);
    }

    final IBinder zzds()
    {
        return zze.zzn(zzuU).asBinder();
    }

    final IBinder zzdt()
    {
        return zze.zzn(zzmg).asBinder();
    }

    final IBinder zzdu()
    {
        return zze.zzn(zzuS).asBinder();
    }

    final IBinder zzdv()
    {
        return zze.zzn(zzuT).asBinder();
    }

}
