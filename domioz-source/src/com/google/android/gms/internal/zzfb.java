// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.b.k;
import com.google.android.gms.b.m;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            dk, ds, du, dr

public final class zzfb
    implements SafeParcelable
{

    public static final dk CREATOR = new dk();
    public final int a;
    public final ds b;
    public final du c;
    public final Context d;
    public final dr e;

    zzfb(int i, IBinder ibinder, IBinder ibinder1, IBinder ibinder2, IBinder ibinder3)
    {
        a = i;
        b = (ds)m.a(k.a(ibinder));
        c = (du)m.a(k.a(ibinder1));
        d = (Context)m.a(k.a(ibinder2));
        e = (dr)m.a(k.a(ibinder3));
    }

    public static zzfb a(Intent intent)
    {
        try
        {
            intent = intent.getBundleExtra("com.google.android.gms.ads.internal.purchase.InAppPurchaseManagerInfo");
            intent.setClassLoader(com/google/android/gms/internal/zzfb.getClassLoader());
            intent = (zzfb)intent.getParcelable("com.google.android.gms.ads.internal.purchase.InAppPurchaseManagerInfo");
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
        dk.a(this, parcel);
    }

}
