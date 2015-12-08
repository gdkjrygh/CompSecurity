// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.g;

import java.util.Hashtable;

// Referenced classes of package com.kik.g:
//            k, m, p, e

public final class l
{
    public final class a
    {

        public final long a;
        public int b;
        public String c;
        final l d;

        public a(long l2)
        {
            d = l.this;
            super();
            b = p.a.a;
            a = l2;
        }
    }


    private long a;
    private Hashtable b;
    private k c;

    public l()
    {
        a = 0L;
        b = new Hashtable();
        c = new k(this);
    }

    static k a(l l1)
    {
        return l1.c;
    }

    public final int a(long l1)
    {
        if (b.containsKey(Long.valueOf(l1)))
        {
            a a1 = (a)b.get(Long.valueOf(l1));
            if (a1 == null)
            {
                return 0;
            } else
            {
                return a1.b;
            }
        } else
        {
            return 0;
        }
    }

    public final long a(p p1)
    {
        a a1 = new a(a);
        p1.a(new m(this, a1));
        b.put(Long.valueOf(a), a1);
        a = a + 1L;
        return a1.a;
    }

    public final e a()
    {
        return c.a();
    }
}
