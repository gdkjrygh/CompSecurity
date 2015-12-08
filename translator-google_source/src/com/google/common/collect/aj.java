// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.d;
import java.lang.ref.ReferenceQueue;
import java.util.concurrent.ExecutionException;

// Referenced classes of package com.google.common.collect:
//            cr, MapMakerInternalMap, ai, ah, 
//            cj

final class aj
    implements cr
{

    final d a;
    volatile cr b;

    public aj(d d1)
    {
        b = MapMakerInternalMap.unset();
        a = d1;
    }

    private void b(cr cr1)
    {
        this;
        JVM INSTR monitorenter ;
        if (b == MapMakerInternalMap.UNSET)
        {
            b = cr1;
            notifyAll();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        cr1;
        this;
        JVM INSTR monitorexit ;
        throw cr1;
    }

    public final cj a()
    {
        return null;
    }

    public final cr a(ReferenceQueue referencequeue, Object obj, cj cj)
    {
        return this;
    }

    final Object a(Object obj)
    {
        try
        {
            obj = a.apply(obj);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            b(new ah(((Throwable) (obj))));
            throw new ExecutionException(((Throwable) (obj)));
        }
        b(new ai(obj));
        return obj;
    }

    public final void a(cr cr1)
    {
        b(cr1);
    }

    public final boolean b()
    {
        return true;
    }

    public final Object c()
    {
        if (b != MapMakerInternalMap.UNSET) goto _L2; else goto _L1
_L1:
        boolean flag = false;
        boolean flag1 = false;
        this;
        JVM INSTR monitorenter ;
        flag = flag1;
_L5:
        cr cr1;
        cr cr2;
        cr1 = b;
        cr2 = MapMakerInternalMap.UNSET;
        if (cr1 != cr2) goto _L4; else goto _L3
_L3:
        Exception exception;
        try
        {
            wait();
        }
        catch (InterruptedException interruptedexception)
        {
            flag = true;
        }
        finally { }
        if (true) goto _L5; else goto _L4
_L4:
        this;
        JVM INSTR monitorexit ;
        if (flag)
        {
            Thread.currentThread().interrupt();
        }
_L2:
        return b.c();
        this;
        JVM INSTR monitorexit ;
        throw exception;
        exception;
        if (flag)
        {
            Thread.currentThread().interrupt();
        }
        throw exception;
    }

    public final Object get()
    {
        return null;
    }
}
