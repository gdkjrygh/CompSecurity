// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.b;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.c.b:
//            as, bp, bg, bd

public final class bn
    implements as.b
{
    private static final class a extends AbstractList
        implements List
    {

        bn a;

        final void a()
        {
            modCount = modCount + 1;
        }

        public final Object get(int i)
        {
            return a.b(i);
        }

        public final int size()
        {
            return a.c();
        }
    }

    private static final class b extends AbstractList
        implements List
    {

        bn a;

        final void a()
        {
            modCount = modCount + 1;
        }

        public final Object get(int i)
        {
            return a.a(i);
        }

        public final int size()
        {
            return a.c();
        }
    }

    private static final class c extends AbstractList
        implements List
    {

        bn a;

        final void a()
        {
            modCount = modCount + 1;
        }

        public final Object get(int i)
        {
            return a.c(i);
        }

        public final int size()
        {
            return a.c();
        }
    }


    private as.b a;
    private List b;
    private boolean c;
    private List d;
    private boolean e;
    private b f;
    private a g;
    private c h;

    public bn(List list, boolean flag, as.b b1, boolean flag1)
    {
        b = list;
        c = flag;
        a = b1;
        e = flag1;
    }

    private as a(int i, boolean flag)
    {
        if (d == null)
        {
            return (as)b.get(i);
        }
        bp bp1 = (bp)d.get(i);
        if (bp1 == null)
        {
            return (as)b.get(i);
        }
        if (flag)
        {
            return bp1.c();
        } else
        {
            return bp1.b();
        }
    }

    private void f()
    {
        if (!c)
        {
            b = new ArrayList(b);
            c = true;
        }
    }

    private void g()
    {
        if (e && a != null)
        {
            a.a();
            e = false;
        }
    }

    private void h()
    {
        if (f != null)
        {
            f.a();
        }
        if (g != null)
        {
            g.a();
        }
        if (h != null)
        {
            h.a();
        }
    }

    public final as a(int i)
    {
        return a(i, false);
    }

    public final bn a(as as1)
    {
        if (as1 == null)
        {
            throw new NullPointerException();
        }
        f();
        b.add(as1);
        if (d != null)
        {
            d.add(null);
        }
        g();
        h();
        return this;
    }

    public final bn a(Iterable iterable)
    {
        for (Iterator iterator = iterable.iterator(); iterator.hasNext();)
        {
            if ((as)iterator.next() == null)
            {
                throw new NullPointerException();
            }
        }

        int i;
        if (iterable instanceof Collection)
        {
            Collection collection = (Collection)iterable;
            if (collection.size() == 0)
            {
                return this;
            }
            i = collection.size();
        } else
        {
            i = -1;
        }
        f();
        if (i >= 0 && (b instanceof ArrayList))
        {
            ((ArrayList)b).ensureCapacity(i + b.size());
        }
        for (iterable = iterable.iterator(); iterable.hasNext(); a((as)iterable.next())) { }
        g();
        h();
        return this;
    }

    public final void a()
    {
        g();
    }

    public final as.a b(int i)
    {
        if (d == null)
        {
            d = new ArrayList(b.size());
            for (int j = 0; j < b.size(); j++)
            {
                d.add(null);
            }

        }
        bp bp2 = (bp)d.get(i);
        bp bp1 = bp2;
        if (bp2 == null)
        {
            bp1 = new bp((as)b.get(i), this, e);
            d.set(i, bp1);
        }
        return bp1.d();
    }

    public final void b()
    {
        a = null;
    }

    public final int c()
    {
        return b.size();
    }

    public final bg c(int i)
    {
        if (d == null)
        {
            return (bg)b.get(i);
        }
        bp bp1 = (bp)d.get(i);
        if (bp1 == null)
        {
            return (bg)b.get(i);
        } else
        {
            return bp1.e();
        }
    }

    public final boolean d()
    {
        return b.isEmpty();
    }

    public final List e()
    {
        e = true;
        if (!c && d == null)
        {
            return b;
        }
        if (c) goto _L2; else goto _L1
_L1:
        int i = 0;
_L5:
        bd bd1;
        bp bp1;
        if (i >= b.size())
        {
            break MISSING_BLOCK_LABEL_168;
        }
        bd1 = (bd)b.get(i);
        bp1 = (bp)d.get(i);
        if (bp1 == null || bp1.c() == bd1) goto _L4; else goto _L3
_L3:
        i = 0;
_L6:
        if (i != 0)
        {
            return b;
        }
          goto _L2
_L4:
        i++;
          goto _L5
_L2:
        f();
        for (i = 0; i < b.size(); i++)
        {
            b.set(i, a(i, true));
        }

        b = Collections.unmodifiableList(b);
        c = false;
        return b;
        i = 1;
          goto _L6
    }
}
