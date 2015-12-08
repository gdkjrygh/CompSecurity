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
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Kit;
import io.fabric.sdk.android.Logger;
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
//            InstallerPackageNameProvider, CommonUtils, DeviceIdentifierProvider, AdvertisingInfoProvider, 
//            AdvertisingInfo

public class IdManager
{

    private static final Pattern a = Pattern.compile("[^\\p{Alnum}]");
    private static final String b = Pattern.quote("/");
    private final ReentrantLock c = new ReentrantLock();
    private final InstallerPackageNameProvider d = new InstallerPackageNameProvider();
    private final boolean e;
    private final boolean f;
    private final Context g;
    private final String h;
    private final String i;
    private final Collection j;

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
        g = context;
        h = s;
        i = s1;
        j = collection;
        e = CommonUtils.a(context, "com.crashlytics.CollectDeviceIdentifiers", true);
        if (!e)
        {
            Fabric.g().a("Fabric", (new StringBuilder()).append("Device ID collection disabled for ").append(context.getPackageName()).toString());
        }
        f = CommonUtils.a(context, "com.crashlytics.CollectUserIdentifiers", true);
        if (!f)
        {
            Fabric.g().a("Fabric", (new StringBuilder()).append("User information collection disabled for ").append(context.getPackageName()).toString());
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
            break MISSING_BLOCK_LABEL_54;
        }
        s = b(UUID.randomUUID().toString());
        sharedpreferences.edit().putString("crashlytics.installation.id", s).commit();
        c.unlock();
        return s;
        sharedpreferences;
        c.unlock();
        throw sharedpreferences;
    }

    private void a(Map map, DeviceIdentifierType deviceidentifiertype, String s)
    {
        if (s != null)
        {
            map.put(deviceidentifiertype, s);
        }
    }

    private void a(JSONObject jsonobject)
    {
        try
        {
            jsonobject.put("APPLICATION_INSTALLATION_UUID".toLowerCase(Locale.US), b());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            Fabric.g().d("Fabric", "Could not write application id to JSON", jsonobject);
        }
    }

    private boolean a(String s)
    {
        return g.checkCallingPermission(s) == 0;
    }

    private String b(String s)
    {
        if (s == null)
        {
            return null;
        } else
        {
            return a.matcher(s).replaceAll("").toLowerCase(Locale.US);
        }
    }

    private void b(JSONObject jsonobject)
    {
        for (Iterator iterator = g().entrySet().iterator(); iterator.hasNext();)
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            try
            {
                jsonobject.put(((DeviceIdentifierType)entry.getKey()).name().toLowerCase(Locale.US), entry.getValue());
            }
            catch (Exception exception)
            {
                Fabric.g().d("Fabric", (new StringBuilder()).append("Could not write value to JSON: ").append(((DeviceIdentifierType)entry.getKey()).name()).toString(), exception);
            }
        }

    }

    private String c(String s)
    {
        return s.replaceAll(b, "");
    }

    private void c(JSONObject jsonobject)
    {
        try
        {
            jsonobject.put("os_version", d());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            Fabric.g().d("Fabric", "Could not write OS version to JSON", jsonobject);
        }
    }

    private void d(JSONObject jsonobject)
    {
        try
        {
            jsonobject.put("model", e());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            Fabric.g().d("Fabric", "Could not write model to JSON", jsonobject);
        }
    }

    public String a(String s, String s1)
    {
        JSONObject jsonobject;
        try
        {
            s1 = s1.replaceAll("\\.", (new StringBuilder(new String(new char[] {
                's', 'l', 'c'
            }))).reverse().toString());
            s1 = CommonUtils.a(1, CommonUtils.a((new StringBuilder()).append(s).append(s1).toString()));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Fabric.g().d("Fabric", "Could not create cipher to encrypt headers.", s);
            return "";
        }
        jsonobject = new JSONObject();
        a(jsonobject);
        b(jsonobject);
        c(jsonobject);
        d(jsonobject);
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
                Fabric.g().d("Fabric", "Could not encrypt IDs", s);
                return "";
            }
        }
        return s;
    }

    public boolean a()
    {
        return f;
    }

    public String b()
    {
        String s1 = i;
        String s = s1;
        if (s1 == null)
        {
            SharedPreferences sharedpreferences = CommonUtils.a(g);
            String s2 = sharedpreferences.getString("crashlytics.installation.id", null);
            s = s2;
            if (s2 == null)
            {
                s = a(sharedpreferences);
            }
        }
        return s;
    }

    public String c()
    {
        return h;
    }

    public String d()
    {
        return String.format(Locale.US, "%s/%s", new Object[] {
            c(android.os.Build.VERSION.RELEASE), c(android.os.Build.VERSION.INCREMENTAL)
        });
    }

    public String e()
    {
        return String.format(Locale.US, "%s/%s", new Object[] {
            c(Build.MANUFACTURER), c(Build.MODEL)
        });
    }

    public String f()
    {
        String s = "";
        if (e)
        {
            String s1 = j();
            s = s1;
            if (s1 == null)
            {
                SharedPreferences sharedpreferences = CommonUtils.a(g);
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

    public Map g()
    {
        HashMap hashmap = new HashMap();
        Iterator iterator = j.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj = (Kit)iterator.next();
            if (obj instanceof DeviceIdentifierProvider)
            {
                obj = ((DeviceIdentifierProvider)obj).e().entrySet().iterator();
                while (((Iterator) (obj)).hasNext()) 
                {
                    java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (obj)).next();
                    a(hashmap, (DeviceIdentifierType)entry.getKey(), (String)entry.getValue());
                }
            }
        } while (true);
        a(hashmap, DeviceIdentifierType.d, j());
        a(hashmap, DeviceIdentifierType.e, k());
        a(hashmap, DeviceIdentifierType.f, n());
        a(hashmap, DeviceIdentifierType.a, l());
        a(hashmap, DeviceIdentifierType.b, m());
        a(hashmap, DeviceIdentifierType.g, i());
        return Collections.unmodifiableMap(hashmap);
    }

    public String h()
    {
        return d.a(g);
    }

    public String i()
    {
        Object obj = null;
        String s = obj;
        if (e)
        {
            AdvertisingInfo advertisinginfo = (new AdvertisingInfoProvider(g)).a();
            s = obj;
            if (advertisinginfo != null)
            {
                s = advertisinginfo.a;
            }
        }
        return s;
    }

    public String j()
    {
        Object obj = null;
        String s = obj;
        if (e)
        {
            String s1 = android.provider.Settings.Secure.getString(g.getContentResolver(), "android_id");
            s = obj;
            if (!"9774d56d682e549c".equals(s1))
            {
                s = b(s1);
            }
        }
        return s;
    }

    public String k()
    {
        if (e && a("android.permission.READ_PHONE_STATE"))
        {
            TelephonyManager telephonymanager = (TelephonyManager)g.getSystemService("phone");
            if (telephonymanager != null)
            {
                return b(telephonymanager.getDeviceId());
            }
        }
        return null;
    }

    public String l()
    {
        if (e && a("android.permission.ACCESS_WIFI_STATE"))
        {
            Object obj = (WifiManager)g.getSystemService("wifi");
            if (obj != null)
            {
                obj = ((WifiManager) (obj)).getConnectionInfo();
                if (obj != null)
                {
                    return b(((WifiInfo) (obj)).getMacAddress());
                }
            }
        }
        return null;
    }

    public String m()
    {
        if (!e || !a("android.permission.BLUETOOTH"))
        {
            break MISSING_BLOCK_LABEL_34;
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
                Fabric.g().d("Fabric", "Utils#getBluetoothMacAddress failed, returning null. Requires prior call to BluetoothAdatpter.getDefaultAdapter() on thread that has called Looper.prepare()", exception);
            }
        }
        return null;
    }

    public String n()
    {
        if (!e || android.os.Build.VERSION.SDK_INT < 9)
        {
            break MISSING_BLOCK_LABEL_53;
        }
        String s = b((String)android/os/Build.getField("SERIAL").get(null));
        return s;
        Exception exception;
        exception;
        Fabric.g().d("Fabric", "Could not retrieve android.os.Build.SERIAL value", exception);
        return null;
    }


    private class DeviceIdentifierType extends Enum
    {

        public static final DeviceIdentifierType a;
        public static final DeviceIdentifierType b;
        public static final DeviceIdentifierType c;
        public static final DeviceIdentifierType d;
        public static final DeviceIdentifierType e;
        public static final DeviceIdentifierType f;
        public static final DeviceIdentifierType g;
        private static final DeviceIdentifierType h[];
        public final int protobufIndex;

        public static DeviceIdentifierType valueOf(String s)
        {
            return (DeviceIdentifierType)Enum.valueOf(io/fabric/sdk/android/services/common/IdManager$DeviceIdentifierType, s);
        }

        public static DeviceIdentifierType[] values()
        {
            return (DeviceIdentifierType[])h.clone();
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
            h = (new DeviceIdentifierType[] {
                a, b, c, d, e, f, g
            });
        }

        private DeviceIdentifierType(String s, int i1, int j1)
        {
            super(s, i1);
            protobufIndex = j1;
        }
    }

}
