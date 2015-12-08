// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.f.f;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kik.a.d.j;
import kik.a.f.o;
import kik.a.h.i;

// Referenced classes of package kik.a.f.f:
//            y

public final class n extends y
{

    private String a;
    private String b;
    private List i;
    private String j;
    private kik.a.d.n k;
    private String l;

    public n(String s, String s1, List list)
    {
        this(s, s1, list, UUID.randomUUID().toString());
    }

    public n(String s, String s1, List list, String s2)
    {
        super(null, "set");
        a = s;
        b = s1;
        i = list;
        l = s2;
    }

    protected final void a(kik.a.f.n n1)
    {
        do
        {
label0:
            {
                if (!n1.b("iq"))
                {
                    if (!n1.a("g"))
                    {
                        break label0;
                    }
                    j = n1.getAttributeValue(null, "jid");
                    if (j != null)
                    {
                        kik.a.d.a a1 = new kik.a.d.a();
                        if (b != null)
                        {
                            a1.a(b);
                        }
                        for (n1 = i.iterator(); n1.hasNext(); a1.a((String)n1.next())) { }
                        j j1 = kik.a.d.j.a(j);
                        if (kik.a.h.i.a(a))
                        {
                            n1 = null;
                        } else
                        {
                            n1 = a;
                        }
                        k = new kik.a.d.n(j1, n1, a1, false, true, true, null, null, null);
                    }
                }
                return;
            }
            n1.next();
        } while (true);
    }

    protected final void b(kik.a.f.n n1)
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
        if (n1.a("unacked-membership"))
        {
            c(202);
            ArrayList arraylist = new ArrayList();
            for (; n1.a("unacked-membership"); n1.next())
            {
                arraylist.add(n1.getAttributeValue(null, "jid"));
            }

            a(arraylist);
        } else
        if (n1.a("restricted-name"))
        {
            c(403);
        } else
        {
label0:
            {
                if (!n1.a("invalid-name"))
                {
                    break label0;
                }
                c(401);
            }
        }
_L3:
        n1.next();
        if (true) goto _L2; else goto _L1
        if (!n1.a("code-already-exists"))
        {
            break MISSING_BLOCK_LABEL_162;
        }
        c(404);
_L1:
        return;
        if (n1.a("restricted-code"))
        {
            c(405);
        } else
        if (n1.a("invalid"))
        {
            c(104);
            while (!n1.b("error")) 
            {
                if (n1.a("text"))
                {
                    a(n1.nextText());
                }
                n1.next();
            }
        } else
        if (n1.a("bad-roster-status"))
        {
            c(406);
            ArrayList arraylist1 = new ArrayList();
            for (; !n1.b("bad-roster-status"); n1.next())
            {
                if (n1.a("m"))
                {
                    arraylist1.add(n1.nextText());
                }
            }

            a(arraylist1);
        } else
        if (n1.a("text"))
        {
            c(104);
            a(n1.nextText());
        }
          goto _L3
    }

    protected final void b(o o1)
    {
        o1.a("query");
        o1.a("xmlns", "kik:groups:admin");
        o1.a("g");
        o1.a("create", "1");
        o1.a("cgid", l);
        if (b != null)
        {
            o1.a("c");
            o1.c(b);
            o1.b("c");
        }
        for (Iterator iterator = i.iterator(); iterator.hasNext(); o1.b("m"))
        {
            String s = (String)iterator.next();
            o1.a("m");
            o1.c(s);
        }

        if (!kik.a.h.i.a(a))
        {
            o1.a("n");
            o1.c(a);
            o1.b("n");
        }
        o1.b("g");
        o1.b("query");
    }

    public final String d()
    {
        return l;
    }

    public final String e()
    {
        return j;
    }

    public final String f()
    {
        return b;
    }

    public final kik.a.d.n g()
    {
        return k;
    }
}
