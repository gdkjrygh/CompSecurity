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
//            ev, v, ew, as, 
//            am, bt, ar

public final class ai extends g
{

    private static final ai lP = new ai();

    private ai()
    {
        super("com.google.android.gms.ads.AdManagerCreatorImpl");
    }

    public static ar a(Context context, am am, String s, bt bt)
    {
        Object obj;
label0:
        {
            if (GooglePlayServicesUtil.isGooglePlayServicesAvailable(context) == 0)
            {
                ar ar = lP.b(context, am, s, bt);
                obj = ar;
                if (ar != null)
                {
                    break label0;
                }
            }
            ev.z("Using AdManager from the client jar.");
            obj = new v(context, am, s, bt, new ew(0x4d7808, 0x4d7808, true));
        }
        return ((ar) (obj));
    }

    private ar b(Context context, am am, String s, bt bt)
    {
        try
        {
            com.google.android.gms.dynamic.d d1 = e.h(context);
            context = ar.a.f(((as)D(context)).a(d1, am, s, bt, 0x4d7808));
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            ev.c("Could not create remote AdManager.", context);
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            ev.c("Could not create remote AdManager.", context);
            return null;
        }
        return context;
    }

    protected as c(IBinder ibinder)
    {
        return com.google.android.gms.internal.as.a.g(ibinder);
    }

    protected Object d(IBinder ibinder)
    {
        return c(ibinder);
    }

}
