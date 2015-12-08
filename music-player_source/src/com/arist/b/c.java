// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.b;

import java.util.ArrayList;
import java.util.Collections;

// Referenced classes of package com.arist.b:
//            b, d

public final class c
{

    private int a;
    private String b;
    private String c;
    private String d;
    private String e;
    private ArrayList f;
    private int g;

    public c()
    {
        a = -1;
        c = "";
        d = "";
        f = new ArrayList();
    }

    public c(int i, String s, String s1)
    {
        a = -1;
        c = "";
        d = "";
        f = new ArrayList();
        a = i;
        b = s;
        c = s1;
    }

    public static c h()
    {
        c c1 = new c();
        c1.b = "default";
        c1.c = "";
        c1.a(new b("", "", "", ""));
        return c1;
    }

    public final int a()
    {
        return g;
    }

    public final void a(int i)
    {
        g = i;
    }

    public final void a(b b1)
    {
        if (!f.contains(b1))
        {
            f.add(b1);
        }
    }

    public final void a(String s)
    {
        e = s;
    }

    public final void a(ArrayList arraylist)
    {
        if (arraylist == null || arraylist.isEmpty())
        {
            return;
        } else
        {
            f.addAll(arraylist);
            return;
        }
    }

    public final String b()
    {
        return b;
    }

    public final void b(int i)
    {
        a = i;
    }

    public final void b(String s)
    {
        d = s;
    }

    public final boolean b(b b1)
    {
        return f.remove(b1);
    }

    public final String c()
    {
        return c;
    }

    public final void c(String s)
    {
        b = s;
    }

    public final int d()
    {
        return a;
    }

    public final void d(String s)
    {
        c = s;
    }

    public final void e()
    {
        f.clear();
    }

    public final ArrayList f()
    {
        return f;
    }

    public final void g()
    {
        Collections.sort(f, new d(this));
    }

    public final String toString()
    {
        return (new StringBuilder("PlayList [id=")).append(a).append(", name=").append(b).append(", des=").append(c).append(", artist=").append(d).append(", albumUrl=").append(e).append("]").toString();
    }
}
