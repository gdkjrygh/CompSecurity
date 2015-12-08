// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.telephony.TelephonyManager;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.crashlytics.android:
//            aB, Crashlytics

final class IdManager
{

    private static final Pattern a = Pattern.compile("[^\\p{Alnum}]");
    private static final String b = Pattern.quote("/");
    private final ReentrantLock c = new ReentrantLock();
    private final boolean d;
    private final boolean e;
    private final Context f;

    public IdManager(Context context)
    {
        if (context == null)
        {
            throw new IllegalArgumentException("appContext must not be null");
        }
        f = context;
        d = aB.a(context, "com.crashlytics.CollectDeviceIdentifiers", true);
        if (!d)
        {
            aB.c((new StringBuilder("Device ID collection disabled for ")).append(Crashlytics.e()).toString());
        }
        e = aB.a(context, "com.crashlytics.CollectUserIdentifiers", true);
        if (!e)
        {
            aB.c((new StringBuilder("User information collection disabled for ")).append(Crashlytics.e()).toString());
        }
    }

    private String a(SharedPreferences sharedpreferences)
    {
        c.lock();
        String s1 = sharedpreferences.getString("crashlytics.installation.id", null);
        String s;
        s = s1;
        if (s1 != null)
        {
            break MISSING_BLOCK_LABEL_53;
        }
        s = b(UUID.randomUUID().toString());
        sharedpreferences.edit().putString("crashlytics.installation.id", s).commit();
        c.unlock();
        return s;
        sharedpreferences;
        c.unlock();
        throw sharedpreferences;
    }

    private static void a(Map map, DeviceIdentifierType deviceidentifiertype, String s)
    {
        if (s != null)
        {
            map.put(deviceidentifiertype, s);
        }
    }

    private boolean a(String s)
    {
        return f.checkCallingPermission(s) == 0;
    }

    private static String b(String s)
    {
        if (s == null)
        {
            return null;
        } else
        {
            return a.matcher(s).replaceAll("").toLowerCase();
        }
    }

    private static String c(String s)
    {
        return s.replaceAll(b, "");
    }

    private String h()
    {
        Object obj = null;
        String s = obj;
        if (d)
        {
            String s1 = android.provider.Settings.Secure.getString(f.getContentResolver(), "android_id");
            s = obj;
            if (!"9774d56d682e549c".equals(s1))
            {
                s = b(s1);
            }
        }
        return s;
    }

    private String i()
    {
        if (!d || android.os.Build.VERSION.SDK_INT < 9)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        String s = b((String)android/os/Build.getField("SERIAL").get(null));
        return s;
        Exception exception;
        exception;
        aB.a("Could not retrieve android.os.Build.SERIAL value", exception);
        return null;
    }

    public final boolean a()
    {
        return e;
    }

    public final String b()
    {
        String s1 = Crashlytics.getInstance().a;
        String s = s1;
        if (s1 == null)
        {
            SharedPreferences sharedpreferences = aB.a();
            String s2 = sharedpreferences.getString("crashlytics.installation.id", null);
            s = s2;
            if (s2 == null)
            {
                s = a(sharedpreferences);
            }
        }
        return s;
    }

    public final String c()
    {
        return String.format("%s/%s", new Object[] {
            c(android.os.Build.VERSION.RELEASE), c(android.os.Build.VERSION.INCREMENTAL)
        });
    }

    public final String d()
    {
        return String.format("%s/%s", new Object[] {
            c(Build.MANUFACTURER), c(Build.MODEL)
        });
    }

    public final String e()
    {
        String s = "";
        if (d)
        {
            String s1 = h();
            s = s1;
            if (s1 == null)
            {
                SharedPreferences sharedpreferences = aB.a();
                String s2 = sharedpreferences.getString("crashlytics.installation.id", null);
                s = s2;
                if (s2 == null)
                {
                    s = a(sharedpreferences);
                }
            }
        }
        return s;
    }

    public final Map f()
    {
        Object obj1;
        HashMap hashmap;
        DeviceIdentifierType deviceidentifiertype;
        obj1 = null;
        hashmap = new HashMap();
        a(hashmap, DeviceIdentifierType.ANDROID_ID, h());
        deviceidentifiertype = DeviceIdentifierType.ANDROID_DEVICE_ID;
        if (!d || !a("android.permission.READ_PHONE_STATE")) goto _L2; else goto _L1
_L1:
        Object obj = (TelephonyManager)f.getSystemService("phone");
        if (obj == null) goto _L2; else goto _L3
_L3:
        obj = b(((TelephonyManager) (obj)).getDeviceId());
_L5:
        a(hashmap, deviceidentifiertype, ((String) (obj)));
        a(hashmap, DeviceIdentifierType.ANDROID_SERIAL, i());
        deviceidentifiertype = DeviceIdentifierType.WIFI_MAC_ADDRESS;
        obj = obj1;
        if (d)
        {
            obj = obj1;
            if (a("android.permission.ACCESS_WIFI_STATE"))
            {
                Object obj2 = (WifiManager)f.getSystemService("wifi");
                obj = obj1;
                if (obj2 != null)
                {
                    obj2 = ((WifiManager) (obj2)).getConnectionInfo();
                    obj = obj1;
                    if (obj2 != null)
                    {
                        obj = b(((WifiInfo) (obj2)).getMacAddress());
                    }
                }
            }
        }
        a(hashmap, deviceidentifiertype, ((String) (obj)));
        a(hashmap, DeviceIdentifierType.BLUETOOTH_MAC_ADDRESS, g());
        return Collections.unmodifiableMap(hashmap);
_L2:
        obj = null;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public final String g()
    {
        if (!d || !a("android.permission.BLUETOOTH"))
        {
            break MISSING_BLOCK_LABEL_33;
        }
        BluetoothAdapter bluetoothadapter = BluetoothAdapter.getDefaultAdapter();
        if (bluetoothadapter != null)
        {
            try
            {
                b(bluetoothadapter.getAddress());
            }
            catch (Exception exception)
            {
                aB.a("Utils#getBluetoothMacAddress failed, returning null. Requires prior call to BluetoothAdatpter.getDefaultAdapter() on thread that has called Looper.prepare()", exception);
            }
        }
        return null;
    }


    private class DeviceIdentifierType extends Enum
    {

        public static final DeviceIdentifierType ANDROID_DEVICE_ID;
        public static final DeviceIdentifierType ANDROID_ID;
        public static final DeviceIdentifierType ANDROID_SERIAL;
        public static final DeviceIdentifierType BLUETOOTH_MAC_ADDRESS;
        public static final DeviceIdentifierType WIFI_MAC_ADDRESS;
        private static final DeviceIdentifierType a[];
        public final int protobufIndex;

        public static DeviceIdentifierType valueOf(String s)
        {
            return (DeviceIdentifierType)Enum.valueOf(com/crashlytics/android/IdManager$DeviceIdentifierType, s);
        }

        public static DeviceIdentifierType[] values()
        {
            return (DeviceIdentifierType[])a.clone();
        }

        static 
        {
            WIFI_MAC_ADDRESS = new DeviceIdentifierType("WIFI_MAC_ADDRESS", 0, 1);
            BLUETOOTH_MAC_ADDRESS = new DeviceIdentifierType("BLUETOOTH_MAC_ADDRESS", 1, 2);
            ANDROID_ID = new DeviceIdentifierType("ANDROID_ID", 2, 100);
            ANDROID_DEVICE_ID = new DeviceIdentifierType("ANDROID_DEVICE_ID", 3, 101);
            ANDROID_SERIAL = new DeviceIdentifierType("ANDROID_SERIAL", 4, 102);
            a = (new DeviceIdentifierType[] {
                WIFI_MAC_ADDRESS, BLUETOOTH_MAC_ADDRESS, ANDROID_ID, ANDROID_DEVICE_ID, ANDROID_SERIAL
            });
        }

        private DeviceIdentifierType(String s, int j, int k)
        {
            super(s, j);
            protobufIndex = k;
        }
    }

}
