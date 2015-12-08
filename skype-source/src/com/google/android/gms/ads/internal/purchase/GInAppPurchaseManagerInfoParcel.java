// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.purchase;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.b.d;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.em;

// Referenced classes of package com.google.android.gms.ads.internal.purchase:
//            a, k, j

public final class GInAppPurchaseManagerInfoParcel
    implements SafeParcelable
{

    public static final a CREATOR = new a();
    public final int a;
    public final k b;
    public final em c;
    public final Context d;
    public final j e;

    GInAppPurchaseManagerInfoParcel(int i, IBinder ibinder, IBinder ibinder1, IBinder ibinder2, IBinder ibinder3)
    {
        a = i;
        b = (k)com.google.android.gms.b.d.a(com.google.android.gms.b.c.a.a(ibinder));
        c = (em)com.google.android.gms.b.d.a(com.google.android.gms.b.c.a.a(ibinder1));
        d = (Context)com.google.android.gms.b.d.a(com.google.android.gms.b.c.a.a(ibinder2));
        e = (j)com.google.android.gms.b.d.a(com.google.android.gms.b.c.a.a(ibinder3));
    }

    public GInAppPurchaseManagerInfoParcel(Context context, k k1, em em1, j j1)
    {
        a = 2;
        d = context;
        b = k1;
        c = em1;
        e = j1;
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
        com.google.android.gms.ads.internal.purchase.a.a(this, parcel);
    }

}
