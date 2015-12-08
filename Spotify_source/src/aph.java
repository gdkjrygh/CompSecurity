// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Base64;
import com.facebook.FacebookException;
import com.facebook.FacebookRequestError;
import com.facebook.LoggingBehavior;
import com.facebook.Request;
import com.facebook.model.GraphObject;
import java.lang.reflect.Field;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONException;
import org.json.JSONObject;

public final class aph
{

    private static final HashSet a;
    private static volatile Executor b;
    private static volatile boolean c;
    private static volatile String d;
    private static volatile String e;
    private static volatile String f;
    private static volatile boolean g = false;
    private static volatile String h = "facebook.com";
    private static AtomicLong i = new AtomicLong(0x10000L);
    private static volatile boolean j;
    private static volatile boolean k = false;
    private static final Object l = new Object();
    private static final BlockingQueue m = new LinkedBlockingQueue(10);
    private static final ThreadFactory n = new ThreadFactory() {

        private final AtomicInteger a = new AtomicInteger(0);

        public final Thread newThread(Runnable runnable)
        {
            return new Thread(runnable, (new StringBuilder("FacebookSdk #")).append(a.incrementAndGet()).toString());
        }

    };
    private static Boolean o = Boolean.valueOf(false);

    public aph()
    {
    }

    static aoz a(Context context, String s, boolean flag)
    {
        if (context == null || s == null)
        {
            try
            {
                throw new IllegalArgumentException("Both context and applicationId must be non-null");
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                arp.a("Facebook-publish", context);
            }
            return new aoz(null, new FacebookRequestError(context));
        }
        String s1;
        String s2;
        String s3;
        SharedPreferences sharedpreferences;
        apo apo1;
        long l1;
        apo1 = apo.a(context);
        sharedpreferences = context.getSharedPreferences("com.facebook.sdk.attributionTracking", 0);
        s1 = (new StringBuilder()).append(s).append("ping").toString();
        s2 = (new StringBuilder()).append(s).append("json").toString();
        l1 = sharedpreferences.getLong(s1, 0L);
        s3 = sharedpreferences.getString(s2, null);
        if (flag)
        {
            break MISSING_BLOCK_LABEL_131;
        }
        c = false;
        Object obj;
        obj = com.facebook.model.GraphObject.Factory.create();
        ((GraphObject) (obj)).setProperty("event", "MOBILE_APP_INSTALL");
        arp.a(((GraphObject) (obj)), apo1, arp.b(context, s), b(context));
        ((GraphObject) (obj)).setProperty("auto_publish", Boolean.valueOf(flag));
        ((GraphObject) (obj)).setProperty("application_package_name", context.getPackageName());
        obj = Request.a(String.format("%s/activities", new Object[] {
            s
        }), ((GraphObject) (obj)));
        if (l1 == 0L) goto _L2; else goto _L1
_L1:
        context = null;
        if (s3 == null)
        {
            break MISSING_BLOCK_LABEL_229;
        }
        context = com.facebook.model.GraphObject.Factory.create(new JSONObject(s3));
_L4:
        if (context != null)
        {
            break MISSING_BLOCK_LABEL_265;
        }
        return (aoz)aoz.a("true", null, new aou(new Request[] {
            obj
        }), true).get(0);
        return new aoz(null, context, true);
_L2:
        if (apo1 == null)
        {
            break MISSING_BLOCK_LABEL_297;
        }
        if (apo1.b != null || apo1.a != null)
        {
            break MISSING_BLOCK_LABEL_307;
        }
        throw new FacebookException("No attribution id available to send to server.");
        if (!arp.a(s, false).a)
        {
            throw new FacebookException("Install attribution has been disabled on the server.");
        }
        context = ((Request) (obj)).a();
        s = sharedpreferences.edit();
        s.putLong(s1, System.currentTimeMillis());
        if (((aoz) (context)).a != null && ((aoz) (context)).a.getInnerJSONObject() != null)
        {
            s.putString(s2, ((aoz) (context)).a.getInnerJSONObject().toString());
        }
        s.commit();
        return context;
        context;
        context = null;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static void a(Context context)
    {
        aph;
        JVM INSTR monitorenter ;
        boolean flag = o.booleanValue();
        if (!flag) goto _L2; else goto _L1
_L1:
        aph;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (!g)
        {
            c(context);
        }
        arp.a(context, e);
        aog.a(context.getApplicationContext());
        o = Boolean.valueOf(true);
        if (true) goto _L1; else goto _L3
_L3:
        context;
        throw context;
    }

    public static void a(Context context, String s)
    {
        context = context.getApplicationContext();
        c().execute(new Runnable(context, s) {

            private Context a;
            private String b;

            public final void run()
            {
                aph.a(a, b, false);
            }

            
            {
                a = context;
                b = s;
                super();
            }
        });
    }

    public static final boolean a()
    {
        boolean flag;
        synchronized (a)
        {
            flag = k;
        }
        return false;
        exception;
        hashset;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public static final boolean b()
    {
        return k;
    }

    public static boolean b(Context context)
    {
        return context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("limitEventUsage", false);
    }

    public static Executor c()
    {
        Object obj1 = l;
        obj1;
        JVM INSTR monitorenter ;
        Executor executor;
        if (b != null)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        executor = k();
        Object obj;
        obj = executor;
        if (executor != null)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        obj = new ThreadPoolExecutor(5, 128, 1L, TimeUnit.SECONDS, m, n);
        b = ((Executor) (obj));
        obj1;
        JVM INSTR monitorexit ;
        return b;
        Exception exception;
        exception;
        obj1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public static void c(Context context)
    {
        g = true;
        if (context != null)
        {
            try
            {
                context = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                return;
            }
            if (context != null && ((ApplicationInfo) (context)).metaData != null)
            {
                if (e == null)
                {
                    e = ((ApplicationInfo) (context)).metaData.getString("com.facebook.sdk.ApplicationId");
                }
                if (f == null)
                {
                    f = ((ApplicationInfo) (context)).metaData.getString("com.facebook.sdk.ClientToken");
                    return;
                }
            }
        }
    }

    public static String d()
    {
        return h;
    }

    public static String d(Context context)
    {
        PackageManager packagemanager;
        if (context != null)
        {
            if ((packagemanager = context.getPackageManager()) != null)
            {
                context = context.getPackageName();
                Signature asignature[];
                try
                {
                    context = packagemanager.getPackageInfo(context, 64);
                }
                // Misplaced declaration of an exception variable
                catch (Context context)
                {
                    return null;
                }
                asignature = ((PackageInfo) (context)).signatures;
                if (asignature != null && asignature.length != 0)
                {
                    MessageDigest messagedigest;
                    try
                    {
                        messagedigest = MessageDigest.getInstance("SHA-1");
                    }
                    // Misplaced declaration of an exception variable
                    catch (Context context)
                    {
                        return null;
                    }
                    messagedigest.update(((PackageInfo) (context)).signatures[0].toByteArray());
                    return Base64.encodeToString(messagedigest.digest(), 9);
                }
            }
        }
        return null;
    }

    public static boolean e()
    {
        return c;
    }

    public static String f()
    {
        return d;
    }

    public static long g()
    {
        return i.get();
    }

    public static boolean h()
    {
        return j;
    }

    public static String i()
    {
        return e;
    }

    public static String j()
    {
        return f;
    }

    private static Executor k()
    {
        Object obj;
        try
        {
            obj = android/os/AsyncTask.getField("THREAD_POOL_EXECUTOR");
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return null;
        }
        try
        {
            obj = ((Field) (obj)).get(null);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return null;
        }
        if (obj == null)
        {
            return null;
        }
        if (!(obj instanceof Executor))
        {
            return null;
        } else
        {
            return (Executor)obj;
        }
    }

    static 
    {
        aph.getCanonicalName();
        a = new HashSet(Arrays.asList(new LoggingBehavior[] {
            LoggingBehavior.f
        }));
        Uri.parse("content://com.facebook.katana.provider.AttributionIdProvider");
    }
}
