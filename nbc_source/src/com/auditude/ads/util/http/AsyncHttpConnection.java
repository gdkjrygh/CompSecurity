// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads.util.http;

import android.graphics.BitmapFactory;
import android.os.Handler;
import android.os.Message;
import com.auditude.ads.core.AdSettings;
import com.auditude.ads.core.AuditudeEnv;
import com.auditude.ads.util.StringUtil;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.BufferedHttpEntity;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;

// Referenced classes of package com.auditude.ads.util.http:
//            ConnectionManager

public class AsyncHttpConnection
    implements Runnable
{

    private static final int BITMAP = 4;
    private static final int DELETE = 3;
    public static final int DID_ERROR = 1;
    public static final int DID_START = 0;
    public static final int DID_SUCCEED = 2;
    private static final int GET = 0;
    private static final int HEAD = 5;
    private static final int POST = 1;
    private static final int PUT = 2;
    private String data;
    private Handler handler;
    private HttpClient httpClient;
    private boolean isCanceled;
    private int method;
    private int timeout;
    private String url;

    public AsyncHttpConnection()
    {
        this(new Handler());
    }

    public AsyncHttpConnection(Handler handler1)
    {
        timeout = 0;
        isCanceled = false;
        handler = handler1;
    }

    private void processBitmapEntity(HttpEntity httpentity)
        throws IOException
    {
        if (isCanceled)
        {
            return;
        } else
        {
            httpentity = BitmapFactory.decodeStream((new BufferedHttpEntity(httpentity)).getContent());
            handler.sendMessage(Message.obtain(handler, 2, httpentity));
            return;
        }
    }

    private void processEntity(HttpEntity httpentity)
        throws IllegalStateException, IOException
    {
        if (isCanceled)
        {
            return;
        }
        httpentity = new BufferedReader(new InputStreamReader(httpentity.getContent()));
        StringBuffer stringbuffer = new StringBuffer();
        do
        {
            String s = httpentity.readLine();
            if (s == null)
            {
                httpentity.close();
                httpentity = Message.obtain(handler, 2, stringbuffer.toString());
                handler.sendMessage(httpentity);
                return;
            }
            stringbuffer.append(s);
        } while (true);
    }

    public void bitmap(String s)
    {
        create(4, s, null);
    }

    public void bitmap(String s, int i)
    {
        create(4, s, null, i);
    }

    public void cancel()
    {
        isCanceled = true;
    }

    public void create(int i, String s, String s1)
    {
        create(i, s, s1, 0);
    }

    public void create(int i, String s, String s1, int j)
    {
        isCanceled = false;
        method = i;
        url = s;
        data = s1;
        timeout = j;
        ConnectionManager.getInstance().push(this);
    }

    public void delete(String s)
    {
        create(3, s, null);
    }

    public void get(String s)
    {
        create(0, s, null);
    }

    public void get(String s, int i)
    {
        create(0, s, null, i);
    }

    public void head(String s)
    {
        create(5, s, null);
    }

    public void head(String s, int i)
    {
        create(5, s, null, i);
    }

    public void post(String s, String s1)
    {
        create(1, s, s1);
    }

    public void post(String s, String s1, int i)
    {
        create(1, s, s1, i);
    }

    public void put(String s, String s1)
    {
        create(2, s, s1);
    }

    public void run()
    {
        Object obj;
        handler.sendMessage(Message.obtain(handler, 0));
        BasicHttpParams basichttpparams = new BasicHttpParams();
        HttpConnectionParams.setConnectionTimeout(basichttpparams, timeout);
        HttpConnectionParams.setSoTimeout(basichttpparams, timeout);
        String s = AuditudeEnv.getInstance().getAdSettings().getUserAgent();
        obj = s;
        if (!StringUtil.isNotNullOrEmpty(s))
        {
            obj = System.getProperty("http.agent");
        }
        httpClient = new DefaultHttpClient(basichttpparams);
        httpClient.getParams().setParameter("http.protocol.allow-circular-redirects", Boolean.valueOf(true));
        if (StringUtil.isNotNullOrEmpty(((String) (obj))))
        {
            httpClient.getParams().setParameter("http.useragent", obj);
        }
        obj = null;
        method;
        JVM INSTR tableswitch 0 5: default 537
    //                   0 225
    //                   1 269
    //                   2 330
    //                   3 371
    //                   4 395
    //                   5 450;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        int i = ((HttpResponse) (obj)).getStatusLine().getStatusCode();
        if (method != 5) goto _L9; else goto _L8
_L8:
        if (i < 400) goto _L11; else goto _L10
_L10:
        obj = Message.obtain(handler, 2, "false");
_L12:
        handler.sendMessage(((Message) (obj)));
_L15:
        ConnectionManager.getInstance().didComplete(this);
        return;
_L2:
        obj = httpClient.execute(new HttpGet(url), ConnectionManager.getInstance().getLocalContext((new URL(url)).getHost()));
          goto _L1
_L3:
        obj = new HttpPost(url);
        ((HttpPost) (obj)).setEntity(new StringEntity(data));
        obj = httpClient.execute(((org.apache.http.client.methods.HttpUriRequest) (obj)), ConnectionManager.getInstance().getLocalContext((new URL(url)).getHost()));
          goto _L1
_L4:
        obj = new HttpPut(url);
        ((HttpPut) (obj)).setEntity(new StringEntity(data));
        obj = httpClient.execute(((org.apache.http.client.methods.HttpUriRequest) (obj)));
          goto _L1
_L5:
        obj = httpClient.execute(new HttpDelete(url));
          goto _L1
_L6:
        obj = httpClient.execute(new HttpGet(url));
        processBitmapEntity(((HttpResponse) (obj)).getEntity());
          goto _L1
_L7:
        obj = httpClient.execute(new HttpHead(url));
          goto _L1
_L11:
        obj = Message.obtain(handler, 2, "true");
          goto _L12
_L9:
        if (i < 400) goto _L14; else goto _L13
_L13:
        try
        {
            handler.sendMessage(Message.obtain(handler, 1));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            handler.sendMessage(Message.obtain(handler, 1, obj));
        }
          goto _L15
_L14:
        if (method >= 4) goto _L15; else goto _L16
_L16:
        processEntity(((HttpResponse) (obj)).getEntity());
          goto _L15
    }
}
