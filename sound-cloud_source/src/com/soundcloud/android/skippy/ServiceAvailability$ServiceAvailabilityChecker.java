// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.skippy;

import android.os.AsyncTask;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;
import java.util.Timer;

// Referenced classes of package com.soundcloud.android.skippy:
//            ServiceAvailability

private class <init> extends AsyncTask
{

    private static final int CONNECTION_TIMEOUT_MS = 15000;
    private static final int DATA_TRANSFER_TIMEOUT_MS = 15000;
    private static final int HEALTH_CHECK_INTERVAL_MS = 10000;
    private static final String HEALTH_CHECK_RESPONSE = "\"OK\"";
    private static final String HEALTH_CHECK_URL = "https://api-mobile.soundcloud.com/-/health";
    final ServiceAvailability this$0;

    private HttpURLConnection createAndConfigureHttpConnection(Proxy proxy)
        throws IOException
    {
        proxy = (HttpURLConnection)(HttpURLConnection)(new URL("https://api-mobile.soundcloud.com/-/health")).openConnection(proxy);
        proxy.setRequestMethod("GET");
        HttpURLConnection.setFollowRedirects(true);
        proxy.setDefaultUseCaches(false);
        proxy.setRequestProperty("Connection", "close");
        proxy.setRequestProperty("User-Agent", "SoundCloud-Android");
        proxy.setConnectTimeout(15000);
        proxy.setReadTimeout(15000);
        return proxy;
    }

    private <init> verifyProbeHttpResponse(HttpURLConnection httpurlconnection)
        throws IOException
    {
        <init> <init>2 = ;
        (new StringBuilder("Response code is:")).append(httpurlconnection.getResponseCode());
        <init> <init>1 = <init>2;
        if (httpurlconnection.getResponseCode() / 100 == 2)
        {
            <init>1 = <init>2;
            if ("\"OK\"".equals((new BufferedReader(new InputStreamReader(httpurlconnection.getInputStream()))).readLine()))
            {
                <init>1 = ;
            }
        }
        (new StringBuilder("Result is ")).append(<init>1);
        return <init>1;
    }

    protected transient  doInBackground(Proxy aproxy[])
    {
         1 = ;
        if (!isCancelled()) goto _L2; else goto _L1
_L1:
        Object obj = null;
_L4:
        return ((isCancelled) (obj));
_L2:
        (new StringBuilder("Sending async HTTP request.Porxy for health check is:")).append(aproxy[0]);
        aproxy = createAndConfigureHttpConnection(aproxy[0]);
        obj = aproxy;
        boolean flag = isCancelled();
        if (flag)
        {
            if (aproxy != null)
            {
                aproxy.disconnect();
            }
            return null;
        }
        obj = aproxy;
        aproxy.connect();
        obj = aproxy;
          = verifyProbeHttpResponse(aproxy);
        obj = ;
        if (aproxy != null)
        {
            aproxy.disconnect();
            return ;
        }
        if (true) goto _L4; else goto _L3
_L3:
        IOException ioexception;
        ioexception;
        aproxy = null;
_L8:
        obj = aproxy;
        (new StringBuilder("Disabling cache - exception while sending probe http request: ")).append(ioexception.getMessage());
        obj = aproxy;
        notifyListenersServiceAvailabilityChanged(false);
        obj = 1;
        if (aproxy == null) goto _L4; else goto _L5
_L5:
        aproxy.disconnect();
        return 1;
        aproxy;
        obj = null;
_L7:
        if (obj != null)
        {
            ((HttpURLConnection) (obj)).disconnect();
        }
        throw aproxy;
        aproxy;
        if (true) goto _L7; else goto _L6
_L6:
        ioexception;
          goto _L8
    }

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((Proxy[])aobj);
    }

    protected void onPostExecute(doInBackground doinbackground)
    {
        (new StringBuilder("onPostExecute - result is ")).append(doinbackground.<init>());
        notifyListenersServiceAvailabilityChanged(doinbackground.abilityChanged(abilityChanged));
        if (doinbackground.abilityChanged() && ServiceAvailability.access$108(ServiceAvailability.this) < 15)
        {
            class _cls1 extends TimerTask
            {

                ServiceAvailability.ServiceAvailabilityChecker httpHealthChecker;
                final ServiceAvailability.ServiceAvailabilityChecker this$1;

                public boolean cancel()
                {
                    httpHealthChecker.cancel(false);
                    return super.cancel();
                }

                public void run()
                {
                    httpHealthChecker.execute(new Proxy[] {
                        ServiceAvailability.access$300(this$0).getSystemProxy()
                    });
                }

            _cls1()
            {
                this$1 = ServiceAvailability.ServiceAvailabilityChecker.this;
                super();
                httpHealthChecker = new ServiceAvailability.ServiceAvailabilityChecker(null);
            }
            }

            ServiceAvailability.access$202(ServiceAvailability.this, new _cls1());
            ServiceAvailability.access$400(ServiceAvailability.this).schedule(ServiceAvailability.access$200(ServiceAvailability.this), 10000L);
        }
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((onPostExecute)obj);
    }

    private _cls1()
    {
        this$0 = ServiceAvailability.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
