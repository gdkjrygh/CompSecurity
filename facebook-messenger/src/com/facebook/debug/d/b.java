// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.debug.d;

import com.facebook.common.o.a;
import com.facebook.common.o.d;
import com.facebook.common.time.c;

// Referenced classes of package com.facebook.debug.d:
//            c, d

class b
{

    private static final a g = (new d(com/facebook/debug/d/b, com.facebook.common.time.c.b())).a(new com.facebook.debug.d.c(com/facebook/debug/d/b)).a();
    private com.facebook.debug.d.d a;
    private long b;
    private String c;
    private String d;
    private long e;
    private long f;

    private b()
    {
    }

    b(com.facebook.debug.d.c c1)
    {
        this();
    }

    static b a(com.facebook.debug.d.d d1, long l, String s, String s1, long l1)
    {
        b b1 = (b)g.a();
        b1.a = d1;
        b1.b = l;
        b1.c = s;
        b1.d = s1;
        b1.e = System.currentTimeMillis();
        b1.f = l1;
        return b1;
    }

    static String a(long l)
    {
        l = Math.round(l);
        String s = "";
        if (l < 10000L)
        {
            s = "_";
        }
        if (l < 1000L)
        {
            s = "__";
        }
        if (l < 100L)
        {
            s = "___";
        }
        if (l < 10L)
        {
            s = "____";
        }
        return (new StringBuilder()).append(s).append(l).toString();
    }

    static String a(b b1, String s)
    {
        b1.c = s;
        return s;
    }

    static String b(long l)
    {
        long l1 = Math.round(l);
        l = Math.max(0L, (l1 / 1000L) % 60L);
        l1 = Math.max(l1 % 1000L, 0L);
        return (new StringBuilder()).append(Long.toString(l + 100L).substring(1, 3)).append('.').append(Long.toString(l1 + 1000L).substring(1, 4)).toString();
    }

    static String b(b b1, String s)
    {
        b1.d = s;
        return s;
    }

    String a(long l, long l1, String s)
    {
        StringBuilder stringbuilder = new StringBuilder();
        if (l1 == -1L)
        {
            stringbuilder.append("-----");
        } else
        {
            stringbuilder.append(a(e - l1));
        }
        stringbuilder.append(" ");
        stringbuilder.append(b(e - l));
        if (a == d.START)
        {
            stringbuilder.append(" Start         ");
        } else
        if (a == d.STOP)
        {
            stringbuilder.append(" Done ");
            stringbuilder.append(a(e - f));
            stringbuilder.append(" ms ");
        } else
        {
            stringbuilder.append(" Comment       ");
        }
        stringbuilder.append(s);
        stringbuilder.append(toString());
        return stringbuilder.toString();
    }

    void a()
    {
        g.a(this);
    }

    public long b()
    {
        return b;
    }

    public com.facebook.debug.d.d c()
    {
        return a;
    }

    public String d()
    {
        return c;
    }

    public String e()
    {
        return d;
    }

    public long f()
    {
        return e;
    }

    public String toString()
    {
        if (d == null)
        {
            return c;
        } else
        {
            return (new StringBuilder()).append("[").append(d).append("] ").append(c).toString();
        }
    }

}
