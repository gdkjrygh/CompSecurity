// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j;

import twitter4j.auth.Authorization;

// Referenced classes of package twitter4j:
//            HttpRequest, HttpResponse, TwitterException

public final class HttpResponseEvent
{

    private final HttpRequest request;
    private final HttpResponse response;
    private final TwitterException twitterException;

    HttpResponseEvent(HttpRequest httprequest, HttpResponse httpresponse, TwitterException twitterexception)
    {
        request = httprequest;
        response = httpresponse;
        twitterException = twitterexception;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (HttpResponseEvent)obj;
            if (request == null ? ((HttpResponseEvent) (obj)).request != null : !request.equals(((HttpResponseEvent) (obj)).request))
            {
                return false;
            }
            if (response == null ? ((HttpResponseEvent) (obj)).response != null : !response.equals(((HttpResponseEvent) (obj)).response))
            {
                return false;
            }
        }
        return true;
    }

    public HttpRequest getRequest()
    {
        return request;
    }

    public HttpResponse getResponse()
    {
        return response;
    }

    public TwitterException getTwitterException()
    {
        return twitterException;
    }

    public int hashCode()
    {
        int j = 0;
        int i;
        if (request != null)
        {
            i = request.hashCode();
        } else
        {
            i = 0;
        }
        if (response != null)
        {
            j = response.hashCode();
        }
        return i * 31 + j;
    }

    public boolean isAuthenticated()
    {
        return request.getAuthorization().isEnabled();
    }

    public String toString()
    {
        return (new StringBuilder()).append("HttpResponseEvent{request=").append(request).append(", response=").append(response).append('}').toString();
    }
}
