// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.inject;

import android.app.Application;
import com.facebook.base.h;
import com.google.common.a.fi;
import javax.inject.Singleton;
import javax.inject.a;

// Referenced classes of package com.facebook.inject:
//            ThreadLocalScoped, av, n, aq, 
//            ContextScoped

public class p
    implements a
{

    private static final fi a = fi.a(javax/inject/Singleton, com/facebook/inject/ThreadLocalScoped);
    private final n b;
    private final a c;
    private Object d;

    public p(n n1, a a1)
    {
        b = n1;
        c = a1;
    }

    public Object b()
    {
        Object obj;
        av av1;
        av1 = com.facebook.inject.av.a();
        obj = b.getContext();
        if (obj == null)
        {
            throw new aq("Called context scoped provider outside of context scope");
        }
        if (!(obj instanceof Application))
        {
            av1.a(a, com/facebook/inject/ContextScoped);
        }
        av1.a(com/facebook/inject/ContextScoped);
        if (!(obj instanceof Application))
        {
            break MISSING_BLOCK_LABEL_106;
        }
        this;
        JVM INSTR monitorenter ;
        if (d == null)
        {
            d = c.b();
        }
        obj = d;
        this;
        JVM INSTR monitorexit ;
        av1.b(com/facebook/inject/ContextScoped);
        return obj;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        obj;
        av1.b(com/facebook/inject/ContextScoped);
        throw obj;
        if (!(obj instanceof h))
        {
            throw new aq("Context must support PropertyBag interface");
        }
        h h1 = (h)obj;
        this;
        JVM INSTR monitorenter ;
        Object obj1 = h1.a(this);
        obj = obj1;
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_165;
        }
        obj = c.b();
        h1.a(this, obj);
        this;
        JVM INSTR monitorexit ;
        av1.b(com/facebook/inject/ContextScoped);
        return obj;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

}
