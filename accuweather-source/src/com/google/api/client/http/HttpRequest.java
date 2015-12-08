// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.http;

import com.google.api.client.util.IOUtils;
import com.google.api.client.util.LoggingStreamingContent;
import com.google.api.client.util.ObjectParser;
import com.google.api.client.util.Preconditions;
import com.google.api.client.util.Sleeper;
import com.google.api.client.util.StringUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.logging.Level;
import java.util.logging.Logger;

// Referenced classes of package com.google.api.client.http:
//            HttpHeaders, BackOffPolicy, HttpResponse, HttpExecuteInterceptor, 
//            GenericUrl, HttpTransport, HttpContent, LowLevelHttpRequest, 
//            LowLevelHttpResponse, HttpUnsuccessfulResponseHandler, HttpEncoding, HttpEncodingStreamingContent, 
//            HttpIOExceptionHandler, HttpResponseInterceptor, HttpResponseException, HttpStatusCodes, 
//            HttpMediaType

public final class HttpRequest
{

    public static final String USER_AGENT_SUFFIX = "Google-HTTP-Java-Client/1.18.0-rc (gzip)";
    public static final String VERSION = "1.18.0-rc";
    private BackOffPolicy backOffPolicy;
    private int connectTimeout;
    private HttpContent content;
    private int contentLoggingLimit;
    private boolean curlLoggingEnabled;
    private HttpEncoding encoding;
    private HttpExecuteInterceptor executeInterceptor;
    private boolean followRedirects;
    private HttpHeaders headers;
    private HttpIOExceptionHandler ioExceptionHandler;
    private boolean loggingEnabled;
    private int numRetries;
    private ObjectParser objectParser;
    private int readTimeout;
    private String requestMethod;
    private HttpHeaders responseHeaders;
    private HttpResponseInterceptor responseInterceptor;
    private boolean retryOnExecuteIOException;
    private Sleeper sleeper;
    private boolean suppressUserAgentSuffix;
    private boolean throwExceptionOnExecuteError;
    private final HttpTransport transport;
    private HttpUnsuccessfulResponseHandler unsuccessfulResponseHandler;
    private GenericUrl url;

    HttpRequest(HttpTransport httptransport, String s)
    {
        headers = new HttpHeaders();
        responseHeaders = new HttpHeaders();
        numRetries = 10;
        contentLoggingLimit = 16384;
        loggingEnabled = true;
        curlLoggingEnabled = true;
        connectTimeout = 20000;
        readTimeout = 20000;
        followRedirects = true;
        throwExceptionOnExecuteError = true;
        retryOnExecuteIOException = false;
        sleeper = Sleeper.DEFAULT;
        transport = httptransport;
        setRequestMethod(s);
    }

    public HttpResponse execute()
        throws IOException
    {
        Object obj;
        Object obj1;
        Object obj4;
        Logger logger;
        boolean flag;
        boolean flag1;
        boolean flag2;
        boolean flag3;
        boolean flag4;
        Object obj2;
        Object obj3;
        Object obj5;
        String s1;
        LowLevelHttpRequest lowlevelhttprequest;
        String s2;
        String s3;
        int i;
        if (numRetries >= 0)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        Preconditions.checkArgument(flag2);
        i = numRetries;
        if (backOffPolicy != null)
        {
            backOffPolicy.reset();
        }
        obj2 = null;
        Preconditions.checkNotNull(requestMethod);
        Preconditions.checkNotNull(url);
        if (obj2 != null)
        {
            ((HttpResponse) (obj2)).ignore();
        }
        obj4 = null;
        obj5 = null;
        if (executeInterceptor != null)
        {
            executeInterceptor.intercept(this);
        }
        s1 = url.build();
        lowlevelhttprequest = transport.buildRequest(requestMethod, s1);
        logger = HttpTransport.LOGGER;
        if (loggingEnabled && logger.isLoggable(Level.CONFIG))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj2 = null;
        obj = null;
        obj1 = obj;
        if (flag)
        {
            obj3 = new StringBuilder();
            ((StringBuilder) (obj3)).append("-------------- REQUEST  --------------").append(StringUtils.LINE_SEPARATOR);
            ((StringBuilder) (obj3)).append(requestMethod).append(' ').append(s1).append(StringUtils.LINE_SEPARATOR);
            obj1 = obj;
            obj2 = obj3;
            if (curlLoggingEnabled)
            {
                obj = new StringBuilder("curl -v --compressed");
                obj1 = obj;
                obj2 = obj3;
                if (!requestMethod.equals("GET"))
                {
                    ((StringBuilder) (obj)).append(" -X ").append(requestMethod);
                    obj2 = obj3;
                    obj1 = obj;
                }
            }
        }
        obj = headers.getUserAgent();
        if (!suppressUserAgentSuffix)
        {
            if (obj == null)
            {
                headers.setUserAgent("Google-HTTP-Java-Client/1.18.0-rc (gzip)");
            } else
            {
                headers.setUserAgent((new StringBuilder()).append(((String) (obj))).append(" ").append("Google-HTTP-Java-Client/1.18.0-rc (gzip)").toString());
            }
        }
        HttpHeaders.serializeHeaders(headers, ((StringBuilder) (obj2)), ((StringBuilder) (obj1)), logger, lowlevelhttprequest);
        if (!suppressUserAgentSuffix)
        {
            headers.setUserAgent(((String) (obj)));
        }
        obj3 = content;
        if (obj3 == null || content.retrySupported())
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        obj = obj3;
        if (obj3 != null)
        {
            s2 = content.getType();
            obj = obj3;
            if (flag)
            {
                obj = new LoggingStreamingContent(((com.google.api.client.util.StreamingContent) (obj3)), HttpTransport.LOGGER, Level.CONFIG, contentLoggingLimit);
            }
            String s;
            long l;
            if (encoding == null)
            {
                s = null;
                l = content.getLength();
            } else
            {
                s = encoding.getName();
                obj = new HttpEncodingStreamingContent(((com.google.api.client.util.StreamingContent) (obj)), encoding);
                if (flag1)
                {
                    l = IOUtils.computeLength(((com.google.api.client.util.StreamingContent) (obj)));
                } else
                {
                    l = -1L;
                }
            }
            if (flag)
            {
                if (s2 != null)
                {
                    s3 = (new StringBuilder()).append("Content-Type: ").append(s2).toString();
                    ((StringBuilder) (obj2)).append(s3).append(StringUtils.LINE_SEPARATOR);
                    if (obj1 != null)
                    {
                        ((StringBuilder) (obj1)).append((new StringBuilder()).append(" -H '").append(s3).append("'").toString());
                    }
                }
                if (l >= 0L)
                {
                    ((StringBuilder) (obj2)).append((new StringBuilder()).append("Content-Length: ").append(l).toString()).append(StringUtils.LINE_SEPARATOR);
                }
            }
            if (obj1 != null)
            {
                ((StringBuilder) (obj1)).append(" -d '@-'");
            }
            lowlevelhttprequest.setContentType(s2);
            lowlevelhttprequest.setContentEncoding(s);
            lowlevelhttprequest.setContentLength(l);
            lowlevelhttprequest.setStreamingContent(((com.google.api.client.util.StreamingContent) (obj)));
        }
        if (flag)
        {
            logger.config(((StringBuilder) (obj2)).toString());
            if (obj1 != null)
            {
                ((StringBuilder) (obj1)).append(" -- '");
                ((StringBuilder) (obj1)).append(s1.replaceAll("'", "'\"'\"'"));
                ((StringBuilder) (obj1)).append("'");
                if (obj != null)
                {
                    ((StringBuilder) (obj1)).append(" << $$$");
                }
                logger.config(((StringBuilder) (obj1)).toString());
            }
        }
        if (flag1 && i > 0)
        {
            flag4 = true;
        } else
        {
            flag4 = false;
        }
        lowlevelhttprequest.setTimeout(connectTimeout, readTimeout);
        obj1 = lowlevelhttprequest.execute();
        obj = new HttpResponse(this, ((LowLevelHttpResponse) (obj1)));
        if (true)
        {
            break MISSING_BLOCK_LABEL_689;
        }
        obj1 = ((LowLevelHttpResponse) (obj1)).getContent();
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_689;
        }
        ((InputStream) (obj1)).close();
        obj1 = obj5;
_L8:
        if (obj == null) goto _L2; else goto _L1
_L1:
        if (((HttpResponse) (obj)).isSuccessStatusCode()) goto _L2; else goto _L3
_L3:
        flag2 = false;
        if (unsuccessfulResponseHandler != null)
        {
            flag2 = unsuccessfulResponseHandler.handleResponse(this, ((HttpResponse) (obj)), flag4);
        }
        flag3 = flag2;
        if (flag2) goto _L5; else goto _L4
_L4:
        if (!handleRedirect(((HttpResponse) (obj)).getStatusCode(), ((HttpResponse) (obj)).getHeaders())) goto _L7; else goto _L6
_L6:
        flag3 = true;
_L5:
        flag1 = flag4 & flag3;
        flag = flag1;
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_779;
        }
        ((HttpResponse) (obj)).ignore();
        flag = flag1;
        break MISSING_BLOCK_LABEL_779;
        obj;
        if (false)
        {
            break MISSING_BLOCK_LABEL_934;
        }
        obj1 = ((LowLevelHttpResponse) (obj1)).getContent();
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_934;
        }
        ((InputStream) (obj1)).close();
        throw obj;
        ioexception;
        obj = obj4;
_L13:
        if (!retryOnExecuteIOException && (ioExceptionHandler == null || !ioExceptionHandler.handleIOException(this, flag4)))
        {
            throw ioexception;
        }
        IOException ioexception1 = ioexception;
        logger.log(Level.WARNING, "exception thrown while executing request", ioexception);
        ioexception = ioexception1;
          goto _L8
_L7:
        flag3 = flag2;
        if (!flag4) goto _L5; else goto _L9
_L9:
        flag3 = flag2;
        if (backOffPolicy == null) goto _L5; else goto _L10
_L10:
        flag3 = flag2;
        if (!backOffPolicy.isBackOffRequired(((HttpResponse) (obj)).getStatusCode())) goto _L5; else goto _L11
_L11:
        l1 = backOffPolicy.getNextBackOffMillis();
        flag3 = flag2;
        if (l1 != -1L)
        {
            try
            {
                sleeper.sleep(l1);
            }
            catch (InterruptedException interruptedexception) { }
            finally
            {
                if (obj == null || false) goto _L0; else goto _L0
            }
            flag3 = true;
        }
          goto _L5
_L2:
        if (obj == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        flag = flag4 & flag;
          goto _L12
        ((HttpResponse) (obj)).disconnect();
        throw ioexception;
_L12:
        i--;
        if (obj != null && false)
        {
            ((HttpResponse) (obj)).disconnect();
        }
        obj2 = obj;
        if (flag)
        {
            break MISSING_BLOCK_LABEL_55;
        }
        IOException ioexception;
        long l1;
        if (obj == null)
        {
            throw obj1;
        }
        if (responseInterceptor != null)
        {
            responseInterceptor.interceptResponse(((HttpResponse) (obj)));
        }
        if (!throwExceptionOnExecuteError || ((HttpResponse) (obj)).isSuccessStatusCode())
        {
            break MISSING_BLOCK_LABEL_1156;
        }
        throw new HttpResponseException(((HttpResponse) (obj)));
        ioexception;
        ((HttpResponse) (obj)).disconnect();
        throw ioexception;
        return ((HttpResponse) (obj));
        ioexception;
          goto _L13
    }

    public Future executeAsync()
    {
        return executeAsync(((Executor) (Executors.newSingleThreadExecutor())));
    }

    public Future executeAsync(Executor executor)
    {
        FutureTask futuretask = new FutureTask(new Callable() {

            final HttpRequest this$0;

            public HttpResponse call()
                throws Exception
            {
                return execute();
            }

            public volatile Object call()
                throws Exception
            {
                return call();
            }

            
            {
                this$0 = HttpRequest.this;
                super();
            }
        });
        executor.execute(futuretask);
        return futuretask;
    }

    public BackOffPolicy getBackOffPolicy()
    {
        return backOffPolicy;
    }

    public int getConnectTimeout()
    {
        return connectTimeout;
    }

    public HttpContent getContent()
    {
        return content;
    }

    public int getContentLoggingLimit()
    {
        return contentLoggingLimit;
    }

    public HttpEncoding getEncoding()
    {
        return encoding;
    }

    public boolean getFollowRedirects()
    {
        return followRedirects;
    }

    public HttpHeaders getHeaders()
    {
        return headers;
    }

    public HttpIOExceptionHandler getIOExceptionHandler()
    {
        return ioExceptionHandler;
    }

    public HttpExecuteInterceptor getInterceptor()
    {
        return executeInterceptor;
    }

    public int getNumberOfRetries()
    {
        return numRetries;
    }

    public final ObjectParser getParser()
    {
        return objectParser;
    }

    public int getReadTimeout()
    {
        return readTimeout;
    }

    public String getRequestMethod()
    {
        return requestMethod;
    }

    public HttpHeaders getResponseHeaders()
    {
        return responseHeaders;
    }

    public HttpResponseInterceptor getResponseInterceptor()
    {
        return responseInterceptor;
    }

    public boolean getRetryOnExecuteIOException()
    {
        return retryOnExecuteIOException;
    }

    public Sleeper getSleeper()
    {
        return sleeper;
    }

    public boolean getSuppressUserAgentSuffix()
    {
        return suppressUserAgentSuffix;
    }

    public boolean getThrowExceptionOnExecuteError()
    {
        return throwExceptionOnExecuteError;
    }

    public HttpTransport getTransport()
    {
        return transport;
    }

    public HttpUnsuccessfulResponseHandler getUnsuccessfulResponseHandler()
    {
        return unsuccessfulResponseHandler;
    }

    public GenericUrl getUrl()
    {
        return url;
    }

    public boolean handleRedirect(int i, HttpHeaders httpheaders)
    {
        httpheaders = httpheaders.getLocation();
        if (getFollowRedirects() && HttpStatusCodes.isRedirect(i) && httpheaders != null)
        {
            setUrl(new GenericUrl(url.toURL(httpheaders)));
            if (i == 303)
            {
                setRequestMethod("GET");
                setContent(null);
            }
            headers.setAuthorization((String)null);
            headers.setIfMatch((String)null);
            headers.setIfNoneMatch((String)null);
            headers.setIfModifiedSince((String)null);
            headers.setIfUnmodifiedSince((String)null);
            headers.setIfRange((String)null);
            return true;
        } else
        {
            return false;
        }
    }

    public boolean isCurlLoggingEnabled()
    {
        return curlLoggingEnabled;
    }

    public boolean isLoggingEnabled()
    {
        return loggingEnabled;
    }

    public HttpRequest setBackOffPolicy(BackOffPolicy backoffpolicy)
    {
        backOffPolicy = backoffpolicy;
        return this;
    }

    public HttpRequest setConnectTimeout(int i)
    {
        boolean flag;
        if (i >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        connectTimeout = i;
        return this;
    }

    public HttpRequest setContent(HttpContent httpcontent)
    {
        content = httpcontent;
        return this;
    }

    public HttpRequest setContentLoggingLimit(int i)
    {
        boolean flag;
        if (i >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "The content logging limit must be non-negative.");
        contentLoggingLimit = i;
        return this;
    }

    public HttpRequest setCurlLoggingEnabled(boolean flag)
    {
        curlLoggingEnabled = flag;
        return this;
    }

    public HttpRequest setEncoding(HttpEncoding httpencoding)
    {
        encoding = httpencoding;
        return this;
    }

    public HttpRequest setFollowRedirects(boolean flag)
    {
        followRedirects = flag;
        return this;
    }

    public HttpRequest setHeaders(HttpHeaders httpheaders)
    {
        headers = (HttpHeaders)Preconditions.checkNotNull(httpheaders);
        return this;
    }

    public HttpRequest setIOExceptionHandler(HttpIOExceptionHandler httpioexceptionhandler)
    {
        ioExceptionHandler = httpioexceptionhandler;
        return this;
    }

    public HttpRequest setInterceptor(HttpExecuteInterceptor httpexecuteinterceptor)
    {
        executeInterceptor = httpexecuteinterceptor;
        return this;
    }

    public HttpRequest setLoggingEnabled(boolean flag)
    {
        loggingEnabled = flag;
        return this;
    }

    public HttpRequest setNumberOfRetries(int i)
    {
        boolean flag;
        if (i >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        numRetries = i;
        return this;
    }

    public HttpRequest setParser(ObjectParser objectparser)
    {
        objectParser = objectparser;
        return this;
    }

    public HttpRequest setReadTimeout(int i)
    {
        boolean flag;
        if (i >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        readTimeout = i;
        return this;
    }

    public HttpRequest setRequestMethod(String s)
    {
        boolean flag;
        if (s == null || HttpMediaType.matchesToken(s))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        requestMethod = s;
        return this;
    }

    public HttpRequest setResponseHeaders(HttpHeaders httpheaders)
    {
        responseHeaders = (HttpHeaders)Preconditions.checkNotNull(httpheaders);
        return this;
    }

    public HttpRequest setResponseInterceptor(HttpResponseInterceptor httpresponseinterceptor)
    {
        responseInterceptor = httpresponseinterceptor;
        return this;
    }

    public HttpRequest setRetryOnExecuteIOException(boolean flag)
    {
        retryOnExecuteIOException = flag;
        return this;
    }

    public HttpRequest setSleeper(Sleeper sleeper1)
    {
        sleeper = (Sleeper)Preconditions.checkNotNull(sleeper1);
        return this;
    }

    public HttpRequest setSuppressUserAgentSuffix(boolean flag)
    {
        suppressUserAgentSuffix = flag;
        return this;
    }

    public HttpRequest setThrowExceptionOnExecuteError(boolean flag)
    {
        throwExceptionOnExecuteError = flag;
        return this;
    }

    public HttpRequest setUnsuccessfulResponseHandler(HttpUnsuccessfulResponseHandler httpunsuccessfulresponsehandler)
    {
        unsuccessfulResponseHandler = httpunsuccessfulresponsehandler;
        return this;
    }

    public HttpRequest setUrl(GenericUrl genericurl)
    {
        url = (GenericUrl)Preconditions.checkNotNull(genericurl);
        return this;
    }
}
