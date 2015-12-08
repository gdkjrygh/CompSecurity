// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.f.f;

import kik.a.f.n;

// Referenced classes of package kik.a.f.f:
//            y

public final class o extends y
{

    private String a;
    private String b;

    public o(String s, String s1)
    {
        super(null, "set");
        a = s1;
        b = s;
    }

    protected final void a(n n1)
    {
        if (n1.a("query"))
        {
            n1.b("xmlns", "kik:groups:admin");
        }
    }

    protected final void b(n n1)
    {
_L2:
        if (n1.b("iq"))
        {
            break; /* Loop/switch isn't completed */
        }
        if (n1.a("banned"))
        {
            c(401);
        } else
        {
label0:
            {
                if (!n1.a("not-public"))
                {
                    break label0;
                }
                c(402);
            }
        }
_L4:
        n1.next();
        if (true) goto _L2; else goto _L1
        if (!n1.a("mismatch"))
        {
            continue; /* Loop/switch isn't completed */
        }
        c(403);
_L1:
        return;
        if (!n1.a("full")) goto _L4; else goto _L3
_L3:
        c(404);
        return;
    }

    protected final void b(kik.a.f.o o1)
    {
        o1.a("query");
        o1.a("xmlns", "kik:groups:admin");
        o1.a("g");
        o1.a("jid", a);
        o1.a("action", "join");
        o1.a("invite-code");
        o1.c(b);
        o1.b("invite-code");
        o1.b("g");
        o1.b("query");
    }
}
