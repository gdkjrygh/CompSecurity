// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public final class akd
    implements ajy
{

    protected int a;
    protected final BlockingQueue b = new LinkedBlockingQueue();
    protected Object c;
    private final Object d = new Object();

    public akd()
    {
        a = 0;
    }

    public final void a()
    {
        Object obj = d;
        obj;
        JVM INSTR monitorenter ;
        if (a != 0)
        {
            throw new UnsupportedOperationException();
        }
        break MISSING_BLOCK_LABEL_27;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        a = -1;
        for (Iterator iterator = b.iterator(); iterator.hasNext(); ((ake)iterator.next()).b.a()) { }
        b.clear();
        obj;
        JVM INSTR monitorexit ;
    }

    public final void a(akc akc1, ajz ajz1)
    {
        Object obj = d;
        obj;
        JVM INSTR monitorenter ;
        if (a != 1) goto _L2; else goto _L1
_L1:
        akc1.a(c);
_L5:
        return;
_L2:
        if (a != -1) goto _L4; else goto _L3
_L3:
        ajz1.a();
          goto _L5
        akc1;
        obj;
        JVM INSTR monitorexit ;
        throw akc1;
_L4:
        if (a != 0) goto _L5; else goto _L6
_L6:
        b.add(new ake(this, akc1, ajz1));
          goto _L5
    }

    public final void a(Object obj)
    {
        Object obj1 = d;
        obj1;
        JVM INSTR monitorenter ;
        if (a != 0)
        {
            throw new UnsupportedOperationException();
        }
        break MISSING_BLOCK_LABEL_27;
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
        c = obj;
        a = 1;
        for (Iterator iterator = b.iterator(); iterator.hasNext(); ((ake)iterator.next()).a.a(obj)) { }
        b.clear();
        obj1;
        JVM INSTR monitorexit ;
    }

    public final int b()
    {
        return a;
    }
}
