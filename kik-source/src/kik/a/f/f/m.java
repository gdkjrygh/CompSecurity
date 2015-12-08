// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.f.f;

import kik.a.f.n;
import kik.a.f.o;

// Referenced classes of package kik.a.f.f:
//            y

public final class m extends y
{

    private String a;
    private String b;

    public m(String s, String s1)
    {
        super(null, "set");
        b = s1;
        a = s;
    }

    protected final void a(n n1)
    {
        n1.a(null, "query");
        n1.b("xmlns", "kik:groups:admin");
    }

    protected final void b(n n1)
    {
        while (!n1.b("iq")) 
        {
            if (n1.a("bad-request"))
            {
                c(4000);
            } else
            if (n1.a("restricted-name"))
            {
                c(403);
            } else
            if (n1.a("not-allowed"))
            {
                c(405);
            } else
            if (n1.a("not-admin"))
            {
                c(4001);
            }
            n1.next();
        }
    }

    protected final void b(o o1)
    {
        if (b == null || a == null)
        {
            return;
        } else
        {
            o1.a("query");
            o1.a("xmlns", "kik:groups:admin");
            o1.a("g");
            o1.a("jid", a);
            o1.b("n", b);
            o1.b("g");
            o1.b("query");
            return;
        }
    }
}
