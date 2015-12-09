// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.util.async;

import android.os.Handler;
import com.google.common.base.Throwables;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.util.async:
//            ActionRequests, ActionExecutor

static final class <init> extends est
{

    private final Callable action;

    private void postCallbacks(final Object result, final Exception exception)
    {
        callbackHandler.post(new Runnable() {

            final ActionRequests.RequestImpl this$0;
            final Exception val$exception;
            final Object val$result;

            public final void run()
            {
                complete(result, exception);
            }

            
            {
                this$0 = ActionRequests.RequestImpl.this;
                result = obj;
                exception = exception1;
                super();
            }
        });
    }

    protected final void submit(ActionExecutor actionexecutor)
    {
        actionexecutor.execute(new Runnable() {

            final ActionRequests.RequestImpl this$0;

            public final void run()
            {
label0:
                {
                    synchronized (ActionRequests.RequestImpl.this)
                    {
                        if (state != ActionRequest.RequestState.CANCELLED)
                        {
                            break label0;
                        }
                    }
                    return;
                }
                state = ActionRequest.RequestState.RUNNING;
                obj;
                JVM INSTR monitorexit ;
                Object obj1;
                obj1 = null;
                obj = null;
                Object obj2 = action.call();
                obj1 = obj2;
_L2:
                postCallbacks(obj1, ((Exception) (obj)));
                return;
                exception;
                obj;
                JVM INSTR monitorexit ;
                throw exception;
                obj;
                Throwables.propagateIfPossible(((Throwable) (obj)));
                if (true) goto _L2; else goto _L1
_L1:
            }

            
            {
                this$0 = ActionRequests.RequestImpl.this;
                super();
            }
        });
    }



    private _cls2.val.exception(Callable callable, Handler handler)
    {
        super(handler);
        action = callable;
    }

    action(Callable callable, Handler handler, action action1)
    {
        this(callable, handler);
    }
}
