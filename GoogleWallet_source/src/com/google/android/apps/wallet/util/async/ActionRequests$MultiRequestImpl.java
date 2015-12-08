// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.util.async;

import android.os.Handler;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.util.async:
//            ActionRequests, ActionExecutor, ActionRequest, AsyncCallback

static final class <init> extends <init>
{

    private final Callable actions[];
    private int completeCount;
    private Exception failureException;
    private final ActionRequest requests[];
    private final Object results[];

    private void submitAction(int i, ActionExecutor actionexecutor)
    {
        requests[i] = submitActionHelper(i, actions[i], actionexecutor);
    }

    private ActionRequest submitActionHelper(final int index, Callable callable, ActionExecutor actionexecutor)
    {
        return actionexecutor.executeAction(callable, new AsyncCallback() {

            final ActionRequests.MultiRequestImpl this$0;
            final int val$index;

            private void onComplete()
            {
                int i = ((access._cls302) (this)).access$302;
                if (completeCount == requests.length)
                {
                    complete(((Object) (results)), failureException);
                }
            }

            public final void onFailure(Exception exception)
            {
                if (failureException == null)
                {
                    failureException = exception;
                }
                onComplete();
            }

            public final void onSuccess(Object obj)
            {
                results[index] = obj;
                onComplete();
            }

            
            {
                this$0 = ActionRequests.MultiRequestImpl.this;
                index = i;
                super();
            }
        });
    }

    public final void cancel()
    {
        this;
        JVM INSTR monitorenter ;
        if (state != NG) goto _L2; else goto _L1
_L1:
        ActionRequest aactionrequest[];
        int j;
        aactionrequest = requests;
        j = aactionrequest.length;
        int i = 0;
_L3:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        aactionrequest[i].cancel();
        i++;
        if (true) goto _L3; else goto _L2
_L2:
        super.ancel();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    protected final void submit(ActionExecutor actionexecutor)
    {
        this;
        JVM INSTR monitorenter ;
        if (!isFinished())
        {
            break MISSING_BLOCK_LABEL_12;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        state = NG;
        this;
        JVM INSTR monitorexit ;
        for (int i = 0; i < actions.length; i++)
        {
            submitAction(i, actionexecutor);
        }

        break MISSING_BLOCK_LABEL_50;
        actionexecutor;
        this;
        JVM INSTR monitorexit ;
        throw actionexecutor;
    }




/*
    static Exception access$302(_cls1 _pcls1, Exception exception)
    {
        _pcls1.failureException = exception;
        return exception;
    }

*/



/*
    static int access$408(failureException failureexception)
    {
        int i = failureexception.completeCount;
        failureexception.completeCount = i + 1;
        return i;
    }

*/


    private _cls1.val.index(Callable acallable[], Handler handler)
    {
        super(handler);
        actions = (Callable[])acallable.clone();
        requests = new requests[actions.length];
        results = new Object[actions.length];
    }

    actions(Callable acallable[], Handler handler, actions actions1)
    {
        this(acallable, handler);
    }
}
