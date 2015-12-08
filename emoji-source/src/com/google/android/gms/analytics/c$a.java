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

final class tB
    implements ServiceConnection
{

    final c tB;

    public void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        aa.C((new StringBuilder()).append("service connected, binder: ").append(ibinder).toString());
        try
        {
            if ("com.google.android.gms.analytics.internal.IAnalyticsService".equals(ibinder.getInterfaceDescriptor()))
            {
                aa.C("bound to service");
                c.a(tB, com.google.android.gms.internal..z(ibinder));
                c.a(tB);
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (ComponentName componentname) { }
        c.b(tB).unbindService(this);
        c.a(tB, null);
        c.c(tB).a(2, null);
    }

    public void onServiceDisconnected(ComponentName componentname)
    {
        aa.C((new StringBuilder()).append("service disconnected: ").append(componentname).toString());
        c.a(tB, null);
        c.d(tB).onDisconnected();
    }

    (c c1)
    {
        tB = c1;
        super();
    }
}
