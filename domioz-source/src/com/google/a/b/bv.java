// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b;

import java.util.Arrays;
import java.util.Iterator;

// Referenced classes of package com.google.a.b:
//            da, bx, aj, bu, 
//            bt, bw

final class bv extends da
    implements bx
{

    bu a[];
    final bt b;
    private final Object c;
    private int d;
    private int e;
    private bx f;
    private bx g;

    bv(bt bt1, Object obj, int i)
    {
        b = bt1;
        super();
        d = 0;
        e = 0;
        c = obj;
        f = this;
        g = this;
        a = new bu[aj.a(i, 1.0D)];
    }

    static bx a(bv bv1)
    {
        return bv1.f;
    }

    static int b(bv bv1)
    {
        return bv1.e;
    }

    public final bx a()
    {
        return g;
    }

    public final void a(bx bx1)
    {
        g = bx1;
    }

    public final boolean add(Object obj)
    {
        int i = aj.a(obj);
        int k = i & a.length - 1;
        bu bu2 = a[k];
        for (bu bu1 = bu2; bu1 != null; bu1 = bu1.d)
        {
            if (bu1.a(obj, i))
            {
                return false;
            }
        }

        obj = new bu(c, obj, i, bu2);
        bt.a(g, ((bx) (obj)));
        bt.a(((bx) (obj)), this);
        bt.a(bt.a(b).g, ((bu) (obj)));
        bt.a(((bu) (obj)), bt.a(b));
        a[k] = ((bu) (obj));
        d = d + 1;
        e = e + 1;
        if (aj.a(d, a.length))
        {
            bu abu[] = new bu[a.length * 2];
            a = abu;
            int j = abu.length;
            for (obj = f; obj != this; obj = ((bx) (obj)).b())
            {
                bu bu3 = (bu)obj;
                int l = bu3.c & j - 1;
                bu3.d = abu[l];
                abu[l] = bu3;
            }

        }
        return true;
    }

    public final bx b()
    {
        return f;
    }

    public final void b(bx bx1)
    {
        f = bx1;
    }

    public final void clear()
    {
        Arrays.fill(a, null);
        d = 0;
        for (bx bx1 = f; bx1 != this; bx1 = bx1.b())
        {
            bt.a((bu)bx1);
        }

        bt.a(this, this);
        e = e + 1;
    }

    public final boolean contains(Object obj)
    {
        int i = aj.a(obj);
        for (bu bu1 = a[a.length - 1 & i]; bu1 != null; bu1 = bu1.d)
        {
            if (bu1.a(obj, i))
            {
                return true;
            }
        }

        return false;
    }

    public final Iterator iterator()
    {
        return new bw(this);
    }

    public final boolean remove(Object obj)
    {
        int i = aj.a(obj);
        int j = i & a.length - 1;
        bu bu2 = null;
        bu bu3;
        for (bu bu1 = a[j]; bu1 != null; bu1 = bu3)
        {
            if (bu1.a(obj, i))
            {
                if (bu2 == null)
                {
                    a[j] = bu1.d;
                } else
                {
                    bu2.d = bu1.d;
                }
                bt.a(bu1);
                bt.a(bu1);
                d = d - 1;
                e = e + 1;
                return true;
            }
            bu3 = bu1.d;
            bu2 = bu1;
        }

        return false;
    }

    public final int size()
    {
        return d;
    }
}
