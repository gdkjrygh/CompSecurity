// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.f.f;

import kik.a.f.n;
import kik.a.f.o;

// Referenced classes of package kik.a.f.f:
//            y, z

public final class k extends y
{

    private String a;

    public k(String s)
    {
        super(null, "set");
        a = s;
    }

    protected final void a(n n1)
    {
    }

    public final boolean a(z z)
    {
        return (z instanceof k) && a.equals(((k)z).a);
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
        o1.a("ack");
        o1.b("ack");
        o1.b("g");
        o1.b("query");
    }

    public final String d()
    {
        return a;
    }
}
