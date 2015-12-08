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
import b.a.a.a.f;
import b.a.a.a.o;
import b.a.a.a.q;
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
//            z, l, y, s, 
//            c, b

public final class x
{

    private static final Pattern a = Pattern.compile("[^\\p{Alnum}]");
    private static final String b = Pattern.quote("/");
    private final ReentrantLock c = new ReentrantLock();
    private final z d = new z();
    private final boolean e;
    private final boolean f;
    private final Context g;
    private final String h;
    private final String i;
    private final Collection j;

    public x(Context context, String s1, String s2, Collection collection)
    {
        if (context == null)
        {
            throw new IllegalArgumentException("appContext must not be null");
        }
        if (s1 == null)
        {
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
        if (collection == null)
        {
            throw new IllegalArgumentException("kits must not be null");
        }
        g = context;
        h = s1;
        i = s2;
        j = collection;
        e = l.a(context, "com.crashlytics.CollectDeviceIdentifiers", true);
        if (!e)
        {
            b.a.a.a.f.c().a("Fabric", (new StringBuilder("Device ID collection disabled for ")).append(context.getPackageName()).toString());
        }
        f = l.a(context, "com.crashlytics.CollectUserIdentifiers", true);
        if (!f)
        {
            b.a.a.a.f.c().a("Fabric", (new StringBuilder("User information collection disabled for ")).append(context.getPackageName()).toString());
        }
    }

    private String a(SharedPreferences sharedpreferences)
    {
        c.lock();
        String s2 = sharedpreferences.getString("crashlytics.installation.id", null);
        String s1;
        s1 = s2;
        if (s2 != null)
        {
            break MISSING_BLOCK_LABEL_53;
        }
        s1 = b(UUID.randomUUID().toString());
        sharedpreferences.edit().putString("crashlytics.installation.id", s1).commit();
        c.unlock();
        return s1;
        sharedpreferences;
        c.unlock();
        throw sharedpreferences;
    }

    private static void a(Map map, y y1, String s1)
    {
        if (s1 != null)
        {
            map.put(y1, s1);
        }
    }

    private void a(JSONObject jsonobject)
    {
        for (Iterator iterator = g().entrySet().iterator(); iterator.hasNext();)
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            try
            {
                jsonobject.put(((y)entry.getKey()).name().toLowerCase(Locale.US), entry.getValue());
            }
            catch (Exception exception)
            {
                b.a.a.a.f.c().c("Fabric", (new StringBuilder("Could not write value to JSON: ")).append(((y)entry.getKey()).name()).toString(), exception);
            }
        }

    }

    private boolean a(String s1)
    {
        return g.checkCallingPermission(s1) == 0;
    }

    private static String b(String s1)
    {
        if (s1 == null)
        {
            return null;
        } else
        {
            return a.matcher(s1).replaceAll("").toLowerCase(Locale.US);
        }
    }

    private static String c(String s1)
    {
        return s1.replaceAll(b, "");
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
        String s1 = obj;
        if (e)
        {
            String s2 = android.provider.Settings.Secure.getString(g.getContentResolver(), "android_id");
            s1 = obj;
            if (!"9774d56d682e549c".equals(s2))
            {
                s1 = b(s2);
            }
        }
        return s1;
    }

    private String k()
    {
        if (!e || android.os.Build.VERSION.SDK_INT < 9)
        {
            break MISSING_BLOCK_LABEL_52;
        }
        String s1 = b((String)android/os/Build.getField("SERIAL").get(null));
        return s1;
        Exception exception;
        exception;
        b.a.a.a.f.c().c("Fabric", "Could not retrieve android.os.Build.SERIAL value", exception);
        return null;
    }

    public final String a(String s1, String s2)
    {
        JSONObject jsonobject;
        try
        {
            s2 = s2.replaceAll("\\.", (new StringBuilder(new String(new char[] {
                's', 'l', 'c'
            }))).reverse().toString());
            s2 = l.c(l.a((new StringBuilder()).append(s1).append(s2).toString()));
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            b.a.a.a.f.c().c("Fabric", "Could not create cipher to encrypt headers.", s1);
            return "";
        }
        jsonobject = new JSONObject();
        try
        {
            jsonobject.put("APPLICATION_INSTALLATION_UUID".toLowerCase(Locale.US), b());
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            b.a.a.a.f.c().c("Fabric", "Could not write application id to JSON", s1);
        }
        a(jsonobject);
        try
        {
            jsonobject.put("os_version", d());
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            b.a.a.a.f.c().c("Fabric", "Could not write OS version to JSON", s1);
        }
        try
        {
            jsonobject.put("model", e());
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            b.a.a.a.f.c().c("Fabric", "Could not write model to JSON", s1);
        }
        s1 = "";
        if (jsonobject.length() > 0)
        {
            try
            {
                s1 = l.a(s2.doFinal(jsonobject.toString().getBytes()));
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                b.a.a.a.f.c().c("Fabric", "Could not encrypt IDs", s1);
                return "";
            }
        }
        return s1;
    }

    public final boolean a()
    {
        return f;
    }

    public final String b()
    {
        String s2 = i;
        String s1 = s2;
        if (s2 == null)
        {
            SharedPreferences sharedpreferences = l.a(g);
            String s3 = sharedpreferences.getString("crashlytics.installation.id", null);
            s1 = s3;
            if (s3 == null)
            {
                s1 = a(sharedpreferences);
            }
        }
        return s1;
    }

    public final String c()
    {
        return h;
    }

    public final String f()
    {
        String s1 = "";
        if (e)
        {
            String s2 = j();
            s1 = s2;
            if (s2 == null)
            {
                SharedPreferences sharedpreferences = l.a(g);
                String s3 = sharedpreferences.getString("crashlytics.installation.id", null);
                s1 = s3;
                if (s3 == null)
                {
                    s1 = a(sharedpreferences);
                }
            }
        }
        return s1;
    }

    public final Map g()
    {
        Object obj1;
        HashMap hashmap;
        y y1;
        obj1 = null;
        hashmap = new HashMap();
        Iterator iterator = j.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj2 = (o)iterator.next();
            if (obj2 instanceof s)
            {
                obj2 = ((s)obj2).b().entrySet().iterator();
                while (((Iterator) (obj2)).hasNext()) 
                {
                    java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (obj2)).next();
                    a(hashmap, (y)entry.getKey(), (String)entry.getValue());
                }
            }
        } while (true);
        a(hashmap, y.d, j());
        y1 = y.e;
        if (!e || !a("android.permission.READ_PHONE_STATE")) goto _L2; else goto _L1
_L1:
        Object obj = (TelephonyManager)g.getSystemService("phone");
        if (obj == null) goto _L2; else goto _L3
_L3:
        obj = b(((TelephonyManager) (obj)).getDeviceId());
_L4:
        a(hashmap, y1, ((String) (obj)));
        a(hashmap, b.a.a.a.a.b.y.f, k());
        y1 = y.a;
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
        a(hashmap, y1, ((String) (obj)));
        a(hashmap, y.b, i());
        y1 = y.g;
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
        a(hashmap, y1, ((String) (obj)));
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
                b.a.a.a.f.c().c("Fabric", "Utils#getBluetoothMacAddress failed, returning null. Requires prior call to BluetoothAdatpter.getDefaultAdapter() on thread that has called Looper.prepare()", exception);
            }
        }
        return null;
    }

}
