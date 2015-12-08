// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fsr.tracker.tasks;

import android.os.AsyncTask;
import android.util.Log;
import fs.org.slf4j.Logger;
import fs.org.slf4j.LoggerFactory;
import java.io.IOException;
import java.net.SocketTimeoutException;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;

public abstract class HttpGetAsyncTask extends AsyncTask
{
    public static interface AsyncCallback
    {

        public abstract void onComplete(Object obj);

        public abstract void onFailure(Throwable throwable);
    }


    public static final int CONNECT_TIMEOUT = 5000;
    private static final int SOCKET_TIMEOUT = 5000;
    private AsyncCallback callback;
    private Logger logger;
    private Throwable thrown;
    private String userAgent;

    protected HttpGetAsyncTask(String s)
    {
        logger = LoggerFactory.getLogger("ForeSee Trigger Code");
        userAgent = s;
    }

    private Object doRequest(String s)
    {
        Object obj;
        try
        {
            obj = new BasicHttpParams();
            HttpConnectionParams.setConnectionTimeout(((org.apache.http.params.HttpParams) (obj)), 5000);
            HttpConnectionParams.setSoTimeout(((org.apache.http.params.HttpParams) (obj)), 5000);
            obj = new DefaultHttpClient(((org.apache.http.params.HttpParams) (obj)));
            HttpGet httpget = new HttpGet(s);
            Log.v("ForeSee Trigger Code", String.format("Adding User-Agent header: %s", new Object[] {
                userAgent
            }));
            httpget.addHeader("User-Agent", userAgent);
            obj = ((HttpClient) (obj)).execute(httpget);
            logger.debug("HTTP GET to {} returned code: {}", s, Integer.valueOf(((HttpResponse) (obj)).getStatusLine().getStatusCode()));
            obj = processResponse(((HttpResponse) (obj)));
        }
        catch (ConnectTimeoutException connecttimeoutexception)
        {
            logger.error("Attempted HTTP GET to: {} timed out", s);
            logger.error(connecttimeoutexception.getMessage(), connecttimeoutexception);
            thrown = connecttimeoutexception;
            return null;
        }
        catch (SocketTimeoutException sockettimeoutexception)
        {
            logger.error("Attempted HTTP GET to: {} socket timed out", s);
            logger.error(sockettimeoutexception.getMessage(), sockettimeoutexception);
            thrown = sockettimeoutexception;
            return null;
        }
        catch (IOException ioexception)
        {
            ioexception.printStackTrace();
            logger.error("Attempted HTTP GET to: {}", s);
            logger.error(ioexception.getMessage(), ioexception);
            thrown = ioexception;
            return null;
        }
        return obj;
    }

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((String[])aobj);
    }

    protected transient Object doInBackground(String as[])
    {
        return doRequest(as[0]);
    }

    public AsyncCallback getCallback()
    {
        return callback;
    }

    protected void onPostExecute(Object obj)
    {
label0:
        {
            super.onPostExecute(obj);
            if (callback != null)
            {
                if (obj == null)
                {
                    break label0;
                }
                callback.onComplete(obj);
            }
            return;
        }
        callback.onFailure(thrown);
    }

    protected abstract Object processResponse(HttpResponse httpresponse);

    public void setCallback(AsyncCallback asynccallback)
    {
        callback = asynccallback;
    }
}
