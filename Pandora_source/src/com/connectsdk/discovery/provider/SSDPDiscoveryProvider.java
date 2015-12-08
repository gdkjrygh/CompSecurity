// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.connectsdk.discovery.provider;

import android.content.Context;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.util.Log;
import com.connectsdk.core.Util;
import com.connectsdk.core.upnp.Device;
import com.connectsdk.core.upnp.ssdp.SSDP;
import com.connectsdk.core.upnp.ssdp.SSDPSearchMsg;
import com.connectsdk.core.upnp.ssdp.SSDPSocket;
import com.connectsdk.discovery.DiscoveryProvider;
import com.connectsdk.discovery.DiscoveryProviderListener;
import com.connectsdk.service.config.ServiceDescription;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

public class SSDPDiscoveryProvider
    implements DiscoveryProvider
{

    private static final int RESCAN_ATTEMPTS = 3;
    private static final int RESCAN_INTERVAL = 10000;
    private static final int SSDP_TIMEOUT = 10000;
    Context context;
    protected Timer dataTimer;
    private ConcurrentHashMap discoveredServices;
    private ConcurrentHashMap foundServices;
    protected boolean isStarted;
    private Runnable mRespNotifyHandler;
    private Runnable mResponseHandler;
    protected SSDPSocket mSSDPSocket;
    boolean needToStartSearch;
    private Thread notifyThread;
    private Thread responseThread;
    List serviceFilters;
    private CopyOnWriteArrayList serviceListeners;
    private ConcurrentHashMap services;
    private Pattern uuidReg;

    public SSDPDiscoveryProvider(Context context1)
    {
        needToStartSearch = false;
        foundServices = new ConcurrentHashMap();
        discoveredServices = new ConcurrentHashMap();
        isStarted = false;
        mResponseHandler = new Runnable() {

            final SSDPDiscoveryProvider this$0;

            public void run()
            {
                do
                {
                    if (mSSDPSocket == null)
                    {
                        break;
                    }
                    try
                    {
                        handleDatagramPacket(SSDP.convertDatagram(mSSDPSocket.responseReceive()));
                        continue;
                    }
                    catch (IOException ioexception) { }
                    break;
                } while (true);
            }

            
            {
                this$0 = SSDPDiscoveryProvider.this;
                super();
            }
        };
        mRespNotifyHandler = new Runnable() {

            final SSDPDiscoveryProvider this$0;

            public void run()
            {
                do
                {
                    if (mSSDPSocket == null)
                    {
                        break;
                    }
                    try
                    {
                        handleDatagramPacket(SSDP.convertDatagram(mSSDPSocket.notifyReceive()));
                        continue;
                    }
                    catch (IOException ioexception) { }
                    break;
                } while (true);
            }

            
            {
                this$0 = SSDPDiscoveryProvider.this;
                super();
            }
        };
        context = context1;
        uuidReg = Pattern.compile("(?<=uuid:).+(?=(::)?)");
        services = new ConcurrentHashMap(8, 0.75F, 2);
        serviceListeners = new CopyOnWriteArrayList();
        serviceFilters = new ArrayList();
    }

    private void openSocket()
    {
        if (mSSDPSocket != null && mSSDPSocket.isConnected())
        {
            return;
        }
        byte abyte0[] = Util.convertIpAddress(((WifiManager)context.getSystemService("wifi")).getConnectionInfo().getIpAddress());
        try
        {
            mSSDPSocket = new SSDPSocket(InetAddress.getByAddress(abyte0));
            return;
        }
        catch (UnknownHostException unknownhostexception)
        {
            return;
        }
        catch (IOException ioexception)
        {
            return;
        }
    }

    public void addDeviceFilter(JSONObject jsonobject)
    {
        if (!jsonobject.has("filter"))
        {
            Log.e("Connect SDK", "This device filter does not have ssdp filter info");
            return;
        } else
        {
            serviceFilters.add(jsonobject);
            return;
        }
    }

    public void addListener(DiscoveryProviderListener discoveryproviderlistener)
    {
        serviceListeners.add(discoveryproviderlistener);
    }

    public boolean containsServicesWithFilter(Device device, String s)
    {
        return true;
    }

    public void getLocationData(final String location, final String uuid, final String serviceFilter)
    {
        Util.runInBackground(new Runnable() {

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
                        ServiceDescription servicedescription = (ServiceDescription)discoveredServices.get(uuid);
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
                        foundServices.put(uuid, servicedescription);
                        Util.runOnUI(servicedescription. new Runnable() {

                            final _cls7 this$1;
                            final ServiceDescription val$service;

                            public void run()
                            {
                                for (Iterator iterator = serviceListeners.iterator(); iterator.hasNext(); ((DiscoveryProviderListener)iterator.next()).onServiceAdded(_fld0, service)) { }
                            }

            
            {
                this$1 = final__pcls7;
                service = ServiceDescription.this;
                super();
            }
                        });
                    }
                }
                discoveredServices.remove(uuid);
            }

            
            {
                this$0 = SSDPDiscoveryProvider.this;
                location = s;
                serviceFilter = s1;
                uuid = s2;
                super();
            }
        }, true);
    }

    protected void handleDatagramPacket(final com.connectsdk.core.upnp.ssdp.SSDP.ParsedDatagram service)
    {
        Object obj1;
        obj1 = service.data;
        String s;
        if (service.type.equals("NOTIFY * HTTP/1.1"))
        {
            s = "NT";
        } else
        {
            s = "ST";
        }
        obj1 = (String)((Map) (obj1)).get(s);
        if (obj1 != null && !"M-SEARCH * HTTP/1.1".equals(service.type) && isSearchingForFilter(((String) (obj1)))) goto _L2; else goto _L1
_L1:
        Object obj;
        return;
_L2:
        String s1;
        if ((obj = (String)service.data.get("USN")) == null || ((String) (obj)).length() == 0 || !((Matcher) (obj = uuidReg.matcher(((CharSequence) (obj))))).find())
        {
            continue; /* Loop/switch isn't completed */
        }
        s1 = ((Matcher) (obj)).group();
        if (!"ssdp:byebye".equals(service.data.get("NTS")))
        {
            break; /* Loop/switch isn't completed */
        }
        service = (ServiceDescription)foundServices.get(s1);
        if (service != null)
        {
            Util.runOnUI(new Runnable() {

                final SSDPDiscoveryProvider this$0;
                final ServiceDescription val$service;

                public void run()
                {
                    for (Iterator iterator = serviceListeners.iterator(); iterator.hasNext(); ((DiscoveryProviderListener)iterator.next()).onServiceRemoved(SSDPDiscoveryProvider.this, service)) { }
                }

            
            {
                this$0 = SSDPDiscoveryProvider.this;
                service = servicedescription;
                super();
            }
            });
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        String s2 = (String)service.data.get("LOCATION");
        if (s2 != null && s2.length() != 0)
        {
            ServiceDescription servicedescription = (ServiceDescription)foundServices.get(s1);
            ServiceDescription servicedescription1 = (ServiceDescription)discoveredServices.get(s1);
            boolean flag;
            if (servicedescription == null && servicedescription1 == null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                servicedescription = new ServiceDescription();
                servicedescription.setUUID(s1);
                servicedescription.setServiceFilter(((String) (obj1)));
                servicedescription.setIpAddress(service.dp.getAddress().getHostAddress());
                servicedescription.setPort(3001);
                discoveredServices.put(s1, servicedescription);
                getLocationData(s2, s1, ((String) (obj1)));
            }
            if (servicedescription != null)
            {
                servicedescription.setLastDetection((new Date()).getTime());
                return;
            }
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    public boolean isEmpty()
    {
        return serviceFilters.size() == 0;
    }

    public boolean isSearchingForFilter(String s)
    {
        Iterator iterator = serviceFilters.iterator();
_L2:
        JSONObject jsonobject;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_48;
        }
        jsonobject = (JSONObject)iterator.next();
        boolean flag = jsonobject.getString("filter").equals(s);
        if (flag)
        {
            return true;
        }
        continue; /* Loop/switch isn't completed */
        return false;
        JSONException jsonexception;
        jsonexception;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public void removeDeviceFilter(JSONObject jsonobject)
    {
        jsonobject = jsonobject.getString("serviceId");
        int i = 0;
_L3:
        boolean flag1;
        if (i >= serviceFilters.size())
        {
            break MISSING_BLOCK_LABEL_89;
        }
        flag1 = ((String)((JSONObject)serviceFilters.get(i)).get("serviceId")).equals(jsonobject);
        if (!flag1) goto _L2; else goto _L1
_L1:
        boolean flag = true;
_L4:
        if (flag)
        {
            serviceFilters.remove(i);
        }
        return;
_L2:
        i++;
          goto _L3
        jsonobject;
        i = -1;
        flag = false;
          goto _L4
        i = -1;
        flag = false;
          goto _L4
    }

    public void removeListener(DiscoveryProviderListener discoveryproviderlistener)
    {
        serviceListeners.remove(discoveryproviderlistener);
    }

    public void reset()
    {
        stop();
        services.clear();
        foundServices.clear();
        discoveredServices.clear();
    }

    public void sendSearch()
    {
        Object obj = new ArrayList();
        long l = (new Date()).getTime();
        Iterator iterator = foundServices.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s1 = (String)iterator.next();
            if (((ServiceDescription)foundServices.get(s1)).getLastDetection() < l - 30000L)
            {
                ((List) (obj)).add(s1);
            }
        } while (true);
        String s;
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); foundServices.remove(s))
        {
            s = (String)((Iterator) (obj)).next();
            Util.runOnUI(new Runnable() {

                final SSDPDiscoveryProvider this$0;
                final ServiceDescription val$service;

                public void run()
                {
                    for (Iterator iterator1 = serviceListeners.iterator(); iterator1.hasNext(); ((DiscoveryProviderListener)iterator1.next()).onServiceRemoved(SSDPDiscoveryProvider.this, service)) { }
                }

            
            {
                this$0 = SSDPDiscoveryProvider.this;
                service = servicedescription;
                super();
            }
            });
        }

        obj = serviceFilters.iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            final String message = (JSONObject)((Iterator) (obj)).next();
            int i;
            try
            {
                message = new SSDPSearchMsg(message.getString("filter"));
            }
            catch (JSONException jsonexception)
            {
                break;
            }
            message = message.toString();
            i = 0;
            while (i < 3) 
            {
                TimerTask timertask = new TimerTask() {

                    final SSDPDiscoveryProvider this$0;
                    final String val$message;

                    public void run()
                    {
                        try
                        {
                            if (mSSDPSocket != null)
                            {
                                mSSDPSocket.send(message);
                            }
                            return;
                        }
                        catch (IOException ioexception)
                        {
                            return;
                        }
                    }

            
            {
                this$0 = SSDPDiscoveryProvider.this;
                message = s;
                super();
            }
                };
                if (dataTimer != null && isStarted)
                {
                    dataTimer.schedule(timertask, i * 1000);
                }
                i++;
            }
        } while (true);
    }

    public String serviceIdForFilter(String s)
    {
        Iterator iterator = serviceFilters.iterator();
_L2:
        Object obj;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_52;
        }
        obj = (JSONObject)iterator.next();
        if (!((JSONObject) (obj)).getString("filter").equals(s))
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = ((JSONObject) (obj)).getString("serviceId");
        return ((String) (obj));
        return "";
        JSONException jsonexception;
        jsonexception;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public void start()
    {
        openSocket();
        dataTimer = new Timer();
        dataTimer.schedule(new TimerTask() {

            final SSDPDiscoveryProvider this$0;

            public void run()
            {
                sendSearch();
            }

            
            {
                this$0 = SSDPDiscoveryProvider.this;
                super();
            }
        }, 100L, 10000L);
        responseThread = new Thread(mResponseHandler);
        notifyThread = new Thread(mRespNotifyHandler);
        responseThread.start();
        notifyThread.start();
        isStarted = true;
    }

    public void stop()
    {
        if (isStarted)
        {
            dataTimer.cancel();
            dataTimer = null;
            responseThread.interrupt();
            notifyThread.interrupt();
            if (mSSDPSocket != null)
            {
                mSSDPSocket.close();
                mSSDPSocket = null;
            }
            isStarted = false;
        }
    }



}
