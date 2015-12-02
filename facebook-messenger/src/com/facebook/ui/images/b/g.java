// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ui.images.b;

import com.facebook.ui.images.cache.d;
import com.google.common.d.a.h;
import java.util.concurrent.ConcurrentMap;

// Referenced classes of package com.facebook.ui.images.b:
//            e, r

class g
    implements h
{

    final d a;
    final e b;

    g(e e1, d d)
    {
        b = e1;
        a = d;
        super();
    }

    public void a(r r1)
    {
        synchronized (e.b(b))
        {
            e.c(b).remove(a);
        }
        return;
        exception;
        r1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public volatile void a(Object obj)
    {
        a((r)obj);
    }

    public void a(Throwable throwable)
    {
        synchronized (e.b(b))
        {
            e.c(b).remove(a);
        }
        return;
        exception;
        throwable;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
