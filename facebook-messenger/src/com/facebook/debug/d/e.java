// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.debug.d;

import com.facebook.common.o.a;
import com.facebook.common.o.d;
import com.facebook.common.time.c;
import com.facebook.debug.log.g;

// Referenced classes of package com.facebook.debug.d:
//            f, a

public class e
{

    private static final ThreadLocal a = new ThreadLocal();
    private static final a e = (new d(com/facebook/debug/d/e, com.facebook.common.time.c.b())).a(new f(com/facebook/debug/d/e)).a();
    private com.facebook.debug.d.a b;
    private long c;
    private long d;

    private e()
    {
        b = null;
        c = -1L;
        d = 0L;
    }

    e(f f1)
    {
        this();
    }

    private long a(long l, boolean flag)
    {
        if (b != null)
        {
            l = b.a(c, l, flag);
        } else
        {
            l = System.currentTimeMillis() - d;
        }
        e.a(this);
        return l;
    }

    static long a(e e1, long l)
    {
        e1.c = l;
        return l;
    }

    static com.facebook.debug.d.a a(e e1, com.facebook.debug.d.a a1)
    {
        e1.b = a1;
        return a1;
    }

    public static e a(String s)
    {
        return a(s, ((String) (null)));
    }

    public static e a(String s, String s1)
    {
        e e1 = (e)e.a();
        e1.b = (com.facebook.debug.d.a)a.get();
        if (e1.b != null)
        {
            e1.c = e1.b.a(s, s1);
            e1.d = 0L;
            return e1;
        } else
        {
            e1.c = -1L;
            e1.d = System.currentTimeMillis();
            return e1;
        }
    }

    public static void a(int i, String s)
    {
        com.facebook.debug.d.a a1 = (com.facebook.debug.d.a)a.get();
        if (a1 != null)
        {
            a1.a(i, s);
            a.set(null);
        }
    }

    public static void a(Class class1)
    {
        c(g.a(class1));
    }

    public static void b()
    {
        com.facebook.debug.d.a a1 = (com.facebook.debug.d.a)a.get();
        if (a1 != null)
        {
            a1.a();
            a.set(null);
        }
    }

    public static void b(long l)
    {
        com.facebook.debug.d.a a2 = (com.facebook.debug.d.a)a.get();
        com.facebook.debug.d.a a1 = a2;
        if (a2 == null)
        {
            a1 = new com.facebook.debug.d.a();
            a.set(a1);
        }
        a1.a(l);
    }

    public static void b(String s)
    {
        com.facebook.debug.d.a a1 = (com.facebook.debug.d.a)a.get();
        if (a1 != null)
        {
            a1.b(s, null);
        }
    }

    public static String c()
    {
        com.facebook.debug.d.a a1 = (com.facebook.debug.d.a)a.get();
        if (a1 != null)
        {
            return a1.b();
        } else
        {
            return "";
        }
    }

    public static void c(String s)
    {
        a(3, s);
    }

    public long a()
    {
        return a(0L, false);
    }

    public long a(long l)
    {
        return a(l, true);
    }

}
