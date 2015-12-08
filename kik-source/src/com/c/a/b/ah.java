// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a.b;

import java.util.Iterator;

// Referenced classes of package com.c.a.b:
//            o, p, h, v, 
//            q, m, af, ao

final class ah extends o
{
    private final class a extends q
    {

        final ah a;

        public final ao a()
        {
            return c().a();
        }

        final m e()
        {
            return new af(this, ah.a(a));
        }

        final o f()
        {
            return a;
        }

        public final Iterator iterator()
        {
            return c().a();
        }

        private a()
        {
            a = ah.this;
            super();
        }

        a(byte byte0)
        {
            this();
        }
    }

    private static final class b extends p
    {

        private final p c;

        final p a()
        {
            return c;
        }

        b(p p1, p p2)
        {
            super(p1);
            c = p2;
        }
    }


    private final transient p a[];
    private final transient p b[];
    private final transient int c;

    ah(int i, p.a aa[])
    {
        a = new p[i];
        int j = h.b(i);
        b = new p[j];
        c = j - 1;
        for (int k = 0; k < i; k++)
        {
            Object obj = aa[k];
            Object obj2 = ((p.a) (obj)).getKey();
            int l = h.a(obj2.hashCode()) & c;
            Object obj1 = b[l];
            if (obj1 != null)
            {
                obj = new b(((p) (obj)), ((p) (obj1)));
            }
            b[l] = ((p) (obj));
            a[k] = ((p) (obj));
            boolean flag;
            for (; obj1 != null; obj1 = ((p) (obj1)).a())
            {
                if (!obj2.equals(((p) (obj1)).getKey()))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (!flag)
                {
                    aa = String.valueOf(String.valueOf("key"));
                    obj = String.valueOf(String.valueOf(obj));
                    obj1 = String.valueOf(String.valueOf(obj1));
                    throw new IllegalArgumentException((new StringBuilder(aa.length() + 34 + ((String) (obj)).length() + ((String) (obj1)).length())).append("Multiple entries with same ").append(aa).append(": ").append(((String) (obj))).append(" and ").append(((String) (obj1))).toString());
                }
            }

        }

    }

    static p[] a(ah ah1)
    {
        return ah1.a;
    }

    final v c()
    {
        return new a((byte)0);
    }

    public final Object get(Object obj)
    {
        if (obj != null)
        {
            int i = h.a(obj.hashCode());
            int j = c;
            p p1 = b[i & j];
            while (p1 != null) 
            {
                if (obj.equals(p1.getKey()))
                {
                    return p1.getValue();
                }
                p1 = p1.a();
            }
        }
        return null;
    }

    public final int size()
    {
        return a.length;
    }
}
