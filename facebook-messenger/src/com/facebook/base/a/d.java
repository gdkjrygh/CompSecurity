// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.base.a;

import com.facebook.common.executors.a;
import com.google.common.a.kl;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.facebook.base.a:
//            e, f

public class d
{

    private final a a;
    private Set b;
    private boolean c;

    public d(a a1)
    {
        b = kl.a();
        a = a1;
    }

    static void a(d d1)
    {
        d1.e();
    }

    private void d()
    {
        a.b(new e(this));
    }

    private void e()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        obj = b;
        b = kl.a();
        this;
        JVM INSTR monitorexit ;
        for (obj = ((Set) (obj)).iterator(); ((Iterator) (obj)).hasNext(); ((f)((Iterator) (obj)).next()).a()) { }
        break MISSING_BLOCK_LABEL_52;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected void a()
    {
        this;
        JVM INSTR monitorenter ;
        c = true;
        notifyAll();
        this;
        JVM INSTR monitorexit ;
        d();
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void a(f f1)
    {
        a.a();
        this;
        JVM INSTR monitorenter ;
        boolean flag;
        b.add(f1);
        flag = c;
        this;
        JVM INSTR monitorexit ;
        if (flag)
        {
            d();
        }
        return;
        f1;
        this;
        JVM INSTR monitorexit ;
        throw f1;
    }

    public void b()
    {
        this;
        JVM INSTR monitorenter ;
_L1:
        boolean flag = c;
        if (flag)
        {
            break MISSING_BLOCK_LABEL_33;
        }
        wait();
          goto _L1
        Object obj;
        obj;
        throw new RuntimeException(((Throwable) (obj)));
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        this;
        JVM INSTR monitorexit ;
    }

    public boolean c()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = c;
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }
}
