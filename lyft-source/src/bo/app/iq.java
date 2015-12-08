// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

// Referenced classes of package bo.app:
//            js, jy, ir

public final class iq
{

    public static Executor a(int i, int j, int k)
    {
        Object obj;
        if (k == js.b)
        {
            k = 1;
        } else
        {
            k = 0;
        }
        if (k != 0)
        {
            obj = new jy();
        } else
        {
            obj = new LinkedBlockingQueue();
        }
        obj = (BlockingQueue)obj;
        return new ThreadPoolExecutor(i, i, 0L, TimeUnit.MILLISECONDS, ((BlockingQueue) (obj)), new ir(j));
    }
}
