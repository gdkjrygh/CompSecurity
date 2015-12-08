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
import b.a.a.a.a.f.c;
import b.a.a.a.d;
import b.a.a.a.l;
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
//            u, c, j, o, 
//            b, d

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


    private static final Pattern h = Pattern.compile("[^\\p{Alnum}]");
    private static final String i = Pattern.quote("/");
    public final boolean a;
    public final boolean b;
    public final Context c;
    public final String d;
    b.a.a.a.a.b.c e;
    b f;
    boolean g;
    private final ReentrantLock j = new ReentrantLock();
    private final u k = new u();
    private final String l;
    private final Collection m;

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
        c = context;
        d = s;
        l = s1;
        m = collection;
        e = new b.a.a.a.a.b.c(context);
        a = b.a.a.a.a.b.j.a(context, "com.crashlytics.CollectDeviceIdentifiers", true);
        if (!a)
        {
            b.a.a.a.d.a();
            (new StringBuilder("Device ID collection disabled for ")).append(context.getPackageName());
        }
        b = b.a.a.a.a.b.j.a(context, "com.crashlytics.CollectUserIdentifiers", true);
        if (!b)
        {
            b.a.a.a.d.a();
            (new StringBuilder("User information collection disabled for ")).append(context.getPackageName());
        }
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
        for (Iterator iterator = d().entrySet().iterator(); iterator.hasNext();)
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            try
            {
                jsonobject.put(((a)entry.getKey()).name().toLowerCase(Locale.US), entry.getValue());
            }
            catch (Exception exception)
            {
                b.a.a.a.d.a();
                (new StringBuilder("Could not write value to JSON: ")).append(((a)entry.getKey()).name());
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
            break MISSING_BLOCK_LABEL_40;
        }
        String s = b((String)android/os/Build.getField("SERIAL").get(null));
        return s;
        Exception exception;
        exception;
        b.a.a.a.d.a();
        return null;
    }

    public final String a()
    {
        String s1 = l;
        String s = s1;
        if (s1 == null)
        {
            SharedPreferences sharedpreferences = b.a.a.a.a.b.j.a(c);
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
            s1 = b.a.a.a.a.b.j.c(b.a.a.a.a.b.j.a((new StringBuilder()).append(s).append(s1).toString()));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            b.a.a.a.d.a();
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
            b.a.a.a.d.a();
        }
        a(jsonobject);
        try
        {
            jsonobject.put("os_version", b());
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            b.a.a.a.d.a();
        }
        try
        {
            jsonobject.put("model", c());
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            b.a.a.a.d.a();
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
                b.a.a.a.d.a();
                return "";
            }
        }
        return s;
    }

    public final Map d()
    {
        Object obj1;
        HashMap hashmap;
        a a1;
        obj1 = null;
        hashmap = new HashMap();
        Iterator iterator = m.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj2 = (l)iterator.next();
            if (obj2 instanceof o)
            {
                obj2 = ((o)obj2).c().entrySet().iterator();
                while (((Iterator) (obj2)).hasNext()) 
                {
                    java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (obj2)).next();
                    a(hashmap, (a)entry.getKey(), (String)entry.getValue());
                }
            }
        } while (true);
        a(hashmap, b.a.a.a.a.b.a.d, g());
        a1 = a.e;
        if (!a || !a("android.permission.READ_PHONE_STATE")) goto _L2; else goto _L1
_L1:
        Object obj = (TelephonyManager)c.getSystemService("phone");
        if (obj == null) goto _L2; else goto _L3
_L3:
        obj = b(((TelephonyManager) (obj)).getDeviceId());
_L4:
        a(hashmap, a1, ((String) (obj)));
        a(hashmap, a.f, i());
        a1 = a.a;
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
        a(hashmap, a1, ((String) (obj)));
        a(hashmap, a.b, h());
        a1 = a.g;
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
        a(hashmap, a1, ((String) (obj)));
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
        b.a.a.a.a.b.c c1;
        c1 = e;
        b1 = new b(c1.a.a().getString("advertising_id", ""), c1.a.a().getBoolean("limit_ad_tracking_enabled", false));
        if (!b.a.a.a.a.b.c.b(b1))
        {
            break MISSING_BLOCK_LABEL_108;
        }
        b.a.a.a.d.a();
        (new Thread(new b.a.a.a.a.b.d(c1, b1))).start();
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
                b.a.a.a.d.a();
            }
        }
        return null;
    }

}
