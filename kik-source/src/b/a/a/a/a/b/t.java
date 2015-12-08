// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a.a.a.a.b;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.telephony.TelephonyManager;
import b.a.a.a.d;
import b.a.a.a.l;
import b.a.a.a.o;
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

// Referenced classes of package b.a.a.a.a.b:
//            u, j, o, c, 
//            b

public final class t
{
    public static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        public static final a e;
        public static final a f;
        public static final a g;
        private static final a i[];
        public final int h;

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(b/a/a/a/a/b/t$a, s);
        }

        public static a[] values()
        {
            return (a[])i.clone();
        }

        static 
        {
            a = new a("WIFI_MAC_ADDRESS", 0, 1);
            b = new a("BLUETOOTH_MAC_ADDRESS", 1, 2);
            c = new a("FONT_TOKEN", 2, 53);
            d = new a("ANDROID_ID", 3, 100);
            e = new a("ANDROID_DEVICE_ID", 4, 101);
            f = new a("ANDROID_SERIAL", 5, 102);
            g = new a("ANDROID_ADVERTISING_ID", 6, 103);
            i = (new a[] {
                a, b, c, d, e, f, g
            });
        }

        private a(String s, int i1, int j1)
        {
            super(s, i1);
            h = j1;
        }
    }


    private static final Pattern a = Pattern.compile("[^\\p{Alnum}]");
    private static final String b = Pattern.quote("/");
    private final ReentrantLock c = new ReentrantLock();
    private final u d = new u();
    private final boolean e;
    private final boolean f;
    private final Context g;
    private final String h;
    private final String i;
    private final Collection j;

    public t(Context context, String s, String s1, Collection collection)
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
        e = b.a.a.a.a.b.j.a(context, "com.crashlytics.CollectDeviceIdentifiers", true);
        if (!e)
        {
            b.a.a.a.d.c();
            (new StringBuilder("Device ID collection disabled for ")).append(context.getPackageName());
        }
        f = b.a.a.a.a.b.j.a(context, "com.crashlytics.CollectUserIdentifiers", true);
        if (!f)
        {
            b.a.a.a.d.c();
            (new StringBuilder("User information collection disabled for ")).append(context.getPackageName());
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

    private static void a(Map map, a a1, String s)
    {
        if (s != null)
        {
            map.put(a1, s);
        }
    }

    private void a(JSONObject jsonobject)
    {
        for (Iterator iterator = g().entrySet().iterator(); iterator.hasNext();)
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            try
            {
                jsonobject.put(((a)entry.getKey()).name().toLowerCase(Locale.US), entry.getValue());
            }
            catch (Exception exception)
            {
                b.a.a.a.d.c().b("Fabric", (new StringBuilder("Could not write value to JSON: ")).append(((a)entry.getKey()).name()).toString(), exception);
            }
        }

    }

    private boolean a(String s)
    {
        return g.checkCallingPermission(s) == 0;
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

    public static String d()
    {
        return String.format(Locale.US, "%s/%s", new Object[] {
            c(android.os.Build.VERSION.RELEASE), c(android.os.Build.VERSION.INCREMENTAL)
        });
    }

    public static String e()
    {
        return String.format(Locale.US, "%s/%s", new Object[] {
            c(Build.MANUFACTURER), c(Build.MODEL)
        });
    }

    private String j()
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

    private String k()
    {
        if (!e || android.os.Build.VERSION.SDK_INT < 9)
        {
            break MISSING_BLOCK_LABEL_52;
        }
        String s = b((String)android/os/Build.getField("SERIAL").get(null));
        return s;
        Exception exception;
        exception;
        b.a.a.a.d.c().b("Fabric", "Could not retrieve android.os.Build.SERIAL value", exception);
        return null;
    }

    public final String a(String s, String s1)
    {
        JSONObject jsonobject;
        try
        {
            s1 = s1.replaceAll("\\.", (new StringBuilder(new String(new char[] {
                's', 'l', 'c'
            }))).reverse().toString());
            s1 = b.a.a.a.a.b.j.c(b.a.a.a.a.b.j.a((new StringBuilder()).append(s).append(s1).toString()));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            b.a.a.a.d.c().b("Fabric", "Could not create cipher to encrypt headers.", s);
            return "";
        }
        jsonobject = new JSONObject();
        try
        {
            jsonobject.put("APPLICATION_INSTALLATION_UUID".toLowerCase(Locale.US), b());
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            b.a.a.a.d.c().b("Fabric", "Could not write application id to JSON", s);
        }
        a(jsonobject);
        try
        {
            jsonobject.put("os_version", d());
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            b.a.a.a.d.c().b("Fabric", "Could not write OS version to JSON", s);
        }
        try
        {
            jsonobject.put("model", e());
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            b.a.a.a.d.c().b("Fabric", "Could not write model to JSON", s);
        }
        s = "";
        if (jsonobject.length() > 0)
        {
            try
            {
                s = b.a.a.a.a.b.j.a(s1.doFinal(jsonobject.toString().getBytes()));
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                b.a.a.a.d.c().b("Fabric", "Could not encrypt IDs", s);
                return "";
            }
        }
        return s;
    }

    public final boolean a()
    {
        return f;
    }

    public final String b()
    {
        String s1 = i;
        String s = s1;
        if (s1 == null)
        {
            SharedPreferences sharedpreferences = b.a.a.a.a.b.j.a(g);
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
        return h;
    }

    public final String f()
    {
        String s = "";
        if (e)
        {
            String s1 = j();
            s = s1;
            if (s1 == null)
            {
                SharedPreferences sharedpreferences = b.a.a.a.a.b.j.a(g);
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

    public final Map g()
    {
        Object obj1;
        HashMap hashmap;
        a a1;
        obj1 = null;
        hashmap = new HashMap();
        Iterator iterator = j.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj2 = (l)iterator.next();
            if (obj2 instanceof b.a.a.a.a.b.o)
            {
                obj2 = ((b.a.a.a.a.b.o)obj2).c().entrySet().iterator();
                while (((Iterator) (obj2)).hasNext()) 
                {
                    java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (obj2)).next();
                    a(hashmap, (a)entry.getKey(), (String)entry.getValue());
                }
            }
        } while (true);
        a(hashmap, b.a.a.a.a.b.a.d, j());
        a1 = a.e;
        if (!e || !a("android.permission.READ_PHONE_STATE")) goto _L2; else goto _L1
_L1:
        Object obj = (TelephonyManager)g.getSystemService("phone");
        if (obj == null) goto _L2; else goto _L3
_L3:
        obj = b(((TelephonyManager) (obj)).getDeviceId());
_L4:
        a(hashmap, a1, ((String) (obj)));
        a(hashmap, a.f, k());
        a1 = a.a;
        if (!e || !a("android.permission.ACCESS_WIFI_STATE"))
        {
            break MISSING_BLOCK_LABEL_331;
        }
        obj = (WifiManager)g.getSystemService("wifi");
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_331;
        }
        obj = ((WifiManager) (obj)).getConnectionInfo();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_331;
        }
        obj = b(((WifiInfo) (obj)).getMacAddress());
_L5:
        a(hashmap, a1, ((String) (obj)));
        a(hashmap, a.b, i());
        a1 = a.g;
        obj = obj1;
        if (e)
        {
            b b1 = (new c(g)).a();
            obj = obj1;
            if (b1 != null)
            {
                obj = b1.a;
            }
        }
        a(hashmap, a1, ((String) (obj)));
        return Collections.unmodifiableMap(hashmap);
_L2:
        obj = null;
          goto _L4
        obj = null;
          goto _L5
    }

    public final String h()
    {
        return d.a(g);
    }

    public final String i()
    {
        if (!e || !a("android.permission.BLUETOOTH"))
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
                b.a.a.a.d.c().b("Fabric", "Utils#getBluetoothMacAddress failed, returning null. Requires prior call to BluetoothAdatpter.getDefaultAdapter() on thread that has called Looper.prepare()", exception);
            }
        }
        return null;
    }

}
