// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package oauth.signpost.basic;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import oauth.signpost.AbstractOAuthProvider;
import oauth.signpost.http.HttpRequest;
import oauth.signpost.http.HttpResponse;

// Referenced classes of package oauth.signpost.basic:
//            HttpURLConnectionRequestAdapter, HttpURLConnectionResponseAdapter

public class DefaultOAuthProvider extends AbstractOAuthProvider
{

    private static final long serialVersionUID = 1L;

    public DefaultOAuthProvider(String s, String s1, String s2)
    {
        super(s, s1, s2);
    }

    protected void closeConnection(HttpRequest httprequest, HttpResponse httpresponse)
    {
        httprequest = (HttpURLConnection)httprequest.unwrap();
        if (httprequest != null)
        {
            httprequest.disconnect();
        }
    }

    protected HttpRequest createRequest(String s)
        throws MalformedURLException, IOException
    {
        s = (HttpURLConnection)(new URL(s)).openConnection();
        s.setRequestMethod("POST");
        s.setAllowUserInteraction(false);
        s.setRequestProperty("Content-Length", "0");
        return new HttpURLConnectionRequestAdapter(s);
    }

    protected HttpResponse sendRequest(HttpRequest httprequest)
        throws IOException
    {
        httprequest = (HttpURLConnection)httprequest.unwrap();
        httprequest.connect();
        return new HttpURLConnectionResponseAdapter(httprequest);
    }
}
