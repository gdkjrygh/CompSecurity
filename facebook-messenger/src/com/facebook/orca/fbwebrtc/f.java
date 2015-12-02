// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.fbwebrtc;

import com.facebook.debug.log.b;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

// Referenced classes of package com.facebook.orca.fbwebrtc:
//            g

public class f
{

    private static final Class a = com/facebook/orca/fbwebrtc/f;
    private Queue b;

    public f()
    {
        b = new LinkedList();
    }

    private void b()
    {
        if (b.size() > 0)
        {
            g g1;
            for (Iterator iterator = b.iterator(); iterator.hasNext(); com.facebook.debug.log.b.a(a, "clear message from peer: %d, callId=%d, msgId=%d", new Object[] {
    Long.valueOf(g1.a), Long.valueOf(g1.b), Long.valueOf(g1.c)
}))
            {
                g1 = (g)iterator.next();
            }

            b.clear();
        }
    }

    public void a(long l, long l1)
    {
        this;
        JVM INSTR monitorenter ;
        g g1 = (g)b.peek();
        if (g1 == null)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        if (g1.a == l && g1.b == l1)
        {
            b();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void a(g g1)
    {
        this;
        JVM INSTR monitorenter ;
        b();
        b.add(g1);
        this;
        JVM INSTR monitorexit ;
        return;
        g1;
        throw g1;
    }

    public g[] a()
    {
        this;
        JVM INSTR monitorenter ;
        if (b.size() != 0) goto _L2; else goto _L1
_L1:
        g ag[] = new g[0];
_L4:
        this;
        JVM INSTR monitorexit ;
        return ag;
_L2:
        ag = (g[])b.toArray(new g[0]);
        b.clear();
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public boolean b(g g1)
    {
        this;
        JVM INSTR monitorenter ;
        int i = b.size();
        if (i != 0) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        g g2 = (g)b.peek();
        if (g2.a != g1.a || g2.b != g1.b)
        {
            break MISSING_BLOCK_LABEL_86;
        }
        b.offer(g1);
        flag = true;
        continue; /* Loop/switch isn't completed */
        g1;
        throw g1;
        flag = false;
        if (true) goto _L4; else goto _L3
_L3:
    }

}
