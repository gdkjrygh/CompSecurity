// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.f.f;

import com.c.a.a.af;
import com.kik.m.e;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import kik.a.d.a.a;
import kik.a.d.a.g;
import kik.a.d.a.l;
import kik.a.d.a.m;
import kik.a.d.s;
import kik.a.f.n;
import kik.a.f.o;
import org.c.c;
import org.d.a.b;

// Referenced classes of package kik.a.f.f:
//            y

public final class ai extends y
{

    private static final org.c.b a = c.a("ReportSpamRequest");
    private final String b;
    private final String i;
    private final Vector j;

    public ai(String s1, String s2, Vector vector)
    {
        super(null, "set");
        b = s1;
        i = s2;
        j = vector;
    }

    protected final void a(n n1)
    {
        if (!n1.a("query") || !"kik:iq:spam".equals(n1.getAttributeValue(null, "xmlns")))
        {
            throw new b("Expected spam query response");
        } else
        {
            return;
        }
    }

    protected final void b(n n1)
    {
        for (; !n1.b("iq"); n1.next())
        {
            if (!n1.a("error"))
            {
                continue;
            }
            String s1 = n1.getAttributeValue(null, "code");
            n1.getAttributeValue(null, "type");
            if (s1 != null)
            {
                c(Integer.parseInt(s1));
            }
        }

    }

    protected final void b(o o1)
    {
        o1.a("query");
        o1.a("xmlns", "kik:iq:spam");
        if (b != null)
        {
            o1.a("report");
            o1.a("jid", b);
            if (j != null)
            {
                Iterator iterator = j.iterator();
                do
                {
                    if (!iterator.hasNext())
                    {
                        break;
                    }
                    Object obj1 = (s)iterator.next();
                    if (g.a(((s) (obj1)), kik/a/d/a/l) == null && g.a(((s) (obj1)), kik/a/d/a/m) == null)
                    {
                        o1.a("msg");
                        o1.a("id", ((s) (obj1)).b());
                        Object obj;
                        if (((s) (obj1)).d())
                        {
                            obj = i;
                        } else
                        {
                            obj = b;
                        }
                        o1.a("from", ((String) (obj)));
                        o1.a("type", "chat");
                        o1.a("timestamp", Long.toString(((s) (obj1)).e()));
                        obj = (a)g.a(((s) (obj1)), kik/a/d/a/a);
                        if (obj != null)
                        {
                            String s1 = ((a) (obj)).u();
                            if (s1.equals("com.kik.ext.camera") || s1.equals("com.kik.ext.gallery") || s1.equals("com.kik.ext.video-camera") || s1.equals("com.kik.ext.video-gallery"))
                            {
                                o1.a("keys");
                                if (((s) (obj1)).o() != null)
                                {
                                    o1.a("d");
                                    o1.a("key", e.a(((s) (obj1)).o()).toString());
                                    o1.b("d");
                                }
                                o1.b("keys");
                                o1.a("content");
                                o1.a("app-id", s1);
                                o1.a("id", af.a(((a) (obj)).o()));
                                o1.a("strings");
                                o1.b("app-name", af.a(((a) (obj)).g("app-name")));
                                o1.b("strings");
                                o1.b("content");
                            } else
                            if (s1.equals("com.kik.cards"))
                            {
                                o1.a("content");
                                o1.a("app-id", s1);
                                o1.a("id", af.a(((a) (obj)).o()));
                                o1.a("strings");
                                o1.b("title", af.a(((a) (obj)).g("title")));
                                o1.b("card-icon", af.a(((a) (obj)).g("card-icon")));
                                o1.b("app-name", af.a(((a) (obj)).g("app-name")));
                                o1.b("strings");
                                o1.a("uris");
                                obj = ((a) (obj)).f();
                                for (int k = 0; k < ((List) (obj)).size(); k++)
                                {
                                    obj1 = (com.kik.f.a.a.a)((List) (obj)).get(k);
                                    if (((com.kik.f.a.a.a) (obj1)).f() == null)
                                    {
                                        continue;
                                    }
                                    o1.a("uri");
                                    s1 = ((com.kik.f.a.a.a) (obj1)).c();
                                    if (s1 != null)
                                    {
                                        o1.a("platform", s1);
                                    }
                                    o1.a("priority", Integer.toString(k));
                                    o1.c(((com.kik.f.a.a.a) (obj1)).f());
                                    o1.b("uri");
                                }

                                o1.b("uris");
                                o1.b("content");
                            } else
                            {
                                a.a((new StringBuilder("Unknown message app Id: ")).append(s1).toString());
                            }
                        } else
                        {
                            o1.b("body", af.a(((s) (obj1)).a()));
                        }
                        o1.b("msg");
                    }
                } while (true);
            } else
            {
                o1.a("jid", b);
            }
            o1.b("report");
        }
        o1.b("query");
    }

}
