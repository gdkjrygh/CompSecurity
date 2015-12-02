// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.server;

import com.facebook.fbservice.c.b;
import com.facebook.fbservice.service.ServiceException;
import com.facebook.orca.threads.ThreadsCollection;
import com.google.common.a.es;
import java.util.List;

// Referenced classes of package com.facebook.orca.server:
//            FetchGroupThreadsResult

public class m
{

    private b a;
    private ThreadsCollection b;
    private List c;
    private List d;
    private List e;
    private boolean f;
    private long g;
    private long h;
    private ServiceException i;

    m()
    {
        c = es.d();
        d = es.d();
        e = es.d();
        g = -1L;
        h = -1L;
    }

    public b a()
    {
        return a;
    }

    public m a(long l)
    {
        g = l;
        return this;
    }

    public m a(b b1)
    {
        a = b1;
        return this;
    }

    public m a(ThreadsCollection threadscollection)
    {
        b = threadscollection;
        return this;
    }

    public m a(es es1)
    {
        c = es1;
        return this;
    }

    public m a(List list)
    {
        d = list;
        return this;
    }

    public m a(boolean flag)
    {
        f = flag;
        return this;
    }

    public m b(long l)
    {
        h = l;
        return this;
    }

    public m b(List list)
    {
        e = list;
        return this;
    }

    public ThreadsCollection b()
    {
        return b;
    }

    public List c()
    {
        return c;
    }

    public List d()
    {
        return d;
    }

    public List e()
    {
        return e;
    }

    public boolean f()
    {
        return f;
    }

    public long g()
    {
        return g;
    }

    public long h()
    {
        return h;
    }

    public ServiceException i()
    {
        return i;
    }

    public FetchGroupThreadsResult j()
    {
        return new FetchGroupThreadsResult(this);
    }
}
