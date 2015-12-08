// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.restclient;

import com.urbanairship.Logger;
import java.util.HashMap;
import java.util.LinkedList;

// Referenced classes of package com.urbanairship.restclient:
//            Request, AsyncHandler, Response

public class RequestQueue
{

    private HashMap handlers;
    private int maxConcurrentRequests;
    private LinkedList requests;
    private int runningRequests;

    public RequestQueue()
    {
        maxConcurrentRequests = 3;
        runningRequests = 0;
        requests = new LinkedList();
        handlers = new HashMap();
    }

    private void removeRequest(Request request)
    {
        this;
        JVM INSTR monitorenter ;
        Logger.verbose((new StringBuilder()).append("removing request ").append(request.getURI()).toString());
        handlers.remove(request);
        runningRequests = runningRequests - 1;
        update();
        this;
        JVM INSTR monitorexit ;
        return;
        request;
        throw request;
    }

    private void runRequest(final Request request)
    {
        Logger.verbose((new StringBuilder()).append("running request ").append(request.getURI()).toString());
        runningRequests = runningRequests + 1;
        final AsyncHandler delegate = (AsyncHandler)handlers.get(request);
        try
        {
            request.executeAsync(new AsyncHandler() {

                final RequestQueue this$0;
                final AsyncHandler val$delegate;
                final Request val$request;

                public void onComplete(Response response)
                {
                    removeRequest(request);
                    delegate.onComplete(response);
                }

                public void onError(Exception exception1)
                {
                    removeRequest(request);
                    delegate.onError(exception1);
                }

                public void onProgress(int i)
                {
                    delegate.onProgress(i);
                }

            
            {
                this$0 = RequestQueue.this;
                request = request1;
                delegate = asynchandler;
                super();
            }
            });
            return;
        }
        catch (Exception exception)
        {
            Logger.error("Error running request", exception);
            delegate.onError(exception);
            removeRequest(request);
            return;
        }
    }

    private void update()
    {
        for (; runningRequests < maxConcurrentRequests && !requests.isEmpty(); runRequest((Request)requests.poll())) { }
    }

    public void addRequest(Request request, AsyncHandler asynchandler)
    {
        this;
        JVM INSTR monitorenter ;
        Logger.verbose((new StringBuilder()).append("adding request ").append(request.getURI()).toString());
        requests.add(request);
        handlers.put(request, asynchandler);
        update();
        this;
        JVM INSTR monitorexit ;
        return;
        request;
        throw request;
    }

    public int getMaxConcurrentRequests()
    {
        return maxConcurrentRequests;
    }

    public void setMaxConcurrentRequests(int i)
    {
        maxConcurrentRequests = i;
    }

}
