// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bolts;

import android.net.Uri;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.Callable;

// Referenced classes of package bolts:
//            WebViewAppLinkResolver, Capture

class val.contentType
    implements Callable
{

    final WebViewAppLinkResolver this$0;
    final Capture val$content;
    final Capture val$contentType;
    final Uri val$url;

    public volatile Object call()
        throws Exception
    {
        return call();
    }

    public Void call()
        throws Exception
    {
        URLConnection urlconnection;
        URL url1 = new URL(val$url.toString());
        urlconnection = null;
        while (url1 != null) 
        {
            urlconnection = url1.openConnection();
            if (urlconnection instanceof HttpURLConnection)
            {
                ((HttpURLConnection)urlconnection).setInstanceFollowRedirects(true);
            }
            urlconnection.setRequestProperty("Prefer-Html-Meta-Tags", "al");
            urlconnection.connect();
            if (urlconnection instanceof HttpURLConnection)
            {
                HttpURLConnection httpurlconnection = (HttpURLConnection)urlconnection;
                if (httpurlconnection.getResponseCode() >= 300 && httpurlconnection.getResponseCode() < 400)
                {
                    url1 = new URL(httpurlconnection.getHeaderField("Location"));
                    httpurlconnection.disconnect();
                } else
                {
                    url1 = null;
                }
            } else
            {
                url1 = null;
            }
        }
        val$content.set(WebViewAppLinkResolver.access$300(urlconnection));
        val$contentType.set(urlconnection.getContentType());
        if (urlconnection instanceof HttpURLConnection)
        {
            ((HttpURLConnection)urlconnection).disconnect();
        }
        return null;
        Exception exception;
        exception;
        if (urlconnection instanceof HttpURLConnection)
        {
            ((HttpURLConnection)urlconnection).disconnect();
        }
        throw exception;
    }

    ()
    {
        this$0 = final_webviewapplinkresolver;
        val$url = uri;
        val$content = capture;
        val$contentType = Capture.this;
        super();
    }
}
