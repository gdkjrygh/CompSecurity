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

class val.uuid
    implements Runnable
{

    final SSDPDiscoveryProvider this$0;
    final String val$location;
    final String val$serviceFilter;
    final String val$uuid;

    public void run()
    {
        Device device = Device.createInstanceFromXML(val$location, val$serviceFilter);
        if (device != null)
        {
            device.UUID = val$uuid;
            if (containsServicesWithFilter(device, val$serviceFilter))
            {
                final ServiceDescription service = (ServiceDescription)SSDPDiscoveryProvider.access$100(SSDPDiscoveryProvider.this).get(val$uuid);
                service.setServiceID(serviceIdForFilter(val$serviceFilter));
                service.setServiceFilter(val$serviceFilter);
                service.setFriendlyName(device.friendlyName);
                service.setModelName(device.modelName);
                service.setModelNumber(device.modelNumber);
                service.setModelDescription(device.modelDescription);
                service.setManufacturer(device.manufacturer);
                service.setApplicationURL(device.applicationURL);
                service.setServiceList(device.serviceList);
                service.setResponseHeaders(device.headers);
                SSDPDiscoveryProvider.access$200(SSDPDiscoveryProvider.this).put(val$uuid, service);
                Util.runOnUI(new Runnable() {

                    final SSDPDiscoveryProvider._cls7 this$1;
                    final ServiceDescription val$service;

                    public void run()
                    {
                        for (Iterator iterator = SSDPDiscoveryProvider.access$000(this$0).iterator(); iterator.hasNext(); ((DiscoveryProviderListener)iterator.next()).onServiceAdded(this$0, service)) { }
                    }

            
            {
                this$1 = SSDPDiscoveryProvider._cls7.this;
                service = servicedescription;
                super();
            }
                });
            }
        }
        SSDPDiscoveryProvider.access$100(SSDPDiscoveryProvider.this).remove(val$uuid);
    }

    _cls1.val.service()
    {
        this$0 = final_ssdpdiscoveryprovider;
        val$location = s;
        val$serviceFilter = s1;
        val$uuid = String.this;
        super();
    }
}
