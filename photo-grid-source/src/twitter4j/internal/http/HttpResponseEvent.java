// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.internal.http;

import twitter4j.TwitterException;
import twitter4j.auth.Authorization;

// Referenced classes of package twitter4j.internal.http:
//            HttpRequest, HttpResponse

public final class HttpResponseEvent
{

    private HttpRequest request;
    private HttpResponse response;
    private TwitterException twitterException;

    HttpResponseEvent(HttpRequest httprequest, HttpResponse httpresponse, TwitterException twitterexception)
    {
        request = httprequest;
        response = httpresponse;
        twitterException = twitterexception;
    }

    public final boolean equals(Object obj)
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

    public final HttpRequest getRequest()
    {
        return request;
    }

    public final HttpResponse getResponse()
    {
        return response;
    }

    public final TwitterException getTwitterException()
    {
        return twitterException;
    }

    public final int hashCode()
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

    public final boolean isAuthenticated()
    {
        return request.getAuthorization().isEnabled();
    }

    public final String toString()
    {
        return (new StringBuilder("HttpResponseEvent{request=")).append(request).append(", response=").append(response).append('}').toString();
    }
}
