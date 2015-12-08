// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.f.f;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kik.a.f.n;
import kik.a.f.o;

// Referenced classes of package kik.a.f.f:
//            y

public final class l extends y
{

    private String a;
    private List b;

    public l(String s, List list)
    {
        super(null, "set");
        b = list;
        a = s;
    }

    protected final void a(n n1)
    {
    }

    protected final void b(n n1)
    {
_L2:
        if (n1.b("iq"))
        {
            break; /* Loop/switch isn't completed */
        }
        if (n1.a("unsupported-client"))
        {
            c(201);
            a(n1.getAttributeValue(null, "jid"));
        } else
        if (n1.a("full"))
        {
            c(202);
        } else
        if (n1.a("not-member"))
        {
            c(203);
        } else
        if (n1.a("deleted"))
        {
            c(204);
        } else
        if (n1.a("conflict"))
        {
            c(205);
            a(n1.getAttributeValue(null, "jid"));
        } else
        if (n1.a("bad-request"))
        {
            c(4000);
        } else
        if (n1.a("user-is-banned"))
        {
            c(4001);
            a(n1.nextText());
        } else
        {
label0:
            {
                if (!n1.a("bad-roster-status"))
                {
                    break label0;
                }
                c(4002);
                ArrayList arraylist = new ArrayList();
                for (; !n1.b("bad-roster-status"); n1.next())
                {
                    if (n1.a("m"))
                    {
                        arraylist.add(n1.nextText());
                    }
                }

                a(arraylist);
            }
        }
_L9:
        n1.next();
        if (true) goto _L2; else goto _L1
        if (!n1.a("invalid"))
        {
            continue; /* Loop/switch isn't completed */
        }
        c(104);
_L7:
        if (n1.b("error")) goto _L1; else goto _L3
_L3:
        if (!n1.a("text")) goto _L5; else goto _L4
_L4:
        a(n1.nextText());
_L1:
        return;
_L5:
        n1.next();
        if (true) goto _L7; else goto _L6
_L6:
        if (!n1.a("text")) goto _L9; else goto _L8
_L8:
        c(104);
        a(n1.nextText());
        return;
    }

    protected final void b(o o1)
    {
        o1.a("query");
        o1.a("xmlns", "kik:groups:admin");
        o1.a("g");
        o1.a("jid", a);
        for (Iterator iterator = b.iterator(); iterator.hasNext(); o1.b("m"))
        {
            String s = (String)iterator.next();
            o1.a("m");
            o1.c(s);
        }

        o1.b("g");
        o1.b("query");
    }

    public final String d()
    {
        return a;
    }

    public final List e()
    {
        return b;
    }
}
