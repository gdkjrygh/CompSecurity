// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.webapi;

import com.netflix.mediaclient.Log;
import java.util.Calendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.http.HttpVersion;
import org.apache.http.client.CookieStore;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.cookie.BasicClientCookie;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;

// Referenced classes of package com.netflix.mediaclient.webapi:
//            WebApiCommand

public final class HttpClientFactory
{

    protected static final String CMS_BEACON_ENDPOINT_URL = "ichnaea.netflix.com";
    protected static final String CUSTOMER_EVENTS_BEACON_ENDPOINT_URL = "customerevents.netflix.com";
    private static final String DOMAIN = ".netflix.com";
    private static final int HTTP_CONN_TIMEOUT = 5000;
    private static final int HTTP_SO_TIMEOUT = 5000;
    private static final String PATH = "/";
    private static final String TAG = "nf-rest";
    protected static final String WEBAPI_ENDPOINT_URL = "api-global.netflix.com";
    private static String cmsBeaconApiEndPoint = "ichnaea.netflix.com";
    private static String customerEventBeaconApiEndPoint = "customerevents.netflix.com";
    private static String webApiEndPoint = "api-global.netflix.com";

    private HttpClientFactory()
    {
    }

    public static String getCmsBeaconApiEndPoint()
    {
        return cmsBeaconApiEndPoint;
    }

    public static String getCustomerEventBeaconApiEndPoint()
    {
        return customerEventBeaconApiEndPoint;
    }

    public static DefaultHttpClient getHttpClient(String s, String s1)
    {
        Object obj = new BasicHttpParams();
        ((HttpParams) (obj)).setParameter("http.protocol.version", HttpVersion.HTTP_1_1);
        HttpConnectionParams.setConnectionTimeout(((HttpParams) (obj)), 5000);
        HttpConnectionParams.setSoTimeout(((HttpParams) (obj)), 5000);
        obj = new DefaultHttpClient(((HttpParams) (obj)));
        BasicCookieStore basiccookiestore = new BasicCookieStore();
        s = new BasicClientCookie(WebApiCommand.getNetflixIdName(), s);
        s.setDomain(".netflix.com");
        s.setPath("/");
        Object obj1 = Calendar.getInstance();
        ((Calendar) (obj1)).add(1, 1);
        obj1 = ((Calendar) (obj1)).getTime();
        s.setExpiryDate(((java.util.Date) (obj1)));
        s1 = new BasicClientCookie(WebApiCommand.getSecureNetflixIdName(), s1);
        s1.setDomain(".netflix.com");
        s1.setPath("/");
        s1.setExpiryDate(((java.util.Date) (obj1)));
        s1.setSecure(true);
        basiccookiestore.addCookie(s);
        basiccookiestore.addCookie(s1);
        s = basiccookiestore.getCookies();
        if (Log.isLoggable("nf-rest", 3))
        {
            if (s.isEmpty())
            {
                Log.d("nf-rest", "No cookies");
            } else
            {
                int i = 0;
                while (i < s.size()) 
                {
                    Log.d("nf-rest", (new StringBuilder()).append("Local cookie: ").append(s.get(i)).toString());
                    i++;
                }
            }
        }
        ((DefaultHttpClient) (obj)).setCookieStore(basiccookiestore);
        return ((DefaultHttpClient) (obj));
    }

    public static String getWebApiEndPoint()
    {
        return webApiEndPoint;
    }

    public static void setCmsBeaconApiEndPoint(String s)
    {
        cmsBeaconApiEndPoint = s;
    }

    public static void setCustomerEventBeaconApiEndPoint(String s)
    {
        customerEventBeaconApiEndPoint = s;
    }

    public static void setWebApiEndPoint(String s)
    {
        webApiEndPoint = s;
    }

    static 
    {
        if (Log.isLoggable("nf-rest", 3))
        {
            Logger.getLogger("org.apache.http.wire").setLevel(Level.FINEST);
            Logger.getLogger("org.apache.http.headers").setLevel(Level.FINEST);
            System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.SimpleLog");
            System.setProperty("org.apache.commons.logging.simplelog.showdatetime", "true");
            System.setProperty("org.apache.commons.logging.simplelog.log.httpclient.wire", "debug");
            System.setProperty("org.apache.commons.logging.simplelog.log.org.apache.http", "debug");
            System.setProperty("org.apache.commons.logging.simplelog.log.org.apache.http.headers", "debug");
            System.setProperty("log.tag.org.apache.http", "VERBOSE");
            System.setProperty("log.tag.org.apache.http.wire", "VERBOSE");
            System.setProperty("log.tag.org.apache.http.headers", "VERBOSE");
        }
    }
}
