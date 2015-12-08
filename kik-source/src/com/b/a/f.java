// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a;

import java.util.ArrayList;

// Referenced classes of package com.b.a:
//            d, i, u, a, 
//            y, x, k, o

public final class f extends d
    implements i, u
{

    static final boolean b;
    private final ArrayList c;
    private int d;
    private u e;
    private boolean f;

    public f(a a1)
    {
        super(a1);
        d = -1;
        f = false;
        if (!b && !a1.a)
        {
            throw new AssertionError();
        } else
        {
            c = new ArrayList();
            return;
        }
    }

    public final int a(u u1)
    {
        int j = ((a)a).a(u1);
        if (y.a(((a)a).a()) == 6)
        {
            d = ((a)a).e();
            f = true;
            return j;
        } else
        {
            f = false;
            return j;
        }
    }

    public final Object a()
    {
        throw new UnsupportedOperationException();
    }

    public final Object a(Object obj, u u1)
    {
        if (f)
        {
            return c.get(d);
        }
        e = u1;
        Object obj1 = obj;
        if (obj == null)
        {
            obj1 = u1.a();
        }
        c.add(obj1);
        ((a)a).a(obj1, this);
        return obj1;
    }

    public final void a(k k, Object obj)
    {
        k = e;
        k.a(this, obj);
        if (!k.a(obj))
        {
            throw new x(obj, k);
        } else
        {
            e = k;
            return;
        }
    }

    public final void a(o o, Object obj)
    {
        throw new UnsupportedOperationException();
    }

    public final boolean a(Object obj)
    {
        return true;
    }

    static 
    {
        boolean flag;
        if (!com/b/a/f.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b = flag;
    }
}
