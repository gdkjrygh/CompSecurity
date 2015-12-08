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

final class ty
    implements ServiceConnection
{

    final c ty;

    public void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        aa.C((new StringBuilder()).append("service connected, binder: ").append(ibinder).toString());
        try
        {
            if ("com.google.android.gms.analytics.internal.IAnalyticsService".equals(ibinder.getInterfaceDescriptor()))
            {
                aa.C("bound to service");
                c.a(ty, com.google.android.gms.internal..z(ibinder));
                c.a(ty);
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (ComponentName componentname) { }
        c.b(ty).unbindService(this);
        c.a(ty, null);
        c.c(ty).a(2, null);
    }

    public void onServiceDisconnected(ComponentName componentname)
    {
        aa.C((new StringBuilder()).append("service disconnected: ").append(componentname).toString());
        c.a(ty, null);
        c.d(ty).onDisconnected();
    }

    (c c1)
    {
        ty = c1;
        super();
    }
}
