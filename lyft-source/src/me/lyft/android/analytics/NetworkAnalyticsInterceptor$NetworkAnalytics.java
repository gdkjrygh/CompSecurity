// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.analytics;

import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import java.util.UUID;
import me.lyft.android.analytics.definitions.CallEvent;
import me.lyft.android.infrastructure.device.IDevice;

// Referenced classes of package me.lyft.android.analytics:
//            Analytics, NetworkAnalyticsInterceptor

class device
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
        CallEvent callevent = new CallEvent(me.lyft.android.analytics.definitions., me.lyft.android.analytics.definitions., callId);
        callevent.setSampleRate(f);
        NetworkAnalyticsInterceptor.mapRequestInfo(request, callevent);
        Analytics.track(callevent);
    }

    public void trackResponse(Response response)
    {
        long l = device.getElapsedRealtime();
        CallEvent callevent = new CallEvent(me.lyft.android.analytics.definitions., me.lyft.android.analytics.definitions., callId);
        callevent.setSampleRate(samplingRate);
        NetworkAnalyticsInterceptor.mapRequestInfo(response.request(), callevent);
        NetworkAnalyticsInterceptor.mapResponseInfo(response, callevent);
        trackResult(callevent, startTime, l);
    }

    public void trackResponseFailure(Request request, Throwable throwable)
    {
        long l = device.getElapsedRealtime();
        CallEvent callevent = new CallEvent(me.lyft.android.analytics.definitions., me.lyft.android.analytics.definitions., callId);
        callevent.setSampleRate(samplingRate);
        NetworkAnalyticsInterceptor.mapRequestInfo(request, callevent);
        NetworkAnalyticsInterceptor.mapFailureInfo(throwable, callevent);
        trackResult(callevent, startTime, l);
    }

    (IDevice idevice)
    {
        device = idevice;
    }
}
