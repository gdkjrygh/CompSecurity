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
//            c, aa

final class sn
    implements ServiceConnection
{

    final c sn;

    public void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        aa.y((new StringBuilder()).append("service connected, binder: ").append(ibinder).toString());
        try
        {
            if ("com.google.android.gms.analytics.internal.IAnalyticsService".equals(ibinder.getInterfaceDescriptor()))
            {
                aa.y("bound to service");
                c.a(sn, com.google.android.gms.internal..t(ibinder));
                c.a(sn);
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (ComponentName componentname) { }
        c.b(sn).unbindService(this);
        c.a(sn, null);
        c.c(sn).a(2, null);
    }

    public void onServiceDisconnected(ComponentName componentname)
    {
        aa.y((new StringBuilder()).append("service disconnected: ").append(componentname).toString());
        c.a(sn, null);
        c.d(sn).onDisconnected();
    }

    (c c1)
    {
        sn = c1;
        super();
    }
}
