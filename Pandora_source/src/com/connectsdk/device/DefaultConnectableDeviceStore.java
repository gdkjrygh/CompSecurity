// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.connectsdk.device;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Environment;
import com.connectsdk.core.Util;
import com.connectsdk.service.DeviceService;
import com.connectsdk.service.config.ServiceConfig;
import com.connectsdk.service.config.ServiceDescription;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.connectsdk.device:
//            ConnectableDeviceStore, ConnectableDevice

public class DefaultConnectableDeviceStore
    implements ConnectableDeviceStore
{

    static final String CLIENT_KEY = "clientKey";
    static final String CONFIG = "config";
    static final String DEFAULT_SERVICE_NETCASTTV = "NetcastTVService";
    static final String DEFAULT_SERVICE_WEBOSTV = "WebOSTVService";
    static final String DESCRIPTION = "description";
    static final String DIRPATH = "/android/data/connect_sdk/";
    static final String FILENAME = "StoredDevices";
    static final String FILTER = "filter";
    static final String FRIENDLY_NAME = "friendlyName";
    static final String IP_ADDRESS = "ipAddress";
    static final String MODEL_NAME = "modelName";
    static final String MODEL_NUMBER = "modelNumber";
    static final String PAIRING_KEY = "pairingKey";
    static final String PORT = "port";
    static final String SERVER_CERTIFICATE = "serverCertificate";
    static final String SERVICES = "services";
    static final String SERVICE_UUID = "serviceUUID";
    static final String UUID = "uuid";
    public long created;
    private JSONObject deviceStore;
    private String fileFullPath;
    public long maxStoreDuration;
    private List storedDevices;
    public long updated;
    public int version;
    private boolean waitToWrite;

    public DefaultConnectableDeviceStore(Context context)
    {
        maxStoreDuration = TimeUnit.DAYS.toSeconds(3L);
        waitToWrite = false;
        storedDevices = new CopyOnWriteArrayList();
        String s;
        if (Environment.getExternalStorageState().equals("mounted"))
        {
            s = Environment.getExternalStorageDirectory().getAbsolutePath();
        } else
        {
            s = "unmounted";
        }
        fileFullPath = (new StringBuilder()).append(s).append("/android/data/connect_sdk/").append("StoredDevices").toString();
        try
        {
            fileFullPath = (new StringBuilder()).append(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.dataDir).append("/").append("StoredDevices").toString();
        }
        // Misplaced declaration of an exception variable
        catch (Context context) { }
        load();
    }

    private ServiceConfig createServiceConfig(JSONObject jsonobject)
    {
        try
        {
            jsonobject = new ServiceConfig(jsonobject.getString("UUID"));
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            return null;
        }
        return jsonobject;
    }

    private ServiceDescription createServiceDescription(JSONObject jsonobject)
    {
        if (jsonobject == null)
        {
            return null;
        } else
        {
            ServiceDescription servicedescription = new ServiceDescription();
            servicedescription.setServiceFilter(jsonobject.optString("filter"));
            servicedescription.setIpAddress(jsonobject.optString("ipAddress"));
            servicedescription.setUUID(jsonobject.optString("uuid"));
            servicedescription.setModelName(jsonobject.optString("modelName"));
            servicedescription.setModelNumber(jsonobject.optString("modelNumber"));
            servicedescription.setFriendlyName(jsonobject.optString("friendlyName"));
            servicedescription.setPort(jsonobject.optInt("port"));
            return servicedescription;
        }
    }

    private void load()
    {
        Object obj = new File(fileFullPath);
        if (((File) (obj)).exists()) goto _L2; else goto _L1
_L1:
        version = 0;
        created = Util.getTime();
        updated = Util.getTime();
_L6:
        return;
_L2:
        Object obj1;
        obj = new BufferedReader(new FileReader(((File) (obj))));
        obj1 = new StringBuilder();
_L3:
        Object obj2 = ((BufferedReader) (obj)).readLine();
label0:
        {
            if (obj2 == null)
            {
                break label0;
            }
            Object obj3;
            Object obj4;
            JSONObject jsonobject;
            try
            {
                ((StringBuilder) (obj1)).append(((String) (obj2)));
            }
            catch (IOException ioexception)
            {
                return;
            }
            catch (JSONException jsonexception)
            {
                return;
            }
        }
          goto _L3
        ((BufferedReader) (obj)).close();
        deviceStore = new JSONObject(((StringBuilder) (obj1)).toString());
        obj = deviceStore.getJSONObject("devices");
        obj1 = ((JSONObject) (obj)).keys();
_L4:
        if (!((Iterator) (obj1)).hasNext())
        {
            continue; /* Loop/switch isn't completed */
        }
        obj3 = (String)((Iterator) (obj1)).next();
        obj4 = ((JSONObject) (obj)).getJSONObject(((String) (obj3)));
        obj2 = new ConnectableDevice();
        ((ConnectableDevice) (obj2)).setIpAddress(((JSONObject) (obj4)).optString("ipAddress"));
        ((ConnectableDevice) (obj2)).setFriendlyName(((JSONObject) (obj4)).optString("friendlyName"));
        ((ConnectableDevice) (obj2)).setModelName(((JSONObject) (obj4)).optString("modelName"));
        ((ConnectableDevice) (obj2)).setModelNumber(((JSONObject) (obj4)).optString("modelNumber"));
        ((ConnectableDevice) (obj2)).setUUID(((String) (obj3)));
        obj3 = ((JSONObject) (obj4)).optJSONObject("services");
        if (obj3 == null)
        {
            break MISSING_BLOCK_LABEL_287;
        }
        for (obj4 = ((JSONObject) (obj3)).keys(); ((Iterator) (obj4)).hasNext(); ((ConnectableDevice) (obj2)).addService(new DeviceService(createServiceDescription(jsonobject.optJSONObject("description")), createServiceConfig(jsonobject.optJSONObject("config")), this)))
        {
            jsonobject = ((JSONObject) (obj3)).optJSONObject((String)((Iterator) (obj4)).next());
        }

        storedDevices.add(obj2);
          goto _L4
        if (true) goto _L6; else goto _L5
_L5:
    }

    private void store()
    {
        JSONObject jsonobject = new JSONObject();
        for (Iterator iterator = storedDevices.iterator(); iterator.hasNext();)
        {
            ConnectableDevice connectabledevice = (ConnectableDevice)iterator.next();
            JSONObject jsonobject1 = connectabledevice.toJSONObject();
            try
            {
                jsonobject.put(connectabledevice.getUUID(), jsonobject1);
            }
            catch (JSONException jsonexception1) { }
        }

        updated = Util.getTime();
        deviceStore = new JSONObject();
        try
        {
            deviceStore.put("version", version);
            deviceStore.put("created", created);
            deviceStore.put("updated", updated);
            deviceStore.put("devices", jsonobject);
        }
        catch (JSONException jsonexception)
        {
            jsonexception.printStackTrace();
        }
        if (!waitToWrite)
        {
            writeStoreToDisk();
        }
    }

    private void writeStoreToDisk()
    {
        final double lastUpdate = updated;
        waitToWrite = true;
        Util.runInBackground(new Runnable() {

            final DefaultConnectableDeviceStore this$0;
            final double val$lastUpdate;

            public void run()
            {
                Object obj = new File(fileFullPath);
                if (!((File) (obj)).exists())
                {
                    ((File) (obj)).getParentFile().mkdirs();
                }
                obj = new FileWriter(((File) (obj)));
                ((FileWriter) (obj)).write(deviceStore.toString());
                ((FileWriter) (obj)).close();
                waitToWrite = false;
_L2:
                if (lastUpdate != (double)updated)
                {
                    writeStoreToDisk();
                }
                return;
                Object obj1;
                obj1;
                waitToWrite = false;
                if (true) goto _L2; else goto _L1
_L1:
                obj1;
                waitToWrite = false;
                throw obj1;
            }

            
            {
                this$0 = DefaultConnectableDeviceStore.this;
                lastUpdate = d;
                super();
            }
        });
    }

    public void addDevice(ConnectableDevice connectabledevice)
    {
        storedDevices.add(connectabledevice);
        store();
    }

    public List getStoredDevices()
    {
        return storedDevices;
    }

    public void removeAll()
    {
        storedDevices.clear();
        store();
    }

    public void removeDevice(ConnectableDevice connectabledevice)
    {
        storedDevices.remove(connectabledevice);
        store();
    }

    public void updateDevice(ConnectableDevice connectabledevice)
    {
        Iterator iterator = storedDevices.iterator();
        boolean flag = false;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            ConnectableDevice connectabledevice1 = (ConnectableDevice)iterator.next();
            Iterator iterator1 = connectabledevice.getServices().iterator();
label0:
            do
            {
                if (!iterator1.hasNext())
                {
                    break;
                }
                DeviceService deviceservice = (DeviceService)iterator1.next();
                ServiceConfig serviceconfig = deviceservice.getServiceConfig();
                Iterator iterator2 = connectabledevice1.getServices().iterator();
                ServiceConfig serviceconfig1;
                do
                {
                    if (!iterator2.hasNext())
                    {
                        continue label0;
                    }
                    serviceconfig1 = ((DeviceService)iterator2.next()).getServiceConfig();
                } while (!serviceconfig.getServiceUUID().equals(serviceconfig1.getServiceUUID()));
                storedDevices.remove(connectabledevice1);
                connectabledevice1.setIpAddress(connectabledevice.getIpAddress());
                connectabledevice1.setFriendlyName(connectabledevice.getFriendlyName());
                connectabledevice1.setModelName(connectabledevice.getModelName());
                connectabledevice1.setModelNumber(connectabledevice.getModelNumber());
                connectabledevice1.addService(deviceservice);
                flag = true;
            } while (true);
            if (flag)
            {
                storedDevices.add(connectabledevice1);
            }
        } while (true);
        store();
    }




/*
    static boolean access$202(DefaultConnectableDeviceStore defaultconnectabledevicestore, boolean flag)
    {
        defaultconnectabledevicestore.waitToWrite = flag;
        return flag;
    }

*/

}
