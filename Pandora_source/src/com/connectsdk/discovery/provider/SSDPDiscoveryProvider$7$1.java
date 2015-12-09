// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.connectsdk.discovery.provider;

import com.connectsdk.core.Util;
import com.connectsdk.core.upnp.Device;
import com.connectsdk.discovery.DiscoveryProviderListener;
import com.connectsdk.service.config.ServiceDescription;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

// Referenced classes of package com.connectsdk.discovery.provider:
//            SSDPDiscoveryProvider

class val.service
    implements Runnable
{

    final val.service this$1;
    final ServiceDescription val$service;

    public void run()
    {
        for (Iterator iterator = SSDPDiscoveryProvider.access$000(_fld0).iterator(); iterator.hasNext(); ((DiscoveryProviderListener)iterator.next()).onServiceAdded(_fld0, val$service)) { }
    }

    l.uuid()
    {
        this$1 = final_uuid;
        val$service = ServiceDescription.this;
        super();
    }

    // Unreferenced inner class com/connectsdk/discovery/provider/SSDPDiscoveryProvider$7

/* anonymous class */
    class SSDPDiscoveryProvider._cls7
        implements Runnable
    {

        final SSDPDiscoveryProvider this$0;
        final String val$location;
        final String val$serviceFilter;
        final String val$uuid;

        public void run()
        {
            Device device = Device.createInstanceFromXML(location, serviceFilter);
            if (device != null)
            {
                device.UUID = uuid;
                if (containsServicesWithFilter(device, serviceFilter))
                {
                    ServiceDescription servicedescription = (ServiceDescription)SSDPDiscoveryProvider.access$100(SSDPDiscoveryProvider.this).get(uuid);
                    servicedescription.setServiceID(serviceIdForFilter(serviceFilter));
                    servicedescription.setServiceFilter(serviceFilter);
                    servicedescription.setFriendlyName(device.friendlyName);
                    servicedescription.setModelName(device.modelName);
                    servicedescription.setModelNumber(device.modelNumber);
                    servicedescription.setModelDescription(device.modelDescription);
                    servicedescription.setManufacturer(device.manufacturer);
                    servicedescription.setApplicationURL(device.applicationURL);
                    servicedescription.setServiceList(device.serviceList);
                    servicedescription.setResponseHeaders(device.headers);
                    SSDPDiscoveryProvider.access$200(SSDPDiscoveryProvider.this).put(uuid, servicedescription);
                    Util.runOnUI(servicedescription. new SSDPDiscoveryProvider._cls7._cls1());
                }
            }
            SSDPDiscoveryProvider.access$100(SSDPDiscoveryProvider.this).remove(uuid);
        }

            
            {
                this$0 = final_ssdpdiscoveryprovider;
                location = s;
                serviceFilter = s1;
                uuid = String.this;
                super();
            }
    }

}
