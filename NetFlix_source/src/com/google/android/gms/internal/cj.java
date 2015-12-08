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
//            dw, cc, cl, ck

public final class cj extends g
{
    private static final class a extends Exception
    {

        public a(String s)
        {
            super(s);
        }
    }


    private static final cj oC = new cj();

    private cj()
    {
        super("com.google.android.gms.ads.AdOverlayCreatorImpl");
    }

    public static ck a(Activity activity)
    {
        try
        {
            if (b(activity))
            {
                dw.v("Using AdOverlay from the client jar.");
                return new cc(activity);
            }
            activity = oC.c(activity);
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            dw.z(activity.getMessage());
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

    private ck c(Activity activity)
    {
        try
        {
            com.google.android.gms.dynamic.d d1 = e.h(activity);
            activity = ck.a.m(((cl)z(activity)).a(d1));
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            dw.c("Could not create remote AdOverlay.", activity);
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            dw.c("Could not create remote AdOverlay.", activity);
            return null;
        }
        return activity;
    }

    protected Object d(IBinder ibinder)
    {
        return l(ibinder);
    }

    protected cl l(IBinder ibinder)
    {
        return cl.a.n(ibinder);
    }

}
