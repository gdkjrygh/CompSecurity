// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.common;

import android.net.http.AndroidHttpClient;
import android.os.AsyncTask;
import com.mopub.common.logging.MoPubLog;
import java.net.URI;
import org.apache.http.client.methods.HttpUriRequest;

// Referenced classes of package com.mopub.common:
//            HttpClient, DownloadResponse

public class DownloadTask extends AsyncTask
{

    private final DownloadTaskListener a;
    private String b;

    public DownloadTask(DownloadTaskListener downloadtasklistener)
    {
        if (downloadtasklistener == null)
        {
            throw new IllegalArgumentException("DownloadTaskListener must not be null.");
        } else
        {
            a = downloadtasklistener;
            return;
        }
    }

    private transient DownloadResponse a(HttpUriRequest ahttpurirequest[])
    {
        if (ahttpurirequest != null && ahttpurirequest.length != 0 && ahttpurirequest[0] != null) goto _L2; else goto _L1
_L1:
        MoPubLog.d("Download task tried to execute null or empty url");
        ahttpurirequest = null;
_L4:
        return ahttpurirequest;
_L2:
        Object obj;
        obj = ahttpurirequest[0];
        b = ((HttpUriRequest) (obj)).getURI().toString();
        AndroidHttpClient androidhttpclient = HttpClient.getHttpClient();
        ahttpurirequest = androidhttpclient;
        obj = new DownloadResponse(androidhttpclient.execute(((HttpUriRequest) (obj))));
        ahttpurirequest = ((HttpUriRequest []) (obj));
        if (androidhttpclient != null)
        {
            androidhttpclient.close();
            return ((DownloadResponse) (obj));
        }
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception1;
        exception1;
        androidhttpclient = null;
_L8:
        ahttpurirequest = androidhttpclient;
        MoPubLog.d("Download task threw an internal exception", exception1);
        if (androidhttpclient != null)
        {
            androidhttpclient.close();
        }
        return null;
        Exception exception;
        exception;
        ahttpurirequest = null;
_L6:
        if (ahttpurirequest != null)
        {
            ahttpurirequest.close();
        }
        throw exception;
        exception;
        if (true) goto _L6; else goto _L5
_L5:
        exception1;
        if (true) goto _L8; else goto _L7
_L7:
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((HttpUriRequest[])aobj);
    }

    protected void onCancelled()
    {
        MoPubLog.d("DownloadTask was cancelled.");
    }

    protected void onPostExecute(Object obj)
    {
        obj = (DownloadResponse)obj;
        if (isCancelled())
        {
            onCancelled();
            return;
        } else
        {
            a.onComplete(b, ((DownloadResponse) (obj)));
            return;
        }
    }

    private class DownloadTaskListener
    {

        public abstract void onComplete(String s, DownloadResponse downloadresponse);
    }

}
