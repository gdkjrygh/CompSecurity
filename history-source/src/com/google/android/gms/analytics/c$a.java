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
//            c, ae

final class xZ
    implements ServiceConnection
{

    final c xZ;

    public void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        ae.V((new StringBuilder()).append("service connected, binder: ").append(ibinder).toString());
        try
        {
            if ("com.google.android.gms.analytics.internal.IAnalyticsService".equals(ibinder.getInterfaceDescriptor()))
            {
                ae.V("bound to service");
                c.a(xZ, com.google.android.gms.internal..D(ibinder));
                c.a(xZ);
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (ComponentName componentname) { }
        try
        {
            c.b(xZ).unbindService(this);
        }
        // Misplaced declaration of an exception variable
        catch (ComponentName componentname) { }
        c.a(xZ, null);
        c.c(xZ).a(2, null);
    }

    public void onServiceDisconnected(ComponentName componentname)
    {
        ae.V((new StringBuilder()).append("service disconnected: ").append(componentname).toString());
        c.a(xZ, null);
        c.d(xZ).onDisconnected();
    }

    (c c1)
    {
        xZ = c1;
        super();
    }
}
