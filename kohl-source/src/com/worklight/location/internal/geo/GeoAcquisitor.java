// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.location.internal.geo;

import com.worklight.location.api.geo.WLGeoAcquisitionPolicy;
import com.worklight.location.api.geo.WLGeoCallback;
import com.worklight.location.api.geo.WLGeoFailureCallback;

// Referenced classes of package com.worklight.location.internal.geo:
//            LocationHandler, GeoFactory

public class GeoAcquisitor
{

    private GeoFactory factory;
    private LocationHandler watchHandler;

    public GeoAcquisitor(GeoFactory geofactory)
    {
        factory = geofactory;
    }

    public void acquirePosition(WLGeoCallback wlgeocallback, WLGeoFailureCallback wlgeofailurecallback, WLGeoAcquisitionPolicy wlgeoacquisitionpolicy)
    {
        createLocationHandler(wlgeocallback, wlgeofailurecallback, wlgeoacquisitionpolicy, false).start();
    }

    protected LocationHandler createLocationHandler(WLGeoCallback wlgeocallback, WLGeoFailureCallback wlgeofailurecallback, WLGeoAcquisitionPolicy wlgeoacquisitionpolicy, boolean flag)
    {
        return factory.createLocationHandler(wlgeocallback, wlgeofailurecallback, wlgeoacquisitionpolicy, flag);
    }

    public WLGeoAcquisitionPolicy getWatchPolicy()
    {
        if (isAcquiring())
        {
            return watchHandler.policy;
        } else
        {
            return null;
        }
    }

    public boolean isAcquiring()
    {
        return watchHandler != null;
    }

    public void startAcquisition(WLGeoCallback wlgeocallback, WLGeoFailureCallback wlgeofailurecallback, WLGeoAcquisitionPolicy wlgeoacquisitionpolicy)
    {
        stopAcquisition();
        watchHandler = createLocationHandler(wlgeocallback, wlgeofailurecallback, wlgeoacquisitionpolicy, true);
        watchHandler.start();
    }

    public void stopAcquisition()
    {
        if (watchHandler != null)
        {
            watchHandler.cancel();
            watchHandler = null;
        }
    }
}
