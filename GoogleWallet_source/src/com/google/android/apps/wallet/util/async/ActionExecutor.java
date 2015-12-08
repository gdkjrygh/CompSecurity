// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.util.async;

import android.os.Handler;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.LinkedListMultimap;
import com.google.common.collect.Lists;
import com.google.common.collect.Multimap;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

// Referenced classes of package com.google.android.apps.wallet.util.async:
//            ThreadPreconditions, ActionRequest, AsyncCallback

public class ActionExecutor
{

    private final Multimap activeRequests = LinkedListMultimap.create();
    private final Handler callbackHandler;
    private final Executor executor;
    private final ActionRequests.RequestFactory requestFactory;

    public ActionExecutor(Executor executor1, Handler handler, ActionRequests.RequestFactory requestfactory)
    {
        executor = executor1;
        callbackHandler = handler;
        requestFactory = requestfactory;
    }

    private void ensureOnCallbackLooperThread()
    {
        ThreadPreconditions.checkOnThread(callbackHandler.getLooper(), "Must be on the same thread as the callback handler");
    }

    private void trackRequest(final Callable action, final ActionRequests.AbstractRequest request)
    {
        activeRequests.put(action, request);
        request.addFinishedCallback(new ActionRequest.FinishedCallback() {

            final ActionExecutor this$0;
            final Callable val$action;
            final ActionRequests.AbstractRequest val$request;

            public final void onFinished()
            {
                Preconditions.checkState(request.isFinished());
                activeRequests.get(action).remove(request);
            }

            
            {
                this$0 = ActionExecutor.this;
                request = abstractrequest;
                action = callable;
                super();
            }
        });
    }

    public final void cancelAll()
    {
        ensureOnCallbackLooperThread();
        for (Iterator iterator = Lists.reverse(ImmutableList.copyOf(activeRequests.values())).iterator(); iterator.hasNext(); ((ActionRequests.AbstractRequest)iterator.next()).cancel()) { }
    }

    final void execute(Runnable runnable)
    {
        executor.execute(runnable);
    }

    public final ActionRequest executeAction(Callable callable)
    {
        return executeAction(callable, null);
    }

    public final ActionRequest executeAction(Callable callable, AsyncCallback asynccallback)
    {
        ensureOnCallbackLooperThread();
        ActionRequests.AbstractRequest abstractrequest = requestFactory.createRequest(callable);
        trackRequest(callable, abstractrequest);
        if (asynccallback != null)
        {
            abstractrequest.addCallback(asynccallback);
        }
        abstractrequest.submit(this);
        return abstractrequest;
    }

    public final ActionRequest executeAllActions(Callable acallable[], AsyncCallback asynccallback)
    {
        ensureOnCallbackLooperThread();
        ActionRequests.AbstractRequest abstractrequest = requestFactory.createMultiRequest(acallable);
        trackRequest(acallable[0], abstractrequest);
        if (asynccallback != null)
        {
            abstractrequest.addCallback(asynccallback);
        }
        abstractrequest.submit(this);
        return abstractrequest;
    }

    public final ImmutableList getActiveRequests(Callable callable)
    {
        return ImmutableList.copyOf(activeRequests.get(callable));
    }

}
