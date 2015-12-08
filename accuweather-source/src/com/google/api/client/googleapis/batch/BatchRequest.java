// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.googleapis.batch;

import com.google.api.client.http.BackOffPolicy;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpExecuteInterceptor;
import com.google.api.client.http.HttpHeaders;
import com.google.api.client.http.HttpMediaType;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestFactory;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.MultipartContent;
import com.google.api.client.util.Preconditions;
import com.google.api.client.util.Sleeper;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.api.client.googleapis.batch:
//            HttpRequestContent, BatchUnparsedResponse, BatchCallback

public final class BatchRequest
{
    class BatchInterceptor
        implements HttpExecuteInterceptor
    {

        private HttpExecuteInterceptor originalInterceptor;
        final BatchRequest this$0;

        public void intercept(HttpRequest httprequest)
            throws IOException
        {
            if (originalInterceptor != null)
            {
                originalInterceptor.intercept(httprequest);
            }
            httprequest = requestInfos.iterator();
            do
            {
                if (!httprequest.hasNext())
                {
                    break;
                }
                RequestInfo requestinfo = (RequestInfo)httprequest.next();
                HttpExecuteInterceptor httpexecuteinterceptor = requestinfo.request.getInterceptor();
                if (httpexecuteinterceptor != null)
                {
                    httpexecuteinterceptor.intercept(requestinfo.request);
                }
            } while (true);
        }

        BatchInterceptor(HttpExecuteInterceptor httpexecuteinterceptor)
        {
            this$0 = BatchRequest.this;
            super();
            originalInterceptor = httpexecuteinterceptor;
        }
    }

    static class RequestInfo
    {

        final BatchCallback callback;
        final Class dataClass;
        final Class errorClass;
        final HttpRequest request;

        RequestInfo(BatchCallback batchcallback, Class class1, Class class2, HttpRequest httprequest)
        {
            callback = batchcallback;
            dataClass = class1;
            errorClass = class2;
            request = httprequest;
        }
    }


    private GenericUrl batchUrl;
    private final HttpRequestFactory requestFactory;
    List requestInfos;
    private Sleeper sleeper;

    public BatchRequest(HttpTransport httptransport, HttpRequestInitializer httprequestinitializer)
    {
        batchUrl = new GenericUrl("https://www.googleapis.com/batch");
        requestInfos = new ArrayList();
        sleeper = Sleeper.DEFAULT;
        if (httprequestinitializer == null)
        {
            httptransport = httptransport.createRequestFactory();
        } else
        {
            httptransport = httptransport.createRequestFactory(httprequestinitializer);
        }
        requestFactory = httptransport;
    }

    public void execute()
        throws IOException
    {
        Object obj;
        HttpRequest httprequest;
        BackOffPolicy backoffpolicy;
        int i;
        boolean flag;
        Iterator iterator;
        RequestInfo requestinfo;
        int j;
        if (!requestInfos.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag);
        httprequest = requestFactory.buildPostRequest(batchUrl, null);
        httprequest.setInterceptor(new BatchInterceptor(httprequest.getInterceptor()));
        j = httprequest.getNumberOfRetries();
        backoffpolicy = httprequest.getBackOffPolicy();
        i = j;
        if (backoffpolicy != null)
        {
            backoffpolicy.reset();
            i = j;
        }
_L6:
        Object obj1;
        if (i > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj = new MultipartContent();
        ((MultipartContent) (obj)).getMediaType().setSubType("mixed");
        j = 1;
        for (iterator = requestInfos.iterator(); iterator.hasNext();)
        {
            requestinfo = (RequestInfo)iterator.next();
            ((MultipartContent) (obj)).addPart(new com.google.api.client.http.MultipartContent.Part((new HttpHeaders()).setAcceptEncoding(null).set("Content-ID", Integer.valueOf(j)), new HttpRequestContent(requestinfo.request)));
            j++;
        }

        httprequest.setContent(((com.google.api.client.http.HttpContent) (obj)));
        obj1 = httprequest.execute();
        obj = String.valueOf(((HttpResponse) (obj1)).getMediaType().getParameter("boundary"));
        if (((String) (obj)).length() == 0) goto _L2; else goto _L1
_L1:
        obj = "--".concat(((String) (obj)));
_L4:
        for (obj = new BatchUnparsedResponse(((HttpResponse) (obj1)).getContent(), ((String) (obj)), requestInfos, flag); ((BatchUnparsedResponse) (obj)).hasNext;)
        {
            ((BatchUnparsedResponse) (obj)).parseNextResponse();
        }

        break MISSING_BLOCK_LABEL_302;
        obj;
        ((HttpResponse) (obj1)).disconnect();
        throw obj;
_L2:
        obj = new String("--");
        if (true) goto _L4; else goto _L3
_L3:
        ((HttpResponse) (obj1)).disconnect();
        obj1 = ((BatchUnparsedResponse) (obj)).unsuccessfulRequestInfos;
        if (((List) (obj1)).isEmpty())
        {
            break; /* Loop/switch isn't completed */
        }
        requestInfos = ((List) (obj1));
        if (((BatchUnparsedResponse) (obj)).backOffRequired && backoffpolicy != null)
        {
            long l = backoffpolicy.getNextBackOffMillis();
            if (l != -1L)
            {
                try
                {
                    sleeper.sleep(l);
                }
                catch (InterruptedException interruptedexception) { }
            }
        }
        i--;
        if (flag) goto _L6; else goto _L5
_L5:
        requestInfos.clear();
        return;
    }

    public GenericUrl getBatchUrl()
    {
        return batchUrl;
    }

    public Sleeper getSleeper()
    {
        return sleeper;
    }

    public BatchRequest queue(HttpRequest httprequest, Class class1, Class class2, BatchCallback batchcallback)
        throws IOException
    {
        Preconditions.checkNotNull(httprequest);
        Preconditions.checkNotNull(batchcallback);
        Preconditions.checkNotNull(class1);
        Preconditions.checkNotNull(class2);
        requestInfos.add(new RequestInfo(batchcallback, class1, class2, httprequest));
        return this;
    }

    public BatchRequest setBatchUrl(GenericUrl genericurl)
    {
        batchUrl = genericurl;
        return this;
    }

    public BatchRequest setSleeper(Sleeper sleeper1)
    {
        sleeper = (Sleeper)Preconditions.checkNotNull(sleeper1);
        return this;
    }

    public int size()
    {
        return requestInfos.size();
    }
}
