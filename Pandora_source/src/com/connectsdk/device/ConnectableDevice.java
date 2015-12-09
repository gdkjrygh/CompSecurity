// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.connectsdk.device;

import com.connectsdk.core.Util;
import com.connectsdk.service.DeviceService;
import com.connectsdk.service.ServiceReadyListener;
import com.connectsdk.service.capability.Launcher;
import com.connectsdk.service.config.ServiceConfig;
import com.connectsdk.service.config.ServiceDescription;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.connectsdk.device:
//            ConnectableDeviceStore, ConnectableDeviceListener

public class ConnectableDevice
{

    private String UUID;
    private String castChatMessageUrl;
    ConnectableDeviceStore connectableDeviceStore;
    private String connectedServiceNames;
    CopyOnWriteArrayList deviceListeners;
    public boolean featuresReady;
    private String friendlyName;
    private String ipAddress;
    private long lastConnected;
    private long lastDetection;
    private String lastKnownIPAddress;
    private String lastSeenOnWifi;
    private String modelName;
    private String modelNumber;
    ServiceReadyListener serviceReadyListener = new ServiceReadyListener() {

        final ConnectableDevice this$0;

        public void onServiceReady()
        {
            if (services == null || services.size() <= 0) goto _L2; else goto _L1
_L1:
            Iterator iterator = services.values().iterator();
_L6:
            if (!iterator.hasNext()) goto _L4; else goto _L3
_L3:
            if (((DeviceService)iterator.next()).isServiceReady()) goto _L6; else goto _L5
_L5:
            boolean flag = false;
_L8:
            if (flag)
            {
                Util.runOnUI(new Runnable() {

                    final _cls1 this$1;

                    public void run()
                    {
                        com.connectsdk.service.DeviceService.ConnectableDeviceListenerPair connectabledevicelistenerpair;
                        for (Iterator iterator = deviceListeners.iterator(); iterator.hasNext(); connectabledevicelistenerpair.listener.onDeviceReady(connectabledevicelistenerpair.device))
                        {
                            connectabledevicelistenerpair = (com.connectsdk.service.DeviceService.ConnectableDeviceListenerPair)iterator.next();
                        }

                    }

            
            {
                this$1 = _cls1.this;
                super();
            }
                });
            }
_L2:
            return;
_L4:
            flag = true;
            if (true) goto _L8; else goto _L7
_L7:
        }

            
            {
                this$0 = ConnectableDevice.this;
                super();
            }
    };
    Map services;

    public ConnectableDevice()
    {
        featuresReady = false;
        services = new ConcurrentHashMap();
        deviceListeners = new CopyOnWriteArrayList();
    }

    public ConnectableDevice(String s, String s1, String s2, String s3)
    {
        featuresReady = false;
        ipAddress = s;
        friendlyName = s1;
        modelName = s2;
        modelNumber = s3;
        services = new ConcurrentHashMap();
        deviceListeners = new CopyOnWriteArrayList();
    }

    public static ConnectableDevice createFromConfigString(String s, String s1, String s2, String s3)
    {
        return new ConnectableDevice(s, s1, s2, s3);
    }

    public static ConnectableDevice createWithUUID(String s, String s1, String s2, String s3, String s4)
    {
        s1 = new ConnectableDevice(s1, s2, s3, s4);
        s1.setUUID(s);
        return s1;
    }

    private List getMismatchCapabilities(List list, List list1)
    {
        this;
        JVM INSTR monitorenter ;
        ArrayList arraylist;
        arraylist = new ArrayList();
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            String s = (String)list.next();
            if (!list1.contains(s))
            {
                arraylist.add(s);
            }
        } while (true);
        break MISSING_BLOCK_LABEL_65;
        list;
        throw list;
        this;
        JVM INSTR monitorexit ;
        return arraylist;
    }

    public void addListener(ConnectableDeviceListener connectabledevicelistener)
    {
        if (!deviceListeners.contains(connectabledevicelistener))
        {
            deviceListeners.add(new com.connectsdk.service.DeviceService.ConnectableDeviceListenerPair(this, connectabledevicelistener));
        }
    }

    public void addService(DeviceService deviceservice)
    {
        Util.runOnUI(new Runnable() {

            final ConnectableDevice this$0;
            final List val$added;

            public void run()
            {
                com.connectsdk.service.DeviceService.ConnectableDeviceListenerPair connectabledevicelistenerpair;
                for (Iterator iterator = deviceListeners.iterator(); iterator.hasNext(); connectabledevicelistenerpair.listener.onCapabilityUpdated(connectabledevicelistenerpair.device, added, null))
                {
                    connectabledevicelistenerpair = (com.connectsdk.service.DeviceService.ConnectableDeviceListenerPair)iterator.next();
                }

            }

            
            {
                this$0 = ConnectableDevice.this;
                added = list;
                super();
            }
        });
        services.put(deviceservice.getServiceDescription().getServiceFilter(), deviceservice);
    }

    public void connect()
    {
        Iterator iterator = services.values().iterator();
        boolean flag = true;
        DeviceService deviceservice;
        for (; iterator.hasNext(); deviceservice.connect())
        {
            deviceservice = (DeviceService)iterator.next();
            if (!deviceservice.isServiceReady())
            {
                deviceservice.setServiceReadyListener(serviceReadyListener);
                flag = false;
            }
            deviceservice.setDeviceListeners(deviceListeners);
        }

        if (flag)
        {
            Util.runOnUI(new Runnable() {

                final ConnectableDevice this$0;

                public void run()
                {
                    com.connectsdk.service.DeviceService.ConnectableDeviceListenerPair connectabledevicelistenerpair;
                    for (Iterator iterator1 = deviceListeners.iterator(); iterator1.hasNext(); connectabledevicelistenerpair.listener.onDeviceReady(connectabledevicelistenerpair.device))
                    {
                        connectabledevicelistenerpair = (com.connectsdk.service.DeviceService.ConnectableDeviceListenerPair)iterator1.next();
                    }

                }

            
            {
                this$0 = ConnectableDevice.this;
                super();
            }
            });
        }
    }

    public void disconnect()
    {
        for (Iterator iterator = services.values().iterator(); iterator.hasNext(); ((DeviceService)iterator.next()).disconnect()) { }
        Util.runOnUI(new Runnable() {

            final ConnectableDevice this$0;

            public void run()
            {
                com.connectsdk.service.DeviceService.ConnectableDeviceListenerPair connectabledevicelistenerpair;
                for (Iterator iterator1 = deviceListeners.iterator(); iterator1.hasNext(); connectabledevicelistenerpair.listener.onDeviceDisconnected(connectabledevicelistenerpair.device))
                {
                    connectabledevicelistenerpair = (com.connectsdk.service.DeviceService.ConnectableDeviceListenerPair)iterator1.next();
                }

            }

            
            {
                this$0 = ConnectableDevice.this;
                super();
            }
        });
    }

    public List getCapabilities()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        obj = new ArrayList();
        for (Iterator iterator = services.values().iterator(); iterator.hasNext();)
        {
            Iterator iterator1 = ((DeviceService)iterator.next()).getCapabilities().iterator();
            while (iterator1.hasNext()) 
            {
                String s = (String)iterator1.next();
                if (!((List) (obj)).contains(s))
                {
                    ((List) (obj)).add(s);
                }
            }
        }

        break MISSING_BLOCK_LABEL_100;
        obj;
        throw obj;
        this;
        JVM INSTR monitorexit ;
        return ((List) (obj));
    }

    public String getCastChatMessageUrl()
    {
        return castChatMessageUrl;
    }

    public String getConnectedServiceNames()
    {
        return connectedServiceNames;
    }

    public String getFriendlyName()
    {
        return friendlyName;
    }

    public String getIpAddress()
    {
        return ipAddress;
    }

    public long getLastConnected()
    {
        return lastConnected;
    }

    public long getLastDetection()
    {
        return lastDetection;
    }

    public String getLastKnownIPAddress()
    {
        return lastKnownIPAddress;
    }

    public String getLastSeenOnWifi()
    {
        return lastSeenOnWifi;
    }

    public Launcher getLauncher()
    {
        Launcher launcher = null;
        for (Iterator iterator = services.values().iterator(); iterator.hasNext();)
        {
            Object obj = (DeviceService)iterator.next();
            if (((DeviceService) (obj)).getAPI(com/connectsdk/service/capability/Launcher) != null)
            {
                Launcher launcher1 = (Launcher)((DeviceService) (obj)).getAPI(com/connectsdk/service/capability/Launcher);
                if (launcher == null)
                {
                    obj = launcher1;
                } else
                {
                    obj = launcher1;
                    if (launcher1.getLauncherCapabilityLevel().getValue() <= launcher.getLauncherCapabilityLevel().getValue())
                    {
                        obj = launcher;
                    }
                }
                launcher = ((Launcher) (obj));
            }
        }

        return launcher;
    }

    public List getListeners()
    {
        return deviceListeners;
    }

    public String getModelName()
    {
        return modelName;
    }

    public String getModelNumber()
    {
        return modelNumber;
    }

    public DeviceService getServiceByName(String s)
    {
        for (Iterator iterator = getServices().iterator(); iterator.hasNext();)
        {
            DeviceService deviceservice = (DeviceService)iterator.next();
            if (deviceservice.getServiceName().equals(s))
            {
                return deviceservice;
            }
        }

        return null;
    }

    public DeviceService getServiceWithUUID(String s)
    {
        for (Iterator iterator = getServices().iterator(); iterator.hasNext();)
        {
            DeviceService deviceservice = (DeviceService)iterator.next();
            if (deviceservice.getServiceDescription().getUUID().equals(s))
            {
                return deviceservice;
            }
        }

        return null;
    }

    public Collection getServices()
    {
        return services.values();
    }

    public String getUUID()
    {
        return UUID;
    }

    public transient boolean hasAnyCapability(String as[])
    {
        for (Iterator iterator = services.values().iterator(); iterator.hasNext();)
        {
            if (((DeviceService)iterator.next()).hasAnyCapability(as))
            {
                return true;
            }
        }

        return false;
    }

    public boolean hasCapabilities(List list)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag;
        String as[] = new String[list.size()];
        list.toArray(as);
        flag = hasCapabilities(as);
        this;
        JVM INSTR monitorexit ;
        return flag;
        list;
        throw list;
    }

    public transient boolean hasCapabilities(String as[])
    {
        boolean flag = false;
        this;
        JVM INSTR monitorenter ;
        int j = as.length;
        int i = 0;
_L3:
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        boolean flag1 = hasCapability(as[i]);
        if (flag1) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        i++;
          goto _L3
        as;
        throw as;
        flag = true;
          goto _L1
    }

    public boolean hasCapability(String s)
    {
        for (Iterator iterator = services.values().iterator(); iterator.hasNext();)
        {
            if (((DeviceService)iterator.next()).hasCapability(s))
            {
                return true;
            }
        }

        return false;
    }

    public boolean isConnectable()
    {
        for (Iterator iterator = services.values().iterator(); iterator.hasNext();)
        {
            if (((DeviceService)iterator.next()).isConnectable())
            {
                return true;
            }
        }

        return false;
    }

    public boolean isConnected()
    {
        for (Iterator iterator = services.values().iterator(); iterator.hasNext();)
        {
            if (!((DeviceService)iterator.next()).isConnected())
            {
                return false;
            }
        }

        return true;
    }

    public void removeListener(ConnectableDeviceListener connectabledevicelistener)
    {
        Iterator iterator = deviceListeners.iterator();
_L4:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        com.connectsdk.service.DeviceService.ConnectableDeviceListenerPair connectabledevicelistenerpair = (com.connectsdk.service.DeviceService.ConnectableDeviceListenerPair)iterator.next();
        if (connectabledevicelistenerpair.listener != connectabledevicelistener) goto _L4; else goto _L3
_L3:
        connectabledevicelistener = connectabledevicelistenerpair;
_L6:
        if (connectabledevicelistener != null)
        {
            deviceListeners.remove(connectabledevicelistener);
        }
        return;
_L2:
        connectabledevicelistener = null;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void removeService(DeviceService deviceservice)
    {
        deviceservice.disconnect();
        services.remove(deviceservice.getServiceDescription().getServiceFilter());
        Util.runOnUI(new Runnable() {

            final ConnectableDevice this$0;
            final List val$removed;

            public void run()
            {
                com.connectsdk.service.DeviceService.ConnectableDeviceListenerPair connectabledevicelistenerpair;
                for (Iterator iterator = deviceListeners.iterator(); iterator.hasNext(); connectabledevicelistenerpair.listener.onCapabilityUpdated(connectabledevicelistenerpair.device, null, removed))
                {
                    connectabledevicelistenerpair = (com.connectsdk.service.DeviceService.ConnectableDeviceListenerPair)iterator.next();
                }

            }

            
            {
                this$0 = ConnectableDevice.this;
                removed = list;
                super();
            }
        });
    }

    public void removeServiceWithServiceFilter(String s)
    {
        s = (DeviceService)services.get(s);
        if (s == null)
        {
            return;
        } else
        {
            s.disconnect();
            services.remove(s.getServiceDescription().getServiceFilter());
            Util.runOnUI(new Runnable() {

                final ConnectableDevice this$0;
                final List val$removed;

                public void run()
                {
                    com.connectsdk.service.DeviceService.ConnectableDeviceListenerPair connectabledevicelistenerpair;
                    for (Iterator iterator = deviceListeners.iterator(); iterator.hasNext(); connectabledevicelistenerpair.listener.onCapabilityUpdated(connectabledevicelistenerpair.device, null, removed))
                    {
                        connectabledevicelistenerpair = (com.connectsdk.service.DeviceService.ConnectableDeviceListenerPair)iterator.next();
                    }

                }

            
            {
                this$0 = ConnectableDevice.this;
                removed = list;
                super();
            }
            });
            return;
        }
    }

    public void setCastChatMessageUrl(String s)
    {
        castChatMessageUrl = s;
    }

    public void setConnectedServiceNames(String s)
    {
        connectedServiceNames = s;
    }

    public void setFriendlyName(String s)
    {
        friendlyName = s;
    }

    public void setIpAddress(String s)
    {
        ipAddress = s;
    }

    public void setLastConnected(long l)
    {
        lastConnected = l;
    }

    public void setLastDetection(long l)
    {
        lastDetection = l;
    }

    public void setLastKnownIPAddress(String s)
    {
        lastKnownIPAddress = s;
    }

    public void setLastSeenOnWifi(String s)
    {
        lastSeenOnWifi = s;
    }

    public void setModelName(String s)
    {
        modelName = s;
    }

    public void setModelNumber(String s)
    {
        modelNumber = s;
    }

    public void setUUID(String s)
    {
        UUID = s;
    }

    public JSONObject toJSONObject()
    {
        JSONObject jsonobject = new JSONObject();
        JSONObject jsonobject1;
        try
        {
            jsonobject.put("lastKnownIPAddress", getIpAddress());
            jsonobject.put("friendlyName", getFriendlyName());
            jsonobject.put("modelName", getModelName());
            jsonobject.put("modelNumber", getModelNumber());
            jsonobject.put("lastSeenOnWifi", getLastSeenOnWifi());
            jsonobject.put("lastConnected", getLastConnected());
            jsonobject.put("lastDetection", getLastDetection());
            jsonobject1 = new JSONObject();
            DeviceService deviceservice;
            JSONObject jsonobject2;
            for (Iterator iterator = services.values().iterator(); iterator.hasNext(); jsonobject1.put(deviceservice.getServiceConfig().getServiceUUID(), jsonobject2))
            {
                deviceservice = (DeviceService)iterator.next();
                jsonobject2 = deviceservice.toJSONObject();
            }

        }
        catch (JSONException jsonexception)
        {
            return jsonobject;
        }
        jsonobject.put("services", jsonobject1);
        return jsonobject;
    }

    public String toString()
    {
        return toJSONObject().toString();
    }
}
