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
//            GraphRequest, GraphRequestAsyncTask

public class GraphRequestBatch extends AbstractList
{

    private static AtomicInteger idGenerator = new AtomicInteger();
    private String batchApplicationId;
    private Handler callbackHandler;
    private List callbacks;
    private final String id;
    private List requests;
    private int timeoutInMilliseconds;

    public GraphRequestBatch()
    {
        requests = new ArrayList();
        timeoutInMilliseconds = 0;
        id = Integer.valueOf(idGenerator.incrementAndGet()).toString();
        callbacks = new ArrayList();
        requests = new ArrayList();
    }

    public GraphRequestBatch(GraphRequestBatch graphrequestbatch)
    {
        requests = new ArrayList();
        timeoutInMilliseconds = 0;
        id = Integer.valueOf(idGenerator.incrementAndGet()).toString();
        callbacks = new ArrayList();
        requests = new ArrayList(graphrequestbatch);
        callbackHandler = graphrequestbatch.callbackHandler;
        timeoutInMilliseconds = graphrequestbatch.timeoutInMilliseconds;
        callbacks = new ArrayList(graphrequestbatch.callbacks);
    }

    public GraphRequestBatch(Collection collection)
    {
        requests = new ArrayList();
        timeoutInMilliseconds = 0;
        id = Integer.valueOf(idGenerator.incrementAndGet()).toString();
        callbacks = new ArrayList();
        requests = new ArrayList(collection);
    }

    public transient GraphRequestBatch(GraphRequest agraphrequest[])
    {
        requests = new ArrayList();
        timeoutInMilliseconds = 0;
        id = Integer.valueOf(idGenerator.incrementAndGet()).toString();
        callbacks = new ArrayList();
        requests = Arrays.asList(agraphrequest);
    }

    public final void add(int i, GraphRequest graphrequest)
    {
        requests.add(i, graphrequest);
    }

    public volatile void add(int i, Object obj)
    {
        add(i, (GraphRequest)obj);
    }

    public final boolean add(GraphRequest graphrequest)
    {
        return requests.add(graphrequest);
    }

    public volatile boolean add(Object obj)
    {
        return add((GraphRequest)obj);
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
        return GraphRequest.executeBatchAndWait(this);
    }

    public final GraphRequestAsyncTask executeAsync()
    {
        return executeAsyncImpl();
    }

    GraphRequestAsyncTask executeAsyncImpl()
    {
        return GraphRequest.executeBatchAsync(this);
    }

    public final GraphRequest get(int i)
    {
        return (GraphRequest)requests.get(i);
    }

    public volatile Object get(int i)
    {
        return get(i);
    }

    public final String getBatchApplicationId()
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

    public final GraphRequest remove(int i)
    {
        return (GraphRequest)requests.remove(i);
    }

    public volatile Object remove(int i)
    {
        return remove(i);
    }

    public void removeCallback(Callback callback)
    {
        callbacks.remove(callback);
    }

    public final GraphRequest set(int i, GraphRequest graphrequest)
    {
        return (GraphRequest)requests.set(i, graphrequest);
    }

    public volatile Object set(int i, Object obj)
    {
        return set(i, (GraphRequest)obj);
    }

    public final void setBatchApplicationId(String s)
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
