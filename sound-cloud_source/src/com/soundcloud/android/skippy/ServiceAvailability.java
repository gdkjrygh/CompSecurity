// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.skippy;

import android.content.Context;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Message;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Timer;
import java.util.TimerTask;

// Referenced classes of package com.soundcloud.android.skippy:
//            NetworkConnectivityListener, ProxyUtils, ServiceAvailabilityListener

public class ServiceAvailability extends Handler
{
    private class ServiceAvailabilityChecker extends AsyncTask
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

        private NetworkConnectivityListener.State verifyProbeHttpResponse(HttpURLConnection httpurlconnection)
            throws IOException
        {
            NetworkConnectivityListener.State state1 = NetworkConnectivityListener.State.NOT_CONNECTED;
            (new StringBuilder("Response code is:")).append(httpurlconnection.getResponseCode());
            NetworkConnectivityListener.State state = state1;
            if (httpurlconnection.getResponseCode() / 100 == 2)
            {
                state = state1;
                if ("\"OK\"".equals((new BufferedReader(new InputStreamReader(httpurlconnection.getInputStream()))).readLine()))
                {
                    state = NetworkConnectivityListener.State.CONNECTED;
                }
            }
            (new StringBuilder("Result is ")).append(state);
            return state;
        }

        protected transient NetworkConnectivityListener.State doInBackground(Proxy aproxy[])
        {
            NetworkConnectivityListener.State state1 = NetworkConnectivityListener.State.NOT_CONNECTED;
            if (!isCancelled()) goto _L2; else goto _L1
_L1:
            Object obj = null;
_L4:
            return ((NetworkConnectivityListener.State) (obj));
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
            NetworkConnectivityListener.State state = verifyProbeHttpResponse(aproxy);
            obj = state;
            if (aproxy != null)
            {
                aproxy.disconnect();
                return state;
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
            obj = state1;
            if (aproxy == null) goto _L4; else goto _L5
_L5:
            aproxy.disconnect();
            return state1;
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

        protected void onPostExecute(NetworkConnectivityListener.State state)
        {
            (new StringBuilder("onPostExecute - result is ")).append(state.name());
            notifyListenersServiceAvailabilityChanged(state.equals(NetworkConnectivityListener.State.CONNECTED));
            if (state.equals(NetworkConnectivityListener.State.NOT_CONNECTED) && int i = 
// JavaClassFileOutputException: get_constant: invalid tag

        protected volatile void onPostExecute(Object obj)
        {
            onPostExecute((NetworkConnectivityListener.State)obj);
        }

        private ServiceAvailabilityChecker()
        {
            this$0 = ServiceAvailability.this;
            super();
        }

        ServiceAvailabilityChecker(_cls1 _pcls1)
        {
            this();
        }

        class _cls1 extends TimerTask
        {

            ServiceAvailabilityChecker httpHealthChecker;
            final ServiceAvailabilityChecker this$1;

            public boolean cancel()
            {
                httpHealthChecker.cancel(false);
                return cancel();
            }

            public void run()
            {
                httpHealthChecker.execute(new Proxy[] {
                    proxyUtils.getSystemProxy()
                });
            }

                _cls1()
                {
                    this$1 = ServiceAvailabilityChecker.this;
                    super();
                    httpHealthChecker = new ServiceAvailabilityChecker(null);
                }
        }

    }


    private static final int MAX_HEALTH_RETRY_CNT = 15;
    private static final String TAG = "ServiceAvailability";
    private boolean active;
    private Context context;
    private int healthCheckRetryCount;
    private Timer healthCheckTimer;
    private TimerTask healthTimerTask;
    private Collection listeners;
    private NetworkConnectivityListener networkConnectivityListener;
    private ServiceAvailabilityChecker probeCheck;
    private final ProxyUtils proxyUtils;

    public ServiceAvailability(Context context1)
    {
        ServiceAvailability(context1, new NetworkConnectivityListener(), ((Collection) (new HashSet())));
    }

    ServiceAvailability(Context context1, NetworkConnectivityListener networkconnectivitylistener, Collection collection)
    {
        proxyUtils = new ProxyUtils();
        networkConnectivityListener = networkconnectivitylistener;
        listeners = collection;
        context = context1;
    }

    private void cancelHealthCheckTask()
    {
        healthCheckRetryCount = 0;
        if (healthTimerTask != null)
        {
            healthTimerTask.cancel();
        }
        healthCheckTimer.purge();
    }

    public void handleMessage(Message message)
    {
        (new StringBuilder("Connectivity handler invoked.")).append(message.arg1).append(" ").append(message.arg2);
        NetworkInfo networkinfo = (NetworkInfo)message.obj;
        cancelHealthCheckTask();
        message = NetworkConnectivityListener.State.values[message.arg2];
        if (message == NetworkConnectivityListener.State.NOT_CONNECTED)
        {
            notifyListenersServiceAvailabilityChanged(false);
        } else
        if (message == NetworkConnectivityListener.State.CONNECTED)
        {
            if (networkinfo.getType() == 1)
            {
                if (probeCheck != null)
                {
                    probeCheck.cancel(false);
                }
                probeCheck = new ServiceAvailabilityChecker(null);
                probeCheck.execute(new Proxy[] {
                    proxyUtils.getSystemProxy()
                });
                return;
            } else
            {
                notifyListenersServiceAvailabilityChanged(true);
                return;
            }
        }
    }

    public void notifyListenersServiceAvailabilityChanged(boolean flag)
    {
        (new StringBuilder("Service availablility: ")).append(flag).append(". Notifying listeners");
        for (Iterator iterator = listeners.iterator(); iterator.hasNext(); ((ServiceAvailabilityListener)iterator.next()).onServiceAvailabilityChanged(flag)) { }
    }

    public void registerListener(ServiceAvailabilityListener serviceavailabilitylistener)
    {
        listeners.add(serviceavailabilitylistener);
        if (!active)
        {
            healthCheckTimer = new Timer("ServiceAvailabilityCheck");
            networkConnectivityListener.startListening(context);
            networkConnectivityListener.registerHandler(this, 2807);
            active = true;
        }
    }

    protected void stop()
    {
        if (probeCheck != null)
        {
            probeCheck.cancel(false);
        }
        cancelHealthCheckTask();
    }

    public void unregisterListener(ServiceAvailabilityListener serviceavailabilitylistener)
    {
        listeners.remove(serviceavailabilitylistener);
        if (active && listeners.isEmpty())
        {
            networkConnectivityListener.stopListening();
            networkConnectivityListener.unregisterHandler(this);
            stop();
            healthCheckTimer.cancel();
            active = false;
        }
    }


/*
    static int access$108(ServiceAvailability serviceavailability)
    {
        int i = serviceavailability.healthCheckRetryCount;
        serviceavailability.healthCheckRetryCount = i + 1;
        return i;
    }

*/



/*
    static TimerTask access$202(ServiceAvailability serviceavailability, TimerTask timertask)
    {
        serviceavailability.healthTimerTask = timertask;
        return timertask;
    }

*/


}
