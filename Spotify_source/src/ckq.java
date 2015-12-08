// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ckq
    implements ckm
{

    private final Object a = new Object();
    int b;
    private BlockingQueue c;
    private Object d;

    public ckq()
    {
        b = 0;
        c = new LinkedBlockingQueue();
    }

    public final void a(ckp ckp1, ckn ckn1)
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        if (b != 1) goto _L2; else goto _L1
_L1:
        ckp1.a(d);
_L5:
        return;
_L2:
        if (b != -1) goto _L4; else goto _L3
_L3:
        ckn1.a();
          goto _L5
        ckp1;
        obj;
        JVM INSTR monitorexit ;
        throw ckp1;
_L4:
        if (b != 0) goto _L5; else goto _L6
_L6:
        c.add(new ckr(ckp1, ckn1));
          goto _L5
    }

    public final void a(Object obj)
    {
        Object obj1 = a;
        obj1;
        JVM INSTR monitorenter ;
        if (b != 0)
        {
            throw new UnsupportedOperationException();
        }
        break MISSING_BLOCK_LABEL_27;
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
        d = obj;
        b = 1;
        for (Iterator iterator = c.iterator(); iterator.hasNext(); ((ckr)iterator.next()).a.a(obj)) { }
        c.clear();
        obj1;
        JVM INSTR monitorexit ;
    }

    public final void d()
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        if (b != 0)
        {
            throw new UnsupportedOperationException();
        }
        break MISSING_BLOCK_LABEL_27;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        b = -1;
        for (Iterator iterator = c.iterator(); iterator.hasNext(); ((ckr)iterator.next()).b.a()) { }
        c.clear();
        obj;
        JVM INSTR monitorexit ;
    }
}
