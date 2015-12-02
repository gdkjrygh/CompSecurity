// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.engine.b;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.qihoo.security.engine.b:
//            e

class a extends Thread
{

    final a a;

    public void run()
    {
        super.run();
    }

    public Integer(Integer integer, Runnable runnable, String s)
    {
        a = integer;
        super(runnable, s);
    }

    // Unreferenced inner class com/qihoo/security/engine/b/e$1

/* anonymous class */
    class e._cls1
        implements ThreadFactory
    {

        private final AtomicInteger a = new AtomicInteger(1);

        public Thread newThread(Runnable runnable)
        {
            return new e._cls1.a(this, runnable, (new StringBuilder("TaskWorkThread #")).append(a.getAndIncrement()).toString());
        }

    }

}
