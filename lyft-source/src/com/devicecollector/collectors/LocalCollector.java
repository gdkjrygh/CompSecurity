// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.devicecollector.collectors;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.util.Log;
import com.devicecollector.DataCollection;
import com.devicecollector.util.HashUtils;
import com.devicecollector.util.JSONUtils;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.UUID;

// Referenced classes of package com.devicecollector.collectors:
//            CollectorEnum, SoftErrorCode

public class LocalCollector
{

    private DataCollection a;
    private Context b;

    public LocalCollector(Activity activity, DataCollection datacollection)
    {
        a = datacollection;
        b = activity.getApplicationContext();
    }

    private void a(String s)
    {
        android.content.SharedPreferences.Editor editor = b.getSharedPreferences("k_prefs", 0).edit();
        editor.putString("lic", s);
        editor.commit();
    }

    private String e()
    {
        String s = null;
        SharedPreferences sharedpreferences = b.getSharedPreferences("k_prefs", 0);
        if (sharedpreferences != null)
        {
            s = sharedpreferences.getString("lic", null);
        }
        return s;
    }

    private HashMap f()
    {
        HashMap hashmap = new HashMap();
        WifiInfo wifiinfo;
        try
        {
            wifiinfo = ((WifiManager)b.getSystemService("wifi")).getConnectionInfo();
        }
        catch (SecurityException securityexception)
        {
            Log.d("wifi_mac", "[LocalCollector]WIFI PERMISSION DENIED");
            return hashmap;
        }
        if (wifiinfo == null)
        {
            break MISSING_BLOCK_LABEL_55;
        }
        if (wifiinfo.getMacAddress() == null)
        {
            break MISSING_BLOCK_LABEL_55;
        }
        hashmap.put("wifi_mac", wifiinfo.getMacAddress().replace(":", ""));
        return hashmap;
        Log.d("wifi_mac", "[LocalCollector]WIFI not enabled, skipping");
        return hashmap;
    }

    private HashMap g()
    {
        HashMap hashmap;
        hashmap = new HashMap();
        if (android.os.Build.VERSION.SDK_INT <= 8)
        {
            break MISSING_BLOCK_LABEL_203;
        }
        Log.d("PROXY_PEIRCE", "[LocalCollector]Newer API...");
        Enumeration enumeration = NetworkInterface.getNetworkInterfaces();
_L4:
        NetworkInterface networkinterface;
        byte abyte0[];
        do
        {
            do
            {
                if (!enumeration.hasMoreElements())
                {
                    break MISSING_BLOCK_LABEL_203;
                }
                networkinterface = (NetworkInterface)enumeration.nextElement();
            } while (!networkinterface.isUp());
            Log.d("NETWORK", (new StringBuilder()).append("[LocalCollector]NETWORK:").append(networkinterface.getName()).append(":").append(networkinterface.isVirtual()).toString());
            abyte0 = networkinterface.getHardwareAddress();
        } while (abyte0 == null);
        StringBuffer stringbuffer;
        int j;
        stringbuffer = new StringBuffer();
        j = abyte0.length;
        int i = 0;
_L2:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        stringbuffer.append(String.format("%02X", new Object[] {
            Byte.valueOf(abyte0[i])
        }));
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        hashmap.put(networkinterface.getName(), stringbuffer.toString());
        if (true) goto _L4; else goto _L3
_L3:
        Object obj;
        obj;
        a.a(CollectorEnum.a, SoftErrorCode.d);
        Log.d("network_mac", "[LocalCollector]Bad socket connection, skipping");
        return hashmap;
        obj;
        a.a(CollectorEnum.a, SoftErrorCode.c);
        Log.d("network_mac", "[LocalCollector]Permission Denied, skipping");
        return hashmap;
    }

    public void a()
    {
        a.a(com.devicecollector.DataCollection.PostElement.j, "A");
        a.a(com.devicecollector.DataCollection.PostElement.i, "2.5");
        a.a(com.devicecollector.DataCollection.PostElement.k, Build.FINGERPRINT);
    }

    public void b()
    {
        a.a(com.devicecollector.DataCollection.PostElement.h, android.os.Build.VERSION.RELEASE);
    }

    public void c()
    {
        String s2 = e();
        HashMap hashmap = new HashMap();
        String s = android.provider.Settings.Secure.getString(b.getContentResolver(), "android_id");
        Log.d("LocalCollector", (new StringBuilder()).append("ANDROID_ID:").append(s).toString());
        hashmap.put(DeviceIDType.a.name(), HashUtils.a((new StringBuilder()).append(DeviceIDType.a.name()).append(s).toString()));
        if (android.os.Build.VERSION.SDK_INT > 8)
        {
            hashmap.put(DeviceIDType.b.name(), HashUtils.a((new StringBuilder()).append(DeviceIDType.b.name()).append(Build.SERIAL).toString()));
        }
        s = d();
        if (s != null)
        {
            hashmap.put(DeviceIDType.c.name(), HashUtils.a((new StringBuilder()).append(DeviceIDType.c.name()).append(s).toString()));
        }
        String s1 = null;
        s = s1;
        if (s2 != null)
        {
            s = s1;
            if (s2.contains(DeviceIDType.d.name()))
            {
                try
                {
                    int i = s2.indexOf(DeviceIDType.d.name()) + DeviceIDType.d.name().length() + 3;
                    s = s2.substring(i, s2.indexOf('"', i));
                }
                catch (IndexOutOfBoundsException indexoutofboundsexception)
                {
                    indexoutofboundsexception = s1;
                }
            }
        }
        s1 = s;
        if (s == null)
        {
            s1 = HashUtils.a((new StringBuilder()).append(DeviceIDType.d.name()).append(UUID.randomUUID().toString()).toString());
        }
        hashmap.put(DeviceIDType.d.name(), s1);
        if (hashmap.size() == 0)
        {
            a.a(CollectorEnum.c, SoftErrorCode.f);
            return;
        }
        s = JSONUtils.a(hashmap);
        a.a(com.devicecollector.DataCollection.PostElement.f, s);
        if (s2 != null && s2.length() > 0)
        {
            a.a(com.devicecollector.DataCollection.PostElement.e, s2);
        }
        a(s);
    }

    public String d()
    {
        HashMap hashmap = f();
        hashmap.putAll(g());
        Object obj = new TreeSet(hashmap.values());
        if (((SortedSet) (obj)).size() > 0)
        {
            StringBuilder stringbuilder = new StringBuilder("{");
            String s;
            for (obj = ((SortedSet) (obj)).iterator(); ((Iterator) (obj)).hasNext(); stringbuilder.append((new StringBuilder()).append(s).append(",").toString()))
            {
                s = (String)((Iterator) (obj)).next();
            }

            stringbuilder.append("}");
            return stringbuilder.toString();
        } else
        {
            return null;
        }
    }

    private class DeviceIDType extends Enum
    {

        public static final DeviceIDType a;
        public static final DeviceIDType b;
        public static final DeviceIDType c;
        public static final DeviceIDType d;
        private static final DeviceIDType e[];

        public static DeviceIDType valueOf(String s)
        {
            return (DeviceIDType)Enum.valueOf(com/devicecollector/collectors/LocalCollector$DeviceIDType, s);
        }

        public static DeviceIDType[] values()
        {
            return (DeviceIDType[])e.clone();
        }

        static 
        {
            a = new DeviceIDType("ANDROID_ID", 0);
            b = new DeviceIDType("ANDROID_SERIAL", 1);
            c = new DeviceIDType("MAC_HASH", 2);
            d = new DeviceIDType("UID", 3);
            e = (new DeviceIDType[] {
                a, b, c, d
            });
        }

        private DeviceIDType(String s, int i)
        {
            super(s, i);
        }
    }

}
