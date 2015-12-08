// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.web.browser;

import java.util.Map;
import java.util.concurrent.ScheduledFuture;

// Referenced classes of package com.kik.cards.web.browser:
//            BrowserPlugin

final class a
    implements Runnable
{

    final String a;
    final BrowserPlugin b;

    a(BrowserPlugin browserplugin, String s)
    {
        b = browserplugin;
        a = s;
        super();
    }

    public final void run()
    {
        ScheduledFuture scheduledfuture;
        synchronized (BrowserPlugin.a(b))
        {
            scheduledfuture = (ScheduledFuture)BrowserPlugin.a(b).remove(a);
        }
        if (scheduledfuture != null)
        {
            BrowserPlugin.b(b).q();
        }
        return;
        exception;
        map;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
