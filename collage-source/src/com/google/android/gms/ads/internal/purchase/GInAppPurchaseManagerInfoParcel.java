// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.purchase;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.a.a;
import com.google.android.gms.a.b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.en;

// Referenced classes of package com.google.android.gms.ads.internal.purchase:
//            zza, zzk, zzj

public final class GInAppPurchaseManagerInfoParcel
    implements SafeParcelable
{

    public static final zza CREATOR = new zza();
    public final int versionCode;
    public final en zzBJ;
    public final Context zzBK;
    public final zzj zzBL;
    public final zzk zzqw;

    GInAppPurchaseManagerInfoParcel(int i, IBinder ibinder, IBinder ibinder1, IBinder ibinder2, IBinder ibinder3)
    {
        versionCode = i;
        zzqw = (zzk)b.a(com.google.android.gms.a.a.a.a(ibinder));
        zzBJ = (en)b.a(com.google.android.gms.a.a.a.a(ibinder1));
        zzBK = (Context)b.a(com.google.android.gms.a.a.a.a(ibinder2));
        zzBL = (zzj)b.a(com.google.android.gms.a.a.a.a(ibinder3));
    }

    public GInAppPurchaseManagerInfoParcel(Context context, zzk zzk1, en en1, zzj zzj1)
    {
        versionCode = 2;
        zzBK = context;
        zzqw = zzk1;
        zzBJ = en1;
        zzBL = zzj1;
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

    IBinder zzfc()
    {
        return b.a(zzBL).asBinder();
    }

    IBinder zzfd()
    {
        return b.a(zzqw).asBinder();
    }

    IBinder zzfe()
    {
        return b.a(zzBJ).asBinder();
    }

    IBinder zzff()
    {
        return b.a(zzBK).asBinder();
    }

}
