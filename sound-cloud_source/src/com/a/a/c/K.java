// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.c;

import java.util.Date;
import java.util.concurrent.Callable;

// Referenced classes of package com.a.a.c:
//            x

final class K
    implements Callable
{

    final Date a;
    final Thread b;
    final Throwable c;
    final x d;

    K(x x1, Date date, Thread thread, Throwable throwable)
    {
        d = x1;
        a = date;
        b = thread;
        c = throwable;
        super();
    }

    public final Object call()
        throws Exception
    {
        x.a(d, a, b, c);
        return null;
    }
}
