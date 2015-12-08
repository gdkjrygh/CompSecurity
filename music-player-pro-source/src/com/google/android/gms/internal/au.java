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
//            gr, u, gs, be, 
//            ay, cx, bd

public final class au extends g
{

    private static final au oc = new au();

    private au()
    {
        super("com.google.android.gms.ads.AdManagerCreatorImpl");
    }

    public static bd a(Context context, ay ay, String s, cx cx)
    {
        Object obj;
label0:
        {
            if (GooglePlayServicesUtil.isGooglePlayServicesAvailable(context) == 0)
            {
                bd bd = oc.b(context, ay, s, cx);
                obj = bd;
                if (bd != null)
                {
                    break label0;
                }
            }
            gr.S("Using AdManager from the client jar.");
            obj = new u(context, ay, s, cx, new gs(0x648278, 0x648278, true));
        }
        return ((bd) (obj));
    }

    private bd b(Context context, ay ay, String s, cx cx)
    {
        try
        {
            com.google.android.gms.dynamic.d d1 = e.k(context);
            context = bd.a.f(((be)L(context)).a(d1, ay, s, cx, 0x648278));
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            gr.d("Could not create remote AdManager.", context);
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            gr.d("Could not create remote AdManager.", context);
            return null;
        }
        return context;
    }

    protected be c(IBinder ibinder)
    {
        return com.google.android.gms.internal.be.a.g(ibinder);
    }

    protected Object d(IBinder ibinder)
    {
        return c(ibinder);
    }

}
