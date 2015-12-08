// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a.a.a.a.c;

import java.util.Collection;
import java.util.concurrent.Executor;

// Referenced classes of package b.a.a.a.a.c:
//            a, f, n, q, 
//            o, i, k

public abstract class j extends b.a.a.a.a.c.a
    implements f, n, q
{
    private static final class a
        implements Executor
    {

        private final Executor a;
        private final j b;

        static j a(a a1)
        {
            return a1.b;
        }

        public final void execute(Runnable runnable)
        {
            a.execute(new k(this, runnable));
        }

        public a(Executor executor, j j1)
        {
            a = executor;
            b = j1;
        }
    }


    private final o a = new o();

    public j()
    {
    }

    public int a()
    {
        return ((n)a).a();
    }

    public final void a(q q1)
    {
        if (super.f != a.d.a)
        {
            throw new IllegalStateException("Must not add Dependency after task is running");
        } else
        {
            ((f)(n)a).a(q1);
            return;
        }
    }

    public final volatile void a(Object obj)
    {
        a((q)obj);
    }

    public final void a(Throwable throwable)
    {
        ((q)(n)a).a(throwable);
    }

    public final void a(boolean flag)
    {
        ((q)(n)a).a(flag);
    }

    public int compareTo(Object obj)
    {
        return i.a(this, obj);
    }

    public final Collection f()
    {
        return ((f)(n)a).f();
    }

    public final boolean g()
    {
        return ((f)(n)a).g();
    }

    public final boolean h()
    {
        return ((q)(n)a).h();
    }
}
