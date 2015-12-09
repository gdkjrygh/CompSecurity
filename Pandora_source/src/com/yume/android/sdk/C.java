// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yume.android.sdk;

import java.util.ArrayList;

// Referenced classes of package com.yume.android.sdk:
//            P, D

final class C extends P
{

    int a;
    public D b;
    public boolean c;
    public boolean d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;
    private int j;
    private String k;
    private ArrayList l;

    C()
    {
        a = -1;
        f = "custom overlay banner";
        k = "none";
        b = D.a;
        c = false;
        d = false;
    }

    public final String a()
    {
        return e;
    }

    public final void a(int i1)
    {
        j = i1;
    }

    public final void a(String s)
    {
        e = s;
        if (s != null)
        {
            s = s.toLowerCase();
            if (s.equals("replay"))
            {
                b = D.i;
            } else
            {
                if (s.equals("play"))
                {
                    b = D.g;
                    return;
                }
                if (s.equals("pause"))
                {
                    b = D.h;
                    return;
                }
                if (s.equals("tap"))
                {
                    b = D.j;
                    return;
                }
                if (s.equals("swipe"))
                {
                    b = D.j;
                    return;
                }
            }
        }
    }

    public final String b()
    {
        return f;
    }

    public final void b(String s)
    {
        f = s;
    }

    public final String c()
    {
        return g;
    }

    public final void c(String s)
    {
        if (s == null) goto _L2; else goto _L1
_L1:
        s = s.toLowerCase();
        if (!s.equals("go_to_url")) goto _L4; else goto _L3
_L3:
        b = D.b;
_L2:
        return;
_L4:
        if (!s.equals("link_to_slate"))
        {
            break; /* Loop/switch isn't completed */
        }
        if (b == D.a)
        {
            b = D.c;
            return;
        }
        if (true) goto _L2; else goto _L5
_L5:
        if (s.equals("close_ad"))
        {
            b = D.e;
            return;
        }
        if (s.equals("call"))
        {
            b = D.d;
            return;
        }
        if (s.equals("calendar"))
        {
            b = D.f;
            return;
        }
        if (true) goto _L2; else goto _L6
_L6:
    }

    public final String d()
    {
        return h;
    }

    public final void d(String s)
    {
        g = s;
    }

    public final String e()
    {
        return i;
    }

    public final void e(String s)
    {
        h = s;
    }

    public final int f()
    {
        return j;
    }

    public final void f(String s)
    {
        i = s;
    }

    public final String g()
    {
        return k;
    }

    public final void g(String s)
    {
        k = s;
    }

    public final ArrayList h()
    {
        return l;
    }

    public final void h(String s)
    {
        if (l == null)
        {
            l = new ArrayList();
        }
        l.add(s);
    }
}
