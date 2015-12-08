// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.location.internal;

import com.worklight.location.api.geo.triggers.WLGeoDwellInsideTrigger;
import com.worklight.location.api.geo.triggers.WLGeoDwellOutsideTrigger;
import com.worklight.location.api.geo.triggers.WLGeoEnterTrigger;
import com.worklight.location.api.geo.triggers.WLGeoExitTrigger;
import com.worklight.location.api.geo.triggers.WLGeoPositionChangeTrigger;
import com.worklight.location.api.geo.triggers.WLGeoTrigger;
import com.worklight.location.api.wifi.triggers.WLWifiConnectTrigger;
import com.worklight.location.api.wifi.triggers.WLWifiDisconnectTrigger;
import com.worklight.location.api.wifi.triggers.WLWifiDwellInsideTrigger;
import com.worklight.location.api.wifi.triggers.WLWifiDwellOutsideTrigger;
import com.worklight.location.api.wifi.triggers.WLWifiEnterTrigger;
import com.worklight.location.api.wifi.triggers.WLWifiExitTrigger;
import com.worklight.location.api.wifi.triggers.WLWifiTrigger;
import com.worklight.location.api.wifi.triggers.WLWifiVisibleAccessPointsChangeTrigger;
import com.worklight.location.internal.geo.triggerEvaluators.GeoDwelInsideTriggerEvaluator;
import com.worklight.location.internal.geo.triggerEvaluators.GeoDwellOutsideTriggerEvaluator;
import com.worklight.location.internal.geo.triggerEvaluators.GeoEnterAreaTriggerEvaluator;
import com.worklight.location.internal.geo.triggerEvaluators.GeoExitAreaTriggerEvaluator;
import com.worklight.location.internal.geo.triggerEvaluators.GeoPositionChangeTriggerEvaluator;
import com.worklight.location.internal.geo.triggerEvaluators.GeoTriggerEvaluator;
import com.worklight.location.internal.wifi.triggerEvaluators.WifiConnectTriggerEvaluator;
import com.worklight.location.internal.wifi.triggerEvaluators.WifiDisconnectTriggerEvaluator;
import com.worklight.location.internal.wifi.triggerEvaluators.WifiDwellInsideTriggerEvaluator;
import com.worklight.location.internal.wifi.triggerEvaluators.WifiDwellingOutsideTrigger;
import com.worklight.location.internal.wifi.triggerEvaluators.WifiEnterAreaTriggerEvaluator;
import com.worklight.location.internal.wifi.triggerEvaluators.WifiExitAreaTriggerEvaluator;
import com.worklight.location.internal.wifi.triggerEvaluators.WifiTriggerEvaluator;
import com.worklight.location.internal.wifi.triggerEvaluators.WifiVisibleNetworksChangedTriggerEvaluator;

class TriggerEvaluatorBuilder
{

    TriggerEvaluatorBuilder()
    {
    }

    public GeoTriggerEvaluator buildGeoTrigger(WLGeoTrigger wlgeotrigger)
    {
        if (wlgeotrigger instanceof WLGeoPositionChangeTrigger)
        {
            return new GeoPositionChangeTriggerEvaluator((WLGeoPositionChangeTrigger)wlgeotrigger);
        }
        if (wlgeotrigger instanceof WLGeoEnterTrigger)
        {
            return new GeoEnterAreaTriggerEvaluator((WLGeoEnterTrigger)wlgeotrigger);
        }
        if (wlgeotrigger instanceof WLGeoExitTrigger)
        {
            return new GeoExitAreaTriggerEvaluator((WLGeoExitTrigger)wlgeotrigger);
        }
        if (wlgeotrigger instanceof WLGeoDwellInsideTrigger)
        {
            return new GeoDwelInsideTriggerEvaluator((WLGeoDwellInsideTrigger)wlgeotrigger);
        }
        if (wlgeotrigger instanceof WLGeoDwellOutsideTrigger)
        {
            return new GeoDwellOutsideTriggerEvaluator((WLGeoDwellOutsideTrigger)wlgeotrigger);
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("unrecognized WLAbstractTrigger ").append(wlgeotrigger).toString());
        }
    }

    public WifiTriggerEvaluator buildWifiTrigger(WLWifiTrigger wlwifitrigger)
    {
        if (wlwifitrigger instanceof WLWifiVisibleAccessPointsChangeTrigger)
        {
            return new WifiVisibleNetworksChangedTriggerEvaluator((WLWifiVisibleAccessPointsChangeTrigger)wlwifitrigger);
        }
        if (wlwifitrigger instanceof WLWifiConnectTrigger)
        {
            return new WifiConnectTriggerEvaluator((WLWifiConnectTrigger)wlwifitrigger);
        }
        if (wlwifitrigger instanceof WLWifiDisconnectTrigger)
        {
            return new WifiDisconnectTriggerEvaluator((WLWifiDisconnectTrigger)wlwifitrigger);
        }
        if (wlwifitrigger instanceof WLWifiEnterTrigger)
        {
            return new WifiEnterAreaTriggerEvaluator((WLWifiEnterTrigger)wlwifitrigger);
        }
        if (wlwifitrigger instanceof WLWifiExitTrigger)
        {
            return new WifiExitAreaTriggerEvaluator((WLWifiExitTrigger)wlwifitrigger);
        }
        if (wlwifitrigger instanceof WLWifiDwellInsideTrigger)
        {
            return new WifiDwellInsideTriggerEvaluator((WLWifiDwellInsideTrigger)wlwifitrigger);
        }
        if (wlwifitrigger instanceof WLWifiDwellOutsideTrigger)
        {
            return new WifiDwellingOutsideTrigger((WLWifiDwellOutsideTrigger)wlwifitrigger);
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("unrecognized WLAbstractTrigger ").append(wlwifitrigger).toString());
        }
    }
}
