// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.location.internal;

import com.worklight.location.api.WLDeviceContext;
import com.worklight.location.api.WLTriggerCallback;
import com.worklight.location.api.geo.WLGeoCallback;
import com.worklight.location.api.geo.WLGeoPosition;
import com.worklight.location.internal.wifi.WifiInternalCallback;
import com.worklight.location.internal.wifi.triggerEvaluators.WifiInternalLocation;

// Referenced classes of package com.worklight.location.internal:
//            AcquisitionFailureCallback, AbstractAcquisitionError

public interface ICallbackExecutor
{

    public abstract void executeFailureCallback(AcquisitionFailureCallback acquisitionfailurecallback, AbstractAcquisitionError abstractacquisitionerror);

    public abstract void executeGeoAcquisitionCallback(WLGeoCallback wlgeocallback, WLGeoPosition wlgeoposition);

    public abstract void executeTriggerCallback(WLTriggerCallback wltriggercallback, WLDeviceContext wldevicecontext);

    public abstract void executeWifiAcquisitionCallback(WifiInternalCallback wifiinternalcallback, WifiInternalLocation wifiinternallocation);
}
