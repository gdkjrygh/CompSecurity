// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads.loader;

import android.os.Handler;
import android.os.Message;
import com.auditude.ads.util.StringUtil;
import com.auditude.ads.util.http.AsyncHttpConnection;
import com.auditude.ads.util.log.ILogger;
import com.auditude.ads.util.log.Log;

public class DataLoader
{
    public static interface DataLoaderListener
    {

        public abstract void onRequestComplete(String s);

        public abstract void onRequestFailed(Throwable throwable);
    }


    private Throwable error;
    private AsyncHttpConnection httpClient;
    private DataLoaderListener listener;
    private String postParams;
    private String requestURL;

    public DataLoader()
    {
    }

    private void notifyRequestFailed(Throwable throwable)
    {
        if (listener != null)
        {
            listener.onRequestFailed(throwable);
        }
    }

    public void cancel()
    {
        try
        {
            if (httpClient != null)
            {
                httpClient.cancel();
            }
            return;
        }
        catch (RuntimeException runtimeexception)
        {
            return;
        }
    }

    public final Throwable getError()
    {
        return error;
    }

    public final void load(String s, String s1, int i)
    {
        load(s, s1, i, Boolean.valueOf(false));
    }

    public final void load(String s, String s1, int i, Boolean boolean1)
    {
        requestURL = s;
        postParams = s1;
        Log.getLogger().info((new StringBuilder("Sending adserver request to: ")).append(requestURL).toString());
        httpClient = new AsyncHttpConnection(new Handler() {

            final DataLoader this$0;

            public void handleMessage(Message message)
            {
                message.what;
                JVM INSTR tableswitch 0 2: default 32
            //                           0 32
            //                           1 65
            //                           2 33;
                   goto _L1 _L1 _L2 _L3
_L1:
                return;
_L3:
                message = (String)message.obj;
                if (listener != null)
                {
                    listener.onRequestComplete(message);
                    return;
                }
                  goto _L1
_L2:
                error = (Exception)message.obj;
                notifyRequestFailed(error);
                return;
            }

            
            {
                this$0 = DataLoader.this;
                super();
            }
        });
        if (StringUtil.isNullOrEmpty(postParams))
        {
            if (boolean1.booleanValue())
            {
                httpClient.head(requestURL, i * 1000);
                return;
            } else
            {
                httpClient.get(requestURL, i * 1000);
                return;
            }
        } else
        {
            httpClient.post(requestURL, postParams, i * 1000);
            return;
        }
    }

    public void setDataLoaderListener(DataLoaderListener dataloaderlistener)
    {
        listener = dataloaderlistener;
    }




}
