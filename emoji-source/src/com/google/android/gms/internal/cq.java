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
//            cp, dg, cz, db

public final class cq
    implements SafeParcelable
{

    public static final cp CREATOR = new cp();
    public final dg kX;
    public final cz kZ;
    public final db oT;
    public final Context oU;
    public final int versionCode;

    cq(int i, IBinder ibinder, IBinder ibinder1, IBinder ibinder2, IBinder ibinder3)
    {
        versionCode = i;
        kX = (dg)e.e(com.google.android.gms.dynamic.d.a.ag(ibinder));
        kZ = (cz)e.e(com.google.android.gms.dynamic.d.a.ag(ibinder1));
        oT = (db)e.e(com.google.android.gms.dynamic.d.a.ag(ibinder2));
        oU = (Context)e.e(com.google.android.gms.dynamic.d.a.ag(ibinder3));
    }

    public cq(db db1, dg dg1, cz cz1, Context context)
    {
        versionCode = 1;
        oT = db1;
        kX = dg1;
        kZ = cz1;
        oU = context;
    }

    public static void a(Intent intent, cq cq1)
    {
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("com.google.android.gms.ads.internal.purchase.InAppPurchaseManagerInfo", cq1);
        intent.putExtra("com.google.android.gms.ads.internal.purchase.InAppPurchaseManagerInfo", bundle);
    }

    public static cq b(Intent intent)
    {
        try
        {
            intent = intent.getBundleExtra("com.google.android.gms.ads.internal.purchase.InAppPurchaseManagerInfo");
            intent.setClassLoader(com/google/android/gms/internal/cq.getClassLoader());
            intent = (cq)intent.getParcelable("com.google.android.gms.ads.internal.purchase.InAppPurchaseManagerInfo");
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            return null;
        }
        return intent;
    }

    IBinder bd()
    {
        return e.h(kX).asBinder();
    }

    IBinder be()
    {
        return e.h(kZ).asBinder();
    }

    IBinder bf()
    {
        return e.h(oT).asBinder();
    }

    IBinder bg()
    {
        return e.h(oU).asBinder();
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        cp.a(this, parcel, i);
    }

}
