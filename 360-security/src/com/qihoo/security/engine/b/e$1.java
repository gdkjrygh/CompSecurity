// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.engine.b;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.qihoo.security.engine.b:
//            e

class a.a
    implements ThreadFactory
{
    class a extends Thread
    {

        final e._cls1 a;

        public void run()
        {
            super.run();
        }

        public a(Runnable runnable, String s)
        {
            a = e._cls1.this;
            super(runnable, s);
        }
    }


    private final AtomicInteger a = new AtomicInteger(1);

    public Thread newThread(Runnable runnable)
    {
        return new a(runnable, (new StringBuilder("TaskWorkThread #")).append(a.getAndIncrement()).toString());
    }

    a.a()
    {
    }
}
