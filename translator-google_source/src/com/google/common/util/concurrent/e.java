// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.util.concurrent;

import com.google.common.base.d;
import com.google.common.base.p;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Ordering;

// Referenced classes of package com.google.common.util.concurrent:
//            g, i, k, f, 
//            t, m, j, s, 
//            q, h, a, d

public final class e
{

    private static final a a = new g();
    private static final Ordering b = Ordering.natural().onResultOf(new i()).reverse();

    public static t a(t t1, d d)
    {
        p.a(d);
        d = new k(new f(d), t1);
        t1.a(d, MoreExecutors.DirectExecutor.INSTANCE);
        return d;
    }

    public static t a(Iterable iterable)
    {
        return new m(ImmutableList.copyOf(iterable), MoreExecutors.DirectExecutor.INSTANCE, new j());
    }

    public static t a(Object obj)
    {
        return new s(obj);
    }

    public static t a(Throwable throwable)
    {
        p.a(throwable);
        return new q(throwable);
    }

    public static void a(t t1, com.google.common.util.concurrent.d d)
    {
        MoreExecutors.DirectExecutor directexecutor = MoreExecutors.DirectExecutor.INSTANCE;
        p.a(d);
        t1.a(new h(t1, d), directexecutor);
    }

}
