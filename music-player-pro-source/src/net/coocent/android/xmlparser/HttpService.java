// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.coocent.android.xmlparser;

import android.app.Activity;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.params.HttpParams;
import org.apache.http.util.EntityUtils;

public class HttpService
{

    public static final int METHOD_GET = 1;
    public static final int METHOD_POST = 2;
    public static long cachedTime = -1L;

    public HttpService()
    {
    }

    public static boolean checkNet(Activity activity)
    {
        activity = (ConnectivityManager)activity.getApplicationContext().getSystemService("connectivity");
        if (activity != null)
        {
            if ((activity = activity.getActiveNetworkInfo()) != null && activity.isAvailable())
            {
                return true;
            }
        }
        return false;
    }

    public static byte[] getBytes(String s, ArrayList arraylist, int i)
        throws IOException
    {
        s = getEntity(s, arraylist, i);
        if (s != null)
        {
            return EntityUtils.toByteArray(s);
        } else
        {
            return null;
        }
    }

    public static HttpEntity getEntity(String s, ArrayList arraylist, int i)
        throws IOException
    {
        Object obj;
        DefaultHttpClient defaulthttpclient;
        defaulthttpclient = new DefaultHttpClient();
        defaulthttpclient.getParams().setParameter("http.connection.timeout", Integer.valueOf(3000));
        obj = null;
        i;
        JVM INSTR tableswitch 1 2: default 56
    //                   1 91
    //                   2 197;
           goto _L1 _L2 _L3
_L3:
        break MISSING_BLOCK_LABEL_197;
_L1:
        s = obj;
_L6:
        s = defaulthttpclient.execute(s);
        Object obj1;
        if (s.getStatusLine().getStatusCode() == 200)
        {
            return s.getEntity();
        } else
        {
            return null;
        }
_L2:
        s = new StringBuilder(s);
        if (arraylist == null || arraylist.isEmpty()) goto _L5; else goto _L4
_L4:
        s.append('?');
        arraylist = arraylist.iterator();
_L7:
        if (arraylist.hasNext())
        {
            break MISSING_BLOCK_LABEL_158;
        }
        s.deleteCharAt(s.length() - 1);
_L5:
        s = new HttpGet(s.toString());
          goto _L6
        obj1 = (BasicNameValuePair)arraylist.next();
        s.append(((BasicNameValuePair) (obj1)).getName()).append('=').append(((BasicNameValuePair) (obj1)).getValue()).append('&');
          goto _L7
        obj1 = new HttpPost(s);
        s = ((String) (obj1));
        if (arraylist != null)
        {
            s = ((String) (obj1));
            if (!arraylist.isEmpty())
            {
                s = new UrlEncodedFormEntity(arraylist);
                ((HttpPost)obj1).setEntity(s);
                s = ((String) (obj1));
            }
        }
          goto _L6
    }

    public static long getLength(String s, ArrayList arraylist, int i)
        throws IOException
    {
        long l = 0L;
        s = getEntity(s, arraylist, i);
        if (s != null)
        {
            l = s.getContentLength();
        }
        return l;
    }

    public static long getLength(HttpEntity httpentity)
        throws IOException
    {
        long l = 0L;
        if (httpentity != null)
        {
            l = httpentity.getContentLength();
        }
        return l;
    }

    public static InputStream getStream(String s, ArrayList arraylist, int i)
        throws IOException
    {
        s = getEntity(s, arraylist, i);
        if (s != null)
        {
            return s.getContent();
        } else
        {
            return null;
        }
    }

    public static InputStream getStream(HttpEntity httpentity)
        throws IOException
    {
        if (httpentity != null)
        {
            return httpentity.getContent();
        } else
        {
            return null;
        }
    }

    public static long mtimeToLong(String s)
    {
        Object obj = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        long l;
        obj = ((SimpleDateFormat) (obj)).parse(s);
        if (cachedTime != -1L)
        {
            break MISSING_BLOCK_LABEL_54;
        }
        l = (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSz")).parse(s).getTime();
        cachedTime = l - ((Date) (obj)).getTime();
        return l;
        long l1;
        long l2;
        try
        {
            l1 = ((Date) (obj)).getTime();
            l2 = cachedTime;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return 0L;
        }
        return l1 + l2;
    }

}
