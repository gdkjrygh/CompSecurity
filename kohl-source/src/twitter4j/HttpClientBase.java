// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import twitter4j.auth.Authorization;

// Referenced classes of package twitter4j:
//            HttpClient, Logger, Version, HttpClientConfiguration, 
//            TwitterException, HttpRequest, RequestMethod, HttpResponseEvent, 
//            HttpResponseListener, HttpResponse, HttpParameter

public abstract class HttpClientBase
    implements HttpClient, Serializable
{

    private static final Logger logger = Logger.getLogger(twitter4j/HttpClientBase);
    private static final long serialVersionUID = 0x90bdfbe2add8de93L;
    protected final HttpClientConfiguration CONF;
    private final Map requestHeaders = new HashMap();

    public HttpClientBase(HttpClientConfiguration httpclientconfiguration)
    {
        CONF = httpclientconfiguration;
        requestHeaders.put("X-Twitter-Client-Version", Version.getVersion());
        requestHeaders.put("X-Twitter-Client-URL", (new StringBuilder()).append("http://twitter4j.org/en/twitter4j-").append(Version.getVersion()).append(".xml").toString());
        requestHeaders.put("X-Twitter-Client", "Twitter4J");
        requestHeaders.put("User-Agent", (new StringBuilder()).append("twitter4j http://twitter4j.org/ /").append(Version.getVersion()).toString());
        if (httpclientconfiguration.isGZIPEnabled())
        {
            requestHeaders.put("Accept-Encoding", "gzip");
        }
    }

    public void addDefaultRequestHeader(String s, String s1)
    {
        requestHeaders.put(s, s1);
    }

    public HttpResponse delete(String s)
        throws TwitterException
    {
        return request(new HttpRequest(RequestMethod.DELETE, s, null, null, requestHeaders));
    }

    public HttpResponse delete(String s, HttpParameter ahttpparameter[], Authorization authorization, HttpResponseListener httpresponselistener)
        throws TwitterException
    {
        return request(new HttpRequest(RequestMethod.DELETE, s, ahttpparameter, authorization, requestHeaders), httpresponselistener);
    }

    public HttpResponse get(String s)
        throws TwitterException
    {
        return request(new HttpRequest(RequestMethod.GET, s, null, null, requestHeaders));
    }

    public HttpResponse get(String s, HttpParameter ahttpparameter[], Authorization authorization, HttpResponseListener httpresponselistener)
        throws TwitterException
    {
        return request(new HttpRequest(RequestMethod.GET, s, ahttpparameter, authorization, requestHeaders), httpresponselistener);
    }

    public Map getRequestHeaders()
    {
        return requestHeaders;
    }

    abstract HttpResponse handleRequest(HttpRequest httprequest)
        throws TwitterException;

    public HttpResponse head(String s)
        throws TwitterException
    {
        return request(new HttpRequest(RequestMethod.HEAD, s, null, null, requestHeaders));
    }

    protected boolean isProxyConfigured()
    {
        return CONF.getHttpProxyHost() != null && !CONF.getHttpProxyHost().equals("");
    }

    public HttpResponse post(String s)
        throws TwitterException
    {
        return request(new HttpRequest(RequestMethod.POST, s, null, null, requestHeaders));
    }

    public HttpResponse post(String s, HttpParameter ahttpparameter[], Authorization authorization, HttpResponseListener httpresponselistener)
        throws TwitterException
    {
        return request(new HttpRequest(RequestMethod.POST, s, ahttpparameter, authorization, requestHeaders), httpresponselistener);
    }

    public HttpResponse put(String s)
        throws TwitterException
    {
        return request(new HttpRequest(RequestMethod.PUT, s, null, null, requestHeaders));
    }

    public HttpResponse put(String s, HttpParameter ahttpparameter[], Authorization authorization, HttpResponseListener httpresponselistener)
        throws TwitterException
    {
        return request(new HttpRequest(RequestMethod.PUT, s, ahttpparameter, authorization, requestHeaders), httpresponselistener);
    }

    public final HttpResponse request(HttpRequest httprequest)
        throws TwitterException
    {
        return handleRequest(httprequest);
    }

    public final HttpResponse request(HttpRequest httprequest, HttpResponseListener httpresponselistener)
        throws TwitterException
    {
        HttpResponse httpresponse;
        try
        {
            httpresponse = handleRequest(httprequest);
        }
        catch (TwitterException twitterexception)
        {
            if (httpresponselistener != null)
            {
                httpresponselistener.httpResponseReceived(new HttpResponseEvent(httprequest, null, twitterexception));
            }
            throw twitterexception;
        }
        if (httpresponselistener == null)
        {
            break MISSING_BLOCK_LABEL_26;
        }
        httpresponselistener.httpResponseReceived(new HttpResponseEvent(httprequest, httpresponse, null));
        return httpresponse;
    }

    public void write(DataOutputStream dataoutputstream, String s)
        throws IOException
    {
        dataoutputstream.writeBytes(s);
        logger.debug(s);
    }

}
