// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.a.a.a.b.a;

import com.nuance.a.a.a.a.d.a.e;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

// Referenced classes of package com.nuance.a.a.a.b.a:
//            e

final class g
    implements InvocationHandler
{

    private com.nuance.a.a.a.b.a.e a;

    g(com.nuance.a.a.a.b.a.e e1)
    {
        a = e1;
        super();
    }

    public final Object invoke(Object obj, Method method, Object aobj[])
    {
        if (!method.getName().equals("onServiceConnected"))
        {
            break MISSING_BLOCK_LABEL_93;
        }
        if (e.c().c())
        {
            e.c();
        }
        obj = e.a(a);
        obj;
        JVM INSTR monitorenter ;
        if (e.b(a))
        {
            break MISSING_BLOCK_LABEL_79;
        }
        e.c(a);
        e.a(a, aobj[1]);
        e.a(a).notify();
_L2:
        break MISSING_BLOCK_LABEL_166;
        e.a(aobj[1]);
        if (true) goto _L2; else goto _L1
_L1:
        method;
        throw method;
        if (method.getName().equals("onServiceDisconnected"))
        {
            if (e.c().c())
            {
                e.c();
            }
            synchronized (e.a(a))
            {
                if (!e.b(a))
                {
                    e.c(a);
                    e.a(a).notify();
                }
            }
        }
        return null;
    }
}
