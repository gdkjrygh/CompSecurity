// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.purchase;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.b.b;
import com.google.android.gms.b.d;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.lf;

// Referenced classes of package com.google.android.gms.ads.internal.purchase:
//            zza, zzk, zzj

public final class GInAppPurchaseManagerInfoParcel
    implements SafeParcelable
{

    public static final zza CREATOR = new zza();
    public final int versionCode;
    public final lf zzCw;
    public final Context zzCx;
    public final zzj zzCy;
    public final zzk zzqE;

    GInAppPurchaseManagerInfoParcel(int i, IBinder ibinder, IBinder ibinder1, IBinder ibinder2, IBinder ibinder3)
    {
        versionCode = i;
        zzqE = (zzk)d.a(b.a(ibinder));
        zzCw = (lf)d.a(b.a(ibinder1));
        zzCx = (Context)d.a(b.a(ibinder2));
        zzCy = (zzj)d.a(b.a(ibinder3));
    }

    public GInAppPurchaseManagerInfoParcel(Context context, zzk zzk1, lf lf1, zzj zzj1)
    {
        versionCode = 2;
        zzCx = context;
        zzqE = zzk1;
        zzCw = lf1;
        zzCy = zzj1;
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

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.ads.internal.purchase.zza.a(this, parcel);
    }

}
