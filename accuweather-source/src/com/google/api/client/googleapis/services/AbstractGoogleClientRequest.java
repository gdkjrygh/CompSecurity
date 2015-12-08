// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.googleapis.services;

import com.google.api.client.googleapis.MethodOverride;
import com.google.api.client.googleapis.batch.BatchCallback;
import com.google.api.client.googleapis.batch.BatchRequest;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.google.api.client.googleapis.media.MediaHttpUploader;
import com.google.api.client.http.AbstractInputStreamContent;
import com.google.api.client.http.EmptyContent;
import com.google.api.client.http.GZipEncoding;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpContent;
import com.google.api.client.http.HttpHeaders;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestFactory;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.HttpResponseException;
import com.google.api.client.http.HttpResponseInterceptor;
import com.google.api.client.http.UriTemplate;
import com.google.api.client.util.GenericData;
import com.google.api.client.util.Preconditions;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

// Referenced classes of package com.google.api.client.googleapis.services:
//            AbstractGoogleClient

public abstract class AbstractGoogleClientRequest extends GenericData
{

    private final AbstractGoogleClient abstractGoogleClient;
    private boolean disableGZipContent;
    private MediaHttpDownloader downloader;
    private final HttpContent httpContent;
    private HttpHeaders lastResponseHeaders;
    private int lastStatusCode;
    private String lastStatusMessage;
    private HttpHeaders requestHeaders;
    private final String requestMethod;
    private Class responseClass;
    private MediaHttpUploader uploader;
    private final String uriTemplate;

    protected AbstractGoogleClientRequest(AbstractGoogleClient abstractgoogleclient, String s, String s1, HttpContent httpcontent, Class class1)
    {
        requestHeaders = new HttpHeaders();
        lastStatusCode = -1;
        responseClass = (Class)Preconditions.checkNotNull(class1);
        abstractGoogleClient = (AbstractGoogleClient)Preconditions.checkNotNull(abstractgoogleclient);
        requestMethod = (String)Preconditions.checkNotNull(s);
        uriTemplate = (String)Preconditions.checkNotNull(s1);
        httpContent = httpcontent;
        abstractgoogleclient = abstractgoogleclient.getApplicationName();
        if (abstractgoogleclient != null)
        {
            requestHeaders.setUserAgent(abstractgoogleclient);
        }
    }

    private HttpRequest buildHttpRequest(boolean flag)
        throws IOException
    {
        Object obj;
label0:
        {
            boolean flag2 = false;
            boolean flag1;
            if (uploader == null)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            Preconditions.checkArgument(flag1);
            if (flag)
            {
                flag1 = flag2;
                if (!requestMethod.equals("GET"))
                {
                    break label0;
                }
            }
            flag1 = true;
        }
        Preconditions.checkArgument(flag1);
        if (flag)
        {
            obj = "HEAD";
        } else
        {
            obj = requestMethod;
        }
        obj = getAbstractGoogleClient().getRequestFactory().buildRequest(((String) (obj)), buildHttpRequestUrl(), httpContent);
        (new MethodOverride()).intercept(((HttpRequest) (obj)));
        ((HttpRequest) (obj)).setParser(getAbstractGoogleClient().getObjectParser());
        if (httpContent == null && (requestMethod.equals("POST") || requestMethod.equals("PUT") || requestMethod.equals("PATCH")))
        {
            ((HttpRequest) (obj)).setContent(new EmptyContent());
        }
        ((HttpRequest) (obj)).getHeaders().putAll(requestHeaders);
        if (!disableGZipContent)
        {
            ((HttpRequest) (obj)).setEncoding(new GZipEncoding());
        }
        ((HttpRequest) (obj)).setResponseInterceptor(new HttpResponseInterceptor() {

            final AbstractGoogleClientRequest this$0;
            final HttpRequest val$httpRequest;
            final HttpResponseInterceptor val$responseInterceptor;

            public void interceptResponse(HttpResponse httpresponse)
                throws IOException
            {
                if (responseInterceptor != null)
                {
                    responseInterceptor.interceptResponse(httpresponse);
                }
                if (!httpresponse.isSuccessStatusCode() && httpRequest.getThrowExceptionOnExecuteError())
                {
                    throw newExceptionOnError(httpresponse);
                } else
                {
                    return;
                }
            }

            
            {
                this$0 = AbstractGoogleClientRequest.this;
                responseInterceptor = httpresponseinterceptor;
                httpRequest = httprequest;
                super();
            }
        });
        return ((HttpRequest) (obj));
    }

    private HttpResponse executeUnparsed(boolean flag)
        throws IOException
    {
        Object obj;
        if (uploader == null)
        {
            obj = buildHttpRequest(flag).execute();
        } else
        {
            obj = buildHttpRequestUrl();
            flag = getAbstractGoogleClient().getRequestFactory().buildRequest(requestMethod, ((GenericUrl) (obj)), httpContent).getThrowExceptionOnExecuteError();
            HttpResponse httpresponse = uploader.setInitiationHeaders(requestHeaders).setDisableGZipContent(disableGZipContent).upload(((GenericUrl) (obj)));
            httpresponse.getRequest().setParser(getAbstractGoogleClient().getObjectParser());
            obj = httpresponse;
            if (flag)
            {
                obj = httpresponse;
                if (!httpresponse.isSuccessStatusCode())
                {
                    throw newExceptionOnError(httpresponse);
                }
            }
        }
        lastResponseHeaders = ((HttpResponse) (obj)).getHeaders();
        lastStatusCode = ((HttpResponse) (obj)).getStatusCode();
        lastStatusMessage = ((HttpResponse) (obj)).getStatusMessage();
        return ((HttpResponse) (obj));
    }

    public HttpRequest buildHttpRequest()
        throws IOException
    {
        return buildHttpRequest(false);
    }

    public GenericUrl buildHttpRequestUrl()
    {
        return new GenericUrl(UriTemplate.expand(abstractGoogleClient.getBaseUrl(), uriTemplate, this, true));
    }

    protected HttpRequest buildHttpRequestUsingHead()
        throws IOException
    {
        return buildHttpRequest(true);
    }

    protected final void checkRequiredParameter(Object obj, String s)
    {
        boolean flag;
        if (abstractGoogleClient.getSuppressRequiredParameterChecks() || obj != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "Required parameter %s must be specified", new Object[] {
            s
        });
    }

    public Object execute()
        throws IOException
    {
        return executeUnparsed().parseAs(responseClass);
    }

    public void executeAndDownloadTo(OutputStream outputstream)
        throws IOException
    {
        executeUnparsed().download(outputstream);
    }

    public InputStream executeAsInputStream()
        throws IOException
    {
        return executeUnparsed().getContent();
    }

    protected HttpResponse executeMedia()
        throws IOException
    {
        set("alt", "media");
        return executeUnparsed();
    }

    protected void executeMediaAndDownloadTo(OutputStream outputstream)
        throws IOException
    {
        if (downloader == null)
        {
            executeMedia().download(outputstream);
            return;
        } else
        {
            downloader.download(buildHttpRequestUrl(), requestHeaders, outputstream);
            return;
        }
    }

    protected InputStream executeMediaAsInputStream()
        throws IOException
    {
        return executeMedia().getContent();
    }

    public HttpResponse executeUnparsed()
        throws IOException
    {
        return executeUnparsed(false);
    }

    protected HttpResponse executeUsingHead()
        throws IOException
    {
        HttpResponse httpresponse;
        boolean flag;
        if (uploader == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        httpresponse = executeUnparsed(true);
        httpresponse.ignore();
        return httpresponse;
    }

    public AbstractGoogleClient getAbstractGoogleClient()
    {
        return abstractGoogleClient;
    }

    public final boolean getDisableGZipContent()
    {
        return disableGZipContent;
    }

    public final HttpContent getHttpContent()
    {
        return httpContent;
    }

    public final HttpHeaders getLastResponseHeaders()
    {
        return lastResponseHeaders;
    }

    public final int getLastStatusCode()
    {
        return lastStatusCode;
    }

    public final String getLastStatusMessage()
    {
        return lastStatusMessage;
    }

    public final MediaHttpDownloader getMediaHttpDownloader()
    {
        return downloader;
    }

    public final MediaHttpUploader getMediaHttpUploader()
    {
        return uploader;
    }

    public final HttpHeaders getRequestHeaders()
    {
        return requestHeaders;
    }

    public final String getRequestMethod()
    {
        return requestMethod;
    }

    public final Class getResponseClass()
    {
        return responseClass;
    }

    public final String getUriTemplate()
    {
        return uriTemplate;
    }

    protected final void initializeMediaDownload()
    {
        HttpRequestFactory httprequestfactory = abstractGoogleClient.getRequestFactory();
        downloader = new MediaHttpDownloader(httprequestfactory.getTransport(), httprequestfactory.getInitializer());
    }

    protected final void initializeMediaUpload(AbstractInputStreamContent abstractinputstreamcontent)
    {
        HttpRequestFactory httprequestfactory = abstractGoogleClient.getRequestFactory();
        uploader = new MediaHttpUploader(abstractinputstreamcontent, httprequestfactory.getTransport(), httprequestfactory.getInitializer());
        uploader.setInitiationRequestMethod(requestMethod);
        if (httpContent != null)
        {
            uploader.setMetadata(httpContent);
        }
    }

    protected IOException newExceptionOnError(HttpResponse httpresponse)
    {
        return new HttpResponseException(httpresponse);
    }

    public final void queue(BatchRequest batchrequest, Class class1, BatchCallback batchcallback)
        throws IOException
    {
        boolean flag;
        if (uploader == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "Batching media requests is not supported");
        batchrequest.queue(buildHttpRequest(), getResponseClass(), class1, batchcallback);
    }

    public AbstractGoogleClientRequest set(String s, Object obj)
    {
        return (AbstractGoogleClientRequest)super.set(s, obj);
    }

    public volatile GenericData set(String s, Object obj)
    {
        return set(s, obj);
    }

    public AbstractGoogleClientRequest setDisableGZipContent(boolean flag)
    {
        disableGZipContent = flag;
        return this;
    }

    public AbstractGoogleClientRequest setRequestHeaders(HttpHeaders httpheaders)
    {
        requestHeaders = httpheaders;
        return this;
    }
}
