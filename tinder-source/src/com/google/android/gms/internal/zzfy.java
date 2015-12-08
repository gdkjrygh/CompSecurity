// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.purchase.c;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.dynamic.zzg;

// Referenced classes of package com.google.android.gms.internal:
//            bx, bw

public final class zzfy extends zzg
{
    private static final class zza extends Exception
    {

        public zza(String s)
        {
            super(s);
        }
    }


    private static final zzfy a = new zzfy();

    private zzfy()
    {
        super("com.google.android.gms.ads.InAppPurchaseManagerCreatorImpl");
    }

    public static bw a(Activity activity)
    {
        Intent intent;
        try
        {
            intent = activity.getIntent();
            if (!intent.hasExtra("com.google.android.gms.ads.internal.purchase.useClientJar"))
            {
                throw new zza("InAppPurchaseManager requires the useClientJar flag in intent extras.");
            }
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            com.google.android.gms.ads.internal.util.client.b.e(activity.getMessage());
            return null;
        }
        if (intent.getBooleanExtra("com.google.android.gms.ads.internal.purchase.useClientJar", false))
        {
            com.google.android.gms.ads.internal.util.client.b.a("Using AdOverlay from the client jar.");
            return new c(activity);
        }
        activity = a.b(activity);
        return activity;
    }

    private bw b(Activity activity)
    {
        try
        {
            com.google.android.gms.dynamic.a a1 = com.google.android.gms.dynamic.b.a(activity);
            activity = bw.a.a(((bx)a(activity)).a(a1));
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            com.google.android.gms.ads.internal.util.client.b.c("Could not create remote InAppPurchaseManager.", activity);
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            com.google.android.gms.ads.internal.util.client.b.c("Could not create remote InAppPurchaseManager.", activity);
            return null;
        }
        return activity;
    }

    protected final Object a(IBinder ibinder)
    {
        return bx.a.a(ibinder);
    }

}
