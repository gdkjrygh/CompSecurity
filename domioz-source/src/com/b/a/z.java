// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a;

import android.util.Log;
import com.b.b.b;
import com.b.b.c;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

// Referenced classes of package com.b.a:
//            y, e

final class z extends y
{

    e h;
    int i;
    private b j;

    public transient z(c c1, int ai[])
    {
        super(c1, (byte)0);
        a(ai);
        if (c1 instanceof b)
        {
            j = (b)b;
        }
    }

    public transient z(String s, int ai[])
    {
        super(s, (byte)0);
        a(ai);
    }

    private z d()
    {
        z z1 = (z)super.a();
        z1.h = (e)z1.e;
        return z1;
    }

    public final y a()
    {
        return d();
    }

    final void a(float f)
    {
        i = h.b(f);
    }

    final void a(Class class1)
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

    public final transient void a(int ai[])
    {
        super.a(ai);
        h = (e)e;
    }

    final void b(Object obj)
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
                    Log.e("PropertyValuesHolder", ((InvocationTargetException) (obj)).toString());
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    Log.e("PropertyValuesHolder", ((IllegalAccessException) (obj)).toString());
                }
                return;
            }
        }
    }

    final Object c()
    {
        return Integer.valueOf(i);
    }

    public final Object clone()
    {
        return d();
    }
}
