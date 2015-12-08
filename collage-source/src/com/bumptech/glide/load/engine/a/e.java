// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.engine.a;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.bumptech.glide.load.engine.a:
//            h

class e
{
    private static class a
    {

        a a;
        a b;
        private final Object c;
        private List d;

        static Object a(a a1)
        {
            return a1.c;
        }

        public Object a()
        {
            int i = b();
            if (i > 0)
            {
                return d.remove(i - 1);
            } else
            {
                return null;
            }
        }

        public void a(Object obj)
        {
            if (d == null)
            {
                d = new ArrayList();
            }
            d.add(obj);
        }

        public int b()
        {
            if (d != null)
            {
                return d.size();
            } else
            {
                return 0;
            }
        }

        public a()
        {
            this(null);
        }

        public a(Object obj)
        {
            b = this;
            a = this;
            c = obj;
        }
    }


    private final a a = new a();
    private final Map b = new HashMap();

    e()
    {
    }

    private void a(a a1)
    {
        d(a1);
        a1.b = a;
        a1.a = a.a;
        c(a1);
    }

    private void b(a a1)
    {
        d(a1);
        a1.b = a.b;
        a1.a = a;
        c(a1);
    }

    private static void c(a a1)
    {
        a1.a.b = a1;
        a1.b.a = a1;
    }

    private static void d(a a1)
    {
        a1.b.a = a1.a;
        a1.a.b = a1.b;
    }

    public Object a()
    {
        for (a a1 = a.b; !a1.equals(a); a1 = a1.b)
        {
            Object obj = a1.a();
            if (obj != null)
            {
                return obj;
            }
            d(a1);
            b.remove(a.a(a1));
            ((h)a.a(a1)).a();
        }

        return null;
    }

    public Object a(h h1)
    {
        a a1 = (a)b.get(h1);
        if (a1 == null)
        {
            a1 = new a(h1);
            b.put(h1, a1);
            h1 = a1;
        } else
        {
            h1.a();
            h1 = a1;
        }
        a(((a) (h1)));
        return h1.a();
    }

    public void a(h h1, Object obj)
    {
        a a1 = (a)b.get(h1);
        if (a1 == null)
        {
            a1 = new a(h1);
            b(a1);
            b.put(h1, a1);
            h1 = a1;
        } else
        {
            h1.a();
            h1 = a1;
        }
        h1.a(obj);
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder("GroupedLinkedMap( ");
        a a1 = a.a;
        boolean flag = false;
        for (; !a1.equals(a); a1 = a1.a)
        {
            flag = true;
            stringbuilder.append('{').append(a.a(a1)).append(':').append(a1.b()).append("}, ");
        }

        if (flag)
        {
            stringbuilder.delete(stringbuilder.length() - 2, stringbuilder.length());
        }
        return stringbuilder.append(" )").toString();
    }
}
