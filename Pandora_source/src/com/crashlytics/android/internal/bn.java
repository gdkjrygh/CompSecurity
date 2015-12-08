// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.internal;

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
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.crashlytics.android.internal:
//            ba, cm, cj, bo

public final class bn
{

    private static final Pattern a = Pattern.compile("[^\\p{Alnum}]");
    private static final String b = Pattern.quote("/");
    private final ReentrantLock c = new ReentrantLock();
    private final boolean d;
    private final boolean e;
    private final Context f;

    public bn(Context context)
    {
        if (context == null)
        {
            throw new IllegalArgumentException("appContext must not be null");
        }
        f = context;
        d = ba.a(context, "com.crashlytics.CollectDeviceIdentifiers", true);
        if (!d)
        {
            cm.a().b().a("Crashlytics", (new StringBuilder("Device ID collection disabled for ")).append(context.getPackageName()).toString());
        }
        e = ba.a(context, "com.crashlytics.CollectUserIdentifiers", true);
        if (!e)
        {
            cm.a().b().a("Crashlytics", (new StringBuilder("User information collection disabled for ")).append(context.getPackageName()).toString());
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

    private static void a(Map map, bo bo1, String s)
    {
        if (s != null)
        {
            map.put(bo1, s);
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
            return a.matcher(s).replaceAll("").toLowerCase(Locale.US);
        }
    }

    private static String c(String s)
    {
        return s.replaceAll(b, "");
    }

    private String i()
    {
        if (!d || android.os.Build.VERSION.SDK_INT < 9)
        {
            break MISSING_BLOCK_LABEL_52;
        }
        String s = b((String)android/os/Build.getField("SERIAL").get(null));
        return s;
        Exception exception;
        exception;
        cm.a().b().a("Crashlytics", "Could not retrieve android.os.Build.SERIAL value", exception);
        return null;
    }

    public final boolean a()
    {
        return e;
    }

    public final String b()
    {
        String s1 = cm.a().j();
        String s = s1;
        if (s1 == null)
        {
            SharedPreferences sharedpreferences = ba.a();
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
        return String.format(Locale.US, "%s/%s", new Object[] {
            c(android.os.Build.VERSION.RELEASE), c(android.os.Build.VERSION.INCREMENTAL)
        });
    }

    public final String d()
    {
        return String.format(Locale.US, "%s/%s", new Object[] {
            c(Build.MANUFACTURER), c(Build.MODEL)
        });
    }

    public final String e()
    {
        String s = "";
        if (d)
        {
            String s1 = g();
            s = s1;
            if (s1 == null)
            {
                SharedPreferences sharedpreferences = ba.a();
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
        bo bo1;
        obj1 = null;
        hashmap = new HashMap();
        a(hashmap, bo.c, g());
        bo1 = bo.d;
        if (!d || !a("android.permission.READ_PHONE_STATE")) goto _L2; else goto _L1
_L1:
        Object obj = (TelephonyManager)f.getSystemService("phone");
        if (obj == null) goto _L2; else goto _L3
_L3:
        obj = b(((TelephonyManager) (obj)).getDeviceId());
_L5:
        a(hashmap, bo1, ((String) (obj)));
        a(hashmap, bo.e, i());
        bo1 = bo.a;
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
        a(hashmap, bo1, ((String) (obj)));
        a(hashmap, bo.b, h());
        return Collections.unmodifiableMap(hashmap);
_L2:
        obj = null;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public final String g()
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

    public final String h()
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
                cm.a().b().a("Crashlytics", "Utils#getBluetoothMacAddress failed, returning null. Requires prior call to BluetoothAdatpter.getDefaultAdapter() on thread that has called Looper.prepare()", exception);
            }
        }
        return null;
    }

}
