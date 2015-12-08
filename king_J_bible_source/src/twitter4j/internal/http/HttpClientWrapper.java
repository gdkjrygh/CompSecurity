// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.internal.http;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import twitter4j.TwitterException;
import twitter4j.auth.Authorization;
import twitter4j.conf.ConfigurationContext;

// Referenced classes of package twitter4j.internal.http:
//            HttpClientWrapperConfiguration, HttpClientFactory, HttpClient, HttpResponseEvent, 
//            HttpResponseListener, HttpRequest, RequestMethod, HttpResponse, 
//            HttpParameter

public final class HttpClientWrapper
    implements Serializable
{

    private static final long serialVersionUID = 0xa5a0cf530b0cb6edL;
    private HttpClient http;
    private HttpResponseListener httpResponseListener;
    private final Map requestHeaders;
    private final HttpClientWrapperConfiguration wrapperConf;

    public HttpClientWrapper()
    {
        wrapperConf = ConfigurationContext.getInstance();
        requestHeaders = wrapperConf.getRequestHeaders();
        http = HttpClientFactory.getInstance(wrapperConf);
    }

    public HttpClientWrapper(HttpClientWrapperConfiguration httpclientwrapperconfiguration)
    {
        wrapperConf = httpclientwrapperconfiguration;
        requestHeaders = httpclientwrapperconfiguration.getRequestHeaders();
        http = HttpClientFactory.getInstance(httpclientwrapperconfiguration);
    }

    private HttpResponse request(HttpRequest httprequest)
        throws TwitterException
    {
        HttpResponse httpresponse;
        try
        {
            httpresponse = http.request(httprequest);
            if (httpResponseListener != null)
            {
                httpResponseListener.httpResponseReceived(new HttpResponseEvent(httprequest, httpresponse, null));
            }
        }
        catch (TwitterException twitterexception)
        {
            if (httpResponseListener != null)
            {
                httpResponseListener.httpResponseReceived(new HttpResponseEvent(httprequest, null, twitterexception));
            }
            throw twitterexception;
        }
        return httpresponse;
    }

    public HttpResponse delete(String s)
        throws TwitterException
    {
        return request(new HttpRequest(RequestMethod.DELETE, s, null, null, requestHeaders));
    }

    public HttpResponse delete(String s, Authorization authorization)
        throws TwitterException
    {
        return request(new HttpRequest(RequestMethod.DELETE, s, null, authorization, requestHeaders));
    }

    public HttpResponse delete(String s, HttpParameter ahttpparameter[])
        throws TwitterException
    {
        return request(new HttpRequest(RequestMethod.DELETE, s, ahttpparameter, null, requestHeaders));
    }

    public HttpResponse delete(String s, HttpParameter ahttpparameter[], Authorization authorization)
        throws TwitterException
    {
        return request(new HttpRequest(RequestMethod.DELETE, s, ahttpparameter, authorization, requestHeaders));
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (HttpClientWrapper)obj;
            if (!http.equals(((HttpClientWrapper) (obj)).http))
            {
                return false;
            }
            if (!requestHeaders.equals(((HttpClientWrapper) (obj)).requestHeaders))
            {
                return false;
            }
            if (!wrapperConf.equals(((HttpClientWrapper) (obj)).wrapperConf))
            {
                return false;
            }
        }
        return true;
    }

    public HttpResponse get(String s)
        throws TwitterException
    {
        return request(new HttpRequest(RequestMethod.GET, s, null, null, requestHeaders));
    }

    public HttpResponse get(String s, Authorization authorization)
        throws TwitterException
    {
        return request(new HttpRequest(RequestMethod.GET, s, null, authorization, requestHeaders));
    }

    public HttpResponse get(String s, HttpParameter ahttpparameter[])
        throws TwitterException
    {
        return request(new HttpRequest(RequestMethod.GET, s, ahttpparameter, null, requestHeaders));
    }

    public HttpResponse get(String s, HttpParameter ahttpparameter[], Authorization authorization)
        throws TwitterException
    {
        return request(new HttpRequest(RequestMethod.GET, s, ahttpparameter, authorization, requestHeaders));
    }

    public int hashCode()
    {
        return (wrapperConf.hashCode() * 31 + http.hashCode()) * 31 + requestHeaders.hashCode();
    }

    public HttpResponse head(String s)
        throws TwitterException
    {
        return request(new HttpRequest(RequestMethod.HEAD, s, null, null, requestHeaders));
    }

    public HttpResponse head(String s, Authorization authorization)
        throws TwitterException
    {
        return request(new HttpRequest(RequestMethod.HEAD, s, null, authorization, requestHeaders));
    }

    public HttpResponse head(String s, HttpParameter ahttpparameter[])
        throws TwitterException
    {
        return request(new HttpRequest(RequestMethod.HEAD, s, ahttpparameter, null, requestHeaders));
    }

    public HttpResponse head(String s, HttpParameter ahttpparameter[], Authorization authorization)
        throws TwitterException
    {
        return request(new HttpRequest(RequestMethod.HEAD, s, ahttpparameter, authorization, requestHeaders));
    }

    public HttpResponse post(String s)
        throws TwitterException
    {
        return request(new HttpRequest(RequestMethod.POST, s, null, null, requestHeaders));
    }

    public HttpResponse post(String s, Authorization authorization)
        throws TwitterException
    {
        return request(new HttpRequest(RequestMethod.POST, s, null, authorization, requestHeaders));
    }

    public HttpResponse post(String s, HttpParameter ahttpparameter[])
        throws TwitterException
    {
        return request(new HttpRequest(RequestMethod.POST, s, ahttpparameter, null, requestHeaders));
    }

    public HttpResponse post(String s, HttpParameter ahttpparameter[], Map map)
        throws TwitterException
    {
        HashMap hashmap = new HashMap(requestHeaders);
        if (map != null)
        {
            hashmap.putAll(map);
        }
        return request(new HttpRequest(RequestMethod.POST, s, ahttpparameter, null, hashmap));
    }

    public HttpResponse post(String s, HttpParameter ahttpparameter[], Authorization authorization)
        throws TwitterException
    {
        return request(new HttpRequest(RequestMethod.POST, s, ahttpparameter, authorization, requestHeaders));
    }

    public HttpResponse put(String s)
        throws TwitterException
    {
        return request(new HttpRequest(RequestMethod.PUT, s, null, null, requestHeaders));
    }

    public HttpResponse put(String s, Authorization authorization)
        throws TwitterException
    {
        return request(new HttpRequest(RequestMethod.PUT, s, null, authorization, requestHeaders));
    }

    public HttpResponse put(String s, HttpParameter ahttpparameter[])
        throws TwitterException
    {
        return request(new HttpRequest(RequestMethod.PUT, s, ahttpparameter, null, requestHeaders));
    }

    public HttpResponse put(String s, HttpParameter ahttpparameter[], Authorization authorization)
        throws TwitterException
    {
        return request(new HttpRequest(RequestMethod.PUT, s, ahttpparameter, authorization, requestHeaders));
    }

    public void setHttpResponseListener(HttpResponseListener httpresponselistener)
    {
        httpResponseListener = httpresponselistener;
    }

    public void shutdown()
    {
        http.shutdown();
    }

    public String toString()
    {
        return "HttpClientWrapper{wrapperConf=" + wrapperConf + ", http=" + http + ", requestHeaders=" + requestHeaders + ", httpResponseListener=" + httpResponseListener + '}';
    }
}
