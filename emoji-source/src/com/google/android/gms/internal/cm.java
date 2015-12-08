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
//            eu, cf, co, cn

public final class cm extends g
{
    private static final class a extends Exception
    {

        public a(String s)
        {
            super(s);
        }
    }


    private static final cm oS = new cm();

    private cm()
    {
        super("com.google.android.gms.ads.AdOverlayCreatorImpl");
    }

    public static cn a(Activity activity)
    {
        try
        {
            if (b(activity))
            {
                eu.z("Using AdOverlay from the client jar.");
                return new cf(activity);
            }
            activity = oS.c(activity);
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            eu.D(activity.getMessage());
            return null;
        }
        return activity;
    }

    private static boolean b(Activity activity)
        throws a
    {
        activity = activity.getIntent();
        if (!activity.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar"))
        {
            throw new a("Ad overlay requires the useClientJar flag in intent extras.");
        } else
        {
            return activity.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false);
        }
    }

    private cn c(Activity activity)
    {
        try
        {
            com.google.android.gms.dynamic.d d1 = e.h(activity);
            activity = cn.a.m(((co)G(activity)).a(d1));
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            eu.c("Could not create remote AdOverlay.", activity);
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            eu.c("Could not create remote AdOverlay.", activity);
            return null;
        }
        return activity;
    }

    protected Object d(IBinder ibinder)
    {
        return l(ibinder);
    }

    protected co l(IBinder ibinder)
    {
        return co.a.n(ibinder);
    }

}
