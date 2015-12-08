// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.internal.gf;
import com.google.android.gms.internal.ig;

// Referenced classes of package com.google.android.gms.analytics:
//            h, q, t, s

final class r
    implements ServiceConnection
{

    final q a;

    r(q q1)
    {
        a = q1;
        super();
    }

    public final void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        h.c((new StringBuilder("service connected, binder: ")).append(ibinder).toString());
        try
        {
            if ("com.google.android.gms.analytics.internal.IAnalyticsService".equals(ibinder.getInterfaceDescriptor()))
            {
                h.c("bound to service");
                q.a(a, gf.a(ibinder));
                q.a(a);
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (ComponentName componentname) { }
        try
        {
            ig.a().a(q.b(a), this);
        }
        // Misplaced declaration of an exception variable
        catch (ComponentName componentname) { }
        q.c(a);
        q.d(a).a(2);
    }

    public final void onServiceDisconnected(ComponentName componentname)
    {
        h.c((new StringBuilder("service disconnected: ")).append(componentname).toString());
        q.c(a);
        q.e(a).e();
    }
}
