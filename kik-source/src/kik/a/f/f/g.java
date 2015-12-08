// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.f.f;

import kik.a.d.k;
import kik.a.f.j;
import kik.a.f.n;
import kik.a.f.o;
import kik.a.f.t;

// Referenced classes of package kik.a.f.f:
//            y, z

public final class g extends y
{

    private int a;
    private String b;
    private String i;
    private k j;

    private g(j j1, String s)
    {
        super(j1, "get");
        a = -1;
        if (s == null)
        {
            i = null;
            a = 1;
            return;
        } else
        {
            b = s;
            a = 0;
            return;
        }
    }

    public static g a(j j1, String s)
    {
        return new g(j1, s);
    }

    protected final void a(n n1)
    {
        n1.a(null, "query");
        n1.b("xmlns", "kik:iq:friend");
        for (; !n1.b("query"); n1.next())
        {
            if (n1.a("item"))
            {
                j = t.a(n1, false);
            }
        }

    }

    public final boolean a(z z)
    {
        if ((z instanceof g) && a == ((g)z).a)
        {
            if (a == 0)
            {
                return b.equals(((g)z).b);
            }
            if (a == 1)
            {
                return i.equals(((g)z).i);
            }
        }
        return false;
    }

    protected final void b(n n1)
    {
        n1.a(null, "query");
        do
        {
label0:
            {
label1:
                {
                    if (!n1.b("iq"))
                    {
                        if (!n1.a("item-not-found"))
                        {
                            break label0;
                        }
                        if (a != 1)
                        {
                            break label1;
                        }
                        a(i);
                        c(202);
                    }
                    return;
                }
                if (a == 0)
                {
                    a(b);
                    c(201);
                    return;
                }
            }
            n1.next();
        } while (true);
    }

    protected final void b(o o1)
    {
        o1.a("query");
        o1.a("xmlns", "kik:iq:friend");
        o1.a("item");
        if (b == null) goto _L2; else goto _L1
_L1:
        o1.a("username", b);
_L4:
        o1.b("item");
        o1.b("query");
        return;
_L2:
        if (i != null)
        {
            o1.a("jid", i);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final k d()
    {
        return j;
    }
}
