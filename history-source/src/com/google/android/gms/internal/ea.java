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
//            dz, ek, em, ej

public final class ea
    implements SafeParcelable
{

    public static final dz CREATOR = new dz();
    public final ek md;
    public final Context sA;
    public final ej sB;
    public final em sz;
    public final int versionCode;

    ea(int i, IBinder ibinder, IBinder ibinder1, IBinder ibinder2, IBinder ibinder3)
    {
        versionCode = i;
        md = (ek)e.f(com.google.android.gms.dynamic.d.a.ap(ibinder));
        sz = (em)e.f(com.google.android.gms.dynamic.d.a.ap(ibinder1));
        sA = (Context)e.f(com.google.android.gms.dynamic.d.a.ap(ibinder2));
        sB = (ej)e.f(com.google.android.gms.dynamic.d.a.ap(ibinder3));
    }

    public ea(Context context, ek ek1, em em1, ej ej1)
    {
        versionCode = 2;
        sA = context;
        md = ek1;
        sz = em1;
        sB = ej1;
    }

    public static void a(Intent intent, ea ea1)
    {
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("com.google.android.gms.ads.internal.purchase.InAppPurchaseManagerInfo", ea1);
        intent.putExtra("com.google.android.gms.ads.internal.purchase.InAppPurchaseManagerInfo", bundle);
    }

    public static ea c(Intent intent)
    {
        try
        {
            intent = intent.getBundleExtra("com.google.android.gms.ads.internal.purchase.InAppPurchaseManagerInfo");
            intent.setClassLoader(com/google/android/gms/internal/ea.getClassLoader());
            intent = (ea)intent.getParcelable("com.google.android.gms.ads.internal.purchase.InAppPurchaseManagerInfo");
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            return null;
        }
        return intent;
    }

    IBinder ct()
    {
        return e.k(sB).asBinder();
    }

    IBinder cu()
    {
        return e.k(md).asBinder();
    }

    IBinder cv()
    {
        return e.k(sz).asBinder();
    }

    IBinder cw()
    {
        return e.k(sA).asBinder();
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        dz.a(this, parcel, i);
    }

}
