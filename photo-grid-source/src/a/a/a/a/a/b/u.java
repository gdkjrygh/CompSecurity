// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a.a.a.a.b;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

// Referenced classes of package a.a.a.a.a.b:
//            v

final class u
    implements ThreadFactory
{

    final String a;
    final AtomicLong b;

    u(String s, AtomicLong atomiclong)
    {
        a = s;
        b = atomiclong;
        super();
    }

    public final Thread newThread(Runnable runnable)
    {
        runnable = Executors.defaultThreadFactory().newThread(new v(this, runnable));
        runnable.setName((new StringBuilder()).append(a).append(b.getAndIncrement()).toString());
        return runnable;
    }
}
