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
//            gs, dk, dt, ds

public final class dr extends g
{
    private static final class a extends Exception
    {

        public a(String s)
        {
            super(s);
        }
    }


    private static final dr sh = new dr();

    private dr()
    {
        super("com.google.android.gms.ads.AdOverlayCreatorImpl");
    }

    public static ds b(Activity activity)
    {
        try
        {
            if (c(activity))
            {
                gs.S("Using AdOverlay from the client jar.");
                return new dk(activity);
            }
            activity = sh.d(activity);
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            gs.W(activity.getMessage());
            return null;
        }
        return activity;
    }

    private static boolean c(Activity activity)
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

    private ds d(Activity activity)
    {
        try
        {
            com.google.android.gms.dynamic.d d1 = e.k(activity);
            activity = ds.a.p(((dt)L(activity)).a(d1));
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            gs.d("Could not create remote AdOverlay.", activity);
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            gs.d("Could not create remote AdOverlay.", activity);
            return null;
        }
        return activity;
    }

    protected Object d(IBinder ibinder)
    {
        return o(ibinder);
    }

    protected dt o(IBinder ibinder)
    {
        return dt.a.q(ibinder);
    }

}
