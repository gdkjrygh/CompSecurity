// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.f.f;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kik.a.f.n;
import kik.a.f.o;
import kik.a.f.t;

// Referenced classes of package kik.a.f.f:
//            y, z

public final class f extends y
{

    private Set a;
    private HashSet b;
    private HashSet i;

    private f(Set set)
    {
        super(null, "get");
        b = new HashSet();
        i = new HashSet();
        if (set != null && set.size() > 0)
        {
            a = set;
            return;
        } else
        {
            throw new IllegalArgumentException("Invalid list of identifiers");
        }
    }

    public static f a(Set set)
    {
        return new f(set);
    }

    protected final void a(n n1)
    {
        n1.a(null, "query");
        n1.b("xmlns", "kik:iq:friend:batch");
        while (!n1.b("iq")) 
        {
            if (n1.a("query"))
            {
                while (!n1.b("query")) 
                {
                    if (n1.a("success"))
                    {
                        for (; !n1.b("success"); n1.next())
                        {
                            if (n1.a("item"))
                            {
                                b.add(t.a(n1, false));
                            }
                        }

                    }
                    if (n1.a("failed"))
                    {
                        for (; !n1.b("failed"); n1.next())
                        {
                            if (!n1.a("item"))
                            {
                                continue;
                            }
                            String s = n1.getAttributeValue(null, "jid");
                            if (s != null)
                            {
                                i.add(s);
                            }
                        }

                    }
                    n1.next();
                }
            } else
            {
                n1.next();
            }
        }
    }

    public final boolean a(z z)
    {
        if (z instanceof f)
        {
            return a.equals(((f)z).a);
        } else
        {
            return false;
        }
    }

    protected final void b(n n1)
    {
        n1.a(null, "query");
        n1.b("type", "error");
        n1.a(2, "error");
        n1.next();
        c(201);
    }

    protected final void b(o o1)
    {
        o1.a("query");
        o1.a("xmlns", "kik:iq:friend:batch");
        for (Iterator iterator = a.iterator(); iterator.hasNext(); o1.b("item"))
        {
            String s = (String)iterator.next();
            o1.a("item");
            if (s != null)
            {
                o1.a("jid", s);
            }
        }

        o1.b("query");
    }

    public final Set d()
    {
        return b;
    }
}
