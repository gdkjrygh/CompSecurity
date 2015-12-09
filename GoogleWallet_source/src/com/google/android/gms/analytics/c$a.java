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
//            c, ac

final class xY
    implements ServiceConnection
{

    final c xY;

    public final void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        ac.v((new StringBuilder("service connected, binder: ")).append(ibinder).toString());
        try
        {
            if ("com.google.android.gms.analytics.internal.IAnalyticsService".equals(ibinder.getInterfaceDescriptor()))
            {
                ac.v("bound to service");
                c.a(xY, com.google.android.gms.internal..H(ibinder));
                c.a(xY);
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (ComponentName componentname) { }
        try
        {
            c.b(xY).unbindService(this);
        }
        // Misplaced declaration of an exception variable
        catch (ComponentName componentname) { }
        c.a(xY, null);
        c.c(xY).a(2, null);
    }

    public final void onServiceDisconnected(ComponentName componentname)
    {
        ac.v((new StringBuilder("service disconnected: ")).append(componentname).toString());
        c.a(xY, null);
        c.d(xY).onDisconnected();
    }

    (c c1)
    {
        xY = c1;
        super();
    }
}
