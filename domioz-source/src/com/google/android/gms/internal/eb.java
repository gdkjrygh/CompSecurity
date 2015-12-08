// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.b.m;
import com.google.android.gms.b.o;
import com.google.android.gms.b.p;

// Referenced classes of package com.google.android.gms.internal:
//            ec, fj, dm, dy, 
//            dw, dz, dv

public final class eb extends o
{

    private static final eb a = new eb();

    private eb()
    {
        super("com.google.android.gms.ads.InAppPurchaseManagerCreatorImpl");
    }

    public static dv a(Activity activity)
    {
        Intent intent;
        try
        {
            intent = activity.getIntent();
            if (!intent.hasExtra("com.google.android.gms.ads.internal.purchase.useClientJar"))
            {
                throw new ec("InAppPurchaseManager requires the useClientJar flag in intent extras.");
            }
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            fj.e(activity.getMessage());
            return null;
        }
        if (intent.getBooleanExtra("com.google.android.gms.ads.internal.purchase.useClientJar", false))
        {
            fj.a("Using AdOverlay from the client jar.");
            return new dm(activity);
        }
        activity = a.b(activity);
        return activity;
    }

    private dv b(Activity activity)
    {
        try
        {
            com.google.android.gms.b.j j = m.a(activity);
            activity = dw.a(((dy)a(activity)).a(j));
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            fj.c("Could not create remote InAppPurchaseManager.", activity);
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            fj.c("Could not create remote InAppPurchaseManager.", activity);
            return null;
        }
        return activity;
    }

    protected final Object a(IBinder ibinder)
    {
        return dz.a(ibinder);
    }

}
