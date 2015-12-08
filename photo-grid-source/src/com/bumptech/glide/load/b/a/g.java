// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.b.a;

import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.bumptech.glide.load.b.a:
//            h, m

final class g
{

    private final h a = new h();
    private final Map b = new HashMap();

    g()
    {
    }

    private static void a(h h1)
    {
        h1.a.b = h1;
        h1.b.a = h1;
    }

    private static void b(h h1)
    {
        h1.b.a = h1.a;
        h1.a.b = h1.b;
    }

    public final Object a()
    {
        for (h h1 = a.b; !h1.equals(a); h1 = h1.b)
        {
            Object obj = h1.a();
            if (obj != null)
            {
                return obj;
            }
            b(h1);
            b.remove(h.a(h1));
            ((m)h.a(h1)).a();
        }

        return null;
    }

    public final Object a(m m1)
    {
        h h1 = (h)b.get(m1);
        if (h1 == null)
        {
            h1 = new h(m1);
            b.put(m1, h1);
            m1 = h1;
        } else
        {
            m1.a();
            m1 = h1;
        }
        b(m1);
        m1.b = a;
        m1.a = a.a;
        a(((h) (m1)));
        return m1.a();
    }

    public final void a(m m1, Object obj)
    {
        h h1 = (h)b.get(m1);
        if (h1 == null)
        {
            h1 = new h(m1);
            b(h1);
            h1.b = a.b;
            h1.a = a;
            a(h1);
            b.put(m1, h1);
            m1 = h1;
        } else
        {
            m1.a();
            m1 = h1;
        }
        m1.a(obj);
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder("GroupedLinkedMap( ");
        h h1 = a.a;
        boolean flag = false;
        for (; !h1.equals(a); h1 = h1.a)
        {
            flag = true;
            stringbuilder.append('{').append(h.a(h1)).append(':').append(h1.b()).append("}, ");
        }

        if (flag)
        {
            stringbuilder.delete(stringbuilder.length() - 2, stringbuilder.length());
        }
        return stringbuilder.append(" )").toString();
    }
}
