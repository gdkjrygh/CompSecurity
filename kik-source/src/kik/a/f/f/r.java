// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.f.f;

import kik.a.f.n;
import kik.a.f.o;

// Referenced classes of package kik.a.f.f:
//            y

public final class r extends y
{

    private String a;
    private String b;
    private boolean i;
    private boolean j;

    private r(String s, String s1, boolean flag, boolean flag1)
    {
        super(null, "set");
        a = s;
        b = s1;
        i = flag;
        j = flag1;
    }

    public static r a(String s, String s1)
    {
        return new r(s, s1, true, false);
    }

    public static r b(String s, String s1)
    {
        return new r(s, s1, true, true);
    }

    public static r c(String s, String s1)
    {
        return new r(s, s1, false, false);
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
            if (n1.a("not-authorized"))
            {
                c(401);
            } else
            if (n1.a("bad-request"))
            {
                c(4000);
            } else
            if (n1.a("not-allowed"))
            {
                c(405);
            } else
            if (n1.a("user-is-admin"))
            {
                if (d())
                {
                    c(4006);
                } else
                if (e())
                {
                    c(4005);
                } else
                {
                    c(4000);
                }
                a(n1.nextText());
            } else
            if (n1.a("not-admin"))
            {
                if (d())
                {
                    c(4002);
                } else
                if (e())
                {
                    c(4003);
                } else
                if (f())
                {
                    c(4004);
                } else
                {
                    c(4000);
                }
                a(n1.nextText());
            } else
            if (n1.a("banlist-full"))
            {
                c(4001);
                a(n1.nextText());
            }
            n1.next();
        }
    }

    protected final void b(o o1)
    {
        o1.a("query");
        o1.a("xmlns", "kik:groups:admin");
        o1.a("g");
        o1.a("jid", b);
        if (j ^ i)
        {
            o1.a("m");
            o1.a("r", "1");
            o1.c(a);
            o1.b("m");
        } else
        {
            o1.a("b");
            if (!j && !i)
            {
                o1.a("r", "1");
            }
            o1.c(a);
            o1.b("b");
        }
        o1.b("g");
        o1.b("query");
    }

    public final boolean d()
    {
        return j && i;
    }

    public final boolean e()
    {
        return !j && i;
    }

    public final boolean f()
    {
        return !j && !i;
    }
}
