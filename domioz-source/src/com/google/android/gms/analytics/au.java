// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import com.google.android.gms.internal.io;
import java.util.Queue;
import java.util.Timer;
import java.util.TimerTask;

// Referenced classes of package com.google.android.gms.analytics:
//            aq, at, h

final class au extends TimerTask
{

    final aq a;

    private au(aq aq1)
    {
        a = aq1;
        super();
    }

    au(aq aq1, byte byte0)
    {
        this(aq1);
    }

    public final void run()
    {
        if (aq.b(a) == at.b && aq.e(a).isEmpty() && aq.f(a) + aq.g(a) < aq.h(a).b())
        {
            h.c("Disconnecting due to inactivity");
            aq.i(a);
            return;
        } else
        {
            aq.j(a).schedule(new au(a), aq.g(a));
            return;
        }
    }
}
