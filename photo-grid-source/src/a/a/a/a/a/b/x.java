// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a.a.a.a.b;

import a.a.a.a.f;
import a.a.a.a.p;
import a.a.a.a.s;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.telephony.TelephonyManager;
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

// Referenced classes of package a.a.a.a.a.b:
//            z, c, l, y, 
//            s, b

public final class x
{

    private static final Pattern d = Pattern.compile("[^\\p{Alnum}]");
    private static final String e = Pattern.quote("/");
    c a;
    b b;
    boolean c;
    private final ReentrantLock f = new ReentrantLock();
    private final z g = new z();
    private final boolean h;
    private final boolean i;
    private final Context j;
    private final String k;
    private final String l;
    private final Collection m;

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
        j = context;
        k = s1;
        l = s2;
        m = collection;
        a = new c(context);
        h = a.a.a.a.a.b.l.a(context, "com.crashlytics.CollectDeviceIdentifiers", true);
        if (!h)
        {
            a.a.a.a.f.d();
            (new StringBuilder("Device ID collection disabled for ")).append(context.getPackageName());
        }
        i = a.a.a.a.a.b.l.a(context, "com.crashlytics.CollectUserIdentifiers", true);
        if (!i)
        {
            a.a.a.a.f.d();
            (new StringBuilder("User information collection disabled for ")).append(context.getPackageName());
        }
    }

    private String a(SharedPreferences sharedpreferences)
    {
        f.lock();
        String s2 = sharedpreferences.getString("crashlytics.installation.id", null);
        String s1;
        s1 = s2;
        if (s2 != null)
        {
            break MISSING_BLOCK_LABEL_53;
        }
        s1 = b(UUID.randomUUID().toString());
        sharedpreferences.edit().putString("crashlytics.installation.id", s1).commit();
        f.unlock();
        return s1;
        sharedpreferences;
        f.unlock();
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
                a.a.a.a.f.d().b("Fabric", (new StringBuilder("Could not write value to JSON: ")).append(((y)entry.getKey()).name()).toString(), exception);
            }
        }

    }

    private boolean a(String s1)
    {
        return j.checkCallingPermission(s1) == 0;
    }

    private static String b(String s1)
    {
        if (s1 == null)
        {
            return null;
        } else
        {
            return d.matcher(s1).replaceAll("").toLowerCase(Locale.US);
        }
    }

    private static String c(String s1)
    {
        return s1.replaceAll(e, "");
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

    private b k()
    {
        this;
        JVM INSTR monitorenter ;
        b b1;
        if (!c)
        {
            b = a.a();
            c = true;
        }
        b1 = b;
        this;
        JVM INSTR monitorexit ;
        return b1;
        Exception exception;
        exception;
        throw exception;
    }

    private String l()
    {
        Object obj = null;
        String s1 = obj;
        if (h)
        {
            String s2 = android.provider.Settings.Secure.getString(j.getContentResolver(), "android_id");
            s1 = obj;
            if (!"9774d56d682e549c".equals(s2))
            {
                s1 = b(s2);
            }
        }
        return s1;
    }

    private String m()
    {
        if (!h || android.os.Build.VERSION.SDK_INT < 9)
        {
            break MISSING_BLOCK_LABEL_52;
        }
        String s1 = b((String)android/os/Build.getField("SERIAL").get(null));
        return s1;
        Exception exception;
        exception;
        a.a.a.a.f.d().b("Fabric", "Could not retrieve android.os.Build.SERIAL value", exception);
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
            s2 = a.a.a.a.a.b.l.c(a.a.a.a.a.b.l.a((new StringBuilder()).append(s1).append(s2).toString()));
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            a.a.a.a.f.d().b("Fabric", "Could not create cipher to encrypt headers.", s1);
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
            a.a.a.a.f.d().b("Fabric", "Could not write application id to JSON", s1);
        }
        a(jsonobject);
        try
        {
            jsonobject.put("os_version", d());
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            a.a.a.a.f.d().b("Fabric", "Could not write OS version to JSON", s1);
        }
        try
        {
            jsonobject.put("model", e());
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            a.a.a.a.f.d().b("Fabric", "Could not write model to JSON", s1);
        }
        s1 = "";
        if (jsonobject.length() > 0)
        {
            try
            {
                s1 = a.a.a.a.a.b.l.a(s2.doFinal(jsonobject.toString().getBytes()));
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                a.a.a.a.f.d().b("Fabric", "Could not encrypt IDs", s1);
                return "";
            }
        }
        return s1;
    }

    public final boolean a()
    {
        return i;
    }

    public final String b()
    {
        String s2 = l;
        String s1 = s2;
        if (s2 == null)
        {
            SharedPreferences sharedpreferences = a.a.a.a.a.b.l.a(j);
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
        return k;
    }

    public final String f()
    {
        String s1 = "";
        if (h)
        {
            String s2 = l();
            s1 = s2;
            if (s2 == null)
            {
                SharedPreferences sharedpreferences = a.a.a.a.a.b.l.a(j);
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
        Iterator iterator = m.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj2 = (p)iterator.next();
            if (obj2 instanceof a.a.a.a.a.b.s)
            {
                obj2 = ((a.a.a.a.a.b.s)obj2).e().entrySet().iterator();
                while (((Iterator) (obj2)).hasNext()) 
                {
                    java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (obj2)).next();
                    a(hashmap, (y)entry.getKey(), (String)entry.getValue());
                }
            }
        } while (true);
        a(hashmap, y.d, l());
        y1 = y.e;
        if (!h || !a("android.permission.READ_PHONE_STATE")) goto _L2; else goto _L1
_L1:
        Object obj = (TelephonyManager)j.getSystemService("phone");
        if (obj == null) goto _L2; else goto _L3
_L3:
        obj = b(((TelephonyManager) (obj)).getDeviceId());
_L4:
        a(hashmap, y1, ((String) (obj)));
        a(hashmap, a.a.a.a.a.b.y.f, m());
        y1 = y.a;
        if (!h || !a("android.permission.ACCESS_WIFI_STATE"))
        {
            break MISSING_BLOCK_LABEL_321;
        }
        obj = (WifiManager)j.getSystemService("wifi");
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
        a(hashmap, y1, ((String) (obj)));
        a(hashmap, y.b, j());
        y1 = y.g;
        obj = obj1;
        if (h)
        {
            b b1 = k();
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
        return g.a(j);
    }

    public final Boolean i()
    {
        Object obj = null;
        Boolean boolean1 = obj;
        if (h)
        {
            b b1 = k();
            boolean1 = obj;
            if (b1 != null)
            {
                boolean1 = Boolean.valueOf(b1.b);
            }
        }
        return boolean1;
    }

    public final String j()
    {
        if (!h || !a("android.permission.BLUETOOTH"))
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
                a.a.a.a.f.d().b("Fabric", "Utils#getBluetoothMacAddress failed, returning null. Requires prior call to BluetoothAdatpter.getDefaultAdapter() on thread that has called Looper.prepare()", exception);
            }
        }
        return null;
    }

}
