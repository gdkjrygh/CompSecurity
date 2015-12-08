// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.util.async;

import java.util.LinkedList;
import java.util.concurrent.Executor;

// Referenced classes of package com.google.android.apps.wallet.util.async:
//            SequentialExecutor

final class this._cls0
    implements Runnable
{

    final SequentialExecutor this$0;

    public final void run()
    {
_L2:
        Object obj = SequentialExecutor.access$000(SequentialExecutor.this);
        obj;
        JVM INSTR monitorenter ;
        Runnable runnable = (Runnable)SequentialExecutor.access$100(SequentialExecutor.this).poll();
        if (runnable != null)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        SequentialExecutor.access$202(SequentialExecutor.this, false);
        obj;
        JVM INSTR monitorexit ;
        return;
        obj;
        JVM INSTR monitorexit ;
        Exception exception;
        try
        {
            runnable.run();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            SequentialExecutor.access$300(SequentialExecutor.this).execute(this);
            throw obj;
        }
        catch (Error error)
        {
            SequentialExecutor.access$300(SequentialExecutor.this).execute(this);
            throw error;
        }
        catch (Throwable throwable)
        {
            SequentialExecutor.access$300(SequentialExecutor.this).execute(this);
            throw new Error(throwable);
        }
        if (true) goto _L2; else goto _L1
_L1:
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    ()
    {
        this$0 = SequentialExecutor.this;
        super();
    }
}
