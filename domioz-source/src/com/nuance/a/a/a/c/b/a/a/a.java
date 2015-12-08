// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.a.a.a.c.b.a.a;

import com.nuance.a.a.a.a.d.a.d;
import com.nuance.a.a.a.a.d.a.e;
import com.nuance.a.a.a.c.b.a.b.h;
import com.nuance.a.a.a.c.b.b.b;
import com.nuance.a.a.a.c.b.c.c;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

// Referenced classes of package com.nuance.a.a.a.c.b.a.a:
//            g, b, e, c

public class a
    implements c
{

    private static final e h = com.nuance.a.a.a.a.d.a.d.a(com/nuance/a/a/a/c/b/a/a/g);
    com.nuance.a.a.a.c.b.a.a.b a;
    g b;
    String c;
    int d;
    String e;
    String f;
    protected Hashtable g;
    private a i;
    private List j;
    private List k;
    private Map l;
    private String m;
    private long n;

    a(String s, String s1, a a1, com.nuance.a.a.a.c.b.a.a.b b1, g g1)
    {
        j = new LinkedList();
        k = new LinkedList();
        l = new TreeMap();
        e = null;
        f = null;
        m = s;
        c = s1;
        i = a1;
        a = b1;
        b = g1;
    }

    protected static boolean a(b b1, String s, Object obj)
    {
        h h1 = new h();
        String s1;
        if (obj instanceof byte[])
        {
            s1 = "bin";
        } else
        if (obj instanceof Boolean)
        {
            s1 = "bool";
        } else
        if (obj instanceof Double)
        {
            s1 = "float";
        } else
        if (obj instanceof Integer)
        {
            s1 = "int";
        } else
        if (obj instanceof Long)
        {
            s1 = "long";
        } else
        if (obj instanceof String)
        {
            s1 = "str";
        } else
        if (obj instanceof c)
        {
            s1 = "str";
        } else
        {
            s1 = "unknown";
        }
        if (s1.compareTo("unknown") == 0)
        {
            return false;
        }
        h1.a("t", s1);
        h1.a("k", s);
        if (obj instanceof byte[])
        {
            h1.a("v", (byte[])obj);
        } else
        if (obj instanceof Boolean)
        {
            h1.a("v", ((Boolean)obj).toString());
        } else
        if (obj instanceof Double)
        {
            h1.a("v", ((Double)obj).toString());
        } else
        if (obj instanceof Integer)
        {
            h1.b("v", ((Integer)obj).intValue());
        } else
        if (obj instanceof Long)
        {
            h1.a("v", ((Long)obj).toString());
        } else
        if (obj instanceof String)
        {
            h1.b("v", (String)obj);
        } else
        if (obj instanceof c)
        {
            h1.a("v", (new StringBuilder()).append(((a)obj).a.h()).append(".").append(((a)obj).d).toString());
        } else
        {
            return false;
        }
        b1.a(h1);
        return true;
    }

    public final void a(String s)
    {
        k.add(s);
    }

    public final void a(Hashtable hashtable)
    {
        g = hashtable;
        n = System.currentTimeMillis();
        b.a(this);
    }

    public final byte[] a()
    {
        h h1 = new h();
        h1.a("meta", d());
        com.nuance.a.a.a.c.b.a.b.b b1 = new com.nuance.a.a.a.c.b.a.b.b();
        String s;
        for (Iterator iterator = g.keySet().iterator(); iterator.hasNext(); a(((b) (b1)), s, g.get(s)))
        {
            s = (String)iterator.next();
        }

        if (b1.a() > 0)
        {
            h1.a("attr", b1);
        }
        n = System.currentTimeMillis();
        if (j.size() > 0)
        {
            com.nuance.a.a.a.c.b.a.b.b b2 = new com.nuance.a.a.a.c.b.a.b.b();
            h h2;
            for (; j.size() > 0; b2.a(h2))
            {
                com.nuance.a.a.a.c.b.a.a.e e1 = (com.nuance.a.a.a.c.b.a.a.e)j.remove(0);
                h2 = new h();
                h2.b("rootParentId", b.d());
                h2.b("seqId", e1.b());
                h2.b("eventName", e1.c());
                h2.b("timestamp", Long.valueOf(n).toString());
                h2.b("refId", e1.a());
            }

            h1.a("refids", b2);
        } else
        {
            h1.a("refids", new com.nuance.a.a.a.c.b.a.b.b());
        }
        return ((h)h1).e();
    }

    public final com.nuance.a.a.a.c.b.b.a b()
    {
        h h1 = new h();
        h1.a("meta", d());
        com.nuance.a.a.a.c.b.a.b.b b1 = new com.nuance.a.a.a.c.b.a.b.b();
        String s;
        for (Iterator iterator = g.keySet().iterator(); iterator.hasNext(); a(b1, s, g.get(s)))
        {
            s = (String)iterator.next();
        }

        if (b1.a() > 0)
        {
            h1.a("attr", b1);
        }
        n = System.currentTimeMillis();
        b1 = new com.nuance.a.a.a.c.b.a.b.b();
        if (j.size() > 0)
        {
            h h2;
            for (; j.size() > 0; b1.a(h2))
            {
                com.nuance.a.a.a.c.b.a.a.e e1 = (com.nuance.a.a.a.c.b.a.a.e)j.remove(0);
                h2 = new h();
                h2.b("rootParentId", b.d());
                h2.b("seqId", e1.b());
                h2.b("eventName", e1.c());
                h2.b("timestamp", Long.valueOf(n).toString());
                h2.b("refId", e1.a());
            }

        }
        h1.a("refids", b1);
        return h1;
    }

    public final com.nuance.a.a.a.c.b.c.a b(String s)
    {
        return com.nuance.a.a.a.c.b.a.a.c.a(this, s);
    }

    protected void c()
    {
        d = a.i();
    }

    protected b d()
    {
        com.nuance.a.a.a.c.b.a.b.b b1 = new com.nuance.a.a.a.c.b.a.b.b();
        a(b1, "RootParentId", a.h());
        if (i != null)
        {
            a(b1, "ParentSeqId", new Integer(i.d));
        }
        a(b1, "SeqId", new Integer(d));
        a(b1, "Name", m);
        a(b1, "Timestamp", new Long(n));
        if (c != null && !c.equals(""))
        {
            a(b1, "SchemaVersion", c);
        }
        if (e != null && !e.equals("") && f != null && !f.equals(""))
        {
            a(b1, "EventIdToCancel", e);
            a(b1, "EventNameToCancel", f);
        }
        return b1;
    }

    public final void e()
    {
        String s;
        com.nuance.a.a.a.c.b.a.a.e e1;
        for (; k.size() > 0; l.put(s, e1.a()))
        {
            s = (String)k.remove(0);
            e1 = new com.nuance.a.a.a.c.b.a.a.e(a.h(), a.i(), s);
            j.add(e1);
        }

    }

    public final Map f()
    {
        return l;
    }

    public final String g()
    {
        if (d == 0)
        {
            if (h.e())
            {
                h.b("getSessionEventId() has been called before builder commit has completed");
            }
            return null;
        } else
        {
            return (new StringBuilder()).append(a.h()).append(".").append(d).toString();
        }
    }

}
