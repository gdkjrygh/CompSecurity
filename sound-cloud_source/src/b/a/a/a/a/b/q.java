// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a.a.a.a.b;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

// Referenced classes of package b.a.a.a.a.b:
//            r

final class q
    implements ThreadFactory
{

    final String a;
    final AtomicLong b;

    q(String s, AtomicLong atomiclong)
    {
        a = s;
        b = atomiclong;
        super();
    }

    public final Thread newThread(Runnable runnable)
    {
        runnable = Executors.defaultThreadFactory().newThread(new r(this, runnable));
        runnable.setName((new StringBuilder()).append(a).append(b.getAndIncrement()).toString());
        return runnable;
    }
}
