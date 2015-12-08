// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.TimeUnit;

public final class ckh
    implements ckk
{

    private final Object a;
    private final ckl b = new ckl();

    public ckh(Object obj)
    {
        a = obj;
        b.a();
    }

    public final void a(Runnable runnable)
    {
        b.a(runnable);
    }

    public final boolean cancel(boolean flag)
    {
        return false;
    }

    public final Object get()
    {
        return a;
    }

    public final Object get(long l, TimeUnit timeunit)
    {
        return a;
    }

    public final boolean isCancelled()
    {
        return false;
    }

    public final boolean isDone()
    {
        return true;
    }
}
