// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a.a.a.a.c;

import java.util.Collection;
import java.util.concurrent.ExecutorService;

// Referenced classes of package a.a.a.a.a.c:
//            a, l, u, y, 
//            v, j, q, o

public abstract class p extends a
    implements l, u, y
{

    private final v a = new v();

    public p()
    {
    }

    public int a()
    {
        return ((u)a).a();
    }

    public final void a(y y1)
    {
        if (s_() != j.a)
        {
            throw new IllegalStateException("Must not add Dependency after task is running");
        } else
        {
            ((l)(u)a).a(y1);
            return;
        }
    }

    public final volatile void a(Object obj)
    {
        a((y)obj);
    }

    public final void a(Throwable throwable)
    {
        ((y)(u)a).a(throwable);
    }

    public final transient void a(ExecutorService executorservice, Object aobj[])
    {
        super.a(new q(executorservice, this), aobj);
    }

    public final void a(boolean flag)
    {
        ((y)(u)a).a(flag);
    }

    public int compareTo(Object obj)
    {
        return o.a(this, obj);
    }

    public final Collection f()
    {
        return ((l)(u)a).f();
    }

    public final boolean g()
    {
        return ((l)(u)a).g();
    }

    public final boolean j()
    {
        return ((y)(u)a).j();
    }
}
