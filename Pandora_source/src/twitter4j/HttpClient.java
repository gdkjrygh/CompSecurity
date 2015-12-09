// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j;

import java.util.Map;
import twitter4j.auth.Authorization;

// Referenced classes of package twitter4j:
//            TwitterException, HttpResponse, HttpParameter, HttpResponseListener, 
//            HttpRequest

public interface HttpClient
{

    public abstract void addDefaultRequestHeader(String s, String s1);

    public abstract HttpResponse delete(String s)
        throws TwitterException;

    public abstract HttpResponse delete(String s, HttpParameter ahttpparameter[], Authorization authorization, HttpResponseListener httpresponselistener)
        throws TwitterException;

    public abstract HttpResponse get(String s)
        throws TwitterException;

    public abstract HttpResponse get(String s, HttpParameter ahttpparameter[], Authorization authorization, HttpResponseListener httpresponselistener)
        throws TwitterException;

    public abstract Map getRequestHeaders();

    public abstract HttpResponse head(String s)
        throws TwitterException;

    public abstract HttpResponse post(String s)
        throws TwitterException;

    public abstract HttpResponse post(String s, HttpParameter ahttpparameter[], Authorization authorization, HttpResponseListener httpresponselistener)
        throws TwitterException;

    public abstract HttpResponse put(String s)
        throws TwitterException;

    public abstract HttpResponse put(String s, HttpParameter ahttpparameter[], Authorization authorization, HttpResponseListener httpresponselistener)
        throws TwitterException;

    public abstract HttpResponse request(HttpRequest httprequest)
        throws TwitterException;

    public abstract HttpResponse request(HttpRequest httprequest, HttpResponseListener httpresponselistener)
        throws TwitterException;
}
