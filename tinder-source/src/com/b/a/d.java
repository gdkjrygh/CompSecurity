// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a;

import com.b.a.a.a;
import com.b.a.a.b;
import com.b.a.a.c;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.b.a:
//            a, c

public final class d
{

    final Iterator a;

    private d(Iterable iterable)
    {
        this(iterable.iterator());
    }

    private d(Iterator iterator)
    {
        a = iterator;
    }

    public static d a(Iterable iterable)
    {
        return new d(iterable);
    }

    public static d a(List list)
    {
        return new d(new Iterator(list) {

            final List a;
            private int b;

            public final boolean hasNext()
            {
                return b < a.size();
            }

            public final Object next()
            {
                List list1 = a;
                int i = b;
                b = i + 1;
                return list1.get(i);
            }

            
            {
                a = list;
                super();
                b = 0;
            }
        });
    }

    public final long a()
    {
        long l;
        for (l = 0L; a.hasNext(); l++)
        {
            a.next();
        }

        return l;
    }

    public final d a(b b1)
    {
        return new d(new Iterator(b1) {

            final b a;
            final d b;
            private Object c;

            public final boolean hasNext()
            {
                while (b.a.hasNext()) 
                {
                    c = b.a.next();
                    if (a.test(c))
                    {
                        return true;
                    }
                }
                return false;
            }

            public final Object next()
            {
                return c;
            }

            
            {
                b = d.this;
                a = b1;
                super();
            }
        });
    }

    public final Object a(com.b.a.a a1)
    {
        Object obj = a1.().a();
        Object obj1;
        for (; a.hasNext(); a1.().a(obj, obj1))
        {
            obj1 = a.next();
        }

        return obj;
    }

    public final com.b.a.c b()
    {
        if (a.hasNext())
        {
            return com.b.a.c.a(a.next());
        } else
        {
            return com.b.a.c.a();
        }
    }

    public final boolean b(b b1)
    {
        boolean flag1 = false;
        boolean flag;
        do
        {
            flag = flag1;
            if (!a.hasNext())
            {
                break;
            }
            boolean flag2 = b1.test(a.next());
            if (!(flag2 ^ false))
            {
                continue;
            }
            flag = flag1;
            if (flag2)
            {
                flag = true;
            }
            break;
        } while (true);
        return flag;
    }
}
