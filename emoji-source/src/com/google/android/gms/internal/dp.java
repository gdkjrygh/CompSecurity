// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.common.GooglePlayServicesUtil;

// Referenced classes of package com.google.android.gms.internal:
//            ds, ev, eu, em, 
//            du

public final class dp
{
    public static interface a
    {

        public abstract void a(du du);
    }


    public static em a(Context context, ds ds1, a a1)
    {
        if (ds1.kQ.sz)
        {
            return b(context, ds1, a1);
        } else
        {
            return c(context, ds1, a1);
        }
    }

    private static em b(Context context, ds ds1, a a1)
    {
        eu.z("Fetching ad response from local ad request service.");
        context = new dq.a(context, ds1, a1);
        context.start();
        return context;
    }

    private static em c(Context context, ds ds1, a a1)
    {
        eu.z("Fetching ad response from remote ad request service.");
        if (GooglePlayServicesUtil.isGooglePlayServicesAvailable(context) != 0)
        {
            eu.D("Failed to connect to remote ad request service.");
            return null;
        } else
        {
            return new dq.b(context, ds1, a1);
        }
    }
}
