// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.baselib.c;

import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.roidapp.baselib.c:
//            ak

public final class t
{

    private static AbstractExecutorService a;
    private static AbstractExecutorService b;

    public static AbstractExecutorService a()
    {
        return a;
    }

    public static AbstractExecutorService b()
    {
        return b;
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT > 4)
        {
            ak ak1 = new ak(2, 2, TimeUnit.SECONDS, new LinkedBlockingQueue());
            a = ak1;
            ((ak)ak1).b();
            ak1 = new ak(1, 1, TimeUnit.SECONDS, new LinkedBlockingQueue());
            b = ak1;
            ((ak)ak1).b();
        } else
        {
            a = new ThreadPoolExecutor(1, 1, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue());
            b = new ThreadPoolExecutor(1, 1, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        }
    }
}
