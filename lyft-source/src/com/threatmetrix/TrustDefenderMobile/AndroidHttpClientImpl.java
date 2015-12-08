// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.threatmetrix.TrustDefenderMobile;

import android.content.Context;
import android.net.http.AndroidHttpClient;
import android.util.Log;
import java.util.concurrent.Executor;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.params.HttpConnectionParams;

// Referenced classes of package com.threatmetrix.TrustDefenderMobile:
//            TDHttpClient, StringUtils, ApacheURLConnectionImpl, CancelState, 
//            TDURLConnection

class AndroidHttpClientImpl
    implements TDHttpClient
{

    private static final String d = StringUtils.a(com/threatmetrix/TrustDefenderMobile/AndroidHttpClientImpl);
    AndroidHttpClient a;
    boolean b;
    Context c;

    AndroidHttpClientImpl()
    {
        b = false;
    }

    static String a()
    {
        return d;
    }

    public TDURLConnection a(CancelState cancelstate)
    {
        return new ApacheURLConnectionImpl(a, cancelstate, c, b);
    }

    public void a(Context context, int i, String s, boolean flag)
    {
        Log.d(d, "Creating AndroidHttpClient instance");
        b = flag;
        a = AndroidHttpClient.newInstance(s, context);
        c = context;
        s = a.getParams();
        HttpConnectionParams.setConnectionTimeout(s, i);
        HttpConnectionParams.setSoTimeout(s, i);
        HttpConnectionParams.setTcpNoDelay(s, true);
        HttpConnectionParams.setStaleCheckingEnabled(s, false);
        ApacheURLConnectionImpl.a(context, a, i);
    }

    public void a(Executor executor)
    {
        final class _cls1ShutdownRunnable
            implements Runnable
        {

            final AndroidHttpClient a;
            final AndroidHttpClientImpl b;

            public void run()
            {
                if (a == null)
                {
                    return;
                }
                try
                {
                    a.close();
                    a.getConnectionManager().shutdown();
                    return;
                }
                catch (RuntimeException runtimeexception)
                {
                    Log.e(AndroidHttpClientImpl.a(), "Swallowing", runtimeexception);
                }
            }

            _cls1ShutdownRunnable(AndroidHttpClient androidhttpclient)
            {
                b = AndroidHttpClientImpl.this;
                super();
                a = androidhttpclient;
            }
        }

        if (a.getConnectionManager() != null)
        {
            executor.execute(new _cls1ShutdownRunnable(a));
        }
    }

}
