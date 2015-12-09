// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.activity.ui;

import android.content.Context;
import android.content.Intent;
import com.fitbit.e.a;
import java.util.UUID;

// Referenced classes of package com.fitbit.activity.ui:
//            f

class b
    implements Runnable
{

    final Intent a;
    final UUID b;
    final f c;

    public void run()
    {
        boolean flag = c.h();
        if (flag)
        {
            if (c.h())
            {
                com.fitbit.e.a.a("GraphDataDownloader", "Task successfully canceled", new Object[0]);
            }
            f.f(c);
            com.fitbit.activity.ui.f.a(c, true);
            return;
        }
        f.g(c);
        flag = c.h();
        if (flag)
        {
            if (c.h())
            {
                com.fitbit.e.a.a("GraphDataDownloader", "Task successfully canceled", new Object[0]);
            }
            f.f(c);
            com.fitbit.activity.ui.f.a(c, true);
            return;
        }
        f.e(c);
        flag = c.h();
        if (flag)
        {
            if (c.h())
            {
                com.fitbit.e.a.a("GraphDataDownloader", "Task successfully canceled", new Object[0]);
            }
            f.f(c);
            com.fitbit.activity.ui.f.a(c, true);
            return;
        }
        f.h(c);
        if (a == null)
        {
            break MISSING_BLOCK_LABEL_551;
        }
        flag = c.h();
        if (flag)
        {
            if (c.h())
            {
                com.fitbit.e.a.a("GraphDataDownloader", "Task successfully canceled", new Object[0]);
            }
            f.f(c);
            com.fitbit.activity.ui.f.a(c, true);
            return;
        }
        f.b(c, b);
        f.i(c);
        a.putExtra("com.fitbit.util.service.DispatcherService.GUID", b);
        if (f.b(c) != null)
        {
            break MISSING_BLOCK_LABEL_316;
        }
        f.j(c);
        if (c.h())
        {
            com.fitbit.e.a.a("GraphDataDownloader", "Task successfully canceled", new Object[0]);
        }
        f.f(c);
        com.fitbit.activity.ui.f.a(c, true);
        return;
        f.k(c).startService(a);
        Object obj = f.l(c);
        obj;
        JVM INSTR monitorenter ;
        flag = c.h();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_400;
        }
        f.j(c);
        obj;
        JVM INSTR monitorexit ;
        if (c.h())
        {
            com.fitbit.e.a.a("GraphDataDownloader", "Task successfully canceled", new Object[0]);
        }
        f.f(c);
        com.fitbit.activity.ui.f.a(c, true);
        return;
        f.l(c).wait(0x2bf20L);
        f.j(c);
_L1:
        obj;
        JVM INSTR monitorexit ;
        flag = c.h();
        if (flag)
        {
            if (c.h())
            {
                com.fitbit.e.a.a("GraphDataDownloader", "Task successfully canceled", new Object[0]);
            }
            f.f(c);
            com.fitbit.activity.ui.f.a(c, true);
            return;
        }
        break MISSING_BLOCK_LABEL_544;
        Object obj1;
        obj1;
        com.fitbit.e.a.a("GraphDataDownloader", ((Throwable) (obj1)));
        f.j(c);
          goto _L1
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        Exception exception;
        exception;
        if (c.h())
        {
            com.fitbit.e.a.a("GraphDataDownloader", "Task successfully canceled", new Object[0]);
        }
        f.f(c);
        com.fitbit.activity.ui.f.a(c, true);
        throw exception;
        obj1;
        f.j(c);
        throw obj1;
        f.e(c);
        flag = c.h();
        if (flag)
        {
            if (c.h())
            {
                com.fitbit.e.a.a("GraphDataDownloader", "Task successfully canceled", new Object[0]);
            }
            f.f(c);
            com.fitbit.activity.ui.f.a(c, true);
            return;
        }
        if (c.h())
        {
            com.fitbit.e.a.a("GraphDataDownloader", "Task successfully canceled", new Object[0]);
        }
        f.f(c);
        com.fitbit.activity.ui.f.a(c, true);
        return;
    }

    ion(f f1, Intent intent, UUID uuid)
    {
        c = f1;
        a = intent;
        b = uuid;
        super();
    }
}
