// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp;

import com.squareup.okhttp.internal.http.ResponseHeaders;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.squareup.okhttp:
//            Job, Request, OkHttpClient, MediaType

final class Dispatcher
{
    static class RealResponseBody extends Response.Body
    {

        private final InputStream in;
        private final ResponseHeaders responseHeaders;

        public InputStream byteStream()
            throws IOException
        {
            return in;
        }

        public long contentLength()
        {
            return responseHeaders.getContentLength();
        }

        public MediaType contentType()
        {
            String s = responseHeaders.getContentType();
            if (s != null)
            {
                return MediaType.parse(s);
            } else
            {
                return null;
            }
        }

        public boolean ready()
            throws IOException
        {
            return true;
        }

        RealResponseBody(ResponseHeaders responseheaders, InputStream inputstream)
        {
            responseHeaders = responseheaders;
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

    public void enqueue(OkHttpClient okhttpclient, Request request, Response.Receiver receiver)
    {
        this;
        JVM INSTR monitorenter ;
        Job job;
        job = new Job(this, okhttpclient, request, receiver);
        receiver = (List)enqueuedJobs.get(request.tag());
        okhttpclient = receiver;
        if (receiver != null)
        {
            break MISSING_BLOCK_LABEL_62;
        }
        okhttpclient = new ArrayList(2);
        enqueuedJobs.put(request.tag(), okhttpclient);
        okhttpclient.add(job);
        executorService.execute(job);
        this;
        JVM INSTR monitorexit ;
        return;
        okhttpclient;
        throw okhttpclient;
    }

    void finished(Job job)
    {
        this;
        JVM INSTR monitorenter ;
        List list = (List)enqueuedJobs.get(job.tag());
        if (list == null)
        {
            break MISSING_BLOCK_LABEL_31;
        }
        list.remove(job);
        this;
        JVM INSTR monitorexit ;
        return;
        job;
        throw job;
    }
}
