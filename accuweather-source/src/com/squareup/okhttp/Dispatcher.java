// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.squareup.okhttp:
//            Job, Request

final class Dispatcher
{
    static class RealResponseBody extends Response.Body
    {

        private final HttpURLConnection connection;
        private final InputStream in;

        public InputStream byteStream()
            throws IOException
        {
            return in;
        }

        public long contentLength()
        {
            return (long)connection.getContentLength();
        }

        public String contentType()
        {
            return connection.getHeaderField("Content-Type");
        }

        RealResponseBody(HttpURLConnection httpurlconnection, InputStream inputstream)
        {
            connection = httpurlconnection;
            in = inputstream;
        }
    }


    private final Map enqueuedJobs = new LinkedHashMap();
    private final ThreadPoolExecutor executorService;

    Dispatcher()
    {
        executorService = new ThreadPoolExecutor(8, 8, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue());
    }

    public void cancel(Object obj)
    {
        this;
        JVM INSTR monitorenter ;
        obj = (List)enqueuedJobs.remove(obj);
        if (obj != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        obj = ((List) (obj)).iterator();
        while (((Iterator) (obj)).hasNext()) 
        {
            Job job = (Job)((Iterator) (obj)).next();
            executorService.remove(job);
        }
        if (true) goto _L1; else goto _L3
_L3:
        obj;
        throw obj;
    }

    public void enqueue(HttpURLConnection httpurlconnection, Request request, Response.Receiver receiver)
    {
        this;
        JVM INSTR monitorenter ;
        Job job;
        job = new Job(this, httpurlconnection, request, receiver);
        receiver = (List)enqueuedJobs.get(request.tag());
        httpurlconnection = receiver;
        if (receiver != null)
        {
            break MISSING_BLOCK_LABEL_62;
        }
        httpurlconnection = new ArrayList(2);
        enqueuedJobs.put(request.tag(), httpurlconnection);
        httpurlconnection.add(job);
        executorService.execute(job);
        this;
        JVM INSTR monitorexit ;
        return;
        httpurlconnection;
        throw httpurlconnection;
    }

    void finished(Job job)
    {
        this;
        JVM INSTR monitorenter ;
        List list = (List)enqueuedJobs.get(job.request.tag());
        if (list == null)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        list.remove(job);
        this;
        JVM INSTR monitorexit ;
        return;
        job;
        throw job;
    }
}
