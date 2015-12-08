// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.f.a;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kik.a.f.n;
import org.d.a.b;

// Referenced classes of package kik.a.f.a:
//            h, g, e, d

public final class c
{

    private static final org.c.b c = org.c.c.a("KikChallengeExecutor");
    ExecutorService a;
    Map b;

    public c()
    {
        a = Executors.newCachedThreadPool();
        b = new HashMap();
    }

    public static g a(n n1)
    {
        h h1;
        String s;
        int i;
        if (!n1.a("stc"))
        {
            throw new b("Expected challenge");
        }
        s = n1.getAttributeValue(null, "id");
        i = n1.getDepth();
        h1 = null;
_L7:
        if (i >= n1.a()) goto _L2; else goto _L1
_L1:
        String s1;
        if (!n1.a("stp"))
        {
            continue; /* Loop/switch isn't completed */
        }
        s1 = n1.getAttributeValue(null, "type");
        if (!"wi".equals(s1)) goto _L4; else goto _L3
_L3:
        Object obj = new h(s);
_L5:
        h1 = ((h) (obj));
        if (obj != null)
        {
            ((g) (obj)).a(n1);
            h1 = ((h) (obj));
        }
        continue; /* Loop/switch isn't completed */
_L4:
        obj = h1;
        if ("hc".equals(s1))
        {
            obj = new e(s);
        }
        if (true) goto _L5; else goto _L2
_L2:
        return h1;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public final void a()
    {
        Map map = b;
        map;
        JVM INSTR monitorenter ;
        for (Iterator iterator = b.values().iterator(); iterator.hasNext(); ((g)iterator.next()).b()) { }
        break MISSING_BLOCK_LABEL_51;
        Exception exception;
        exception;
        map;
        JVM INSTR monitorexit ;
        throw exception;
        b.clear();
        map;
        JVM INSTR monitorexit ;
    }

    public final void a(g g1, Runnable runnable)
    {
        Map map = b;
        map;
        JVM INSTR monitorenter ;
        g g2 = (g)b.put(g1.c(), g1);
        if (g2 == null)
        {
            break MISSING_BLOCK_LABEL_36;
        }
        g2.b();
        map;
        JVM INSTR monitorexit ;
        a.execute(new d(this, g1, runnable));
        return;
        g1;
        map;
        JVM INSTR monitorexit ;
        throw g1;
    }

}
