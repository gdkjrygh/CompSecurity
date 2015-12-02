// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.executors;

import com.google.common.a.hq;
import java.util.Queue;
import java.util.concurrent.Executor;

// Referenced classes of package com.facebook.common.executors:
//            u, y, v

public class w
    implements u
{

    private static final Class a = com/facebook/common/executors/w;
    private final Executor b;
    private final Queue c[];
    private final y d = new y(this, null);
    private boolean e;
    private int f;

    public w(Executor executor)
    {
        int i = 0;
        super();
        e = false;
        b = executor;
        int j = v.values().length;
        c = new Queue[j];
        for (; i < j; i++)
        {
            c[i] = hq.b();
        }

        f = j;
    }

    static Runnable a(w w1)
    {
        return w1.b();
    }

    static boolean a(w w1, boolean flag)
    {
        w1.e = flag;
        return flag;
    }

    private Runnable b()
    {
        this;
        JVM INSTR monitorenter ;
        int i = 0;
_L7:
        if (i >= f) goto _L2; else goto _L1
_L1:
        Runnable runnable = (Runnable)c[i].poll();
        if (runnable == null) goto _L4; else goto _L3
_L3:
        this;
        JVM INSTR monitorexit ;
        return runnable;
_L4:
        i++;
        continue; /* Loop/switch isn't completed */
_L2:
        runnable = null;
        if (true) goto _L3; else goto _L5
_L5:
        Exception exception;
        exception;
        throw exception;
        if (true) goto _L7; else goto _L6
_L6:
    }

    static Executor b(w w1)
    {
        return w1.b;
    }

    private void c()
    {
        this;
        JVM INSTR monitorenter ;
        if (!e && !a())
        {
            e = true;
            b.execute(d);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void a(Runnable runnable, v v1)
    {
        this;
        JVM INSTR monitorenter ;
        c[v1.ordinal()].offer(runnable);
        c();
        this;
        JVM INSTR monitorexit ;
        return;
        runnable;
        throw runnable;
    }

    public boolean a()
    {
        boolean flag = false;
        this;
        JVM INSTR monitorenter ;
        int i = 0;
_L7:
        if (i >= f) goto _L2; else goto _L1
_L1:
        boolean flag1 = c[i].isEmpty();
        if (flag1) goto _L4; else goto _L3
_L3:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L4:
        i++;
        continue; /* Loop/switch isn't completed */
_L2:
        flag = true;
        if (true) goto _L3; else goto _L5
_L5:
        Exception exception;
        exception;
        throw exception;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public void execute(Runnable runnable)
    {
        this;
        JVM INSTR monitorenter ;
        a(runnable, v.NORMAL);
        this;
        JVM INSTR monitorexit ;
        return;
        runnable;
        throw runnable;
    }

}
