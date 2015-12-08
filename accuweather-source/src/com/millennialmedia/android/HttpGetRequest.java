// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.millennialmedia.android;

import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;

// Referenced classes of package com.millennialmedia.android:
//            MMLog

class HttpGetRequest
{

    private static final String TAG = "HttpGetRequest";
    private HttpClient client;
    private HttpGet getRequest;

    HttpGetRequest()
    {
        BasicHttpParams basichttpparams = new BasicHttpParams();
        HttpConnectionParams.setConnectionTimeout(basichttpparams, 10000);
        client = new DefaultHttpClient(basichttpparams);
        getRequest = new HttpGet();
    }

    HttpGetRequest(int i)
    {
        BasicHttpParams basichttpparams = new BasicHttpParams();
        HttpConnectionParams.setConnectionTimeout(basichttpparams, 10000);
        HttpConnectionParams.setSoTimeout(basichttpparams, i);
        client = new DefaultHttpClient(basichttpparams);
        getRequest = new HttpGet();
    }

    static String convertStreamToString(InputStream inputstream)
        throws IOException
    {
        Object obj;
        Object obj2;
        obj = null;
        obj2 = null;
        if (inputstream == null)
        {
            throw new IOException("Stream is null.");
        }
        inputstream = new BufferedReader(new InputStreamReader(inputstream), 4096);
        obj = new StringBuilder();
_L3:
        String s = inputstream.readLine();
        if (s == null) goto _L2; else goto _L1
_L1:
        ((StringBuilder) (obj)).append((new StringBuilder()).append(s).append("\n").toString());
          goto _L3
        Object obj1;
        obj1;
_L7:
        obj = inputstream;
        MMLog.e("HttpGetRequest", "Out of Memeory: ", ((Throwable) (obj1)));
        obj = inputstream;
        throw new IOException("Out of memory.");
        inputstream;
_L5:
        if (obj != null)
        {
            try
            {
                ((BufferedReader) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                MMLog.e("HttpGetRequest", "Error closing file", ((Throwable) (obj)));
            }
        }
        throw inputstream;
_L2:
        if (inputstream != null)
        {
            try
            {
                inputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (InputStream inputstream)
            {
                MMLog.e("HttpGetRequest", "Error closing file", inputstream);
            }
        }
        return ((StringBuilder) (obj)).toString();
        obj1;
        obj = inputstream;
        inputstream = ((InputStream) (obj1));
        if (true) goto _L5; else goto _L4
_L4:
        obj1;
        inputstream = obj2;
        if (true) goto _L7; else goto _L6
_L6:
    }

    static void log(String as[])
    {
        if (as != null && as.length > 0)
        {
            Utils.ThreadUtils.execute(new Runnable(as) {

                final String val$urls[];

                public void run()
                {
                    String as1[] = urls;
                    int j = as1.length;
                    int i = 0;
                    while (i < j) 
                    {
                        String s = as1[i];
                        MMLog.v("HttpGetRequest", String.format("Logging event to: %s", new Object[] {
                            s
                        }));
                        try
                        {
                            (new HttpGetRequest()).get(s);
                        }
                        catch (Exception exception)
                        {
                            MMLog.e("HttpGetRequest", "Logging request failed.", exception);
                        }
                        i++;
                    }
                }

            
            {
                urls = as;
                super();
            }
            });
        }
    }

    HttpResponse get(String s)
        throws Exception
    {
        HttpResponse httpresponse;
        Object obj;
        obj = null;
        httpresponse = null;
        if (TextUtils.isEmpty(s))
        {
            break MISSING_BLOCK_LABEL_40;
        }
        getRequest.setURI(new URI(s));
        httpresponse = client.execute(getRequest);
        s = httpresponse;
_L2:
        return s;
        s;
        MMLog.e("HttpGetRequest", "Out of memory!", s);
        return null;
        Exception exception;
        exception;
        s = obj;
        if (exception != null)
        {
            MMLog.e("HttpGetRequest", "Error connecting:", exception);
            return null;
        }
        if (true) goto _L2; else goto _L1
_L1:
    }

    void trackConversion(String s, boolean flag, long l, TreeMap treemap)
        throws Exception
    {
        StringBuilder stringbuilder;
        int i;
        if (flag)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        try
        {
            stringbuilder = new StringBuilder((new StringBuilder()).append("http://cvt.mydas.mobi/handleConversion?firstlaunch=").append(i).toString());
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            MMLog.e("HttpGetRequest", "Conversion tracking error: ", s);
            return;
        }
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        stringbuilder.append((new StringBuilder()).append("&goalId=").append(s).toString());
        if (l <= 0L)
        {
            break MISSING_BLOCK_LABEL_100;
        }
        stringbuilder.append((new StringBuilder()).append("&installtime=").append(l / 1000L).toString());
        if (treemap == null)
        {
            break MISSING_BLOCK_LABEL_198;
        }
        for (s = treemap.entrySet().iterator(); s.hasNext(); stringbuilder.append(String.format("&%s=%s", new Object[] {
    treemap.getKey(), URLEncoder.encode((String)treemap.getValue(), "UTF-8")
})))
        {
            treemap = (java.util.Map.Entry)s.next();
        }

        s = stringbuilder.toString();
        MMLog.d("HttpGetRequest", String.format("Sending conversion tracker report: %s", new Object[] {
            s
        }));
        getRequest.setURI(new URI(s));
        s = client.execute(getRequest);
        if (s.getStatusLine().getStatusCode() == 200)
        {
            MMLog.v("HttpGetRequest", String.format("Successful conversion tracking event: %d", new Object[] {
                Integer.valueOf(s.getStatusLine().getStatusCode())
            }));
            return;
        }
        MMLog.e("HttpGetRequest", String.format("Conversion tracking error: %d", new Object[] {
            Integer.valueOf(s.getStatusLine().getStatusCode())
        }));
        return;
    }
}
