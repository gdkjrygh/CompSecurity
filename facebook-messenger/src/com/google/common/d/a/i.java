// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.d.a;

import com.google.common.a.es;
import com.google.common.a.jq;
import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import java.util.concurrent.Executor;

// Referenced classes of package com.google.common.d.a:
//            m, w, n, s, 
//            p, ab, l, k, 
//            h

public final class i
{

    private static final jq a = jq.b().a(new m()).a();

    private i()
    {
    }

    public static s a(s s1, Function function)
    {
        return b(s1, function, w.a());
    }

    public static s a(s s1, Function function, Executor executor)
    {
        function = new n(function, s1, null);
        s1.a(function, executor);
        return function;
    }

    public static s a(Iterable iterable)
    {
        return new p(es.a(iterable), true, w.a());
    }

    public static s a(Object obj)
    {
        ab ab1 = ab.a();
        ab1.a_(obj);
        return ab1;
    }

    public static transient s a(s as[])
    {
        return new p(es.a(as), true, w.a());
    }

    public static void a(s s1, h h)
    {
        a(s1, h, ((Executor) (w.a())));
    }

    public static void a(s s1, h h, Executor executor)
    {
        Preconditions.checkNotNull(h);
        s1.a(new l(s1, h), executor);
    }

    public static s b(s s1, Function function, Executor executor)
    {
        Preconditions.checkNotNull(function);
        return a(s1, new k(function), executor);
    }

}
