// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.g.a;

import com.google.common.a.es;
import com.google.common.base.Joiner;
import java.util.Iterator;

// Referenced classes of package com.facebook.g.a:
//            b, c

public class a
{

    private final String a;
    private final String b;
    private final String c;
    private final es d;
    private final es e;

    a(b b1)
    {
        a = b1.a();
        b = b1.b();
        c = b1.d();
        d = b1.e();
        e = es.a(b1.c());
    }

    public static b a()
    {
        return (new b()).b("me()");
    }

    public static b a(Iterable iterable)
    {
        StringBuilder stringbuilder = new StringBuilder("nodes(");
        Joiner.on(",").appendTo(stringbuilder, iterable);
        stringbuilder.append(")");
        return (new b()).b(stringbuilder.toString());
    }

    public static b a(String s)
    {
        return (new b()).b((new StringBuilder()).append("node(").append(s).append(")").toString());
    }

    public static b b(String s)
    {
        return (new b()).a(s);
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        if (a != null)
        {
            stringbuilder.append(a);
            if (b != null)
            {
                stringbuilder.append(".");
            }
        }
        if (b != null)
        {
            stringbuilder.append(b);
        }
        for (Iterator iterator = d.iterator(); iterator.hasNext(); stringbuilder.append(")"))
        {
            c c1 = (c)iterator.next();
            stringbuilder.append(".");
            stringbuilder.append(c1.a());
            stringbuilder.append("(");
            Joiner.on(",").appendTo(stringbuilder, c1.b());
        }

        if (c != null)
        {
            stringbuilder.append(" as ");
            stringbuilder.append(c);
        }
        if (e.size() > 0)
        {
            stringbuilder.append("{");
            Joiner.on(",").appendTo(stringbuilder, e);
            stringbuilder.append("}");
        }
        return stringbuilder.toString();
    }
}
