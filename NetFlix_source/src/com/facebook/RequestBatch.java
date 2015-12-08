// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.os.Handler;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.facebook:
//            Request, RequestAsyncTask

public class RequestBatch extends AbstractList
{
    public static interface Callback
    {

        public abstract void onBatchCompleted(RequestBatch requestbatch);
    }


    private static AtomicInteger idGenerator = new AtomicInteger();
    private String batchApplicationId;
    private Handler callbackHandler;
    private List callbacks;
    private final String id;
    private List requests;
    private int timeoutInMilliseconds;

    public RequestBatch()
    {
        requests = new ArrayList();
        timeoutInMilliseconds = 0;
        id = Integer.valueOf(idGenerator.incrementAndGet()).toString();
        callbacks = new ArrayList();
        requests = new ArrayList();
    }

    public RequestBatch(RequestBatch requestbatch)
    {
        requests = new ArrayList();
        timeoutInMilliseconds = 0;
        id = Integer.valueOf(idGenerator.incrementAndGet()).toString();
        callbacks = new ArrayList();
        requests = new ArrayList(requestbatch);
        callbackHandler = requestbatch.callbackHandler;
        timeoutInMilliseconds = requestbatch.timeoutInMilliseconds;
        callbacks = new ArrayList(requestbatch.callbacks);
    }

    public RequestBatch(Collection collection)
    {
        requests = new ArrayList();
        timeoutInMilliseconds = 0;
        id = Integer.valueOf(idGenerator.incrementAndGet()).toString();
        callbacks = new ArrayList();
        requests = new ArrayList(collection);
    }

    public transient RequestBatch(Request arequest[])
    {
        requests = new ArrayList();
        timeoutInMilliseconds = 0;
        id = Integer.valueOf(idGenerator.incrementAndGet()).toString();
        callbacks = new ArrayList();
        requests = Arrays.asList(arequest);
    }

    public final void add(int i, Request request)
    {
        requests.add(i, request);
    }

    public volatile void add(int i, Object obj)
    {
        add(i, (Request)obj);
    }

    public final boolean add(Request request)
    {
        return requests.add(request);
    }

    public volatile boolean add(Object obj)
    {
        return add((Request)obj);
    }

    public void addCallback(Callback callback)
    {
        if (!callbacks.contains(callback))
        {
            callbacks.add(callback);
        }
    }

    public final void clear()
    {
        requests.clear();
    }

    public final List executeAndWait()
    {
        return executeAndWaitImpl();
    }

    List executeAndWaitImpl()
    {
        return Request.executeBatchAndWait(this);
    }

    public final RequestAsyncTask executeAsync()
    {
        return executeAsyncImpl();
    }

    RequestAsyncTask executeAsyncImpl()
    {
        return Request.executeBatchAsync(this);
    }

    public final Request get(int i)
    {
        return (Request)requests.get(i);
    }

    public volatile Object get(int i)
    {
        return get(i);
    }

    final String getBatchApplicationId()
    {
        return batchApplicationId;
    }

    final Handler getCallbackHandler()
    {
        return callbackHandler;
    }

    final List getCallbacks()
    {
        return callbacks;
    }

    final String getId()
    {
        return id;
    }

    final List getRequests()
    {
        return requests;
    }

    public int getTimeout()
    {
        return timeoutInMilliseconds;
    }

    public final Request remove(int i)
    {
        return (Request)requests.remove(i);
    }

    public volatile Object remove(int i)
    {
        return remove(i);
    }

    public void removeCallback(Callback callback)
    {
        callbacks.remove(callback);
    }

    public final Request set(int i, Request request)
    {
        return (Request)requests.set(i, request);
    }

    public volatile Object set(int i, Object obj)
    {
        return set(i, (Request)obj);
    }

    final void setBatchApplicationId(String s)
    {
        batchApplicationId = s;
    }

    final void setCallbackHandler(Handler handler)
    {
        callbackHandler = handler;
    }

    public void setTimeout(int i)
    {
        if (i < 0)
        {
            throw new IllegalArgumentException("Argument timeoutInMilliseconds must be >= 0.");
        } else
        {
            timeoutInMilliseconds = i;
            return;
        }
    }

    public final int size()
    {
        return requests.size();
    }

}
