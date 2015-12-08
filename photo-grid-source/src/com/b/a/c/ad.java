// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a.c;

import a.a.a.a.f;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.b.a.c:
//            aa, h

final class ad
    implements Callable
{

    final aa a;

    ad(aa aa1)
    {
        a = aa1;
        super();
    }

    public final Object call()
    {
        if (!aa.a(a).get())
        {
            f.d();
            com.b.a.c.a.a.d d = aa.c(a).p();
            if (d != null)
            {
                aa.a(a, d);
            }
            aa.d(a);
            f.d();
            return Boolean.valueOf(true);
        } else
        {
            f.d();
            return Boolean.valueOf(false);
        }
    }
}
