// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.dynamic.e;
import com.google.android.gms.dynamic.g;

// Referenced classes of package com.google.android.gms.internal:
//            dw, v, dx, aq, 
//            ak, bp, ap

public final class ag extends g
{

    private static final ag lG = new ag();

    private ag()
    {
        super("com.google.android.gms.ads.AdManagerCreatorImpl");
    }

    public static ap a(Context context, ak ak, String s, bp bp)
    {
        Object obj;
label0:
        {
            if (GooglePlayServicesUtil.isGooglePlayServicesAvailable(context) == 0)
            {
                ap ap = lG.b(context, ak, s, bp);
                obj = ap;
                if (ap != null)
                {
                    break label0;
                }
            }
            dw.v("Using AdManager from the client jar.");
            obj = new v(context, ak, s, bp, new dx(0x43eea0, 0x43eea0, true));
        }
        return ((ap) (obj));
    }

    private ap b(Context context, ak ak, String s, bp bp)
    {
        try
        {
            com.google.android.gms.dynamic.d d1 = e.h(context);
            context = ap.a.f(((aq)z(context)).a(d1, ak, s, bp, 0x43eea0));
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            dw.c("Could not create remote AdManager.", context);
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            dw.c("Could not create remote AdManager.", context);
            return null;
        }
        return context;
    }

    protected aq c(IBinder ibinder)
    {
        return com.google.android.gms.internal.aq.a.g(ibinder);
    }

    protected Object d(IBinder ibinder)
    {
        return c(ibinder);
    }

}
