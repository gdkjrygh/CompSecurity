// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.c;

import b.a.a.a.d;
import com.a.a.c.a.a;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.a.a.c:
//            x, g

final class B
    implements Callable
{

    final x a;

    B(x x1)
    {
        a = x1;
        super();
    }

    public final Object call()
        throws Exception
    {
        if (!com.a.a.c.x.a(a).get())
        {
            d.a();
            g g1 = x.f(a);
            com.a.a.c.a.a.d d1 = null;
            if (g1.k != null)
            {
                d1 = g1.k.a();
            }
            if (d1 != null)
            {
                com.a.a.c.x.a(a, d1);
            }
            x.g(a);
            d.a();
            return Boolean.valueOf(true);
        } else
        {
            d.a();
            return Boolean.valueOf(false);
        }
    }
}
