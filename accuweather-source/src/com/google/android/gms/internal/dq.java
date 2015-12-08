// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.common.GooglePlayServicesUtil;

// Referenced classes of package com.google.android.gms.internal:
//            dt, ew, ev, en, 
//            dv

public final class dq
{
    public static interface a
    {

        public abstract void a(dv dv);
    }


    public static en a(Context context, dt dt1, a a1)
    {
        if (dt1.kO.sw)
        {
            return b(context, dt1, a1);
        } else
        {
            return c(context, dt1, a1);
        }
    }

    private static en b(Context context, dt dt1, a a1)
    {
        ev.z("Fetching ad response from local ad request service.");
        context = new dr.a(context, dt1, a1);
        context.start();
        return context;
    }

    private static en c(Context context, dt dt1, a a1)
    {
        ev.z("Fetching ad response from remote ad request service.");
        if (GooglePlayServicesUtil.isGooglePlayServicesAvailable(context) != 0)
        {
            ev.D("Failed to connect to remote ad request service.");
            return null;
        } else
        {
            return new dr.b(context, dt1, a1);
        }
    }
}
