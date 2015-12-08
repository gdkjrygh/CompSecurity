// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.dynamic.e;
import com.google.android.gms.dynamic.g;

// Referenced classes of package com.google.android.gms.internal:
//            eu, cu, de, dd

public final class di extends g
{
    private static final class a extends Exception
    {

        public a(String s)
        {
            super(s);
        }
    }


    private static final di pv = new di();

    private di()
    {
        super("com.google.android.gms.ads.InAppPurchaseManagerCreatorImpl");
    }

    private static boolean b(Activity activity)
        throws a
    {
        activity = activity.getIntent();
        if (!activity.hasExtra("com.google.android.gms.ads.internal.purchase.useClientJar"))
        {
            throw new a("InAppPurchaseManager requires the useClientJar flag in intent extras.");
        } else
        {
            return activity.getBooleanExtra("com.google.android.gms.ads.internal.purchase.useClientJar", false);
        }
    }

    public static dd d(Activity activity)
    {
        try
        {
            if (b(activity))
            {
                eu.z("Using AdOverlay from the client jar.");
                return new cu(activity);
            }
            activity = pv.e(activity);
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            eu.D(activity.getMessage());
            return null;
        }
        return activity;
    }

    private dd e(Activity activity)
    {
        try
        {
            com.google.android.gms.dynamic.d d1 = com.google.android.gms.dynamic.e.h(activity);
            activity = dd.a.r(((de)G(activity)).b(d1));
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            eu.c("Could not create remote InAppPurchaseManager.", activity);
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            eu.c("Could not create remote InAppPurchaseManager.", activity);
            return null;
        }
        return activity;
    }

    protected Object d(IBinder ibinder)
    {
        return v(ibinder);
    }

    protected de v(IBinder ibinder)
    {
        return de.a.s(ibinder);
    }

}
