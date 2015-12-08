// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.pedometer.service;

import android.content.Context;

// Referenced classes of package com.fitbit.pedometer.service:
//            PedometerServicesStateListener

public final class c extends PedometerServicesStateListener
{

    private static c d;
    private Context c;

    private c(Context context)
    {
        c = context;
    }

    public static c b(Context context)
    {
        if (d == null)
        {
            org.androidannotations.a.c.c c1 = org.androidannotations.a.c.c.a(null);
            d = new c(context.getApplicationContext());
            d.d();
            org.androidannotations.a.c.c.a(c1);
        }
        return d;
    }

    private void d()
    {
        b = c;
    }
}
