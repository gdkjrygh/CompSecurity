// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.configuration.drm;

import android.os.AsyncTask;
import com.netflix.mediaclient.Log;
import java.io.IOException;
import java.net.SocketTimeoutException;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.util.EntityUtils;

public final class WidevineCDMProvisionRequestTask extends AsyncTask
{

    public static final int DEFAULT_CONNECTION_TIMEOUT = 5000;
    public static final int DEFAULT_SOCKET_TIMEOUT = 3000;
    private final String TAG;
    private WidevineDrmManager.WidewineProvisiongCallback callback;
    private int connectionTimeout;
    private byte drmRequest[];
    private int socketTimeout;

    public WidevineCDMProvisionRequestTask(byte abyte0[], WidevineDrmManager.WidewineProvisiongCallback widewineprovisiongcallback)
    {
        TAG = "nf_net";
        connectionTimeout = 5000;
        socketTimeout = 3000;
        drmRequest = abyte0;
        callback = widewineprovisiongcallback;
    }

    public WidevineCDMProvisionRequestTask(byte abyte0[], WidevineDrmManager.WidewineProvisiongCallback widewineprovisiongcallback, int i, int j)
    {
        this(abyte0, widewineprovisiongcallback);
        connectionTimeout = i;
        socketTimeout = j;
    }

    private byte[] postRequest(String s, byte abyte0[])
    {
        DefaultHttpClient defaulthttpclient;
        defaulthttpclient = new DefaultHttpClient();
        s = new HttpPost((new StringBuilder()).append(s).append("&signedRequest=").append(new String(abyte0)).toString());
        abyte0 = defaulthttpclient.getParams();
        HttpConnectionParams.setConnectionTimeout(abyte0, connectionTimeout);
        HttpConnectionParams.setSoTimeout(abyte0, socketTimeout);
        if (Log.isLoggable("nf_net", 3))
        {
            Log.d("nf_net", (new StringBuilder()).append("PostRequest:").append(s.getRequestLine()).toString());
        }
        int i;
        s.setHeader("Accept", "*/*");
        s.setHeader("User-Agent", "Widevine CDM v1.0");
        s.setHeader("Content-Type", "application/json");
        s = defaulthttpclient.execute(s);
        i = s.getStatusLine().getStatusCode();
        if (i != 200)
        {
            break MISSING_BLOCK_LABEL_169;
        }
        return EntityUtils.toByteArray(s.getEntity());
        if (!Log.isLoggable("nf_net", 3))
        {
            break MISSING_BLOCK_LABEL_252;
        }
        Log.d("nf_net", (new StringBuilder()).append("Server returned HTTP error code ").append(i).toString());
        return null;
        s;
        Log.e("nf_net", "Connection timeout", s);
        return null;
        s;
        Log.e("nf_net", "Socket timeout", s);
        return null;
        s;
        Log.e("nf_net", "Request protocol failed", s);
        return null;
        s;
        Log.e("nf_net", "Request IO failed ", s);
        return null;
    }

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((String[])aobj);
    }

    protected transient byte[] doInBackground(String as[])
    {
        as = postRequest(as[0], drmRequest);
        if (as != null)
        {
            Log.d("nf_net", (new StringBuilder()).append("response length=").append(as.length).toString());
        } else
        {
            Log.e("nf_net", "Response is null!");
        }
        if (callback != null)
        {
            callback.done(as);
        }
        return as;
    }
}
