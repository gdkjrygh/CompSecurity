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
//            du, el, ee, eg

public final class dv
    implements SafeParcelable
{

    public static final du CREATOR = new du();
    public final el lM;
    public final ee lT;
    public final eg si;
    public final Context sj;
    public final int versionCode;

    dv(int i, IBinder ibinder, IBinder ibinder1, IBinder ibinder2, IBinder ibinder3)
    {
        versionCode = i;
        lM = (el)e.f(com.google.android.gms.dynamic.d.a.am(ibinder));
        lT = (ee)e.f(com.google.android.gms.dynamic.d.a.am(ibinder1));
        si = (eg)e.f(com.google.android.gms.dynamic.d.a.am(ibinder2));
        sj = (Context)e.f(com.google.android.gms.dynamic.d.a.am(ibinder3));
    }

    public dv(eg eg1, el el1, ee ee1, Context context)
    {
        versionCode = 1;
        si = eg1;
        lM = el1;
        lT = ee1;
        sj = context;
    }

    public static void a(Intent intent, dv dv1)
    {
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("com.google.android.gms.ads.internal.purchase.InAppPurchaseManagerInfo", dv1);
        intent.putExtra("com.google.android.gms.ads.internal.purchase.InAppPurchaseManagerInfo", bundle);
    }

    public static dv c(Intent intent)
    {
        try
        {
            intent = intent.getBundleExtra("com.google.android.gms.ads.internal.purchase.InAppPurchaseManagerInfo");
            intent.setClassLoader(com/google/android/gms/internal/dv.getClassLoader());
            intent = (dv)intent.getParcelable("com.google.android.gms.ads.internal.purchase.InAppPurchaseManagerInfo");
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            return null;
        }
        return intent;
    }

    IBinder ck()
    {
        return e.k(lM).asBinder();
    }

    IBinder cl()
    {
        return e.k(lT).asBinder();
    }

    IBinder cm()
    {
        return e.k(si).asBinder();
    }

    IBinder cn()
    {
        return e.k(sj).asBinder();
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        du.a(this, parcel, i);
    }

}
