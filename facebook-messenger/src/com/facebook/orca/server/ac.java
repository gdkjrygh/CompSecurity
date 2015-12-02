// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.server;

import com.facebook.fbservice.service.s;

// Referenced classes of package com.facebook.orca.server:
//            FetchThreadParams, ThreadCriteria

public class ac
{

    private ThreadCriteria a;
    private s b;
    private s c;
    private long d;
    private boolean e;
    private int f;
    private long g;

    public ac()
    {
        d = -1L;
        f = 50;
        g = -1L;
    }

    public ThreadCriteria a()
    {
        return a;
    }

    public ac a(int i)
    {
        f = i;
        return this;
    }

    public ac a(long l)
    {
        d = l;
        return this;
    }

    public ac a(s s)
    {
        b = s;
        return this;
    }

    public ac a(FetchThreadParams fetchthreadparams)
    {
        a = fetchthreadparams.a();
        b = fetchthreadparams.b();
        c = fetchthreadparams.c();
        e = fetchthreadparams.d();
        d = fetchthreadparams.e();
        f = fetchthreadparams.f();
        g = fetchthreadparams.g();
        return this;
    }

    public ac a(ThreadCriteria threadcriteria)
    {
        a = threadcriteria;
        return this;
    }

    public ac a(boolean flag)
    {
        e = flag;
        return this;
    }

    public s b()
    {
        return b;
    }

    public ac b(long l)
    {
        g = l;
        return this;
    }

    public ac b(s s)
    {
        c = s;
        return this;
    }

    public s c()
    {
        if (c == null)
        {
            return b;
        } else
        {
            return c;
        }
    }

    public boolean d()
    {
        return e;
    }

    public long e()
    {
        return d;
    }

    public int f()
    {
        return f;
    }

    public long g()
    {
        return g;
    }

    public FetchThreadParams h()
    {
        return new FetchThreadParams(this);
    }
}
