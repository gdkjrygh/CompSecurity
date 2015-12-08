// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a.a.a;

import b.a.a.a.a.b.A;
import b.a.a.a.a.c.a;
import b.a.a.a.a.c.i;
import b.a.a.a.a.c.j;
import b.a.a.a.a.c.r;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package b.a.a.a:
//            l, d, i, j

public final class k extends j
{

    final l a;

    public k(l l1)
    {
        a = l1;
    }

    private A a(String s)
    {
        s = new A((new StringBuilder()).append(a.b()).append(".").append(s).toString(), "KitInitialization");
        s.a();
        return s;
    }

    public final int a()
    {
        return i.c;
    }

    protected final void b()
    {
        A a1;
        super.b();
        a1 = a("onPreExecute");
        boolean flag = a.e();
        a1.b();
        if (!flag)
        {
            f_();
        }
        return;
        Object obj;
        obj;
        throw obj;
        obj;
        a1.b();
        f_();
        throw obj;
        obj;
        b.a.a.a.d.a();
        a1.b();
        f_();
        return;
    }

    protected final void c()
    {
        a.o.a();
    }

    protected final void d()
    {
        b.a.a.a.j j1 = new b.a.a.a.j((new StringBuilder()).append(a.b()).append(" Initialization was cancelled").toString());
        a.o.a(j1);
    }

    protected final Object e()
    {
        A a1 = a("doInBackground");
        Object obj = null;
        if (!super.g.get())
        {
            obj = a.d();
        }
        a1.b();
        return obj;
    }
}
