// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.util.async;

import android.os.Handler;
import com.google.common.base.Preconditions;
import com.google.common.base.Throwables;
import com.google.common.collect.Lists;
import java.util.Queue;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.util.async:
//            ActionRequest, ThreadPreconditions, AsyncCallback, ActionExecutor

public final class ActionRequests
{
    static abstract class AbstractRequest
        implements ActionRequest
    {

        protected final Handler callbackHandler;
        private Queue callbackList;
        private Exception exception;
        private final Queue finishedCallbackList = Lists.newLinkedList();
        private Object result;
        protected ActionRequest.RequestState state;

        private void ensureOnCallbackLooperThread()
        {
            ThreadPreconditions.checkOnThread(callbackHandler.getLooper(), "Must be on the same thread as the callback handler");
        }

        private void finish(ActionRequest.RequestState requeststate)
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
            Preconditions.checkArgument(requeststate.isFinished());
            state = requeststate;
            for (; !finishedCallbackList.isEmpty(); ((ActionRequest.FinishedCallback)finishedCallbackList.poll()).onFinished()) { }
            break MISSING_BLOCK_LABEL_69;
            requeststate;
            throw requeststate;
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

        final void addFinishedCallback(ActionRequest.FinishedCallback finishedcallback)
        {
            ensureOnCallbackLooperThread();
            if (isFinished())
            {
                finishedcallback.onFinished();
                return;
            } else
            {
                finishedCallbackList.add(finishedcallback);
                return;
            }
        }

        public void cancel()
        {
            this;
            JVM INSTR monitorenter ;
            ensureOnCallbackLooperThread();
            callbackList = null;
            if (state == ActionRequest.RequestState.PENDING)
            {
                finish(ActionRequest.RequestState.CANCELLED);
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
            if (state == ActionRequest.RequestState.RUNNING)
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
            finish(ActionRequest.RequestState.COMPLETED);
            this;
            JVM INSTR monitorexit ;
        }

        public final boolean isFinished()
        {
            this;
            JVM INSTR monitorenter ;
            boolean flag = state.isFinished();
            this;
            JVM INSTR monitorexit ;
            return flag;
            Exception exception1;
            exception1;
            throw exception1;
        }

        protected abstract void submit(ActionExecutor actionexecutor);

        AbstractRequest(Handler handler)
        {
            callbackList = Lists.newLinkedList();
            state = ActionRequest.RequestState.PENDING;
            callbackHandler = handler;
        }
    }

    static final class MultiRequestImpl extends AbstractRequest
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

        private ActionRequest submitActionHelper(int i, Callable callable, ActionExecutor actionexecutor)
        {
            return actionexecutor.executeAction(callable, i. new AsyncCallback() {

                final MultiRequestImpl this$0;
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
                this$0 = final_multirequestimpl;
                index = I.this;
                super();
            }
            });
        }

        public final void cancel()
        {
            this;
            JVM INSTR monitorenter ;
            if (state != ActionRequest.RequestState.PENDING) goto _L2; else goto _L1
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
            super.cancel();
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
            state = ActionRequest.RequestState.RUNNING;
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
        static Exception access$302(MultiRequestImpl multirequestimpl, Exception exception)
        {
            multirequestimpl.failureException = exception;
            return exception;
        }

*/



/*
        static int access$408(MultiRequestImpl multirequestimpl)
        {
            int i = multirequestimpl.completeCount;
            multirequestimpl.completeCount = i + 1;
            return i;
        }

*/


        private MultiRequestImpl(Callable acallable[], Handler handler)
        {
            super(handler);
            actions = (Callable[])acallable.clone();
            requests = new AbstractRequest[actions.length];
            results = new Object[actions.length];
        }

    }

    public static final class RequestFactory
    {

        private final Handler callbackHandler;

        public final AbstractRequest createMultiRequest(Callable acallable[])
        {
            return new MultiRequestImpl(acallable, callbackHandler);
        }

        public final AbstractRequest createRequest(Callable callable)
        {
            return new RequestImpl(callable, callbackHandler);
        }

        public RequestFactory(Handler handler)
        {
            callbackHandler = handler;
        }
    }

    static final class RequestImpl extends AbstractRequest
    {

        private final Callable action;

        private void postCallbacks(final Object result, Exception exception)
        {
            callbackHandler.post(exception. new Runnable() {

                final RequestImpl this$0;
                final Exception val$exception;
                final Object val$result;

                public final void run()
                {
                    complete(result, exception);
                }

            
            {
                this$0 = final_requestimpl;
                result = obj;
                exception = Exception.this;
                super();
            }
            });
        }

        protected final void submit(ActionExecutor actionexecutor)
        {
            actionexecutor.execute(new Runnable() {

                final RequestImpl this$0;

                public final void run()
                {
label0:
                    {
                        synchronized (RequestImpl.this)
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
                this$0 = RequestImpl.this;
                super();
            }
            });
        }



        private RequestImpl(Callable callable, Handler handler)
        {
            super(handler);
            action = callable;
        }

    }

}
