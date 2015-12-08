// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.location.internal.geo;

import com.worklight.location.api.geo.WLGeoAcquisitionPolicy;
import com.worklight.location.api.geo.WLGeoCallback;
import com.worklight.location.api.geo.WLGeoPosition;
import com.worklight.location.internal.AbstractPosition;
import com.worklight.location.internal.DeviceContextImpl;
import com.worklight.location.internal.DeviceImpl;
import com.worklight.location.internal.ICallbackExecutor;
import com.worklight.location.internal.RuntimeTriggerContainer;

// Referenced classes of package com.worklight.location.internal.geo:
//            GeoAcquisitor, EmptyGeoPosition

public final class RTCGeoAcquireLinker
    implements WLGeoCallback
{

    private ICallbackExecutor executor;
    private final WLGeoAcquisitionPolicy policy;
    private final WLGeoCallback successCallback;
    private final DeviceImpl wlDevice;

    public RTCGeoAcquireLinker(DeviceImpl deviceimpl, WLGeoCallback wlgeocallback, WLGeoAcquisitionPolicy wlgeoacquisitionpolicy, ICallbackExecutor icallbackexecutor)
    {
        wlDevice = deviceimpl;
        successCallback = wlgeocallback;
        policy = wlgeoacquisitionpolicy;
        executor = icallbackexecutor;
    }

    private boolean isUpdateRequired(WLGeoPosition wlgeoposition, boolean flag)
    {
        WLGeoPosition wlgeoposition1;
        if (wlDevice.getGeoAcquisitor().isAcquiring())
        {
            if ((wlgeoposition1 = wlDevice.getDeviceContextImpl().getGeoPosition()) == null || (wlgeoposition1 instanceof EmptyGeoPosition) || wlgeoposition.getTimestamp().longValue() >= wlgeoposition1.getTimestamp().longValue() && (!flag || !wlgeoposition.equals(wlgeoposition1)) && (policy.isEnableHighAccuracy() || !wlDevice.getGeoAcquisitor().getWatchPolicy().isEnableHighAccuracy()))
            {
                return true;
            }
        }
        return false;
    }

    public void execute(WLGeoPosition wlgeoposition)
    {
        boolean flag;
        flag = isUpdateRequired(wlgeoposition, true);
        if (flag)
        {
            wlDevice.getDeviceContextImpl().setGeoPosition(wlgeoposition);
        }
        executor.executeGeoAcquisitionCallback(successCallback, wlgeoposition);
        if (flag && isUpdateRequired(wlgeoposition, false))
        {
            wlDevice.getRTC().geoLocationAcquired(wlgeoposition);
        }
        return;
        Exception exception;
        exception;
        if (flag && isUpdateRequired(wlgeoposition, false))
        {
            wlDevice.getRTC().geoLocationAcquired(wlgeoposition);
        }
        throw exception;
    }

    public volatile void execute(AbstractPosition abstractposition)
    {
        execute((WLGeoPosition)abstractposition);
    }
}
