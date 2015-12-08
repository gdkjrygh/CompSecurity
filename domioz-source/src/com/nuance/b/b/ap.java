// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.b;

import com.nuance.b.c.b;
import com.nuance.b.c.i;

abstract class ap extends b
{

    public ap()
    {
    }

    public ap(long l)
    {
        super(l);
    }

    public final void a()
    {
        if (d() == i.a)
        {
            a(true);
            return;
        } else
        {
            throw new IllegalStateException("Trying to call setInProgess on a completed deferred.");
        }
    }

    public final void a(Object obj)
    {
        this;
        JVM INSTR monitorenter ;
        if (d() == i.a)
        {
            a(false);
        }
        super.a(obj);
        this;
        JVM INSTR monitorexit ;
        return;
        obj;
        throw obj;
    }

    protected abstract void a(boolean flag);

    public final void b(Object obj)
    {
        this;
        JVM INSTR monitorenter ;
        if (d() == i.a)
        {
            a(false);
        }
        super.b(obj);
        this;
        JVM INSTR monitorexit ;
        return;
        obj;
        throw obj;
    }
}
