// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.inject;

import javax.inject.Singleton;
import javax.inject.a;

// Referenced classes of package com.facebook.inject:
//            d, av, n

public class az extends d
{

    private final a a;
    private Object b;
    private boolean c;

    public az(a a1)
    {
        a = a1;
    }

    public Object b()
    {
        this;
        JVM INSTR monitorenter ;
        if (c)
        {
            break MISSING_BLOCK_LABEL_61;
        }
        com.facebook.inject.av.a().a(javax/inject/Singleton);
        Object obj;
        obj = (n)a(com/facebook/inject/n);
        ((n) (obj)).a();
        b = a.b();
        c = true;
        ((n) (obj)).b();
        com.facebook.inject.av.a().b(javax/inject/Singleton);
        obj = b;
        this;
        JVM INSTR monitorexit ;
        return obj;
        Exception exception1;
        exception1;
        ((n) (obj)).b();
        throw exception1;
        Exception exception;
        exception;
        com.facebook.inject.av.a().b(javax/inject/Singleton);
        throw exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
