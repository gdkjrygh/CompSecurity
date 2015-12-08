// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.location.internal;

import com.worklight.common.Logger;
import com.worklight.location.api.WLAcquisitionPolicy;
import com.worklight.location.api.WLLocationServicesConfiguration;
import com.worklight.location.api.WLTriggerCallback;
import com.worklight.location.api.WLTriggersConfiguration;
import com.worklight.location.api.geo.WLGeoPosition;
import com.worklight.location.api.geo.triggers.WLGeoTrigger;
import com.worklight.location.api.wifi.WLWifiAcquisitionPolicy;
import com.worklight.location.api.wifi.triggers.WLWifiTrigger;
import com.worklight.location.internal.events.EventTransmitter;
import com.worklight.location.internal.geo.triggerEvaluators.GeoTriggerEvaluator;
import com.worklight.location.internal.wifi.triggerEvaluators.WifiInternalLocation;
import com.worklight.location.internal.wifi.triggerEvaluators.WifiTriggerEvaluator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.worklight.location.internal:
//            TriggerEvaluatorBuilder, AbstractTriggerEvaluator, AbstractTrigger, DeviceContextImpl, 
//            ICallbackExecutor

public class RuntimeTriggerContainer
{

    private static Logger logger = Logger.getInstance("RuntimeTriggerContainer");
    private final TriggerEvaluatorBuilder builder;
    private final DeviceContextImpl deviceContext;
    private final EventTransmitter eventTransmitter;
    private final ICallbackExecutor executor;
    private Map geoTriggerEvaluators;
    private Map wifiTriggerEvaluators;

    public RuntimeTriggerContainer(DeviceContextImpl devicecontextimpl, EventTransmitter eventtransmitter, ICallbackExecutor icallbackexecutor)
    {
        this(devicecontextimpl, eventtransmitter, new TriggerEvaluatorBuilder(), icallbackexecutor);
    }

    RuntimeTriggerContainer(DeviceContextImpl devicecontextimpl, EventTransmitter eventtransmitter, TriggerEvaluatorBuilder triggerevaluatorbuilder, ICallbackExecutor icallbackexecutor)
    {
        geoTriggerEvaluators = new HashMap();
        wifiTriggerEvaluators = new HashMap();
        if (devicecontextimpl == null)
        {
            throw new IllegalArgumentException("deviceContext is null");
        }
        deviceContext = devicecontextimpl;
        if (eventtransmitter == null)
        {
            throw new IllegalArgumentException("eventTransmitter is null");
        }
        eventTransmitter = eventtransmitter;
        if (triggerevaluatorbuilder == null)
        {
            throw new IllegalArgumentException("builder is null");
        }
        builder = triggerevaluatorbuilder;
        if (icallbackexecutor == null)
        {
            throw new IllegalArgumentException("executor is null");
        } else
        {
            executor = icallbackexecutor;
            return;
        }
    }

    private Map buildGeoMap(Map map)
    {
        HashMap hashmap = new HashMap();
        if (map != null)
        {
            map = map.entrySet().iterator();
            while (map.hasNext()) 
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)map.next();
                hashmap.put(entry.getKey(), builder.buildGeoTrigger((WLGeoTrigger)entry.getValue()));
            }
        }
        return hashmap;
    }

    private Map buildWifiMap(Map map)
    {
        HashMap hashmap = new HashMap();
        if (map != null)
        {
            map = map.entrySet().iterator();
            while (map.hasNext()) 
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)map.next();
                hashmap.put(entry.getKey(), builder.buildWifiTrigger((WLWifiTrigger)entry.getValue()));
            }
        }
        return hashmap;
    }

    private Map getGeoTriggers(WLLocationServicesConfiguration wllocationservicesconfiguration)
    {
        if (wllocationservicesconfiguration.getTriggers() == null)
        {
            return null;
        } else
        {
            return wllocationservicesconfiguration.getTriggers().getGeoTriggers();
        }
    }

    private List getGeoTriggersEvalutedToTrue(WLGeoPosition wlgeoposition)
    {
        ArrayList arraylist = new ArrayList();
        Iterator iterator = geoTriggerEvaluators.values().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            GeoTriggerEvaluator geotriggerevaluator = (GeoTriggerEvaluator)iterator.next();
            if (geotriggerevaluator.evaluate(wlgeoposition))
            {
                arraylist.add(geotriggerevaluator);
            }
        } while (true);
        return arraylist;
    }

    private Map getWifiTriggers(WLLocationServicesConfiguration wllocationservicesconfiguration)
    {
        if (wllocationservicesconfiguration.getTriggers() == null)
        {
            return null;
        } else
        {
            return wllocationservicesconfiguration.getTriggers().getWifiTriggers();
        }
    }

    private List getWifiTriggersEvalutedToTrue(WifiInternalLocation wifiinternallocation)
    {
        ArrayList arraylist = new ArrayList();
        Iterator iterator = wifiTriggerEvaluators.values().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            WifiTriggerEvaluator wifitriggerevaluator = (WifiTriggerEvaluator)iterator.next();
            if (wifitriggerevaluator.evaluate(wifiinternallocation))
            {
                arraylist.add(wifitriggerevaluator);
            }
        } while (true);
        return arraylist;
    }

    private void handleTriggersEvalutedToTrue(List list)
    {
        ArrayList arraylist = new ArrayList();
        boolean flag = false;
        ArrayList arraylist1 = new ArrayList();
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            AbstractTrigger abstracttrigger = ((AbstractTriggerEvaluator)list.next()).getTriggerDefinition();
            boolean flag1 = flag;
            if (abstracttrigger.getEvent() != null)
            {
                arraylist.add(abstracttrigger.getEvent());
                flag1 = flag | abstracttrigger.isTransmitImmediately();
            }
            flag = flag1;
            if (abstracttrigger.getCallback() != null)
            {
                arraylist1.add(abstracttrigger.getCallback());
                flag = flag1;
            }
        } while (true);
        if (!arraylist.isEmpty())
        {
            eventTransmitter.transmitEvents(arraylist, flag);
        }
        WLTriggerCallback wltriggercallback;
        for (list = arraylist1.iterator(); list.hasNext(); executor.executeTriggerCallback(wltriggercallback, deviceContext.clone()))
        {
            wltriggercallback = (WLTriggerCallback)list.next();
        }

    }

    private static void validateWifiPolicy(WLWifiAcquisitionPolicy wlwifiacquisitionpolicy, Map map)
    {
        if (map != null)
        {
            map = map.entrySet().iterator();
            while (map.hasNext()) 
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)map.next();
                if (!((WLWifiTrigger)entry.getValue()).validate(wlwifiacquisitionpolicy))
                {
                    logger.error((new StringBuilder()).append("The WIFI trigger").append(entry).append("will have no affect, since its network do not appear in WIFI acquisition policy").toString());
                }
            }
        }
    }

    public void clear()
    {
        for (Iterator iterator = geoTriggerEvaluators.values().iterator(); iterator.hasNext(); ((GeoTriggerEvaluator)iterator.next()).preDestroy()) { }
        for (Iterator iterator1 = wifiTriggerEvaluators.values().iterator(); iterator1.hasNext(); ((WifiTriggerEvaluator)iterator1.next()).preDestroy()) { }
        geoTriggerEvaluators.clear();
        wifiTriggerEvaluators.clear();
    }

    public void geoLocationAcquired(WLGeoPosition wlgeoposition)
    {
        if (wlgeoposition == null)
        {
            throw new IllegalArgumentException("position is null");
        } else
        {
            deviceContext.setGeoPosition(wlgeoposition);
            handleTriggersEvalutedToTrue(getGeoTriggersEvalutedToTrue(wlgeoposition));
            return;
        }
    }

    public void updateConfiguration(WLLocationServicesConfiguration wllocationservicesconfiguration)
    {
        if (wllocationservicesconfiguration == null)
        {
            throw new IllegalArgumentException("config is null");
        }
        validateWifiPolicy(wllocationservicesconfiguration.getPolicy().getWifiPolicy(), getWifiTriggers(wllocationservicesconfiguration));
        Map map = buildGeoMap(getGeoTriggers(wllocationservicesconfiguration));
        Map map1 = buildWifiMap(getWifiTriggers(wllocationservicesconfiguration));
        for (Iterator iterator2 = geoTriggerEvaluators.entrySet().iterator(); iterator2.hasNext();)
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator2.next();
            if (map.containsKey(entry.getKey()))
            {
                map.put(entry.getKey(), entry.getValue());
            } else
            {
                ((GeoTriggerEvaluator)entry.getValue()).preDestroy();
            }
        }

        for (Iterator iterator3 = wifiTriggerEvaluators.entrySet().iterator(); iterator3.hasNext();)
        {
            java.util.Map.Entry entry1 = (java.util.Map.Entry)iterator3.next();
            if (map1.containsKey(entry1.getKey()))
            {
                map1.put(entry1.getKey(), entry1.getValue());
            } else
            {
                ((WifiTriggerEvaluator)entry1.getValue()).preDestroy();
            }
        }

        geoTriggerEvaluators = map;
        wifiTriggerEvaluators = map1;
        for (Iterator iterator = geoTriggerEvaluators.values().iterator(); iterator.hasNext(); ((GeoTriggerEvaluator)iterator.next()).notifyOfConfigurationUpdate(wllocationservicesconfiguration)) { }
        for (Iterator iterator1 = wifiTriggerEvaluators.values().iterator(); iterator1.hasNext(); ((WifiTriggerEvaluator)iterator1.next()).notifyOfConfigurationUpdate(wllocationservicesconfiguration)) { }
    }

    public void wifiLocationAcquired(WifiInternalLocation wifiinternallocation)
    {
        if (wifiinternallocation == null)
        {
            throw new IllegalArgumentException("position is null");
        } else
        {
            deviceContext.setWifiPosition(wifiinternallocation.getPublicVersion());
            handleTriggersEvalutedToTrue(getWifiTriggersEvalutedToTrue(wifiinternallocation));
            return;
        }
    }

}
