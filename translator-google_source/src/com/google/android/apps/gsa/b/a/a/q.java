// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.gsa.b.a.a;

import com.google.android.apps.gsa.shared.exception.GsaIOException;
import com.google.android.apps.gsa.shared.io.a;
import com.google.android.apps.gsa.shared.io.d;
import com.google.common.base.p;
import com.google.common.util.concurrent.t;
import com.google.common.util.concurrent.u;
import java.util.ArrayDeque;
import java.util.Queue;

public final class q
    implements d
{

    public final Object a = new Object();
    public a b;
    private final Queue c = new ArrayDeque();
    private final Queue d = new ArrayDeque();

    public q()
    {
    }

    private void d()
    {
        for (; !c.isEmpty() && !d.isEmpty(); ((u)c.remove()).a(d.remove())) { }
        if (b != null)
        {
            for (; !c.isEmpty(); ((u)c.remove()).a(b)) { }
        }
        boolean flag;
        if (c.isEmpty() || d.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.b(flag);
    }

    public final t a()
    {
        u u1;
        synchronized (a)
        {
            u1 = u.a();
            c.add(u1);
            d();
        }
        return u1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void a(a a1)
    {
label0:
        {
            synchronized (a)
            {
                if (b == null)
                {
                    break label0;
                }
                a1.a();
            }
            return;
        }
        boolean flag;
        if (!c.isEmpty() && !d.isEmpty())
        {
            flag = false;
        } else
        {
            flag = true;
        }
        p.b(flag);
        if (a1.b != 1)
        {
            break MISSING_BLOCK_LABEL_88;
        }
        d.add(a1);
_L1:
        d();
        obj;
        JVM INSTR monitorexit ;
        return;
        a1;
        obj;
        JVM INSTR monitorexit ;
        throw a1;
        b = a1;
          goto _L1
    }

    public final int b()
    {
        return -1;
    }

    public final void c()
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        for (; !d.isEmpty(); ((a)d.remove()).a()) { }
        break MISSING_BLOCK_LABEL_42;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        b = new a(new GsaIOException(0x40026));
        d();
        obj;
        JVM INSTR monitorexit ;
    }
}
