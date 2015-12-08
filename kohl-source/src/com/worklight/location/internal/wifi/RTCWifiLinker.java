// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.location.internal.wifi;

import com.worklight.location.internal.AbstractPosition;
import com.worklight.location.internal.GenericRTCLinker;
import com.worklight.location.internal.RuntimeTriggerContainer;
import com.worklight.location.internal.wifi.triggerEvaluators.WifiInternalLocation;

// Referenced classes of package com.worklight.location.internal.wifi:
//            WifiInternalCallback

public final class RTCWifiLinker extends GenericRTCLinker
    implements WifiInternalCallback
{

    public RTCWifiLinker(RuntimeTriggerContainer runtimetriggercontainer)
    {
        super(runtimetriggercontainer);
    }

    public volatile void execute(AbstractPosition abstractposition)
    {
        execute((WifiInternalLocation)abstractposition);
    }

    public void execute(WifiInternalLocation wifiinternallocation)
    {
        rtc.wifiLocationAcquired(wifiinternallocation);
    }
}
