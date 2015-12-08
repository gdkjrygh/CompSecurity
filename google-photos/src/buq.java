// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.Executor;

public final class buq
    implements buz
{

    final Object a = new Object();
    int b;
    boolean c;
    bus d;
    private final long e;
    private final Executor f;
    private final long g[];
    private final Runnable h = new bur(this);

    public buq(Executor executor, bus bus1, int i, long l)
    {
        b = 0;
        c = false;
        f = (Executor)b.a(executor, "mainThreadExecutor", null);
        d = (bus)b.a(bus1, "updateUiListener", null);
        e = l;
        g = new long[i];
    }

    public final void a(int i, long l)
    {
        boolean flag = true;
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        Object obj1;
        int j;
        g[i] = l;
        obj1 = g;
        j = obj1.length;
        l = 0L;
        i = 0;
          goto _L1
_L7:
        i = (int)((100L * l) / e);
        if (i <= b) goto _L3; else goto _L2
_L2:
        b = i;
        if (c) goto _L3; else goto _L4
_L4:
        c = true;
        i = ((flag) ? 1 : 0);
_L5:
        obj;
        JVM INSTR monitorexit ;
        if (i != 0)
        {
            f.execute(h);
        }
        return;
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
_L3:
        i = 0;
        if (true) goto _L5; else goto _L1
_L1:
        while (i < j) 
        {
            l += obj1[i];
            i++;
        }
        if (true) goto _L7; else goto _L6
_L6:
    }
}
