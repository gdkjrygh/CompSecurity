// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.c;

import java.util.Date;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.a.a.c:
//            x

public final class M
    implements Runnable
{

    final Date a;
    final Thread b;
    final Throwable c;
    final x d;

    public M(x x1, Date date, Thread thread, Throwable throwable)
    {
        d = x1;
        a = date;
        b = thread;
        c = throwable;
        super();
    }

    public final void run()
    {
        if (!x.a(d).get())
        {
            x.b(d, a, b, c);
        }
    }
}
