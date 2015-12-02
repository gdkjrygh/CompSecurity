// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.a;

import com.facebook.auth.f.b;
import com.facebook.common.time.a;
import com.google.common.a.es;

// Referenced classes of package com.facebook.contacts.a:
//            a

public class d
    implements b, com.facebook.contacts.a.a
{

    private es a;
    private long b;
    private final a c;

    public d(a a1)
    {
        c = a1;
        b = 0L;
    }

    private void e()
    {
        this;
        JVM INSTR monitorenter ;
        if (c.a() - b > 0x36ee80L)
        {
            a = null;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void a()
    {
        a = null;
        b = 0L;
    }

    public void a(es es)
    {
        this;
        JVM INSTR monitorenter ;
        a = es;
        b = c.a();
        this;
        JVM INSTR monitorexit ;
        return;
        es;
        throw es;
    }

    public es b()
    {
        this;
        JVM INSTR monitorenter ;
        es es;
        e();
        es = a;
        this;
        JVM INSTR monitorexit ;
        return es;
        Exception exception;
        exception;
        throw exception;
    }

    public long c()
    {
        this;
        JVM INSTR monitorenter ;
        long l = b;
        this;
        JVM INSTR monitorexit ;
        return l;
        Exception exception;
        exception;
        throw exception;
    }

    public void d()
    {
        a();
    }
}
