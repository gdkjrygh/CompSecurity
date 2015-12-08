// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.connectsdk.service;

import android.util.SparseArray;
import com.connectsdk.core.Util;
import com.connectsdk.device.ConnectableDevice;
import com.connectsdk.device.ConnectableDeviceListener;
import com.connectsdk.device.ConnectableDeviceStore;
import com.connectsdk.etc.helper.DeviceServiceReachability;
import com.connectsdk.service.capability.CapabilityMethods;
import com.connectsdk.service.capability.Launcher;
import com.connectsdk.service.capability.listeners.ResponseListener;
import com.connectsdk.service.command.ServiceCommand;
import com.connectsdk.service.command.ServiceCommandError;
import com.connectsdk.service.config.ServiceConfig;
import com.connectsdk.service.config.ServiceDescription;
import com.connectsdk.service.sessions.LaunchSession;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.connectsdk.service:
//            ServiceReadyListener

public class DeviceService
    implements com.connectsdk.etc.helper.DeviceServiceReachability.DeviceServiceReachabilityListener
{
    public static class ConnectableDeviceListenerPair
    {

        public ConnectableDevice device;
        public ConnectableDeviceListener listener;

        public ConnectableDeviceListenerPair(ConnectableDevice connectabledevice, ConnectableDeviceListener connectabledevicelistener)
        {
            device = connectabledevice;
            listener = connectabledevicelistener;
        }
    }

    public static final class PairingType extends Enum
    {

        private static final PairingType $VALUES[];
        public static final PairingType FIRST_SCREEN;
        public static final PairingType NONE;
        public static final PairingType PIN_CODE;

        public static PairingType valueOf(String s)
        {
            return (PairingType)Enum.valueOf(com/connectsdk/service/DeviceService$PairingType, s);
        }

        public static PairingType[] values()
        {
            return (PairingType[])$VALUES.clone();
        }

        static 
        {
            NONE = new PairingType("NONE", 0);
            FIRST_SCREEN = new PairingType("FIRST_SCREEN", 1);
            PIN_CODE = new PairingType("PIN_CODE", 2);
            $VALUES = (new PairingType[] {
                NONE, FIRST_SCREEN, PIN_CODE
            });
        }

        private PairingType(String s, int i)
        {
            super(s, i);
        }
    }


    ConnectableDeviceStore connectableDeviceStore;
    protected boolean connected;
    CopyOnWriteArrayList deviceListeners;
    boolean isServiceReady;
    List mCapabilities;
    protected DeviceServiceReachability mServiceReachability;
    public SparseArray requests;
    ServiceConfig serviceConfig;
    ServiceDescription serviceDescription;
    ServiceReadyListener serviceReadyListener;

    public DeviceService(ServiceDescription servicedescription, ServiceConfig serviceconfig, ConnectableDeviceStore connectabledevicestore)
    {
        connected = false;
        isServiceReady = true;
        requests = new SparseArray();
        serviceDescription = servicedescription;
        serviceConfig = serviceconfig;
        connectableDeviceStore = connectabledevicestore;
        mCapabilities = new ArrayList();
        deviceListeners = new CopyOnWriteArrayList();
    }

    public static JSONObject discoveryParameters()
    {
        return null;
    }

    public void addCapabilities(final List capabilities)
    {
        if (capabilities == null)
        {
            return;
        }
        Iterator iterator = capabilities.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s = (String)iterator.next();
            if (s != null && s.length() != 0 && !mCapabilities.contains(capabilities))
            {
                mCapabilities.add(s);
            }
        } while (true);
        Util.runOnUI(new Runnable() {

            final DeviceService this$0;
            final List val$capabilities;

            public void run()
            {
                ConnectableDeviceListenerPair connectabledevicelistenerpair;
                for (Iterator iterator1 = deviceListeners.iterator(); iterator1.hasNext(); connectabledevicelistenerpair.listener.onCapabilityUpdated(connectabledevicelistenerpair.device, capabilities, null))
                {
                    connectabledevicelistenerpair = (ConnectableDeviceListenerPair)iterator1.next();
                }

            }

            
            {
                this$0 = DeviceService.this;
                capabilities = list;
                super();
            }
        });
    }

    public transient void addCapabilities(String as[])
    {
        addCapabilities(Arrays.asList(as));
    }

    public void addCapability(final String capability)
    {
        if (capability == null || capability.length() == 0 || mCapabilities.contains(capability))
        {
            return;
        } else
        {
            mCapabilities.add(capability);
            Util.runOnUI(new Runnable() {

                final DeviceService this$0;
                final String val$capability;

                public void run()
                {
                    ArrayList arraylist = new ArrayList();
                    arraylist.add(capability);
                    ConnectableDeviceListenerPair connectabledevicelistenerpair;
                    for (Iterator iterator = deviceListeners.iterator(); iterator.hasNext(); connectabledevicelistenerpair.listener.onCapabilityUpdated(connectabledevicelistenerpair.device, arraylist, null))
                    {
                        connectabledevicelistenerpair = (ConnectableDeviceListenerPair)iterator.next();
                    }

                }

            
            {
                this$0 = DeviceService.this;
                capability = s;
                super();
            }
            });
            return;
        }
    }

    protected transient void appendCapabilites(String as[])
    {
        int j = as.length;
        for (int i = 0; i < j; i++)
        {
            String s = as[i];
            mCapabilities.add(s);
        }

    }

    public void closeLaunchSession(LaunchSession launchsession, ResponseListener responselistener)
    {
        if (launchsession == null)
        {
            Util.postError(responselistener, new ServiceCommandError(0, "You must provide a valid LaunchSession", null));
        } else
        {
            DeviceService deviceservice = launchsession.getService();
            if (deviceservice == null)
            {
                Util.postError(responselistener, new ServiceCommandError(0, "There is no service attached to this launch session", null));
                return;
            }
            static class _cls5
            {

                static final int $SwitchMap$com$connectsdk$service$sessions$LaunchSession$LaunchSessionType[];

                static 
                {
                    $SwitchMap$com$connectsdk$service$sessions$LaunchSession$LaunchSessionType = new int[com.connectsdk.service.sessions.LaunchSession.LaunchSessionType.values().length];
                    try
                    {
                        $SwitchMap$com$connectsdk$service$sessions$LaunchSession$LaunchSessionType[com.connectsdk.service.sessions.LaunchSession.LaunchSessionType.App.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror1) { }
                    try
                    {
                        $SwitchMap$com$connectsdk$service$sessions$LaunchSession$LaunchSessionType[com.connectsdk.service.sessions.LaunchSession.LaunchSessionType.Unknown.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror)
                    {
                        return;
                    }
                }
            }

            switch (_cls5..SwitchMap.com.connectsdk.service.sessions.LaunchSession.LaunchSessionType[launchsession.getSessionType().ordinal()])
            {
            default:
                Util.postError(responselistener, new ServiceCommandError(0, "This DeviceService does not know ho to close this LaunchSession", null));
                return;

            case 1: // '\001'
                break;
            }
            if (deviceservice instanceof Launcher)
            {
                ((Launcher)deviceservice).closeApp(launchsession, responselistener);
                return;
            }
        }
    }

    public void connect()
    {
    }

    public LaunchSession decodeLaunchSession(String s, JSONObject jsonobject)
        throws JSONException
    {
        return null;
    }

    public void disconnect()
    {
    }

    public CapabilityMethods getAPI(Class class1)
    {
        if (class1.isAssignableFrom(getClass()))
        {
            return (CapabilityMethods)this;
        } else
        {
            return null;
        }
    }

    public List getCapabilities()
    {
        return mCapabilities;
    }

    public ServiceConfig getServiceConfig()
    {
        return serviceConfig;
    }

    public ServiceDescription getServiceDescription()
    {
        return serviceDescription;
    }

    public String getServiceName()
    {
        return serviceDescription.getServiceID();
    }

    public transient boolean hasAnyCapability(String as[])
    {
        boolean flag1 = false;
        int j = as.length;
        int i = 0;
        do
        {
label0:
            {
                boolean flag = flag1;
                if (i < j)
                {
                    if (!hasCapability(as[i]))
                    {
                        break label0;
                    }
                    flag = true;
                }
                return flag;
            }
            i++;
        } while (true);
    }

    public boolean hasCapabilities(List list)
    {
        String as[] = new String[list.size()];
        list.toArray(as);
        return hasCapabilities(as);
    }

    public transient boolean hasCapabilities(String as[])
    {
        int j = as.length;
        for (int i = 0; i < j; i++)
        {
            if (!hasCapability(as[i]))
            {
                return false;
            }
        }

        return true;
    }

    public boolean hasCapability(String s)
    {
        Matcher matcher = CapabilityMethods.ANY_PATTERN.matcher(s);
        if (matcher.find())
        {
            s = matcher.group();
            for (Iterator iterator = mCapabilities.iterator(); iterator.hasNext();)
            {
                if (((String)iterator.next()).indexOf(s) != -1)
                {
                    return true;
                }
            }

            return false;
        } else
        {
            return mCapabilities.contains(s);
        }
    }

    public boolean isConnectable()
    {
        return false;
    }

    public boolean isConnected()
    {
        return true;
    }

    public boolean isServiceReady()
    {
        return isServiceReady;
    }

    public void onLoseReachability(DeviceServiceReachability deviceservicereachability)
    {
    }

    public void removeCapabilities(final List capabilities)
    {
        if (capabilities == null)
        {
            return;
        }
        String s;
        for (Iterator iterator = capabilities.iterator(); iterator.hasNext(); mCapabilities.remove(s))
        {
            s = (String)iterator.next();
        }

        Util.runOnUI(new Runnable() {

            final DeviceService this$0;
            final List val$capabilities;

            public void run()
            {
                ConnectableDeviceListenerPair connectabledevicelistenerpair;
                for (Iterator iterator1 = deviceListeners.iterator(); iterator1.hasNext(); connectabledevicelistenerpair.listener.onCapabilityUpdated(connectabledevicelistenerpair.device, null, capabilities))
                {
                    connectabledevicelistenerpair = (ConnectableDeviceListenerPair)iterator1.next();
                }

            }

            
            {
                this$0 = DeviceService.this;
                capabilities = list;
                super();
            }
        });
    }

    public transient void removeCapabilities(String as[])
    {
        removeCapabilities(Arrays.asList(as));
    }

    public void removeCapability(final String capability)
    {
        if (capability == null)
        {
            return;
        } else
        {
            mCapabilities.remove(capability);
            Util.runOnUI(new Runnable() {

                final DeviceService this$0;
                final String val$capability;

                public void run()
                {
                    ArrayList arraylist = new ArrayList();
                    arraylist.add(capability);
                    ConnectableDeviceListenerPair connectabledevicelistenerpair;
                    for (Iterator iterator = deviceListeners.iterator(); iterator.hasNext(); connectabledevicelistenerpair.listener.onCapabilityUpdated(connectabledevicelistenerpair.device, null, arraylist))
                    {
                        connectabledevicelistenerpair = (ConnectableDeviceListenerPair)iterator.next();
                    }

                }

            
            {
                this$0 = DeviceService.this;
                capability = s;
                super();
            }
            });
            return;
        }
    }

    public void sendCommand(ServiceCommand servicecommand)
    {
    }

    public void sendPairingKey(String s)
    {
    }

    public void setDeviceListeners(CopyOnWriteArrayList copyonwritearraylist)
    {
        deviceListeners = copyonwritearraylist;
    }

    public void setServiceConfig(ServiceConfig serviceconfig)
    {
        serviceConfig = serviceconfig;
    }

    public void setServiceDescription(ServiceDescription servicedescription)
    {
        serviceDescription = servicedescription;
    }

    public void setServiceReady(boolean flag)
    {
        isServiceReady = flag;
    }

    public void setServiceReadyListener(ServiceReadyListener servicereadylistener)
    {
        serviceReadyListener = servicereadylistener;
    }

    public JSONObject toJSONObject()
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("description", serviceDescription.toJSONObject());
            jsonobject.put("config", serviceConfig.toJSONObject());
        }
        catch (JSONException jsonexception)
        {
            return jsonobject;
        }
        return jsonobject;
    }
}
