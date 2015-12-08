// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.adobepass.accessenabler.network;

import com.adobe.adobepass.accessenabler.utils.Log;
import com.adobe.adobepass.accessenabler.utils.Utils;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.List;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.CookieStore;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.HttpContext;

public class HttpConnector
{

    private static final String HTTP_USER_AGENT = "http.useragent";
    private static final String LOG_TAG = "HttpConnector";
    DefaultHttpClient httpClient;
    HttpContext localContext;

    public HttpConnector()
    {
        httpClient = new DefaultHttpClient();
        localContext = new BasicHttpContext();
        httpClient.getParams().setParameter("http.useragent", (new StringBuilder()).append("AdobePassNativeClient/1.8 (Linux; U; Android ").append(android.os.Build.VERSION.RELEASE).append("; en-us)").toString());
    }

    public HttpResponse get(String s, List list, List list1, boolean flag)
    {
        s = new HttpGet(Utils.buildUrl(s, list, flag));
        if (list1 != null)
        {
            for (list = list1.iterator(); list.hasNext(); s.addHeader(list1.getName(), list1.getValue()))
            {
                list1 = (NameValuePair)list.next();
            }

        }
        try
        {
            s = httpClient.execute(s, localContext);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e("HttpConnector", s.toString());
            return null;
        }
        return s;
    }

    public HttpResponse post(String s, List list, List list1, List list2, boolean flag)
    {
        s = new HttpPost(Utils.buildUrl(s, list, flag));
        if (list1 != null)
        {
            for (list = list1.iterator(); list.hasNext(); s.addHeader(list1.getName(), list1.getValue()))
            {
                list1 = (NameValuePair)list.next();
            }

        }
        if (list2 == null)
        {
            break MISSING_BLOCK_LABEL_82;
        }
        s.setEntity(new UrlEncodedFormEntity(list2));
        try
        {
            s = httpClient.execute(s, localContext);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            try
            {
                Log.e("HttpConnector", s.toString());
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                Log.e("HttpConnector", s.toString());
                return null;
            }
            return null;
        }
        return s;
    }

    public List retrieveCookies()
    {
        return httpClient.getCookieStore().getCookies();
    }
}
