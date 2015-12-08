// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.util.async;

import android.os.Handler;
import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import java.util.Queue;

// Referenced classes of package com.google.android.apps.wallet.util.async:
//            ActionRequest, ActionRequests, ThreadPreconditions, AsyncCallback, 
//            ActionExecutor

static abstract class callbackHandler
    implements ActionRequest
{

    protected final Handler callbackHandler;
    private Queue callbackList;
    private Exception exception;
    private final Queue finishedCallbackList = Lists.newLinkedList();
    private Object result;
    protected nished state;

    private void ensureOnCallbackLooperThread()
    {
        ThreadPreconditions.checkOnThread(callbackHandler.getLooper(), "Must be on the same thread as the callback handler");
    }

    private void finish(callbackHandler callbackhandler)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag;
        if (!isFinished())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag);
        Preconditions.checkArgument(callbackhandler.nished());
        state = callbackhandler;
        for (; !finishedCallbackList.isEmpty(); ((finishedCallbackList)finishedCallbackList.poll()).onFinished()) { }
        break MISSING_BLOCK_LABEL_69;
        callbackhandler;
        throw callbackhandler;
        this;
        JVM INSTR monitorexit ;
    }

    public final void addCallback(AsyncCallback asynccallback)
    {
        ensureOnCallbackLooperThread();
        Preconditions.checkNotNull(asynccallback);
        if (isFinished())
        {
            if (exception != null)
            {
                asynccallback.onFailure(exception);
                return;
            } else
            {
                asynccallback.onSuccess(result);
                return;
            }
        } else
        {
            callbackList.add(asynccallback);
            return;
        }
    }

    final void addFinishedCallback(callbackList callbacklist)
    {
        ensureOnCallbackLooperThread();
        if (isFinished())
        {
            callbacklist.onFinished();
            return;
        } else
        {
            finishedCallbackList.add(callbacklist);
            return;
        }
    }

    public void cancel()
    {
        this;
        JVM INSTR monitorenter ;
        ensureOnCallbackLooperThread();
        callbackList = null;
        if (state == ING)
        {
            finish(ELLED);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception1;
        exception1;
        throw exception1;
    }

    protected final void complete(Object obj, Exception exception1)
    {
        this;
        JVM INSTR monitorenter ;
        ensureOnCallbackLooperThread();
        Queue queue;
        boolean flag;
        if (state == ING)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag);
        result = obj;
        exception = exception1;
        queue = callbackList;
        if (queue == null)
        {
            break MISSING_BLOCK_LABEL_112;
        }
        if (exception1 == null)
        {
            break MISSING_BLOCK_LABEL_85;
        }
        for (; !queue.isEmpty(); ((AsyncCallback)queue.poll()).onFailure(exception1)) { }
        break MISSING_BLOCK_LABEL_112;
        obj;
        throw obj;
        for (; !queue.isEmpty(); ((AsyncCallback)queue.poll()).onSuccess(obj)) { }
        callbackList = null;
        finish(LETED);
        this;
        JVM INSTR monitorexit ;
    }

    public final boolean isFinished()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = state.nished();
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception1;
        exception1;
        throw exception1;
    }

    protected abstract void submit(ActionExecutor actionexecutor);

    (Handler handler)
    {
        callbackList = Lists.newLinkedList();
        state = ING;
        callbackHandler = handler;
    }
}
