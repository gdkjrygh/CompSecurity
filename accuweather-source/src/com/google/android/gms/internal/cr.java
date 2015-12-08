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
import com.google.android.gms.dynamic.d;
import com.google.android.gms.dynamic.e;

// Referenced classes of package com.google.android.gms.internal:
//            cq, dh, da, dc

public final class cr
    implements SafeParcelable
{

    public static final cq CREATOR = new cq();
    public final dh kV;
    public final da kX;
    public final dc oR;
    public final Context oS;
    public final int versionCode;

    cr(int i, IBinder ibinder, IBinder ibinder1, IBinder ibinder2, IBinder ibinder3)
    {
        versionCode = i;
        kV = (dh)e.e(com.google.android.gms.dynamic.d.a.ag(ibinder));
        kX = (da)e.e(com.google.android.gms.dynamic.d.a.ag(ibinder1));
        oR = (dc)e.e(com.google.android.gms.dynamic.d.a.ag(ibinder2));
        oS = (Context)e.e(com.google.android.gms.dynamic.d.a.ag(ibinder3));
    }

    public cr(dc dc1, dh dh1, da da1, Context context)
    {
        versionCode = 1;
        oR = dc1;
        kV = dh1;
        kX = da1;
        oS = context;
    }

    public static void a(Intent intent, cr cr1)
    {
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("com.google.android.gms.ads.internal.purchase.InAppPurchaseManagerInfo", cr1);
        intent.putExtra("com.google.android.gms.ads.internal.purchase.InAppPurchaseManagerInfo", bundle);
    }

    public static cr b(Intent intent)
    {
        try
        {
            intent = intent.getBundleExtra("com.google.android.gms.ads.internal.purchase.InAppPurchaseManagerInfo");
            intent.setClassLoader(com/google/android/gms/internal/cr.getClassLoader());
            intent = (cr)intent.getParcelable("com.google.android.gms.ads.internal.purchase.InAppPurchaseManagerInfo");
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            return null;
        }
        return intent;
    }

    IBinder aY()
    {
        return e.h(kV).asBinder();
    }

    IBinder aZ()
    {
        return e.h(kX).asBinder();
    }

    IBinder ba()
    {
        return e.h(oR).asBinder();
    }

    IBinder bb()
    {
        return e.h(oS).asBinder();
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        cq.a(this, parcel, i);
    }

}
