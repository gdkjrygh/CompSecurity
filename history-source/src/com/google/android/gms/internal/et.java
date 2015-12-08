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
//            gr, ee, ep, eo

public final class et extends g
{
    private static final class a extends Exception
    {

        public a(String s)
        {
            super(s);
        }
    }


    private static final et td = new et();

    private et()
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

    public static eo e(Activity activity)
    {
        try
        {
            if (c(activity))
            {
                gr.S("Using AdOverlay from the client jar.");
                return new ee(activity);
            }
            activity = td.f(activity);
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            gr.W(activity.getMessage());
            return null;
        }
        return activity;
    }

    private eo f(Activity activity)
    {
        try
        {
            com.google.android.gms.dynamic.d d1 = com.google.android.gms.dynamic.e.k(activity);
            activity = eo.a.w(((ep)L(activity)).c(d1));
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            gr.d("Could not create remote InAppPurchaseManager.", activity);
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            gr.d("Could not create remote InAppPurchaseManager.", activity);
            return null;
        }
        return activity;
    }

    protected ep A(IBinder ibinder)
    {
        return ep.a.x(ibinder);
    }

    protected Object d(IBinder ibinder)
    {
        return A(ibinder);
    }

}
