// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.a.a.a.a;


// Referenced classes of package org.a.a.a.a:
//            g, e

public class f
{

    private static volatile g a;
    private final StringBuffer b;
    private final Object c;
    private final g d;

    public f(Object obj, g g1)
    {
        g g2 = g1;
        if (g1 == null)
        {
            g2 = a;
        }
        g1 = new StringBuffer(512);
        b = g1;
        d = g2;
        c = obj;
        g2.a(g1, obj);
    }

    public static String a(Object obj)
    {
        return e.a(obj, null);
    }

    public static String b(Object obj, g g1)
    {
        return e.a(obj, g1);
    }

    public final Object a()
    {
        return c;
    }

    public final f a(String s, Object obj)
    {
        d.a(b, s, obj);
        return this;
    }

    public final StringBuffer b()
    {
        return b;
    }

    public final g c()
    {
        return d;
    }

    public String toString()
    {
        if (c == null)
        {
            b.append(d.f());
        } else
        {
            d.b(b, c);
        }
        return b.toString();
    }

    static 
    {
        a = g.a;
    }
}
