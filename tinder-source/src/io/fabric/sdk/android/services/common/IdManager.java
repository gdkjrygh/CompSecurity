// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.common;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.telephony.TelephonyManager;
import io.fabric.sdk.android.c;
import io.fabric.sdk.android.h;
import io.fabric.sdk.android.k;
import java.lang.reflect.Field;
import java.security.GeneralSecurityException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import org.json.JSONObject;

// Referenced classes of package io.fabric.sdk.android.services.common:
//            m, c, CommonUtils, k, 
//            b

public final class IdManager
{
    public static final class DeviceIdentifierType extends Enum
    {

        public static final DeviceIdentifierType a;
        public static final DeviceIdentifierType b;
        public static final DeviceIdentifierType c;
        public static final DeviceIdentifierType d;
        public static final DeviceIdentifierType e;
        public static final DeviceIdentifierType f;
        public static final DeviceIdentifierType g;
        private static final DeviceIdentifierType i[];
        public final int h;

        public static DeviceIdentifierType valueOf(String s)
        {
            return (DeviceIdentifierType)Enum.valueOf(io/fabric/sdk/android/services/common/IdManager$DeviceIdentifierType, s);
        }

        public static DeviceIdentifierType[] values()
        {
            return (DeviceIdentifierType[])i.clone();
        }

        static 
        {
            a = new DeviceIdentifierType("WIFI_MAC_ADDRESS", 0, 1);
            b = new DeviceIdentifierType("BLUETOOTH_MAC_ADDRESS", 1, 2);
            c = new DeviceIdentifierType("FONT_TOKEN", 2, 53);
            d = new DeviceIdentifierType("ANDROID_ID", 3, 100);
            e = new DeviceIdentifierType("ANDROID_DEVICE_ID", 4, 101);
            f = new DeviceIdentifierType("ANDROID_SERIAL", 5, 102);
            g = new DeviceIdentifierType("ANDROID_ADVERTISING_ID", 6, 103);
            i = (new DeviceIdentifierType[] {
                a, b, c, d, e, f, g
            });
        }

        private DeviceIdentifierType(String s, int i1, int j1)
        {
            super(s, i1);
            h = j1;
        }
    }


    private static final Pattern h = Pattern.compile("[^\\p{Alnum}]");
    private static final String i = Pattern.quote("/");
    public final boolean a;
    public final boolean b;
    public final Context c;
    public final String d;
    io.fabric.sdk.android.services.common.c e;
    b f;
    boolean g;
    private final ReentrantLock j = new ReentrantLock();
    private final m k = new m();
    private final String l;
    private final Collection m;

    public IdManager(Context context, String s, String s1, Collection collection)
    {
        if (context == null)
        {
            throw new IllegalArgumentException("appContext must not be null");
        }
        if (s == null)
        {
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
        if (collection == null)
        {
            throw new IllegalArgumentException("kits must not be null");
        }
        c = context;
        d = s;
        l = s1;
        m = collection;
        e = new io.fabric.sdk.android.services.common.c(context);
        a = CommonUtils.a(context, "com.crashlytics.CollectDeviceIdentifiers", true);
        if (!a)
        {
            io.fabric.sdk.android.c.a().a("Fabric", (new StringBuilder("Device ID collection disabled for ")).append(context.getPackageName()).toString());
        }
        b = CommonUtils.a(context, "com.crashlytics.CollectUserIdentifiers", true);
        if (!b)
        {
            io.fabric.sdk.android.c.a().a("Fabric", (new StringBuilder("User information collection disabled for ")).append(context.getPackageName()).toString());
        }
    }

    private static void a(Map map, DeviceIdentifierType deviceidentifiertype, String s)
    {
        if (s != null)
        {
            map.put(deviceidentifiertype, s);
        }
    }

    private void a(JSONObject jsonobject)
    {
        for (Iterator iterator = d().entrySet().iterator(); iterator.hasNext();)
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            try
            {
                jsonobject.put(((DeviceIdentifierType)entry.getKey()).name().toLowerCase(Locale.US), entry.getValue());
            }
            catch (Exception exception)
            {
                io.fabric.sdk.android.c.a().c("Fabric", (new StringBuilder("Could not write value to JSON: ")).append(((DeviceIdentifierType)entry.getKey()).name()).toString(), exception);
            }
        }

    }

    private boolean a(String s)
    {
        return c.checkCallingPermission(s) == 0;
    }

    public static String b()
    {
        return String.format(Locale.US, "%s/%s", new Object[] {
            c(android.os.Build.VERSION.RELEASE), c(android.os.Build.VERSION.INCREMENTAL)
        });
    }

    private static String b(String s)
    {
        if (s == null)
        {
            return null;
        } else
        {
            return h.matcher(s).replaceAll("").toLowerCase(Locale.US);
        }
    }

    public static String c()
    {
        return String.format(Locale.US, "%s/%s", new Object[] {
            c(Build.MANUFACTURER), c(Build.MODEL)
        });
    }

    private static String c(String s)
    {
        return s.replaceAll(i, "");
    }

    private String i()
    {
        if (!a || android.os.Build.VERSION.SDK_INT < 9)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        String s = b((String)android/os/Build.getField("SERIAL").get(null));
        return s;
        Exception exception;
        exception;
        io.fabric.sdk.android.c.a().c("Fabric", "Could not retrieve android.os.Build.SERIAL value", exception);
        return null;
    }

    public final String a()
    {
        String s1 = l;
        String s = s1;
        if (s1 == null)
        {
            SharedPreferences sharedpreferences = CommonUtils.a(c);
            String s2 = sharedpreferences.getString("crashlytics.installation.id", null);
            s = s2;
            if (s2 == null)
            {
                s = a(sharedpreferences);
            }
        }
        return s;
    }

    public final String a(SharedPreferences sharedpreferences)
    {
        j.lock();
        String s1 = sharedpreferences.getString("crashlytics.installation.id", null);
        String s;
        s = s1;
        if (s1 != null)
        {
            break MISSING_BLOCK_LABEL_55;
        }
        s = b(UUID.randomUUID().toString());
        sharedpreferences.edit().putString("crashlytics.installation.id", s).commit();
        j.unlock();
        return s;
        sharedpreferences;
        j.unlock();
        throw sharedpreferences;
    }

    public final String a(String s, String s1)
    {
        JSONObject jsonobject;
        try
        {
            s1 = s1.replaceAll("\\.", (new StringBuilder(new String(new char[] {
                's', 'l', 'c'
            }))).reverse().toString());
            s1 = io.fabric.sdk.android.services.common.CommonUtils.c(CommonUtils.a((new StringBuilder()).append(s).append(s1).toString()));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            io.fabric.sdk.android.c.a().c("Fabric", "Could not create cipher to encrypt headers.", s);
            return "";
        }
        jsonobject = new JSONObject();
        try
        {
            jsonobject.put("APPLICATION_INSTALLATION_UUID".toLowerCase(Locale.US), a());
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            io.fabric.sdk.android.c.a().c("Fabric", "Could not write application id to JSON", s);
        }
        a(jsonobject);
        try
        {
            jsonobject.put("os_version", b());
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            io.fabric.sdk.android.c.a().c("Fabric", "Could not write OS version to JSON", s);
        }
        try
        {
            jsonobject.put("model", c());
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            io.fabric.sdk.android.c.a().c("Fabric", "Could not write model to JSON", s);
        }
        s = "";
        if (jsonobject.length() > 0)
        {
            try
            {
                s = CommonUtils.a(s1.doFinal(jsonobject.toString().getBytes()));
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                io.fabric.sdk.android.c.a().c("Fabric", "Could not encrypt IDs", s);
                return "";
            }
        }
        return s;
    }

    public final Map d()
    {
        Object obj1;
        HashMap hashmap;
        DeviceIdentifierType deviceidentifiertype;
        obj1 = null;
        hashmap = new HashMap();
        Iterator iterator = m.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj2 = (h)iterator.next();
            if (obj2 instanceof io.fabric.sdk.android.services.common.k)
            {
                obj2 = ((io.fabric.sdk.android.services.common.k)obj2).d().entrySet().iterator();
                while (((Iterator) (obj2)).hasNext()) 
                {
                    java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (obj2)).next();
                    a(hashmap, (DeviceIdentifierType)entry.getKey(), (String)entry.getValue());
                }
            }
        } while (true);
        a(hashmap, DeviceIdentifierType.d, g());
        deviceidentifiertype = DeviceIdentifierType.e;
        if (!a || !a("android.permission.READ_PHONE_STATE")) goto _L2; else goto _L1
_L1:
        Object obj = (TelephonyManager)c.getSystemService("phone");
        if (obj == null) goto _L2; else goto _L3
_L3:
        obj = b(((TelephonyManager) (obj)).getDeviceId());
_L4:
        a(hashmap, deviceidentifiertype, ((String) (obj)));
        a(hashmap, DeviceIdentifierType.f, i());
        deviceidentifiertype = DeviceIdentifierType.a;
        if (!a || !a("android.permission.ACCESS_WIFI_STATE"))
        {
            break MISSING_BLOCK_LABEL_321;
        }
        obj = (WifiManager)c.getSystemService("wifi");
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_321;
        }
        obj = ((WifiManager) (obj)).getConnectionInfo();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_321;
        }
        obj = b(((WifiInfo) (obj)).getMacAddress());
_L5:
        a(hashmap, deviceidentifiertype, ((String) (obj)));
        a(hashmap, DeviceIdentifierType.b, h());
        deviceidentifiertype = DeviceIdentifierType.g;
        obj = obj1;
        if (a)
        {
            b b1 = f();
            obj = obj1;
            if (b1 != null)
            {
                obj = b1.a;
            }
        }
        a(hashmap, deviceidentifiertype, ((String) (obj)));
        return Collections.unmodifiableMap(hashmap);
_L2:
        obj = null;
          goto _L4
        obj = null;
          goto _L5
    }

    public final String e()
    {
        return k.a(c);
    }

    public final b f()
    {
        this;
        JVM INSTR monitorenter ;
        if (g) goto _L2; else goto _L1
_L1:
        b b1;
        io.fabric.sdk.android.services.common.c c1;
        c1 = e;
        b1 = new b(c1.a.a().getString("advertising_id", ""), c1.a.a().getBoolean("limit_ad_tracking_enabled", false));
        if (!io.fabric.sdk.android.services.common.c.b(b1))
        {
            break MISSING_BLOCK_LABEL_117;
        }
        io.fabric.sdk.android.c.a().a("Fabric", "Using AdvertisingInfo from Preference Store");
        (new Thread(new c._cls1(c1, b1))).start();
_L3:
        f = b1;
        g = true;
_L2:
        b1 = f;
        this;
        JVM INSTR monitorexit ;
        return b1;
        b1 = c1.a();
        c1.a(b1);
          goto _L3
        Exception exception;
        exception;
        throw exception;
    }

    public final String g()
    {
        Object obj = null;
        String s = obj;
        if (a)
        {
            String s1 = android.provider.Settings.Secure.getString(c.getContentResolver(), "android_id");
            s = obj;
            if (!"9774d56d682e549c".equals(s1))
            {
                s = b(s1);
            }
        }
        return s;
    }

    public final String h()
    {
        if (!a || !a("android.permission.BLUETOOTH"))
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
                io.fabric.sdk.android.c.a().c("Fabric", "Utils#getBluetoothMacAddress failed, returning null. Requires prior call to BluetoothAdatpter.getDefaultAdapter() on thread that has called Looper.prepare()", exception);
            }
        }
        return null;
    }

}
