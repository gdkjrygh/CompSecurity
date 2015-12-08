// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.dynamic.c;
import com.google.android.gms.dynamic.e;

// Referenced classes of package com.google.android.gms.internal:
//            cn, bf, bo, bn

public final class bm extends e
{
    private static final class a extends Exception
    {

        public a(String s)
        {
            super(s);
        }
    }


    private static final bm gl = new bm();

    private bm()
    {
        super("com.google.android.gms.ads.AdOverlayCreatorImpl");
    }

    public static bn a(Activity activity)
    {
        try
        {
            if (b(activity))
            {
                cn.m("Using AdOverlay from the client jar.");
                return new bf(activity);
            }
            activity = gl.c(activity);
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            cn.q(activity.getMessage());
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

    private bn c(Activity activity)
    {
        try
        {
            com.google.android.gms.dynamic.b b1 = com.google.android.gms.dynamic.c.g(activity);
            activity = bn.a.m(((bo)t(activity)).a(b1));
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            cn.b("Could not create remote AdOverlay.", activity);
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            cn.b("Could not create remote AdOverlay.", activity);
            return null;
        }
        return activity;
    }

    protected Object d(IBinder ibinder)
    {
        return l(ibinder);
    }

    protected bo l(IBinder ibinder)
    {
        return bo.a.n(ibinder);
    }

}
