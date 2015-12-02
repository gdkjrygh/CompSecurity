// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nineoldandroids.a;

import com.nineoldandroids.util.a;
import com.nineoldandroids.util.c;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

// Referenced classes of package com.nineoldandroids.a:
//            m, f

static class a extends m
{

    f h;
    float i;
    private a j;

    public m a()
    {
        return e();
    }

    void a(float f1)
    {
        i = h.b(f1);
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

    public transient void a(float af[])
    {
        super.a(af);
        h = (f)e;
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
                b.a(obj, Float.valueOf(i));
                return;
            }
            if (c != null)
            {
                try
                {
                    g[0] = Float.valueOf(i);
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
        return Float.valueOf(i);
    }

    public i e()
    {
        i k = (i)super.a();
        k.h = (f)k.e;
        return k;
    }

    public transient (c c1, float af[])
    {
        super(c1, null);
        a(af);
        if (c1 instanceof a)
        {
            j = (a)b;
        }
    }

    public transient b(String s, float af[])
    {
        super(s, null);
        a(af);
    }
}
