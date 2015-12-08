// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.analytics;

import com.squareup.okhttp.Headers;
import com.squareup.okhttp.Interceptor;
import com.squareup.okhttp.Protocol;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import java.io.IOException;
import java.net.URL;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import me.lyft.android.analytics.definitions.CallEvent;
import me.lyft.android.application.IConstantsProvider;
import me.lyft.android.common.Preconditions;
import me.lyft.android.infrastructure.device.IDevice;
import me.lyft.android.infrastructure.lyft.constants.Constants;

public class NetworkAnalyticsInterceptor
    implements Interceptor
{

    private final IConstantsProvider constantsProvider;
    private final ThreadLocal networkAnalyticsLocal;
    private Random random;

    public NetworkAnalyticsInterceptor(IConstantsProvider iconstantsprovider, final IDevice device)
    {
        random = new Random();
        constantsProvider = iconstantsprovider;
        networkAnalyticsLocal = new ThreadLocal() {

            final NetworkAnalyticsInterceptor this$0;
            final IDevice val$device;

            public volatile Object initialValue()
            {
                return initialValue();
            }

            public NetworkAnalytics initialValue()
            {
                return new NetworkAnalytics(device);
            }

            
            {
                this$0 = NetworkAnalyticsInterceptor.this;
                device = idevice;
                super();
            }

            private class NetworkAnalytics
            {

                private String callId;
                private final IDevice device;
                private float samplingRate;
                private long startTime;

                private void trackResult(CallEvent callevent, long l, long l1)
                {
                    callevent.setDurationMs((int)(l1 - l));
                    Analytics.track(callevent);
                }

                public void trackRequest(Request request, float f)
                {
                    startTime = device.getElapsedRealtime();
                    samplingRate = f;
                    callId = UUID.randomUUID().toString();
                    CallEvent callevent = new CallEvent(me.lyft.android.analytics.definitions.SpanningEvent.Type.INITIATION, me.lyft.android.analytics.definitions.CallEvent.Call.HTTP_REQUEST, callId);
                    callevent.setSampleRate(f);
                    NetworkAnalyticsInterceptor.mapRequestInfo(request, callevent);
                    Analytics.track(callevent);
                }

                public void trackResponse(Response response)
                {
                    long l = device.getElapsedRealtime();
                    CallEvent callevent = new CallEvent(me.lyft.android.analytics.definitions.SpanningEvent.Type.RESULT, me.lyft.android.analytics.definitions.CallEvent.Call.HTTP_REQUEST, callId);
                    callevent.setSampleRate(samplingRate);
                    NetworkAnalyticsInterceptor.mapRequestInfo(response.request(), callevent);
                    NetworkAnalyticsInterceptor.mapResponseInfo(response, callevent);
                    trackResult(callevent, startTime, l);
                }

                public void trackResponseFailure(Request request, Throwable throwable)
                {
                    long l = device.getElapsedRealtime();
                    CallEvent callevent = new CallEvent(me.lyft.android.analytics.definitions.SpanningEvent.Type.RESULT, me.lyft.android.analytics.definitions.CallEvent.Call.HTTP_REQUEST, callId);
                    callevent.setSampleRate(samplingRate);
                    NetworkAnalyticsInterceptor.mapRequestInfo(request, callevent);
                    NetworkAnalyticsInterceptor.mapFailureInfo(throwable, callevent);
                    trackResult(callevent, startTime, l);
                }

                NetworkAnalytics(IDevice idevice)
                {
                    device = idevice;
                }
            }

        };
    }

    private Response interceptWithTracking(com.squareup.okhttp.Interceptor.Chain chain)
    {
        float f = constantsProvider.getConstants().getNetworkAnalyticsSamplingRate();
        NetworkAnalytics networkanalytics = (NetworkAnalytics)networkAnalyticsLocal.get();
        Request request = chain.request();
        networkanalytics.trackRequest(request, f);
        try
        {
            chain = chain.proceed(request);
            networkanalytics.trackResponse(chain);
        }
        // Misplaced declaration of an exception variable
        catch (com.squareup.okhttp.Interceptor.Chain chain)
        {
            networkanalytics.trackResponseFailure(request, chain);
            throw chain;
        }
        return chain;
    }

    private Response interceptWithoutTracking(com.squareup.okhttp.Interceptor.Chain chain)
    {
        return chain.proceed(chain.request());
    }

    static void mapFailureInfo(Throwable throwable, CallEvent callevent)
    {
        String s = throwable.getClass().getSimpleName();
        throwable = throwable.getMessage();
        callevent.setErrorType(s);
        callevent.setErrorMessage(throwable);
        callevent.setResult(me.lyft.android.analytics.definitions.SpanningEvent.Result.FAILURE);
    }

    static void mapRequestInfo(Request request, CallEvent callevent)
    {
        URL url = request.url();
        callevent.setMethod(request.method());
        callevent.setScheme(url.getProtocol());
        callevent.setAuthority(url.getAuthority());
        callevent.setHost(url.getHost());
        callevent.setQuery(url.getQuery());
        callevent.setPath(url.getPath());
    }

    static void mapResponseInfo(Response response, CallEvent callevent)
    {
        int i = response.code();
        callevent.setStatusCode(i);
        Object obj;
        if (response.isSuccessful())
        {
            obj = me.lyft.android.analytics.definitions.SpanningEvent.Result.SUCCESS;
        } else
        if (i >= 500)
        {
            obj = me.lyft.android.analytics.definitions.SpanningEvent.Result.FAILURE;
        } else
        {
            obj = me.lyft.android.analytics.definitions.SpanningEvent.Result.PROHIBITED;
        }
        callevent.setResult(((me.lyft.android.analytics.definitions.SpanningEvent.Result) (obj)));
        obj = response.protocol();
        if (Protocol.HTTP_2 == obj)
        {
            obj = "http/2";
        } else
        {
            obj = ((Protocol) (obj)).toString();
        }
        callevent.setProtocol(((String) (obj)));
        response = response.headers();
        obj = response.names().iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            String s = (String)((Iterator) (obj)).next();
            if (s.equalsIgnoreCase("server"))
            {
                callevent.setServer(response.get(s));
            } else
            if (s.equalsIgnoreCase("x-envoy-upstream-service-time"))
            {
                callevent.setServiceMs(response.get(s));
            }
        } while (true);
    }

    public Response intercept(com.squareup.okhttp.Interceptor.Chain chain)
    {
        try
        {
            if (trackThisInterception())
            {
                return interceptWithTracking(chain);
            }
            chain = interceptWithoutTracking(chain);
        }
        // Misplaced declaration of an exception variable
        catch (com.squareup.okhttp.Interceptor.Chain chain)
        {
            throw chain;
        }
        // Misplaced declaration of an exception variable
        catch (com.squareup.okhttp.Interceptor.Chain chain)
        {
            throw new IOException("Intercepted exception", chain);
        }
        return chain;
    }

    void setRandom(Random random1)
    {
        Preconditions.checkNotNull(random1);
        random = random1;
    }

    boolean trackThisInterception()
    {
        float f = Math.min(1.0F, Math.max(0.0F, constantsProvider.getConstants().getNetworkAnalyticsSamplingRate()));
        return random.nextFloat() < f;
    }
}
