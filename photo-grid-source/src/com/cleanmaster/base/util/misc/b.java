// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cleanmaster.base.util.misc;

import java.util.Map;

// Referenced classes of package com.cleanmaster.base.util.misc:
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
        return a.g;
    }

    protected final int a(Object obj)
    {
        if (obj == null)
        {
            return com.cleanmaster.base.util.misc.a.a(a);
        } else
        {
            return com.cleanmaster.base.util.misc.a.a(a, obj, obj.hashCode());
        }
    }

    protected final Object a(int i)
    {
        return a.f[i];
    }

    protected final Map b()
    {
        throw new UnsupportedOperationException("not a map");
    }

    protected final void b(int i)
    {
        a.c(i);
    }

    protected final void c()
    {
        a.clear();
    }
}
