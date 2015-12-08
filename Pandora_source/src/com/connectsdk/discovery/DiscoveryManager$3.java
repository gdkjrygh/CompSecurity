// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.connectsdk.discovery;

import android.util.Log;
import com.connectsdk.device.ConnectableDevice;
import com.connectsdk.device.ConnectableDeviceStore;
import com.connectsdk.service.DeviceService;
import com.connectsdk.service.command.ServiceCommandError;
import com.connectsdk.service.config.ServiceConfig;
import com.connectsdk.service.config.ServiceDescription;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;

// Referenced classes of package com.connectsdk.discovery:
//            DiscoveryProviderListener, DiscoveryManager, DiscoveryProvider

class this._cls0
    implements DiscoveryProviderListener
{

    final DiscoveryManager this$0;

    public void onServiceAdded(DiscoveryProvider discoveryprovider, ServiceDescription servicedescription)
    {
        boolean flag1 = false;
        String s1 = servicedescription.getUUID();
        String s = servicedescription.getIpAddress();
        Object obj = servicedescription.getFriendlyName();
        Object obj1 = servicedescription.getModelName();
        Object obj2 = servicedescription.getModelNumber();
        discoveryprovider = (ConnectableDevice)DiscoveryManager.access$200(DiscoveryManager.this).get(s);
        boolean flag;
        if (discoveryprovider == null)
        {
            discoveryprovider = new ConnectableDevice(s, ((String) (obj)), ((String) (obj1)), ((String) (obj2)));
            discoveryprovider.setUUID(s1);
            flag = true;
        } else
        {
            flag = false;
        }
        obj2 = (Class)DiscoveryManager.access$600(DiscoveryManager.this).get(servicedescription.getServiceFilter());
        if (obj2 == null)
        {
            return;
        }
        obj1 = DiscoveryManager.access$700(DiscoveryManager.this, s1);
        obj = obj1;
        if (obj1 == null)
        {
            obj = new ServiceConfig(s1);
        }
        obj1 = discoveryprovider.getServiceWithUUID(s1);
        if (obj1 == null) goto _L2; else goto _L1
_L1:
        flag = flag1;
        if (((DeviceService) (obj1)).getServiceDescription().getFriendlyName().equals(s1))
        {
            flag = true;
        }
        try
        {
            ((DeviceService) (obj1)).setServiceDescription(servicedescription);
            ((DeviceService) (obj1)).setServiceConfig(((ServiceConfig) (obj)));
            discoveryprovider.addService(((DeviceService) (obj1)));
        }
        // Misplaced declaration of an exception variable
        catch (DiscoveryProvider discoveryprovider)
        {
            return;
        }
        // Misplaced declaration of an exception variable
        catch (DiscoveryProvider discoveryprovider)
        {
            return;
        }
        // Misplaced declaration of an exception variable
        catch (DiscoveryProvider discoveryprovider)
        {
            return;
        }
        // Misplaced declaration of an exception variable
        catch (DiscoveryProvider discoveryprovider)
        {
            return;
        }
        // Misplaced declaration of an exception variable
        catch (DiscoveryProvider discoveryprovider)
        {
            return;
        }
        // Misplaced declaration of an exception variable
        catch (DiscoveryProvider discoveryprovider)
        {
            return;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_198;
        }
        handleDeviceUpdate(discoveryprovider);
_L3:
        DiscoveryManager.access$200(DiscoveryManager.this).put(s, discoveryprovider);
        return;
_L2:
        servicedescription = (DeviceService)((Class) (obj2)).getConstructor(new Class[] {
            com/connectsdk/service/config/ServiceDescription, com/connectsdk/service/config/ServiceConfig, com/connectsdk/device/ConnectableDeviceStore
        }).newInstance(new Object[] {
            servicedescription, obj, DiscoveryManager.getInstance().getConnectableDeviceStore()
        });
        if (servicedescription == null)
        {
            break MISSING_BLOCK_LABEL_274;
        }
        discoveryprovider.addService(servicedescription);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_290;
        }
        handleDeviceAdd(discoveryprovider);
          goto _L3
        handleDeviceUpdate(discoveryprovider);
          goto _L3
    }

    public void onServiceDiscoveryFailed(DiscoveryProvider discoveryprovider, ServiceCommandError servicecommanderror)
    {
        Log.w("Connect SDK", "DiscoveryProviderListener, Service Discovery Failed");
    }

    public void onServiceRemoved(DiscoveryProvider discoveryprovider, ServiceDescription servicedescription)
    {
label0:
        {
            Log.d("Connect SDK", (new StringBuilder()).append("DiscoveryProviderListener, onServiceRemoved: friendlyName: ").append(servicedescription.getFriendlyName()).toString());
            discoveryprovider = (ConnectableDevice)DiscoveryManager.access$200(DiscoveryManager.this).get(servicedescription.getIpAddress());
            if (discoveryprovider != null)
            {
                discoveryprovider.removeServiceWithServiceFilter(servicedescription.getServiceFilter());
                if (!discoveryprovider.getServices().isEmpty())
                {
                    break label0;
                }
                DiscoveryManager.access$200(DiscoveryManager.this).remove(servicedescription.getIpAddress());
                handleDeviceLoss(discoveryprovider);
            }
            return;
        }
        handleDeviceUpdate(discoveryprovider);
    }

    tion()
    {
        this$0 = DiscoveryManager.this;
        super();
    }
}
