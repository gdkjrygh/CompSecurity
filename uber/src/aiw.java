// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.Future;

public abstract class aiw
{

    private final Runnable a = new _cls1();
    private volatile Thread b;

    public aiw()
    {
    }

    static Thread a(aiw aiw1, Thread thread)
    {
        aiw1.b = thread;
        return thread;
    }

    public abstract void a();

    public abstract void b();

    public final Future e()
    {
        return ajb.a(a);
    }

    public final void f()
    {
        ajb.a(1, a);
    }

    public final void g()
    {
        b();
        if (b != null)
        {
            b.interrupt();
        }
    }

    /* member class not found */
    class _cls1 {}

}
