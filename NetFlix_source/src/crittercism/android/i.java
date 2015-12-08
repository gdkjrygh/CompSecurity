// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Debug;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.crittercism.app.CrittercismConfig;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package crittercism.android:
//            k, f, l, ad, 
//            ah, m

public class i
{
    static final class a
        implements Callable
    {

        private static boolean d = false;
        private static Object f;
        private StringBuilder a;
        private StringBuilder b;
        private String c[];
        private Process e;
        private b g;
        private b h;

        public static boolean a()
        {
            return d;
        }

        public static void b()
        {
            d = true;
        }

        private StringBuilder d()
        {
            g = null;
            h = null;
            if (d)
            {
                break MISSING_BLOCK_LABEL_208;
            }
            e = Runtime.getRuntime().exec(c);
            g = new b(e.getInputStream());
            h = new b(e.getErrorStream());
            g.start();
            h.start();
            e.waitFor();
            if (g != null)
            {
                a = g.a();
                (new StringBuilder("this.inputStreamStringBuilder.toString() = ")).append(a.toString());
            }
            if (h != null)
            {
                b = h.a();
                (new StringBuilder("this.errorStreamStringBuilder.toString() = ")).append(b.toString());
            }
            Exception exception;
            if (e != null)
            {
                try
                {
                    e.getInputStream().close();
                    e.getErrorStream().close();
                    e.getOutputStream().close();
                    e.destroy();
                }
                catch (Exception exception1) { }
            }
            return a;
            exception;
            d = true;
            if (g != null)
            {
                a = g.a();
                (new StringBuilder("this.inputStreamStringBuilder.toString() = ")).append(a.toString());
            }
            if (h != null)
            {
                b = h.a();
                (new StringBuilder("this.errorStreamStringBuilder.toString() = ")).append(b.toString());
            }
            if (e == null)
            {
                continue; /* Loop/switch isn't completed */
            }
            e.getInputStream().close();
            e.getErrorStream().close();
            e.getOutputStream().close();
            e.destroy();
            if (true) goto _L2; else goto _L1
_L1:
            break MISSING_BLOCK_LABEL_340;
_L2:
            break MISSING_BLOCK_LABEL_208;
            Exception exception2;
            exception2;
            if (g != null)
            {
                a = g.a();
                (new StringBuilder("this.inputStreamStringBuilder.toString() = ")).append(a.toString());
            }
            if (h != null)
            {
                b = h.a();
                (new StringBuilder("this.errorStreamStringBuilder.toString() = ")).append(b.toString());
            }
            if (e != null)
            {
                try
                {
                    e.getInputStream().close();
                    e.getErrorStream().close();
                    e.getOutputStream().close();
                    e.destroy();
                }
                catch (Exception exception3) { }
            }
            throw exception2;
        }

        public final void c()
        {
            Exception exception1;
            synchronized (f)
            {
                try
                {
                    g.b();
                    h.b();
                    if (e != null)
                    {
                        e.getInputStream().close();
                        e.getErrorStream().close();
                        e.getOutputStream().close();
                    }
                }
                // Misplaced declaration of an exception variable
                catch (Exception exception1) { }
                try
                {
                    if (e != null)
                    {
                        e.destroy();
                    }
                }
                // Misplaced declaration of an exception variable
                catch (Exception exception1) { }
            }
        }

        public final Object call()
        {
            return d();
        }


        public a(Object obj)
        {
            a = new StringBuilder();
            b = new StringBuilder();
            e = null;
            f = obj;
            if (android.os.Build.VERSION.SDK_INT >= 8)
            {
                c = new String[5];
                c[0] = "logcat";
                c[1] = "-t";
                c[2] = "100";
                c[3] = "-v";
                c[4] = "time";
                return;
            } else
            {
                c = new String[4];
                c[0] = "logcat";
                c[1] = "-d";
                c[2] = "-v";
                c[3] = "time";
                return;
            }
        }
    }

    static final class b extends Thread
    {

        private InputStream a;
        private StringBuilder b;
        private BufferedReader c;

        public final StringBuilder a()
        {
            return b;
        }

        public final void b()
        {
            if (c == null)
            {
                break MISSING_BLOCK_LABEL_14;
            }
            c.close();
            return;
            Exception exception;
            exception;
            c = null;
            return;
        }

        public final void run()
        {
            new String();
            c = new BufferedReader(new InputStreamReader(a));
_L1:
            String s1;
            try
            {
                s1 = c.readLine();
            }
            catch (Exception exception)
            {
                Exception exception1;
                try
                {
                    c.close();
                    return;
                }
                catch (Exception exception2)
                {
                    (new StringBuilder("CrittercismAPI.StreamThread$makeLogcatJsonArray: ERROR closing bufferedReader!!! ")).append(exception2.getClass().getName());
                }
                break MISSING_BLOCK_LABEL_124;
            }
            finally
            {
                try
                {
                    c.close();
                }
                catch (Exception exception4)
                {
                    (new StringBuilder("CrittercismAPI.StreamThread$makeLogcatJsonArray: ERROR closing bufferedReader!!! ")).append(exception4.getClass().getName());
                }
                throw exception3;
            }
            if (s1 == null)
            {
                break MISSING_BLOCK_LABEL_73;
            }
            b.append(s1);
            b.append("\n");
              goto _L1
            try
            {
                c.close();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Exception exception1)
            {
                (new StringBuilder("CrittercismAPI.StreamThread$makeLogcatJsonArray: ERROR closing bufferedReader!!! ")).append(exception1.getClass().getName());
            }
            return;
        }

        public b(InputStream inputstream)
        {
            b = new StringBuilder();
            c = null;
            a = inputstream;
        }
    }


    m a;
    final String b = "critter_did";
    final int c = 100;
    private final String d = "3.1.4";
    private k e;
    private Context f;
    private String g;
    private String h;
    private String i;
    private f j;
    private int k;
    private boolean l;
    private String m;
    private JSONObject n;
    private Object o;
    private String p;

    public i(Context context, String s1, String s2, m m1)
    {
        e = null;
        f = null;
        g = "";
        h = "";
        i = "";
        k = -1;
        l = false;
        m = "";
        n = new JSONObject();
        o = new Object();
        p = "en";
        f = context;
        e = new k("3.1.4", f);
        g = s1;
        h = null;
        i = s2;
        j = new f(context, m1);
        a = m1;
        try
        {
            context = context.getResources().getConfiguration().locale.getLanguage();
            if (p != null && !p.equals(""))
            {
                p = context;
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            (new StringBuilder("Exception in getLocale(): ")).append(context.getClass().getName());
        }
    }

    private static String a(String s1)
    {
        String s2 = s1;
        if (s1 != null)
        {
            s2 = s1;
            if (!s1.equals(""))
            {
                try
                {
                    s2 = new String((new BigInteger(1, MessageDigest.getInstance("SHA-256").digest(s1.getBytes()))).toString(16));
                }
                // Misplaced declaration of an exception variable
                catch (String s1)
                {
                    s2 = null;
                }
            }
        }
        if (s2.equals(""))
        {
            return null;
        } else
        {
            return s2;
        }
    }

    private int b(String s1)
    {
        int i1;
        try
        {
            i1 = f.getPackageManager().checkPermission(s1, f.getPackageName());
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            return -1;
        }
        return i1;
    }

    private String l()
    {
        Object obj;
        obj = android.provider.Settings.Secure.getString(f.getContentResolver(), "android_id");
        if (obj == null || ((String) (obj)).equals("") || "9774d56d682e549c".equals(obj))
        {
            break MISSING_BLOCK_LABEL_142;
        }
        obj = UUID.nameUUIDFromBytes(((String) (obj)).getBytes("utf8"));
        if (obj == null) goto _L2; else goto _L1
_L1:
        Object obj1 = ((UUID) (obj)).toString();
_L3:
        obj = obj1;
        if (obj1 != null)
        {
            obj = obj1;
            if (((String) (obj1)).equals(""))
            {
                obj = null;
            }
        }
_L4:
        obj1 = obj;
        if (obj == null)
        {
            obj1 = obj;
            if (f.getPackageManager().checkPermission("android.permission.READ_PHONE_STATE", crittercism.android.l.i().j()) == 0)
            {
                obj1 = a(((TelephonyManager)f.getSystemService("phone")).getDeviceId());
            }
        }
        obj = obj1;
        if (obj1 == null)
        {
            obj = UUID.randomUUID().toString();
        }
        return ((String) (obj));
        obj;
_L2:
        obj1 = null;
          goto _L3
        obj = null;
          goto _L4
    }

    private double m()
    {
        double d2 = 1.0D;
        double d1;
        double d3;
        int i1;
        int j1;
        try
        {
            Intent intent = f.getApplicationContext().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            i1 = intent.getIntExtra("level", -1);
            j1 = intent.getIntExtra("scale", -1);
        }
        catch (Exception exception)
        {
            return 1.0D;
        }
        d3 = j1;
        d1 = d2;
        if (i1 >= 0)
        {
            d1 = d2;
            if (d3 > 0.0D)
            {
                d1 = (double)i1 / d3;
            }
        }
        return d1;
    }

    private static long n()
    {
        int i1 = -1;
        int j1;
        int k1;
        int l1;
        android.os.Debug.MemoryInfo memoryinfo = new android.os.Debug.MemoryInfo();
        Debug.getMemoryInfo(memoryinfo);
        j1 = memoryinfo.dalvikPss;
        k1 = memoryinfo.nativePss;
        l1 = memoryinfo.otherPss;
        i1 = (l1 + (j1 + k1)) * 1024;
_L2:
        return (long)i1;
        Exception exception;
        exception;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private JSONObject o()
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            NetworkInfo networkinfo = ((ConnectivityManager)f.getSystemService("connectivity")).getNetworkInfo(1);
            jsonobject.put("available", networkinfo.isAvailable());
            jsonobject.put("connected", networkinfo.isConnected());
            if (!networkinfo.isConnected())
            {
                jsonobject.put("connecting", networkinfo.isConnectedOrConnecting());
            }
            jsonobject.put("failover", networkinfo.isFailover());
        }
        catch (Exception exception)
        {
            crittercism/android/i.getCanonicalName();
            return jsonobject;
        }
        return jsonobject;
    }

    private JSONObject p()
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            NetworkInfo networkinfo = ((ConnectivityManager)f.getSystemService("connectivity")).getNetworkInfo(0);
            jsonobject.put("available", networkinfo.isAvailable());
            jsonobject.put("connected", networkinfo.isConnected());
            if (!networkinfo.isConnected())
            {
                jsonobject.put("connecting", networkinfo.isConnectedOrConnecting());
            }
            jsonobject.put("failover", networkinfo.isFailover());
            jsonobject.put("roaming", networkinfo.isRoaming());
        }
        catch (Exception exception)
        {
            crittercism/android/i.getCanonicalName();
            (new StringBuilder()).append(exception.toString()).append(" in getMobileNetworkStatus");
            return jsonobject;
        }
        return jsonobject;
    }

    private String q()
    {
        Object obj;
        if (b("android.permission.GET_TASKS") != 0)
        {
            break MISSING_BLOCK_LABEL_86;
        }
        obj = ((ActivityManager)f.getSystemService("activity")).getRunningTasks(1);
        (new StringBuilder("CURRENT Activity ::")).append(((android.app.ActivityManager.RunningTaskInfo)((List) (obj)).get(0)).topActivity.getClassName());
        obj = ((android.app.ActivityManager.RunningTaskInfo)((List) (obj)).get(0)).topActivity.flattenToShortString().replace("/", "");
        return ((String) (obj));
        Exception exception;
        exception;
        return "";
    }

    private JSONArray r()
    {
        StringBuilder stringbuilder;
        JSONArray jsonarray;
        jsonarray = new JSONArray();
        stringbuilder = new StringBuilder();
        Object obj1 = o;
        obj1;
        JVM INSTR monitorenter ;
        ExecutorService executorservice;
        Future future;
        a a1;
        executorservice = Executors.newCachedThreadPool();
        a1 = new a(o);
        future = executorservice.submit(a1);
        StringBuilder stringbuilder1;
        if (a.a())
        {
            break MISSING_BLOCK_LABEL_79;
        }
        stringbuilder1 = (StringBuilder)future.get(5L, TimeUnit.SECONDS);
        stringbuilder = stringbuilder1;
        future.cancel(true);
        executorservice.shutdownNow();
_L1:
        obj1;
        JVM INSTR monitorexit ;
        if (stringbuilder.toString().length() > 0)
        {
            String as[] = stringbuilder.toString().split("\n");
            for (int i1 = 0; i1 < as.length; i1++)
            {
                jsonarray.put(as[i1]);
            }

        }
        break MISSING_BLOCK_LABEL_209;
        Exception exception1;
        exception1;
        a.b();
        a1.c();
        Exception exception;
        try
        {
            Thread.sleep(200L);
        }
        catch (InterruptedException interruptedexception) { }
        future.cancel(true);
        executorservice.shutdownNow();
          goto _L1
        exception;
        future.cancel(true);
        executorservice.shutdownNow();
        throw exception;
        exception;
        obj1;
        JVM INSTR monitorexit ;
        throw exception;
        int k1 = jsonarray.length();
        Object obj;
        if (k1 > 100)
        {
            JSONArray jsonarray1 = new JSONArray();
            int j1 = k1 - 100;
            do
            {
                obj = jsonarray1;
                if (j1 >= k1)
                {
                    break;
                }
                try
                {
                    jsonarray1.put(jsonarray.getString(j1));
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    (new StringBuilder("Caught exception in second try-catch of getLogCat():")).append(obj.getClass().getName());
                }
                j1++;
            } while (true);
        } else
        {
            obj = jsonarray;
        }
        return ((JSONArray) (obj));
    }

    private float s()
    {
        float f1;
        try
        {
            f1 = f.getResources().getDisplayMetrics().density;
        }
        catch (Exception exception)
        {
            return 1.0F;
        }
        return f1;
    }

    private float t()
    {
        float f1;
        try
        {
            f1 = f.getResources().getDisplayMetrics().ydpi;
        }
        catch (Exception exception)
        {
            return 0.0F;
        }
        return f1;
    }

    private boolean u()
    {
        int i1 = 30;
_L1:
        if (l || i1 <= 0)
        {
            break MISSING_BLOCK_LABEL_28;
        }
        i1--;
        Thread.sleep(1000L);
          goto _L1
        Exception exception;
        exception;
        return l;
    }

    public final String a()
    {
        return g;
    }

    public final JSONObject a(JSONObject jsonobject)
    {
        Object obj;
        Object obj1;
        String s1;
        JSONObject jsonobject1;
        Object obj2;
        JSONObject jsonobject2;
        obj2 = null;
        s1 = new String();
        jsonobject1 = new JSONObject();
        jsonobject2 = new JSONObject();
        new String();
        obj = s1;
        obj1 = s1;
        jsonobject2.put("success", 0);
        obj = s1;
        obj1 = s1;
        s1 = jsonobject.getString("requestUrl");
        obj = s1;
        obj1 = s1;
        jsonobject = jsonobject.getJSONObject("requestData");
        obj = s1;
_L2:
        String as[];
        if (!jsonobject.has("filenames") || !jsonobject.has("filename_prefix"))
        {
            break; /* Loop/switch isn't completed */
        }
        new JSONArray();
        obj1 = jsonobject.getJSONArray("filenames");
        as = new String[((JSONArray) (obj1)).length()];
        int i1 = 0;
        do
        {
            try
            {
                if (i1 >= ((JSONArray) (obj1)).length())
                {
                    break;
                }
                as[i1] = ((JSONArray) (obj1)).getString(i1);
            }
            // Misplaced declaration of an exception variable
            catch (JSONObject jsonobject)
            {
                jsonobject.printStackTrace();
                return jsonobject2;
            }
            i1++;
        } while (true);
        break MISSING_BLOCK_LABEL_187;
        jsonobject;
        jsonobject.printStackTrace();
        jsonobject = jsonobject1;
        continue; /* Loop/switch isn't completed */
        jsonobject;
        jsonobject.printStackTrace();
        obj = obj1;
        jsonobject = jsonobject1;
        if (true) goto _L2; else goto _L1
        obj1 = jsonobject.getString("filename_prefix");
        jsonobject.remove("filenames");
        jsonobject.remove("filename_prefix");
_L6:
        {
            if (as == null || obj1 == null)
            {
                break MISSING_BLOCK_LABEL_311;
            }
            try
            {
                obj1 = e.a(((String) (obj)), jsonobject, as, ((String) (obj1)));
            }
            // Misplaced declaration of an exception variable
            catch (JSONObject jsonobject)
            {
                throw jsonobject;
            }
            // Misplaced declaration of an exception variable
            catch (JSONObject jsonobject)
            {
                throw jsonobject;
            }
            // Misplaced declaration of an exception variable
            catch (JSONObject jsonobject)
            {
                (new StringBuilder("Exception in postJsonDataNew: ")).append(jsonobject.getClass().getName());
                jsonobject = new JSONObject();
                try
                {
                    jsonobject.put("success", 0);
                }
                catch (Exception exception)
                {
                    return jsonobject;
                }
                return jsonobject;
            }
        }
        if (obj1 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (((String) (obj1)).equals(""))
        {
            break; /* Loop/switch isn't completed */
        }
        obj1 = new JSONObject(((String) (obj1)));
        (new StringBuilder("POSTING JSON DATA: url = ")).append(((String) (obj))).append("\tdata = ").append(jsonobject.toString());
        (new StringBuilder("POSTING JSON DATA: response = ")).append(((JSONObject) (obj1)).toString());
        return ((JSONObject) (obj1));
        obj1 = e.a(((String) (obj)), jsonobject);
        if (true) goto _L4; else goto _L3
_L4:
        break MISSING_BLOCK_LABEL_233;
_L3:
        return jsonobject2;
_L1:
        as = null;
        obj1 = obj2;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final transient JSONObject a(boolean aflag[])
    {
        Object obj;
        int i1 = 0;
        boolean flag = true;
        Object obj1;
        boolean flag1;
        boolean flag2;
        if (aflag.length > 0)
        {
            flag1 = aflag[0];
        } else
        {
            flag1 = true;
        }
        if (aflag.length > 1)
        {
            flag2 = aflag[1];
        } else
        {
            flag2 = false;
        }
        obj1 = new JSONObject();
        obj = f();
        ((JSONObject) (obj)).put("battery_level", m());
        ((JSONObject) (obj)).put("memory_usage", n());
        aflag = (ActivityManager)f.getSystemService("activity");
        obj1 = new android.app.ActivityManager.MemoryInfo();
        aflag.getMemoryInfo(((android.app.ActivityManager.MemoryInfo) (obj1)));
        if (((android.app.ActivityManager.MemoryInfo) (obj1)).lowMemory)
        {
            i1 = 1;
        }
        ((JSONObject) (obj)).put("low_memory", i1);
        if (b("android.permission.ACCESS_NETWORK_STATE") == 0)
        {
            ((JSONObject) (obj)).put("wifi", o());
            ((JSONObject) (obj)).put("mobile_network", p());
        }
        ((JSONObject) (obj)).put("disk_space_free", ah.a().toString());
        ((JSONObject) (obj)).put("disk_space_total", ah.b().toString());
        ((JSONObject) (obj)).put("sd_space_free", ah.c().toString());
        ((JSONObject) (obj)).put("sd_space_total", ah.d().toString());
        i1 = f.getResources().getConfiguration().orientation;
        if (i1 != 0) goto _L2; else goto _L1
_L1:
        aflag = ((WindowManager)f.getSystemService("window")).getDefaultDisplay();
        if (aflag.getWidth() != aflag.getHeight()) goto _L4; else goto _L3
_L3:
        i1 = 3;
_L2:
        ((JSONObject) (obj)).put("orientation", i1);
        ((JSONObject) (obj)).put("activity", q());
        if (!flag2)
        {
            break MISSING_BLOCK_LABEL_292;
        }
        ((JSONObject) (obj)).put("metadata", n);
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_449;
        }
        if (b("android.permission.READ_LOGS") != 0)
        {
            break; /* Loop/switch isn't completed */
        }
        aflag = r();
        i1 = aflag.length();
        if (i1 <= 0)
        {
            break MISSING_BLOCK_LABEL_496;
        }
        try
        {
            ((JSONObject) (obj)).put("logcat", aflag);
        }
        // Misplaced declaration of an exception variable
        catch (boolean aflag[])
        {
            try
            {
                (new StringBuilder("put logcat EXCEPTION: ")).append(aflag.getClass().getName());
                break MISSING_BLOCK_LABEL_496;
            }
            // Misplaced declaration of an exception variable
            catch (boolean aflag[]) { }
            break MISSING_BLOCK_LABEL_454;
        }
        return ((JSONObject) (obj));
_L4:
        i1 = ((flag) ? 1 : 0);
        if (aflag.getWidth() > aflag.getHeight())
        {
            i1 = 2;
        }
        if (true) goto _L2; else goto _L5
_L5:
        if (android.os.Build.VERSION.SDK_INT < 16 || !crittercism.android.l.i().t.isLogcatReportingEnabled())
        {
            break MISSING_BLOCK_LABEL_449;
        }
        aflag = r();
        i1 = aflag.length();
        if (i1 <= 0)
        {
            break MISSING_BLOCK_LABEL_449;
        }
        ((JSONObject) (obj)).put("logcat", aflag);
        return ((JSONObject) (obj));
        aflag;
        (new StringBuilder("put logcat EXCEPTION: ")).append(aflag.getClass().getName());
        return ((JSONObject) (obj));
        aflag;
        obj = obj1;
        (new StringBuilder("Exception with getStateInfo(): ")).append(aflag.getClass().getName());
        return ((JSONObject) (obj));
        return ((JSONObject) (obj));
    }

    public final int b()
    {
        return k;
    }

    public final boolean b(JSONObject jsonobject)
    {
        boolean flag = true;
        this;
        JVM INSTR monitorenter ;
        if (!jsonobject.has("username")) goto _L2; else goto _L1
_L1:
        m = jsonobject.getString("username");
_L4:
        int i1;
        (new StringBuilder("sendCustomMetadata$metadata = ")).append(jsonobject.toString());
        if (!u())
        {
            break MISSING_BLOCK_LABEL_202;
        }
        JSONObject jsonobject1 = new JSONObject();
        new JSONObject();
        JSONObject jsonobject2 = d();
        jsonobject2.put("metadata", jsonobject);
        jsonobject1.put("requestUrl", (new StringBuilder()).append(a.a()).append("/android_v2/update_user_metadata").toString());
        jsonobject1.put("requestData", jsonobject2);
        jsonobject = a(jsonobject1);
        if (!jsonobject.has("success"))
        {
            break MISSING_BLOCK_LABEL_202;
        }
        i1 = jsonobject.getInt("success");
        if (i1 != 1)
        {
            break MISSING_BLOCK_LABEL_202;
        }
_L5:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        if (m.equals("")) goto _L4; else goto _L3
_L3:
        jsonobject.put("username", m);
          goto _L4
        jsonobject;
        throw jsonobject;
        jsonobject;
        this;
        JVM INSTR monitorexit ;
        throw jsonobject;
        jsonobject;
        crittercism/android/i.getCanonicalName();
        flag = false;
          goto _L5
    }

    public final String c()
    {
        return h;
    }

    public final void c(JSONObject jsonobject)
    {
        for (Iterator iterator = jsonobject.keys(); iterator.hasNext();)
        {
            String s1 = (String)iterator.next();
            try
            {
                n.put(s1, jsonobject.get(s1));
            }
            catch (JSONException jsonexception) { }
        }

    }

    public final JSONObject d()
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("app_id", g);
            if (h == null)
            {
                h = l();
            }
            jsonobject.put("hashed_device_id", h);
            jsonobject.put("device_name", "android");
            jsonobject.put("library_version", i);
        }
        catch (JSONException jsonexception)
        {
            return jsonobject;
        }
        catch (Exception exception)
        {
            (new StringBuilder("Exception in getRequiredParams(): ")).append(exception.getClass().getName());
            return jsonobject;
        }
        return jsonobject;
    }

    public final String e()
    {
        String s1;
        try
        {
            s1 = ((TelephonyManager)f.getSystemService("phone")).getNetworkOperatorName();
        }
        catch (Exception exception)
        {
            return Build.BRAND;
        }
        return s1;
    }

    public final JSONObject f()
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("arch", System.getProperty("os.arch"));
            jsonobject.put("locale", p);
            jsonobject.put("dpi", s());
            jsonobject.put("xdpi", g());
            jsonobject.put("ydpi", t());
            jsonobject.put("name", "");
            jsonobject.put("system", "android");
            jsonobject.put("model", Build.MODEL);
            jsonobject.put("carrier", e());
            jsonobject.put("system_version", android.os.Build.VERSION.RELEASE);
            jsonobject.put("app_version_code", j.b);
            jsonobject.put("app_version", j.a);
        }
        catch (Exception exception)
        {
            return new JSONObject();
        }
        return jsonobject;
    }

    public final float g()
    {
        float f1;
        try
        {
            f1 = f.getResources().getDisplayMetrics().xdpi;
        }
        catch (Exception exception)
        {
            return 0.0F;
        }
        return f1;
    }

    public final String h()
    {
        String s1;
        String s2;
        String s3;
        String s4;
        String s5;
        new JSONObject();
        new JSONObject();
        s1 = new String();
        s3 = s1;
        s4 = s1;
        s5 = s1;
        s2 = s1;
        String s6 = (new StringBuilder()).append(a.a()).append("/android_v2/update_package_name").toString();
        s3 = s1;
        s4 = s1;
        s5 = s1;
        s2 = s1;
        Object obj1 = d();
        s3 = s1;
        s4 = s1;
        s5 = s1;
        s2 = s1;
        ((JSONObject) (obj1)).put("pkg", f.getPackageName());
        s3 = s1;
        s4 = s1;
        s5 = s1;
        s2 = s1;
        s1 = e.a(s6, ((JSONObject) (obj1)));
        obj1 = s1;
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_390;
        }
        s3 = s1;
        s4 = s1;
        s5 = s1;
        s2 = s1;
        obj1 = s1;
        if (s1.equals(""))
        {
            break MISSING_BLOCK_LABEL_390;
        }
        s3 = s1;
        s4 = s1;
        s5 = s1;
        s2 = s1;
        JSONObject jsonobject = new JSONObject(s1);
        s3 = s1;
        s4 = s1;
        s5 = s1;
        s2 = s1;
        if (!jsonobject.has("success"))
        {
            break MISSING_BLOCK_LABEL_319;
        }
        s3 = s1;
        s4 = s1;
        s5 = s1;
        s2 = s1;
        obj1 = s1;
        if (jsonobject.getInt("success") != 1)
        {
            break MISSING_BLOCK_LABEL_390;
        }
        s3 = s1;
        s4 = s1;
        s5 = s1;
        s2 = s1;
        (new StringBuilder("app_id: ")).append(jsonobject.getString("app_id"));
        s3 = s1;
        s4 = s1;
        s5 = s1;
        s2 = s1;
        (new StringBuilder("package name: ")).append(jsonobject.getString("pkg"));
        s3 = s1;
        s4 = s1;
        s5 = s1;
        s2 = s1;
        (new StringBuilder("updated settings: ")).append(jsonobject.getJSONObject("updated_settings"));
        return s1;
        s3 = s1;
        s4 = s1;
        s5 = s1;
        s2 = s1;
        (new StringBuilder()).append(s6).append(" response: ").append(s1);
        return s1;
        Object obj;
        obj;
        return s3;
        obj;
        (new StringBuilder("sendPackageName: Exception! ")).append(obj.getClass().getName());
        return s4;
        obj;
        return s5;
        obj;
        obj1 = s2;
        return ((String) (obj1));
    }

    public final void i()
    {
        l = true;
    }

    public final JSONObject j()
    {
        return n;
    }

    public final String k()
    {
        return j.a;
    }
}
