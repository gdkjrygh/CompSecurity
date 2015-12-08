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
//            ev, cv, df, de

public final class dj extends g
{
    private static final class a extends Exception
    {

        public a(String s)
        {
            super(s);
        }
    }


    private static final dj pt = new dj();

    private dj()
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

    public static de d(Activity activity)
    {
        try
        {
            if (b(activity))
            {
                ev.z("Using AdOverlay from the client jar.");
                return new cv(activity);
            }
            activity = pt.e(activity);
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            ev.D(activity.getMessage());
            return null;
        }
        return activity;
    }

    private de e(Activity activity)
    {
        try
        {
            com.google.android.gms.dynamic.d d1 = com.google.android.gms.dynamic.e.h(activity);
            activity = de.a.r(((df)D(activity)).b(d1));
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            ev.c("Could not create remote InAppPurchaseManager.", activity);
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            ev.c("Could not create remote InAppPurchaseManager.", activity);
            return null;
        }
        return activity;
    }

    protected Object d(IBinder ibinder)
    {
        return v(ibinder);
    }

    protected df v(IBinder ibinder)
    {
        return df.a.s(ibinder);
    }

}
