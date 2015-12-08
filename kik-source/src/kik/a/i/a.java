// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.i;

import com.kik.g.p;
import com.kik.g.s;
import com.kik.n.a.b.e;
import java.util.List;
import java.util.Map;
import kik.a.j.n;

// Referenced classes of package kik.a.i:
//            h, b, g, e, 
//            f

public final class a
    implements h
{

    private List a;
    private Map b;
    private Object c;
    private p d;
    private final n e;

    public a(n n1)
    {
        c = new Object();
        e = n1;
    }

    static List a(a a1)
    {
        return a1.a;
    }

    static List a(a a1, List list)
    {
        a1.a = list;
        return list;
    }

    static Map a(a a1, Map map)
    {
        a1.b = map;
        return map;
    }

    private p b()
    {
        synchronized (c)
        {
            if (d == null || d.i())
            {
                d = s.b(e.c("browser_history_item_list", com/kik/n/a/b/e), new b(this));
            }
        }
        return d;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static n b(a a1)
    {
        return a1.e;
    }

    static Object c(a a1)
    {
        return a1.c;
    }

    static p d(a a1)
    {
        a1.d = null;
        return null;
    }

    static Map e(a a1)
    {
        return a1.b;
    }

    public final p a()
    {
        return s.b(b(), new g(this));
    }

    public final p a(String s1, String s2, String s3)
    {
        return a(new h.a(s1, s2, s3, System.currentTimeMillis()));
    }

    public final p a(List list)
    {
        return s.a(s.c(b(), e.c("browser_history_item_list", com/kik/n/a/b/e)), new kik.a.i.e(this, list));
    }

    public final p a(h.a a1)
    {
        if (a1 == null || a1.b() == null)
        {
            return s.a(new IllegalArgumentException("invalid history item"));
        } else
        {
            return s.a(b(), new f(this, a1));
        }
    }
}
