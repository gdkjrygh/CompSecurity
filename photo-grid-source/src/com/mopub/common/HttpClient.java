// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.common;

import android.content.Context;
import android.net.http.AndroidHttpClient;
import android.text.TextUtils;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.mopub.common.logging.MoPubLog;
import com.mopub.common.util.ResponseHeader;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.params.HttpClientParams;
import org.apache.http.params.HttpConnectionParams;

// Referenced classes of package com.mopub.common:
//            Preconditions

public class HttpClient
{

    private static final String a = System.getProperty("http.agent");
    private static String b;

    public HttpClient()
    {
    }

    private static boolean a(String s)
    {
        try
        {
            URLDecoder.decode(s, "UTF-8");
        }
        catch (UnsupportedEncodingException unsupportedencodingexception)
        {
            MoPubLog.w((new StringBuilder("Url is improperly encoded: ")).append(s).toString());
            return true;
        }
        return false;
    }

    private static boolean b(String s)
    {
        try
        {
            new URI(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return true;
        }
        return false;
    }

    private static URI c(String s)
    {
        Object obj;
        try
        {
            obj = new URL(s);
            obj = new URI(((URL) (obj)).getProtocol(), ((URL) (obj)).getUserInfo(), ((URL) (obj)).getHost(), ((URL) (obj)).getPort(), ((URL) (obj)).getPath(), ((URL) (obj)).getQuery(), ((URL) (obj)).getRef());
        }
        catch (Exception exception)
        {
            MoPubLog.w((new StringBuilder("Failed to encode url: ")).append(s).toString());
            throw exception;
        }
        return ((URI) (obj));
    }

    public static AndroidHttpClient getHttpClient()
    {
        AndroidHttpClient androidhttpclient = AndroidHttpClient.newInstance(getWebViewUserAgent(a));
        org.apache.http.params.HttpParams httpparams = androidhttpclient.getParams();
        HttpConnectionParams.setConnectionTimeout(httpparams, 10000);
        HttpConnectionParams.setSoTimeout(httpparams, 10000);
        HttpClientParams.setRedirecting(httpparams, true);
        return androidhttpclient;
    }

    public static String getWebViewUserAgent()
    {
        com/mopub/common/HttpClient;
        JVM INSTR monitorenter ;
        String s = getWebViewUserAgent(null);
        com/mopub/common/HttpClient;
        JVM INSTR monitorexit ;
        return s;
        Exception exception;
        exception;
        throw exception;
    }

    public static String getWebViewUserAgent(String s)
    {
        com/mopub/common/HttpClient;
        JVM INSTR monitorenter ;
        boolean flag = TextUtils.isEmpty(b);
        if (!flag) goto _L2; else goto _L1
_L1:
        com/mopub/common/HttpClient;
        JVM INSTR monitorexit ;
        return s;
_L2:
        s = b;
        if (true) goto _L1; else goto _L3
_L3:
        s;
        throw s;
    }

    public static HttpGet initializeHttpGet(String s)
    {
        return initializeHttpGet(s, null);
    }

    public static HttpGet initializeHttpGet(String s, Context context)
    {
        Preconditions.checkNotNull(s);
        String s1 = urlEncode(s);
        s = s1;
_L2:
        s = new HttpGet(s);
        if (getWebViewUserAgent() == null && context != null)
        {
            setWebViewUserAgent((new WebView(context)).getSettings().getUserAgentString());
        }
        context = getWebViewUserAgent();
        if (context != null)
        {
            s.addHeader(ResponseHeader.USER_AGENT.getKey(), context);
        }
        return s;
        Exception exception;
        exception;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static void setWebViewUserAgent(String s)
    {
        com/mopub/common/HttpClient;
        JVM INSTR monitorenter ;
        b = s;
        com/mopub/common/HttpClient;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    public static String urlEncode(String s)
    {
        Preconditions.checkNotNull(s);
        if (a(s))
        {
            throw new UnsupportedEncodingException((new StringBuilder("URL is improperly encoded: ")).append(s).toString());
        }
        if (b(s))
        {
            s = c(s);
        } else
        {
            s = new URI(s);
        }
        return s.toURL().toString();
    }

}
