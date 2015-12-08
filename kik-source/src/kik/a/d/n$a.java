// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.d;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// Referenced classes of package kik.a.d:
//            n, k

public static final class c
{

    private List a;
    private List b;
    private Set c;

    public final List a()
    {
        return a;
    }

    public final void a(String s)
    {
        a.add(s);
    }

    public final boolean a(k k1)
    {
        return c.contains(k1.b());
    }

    public final List b()
    {
        return b;
    }

    public final boolean b(String s)
    {
        a.add(s);
        return c.add(s);
    }

    public final Set c()
    {
        return c;
    }

    public final boolean c(String s)
    {
        return c.add(s);
    }

    public final void d()
    {
        Collections.sort(a);
    }

    public final boolean d(String s)
    {
        return a.contains(s);
    }

    public final boolean e(String s)
    {
        c.remove(s);
        return a.remove(s);
    }

    public final boolean f(String s)
    {
        c.remove(s);
        a.remove(s);
        return b.add(s);
    }

    public final boolean g(String s)
    {
        return c.contains(s);
    }

    public t()
    {
        this(((List) (new ArrayList())), ((List) (new ArrayList())), ((Set) (new HashSet())));
    }

    public t(List list, List list1, Set set)
    {
        a = list;
        b = list1;
        c = set;
    }
}
