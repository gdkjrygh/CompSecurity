// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.common.threading;

import android.os.Process;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class c
    implements ThreadFactory
{

    private final int a;
    private final AtomicInteger b;
    private final String c;

    static int a(c c1)
    {
        return c1.a;
    }

    public Thread newThread(Runnable runnable)
    {
        return new PriorityThreadFactory._cls1(runnable, (new StringBuilder()).append(c).append('-').append(b.getAndIncrement()).toString());
    }

    // Unreferenced inner class com/aviary/android/feather/common/threading/PriorityThreadFactory$1

/* anonymous class */
    class PriorityThreadFactory._cls1 extends Thread
    {

        final c a;

        public void run()
        {
            Process.setThreadPriority(c.a(a));
            super.run();
        }

            
            {
                a = c.this;
                super(runnable, s);
            }
    }

}
