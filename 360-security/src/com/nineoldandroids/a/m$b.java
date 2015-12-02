// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nineoldandroids.a;

import com.nineoldandroids.util.b;
import com.nineoldandroids.util.c;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

// Referenced classes of package com.nineoldandroids.a:
//            m, h

static class a extends m
{

    h h;
    int i;
    private b j;

    public m a()
    {
        return e();
    }

    void a(float f)
    {
        i = h.b(f);
    }

    void a(Class class1)
    {
        if (b != null)
        {
            return;
        } else
        {
            super.a(class1);
            return;
        }
    }

    public transient void a(int ai[])
    {
        super.a(ai);
        h = (h)e;
    }

    void b(Object obj)
    {
        if (j != null)
        {
            j.a(obj, i);
        } else
        {
            if (b != null)
            {
                b.a(obj, Integer.valueOf(i));
                return;
            }
            if (c != null)
            {
                try
                {
                    g[0] = Integer.valueOf(i);
                    c.invoke(obj, g);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    return;
                }
            }
        }
    }

    Object d()
    {
        return Integer.valueOf(i);
    }

    public i e()
    {
        i k = (i)super.a();
        k.h = (h)k.e;
        return k;
    }

    public transient (c c1, int ai[])
    {
        super(c1, null);
        a(ai);
        if (c1 instanceof b)
        {
            j = (b)b;
        }
    }

    public transient b(String s, int ai[])
    {
        super(s, null);
        a(ai);
    }
}
