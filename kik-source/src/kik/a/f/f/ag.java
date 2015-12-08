// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.f.f;

import kik.a.f.n;
import kik.a.f.o;

// Referenced classes of package kik.a.f.f:
//            y

public final class ag extends y
{

    private String a;
    private String b;

    public ag(String s, String s1)
    {
        super(null, "set");
        a = s;
        b = s1;
    }

    protected final void a(n n1)
    {
    }

    protected final void b(n n1)
    {
        do
        {
label0:
            {
                if (!n1.b("iq"))
                {
                    if (!n1.a("not-authorized"))
                    {
                        break label0;
                    }
                    c(401);
                }
                return;
            }
            if (n1.a("bad-request"))
            {
                c(400);
                return;
            }
            if (n1.a("not-member"))
            {
                c(402);
                return;
            }
            n1.next();
        } while (true);
    }

    protected final void b(o o1)
    {
        o1.a("query");
        o1.a("xmlns", "kik:groups:admin");
        o1.a("g");
        o1.a("jid", b);
        o1.a("m");
        o1.a("a", "1");
        o1.c(a);
        o1.b("m");
        o1.b("g");
        o1.b("query");
    }

    public final String d()
    {
        return a;
    }

    public final String e()
    {
        return b;
    }
}
