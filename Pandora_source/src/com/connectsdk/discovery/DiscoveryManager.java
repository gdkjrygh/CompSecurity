// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.connectsdk.discovery;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import com.connectsdk.core.Util;
import com.connectsdk.device.ConnectableDevice;
import com.connectsdk.device.ConnectableDeviceStore;
import com.connectsdk.device.DefaultConnectableDeviceStore;
import com.connectsdk.service.DeviceService;
import com.connectsdk.service.command.ServiceCommandError;
import com.connectsdk.service.config.ServiceConfig;
import com.connectsdk.service.config.ServiceDescription;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.connectsdk.discovery:
//            DiscoveryManagerListener, DiscoveryProvider, DiscoveryProviderListener

public class DiscoveryManager
{
    public static final class PairingLevel extends Enum
    {

        private static final PairingLevel $VALUES[];
        public static final PairingLevel OFF;
        public static final PairingLevel ON;

        public static PairingLevel valueOf(String s)
        {
            return (PairingLevel)Enum.valueOf(com/connectsdk/discovery/DiscoveryManager$PairingLevel, s);
        }

        public static PairingLevel[] values()
        {
            return (PairingLevel[])$VALUES.clone();
        }

        static 
        {
            OFF = new PairingLevel("OFF", 0);
            ON = new PairingLevel("ON", 1);
            $VALUES = (new PairingLevel[] {
                OFF, ON
            });
        }

        private PairingLevel(String s, int i)
        {
            super(s, i);
        }
    }


    private static int airplaneMode;
    private static DiscoveryManager instance;
    private ConcurrentHashMap allDevices;
    private ConcurrentHashMap compatibleDevices;
    ConnectableDeviceStore connectableDeviceStore;
    Context context;
    private ConcurrentHashMap deviceClasses;
    private CopyOnWriteArrayList discoveryListeners;
    private CopyOnWriteArrayList discoveryProviders;
    boolean isBroadcastReceiverRegistered;
    private boolean mSearching;
    private boolean mShouldResume;
    PairingLevel pairingLevel;
    BroadcastReceiver receiver = new BroadcastReceiver() {

        final DiscoveryManager this$0;

        public void onReceive(Context context2, Intent intent)
        {
label0:
            {
                if (intent.getAction().equals("android.net.wifi.supplicant.CONNECTION_CHANGE"))
                {
                    if (!intent.getBooleanExtra("connected", false))
                    {
                        break label0;
                    }
                    context2 = new TimerTask() {

                        final _cls1 this$1;

                        public void run()
                        {
                            if (mShouldResume)
                            {
                                for (Iterator iterator = discoveryProviders.iterator(); iterator.hasNext(); ((DiscoveryProvider)iterator.next()).start()) { }
                            }
                        }

            
            {
                this$1 = _cls1.this;
                super();
            }
                    };
                    (new Timer()).schedule(context2, 2000L);
                }
                return;
            }
            Log.w("Connect SDK", "Network connection is disconnected");
            for (context2 = discoveryProviders.iterator(); context2.hasNext(); ((DiscoveryProvider)context2.next()).reset()) { }
            allDevices.clear();
            for (context2 = compatibleDevices.values().iterator(); context2.hasNext(); handleDeviceLoss(intent))
            {
                intent = (ConnectableDevice)context2.next();
            }

            compatibleDevices.clear();
            mShouldResume = true;
            stop();
        }

            
            {
                this$0 = DiscoveryManager.this;
                super();
            }
    };
    int rescanInterval;
    Timer rescanTimer;
    DiscoveryProviderListener serviceListener = new DiscoveryProviderListener() {

        final DiscoveryManager this$0;

        public void onServiceAdded(DiscoveryProvider discoveryprovider, ServiceDescription servicedescription)
        {
            boolean flag1 = false;
            String s1 = servicedescription.getUUID();
            String s = servicedescription.getIpAddress();
            Object obj = servicedescription.getFriendlyName();
            Object obj1 = servicedescription.getModelName();
            Object obj2 = servicedescription.getModelNumber();
            discoveryprovider = (ConnectableDevice)allDevices.get(s);
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
            obj2 = (Class)deviceClasses.get(servicedescription.getServiceFilter());
            if (obj2 == null)
            {
                return;
            }
            obj1 = lookupMatchServiceConfigFromDeviceStore(s1);
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
            allDevices.put(s, discoveryprovider);
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
                discoveryprovider = (ConnectableDevice)allDevices.get(servicedescription.getIpAddress());
                if (discoveryprovider != null)
                {
                    discoveryprovider.removeServiceWithServiceFilter(servicedescription.getServiceFilter());
                    if (!discoveryprovider.getServices().isEmpty())
                    {
                        break label0;
                    }
                    allDevices.remove(servicedescription.getIpAddress());
                    handleDeviceLoss(discoveryprovider);
                }
                return;
            }
            handleDeviceUpdate(discoveryprovider);
        }

            
            {
                this$0 = DiscoveryManager.this;
                super();
            }
    };

    public DiscoveryManager(Context context1)
    {
        this(context1, ((ConnectableDeviceStore) (new DefaultConnectableDeviceStore(context1))));
    }

    public DiscoveryManager(Context context1, ConnectableDeviceStore connectabledevicestore)
    {
        rescanInterval = 10;
        isBroadcastReceiverRegistered = false;
        mSearching = false;
        mShouldResume = false;
        context = context1;
        connectableDeviceStore = connectabledevicestore;
        allDevices = new ConcurrentHashMap(8, 0.75F, 2);
        compatibleDevices = new ConcurrentHashMap(8, 0.75F, 2);
        deviceClasses = new ConcurrentHashMap(4, 0.75F, 2);
        discoveryProviders = new CopyOnWriteArrayList();
        discoveryListeners = new CopyOnWriteArrayList();
        pairingLevel = PairingLevel.OFF;
    }

    public static void destroy()
    {
        com/connectsdk/discovery/DiscoveryManager;
        JVM INSTR monitorenter ;
        instance.onDestroy();
        com/connectsdk/discovery/DiscoveryManager;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public static DiscoveryManager getInstance()
    {
        com/connectsdk/discovery/DiscoveryManager;
        JVM INSTR monitorenter ;
        if (instance == null)
        {
            throw new Error("Call DiscoveryManager.init(Context) first");
        }
        break MISSING_BLOCK_LABEL_25;
        Exception exception;
        exception;
        com/connectsdk/discovery/DiscoveryManager;
        JVM INSTR monitorexit ;
        throw exception;
        DiscoveryManager discoverymanager = instance;
        com/connectsdk/discovery/DiscoveryManager;
        JVM INSTR monitorexit ;
        return discoverymanager;
    }

    public static void init(Context context1)
    {
        com/connectsdk/discovery/DiscoveryManager;
        JVM INSTR monitorenter ;
        instance = new DiscoveryManager(context1);
        com/connectsdk/discovery/DiscoveryManager;
        JVM INSTR monitorexit ;
        return;
        context1;
        throw context1;
    }

    public static void init(Context context1, ConnectableDeviceStore connectabledevicestore)
    {
        com/connectsdk/discovery/DiscoveryManager;
        JVM INSTR monitorenter ;
        instance = new DiscoveryManager(context1, connectabledevicestore);
        com/connectsdk/discovery/DiscoveryManager;
        JVM INSTR monitorexit ;
        return;
        context1;
        throw context1;
    }

    private ServiceConfig lookupMatchServiceConfigFromDeviceStore(String s)
    {
        List list = getInstance().getConnectableDeviceStore().getStoredDevices();
        int i = 0;
        do
        {
            if (i >= list.size())
            {
                break;
            }
            for (Iterator iterator = ((ConnectableDevice)list.get(i)).getServices().iterator(); iterator.hasNext();)
            {
                DeviceService deviceservice = (DeviceService)iterator.next();
                if (deviceservice.getServiceConfig().getServiceUUID().equals(s))
                {
                    return deviceservice.getServiceConfig();
                }
            }

            i++;
        } while (true);
        return null;
    }

    private void registerBroadcastReceiver()
    {
        if (!isBroadcastReceiverRegistered)
        {
            isBroadcastReceiverRegistered = true;
            IntentFilter intentfilter = new IntentFilter("android.net.wifi.supplicant.CONNECTION_CHANGE");
            context.registerReceiver(receiver, intentfilter);
        }
    }

    protected static void setInstance(DiscoveryManager discoverymanager)
    {
        instance = discoverymanager;
    }

    private void unregisterBroadcastReceiver()
    {
        if (isBroadcastReceiverRegistered)
        {
            isBroadcastReceiverRegistered = false;
            context.unregisterReceiver(receiver);
        }
    }

    public void addListener(DiscoveryManagerListener discoverymanagerlistener)
    {
        for (Iterator iterator = compatibleDevices.values().iterator(); iterator.hasNext(); discoverymanagerlistener.onDeviceAdded(this, (ConnectableDevice)iterator.next())) { }
        discoveryListeners.add(discoverymanagerlistener);
    }

    public boolean descriptionIsNetcastTV(ServiceDescription servicedescription)
    {
        boolean flag1 = false;
        String s = servicedescription.getModelName();
        servicedescription = servicedescription.getModelDescription();
        boolean flag = flag1;
        if (s.toUpperCase(Locale.US).equals("LG TV"))
        {
            flag = flag1;
            if (!servicedescription.toUpperCase(Locale.US).contains("WEBOS"))
            {
                flag = true;
            }
        }
        return flag;
    }

    public Map getAllDevices()
    {
        return allDevices;
    }

    public Map getCompatibleDevices()
    {
        return compatibleDevices;
    }

    public ConnectableDeviceStore getConnectableDeviceStore()
    {
        return connectableDeviceStore;
    }

    public Context getContext()
    {
        return context;
    }

    public PairingLevel getPairingLevel()
    {
        return pairingLevel;
    }

    public void handleDeviceAdd(ConnectableDevice connectabledevice)
    {
        compatibleDevices.put(connectabledevice.getIpAddress(), connectabledevice);
        for (Iterator iterator = discoveryListeners.iterator(); iterator.hasNext(); ((DiscoveryManagerListener)iterator.next()).onDeviceAdded(this, connectabledevice)) { }
    }

    public void handleDeviceLoss(ConnectableDevice connectabledevice)
    {
        for (Iterator iterator = discoveryListeners.iterator(); iterator.hasNext(); ((DiscoveryManagerListener)iterator.next()).onDeviceRemoved(this, connectabledevice)) { }
        connectabledevice.disconnect();
    }

    public void handleDeviceUpdate(ConnectableDevice connectabledevice)
    {
        if (compatibleDevices.containsKey(connectabledevice.getIpAddress()))
        {
            for (Iterator iterator = discoveryListeners.iterator(); iterator.hasNext(); ((DiscoveryManagerListener)iterator.next()).onDeviceUpdated(this, connectabledevice)) { }
        } else
        {
            handleDeviceAdd(connectabledevice);
        }
    }

    public void onDestroy()
    {
    }

    public void registerDeviceService(Class class1, Class class2)
    {
        while (!com/connectsdk/service/DeviceService.isAssignableFrom(class1) || !com/connectsdk/discovery/DiscoveryProvider.isAssignableFrom(class2)) 
        {
            return;
        }
        Object obj1 = discoveryProviders.iterator();
_L4:
        if (!((Iterator) (obj1)).hasNext()) goto _L2; else goto _L1
_L1:
        Object obj = (DiscoveryProvider)((Iterator) (obj1)).next();
        if (!obj.getClass().isAssignableFrom(class2)) goto _L4; else goto _L3
_L3:
        obj1 = obj;
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_121;
        }
        obj1 = (DiscoveryProvider)class2.getConstructor(new Class[] {
            android/content/Context
        }).newInstance(new Object[] {
            context
        });
        ((DiscoveryProvider) (obj1)).addListener(serviceListener);
        discoveryProviders.add(obj1);
        class2 = (JSONObject)class1.getMethod("discoveryParameters", new Class[0]).invoke(null, new Object[0]);
        obj = (String)class2.get("filter");
        deviceClasses.put(obj, class1);
        ((DiscoveryProvider) (obj1)).addDeviceFilter(class2);
        return;
        class1;
        return;
        class1;
        return;
        class1;
        return;
        class1;
        return;
        class1;
        return;
        class1;
        return;
        class1;
        return;
_L2:
        obj = null;
        if (true) goto _L3; else goto _L5
_L5:
    }

    public void removeListener(DiscoveryManagerListener discoverymanagerlistener)
    {
        discoveryListeners.remove(discoverymanagerlistener);
    }

    public void setConnectableDeviceStore(ConnectableDeviceStore connectabledevicestore)
    {
        connectableDeviceStore = connectabledevicestore;
    }

    public void setPairingLevel(PairingLevel pairinglevel)
    {
        pairingLevel = pairinglevel;
    }

    public void start()
    {
        if (!mSearching)
        {
            mSearching = true;
            if (discoveryProviders != null)
            {
                Util.runOnUI(new Runnable() {

                    final DiscoveryManager this$0;

                    public void run()
                    {
                        if (mShouldResume)
                        {
                            mShouldResume = false;
                        } else
                        {
                            registerBroadcastReceiver();
                        }
                        if (((ConnectivityManager)context.getSystemService("connectivity")).getNetworkInfo(1).isConnected())
                        {
                            for (Iterator iterator = discoveryProviders.iterator(); iterator.hasNext(); ((DiscoveryProvider)iterator.next()).start()) { }
                        } else
                        {
                            Log.w("Connect SDK", "Wifi is not connected");
                            mShouldResume = true;
                            Util.runOnUI(new Runnable() {

                                final _cls2 this$1;

                                public void run()
                                {
                                    for (Iterator iterator = discoveryListeners.iterator(); iterator.hasNext(); ((DiscoveryManagerListener)iterator.next()).onDiscoveryFailed(_fld0, new ServiceCommandError(0, "No wifi connection", null))) { }
                                }

            
            {
                this$1 = _cls2.this;
                super();
            }
                            });
                        }
                    }

            
            {
                this$0 = DiscoveryManager.this;
                super();
            }
                });
                return;
            }
        }
    }

    public void stop()
    {
        if (mSearching)
        {
            mSearching = false;
            for (Iterator iterator = discoveryProviders.iterator(); iterator.hasNext(); ((DiscoveryProvider)iterator.next()).stop()) { }
            if (!mShouldResume)
            {
                unregisterBroadcastReceiver();
                return;
            }
        }
    }

    public void unregisterDeviceService(Class class1, Class class2)
    {
_L2:
        return;
        if (!class1.isAssignableFrom(com/connectsdk/service/DeviceService) || !class2.isAssignableFrom(com/connectsdk/discovery/DiscoveryProvider)) goto _L2; else goto _L1
_L1:
        DiscoveryProvider discoveryprovider;
        Iterator iterator = discoveryProviders.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break; /* Loop/switch isn't completed */
            }
            discoveryprovider = (DiscoveryProvider)iterator.next();
        } while (!discoveryprovider.getClass().isAssignableFrom(class2));
        class2 = discoveryprovider;
_L4:
        if (class2 != null)
        {
            try
            {
                class1 = (JSONObject)class1.getMethod("discoveryParameters", new Class[0]).invoke(null, new Object[0]);
                String s = (String)class1.get("filter");
                deviceClasses.remove(s);
                class2.removeDeviceFilter(class1);
                if (class2.isEmpty())
                {
                    class2.stop();
                    discoveryProviders.remove(class2);
                    return;
                }
            }
            // Misplaced declaration of an exception variable
            catch (Class class1)
            {
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Class class1)
            {
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Class class1)
            {
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Class class1)
            {
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Class class1)
            {
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Class class1)
            {
                return;
            }
        }
        if (true) goto _L2; else goto _L3
_L3:
        class2 = null;
          goto _L4
        if (true) goto _L2; else goto _L5
_L5:
    }



/*
    static boolean access$002(DiscoveryManager discoverymanager, boolean flag)
    {
        discoverymanager.mShouldResume = flag;
        return flag;
    }

*/







}
