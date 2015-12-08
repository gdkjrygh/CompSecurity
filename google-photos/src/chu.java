// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.opengl.GLES20;
import android.util.Log;
import java.util.Queue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.FutureTask;

public final class chu
    implements Runnable
{

    private final ExecutorService a;
    private final Queue b;
    private final Context c;
    private chq d;

    public chu(chq chq1, ExecutorService executorservice, Queue queue, Context context)
    {
        d = chq1;
        super();
        a = (ExecutorService)b.a(executorservice, "executorService", null);
        b = (Queue)b.a(queue, "pendingFutureTasks", null);
        c = (Context)b.a(context, "context", null);
    }

    public final void run()
    {
        chq.b(d).await();
        Object obj = chq.j(d);
        obj;
        JVM INSTR monitorenter ;
        if (a == chq.k(d))
        {
            break MISSING_BLOCK_LABEL_101;
        }
        a.shutdownNow();
_L2:
        FutureTask futuretask = (FutureTask)b.poll();
        if (futuretask == null)
        {
            break MISSING_BLOCK_LABEL_98;
        }
        if (!futuretask.cancel(false)) goto _L2; else goto _L1
_L1:
        Log.w(chq.k(), "pending synchronous task had to be cancelled");
          goto _L2
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        try
        {
            throw exception;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.e(chq.k(), "Error initializing render context.", ((Throwable) (obj)));
        }
        return;
        obj;
        JVM INSTR monitorexit ;
        return;
        chq.a(d, new CountDownLatch(1));
        obj;
        JVM INSTR monitorexit ;
        chq.a(d, new cid(c));
        chq.a(d, false);
        int ai[] = new int[1];
        GLES20.glGetIntegerv(3379, ai, 0);
        chq.b(d, ai[0]);
        return;
    }
}
