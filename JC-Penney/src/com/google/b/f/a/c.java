// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.f.a;

import com.google.b.b.b;
import com.google.b.m;
import com.google.b.s;

final class c
{

    private b a;
    private s b;
    private s c;
    private s d;
    private s e;
    private int f;
    private int g;
    private int h;
    private int i;

    c(b b1, s s1, s s2, s s3, s s4)
    {
        if (s1 == null && s3 == null || s2 == null && s4 == null || s1 != null && s2 == null || s3 != null && s4 == null)
        {
            throw m.a();
        } else
        {
            a(b1, s1, s2, s3, s4);
            return;
        }
    }

    c(c c1)
    {
        a(c1.a, c1.b, c1.c, c1.d, c1.e);
    }

    static c a(c c1, c c2)
    {
        if (c1 == null)
        {
            return c2;
        }
        if (c2 == null)
        {
            return c1;
        } else
        {
            return new c(c1.a, c1.b, c1.c, c2.d, c2.e);
        }
    }

    private void a(b b1, s s1, s s2, s s3, s s4)
    {
        a = b1;
        b = s1;
        c = s2;
        d = s3;
        e = s4;
        i();
    }

    private void i()
    {
        if (b != null) goto _L2; else goto _L1
_L1:
        b = new s(0.0F, d.b());
        c = new s(0.0F, e.b());
_L4:
        f = (int)Math.min(b.a(), c.a());
        g = (int)Math.max(d.a(), e.a());
        h = (int)Math.min(b.b(), d.b());
        i = (int)Math.max(c.b(), e.b());
        return;
_L2:
        if (d == null)
        {
            d = new s(a.f() - 1, b.b());
            e = new s(a.f() - 1, c.b());
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    int a()
    {
        return f;
    }

    c a(int j, int k, boolean flag)
    {
        s s1 = b;
        s s2 = c;
        s s6 = d;
        s s5 = e;
        s s3;
        s s4;
        if (j > 0)
        {
            int l;
            if (flag)
            {
                s3 = b;
            } else
            {
                s3 = d;
            }
            l = (int)s3.b() - j;
            j = l;
            if (l < 0)
            {
                j = 0;
            }
            s4 = new s(s3.a(), j);
            if (flag)
            {
                s3 = s6;
                s1 = s4;
            } else
            {
                s3 = s4;
            }
        } else
        {
            s3 = s6;
        }
        if (k > 0)
        {
            if (flag)
            {
                s4 = c;
            } else
            {
                s4 = e;
            }
            k = (int)s4.b() + k;
            j = k;
            if (k >= a.g())
            {
                j = a.g() - 1;
            }
            s4 = new s(s4.a(), j);
            if (flag)
            {
                s2 = s4;
            } else
            {
                s5 = s4;
            }
        }
        i();
        return new c(a, s1, s2, s3, s5);
    }

    int b()
    {
        return g;
    }

    int c()
    {
        return h;
    }

    int d()
    {
        return i;
    }

    s e()
    {
        return b;
    }

    s f()
    {
        return d;
    }

    s g()
    {
        return c;
    }

    s h()
    {
        return e;
    }
}
