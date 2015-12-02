// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.inject;

import com.google.common.a.fi;
import javax.inject.Singleton;
import javax.inject.a;

// Referenced classes of package com.facebook.inject:
//            d, ContextScoped, bf, av, 
//            ThreadLocalScoped, bg, n

public class be extends d
{

    private static final fi a = fi.a(javax/inject/Singleton, com/facebook/inject/ContextScoped);
    private final a b;
    private ThreadLocal c;

    public be(a a1)
    {
        c = new bf(this);
        b = a1;
    }

    public Object b()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        bg bg1;
        obj = com.facebook.inject.av.a();
        ((av) (obj)).a(a, com/facebook/inject/ThreadLocalScoped);
        bg1 = (bg)c.get();
        if (com.facebook.inject.bg.a(bg1))
        {
            break MISSING_BLOCK_LABEL_83;
        }
        ((av) (obj)).a(com/facebook/inject/ThreadLocalScoped);
        n n1;
        n1 = (n)a(com/facebook/inject/n);
        n1.a();
        com.facebook.inject.bg.a(bg1, b.b());
        com.facebook.inject.bg.a(bg1, true);
        n1.b();
        ((av) (obj)).b(com/facebook/inject/ThreadLocalScoped);
        obj = bg.b(bg1);
        this;
        JVM INSTR monitorexit ;
        return obj;
        Exception exception2;
        exception2;
        n1.b();
        throw exception2;
        Exception exception1;
        exception1;
        ((av) (obj)).b(com/facebook/inject/ThreadLocalScoped);
        throw exception1;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

}
