// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.location.internal.geo;

import com.worklight.location.api.geo.WLGeoAcquisitionPolicy;
import com.worklight.location.api.geo.WLGeoCallback;
import com.worklight.location.api.geo.WLGeoError;
import com.worklight.location.api.geo.WLGeoFailureCallback;
import com.worklight.location.api.geo.WLGeoPosition;
import java.util.Timer;

// Referenced classes of package com.worklight.location.internal.geo:
//            TimeoutTimerTask, NativeLocationListener, GeoFactory

public class LocationHandler
{

    protected static Timer timer = new Timer();
    protected WLGeoFailureCallback errorCallback;
    private GeoFactory factory;
    protected boolean isWatchRequest;
    protected WLGeoPosition lastSent;
    private NativeLocationListener nativeLocationHandler;
    protected WLGeoAcquisitionPolicy policy;
    protected WLGeoCallback successCallback;
    private TimeoutTimerTask timeoutTask;

    public LocationHandler(GeoFactory geofactory, WLGeoCallback wlgeocallback, WLGeoFailureCallback wlgeofailurecallback, WLGeoAcquisitionPolicy wlgeoacquisitionpolicy, boolean flag)
    {
        factory = geofactory;
        successCallback = wlgeocallback;
        errorCallback = wlgeofailurecallback;
        policy = wlgeoacquisitionpolicy;
        isWatchRequest = flag;
    }

    protected long calcAge(WLGeoPosition wlgeoposition)
    {
        return System.currentTimeMillis() - wlgeoposition.getTimestamp().longValue();
    }

    public void cancel()
    {
        this;
        JVM INSTR monitorenter ;
        if (timeoutTask != null)
        {
            timeoutTask.cancel();
            timeoutTask = null;
        }
        timer.purge();
        nativeLocationHandler.cancelNativeAcquisition();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    protected void scheduleTimeout()
    {
        this;
        JVM INSTR monitorenter ;
        long l = policy.getTimeout();
        if (l != -1L) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (timeoutTask != null)
        {
            timeoutTask.cancel();
        }
        timer.purge();
        timeoutTask = new TimeoutTimerTask(this);
        timer.schedule(timeoutTask, policy.getTimeout());
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public void sendAndSetTimeoutTimer(WLGeoPosition wlgeoposition)
    {
        sendPosition(wlgeoposition);
        if (isWatchRequest)
        {
            scheduleTimeout();
        }
    }

    public void sendError(com.worklight.location.api.geo.WLGeoError.WLGeoErrorCodes wlgeoerrorcodes, String s)
    {
        this;
        JVM INSTR monitorenter ;
        if (timeoutTask != null)
        {
            timeoutTask.cancel();
        }
        wlgeoerrorcodes = new WLGeoError(wlgeoerrorcodes, s);
        errorCallback.execute(wlgeoerrorcodes);
        this;
        JVM INSTR monitorexit ;
        return;
        wlgeoerrorcodes;
        throw wlgeoerrorcodes;
    }

    protected void sendPosition(WLGeoPosition wlgeoposition)
    {
        this;
        JVM INSTR monitorenter ;
        lastSent = wlgeoposition;
        successCallback.execute(wlgeoposition);
        this;
        JVM INSTR monitorexit ;
        return;
        wlgeoposition;
        throw wlgeoposition;
    }

    public void sendTimeout()
    {
        if (isWatchRequest)
        {
            scheduleTimeout();
        } else
        {
            nativeLocationHandler.cancelNativeAcquisition();
        }
        sendError(com.worklight.location.api.geo.WLGeoError.WLGeoErrorCodes.TIMEOUT, "No location update obtained in the given timeout");
    }

    public void start()
    {
        this;
        JVM INSTR monitorenter ;
        nativeLocationHandler = factory.createLocationListener(this, policy);
        boolean flag1 = false;
        Object obj = nativeLocationHandler.getCachedPosition();
        boolean flag;
        flag = flag1;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_62;
        }
        flag = flag1;
        if ((double)calcAge(((WLGeoPosition) (obj))) > policy.getMaximumAge())
        {
            break MISSING_BLOCK_LABEL_62;
        }
        sendPosition(((WLGeoPosition) (obj)));
        flag = true;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_73;
        }
        if (!isWatchRequest)
        {
            break MISSING_BLOCK_LABEL_100;
        }
        scheduleTimeout();
        obj = nativeLocationHandler;
        boolean flag2;
        if (!isWatchRequest)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        ((NativeLocationListener) (obj)).startNativeAcquisition(flag2);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

}
