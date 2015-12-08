// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.d;

import com.kik.n.a.f.a;
import com.kik.n.a.f.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package kik.a.d:
//            w

public final class x
{

    String a;
    protected List b;
    private String c;
    private String d;

    public x(c c1)
    {
        this(c1.b(), c1.c(), c1.d(), a(c1.e()));
    }

    public x(String s, String s1, String s2, List list)
    {
        c = s;
        a = s1;
        d = s2;
        b = list;
    }

    private static List a(List list)
    {
        if (list == null)
        {
            return null;
        }
        ArrayList arraylist = new ArrayList();
        for (list = list.iterator(); list.hasNext(); arraylist.add(new w((a)list.next()))) { }
        return arraylist;
    }

    public final String a()
    {
        if (d == null)
        {
            return null;
        } else
        {
            return d.toLowerCase();
        }
    }

    public final void a(w w1)
    {
        if (b != null)
        {
            b.remove(w1);
        }
    }

    public final List b()
    {
        return b;
    }

    public final String c()
    {
        return a;
    }

    public final String d()
    {
        return d;
    }

    public final c e()
    {
        c c1 = new c();
        ArrayList arraylist = new ArrayList();
        for (Iterator iterator = b.iterator(); iterator.hasNext(); arraylist.add(((w)iterator.next()).d())) { }
        c1.a(c);
        c1.b(a);
        c1.c(d);
        c1.a(arraylist);
        return c1;
    }
}
