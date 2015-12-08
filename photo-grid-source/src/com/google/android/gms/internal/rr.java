// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

// Referenced classes of package com.google.android.gms.internal:
//            rn, rq, ro, rs

public class rr
    implements rn
{

    protected int a;
    protected final BlockingQueue b = new LinkedBlockingQueue();
    protected Object c;
    private final Object d = new Object();

    public rr()
    {
        a = 0;
    }

    public final void a(rq rq1, ro ro1)
    {
        Object obj = d;
        obj;
        JVM INSTR monitorenter ;
        if (a != 1) goto _L2; else goto _L1
_L1:
        rq1.a(c);
_L5:
        return;
_L2:
        if (a != -1) goto _L4; else goto _L3
_L3:
        ro1.a();
          goto _L5
        rq1;
        obj;
        JVM INSTR monitorexit ;
        throw rq1;
_L4:
        if (a != 0) goto _L5; else goto _L6
_L6:
        b.add(new rs(this, rq1, ro1));
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
        for (Iterator iterator = b.iterator(); iterator.hasNext(); ((rs)iterator.next()).a.a(obj)) { }
        b.clear();
        obj1;
        JVM INSTR monitorexit ;
    }

    public final void d()
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
        for (Iterator iterator = b.iterator(); iterator.hasNext(); ((rs)iterator.next()).b.a()) { }
        b.clear();
        obj;
        JVM INSTR monitorexit ;
    }

    public final int e()
    {
        return a;
    }
}
