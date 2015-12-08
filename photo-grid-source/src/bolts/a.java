// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bolts;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

// Referenced classes of package bolts:
//            b

final class a
{

    static final int a;
    static final int b;
    private static final a c = new a();
    private static final int e;
    private final Executor d = new b((byte)0);

    private a()
    {
    }

    public static ExecutorService a()
    {
        ThreadPoolExecutor threadpoolexecutor = new ThreadPoolExecutor(a, b, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        if (android.os.Build.VERSION.SDK_INT >= 9)
        {
            threadpoolexecutor.allowCoreThreadTimeOut(true);
        }
        return threadpoolexecutor;
    }

    public static Executor b()
    {
        return c.d;
    }

    static 
    {
        int i = Runtime.getRuntime().availableProcessors();
        e = i;
        a = i + 1;
        b = e * 2 + 1;
    }
}
