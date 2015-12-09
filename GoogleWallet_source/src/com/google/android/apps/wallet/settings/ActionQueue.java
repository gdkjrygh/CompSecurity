// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.settings;

import com.google.android.apps.wallet.util.async.ActionExecutor;
import com.google.android.apps.wallet.util.async.AsyncCallback;
import java.util.ArrayDeque;
import java.util.concurrent.Callable;

public class ActionQueue
{
    final class QueueItem
    {

        final AsyncCallback callback;
        final Callable requestAction;
        final ActionQueue this$0;

        private QueueItem(Callable callable, AsyncCallback asynccallback)
        {
            this$0 = ActionQueue.this;
            super();
            requestAction = callable;
            callback = asynccallback;
        }

    }


    private final ActionExecutor actionExecutor;
    private final ArrayDeque pendingQueue = new ArrayDeque();

    public ActionQueue(ActionExecutor actionexecutor)
    {
        actionExecutor = actionexecutor;
    }

    private AsyncCallback createCallbackWithOldestItemRemoval(final AsyncCallback callback)
    {
        return new AsyncCallback() {

            final ActionQueue this$0;
            final AsyncCallback val$callback;

            public final void onFailure(Exception exception)
            {
                pendingQueue.remove();
                callback.onFailure(exception);
            }

            public final void onSuccess(Object obj)
            {
                pendingQueue.remove();
                callback.onSuccess(obj);
            }

            
            {
                this$0 = ActionQueue.this;
                callback = asynccallback;
                super();
            }
        };
    }

    public final void cancel()
    {
        pendingQueue.clear();
        actionExecutor.cancelAll();
    }

    public final boolean processQueue()
    {
        if (pendingQueue.isEmpty())
        {
            return false;
        } else
        {
            QueueItem queueitem = (QueueItem)pendingQueue.peek();
            actionExecutor.executeAction(queueitem.requestAction, queueitem.callback);
            return true;
        }
    }

    public final void submit(Callable callable, AsyncCallback asynccallback)
    {
        asynccallback = createCallbackWithOldestItemRemoval(asynccallback);
        QueueItem queueitem = new QueueItem(callable, asynccallback);
        pendingQueue.add(queueitem);
        if (pendingQueue.size() == 1)
        {
            actionExecutor.executeAction(callable, asynccallback);
        }
    }

}
