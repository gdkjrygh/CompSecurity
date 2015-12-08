// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a.c;

import java.util.Date;
import java.util.concurrent.Callable;

// Referenced classes of package com.b.a.c:
//            aa

final class am
    implements Callable
{

    final Date a;
    final Thread b;
    final Throwable c;
    final aa d;

    am(aa aa1, Date date, Thread thread, Throwable throwable)
    {
        d = aa1;
        a = date;
        b = thread;
        c = throwable;
        super();
    }

    public final Object call()
    {
        aa.a(d, a, b, c);
        return null;
    }
}
