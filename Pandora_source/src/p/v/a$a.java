// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.v;

import android.os.Process;
import java.util.concurrent.ThreadFactory;

// Referenced classes of package p.v:
//            a

public static class a
    implements ThreadFactory
{

    int a;

    public Thread newThread(Runnable runnable)
    {
        runnable = new Thread(runnable, (new StringBuilder()).append("fifo-pool-thread-").append(a).toString()) {

            final a.a a;

            public void run()
            {
                Process.setThreadPriority(10);
                super.run();
            }

            
            {
                a = a.a.this;
                super(runnable, s);
            }
        };
        a = a + 1;
        return runnable;
    }

    public le()
    {
        a = 0;
    }
}
