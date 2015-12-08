// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.purchase.zze;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.b.d;
import com.google.android.gms.b.e;
import com.google.android.gms.b.f;

// Referenced classes of package com.google.android.gms.internal:
//            lz, lo, lm, lp, 
//            ll

public final class ly extends e
{

    private static final ly a = new ly();

    private ly()
    {
        super("com.google.android.gms.ads.InAppPurchaseManagerCreatorImpl");
    }

    public static ll a(Activity activity)
    {
        Intent intent;
        try
        {
            intent = activity.getIntent();
            if (!intent.hasExtra("com.google.android.gms.ads.internal.purchase.useClientJar"))
            {
                throw new lz("InAppPurchaseManager requires the useClientJar flag in intent extras.");
            }
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            zzb.zzaH(activity.getMessage());
            return null;
        }
        if (intent.getBooleanExtra("com.google.android.gms.ads.internal.purchase.useClientJar", false))
        {
            zzb.zzaF("Using AdOverlay from the client jar.");
            return new zze(activity);
        }
        activity = a.b(activity);
        return activity;
    }

    private ll b(Activity activity)
    {
        try
        {
            com.google.android.gms.b.a a1 = d.a(activity);
            activity = lm.zzQ(((lo)a(activity)).a(a1));
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            zzb.zzd("Could not create remote InAppPurchaseManager.", activity);
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            zzb.zzd("Could not create remote InAppPurchaseManager.", activity);
            return null;
        }
        return activity;
    }

    protected final Object a(IBinder ibinder)
    {
        return lp.a(ibinder);
    }

}
