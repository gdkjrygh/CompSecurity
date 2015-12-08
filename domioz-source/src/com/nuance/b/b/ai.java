// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.b;

import com.nuance.b.c.b;
import com.nuance.b.c.i;

// Referenced classes of package com.nuance.b.b:
//            v

abstract class ai extends b
{

    private ai()
    {
    }

    ai(byte byte0)
    {
        this();
    }

    public final void b(Object obj)
    {
        this;
        JVM INSTR monitorenter ;
        synchronized (v.v())
        {
            if (d() == i.a && c(obj))
            {
                v.a(v.v());
            }
            super.b(obj);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        obj;
        v1;
        JVM INSTR monitorexit ;
        throw obj;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
    }

    protected abstract boolean c(Object obj);
}
