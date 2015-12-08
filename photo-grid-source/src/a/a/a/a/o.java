// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a.a.a;

import a.a.a.a.a.b.ai;
import a.a.a.a.a.c.p;
import a.a.a.a.a.c.z;

// Referenced classes of package a.a.a.a:
//            p, f, s, l, 
//            n

final class o extends p
{

    final a.a.a.a.p a;

    public o(a.a.a.a.p p1)
    {
        a = p1;
    }

    private ai a(String s1)
    {
        s1 = new ai((new StringBuilder()).append(a.b()).append(".").append(s1).toString(), "KitInitialization");
        s1.a();
        return s1;
    }

    public final int a()
    {
        return a.a.a.a.a.c.o.c;
    }

    protected final void b()
    {
        ai ai1;
        super.b();
        ai1 = a("onPreExecute");
        boolean flag = a.e_();
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
        f.d().b("Fabric", "Failure onPreExecute()", ((Throwable) (obj)));
        ai1.b();
        i();
        return;
    }

    protected final void c()
    {
        a.h.a();
    }

    protected final void d()
    {
        n n1 = new n((new StringBuilder()).append(a.b()).append(" Initialization was cancelled").toString());
        a.h.a(n1);
    }

    protected final Object e()
    {
        ai ai1 = a("doInBackground");
        Object obj = null;
        if (!h())
        {
            obj = a.d();
        }
        ai1.b();
        return obj;
    }
}
