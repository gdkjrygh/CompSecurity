// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

// Referenced classes of package com.google.android.gms.internal:
//            hm

public class hn
    implements hm
{

    protected int a;
    protected final BlockingQueue b = new LinkedBlockingQueue();
    protected Object c;
    private final Object d = new Object();

    public hn()
    {
        a = 0;
    }

    public void a(hm.c c1, hm.a a1)
    {
        Object obj = d;
        obj;
        JVM INSTR monitorenter ;
        if (a != 1) goto _L2; else goto _L1
_L1:
        c1.zzc(c);
_L5:
        return;
_L2:
        if (a != -1) goto _L4; else goto _L3
_L3:
        a1.run();
          goto _L5
        c1;
        obj;
        JVM INSTR monitorexit ;
        throw c1;
_L4:
        if (a != 0) goto _L5; else goto _L6
_L6:
    /* block-local class not found */
    class a {}

        b.add(new a(c1, a1));
          goto _L5
    }

    public void a(Object obj)
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
        for (Iterator iterator = b.iterator(); iterator.hasNext(); ((a)iterator.next()).a.zzc(obj)) { }
        b.clear();
        obj1;
        JVM INSTR monitorexit ;
    }

    public void e()
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
        for (Iterator iterator = b.iterator(); iterator.hasNext(); ((a)iterator.next()).b.run()) { }
        b.clear();
        obj;
        JVM INSTR monitorexit ;
    }

    public int f()
    {
        return a;
    }
}
