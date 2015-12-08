// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.purchase;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import bid;
import bin;
import bio;
import byc;
import bye;
import cgs;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class GInAppPurchaseManagerInfoParcel
    implements SafeParcelable
{

    public static final bid CREATOR = new bid();
    public final int a;
    public final bio b;
    public final cgs c;
    public final Context d;
    public final bin e;

    public GInAppPurchaseManagerInfoParcel(int i, IBinder ibinder, IBinder ibinder1, IBinder ibinder2, IBinder ibinder3)
    {
        a = i;
        b = (bio)bye.a(byc.a(ibinder));
        c = (cgs)bye.a(byc.a(ibinder1));
        d = (Context)bye.a(byc.a(ibinder2));
        e = (bin)bye.a(byc.a(ibinder3));
    }

    public GInAppPurchaseManagerInfoParcel(Context context, bio bio1, cgs cgs1, bin bin1)
    {
        a = 2;
        d = context;
        b = bio1;
        c = cgs1;
        e = bin1;
    }

    public static GInAppPurchaseManagerInfoParcel a(Intent intent)
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

    public static void a(Intent intent, GInAppPurchaseManagerInfoParcel ginapppurchasemanagerinfoparcel)
    {
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("com.google.android.gms.ads.internal.purchase.InAppPurchaseManagerInfo", ginapppurchasemanagerinfoparcel);
        intent.putExtra("com.google.android.gms.ads.internal.purchase.InAppPurchaseManagerInfo", bundle);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        bid.a(this, parcel);
    }

}
