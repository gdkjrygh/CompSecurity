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
//            ev, cg, cp, co

public final class cn extends g
{
    private static final class a extends Exception
    {

        public a(String s)
        {
            super(s);
        }
    }


    private static final cn oQ = new cn();

    private cn()
    {
        super("com.google.android.gms.ads.AdOverlayCreatorImpl");
    }

    public static co a(Activity activity)
    {
        try
        {
            if (b(activity))
            {
                ev.z("Using AdOverlay from the client jar.");
                return new cg(activity);
            }
            activity = oQ.c(activity);
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            ev.D(activity.getMessage());
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

    private co c(Activity activity)
    {
        try
        {
            com.google.android.gms.dynamic.d d1 = e.h(activity);
            activity = co.a.m(((cp)D(activity)).a(d1));
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            ev.c("Could not create remote AdOverlay.", activity);
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            ev.c("Could not create remote AdOverlay.", activity);
            return null;
        }
        return activity;
    }

    protected Object d(IBinder ibinder)
    {
        return l(ibinder);
    }

    protected cp l(IBinder ibinder)
    {
        return cp.a.n(ibinder);
    }

}
