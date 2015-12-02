// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class btv
{

    private static final int a;
    private static int b;
    private static int c;

    private btv()
    {
        new btw((byte)0);
    }

    public static ThreadPoolExecutor a()
    {
        ThreadPoolExecutor threadpoolexecutor = new ThreadPoolExecutor(b, c, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        if (android.os.Build.VERSION.SDK_INT >= 9)
        {
            threadpoolexecutor.allowCoreThreadTimeOut(true);
        }
        return threadpoolexecutor;
    }

    static 
    {
        new btv();
        int i = Runtime.getRuntime().availableProcessors();
        a = i;
        b = i + 1;
        c = (a << 1) + 1;
    }
}
