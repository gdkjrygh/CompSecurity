// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.analytics:
//            c, z

final class xK
    implements ServiceConnection
{

    final c xK;

    public void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        z.V((new StringBuilder()).append("service connected, binder: ").append(ibinder).toString());
        try
        {
            if ("com.google.android.gms.analytics.internal.IAnalyticsService".equals(ibinder.getInterfaceDescriptor()))
            {
                z.V("bound to service");
                c.a(xK, com.google.android.gms.internal..E(ibinder));
                c.a(xK);
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (ComponentName componentname) { }
        try
        {
            c.b(xK).unbindService(this);
        }
        // Misplaced declaration of an exception variable
        catch (ComponentName componentname) { }
        c.a(xK, null);
        c.c(xK).a(2, null);
    }

    public void onServiceDisconnected(ComponentName componentname)
    {
        z.V((new StringBuilder()).append("service disconnected: ").append(componentname).toString());
        c.a(xK, null);
        c.d(xK).onDisconnected();
    }

    (c c1)
    {
        xK = c1;
        super();
    }
}
