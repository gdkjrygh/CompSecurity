// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.SocketException;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public final class olc
    implements Callable
{

    private ExecutorService a;
    private olb b;

    public olc(olb olb1)
    {
        b = olb1;
        super();
        if (olb.a(olb1) == null)
        {
            a = Executors.newFixedThreadPool(4);
        }
    }

    private Void a()
    {
        if (olb.a(b) == null)
        {
            Thread.currentThread().setName("VideoServer");
        }
_L7:
        if (Thread.interrupted()) goto _L2; else goto _L1
_L1:
        Object obj;
        obj = olb.b(b).accept();
        obj = new FutureTask(new old(b, ((java.net.Socket) (obj))));
        if (olb.a(b) == null)
        {
            a.execute(((Runnable) (obj)));
            continue; /* Loop/switch isn't completed */
        }
          goto _L3
        obj;
        if (!((SocketException) (obj)).getMessage().equals("Socket closed"))
        {
            Log.e("VideoServer", "SocketException when accepting a new connection", ((Throwable) (obj)));
        }
        a.shutdownNow();
_L5:
        return null;
_L3:
        if (olb.c(b) != null)
        {
            olb.c(b).cancel(true);
        }
        olb.a(b, ((Future) (obj)));
        olb.a(b).execute(((Runnable) (obj)));
        continue; /* Loop/switch isn't completed */
        Object obj1;
        obj1;
        Log.e("VideoServer", "IOException when accepting a new connection", ((Throwable) (obj1)));
        a.shutdownNow();
        continue; /* Loop/switch isn't completed */
_L2:
        a.shutdownNow();
        if (true) goto _L5; else goto _L4
_L4:
        obj1;
        a.shutdownNow();
        throw obj1;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public final Object call()
    {
        return a();
    }
}
