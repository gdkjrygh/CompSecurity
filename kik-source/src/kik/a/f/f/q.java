// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.f.f;

import kik.a.f.n;
import kik.a.f.o;

// Referenced classes of package kik.a.f.f:
//            y

public final class q extends y
{

    private String a;

    public q(String s)
    {
        super(null, "set");
        a = s;
        b(10000L);
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
                    if (!n1.a("deleted"))
                    {
                        break label0;
                    }
                    c(202);
                }
                return;
            }
            if (n1.a("not-member"))
            {
                c(201);
                return;
            }
            if (n1.a("invalid"))
            {
                c(104);
                a(n1.nextText());
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
        o1.a("jid", a);
        o1.a("l");
        o1.b("l");
        o1.b("g");
        o1.b("query");
    }

    public final String d()
    {
        return a;
    }
}
