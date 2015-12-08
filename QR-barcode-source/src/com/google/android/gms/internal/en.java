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
//            gs, dz, ej, ei

public final class en extends g
{
    private static final class a extends Exception
    {

        public a(String s)
        {
            super(s);
        }
    }


    private static final en sK = new en();

    private en()
    {
        super("com.google.android.gms.ads.InAppPurchaseManagerCreatorImpl");
    }

    private static boolean c(Activity activity)
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

    public static ei e(Activity activity)
    {
        try
        {
            if (c(activity))
            {
                gs.S("Using AdOverlay from the client jar.");
                return new dz(activity);
            }
            activity = sK.f(activity);
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            gs.W(activity.getMessage());
            return null;
        }
        return activity;
    }

    private ei f(Activity activity)
    {
        try
        {
            com.google.android.gms.dynamic.d d1 = com.google.android.gms.dynamic.e.k(activity);
            activity = ei.a.u(((ej)L(activity)).b(d1));
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            gs.d("Could not create remote InAppPurchaseManager.", activity);
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            gs.d("Could not create remote InAppPurchaseManager.", activity);
            return null;
        }
        return activity;
    }

    protected Object d(IBinder ibinder)
    {
        return y(ibinder);
    }

    protected ej y(IBinder ibinder)
    {
        return ej.a.v(ibinder);
    }

}
