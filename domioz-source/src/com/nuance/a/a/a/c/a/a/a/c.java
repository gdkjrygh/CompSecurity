// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.a.a.a.c.a.a.a;

import com.nuance.a.a.a.c.a.c.f;

// Referenced classes of package com.nuance.a.a.a.c.a.a.a:
//            a

public final class c
{

    private int a;
    private String b;
    private String c;
    private a d;
    private boolean e;

    protected c(int i, a a1)
    {
        a = i;
        if (com.nuance.a.a.a.c.a.a.a.a.e(a1).d() != null)
        {
            b = com.nuance.a.a.a.c.a.a.b.c.a(com.nuance.a.a.a.c.a.a.a.a.e(a1).d());
        } else
        {
            b = "";
        }
        c = "INTERNAL_ERROR";
        d = a1;
        e = false;
    }

    static void a(c c1, String s)
    {
        if (c1.c.equals("INTERNAL_ERROR"))
        {
            c1.c = s;
        } else
        {
            c1.c = (new StringBuilder()).append(c1.c).append(":").append(s).toString();
        }
        com.nuance.a.a.a.c.a.a.a.a.a(c1.d, c1);
    }

    protected final int a()
    {
        return a;
    }

    protected final void a(f f1)
    {
        if (c.equals("INTERNAL_ERROR"))
        {
            c = f1.toString();
        } else
        {
            c = (new StringBuilder()).append(c).append(":").append(f1.toString()).toString();
        }
        com.nuance.a.a.a.c.a.a.a.a.a(d, this);
    }

    protected final void a(String s)
    {
        b = s;
    }

    protected final String b()
    {
        return b;
    }

    protected final String c()
    {
        return c;
    }

    protected final void d()
    {
        e = true;
    }

    protected final boolean e()
    {
        return e;
    }
}
