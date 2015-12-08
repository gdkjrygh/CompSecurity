// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a.a.a;

import b.a.a.a.a.b.aa;
import b.a.a.a.a.c.i;
import b.a.a.a.a.c.j;
import b.a.a.a.a.c.r;

// Referenced classes of package b.a.a.a:
//            l, d, o, i, 
//            j

final class k extends j
{

    final l a;

    public k(l l1)
    {
        a = l1;
    }

    private aa a(String s)
    {
        s = new aa((new StringBuilder()).append(a.b()).append(".").append(s).toString(), "KitInitialization");
        s.a();
        return s;
    }

    public final int a()
    {
        return i.c;
    }

    protected final void b()
    {
        aa aa1;
        super.b();
        aa1 = a("onPreExecute");
        boolean flag = a.a_();
        aa1.b();
        if (!flag)
        {
            i();
        }
        return;
        Object obj;
        obj;
        throw obj;
        obj;
        aa1.b();
        i();
        throw obj;
        obj;
        b.a.a.a.d.c().b("Fabric", "Failure onPreExecute()", ((Throwable) (obj)));
        aa1.b();
        i();
        return;
    }

    protected final void c()
    {
        a.h.a();
    }

    protected final void d()
    {
        b.a.a.a.j j1 = new b.a.a.a.j((new StringBuilder()).append(a.b()).append(" Initialization was cancelled").toString());
        a.h.a(j1);
    }

    protected final Object e()
    {
        aa aa1 = a("doInBackground");
        Object obj = null;
        if (!h())
        {
            obj = a.e();
        }
        aa1.b();
        return obj;
    }
}
