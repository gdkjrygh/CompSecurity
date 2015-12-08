// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.analytics.tracking.android;

import java.util.Queue;
import java.util.Timer;
import java.util.TimerTask;

// Referenced classes of package com.google.analytics.tracking.android:
//            GAServiceProxy, l, aq

final class aa extends TimerTask
{

    final GAServiceProxy a;

    aa(GAServiceProxy gaserviceproxy)
    {
        a = gaserviceproxy;
        super();
    }

    public final void run()
    {
        if (a.b == GAServiceProxy.ConnectState.CONNECTED_SERVICE && a.c.isEmpty() && a.a + a.f < a.e.a())
        {
            aq.d("Disconnecting due to inactivity");
            a.h();
            return;
        } else
        {
            a.d.schedule(new aa(a), a.f);
            return;
        }
    }
}
