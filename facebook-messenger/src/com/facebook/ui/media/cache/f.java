// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ui.media.cache;

import com.facebook.cache.l;
import com.facebook.cache.t;

// Referenced classes of package com.facebook.ui.media.cache:
//            a

class f
    implements t
{

    final a a;
    private long b;

    f(a a1)
    {
        a = a1;
        super();
        b = 0L;
    }

    public void a(double d1)
    {
        synchronized (com.facebook.ui.media.cache.a.e(a))
        {
            com.facebook.ui.media.cache.a.a(a, -1L);
            com.facebook.ui.media.cache.a.f(a);
            long l1 = com.facebook.ui.media.cache.a.c(a);
            long l2 = (long)((double)com.facebook.ui.media.cache.a.c(a) * d1);
            com.facebook.ui.media.cache.a.b(a, l1 - l2);
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public l b()
    {
        return l.FILE;
    }

    public long c()
    {
        return com.facebook.ui.media.cache.a.c(a);
    }

    public long d()
    {
        return (long)com.facebook.ui.media.cache.a.d(a).length;
    }

    public String e()
    {
        return "DiskCache.SyndicatedFileCache";
    }

    public long f()
    {
        return b;
    }
}
