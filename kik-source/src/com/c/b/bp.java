// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.b;


// Referenced classes of package com.c.b:
//            as, bg

public final class bp
    implements as.b
{

    private as.b a;
    private as.a b;
    private as c;
    private boolean d;

    public bp(as as1, as.b b1, boolean flag)
    {
        if (as1 == null)
        {
            throw new NullPointerException();
        } else
        {
            c = as1;
            a = b1;
            d = flag;
            return;
        }
    }

    private void f()
    {
        if (b != null)
        {
            c = null;
        }
        if (d && a != null)
        {
            a.a();
            d = false;
        }
    }

    public final bp a(as as1)
    {
        if (as1 == null)
        {
            throw new NullPointerException();
        }
        c = as1;
        if (b != null)
        {
            b.k();
            b = null;
        }
        f();
        return this;
    }

    public final void a()
    {
        f();
    }

    public final as b()
    {
        if (c == null)
        {
            c = (as)b.h();
        }
        return c;
    }

    public final bp b(as as1)
    {
        if (b == null && c == c.w())
        {
            c = as1;
        } else
        {
            d().a(as1);
        }
        f();
        return this;
    }

    public final as c()
    {
        d = true;
        return b();
    }

    public final as.a d()
    {
        if (b == null)
        {
            b = (as.a)c.a(this);
            b.a(c);
            b.m();
        }
        return b;
    }

    public final bg e()
    {
        if (b != null)
        {
            return b;
        } else
        {
            return c;
        }
    }
}
