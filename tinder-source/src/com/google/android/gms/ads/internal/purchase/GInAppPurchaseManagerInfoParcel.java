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
import com.google.android.gms.dynamic.b;
import com.google.android.gms.internal.bu;

// Referenced classes of package com.google.android.gms.ads.internal.purchase:
//            a, h, g

public final class GInAppPurchaseManagerInfoParcel
    implements SafeParcelable
{

    public static final a CREATOR = new a();
    public final int a;
    public final h b;
    public final bu c;
    public final Context d;
    public final g e;

    GInAppPurchaseManagerInfoParcel(int i, IBinder ibinder, IBinder ibinder1, IBinder ibinder2, IBinder ibinder3)
    {
        a = i;
        b = (h)com.google.android.gms.dynamic.b.a(com.google.android.gms.dynamic.a.a.a(ibinder));
        c = (bu)com.google.android.gms.dynamic.b.a(com.google.android.gms.dynamic.a.a.a(ibinder1));
        d = (Context)com.google.android.gms.dynamic.b.a(com.google.android.gms.dynamic.a.a.a(ibinder2));
        e = (g)com.google.android.gms.dynamic.b.a(com.google.android.gms.dynamic.a.a.a(ibinder3));
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
        com.google.android.gms.ads.internal.purchase.a.a(this, parcel);
    }

}
