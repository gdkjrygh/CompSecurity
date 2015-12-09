// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.androidannotations.api;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

// Referenced classes of package org.androidannotations.api:
//            b, c, d

public class a
{

    public static final Executor a;
    public static final d b;
    private static Executor c;
    private static d d;
    private static final List e = new ArrayList();
    private static final ThreadLocal f = new ThreadLocal();

    private a()
    {
    }

    static ThreadLocal a()
    {
        return f;
    }

    static c a(String s)
    {
        int j = e.size();
        for (int i = 0; i < j; i++)
        {
            if (s.equals(c.access$000((c)e.get(i))))
            {
                return (c)e.remove(i);
            }
        }

        return null;
    }

    public static void a(c c1)
    {
        Object obj = null;
        org/androidannotations/api/a;
        JVM INSTR monitorenter ;
        if (c.access$000(c1) == null) goto _L2; else goto _L1
_L1:
        String s;
        Iterator iterator;
        s = c.access$000(c1);
        iterator = e.iterator();
_L6:
        if (!iterator.hasNext()) goto _L4; else goto _L3
_L3:
        c c2 = (c)iterator.next();
        if (!c.access$100(c2) || !s.equals(c.access$000(c2))) goto _L6; else goto _L5
_L5:
        int i = 1;
          goto _L7
_L2:
        c.access$102(c1, true);
        i = c.access$200(c1);
        if (i <= 0) goto _L9; else goto _L8
_L8:
        if (!(c instanceof ScheduledExecutorService))
        {
            throw new IllegalArgumentException("The executor set does not support scheduling");
        }
          goto _L10
        c1;
        org/androidannotations/api/a;
        JVM INSTR monitorexit ;
        throw c1;
_L4:
        i = 0;
          goto _L7
_L10:
        obj = ((ScheduledExecutorService)c).schedule(c1, i, TimeUnit.MILLISECONDS);
_L11:
        if (c.access$300(c1) != null || c.access$000(c1) != null)
        {
            c.access$402(c1, ((java.util.concurrent.Future) (obj)));
            e.add(c1);
        }
        org/androidannotations/api/a;
        JVM INSTR monitorexit ;
        return;
_L9:
        if (c instanceof ExecutorService)
        {
            obj = ((ExecutorService)c).submit(c1);
            continue; /* Loop/switch isn't completed */
        }
        c.execute(c1);
        obj = null;
        if (true) goto _L11; else goto _L7
_L7:
        if (i != 0) goto _L11; else goto _L2
    }

    static List b()
    {
        return e;
    }

    static 
    {
        Object obj = Executors.newScheduledThreadPool(Runtime.getRuntime().availableProcessors() * 2);
        a = ((Executor) (obj));
        c = ((Executor) (obj));
        obj = new b();
        b = ((d) (obj));
        d = ((d) (obj));
    }
}
