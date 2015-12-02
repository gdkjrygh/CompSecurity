// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.executors;

import com.facebook.debug.d.e;
import com.facebook.debug.log.b;
import com.google.common.d.a.t;
import java.util.concurrent.Callable;

// Referenced classes of package com.facebook.common.executors:
//            n, o

class q
    implements Runnable
{

    final Object a;
    final Object b;
    final String c;
    private t d;

    private q(Object obj, Object obj1, Callable callable, String s)
    {
        d = t.a(callable);
        a = obj;
        b = obj1;
        c = s;
    }

    q(Object obj, Object obj1, Callable callable, String s, o o)
    {
        this(obj, obj1, callable, s);
    }

    static t a(q q1)
    {
        return q1.d;
    }

    public void run()
    {
        Object obj;
        e.b(50L);
        String s = (new StringBuilder()).append("KeyedExecutor ").append(a).toString();
        obj = s;
        if (c != null)
        {
            obj = (new StringBuilder()).append(s).append(" (").append(c).append(")").toString();
        }
        obj = e.a(((String) (obj)));
        d.run();
        long l = ((e) (obj)).a();
        if (com.facebook.debug.log.b.b(3) && l > 50L)
        {
            com.facebook.debug.log.b.b(n.a(), (new StringBuilder()).append("Thread trace:\n").append(e.c()).toString());
        }
        return;
        Exception exception;
        exception;
        long l1 = ((e) (obj)).a();
        if (com.facebook.debug.log.b.b(3) && l1 > 50L)
        {
            com.facebook.debug.log.b.b(n.a(), (new StringBuilder()).append("Thread trace:\n").append(e.c()).toString());
        }
        throw exception;
    }
}
