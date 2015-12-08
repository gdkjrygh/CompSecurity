// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a.a.a;

import b.a.a.a.a.b.ai;
import b.a.a.a.a.c.o;
import b.a.a.a.a.c.p;
import b.a.a.a.a.c.z;

// Referenced classes of package b.a.a.a:
//            o, f, q, k, 
//            m

final class n extends p
{

    final b.a.a.a.o a;

    public n(b.a.a.a.o o1)
    {
        a = o1;
    }

    private ai a(String s)
    {
        s = new ai((new StringBuilder()).append(a.c()).append(".").append(s).toString(), "KitInitialization");
        s.a();
        return s;
    }

    public final int a()
    {
        return o.c;
    }

    protected final void b()
    {
        ai ai1;
        super.b();
        ai1 = a("onPreExecute");
        boolean flag = a.a();
        ai1.b();
        if (!flag)
        {
            i();
        }
        return;
        Object obj;
        obj;
        throw obj;
        obj;
        ai1.b();
        i();
        throw obj;
        obj;
        f.c().c("Fabric", "Failure onPreExecute()", ((Throwable) (obj)));
        ai1.b();
        i();
        return;
    }

    protected final void c()
    {
        a.e.a();
    }

    protected final void d()
    {
        m m1 = new m((new StringBuilder()).append(a.c()).append(" Initialization was cancelled").toString());
        a.e.a(m1);
    }

    protected final Object e()
    {
        ai ai1 = a("doInBackground");
        Object obj = null;
        if (!h())
        {
            obj = a.t();
        }
        ai1.b();
        return obj;
    }
}
