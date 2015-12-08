// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.wallet.rest;

import android.content.Context;
import android.net.Uri;
import android.net.http.AndroidHttpClient;
import com.google.gson.Gson;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.util.List;
import org.apache.http.HttpResponse;
import org.apache.http.NoHttpResponseException;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.impl.client.DefaultHttpClient;

public class KohlsRestService
{

    protected WeakReference mContext;

    public KohlsRestService(WeakReference weakreference)
    {
        mContext = weakreference;
    }

    private boolean isAirplaneModeOn(Context context)
    {
        if (android.os.Build.VERSION.SDK_INT > 16) goto _L2; else goto _L1
_L1:
        if (android.provider.Settings.System.getInt(context.getContentResolver(), "airplane_mode_on", 0) == 0) goto _L4; else goto _L3
_L3:
        return true;
_L4:
        return false;
_L2:
        if (android.provider.Settings.System.getInt(context.getContentResolver(), "airplane_mode_on", 0) == 0)
        {
            return false;
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    protected boolean executePost(Uri uri, List list)
    {
        HttpPost httppost;
        boolean flag;
        flag = false;
        httppost = new HttpPost(uri.toString());
        uri = AndroidHttpClient.newInstance("Android");
        int i;
        httppost.setEntity(new UrlEncodedFormEntity(list));
        i = uri.execute(httppost).getStatusLine().getStatusCode();
        if (i == 200)
        {
            flag = true;
        }
        uri.close();
        return flag;
        list;
        list.printStackTrace();
        uri.close();
        return false;
        list;
        list.printStackTrace();
        uri.close();
        return false;
        list;
        list.printStackTrace();
        uri.close();
        return false;
        list;
        uri.close();
        throw list;
    }

    protected HttpResponse executeRequest(HttpUriRequest httpurirequest)
    {
        DefaultHttpClient defaulthttpclient = new DefaultHttpClient();
        Object obj = null;
        try
        {
            httpurirequest = defaulthttpclient.execute(httpurirequest);
        }
        catch (IOException ioexception)
        {
            httpurirequest = obj;
            if (!(ioexception instanceof NoHttpResponseException))
            {
                httpurirequest = obj;
                if (ioexception instanceof ConnectTimeoutException)
                {
                    return null;
                }
            }
        }
        return httpurirequest;
    }

    protected Gson getGson()
    {
        return new Gson();
    }
}
