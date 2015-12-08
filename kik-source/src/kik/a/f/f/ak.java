// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.f.f;

import java.util.ArrayList;
import java.util.List;
import kik.a.d.j;
import kik.a.f.n;
import kik.a.f.o;
import kik.a.f.t;

// Referenced classes of package kik.a.f.f:
//            y, z

public final class ak extends y
{

    private boolean a;
    private boolean b;
    private long i;
    private long j;
    private List k;
    private List l;
    private List m;
    private List n;
    private String o;

    public ak(long l1, boolean flag, String s)
    {
        super(null, "get");
        i = l1;
        a = flag;
        o = s;
        k = new ArrayList();
        l = new ArrayList();
        m = new ArrayList();
        n = new ArrayList();
    }

    public final void a(n n1)
    {
        n1.a(null, "query");
        n1.b("xmlns", "jabber:iq:roster");
        String s = n1.getAttributeValue(null, "ts");
        if (s == null)
        {
            j = i;
        } else
        {
            j = Long.parseLong(s);
        }
        if ("1".equals(n1.getAttributeValue(null, "more")))
        {
            b = true;
        }
        while (!n1.b("iq")) 
        {
            if (n1.a("item"))
            {
                k.add(t.a(n1, true));
            } else
            if (n1.a("remove"))
            {
                l.add(kik.a.d.j.a(n1.getAttributeValue(null, "jid")));
            } else
            if (n1.a("g"))
            {
                m.add(t.a(n1, o));
            } else
            if (n1.a("remove-group"))
            {
                n.add(kik.a.d.j.a(n1.getAttributeValue(null, "jid")));
            }
            n1.next();
        }
    }

    public final boolean a(z z)
    {
        return z instanceof ak;
    }

    protected final void b(o o1)
    {
        o1.e("", "jabber:iq:roster");
        o1.c("jabber:iq:roster", "query");
        o1.a("p", "8");
        if (i > 0L)
        {
            o1.a("ts", (new StringBuilder()).append(i).toString());
        }
        if (a)
        {
            String s;
            if (a)
            {
                s = "1";
            } else
            {
                s = "0";
            }
            o1.a("b", s);
        }
        o1.d("jabber:iq:roster", "query");
    }

    public final List d()
    {
        return k;
    }

    public final List e()
    {
        return l;
    }

    public final List f()
    {
        return m;
    }

    public final List g()
    {
        return n;
    }

    public final boolean n()
    {
        return b;
    }

    public final long o()
    {
        return j;
    }
}
