// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cleanmaster.ui.app.market.data.filter;

import com.cleanmaster.base.util.io.b;
import com.cleanmaster.base.util.io.c;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.cleanmaster.ui.app.market.data.filter:
//            g

public class a
{

    private static a f = new a();
    int a;
    int b;
    int c;
    Set d;
    long e;

    public a()
    {
        a = 0;
        b = 0;
        c = 0;
        d = new com.cleanmaster.base.util.misc.a();
        e = 0L;
    }

    public static a a()
    {
        return f;
    }

    public a b()
    {
        Object obj = com.cleanmaster.func.cache.a.a().c();
        if (obj != null && !((List) (obj)).isEmpty())
        {
            a = ((List) (obj)).size();
            d.addAll(((java.util.Collection) (obj)));
            obj = com.cleanmaster.base.util.io.c.a();
            b = com.cleanmaster.functionevent.report.a.a(((b) (obj)).a);
            c = com.cleanmaster.functionevent.report.a.a(((b) (obj)).b);
        }
        e = System.currentTimeMillis();
        return this;
    }

    public int c()
    {
        return a;
    }

    public int d()
    {
        return b;
    }

    public Set e()
    {
        return d;
    }

    public int f()
    {
        return c;
    }

    public long g()
    {
        return e;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("--------------------------------------[AdEnv]\n");
        stringbuilder.append(" *     app_installed_num = ").append(a).append("\n");
        stringbuilder.append(" * total_space_condition = ").append((new StringBuilder()).append(b).append("M").toString()).append("\n");
        stringbuilder.append(" * free_space_condition  = ").append((new StringBuilder()).append(c).append("M").toString()).append("\n");
        stringbuilder.append(" * \t\t\t\t\t\t\t\t\tnow = ").append(com.cleanmaster.ui.app.market.data.filter.g.a(a)).append("\n");
        stringbuilder.append("\n");
        return super.toString();
    }

}
