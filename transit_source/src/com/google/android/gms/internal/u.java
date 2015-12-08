// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.dynamic.c;
import com.google.android.gms.dynamic.e;

// Referenced classes of package com.google.android.gms.internal:
//            cn, r, co, ad, 
//            x, av, ac

public final class u extends e
{

    private static final u er = new u();

    private u()
    {
        super("com.google.android.gms.ads.AdManagerCreatorImpl");
    }

    public static ac a(Context context, x x, String s, av av)
    {
        Object obj;
label0:
        {
            if (GooglePlayServicesUtil.isGooglePlayServicesAvailable(context) == 0)
            {
                ac ac = er.b(context, x, s, av);
                obj = ac;
                if (ac != null)
                {
                    break label0;
                }
            }
            cn.m("Using AdManager from the client jar.");
            obj = new r(context, x, s, av, new co(0x3d8024, 0x3d8024, true));
        }
        return ((ac) (obj));
    }

    private ac b(Context context, x x, String s, av av)
    {
        try
        {
            com.google.android.gms.dynamic.b b1 = com.google.android.gms.dynamic.c.g(context);
            context = ac.a.f(((ad)t(context)).a(b1, x, s, av, 0x3d8024));
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            cn.b("Could not create remote AdManager.", context);
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            cn.b("Could not create remote AdManager.", context);
            return null;
        }
        return context;
    }

    protected ad c(IBinder ibinder)
    {
        return ad.a.g(ibinder);
    }

    protected Object d(IBinder ibinder)
    {
        return c(ibinder);
    }

}
