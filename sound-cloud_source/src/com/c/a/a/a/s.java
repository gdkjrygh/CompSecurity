// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a.a.a;

import c.i;
import c.o;
import c.x;
import c.z;
import com.c.a.A;
import com.c.a.B;
import com.c.a.a.b.C;
import com.c.a.a.b.d;
import com.c.a.p;
import com.c.a.t;
import com.c.a.v;
import com.c.a.w;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.c.a.a.a:
//            u, o, q, h, 
//            p, m, t

public final class s
    implements u
{

    private static final List a = com.c.a.a.i.a(new i[] {
        i.a("connection"), i.a("host"), i.a("keep-alive"), i.a("proxy-connection"), i.a("transfer-encoding")
    });
    private static final List b = com.c.a.a.i.a(new i[] {
        i.a("connection"), i.a("host"), i.a("keep-alive"), i.a("proxy-connection"), i.a("te"), i.a("transfer-encoding"), i.a("encoding"), i.a("upgrade")
    });
    private final h c;
    private final com.c.a.a.b.s d;
    private C e;

    public s(h h1, com.c.a.a.b.s s1)
    {
        c = h1;
        d = s1;
    }

    private static boolean a(v v1, i j)
    {
        if (v1 == v.c)
        {
            return a.contains(j);
        }
        if (v1 == v.d)
        {
            return b.contains(j);
        } else
        {
            throw new AssertionError(v1);
        }
    }

    public final x a(w w1, long l)
        throws IOException
    {
        return e.d();
    }

    public final B a(A a1)
        throws IOException
    {
        return new com.c.a.a.a.o(a1.f, o.a(e.f));
    }

    public final void a()
        throws IOException
    {
        e.d().close();
    }

    public final void a(q q1)
        throws IOException
    {
        q1.a(e.d());
    }

    public final void a(w w1)
        throws IOException
    {
        com.c.a.a.b.s s1;
        ArrayList arraylist;
        Object obj;
        String s2;
        boolean flag;
        if (e != null)
        {
            return;
        }
        c.b();
        flag = c.c();
        obj = p.a(c.c.g);
        s1 = d;
        v v1 = d.a;
        p p1 = w1.c;
        arraylist = new ArrayList(p1.a.length / 2 + 10);
        arraylist.add(new d(d.b, w1.b));
        arraylist.add(new d(d.c, p.a(w1.a())));
        s2 = h.a(w1.a());
        int j;
        int l;
        if (v.c == v1)
        {
            arraylist.add(new d(d.g, ((String) (obj))));
            arraylist.add(new d(d.f, s2));
        } else
        if (v.d == v1)
        {
            arraylist.add(new d(d.e, s2));
        } else
        {
            throw new AssertionError();
        }
        arraylist.add(new d(d.d, w1.a().getProtocol()));
        w1 = new LinkedHashSet();
        l = p1.a.length / 2;
        j = 0;
        if (j >= l)
        {
            break MISSING_BLOCK_LABEL_519;
        }
        obj = i.a(p1.a(j).toLowerCase(Locale.US));
        s2 = p1.b(j);
        if (!a(v1, ((i) (obj))) && !((i) (obj)).equals(d.b) && !((i) (obj)).equals(d.c) && !((i) (obj)).equals(d.d) && !((i) (obj)).equals(d.e) && !((i) (obj)).equals(d.f) && !((i) (obj)).equals(d.g))
        {
            if (!w1.add(obj))
            {
                break; /* Loop/switch isn't completed */
            }
            arraylist.add(new d(((i) (obj)), s2));
        }
_L6:
        j++;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_227;
_L1:
        int k = 0;
_L4:
        if (k < arraylist.size())
        {
label0:
            {
                if (!((d)arraylist.get(k)).h.equals(obj))
                {
                    break label0;
                }
                arraylist.set(k, new d(((i) (obj)), (new StringBuilder(((d)arraylist.get(k)).i.a())).append('\0').append(s2).toString()));
            }
        }
        continue; /* Loop/switch isn't completed */
        k++;
        if (true) goto _L4; else goto _L3
_L3:
        e = s1.a(arraylist, flag);
        e.h.a(c.b.x, TimeUnit.MILLISECONDS);
        return;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final com.c.a.A.a b()
        throws IOException
    {
        List list = e.c();
        v v1 = d.a;
        Object obj = null;
        Object obj1 = "HTTP/1.1";
        com.c.a.p.a a1 = new com.c.a.p.a();
        a1.c(com.c.a.a.a.m.d, v1.toString());
        int k1 = list.size();
        int k = 0;
        do
        {
            if (k >= k1)
            {
                break;
            }
            i j = ((d)list.get(k)).h;
            String s2 = ((d)list.get(k)).i.a();
            int l = 0;
            while (l < s2.length()) 
            {
                int j1 = s2.indexOf('\0', l);
                int i1 = j1;
                if (j1 == -1)
                {
                    i1 = s2.length();
                }
                String s1 = s2.substring(l, i1);
                if (j.equals(d.a))
                {
                    obj = s1;
                } else
                if (j.equals(d.g))
                {
                    obj1 = s1;
                } else
                if (!a(v1, j))
                {
                    a1.a(j.a(), s1);
                }
                l = i1 + 1;
            }
            k++;
        } while (true);
        if (obj == null)
        {
            throw new ProtocolException("Expected ':status' header not present");
        } else
        {
            obj = t.a((new StringBuilder()).append(((String) (obj1))).append(" ").append(((String) (obj))).toString());
            obj1 = new com.c.a.A.a();
            obj1.b = v1;
            obj1.c = ((com.c.a.a.a.t) (obj)).b;
            obj1.d = ((com.c.a.a.a.t) (obj)).c;
            return ((com.c.a.A.a) (obj1)).a(a1.a());
        }
    }

    public final void c()
    {
    }

    public final boolean d()
    {
        return true;
    }

}
