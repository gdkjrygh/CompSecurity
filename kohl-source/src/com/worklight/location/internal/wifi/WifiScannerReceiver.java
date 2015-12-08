// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.location.internal.wifi;

import com.worklight.location.api.wifi.WLWifiAcquisitionPolicy;
import com.worklight.location.internal.wifi.triggerEvaluators.WifiInternalLocation;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.worklight.location.internal.wifi:
//            IWifiScannerReceiver, WifiPolicyFilterer, WifiInternalAccessPoint, WifiInternalCallback

final class WifiScannerReceiver
    implements IWifiScannerReceiver
{

    private final WifiPolicyFilterer filterer;
    private final WifiInternalCallback success;

    WifiScannerReceiver(WifiInternalCallback wifiinternalcallback, WLWifiAcquisitionPolicy wlwifiacquisitionpolicy)
    {
        success = wifiinternalcallback;
        if (wlwifiacquisitionpolicy == null)
        {
            wifiinternalcallback = null;
        } else
        {
            wifiinternalcallback = new WifiPolicyFilterer(wlwifiacquisitionpolicy);
        }
        filterer = wifiinternalcallback;
    }

    public void onScanResults(Collection collection, long l)
    {
        HashSet hashset = new HashSet();
        Iterator iterator = null;
        Object obj = null;
        Integer integer = null;
        Object obj1 = null;
        if (filterer == null)
        {
            iterator = collection.iterator();
            integer = obj1;
            collection = obj;
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                WifiInternalAccessPoint wifiinternalaccesspoint = (WifiInternalAccessPoint)iterator.next();
                if (wifiinternalaccesspoint.isConnected())
                {
                    collection = wifiinternalaccesspoint.getPublicVersion();
                    integer = Integer.valueOf(wifiinternalaccesspoint.getStrength());
                    hashset.add(wifiinternalaccesspoint);
                }
            } while (true);
            if (success != null)
            {
                success.execute(new WifiInternalLocation(hashset, collection, integer, l));
            }
        } else
        {
            HashMap hashmap = new HashMap();
            Iterator iterator1 = collection.iterator();
            collection = iterator;
            do
            {
                if (!iterator1.hasNext())
                {
                    break;
                }
                WifiInternalAccessPoint wifiinternalaccesspoint1 = (WifiInternalAccessPoint)iterator1.next();
                if (filterer.matchesWithSpecifiedMac(wifiinternalaccesspoint1))
                {
                    com.worklight.location.api.wifi.WLWifiAccessPoint wlwifiaccesspoint = wifiinternalaccesspoint1.getPublicVersion();
                    hashset.add(wifiinternalaccesspoint1);
                    if (wifiinternalaccesspoint1.isConnected())
                    {
                        collection = wlwifiaccesspoint;
                        integer = Integer.valueOf(wifiinternalaccesspoint1.getStrength());
                    }
                } else
                if (filterer.matches(wifiinternalaccesspoint1))
                {
                    com.worklight.location.api.wifi.WLWifiAccessPoint wlwifiaccesspoint1 = wifiinternalaccesspoint1.getPublicVersionNoMAC();
                    WifiInternalAccessPoint wifiinternalaccesspoint2 = new WifiInternalAccessPoint(wifiinternalaccesspoint1.getSSID(), null, wifiinternalaccesspoint1.getStrength(), wifiinternalaccesspoint1.isConnected());
                    if (!hashmap.containsKey(wifiinternalaccesspoint1.getSSID()) || hashmap.containsKey(wifiinternalaccesspoint1.getSSID()) && ((WifiInternalAccessPoint)hashmap.get(wifiinternalaccesspoint1.getSSID())).getStrength() < wifiinternalaccesspoint1.getStrength())
                    {
                        hashmap.put(wifiinternalaccesspoint1.getSSID(), wifiinternalaccesspoint2);
                    }
                    if (wifiinternalaccesspoint1.isConnected())
                    {
                        collection = wlwifiaccesspoint1;
                        integer = Integer.valueOf(wifiinternalaccesspoint1.getStrength());
                    }
                }
            } while (true);
            hashset.addAll(hashmap.values());
            if (success != null)
            {
                success.execute(new WifiInternalLocation(hashset, collection, integer, l));
                return;
            }
        }
    }
}
