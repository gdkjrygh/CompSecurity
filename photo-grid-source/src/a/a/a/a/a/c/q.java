// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a.a.a.a.c;

import java.util.concurrent.Executor;

// Referenced classes of package a.a.a.a.a.c:
//            r, p

final class q
    implements Executor
{

    private final Executor a;
    private final p b;

    public q(Executor executor, p p)
    {
        a = executor;
        b = p;
    }

    static p a(q q1)
    {
        return q1.b;
    }

    public final void execute(Runnable runnable)
    {
        a.execute(new r(this, runnable));
    }
}
