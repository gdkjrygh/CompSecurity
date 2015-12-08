// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fsr.tracker.tasks;

import android.os.AsyncTask;
import fs.org.slf4j.Logger;
import fs.org.slf4j.LoggerFactory;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

public class BatchHttpGetAsyncTask extends AsyncTask
{
    public static interface AsyncCallback
    {

        public abstract void onComplete(Object obj);
    }


    private AsyncCallback callback;
    private Logger logger;

    public BatchHttpGetAsyncTask()
    {
        logger = LoggerFactory.getLogger("ForeSee Trigger Code");
    }

    private String doRequest(String s)
        throws IOException
    {
        DefaultHttpClient defaulthttpclient = new DefaultHttpClient();
        HttpResponse httpresponse = defaulthttpclient.execute(new HttpGet(s));
        String s1 = null;
        if (httpresponse != null)
        {
            s1 = EntityUtils.toString(httpresponse.getEntity());
        }
        logger.debug("HTTP GET to {} returned code: {}", s, Integer.valueOf(httpresponse.getStatusLine().getStatusCode()));
        defaulthttpclient.getConnectionManager().shutdown();
        return s1;
    }

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((String[])aobj);
    }

    protected transient Map doInBackground(String as[])
    {
        Object obj;
        HashMap hashmap;
        int i;
        boolean flag;
        int j;
        hashmap = new HashMap();
        flag = true;
        obj = null;
        j = as.length;
        i = 0;
_L2:
        String s;
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        s = as[i];
        String s1 = doRequest(s);
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        hashmap.put(s, s1.trim());
        flag = false;
_L3:
        i++;
        if (true) goto _L2; else goto _L1
        obj;
        obj = s;
        logger.error("Attempted HTTP GET to: {}", s);
          goto _L3
_L1:
        if (flag)
        {
            hashmap.put("ERROR", obj);
        }
        return hashmap;
    }

    public AsyncCallback getCallback()
    {
        return callback;
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((Map)obj);
    }

    protected void onPostExecute(Map map)
    {
        super.onPostExecute(map);
        if (callback != null)
        {
            callback.onComplete(map);
        }
    }

    public void setCallback(AsyncCallback asynccallback)
    {
        callback = asynccallback;
    }
}
