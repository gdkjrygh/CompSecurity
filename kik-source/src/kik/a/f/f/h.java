// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.f.f;

import java.util.ArrayList;
import java.util.List;
import kik.a.d.l;
import kik.a.d.m;
import kik.a.f.n;
import kik.a.f.o;
import kik.a.h.i;

// Referenced classes of package kik.a.f.f:
//            y, z

public final class h extends y
{

    private String a;
    private List b;
    private m i;

    public h(String s)
    {
        super(null, "get");
        b = new ArrayList();
        if (s.contains("-"))
        {
            throw new IllegalArgumentException("Invalid hashtag, contains a dash");
        } else
        {
            a = s;
            return;
        }
    }

    protected final void a(n n1)
    {
        n1.a(null, "query");
        n1.b("xmlns", "kik:groups:admin");
        String s = null;
        String s3 = null;
        String s2 = null;
        String s1 = null;
        while (!n1.b("query")) 
        {
            if (n1.a("g"))
            {
                n1.b("action", "search");
                s1 = n1.getAttributeValue(null, "jid");
            }
            if (n1.a("n"))
            {
                s2 = n1.nextText();
            }
            if (n1.a("code"))
            {
                s3 = n1.nextText();
            }
            if (n1.a("m"))
            {
                String s4 = null;
                Object obj = null;
                for (; !n1.b("m"); n1.next())
                {
                    if (n1.a("first-name"))
                    {
                        obj = n1.nextText();
                    }
                    if (n1.a("pic"))
                    {
                        s4 = n1.nextText();
                    }
                }

                if (kik.a.h.i.a(s4))
                {
                    s4 = null;
                } else
                {
                    s4 = (new StringBuilder()).append(s4).append("/thumb.jpg").toString();
                }
                obj = new l(((String) (obj)), s4, false);
                b.add(obj);
            }
            if (n1.a("pic"))
            {
                s = n1.nextText();
            }
            n1.next();
        }
        if (kik.a.h.i.a(s))
        {
            n1 = null;
        } else
        {
            n1 = (new StringBuilder()).append(s).append("/thumb.jpg").toString();
        }
        i = new m(s3, s2, s1, n1, "", b);
    }

    public final boolean a(z z)
    {
        if (z instanceof h)
        {
            return ((h)z).a.equals(a);
        } else
        {
            return false;
        }
    }

    protected final void b(n n1)
    {
        n1.a(null, "query");
        do
        {
label0:
            {
                if (!n1.b("iq"))
                {
                    if (!n1.a("item-not-found"))
                    {
                        break label0;
                    }
                    c(201);
                }
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
        o1.a("action", "search");
        o1.a("code");
        o1.c(a);
        o1.b("code");
        o1.b("g");
        o1.b("query");
    }

    public final m d()
    {
        return i;
    }
}
