// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.env;

import java.lang.ref.ReferenceQueue;
import java.util.Collection;

// Referenced classes of package com.google.android.apps.unveil.env:
//            m, af, o, j

final class n extends Thread
{

    final m a;

    public n(m m1)
    {
        a = m1;
        super("Picture Reaper");
        setPriority(10);
        setDaemon(true);
    }

    public final void run()
    {
        m.b().a("Reaper started", new Object[0]);
_L2:
        if (a.c && a.b.size() <= 0)
        {
            break MISSING_BLOCK_LABEL_125;
        }
        o o1 = (o)a.a.remove();
        if (o1 != null)
        {
            o1.a.e();
            m.b().a("Recycled %s, total %d", new Object[] {
                m.a(o1.a), Integer.valueOf(o1.b.b.size() - 1)
            });
            o1.clear();
            a.b.remove(o1);
        }
        continue; /* Loop/switch isn't completed */
        return;
        Exception exception;
        exception;
        if (true) goto _L2; else goto _L1
_L1:
    }
}
