// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import javax.net.ssl.HttpsURLConnection;

// Referenced classes of package com.crashlytics.android:
//            aB, B, h, au, 
//            D, ae, ac, av, 
//            m, SettingsController, aw, i, 
//            Z, ax, E, ar, 
//            aA, IdManager, j, A, 
//            af, C, w, CrashlyticsMissingDependencyException, 
//            ak, t, CrashTest, s, 
//            u, ab, v, HttpRequest, 
//            PinningInfoProvider, CrashlyticsListener, am

public final class Crashlytics
{

    private static Crashlytics b = null;
    private static int c = 4;
    private static ContextWrapper o;
    private static String p;
    private static String q;
    private static String r;
    private static String s;
    private static String t;
    private static String u;
    private static String v;
    private static File w;
    private static boolean x = false;
    private static PinningInfoProvider y = null;
    String a;
    private final long d = System.currentTimeMillis();
    private final ConcurrentHashMap e = new ConcurrentHashMap();
    private final AtomicReference f = new AtomicReference();
    private CrashlyticsListener g;
    private E h;
    private IdManager i;
    private String j;
    private String k;
    private String l;
    private String m;
    private SettingsController n;

    private Crashlytics()
    {
        i = null;
        j = null;
        k = null;
        l = null;
        a = null;
    }

    static int a(Crashlytics crashlytics, float f1, int i1)
    {
        return (int)((float)i1 * f1);
    }

    private h a(ak ak1)
    {
        String s1 = aB.a(new String[] {
            m
        });
        int i1 = B.a(q).a();
        return new h(u, p, t, s, s1, r, i1, v, "0", ak1);
    }

    private Object a(D d1, Object obj)
    {
        au au1 = (au)f.get();
        if (au1 == null)
        {
            return obj;
        } else
        {
            return d1.a(au1);
        }
    }

    private static String a(String s1)
    {
        String s2 = s1;
        if (s1 != null)
        {
            s1 = s1.trim();
            s2 = s1;
            if (s1.length() > 1024)
            {
                s2 = s1.substring(0, 1024);
            }
        }
        return s2;
    }

    static void a(Crashlytics crashlytics, Context context, float f1)
    {
        Object obj;
        obj = String.format("https://settings.crashlytics.com/spi/v1/platforms/android/apps/%s/settings", new Object[] {
            p
        });
        obj = new ae(l(), ((String) (obj)));
        ac ac1 = new ac();
        av av1 = new av();
        m m1 = new m();
        if (crashlytics.n == null)
        {
            String s1 = aB.a(u, p);
            String s2 = aB.a(new String[] {
                crashlytics.m
            });
            int i1 = B.a(q).a();
            String s3 = v();
            crashlytics.n = new SettingsController(new aw(u, s1, s2, t, s, i1, s3), ac1, av1, m1, ((ay) (obj)));
        }
        obj = null;
        Object obj1 = crashlytics.n.a();
        obj = obj1;
        crashlytics.f.set(obj1);
        obj = obj1;
_L7:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_451;
        }
        obj1 = ((au) (obj)).b();
        boolean flag3 = true;
        if (!((i) (obj1)).d()) goto _L2; else goto _L1
_L1:
        h h1 = crashlytics.a(w());
        if (!(new Z(l(), ((i) (obj1)).a())).a(h1)) goto _L4; else goto _L3
_L3:
        boolean flag2 = crashlytics.u();
_L8:
        boolean flag;
        boolean flag1;
        try
        {
            flag3 = ((au) (obj)).c().a();
        }
        catch (Exception exception)
        {
            aB.a("Error getting collect reports setting.", exception);
            flag3 = false;
        }
_L11:
        if (!flag2 || !flag3) goto _L6; else goto _L5
_L5:
        flag1 = false;
        crashlytics.h.b();
        crashlytics = crashlytics.s();
        flag = flag1;
        if (crashlytics == null)
        {
            break MISSING_BLOCK_LABEL_291;
        }
        (new ar(crashlytics)).a(context, f1);
        flag = flag1;
_L10:
        if (flag)
        {
            aB.c("Crash reporting disabled.");
        }
        return;
        obj1;
        aB.a("Error dealing with settings", ((Throwable) (obj1)));
          goto _L7
_L4:
        aB.a("Failed to create app with Crashlytics service.", null);
        flag2 = false;
          goto _L8
_L2:
        try
        {
label0:
            {
                if (!((i) (obj1)).e())
                {
                    break label0;
                }
                flag2 = crashlytics.u();
            }
        }
        catch (Exception exception1)
        {
            aB.a("Error performing auto configuration.", exception1);
            flag2 = false;
        }
          goto _L8
        flag2 = flag3;
        if (!((i) (obj1)).c()) goto _L8; else goto _L9
_L9:
        aB.c("Server says an update is required - forcing a full App update.");
        h h2 = crashlytics.a(w());
        (new aA(l(), ((i) (obj1)).a())).a(h2);
        flag2 = flag3;
          goto _L8
        crashlytics;
        aB.a("Error sending crash report", crashlytics);
        flag = flag1;
          goto _L10
_L6:
        flag = true;
          goto _L10
        flag3 = false;
        flag2 = false;
          goto _L11
    }

    private void a(String s1, Context context, float f1)
    {
        this;
        JVM INSTR monitorenter ;
        if (o == null) goto _L2; else goto _L1
_L1:
        aB.c("Crashlytics already started, ignoring re-initialization attempt.");
_L6:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        u = s1;
        o = new ContextWrapper(context.getApplicationContext());
        aB.a(4, "Crashlytics", (new StringBuilder("Initializing Crashlytics ")).append(getCrashlyticsVersion()).toString());
        Object obj;
        p = o.getPackageName();
        obj = o.getPackageManager();
        q = ((PackageManager) (obj)).getInstallerPackageName(p);
        aB.c((new StringBuilder("Installer package name is: ")).append(q).toString());
        obj = ((PackageManager) (obj)).getPackageInfo(p, 0);
        s = Integer.toString(((PackageInfo) (obj)).versionCode);
        if (((PackageInfo) (obj)).versionName != null) goto _L4; else goto _L3
_L3:
        obj = "0.0";
_L7:
        t = ((String) (obj));
        r = context.getPackageManager().getApplicationLabel(context.getApplicationInfo()).toString();
        v = Integer.toString(context.getApplicationInfo().targetSdkVersion);
        obj = null;
        int i1 = aB.a(o, "com.crashlytics.android.build_id", "string");
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_237;
        }
        obj = o.getResources().getString(i1);
        aB.c((new StringBuilder("Build ID is: ")).append(((String) (obj))).toString());
        m = ((String) (obj));
        obj = new File(o.getFilesDir(), "com.crashlytics.sdk.android");
        w = ((File) (obj));
        if (!((File) (obj)).exists())
        {
            w.mkdirs();
        }
_L8:
        i = new IdManager(o);
        i.g();
        (new j(m, aB.a(o, "com.crashlytics.RequireBuildId", true))).a(s1, p);
        aB.c("Installing exception handler...");
        h = new E(Thread.getDefaultUncaughtExceptionHandler(), g, m);
        h.d();
        Thread.setDefaultUncaughtExceptionHandler(h);
        aB.c("Successfully installed exception handler.");
_L9:
        boolean flag;
        obj = new File(w, "initialization_marker");
        flag = ((File) (obj)).exists();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_412;
        }
        aB.c("Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.");
        CountDownLatch countdownlatch;
        countdownlatch = new CountDownLatch(1);
        s1 = new CountDownLatch(1);
        (new Thread(new A(this, ((File) (obj)), countdownlatch, context, f1, s1), "Crashlytics Initializer")).start();
        countdownlatch.await(500L, TimeUnit.MILLISECONDS);
_L10:
        if (!flag) goto _L6; else goto _L5
_L5:
        s1.await(3500L, TimeUnit.MILLISECONDS);
          goto _L6
        s1;
        aB.a(5, "Crashlytics", "Crashlytics initialization was not completed in the allotted time.");
          goto _L6
        s1;
        throw s1;
_L4:
        obj = ((PackageInfo) (obj)).versionName;
          goto _L7
        Exception exception;
        exception;
        aB.a("Error setting up app properties", exception);
          goto _L8
        s1;
        aB.a("There was a problem installing the exception handler.", s1);
          goto _L9
        context;
        aB.a(5, "Crashlytics", "Crashlytics initialization marker file was not created in the allotted time.");
          goto _L10
    }

    static void a(boolean flag)
    {
        aB.a().edit().putBoolean("always_send_reports_opt_in", true).commit();
    }

    static boolean a(Crashlytics crashlytics, Activity activity, am am)
    {
        af af1 = new af(activity, am);
        C c1 = new C(crashlytics, (byte)0);
        activity.runOnUiThread(new w(crashlytics, activity, c1, af1, am));
        aB.c("Waiting for user opt-in.");
        c1.b();
        return c1.a();
    }

    static int b()
    {
        return c;
    }

    private static String b(Context context)
    {
        Object obj;
        obj = context.getApplicationContext();
        String s1 = ((Context) (obj)).getPackageName();
        obj = ((Context) (obj)).getPackageManager().getApplicationInfo(s1, 128).metaData;
        if (obj == null) goto _L2; else goto _L1
_L1:
        obj = ((Bundle) (obj)).getString("com.crashlytics.ApiKey");
_L4:
        Object obj1;
        obj1 = obj;
        if (aB.d(((String) (obj))))
        {
            int i1 = aB.a(context, "com.crashlytics.ApiKey", "string");
            obj1 = obj;
            if (i1 != 0)
            {
                obj1 = context.getResources().getString(i1);
            }
        }
        if (!aB.d(((String) (obj1))))
        {
            break MISSING_BLOCK_LABEL_136;
        }
        if (x || aB.d(context))
        {
            throw new IllegalArgumentException("Crashlytics could not be initialized, API key missing from AndroidManifest.xml. Add the following tag to your Application element \n\t<meta-data android:name=\"com.crashlytics.ApiKey\" android:value=\"YOUR_API_KEY\"/>");
        }
        break; /* Loop/switch isn't completed */
        obj;
        aB.c((new StringBuilder("Caught non-fatal exception while retrieving apiKey: ")).append(obj).toString());
_L2:
        obj = null;
        if (true) goto _L4; else goto _L3
_L3:
        aB.a("Crashlytics could not be initialized, API key missing from AndroidManifest.xml. Add the following tag to your Application element \n\t<meta-data android:name=\"com.crashlytics.ApiKey\" android:value=\"YOUR_API_KEY\"/>", null);
        return ((String) (obj1));
    }

    static ContextWrapper d()
    {
        return o;
    }

    static String e()
    {
        return p;
    }

    static String f()
    {
        return q;
    }

    static String g()
    {
        return t;
    }

    public static String getCrashlyticsVersion()
    {
        return "1.0.4.15";
    }

    public static Crashlytics getInstance()
    {
        com/crashlytics/android/Crashlytics;
        JVM INSTR monitorenter ;
        Crashlytics crashlytics;
        if (b == null)
        {
            b = new Crashlytics();
        }
        crashlytics = b;
        com/crashlytics/android/Crashlytics;
        JVM INSTR monitorexit ;
        return crashlytics;
        Exception exception;
        exception;
        throw exception;
    }

    public static PinningInfoProvider getPinningInfoProvider()
    {
        return y;
    }

    static String h()
    {
        return s;
    }

    static String i()
    {
        return u;
    }

    static File j()
    {
        return w;
    }

    static String k()
    {
        return r;
    }

    static String l()
    {
        return aB.a(o, "com.crashlytics.ApiEndpoint");
    }

    public static void log(int i1, String s1, String s2)
    {
        log(s2);
        aB.b(i1, (new StringBuilder()).append(s1).toString(), (new StringBuilder()).append(s2).toString());
    }

    public static void log(String s1)
    {
        if (b == null || b.h == null)
        {
            aB.a("Crashlytics must be initialized by calling Crashlytics.start(Context) prior to logging messages.", null);
            return;
        } else
        {
            long l1 = System.currentTimeMillis();
            long l2 = b.d;
            b.h.a(l1 - l2, s1);
            return;
        }
    }

    public static void logException(Throwable throwable)
    {
        if (b == null || b.h == null)
        {
            aB.a("Crashlytics must be initialized by calling Crashlytics.start(Context) prior to logging exceptions.", null);
            return;
        } else
        {
            b.h.a(Thread.currentThread(), throwable);
            return;
        }
    }

    static boolean n()
    {
        return aB.a().getBoolean("always_send_reports_opt_in", false);
    }

    public static void setApplicationInstallationIdentifier(String s1)
    {
        getInstance().a = a(s1);
    }

    public static void setBool(String s1, boolean flag)
    {
        setString(s1, Boolean.toString(flag));
    }

    public static void setDouble(String s1, double d1)
    {
        setString(s1, Double.toString(d1));
    }

    public static void setFloat(String s1, float f1)
    {
        setString(s1, Float.toString(f1));
    }

    public static void setInt(String s1, int i1)
    {
        setString(s1, Integer.toString(i1));
    }

    public static void setLong(String s1, long l1)
    {
        setString(s1, Long.toString(l1));
    }

    public static void setPinningInfoProvider(PinningInfoProvider pinninginfoprovider)
    {
        if (y != pinninginfoprovider)
        {
            y = pinninginfoprovider;
            aB.g();
        }
    }

    public static void setString(String s1, String s2)
    {
        if (s1 == null)
        {
            if (o != null && aB.d(o))
            {
                throw new IllegalArgumentException("Custom attribute key cannot be null.");
            } else
            {
                aB.a("Attempting to set custom attribute with null key, ignoring.", null);
                return;
            }
        }
        String s3 = a(s1);
        if (getInstance().e.size() < 64 || getInstance().e.containsKey(s3))
        {
            if (s2 == null)
            {
                s1 = "";
            } else
            {
                s1 = a(s2);
            }
            b.e.put(s3, s1);
            return;
        } else
        {
            aB.c("Exceeded maximum number of custom attributes (64)");
            return;
        }
    }

    public static void setUserEmail(String s1)
    {
        getInstance().k = a(s1);
    }

    public static void setUserIdentifier(String s1)
    {
        getInstance().j = a(s1);
    }

    public static void setUserName(String s1)
    {
        getInstance().l = a(s1);
    }

    public static void start(Context context)
    {
        start(context, 1.0F);
    }

    public static void start(Context context, float f1)
    {
        if (context == null)
        {
            throw new IllegalArgumentException("context cannot be null.");
        }
        String s1 = b(context);
        if (s1 == null)
        {
            return;
        }
        try
        {
            getInstance().a(s1, context, f1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw context;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            aB.a("Crashlytics was not started due to an exception during initialization", context);
        }
    }

    private boolean u()
    {
        au au1 = n.a(SettingsController.CacheBehavior.SKIP_CACHE_LOOKUP);
        f.set(au1);
        if (au1 == null)
        {
            aB.a("Failed to force reload of settings from Crashlytics.", null);
        }
        return au1 != null;
    }

    private static String v()
    {
        Object obj;
        Object obj1;
        Object obj2;
        byte abyte0[];
        abyte0 = null;
        obj2 = null;
        obj1 = obj2;
        obj = abyte0;
        MessageDigest messagedigest = MessageDigest.getInstance("SHA-1");
        obj1 = obj2;
        obj = abyte0;
        int i1 = o.getApplicationContext().getApplicationInfo().icon;
        obj1 = obj2;
        obj = abyte0;
        obj2 = o.getResources().openRawResource(i1);
        obj1 = obj2;
        obj = obj2;
        abyte0 = new byte[1024];
_L2:
        obj1 = obj2;
        obj = obj2;
        i1 = ((InputStream) (obj2)).read(abyte0);
        if (i1 == -1)
        {
            break; /* Loop/switch isn't completed */
        }
        obj1 = obj2;
        obj = obj2;
        messagedigest.update(abyte0, 0, i1);
        if (true) goto _L2; else goto _L1
        obj2;
        obj = obj1;
        aB.a("Could not calculate hash for app icon.", ((Throwable) (obj2)));
        aB.a(((java.io.Closeable) (obj1)), "Failed to close icon input stream.");
        return "";
_L1:
        obj1 = obj2;
        obj = obj2;
        String s1 = aB.b(messagedigest.digest());
        aB.a(((java.io.Closeable) (obj2)), "Failed to close icon input stream.");
        return s1;
        Exception exception;
        exception;
        aB.a(((java.io.Closeable) (obj)), "Failed to close icon input stream.");
        throw exception;
    }

    private static ak w()
    {
        byte abyte0[] = null;
        InputStream inputstream;
        int i1 = o.getApplicationContext().getApplicationInfo().icon;
        inputstream = o.getResources().openRawResource(i1);
        Object obj = inputstream;
        Bitmap bitmap = BitmapFactory.decodeStream(inputstream);
        if (bitmap != null) goto _L2; else goto _L1
_L1:
        obj = inputstream;
        aB.a(5, "Crashlytics", "Crashlytics could not load the application's icon.");
        obj = abyte0;
_L4:
        aB.a(inputstream, "Failed to close icon input stream.");
        return ((ak) (obj));
_L2:
        obj = inputstream;
        abyte0 = aB.a(bitmap);
        obj = inputstream;
        ak ak1 = new ak(aB.a(abyte0), abyte0, bitmap.getWidth(), bitmap.getHeight());
        obj = ak1;
        if (true) goto _L4; else goto _L3
_L3:
        android.content.res.Resources.NotFoundException notfoundexception;
        notfoundexception;
        inputstream = null;
_L8:
        obj = inputstream;
        aB.a("Failed to load icon", notfoundexception);
        aB.a(inputstream, "Failed to close icon input stream.");
        return null;
        Exception exception;
        exception;
        obj = null;
_L6:
        aB.a(((java.io.Closeable) (obj)), "Failed to close icon input stream.");
        throw exception;
        exception;
        if (true) goto _L6; else goto _L5
_L5:
        notfoundexception;
        if (true) goto _L8; else goto _L7
_L7:
    }

    final Map a()
    {
        return Collections.unmodifiableMap(e);
    }

    final boolean a(Context context)
    {
        return ((Boolean)a(((D) (new t(this, context))), Boolean.valueOf(true))).booleanValue();
    }

    final IdManager c()
    {
        return i;
    }

    public final void crash()
    {
        (new CrashTest()).indexOutOfBounds();
    }

    public final boolean getDebugMode()
    {
        return x;
    }

    final boolean m()
    {
        return ((Boolean)a(new s(this), Boolean.valueOf(false))).booleanValue();
    }

    final E o()
    {
        return h;
    }

    final String p()
    {
        if (i.a())
        {
            return j;
        } else
        {
            return null;
        }
    }

    final String q()
    {
        if (i.a())
        {
            return k;
        } else
        {
            return null;
        }
    }

    final String r()
    {
        if (i.a())
        {
            return l;
        } else
        {
            return null;
        }
    }

    final ab s()
    {
        return (ab)a(new u(this), null);
    }

    public final void setDebugMode(boolean flag)
    {
        x = flag;
        int i1;
        if (flag)
        {
            i1 = 3;
        } else
        {
            i1 = 4;
        }
        c = i1;
    }

    public final void setListener(CrashlyticsListener crashlyticslistener)
    {
        g = crashlyticslistener;
    }

    final ax t()
    {
        return (ax)a(new v(this), null);
    }

    public final boolean verifyPinning(URL url)
    {
label0:
        {
            try
            {
                if (y == null)
                {
                    break label0;
                }
                url = HttpRequest.a(url);
                javax.net.ssl.SSLSocketFactory sslsocketfactory = aB.a(y);
                HttpsURLConnection httpsurlconnection = (HttpsURLConnection)url.a();
                httpsurlconnection.setSSLSocketFactory(sslsocketfactory);
                httpsurlconnection.setInstanceFollowRedirects(false);
                url.b();
            }
            // Misplaced declaration of an exception variable
            catch (URL url)
            {
                aB.a("Could not verify SSL pinning", url);
                return false;
            }
            return true;
        }
        return false;
    }

}
