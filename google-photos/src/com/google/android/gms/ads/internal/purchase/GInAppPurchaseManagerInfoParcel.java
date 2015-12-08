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
import im;
import joh;
import jpi;
import k;
import kol;
import kon;

public final class GInAppPurchaseManagerInfoParcel
    implements SafeParcelable
{

    public static final jpi CREATOR = new jpi();
    public final int a;
    public final im b;
    public final joh c;
    public final Context d;
    public final k e;

    public GInAppPurchaseManagerInfoParcel(int i, IBinder ibinder, IBinder ibinder1, IBinder ibinder2, IBinder ibinder3)
    {
        a = i;
        b = (im)kon.a(kol.a(ibinder));
        c = (joh)kon.a(kol.a(ibinder1));
        d = (Context)kon.a(kol.a(ibinder2));
        e = (k)kon.a(kol.a(ibinder3));
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

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        jpi.a(this, parcel);
    }

}
