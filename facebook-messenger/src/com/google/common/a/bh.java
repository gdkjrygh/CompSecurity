// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import com.google.common.base.Function;
import java.lang.ref.ReferenceQueue;
import java.util.concurrent.ExecutionException;

// Referenced classes of package com.google.common.a:
//            dd, bj, be, bd, 
//            cm

final class bh
    implements dd
{

    final Function a;
    volatile dd b;

    public bh(Function function)
    {
        b = bj.g();
        a = function;
    }

    public cm a()
    {
        return null;
    }

    public dd a(ReferenceQueue referencequeue, cm cm)
    {
        return this;
    }

    Object a(Object obj, int i)
    {
        try
        {
            obj = a.apply(obj);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            b(new bd(((Throwable) (obj))));
            throw new ExecutionException(((Throwable) (obj)));
        }
        b(new be(obj));
        return obj;
    }

    public void a(dd dd1)
    {
        b(dd1);
    }

    void b(dd dd1)
    {
        this;
        JVM INSTR monitorenter ;
        if (b == bj.q)
        {
            b = dd1;
            notifyAll();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        dd1;
        this;
        JVM INSTR monitorexit ;
        throw dd1;
    }

    public boolean b()
    {
        return true;
    }

    public Object c()
    {
        if (b != bj.q) goto _L2; else goto _L1
_L1:
        boolean flag = false;
        boolean flag1 = false;
        this;
        JVM INSTR monitorenter ;
        flag = flag1;
_L5:
        dd dd1;
        dd dd2;
        dd1 = b;
        dd2 = bj.q;
        if (dd1 != dd2) goto _L4; else goto _L3
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

    public Object get()
    {
        return null;
    }
}
