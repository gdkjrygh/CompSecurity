// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.location.api;

import com.worklight.location.api.geo.WLGeoAcquisitionPolicy;
import com.worklight.location.api.geo.WLGeoCallback;
import com.worklight.location.api.geo.WLGeoFailureCallback;
import com.worklight.location.api.wifi.WLWifiAcquisitionCallback;
import com.worklight.location.api.wifi.WLWifiAcquisitionPolicy;
import com.worklight.location.api.wifi.WLWifiConnectedCallback;
import com.worklight.location.api.wifi.WLWifiFailureCallback;

// Referenced classes of package com.worklight.location.api:
//            WLDeviceContext, WLLocationServicesConfiguration

public interface WLDevice
{

    public abstract void acquireGeoPosition(WLGeoCallback wlgeocallback, WLGeoFailureCallback wlgeofailurecallback, WLGeoAcquisitionPolicy wlgeoacquisitionpolicy);

    public abstract void acquireWifiVisibleAccessPoints(WLWifiAcquisitionCallback wlwifiacquisitioncallback, WLWifiFailureCallback wlwififailurecallback, WLWifiAcquisitionPolicy wlwifiacquisitionpolicy);

    public abstract void getConnectedAccessPoint(WLWifiConnectedCallback wlwificonnectedcallback, WLWifiFailureCallback wlwififailurecallback);

    public abstract WLDeviceContext getDeviceContext();

    public abstract WLLocationServicesConfiguration getLocationServicesConfig();

    public abstract void startAcquisition(WLLocationServicesConfiguration wllocationservicesconfiguration);

    public abstract void stopAcquisition();
}
