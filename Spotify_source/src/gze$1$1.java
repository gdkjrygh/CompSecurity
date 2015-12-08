// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

final class t> extends gyy
{

    private Runnable a;

    public final void a()
    {
        a.run();
    }

    g.Runnable(Runnable runnable)
    {
        a = runnable;
        super();
    }

    // Unreferenced inner class gze$1

/* anonymous class */
    final class gze._cls1
        implements ThreadFactory
    {

        private String a;
        private AtomicLong b;

        public final Thread newThread(Runnable runnable)
        {
            runnable = Executors.defaultThreadFactory().newThread(new gze._cls1._cls1(runnable));
            runnable.setName((new StringBuilder()).append(a).append(b.getAndIncrement()).toString());
            return runnable;
        }

            
            {
                a = s;
                b = atomiclong;
                super();
            }
    }

}
