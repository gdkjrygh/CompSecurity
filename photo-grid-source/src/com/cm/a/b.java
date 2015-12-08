// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cm.a;

import java.util.Map;

// Referenced classes of package com.cm.a:
//            d, a

final class b extends d
{

    final a a;

    b(a a1)
    {
        a = a1;
        super();
    }

    protected final int a()
    {
        return a.i;
    }

    protected final int a(Object obj)
    {
        if (obj == null)
        {
            return a.a();
        } else
        {
            return a.a(obj, obj.hashCode());
        }
    }

    protected final Object a(int i, int j)
    {
        return a.h[(i << 1) + j];
    }

    protected final Object a(int i, Object obj)
    {
        a a1 = a;
        i = (i << 1) + 1;
        Object obj1 = a1.h[i];
        a1.h[i] = obj;
        return obj1;
    }

    protected final void a(int i)
    {
        a.a(i);
    }

    protected final void a(Object obj, Object obj1)
    {
        a.put(obj, obj1);
    }

    protected final int b(Object obj)
    {
        return a.a(obj);
    }

    protected final Map b()
    {
        return a;
    }

    protected final void c()
    {
        a.clear();
    }
}
