// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.c;

import b.a.a.a.d;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.a.a.c:
//            x, g

final class aa
    implements Callable
{

    final x a;

    aa(x x1)
    {
        a = x1;
        super();
    }

    public final Object call()
    {
        if (!x.a(a).get())
        {
            com.a.a.c.a.a.d d1 = com.a.a.c.x.d(a).p();
            if (d1 != null)
            {
                x.a(a, d1);
            }
            x.e(a);
            x.c(a);
            d.c();
            return Boolean.valueOf(true);
        } else
        {
            d.c();
            return Boolean.valueOf(false);
        }
    }
}
