// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import android.os.Bundle;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.internal.AppEventsLoggerUtility;
import com.facebook.internal.a;
import com.facebook.internal.b;
import com.facebook.internal.i;
import com.facebook.internal.m;
import com.facebook.internal.n;
import java.io.File;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook:
//            LoggingBehavior, j, FacebookRequestError, GraphRequest, 
//            i, FacebookException, b, m, 
//            l, AccessToken, Profile

public final class g
{
    public static interface a
    {
    }


    private static final String a = com/facebook/g.getCanonicalName();
    private static final HashSet b;
    private static volatile Executor c;
    private static volatile String d;
    private static volatile String e;
    private static volatile String f;
    private static volatile int g;
    private static volatile String h = "facebook.com";
    private static AtomicLong i = new AtomicLong(0x10000L);
    private static volatile boolean j = false;
    private static boolean k = false;
    private static File l;
    private static Context m;
    private static int n = 64206;
    private static final Object o = new Object();
    private static final BlockingQueue p = new LinkedBlockingQueue(10);
    private static final ThreadFactory q = new ThreadFactory() {

        private final AtomicInteger a = new AtomicInteger(0);

        public final Thread newThread(Runnable runnable)
        {
            return new Thread(runnable, (new StringBuilder("FacebookSdk #")).append(a.incrementAndGet()).toString());
        }

    };
    private static Boolean r = Boolean.valueOf(false);

    public g()
    {
    }

    public static void a(Context context)
    {
        com/facebook/g;
        JVM INSTR monitorenter ;
        c(context);
        com/facebook/g;
        JVM INSTR monitorexit ;
        return;
        context;
        throw context;
    }

    public static void a(Context context, String s)
    {
        context = context.getApplicationContext();
        e().execute(new Runnable(context, s) {

            final Context a;
            final String b;

            public final void run()
            {
                com.facebook.g.b(a, b);
            }

            
            {
                a = context;
                b = s;
                super();
            }
        });
    }

    public static boolean a()
    {
        com/facebook/g;
        JVM INSTR monitorenter ;
        boolean flag = r.booleanValue();
        com/facebook/g;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public static boolean a(LoggingBehavior loggingbehavior)
    {
        HashSet hashset = b;
        hashset;
        JVM INSTR monitorenter ;
        boolean flag;
        if (j && b.contains(loggingbehavior))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        hashset;
        JVM INSTR monitorexit ;
        return flag;
        loggingbehavior;
        hashset;
        JVM INSTR monitorexit ;
        throw loggingbehavior;
    }

    static j b(Context context, String s)
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
                com.facebook.internal.m.a("Facebook-publish", context);
            }
            return new j(null, null, new FacebookRequestError(null, context));
        }
        String s1;
        String s2;
        SharedPreferences sharedpreferences;
        String s3;
        com.facebook.internal.a a1;
        long l1;
        a1 = com.facebook.internal.a.a(context);
        sharedpreferences = context.getSharedPreferences("com.facebook.sdk.attributionTracking", 0);
        s1 = (new StringBuilder()).append(s).append("ping").toString();
        s2 = (new StringBuilder()).append(s).append("json").toString();
        l1 = sharedpreferences.getLong(s1, 0L);
        s3 = sharedpreferences.getString(s2, null);
        context = AppEventsLoggerUtility.a(com.facebook.internal.AppEventsLoggerUtility.GraphAPIActivityType.a, a1, AppEventsLogger.d(context), b(context), context);
        s = com.facebook.GraphRequest.a(String.format("%s/activities", new Object[] {
            s
        }), context);
        if (l1 == 0L) goto _L2; else goto _L1
_L1:
        if (s3 == null) goto _L4; else goto _L3
_L3:
        context = new JSONObject(s3);
_L6:
        if (context != null)
        {
            break MISSING_BLOCK_LABEL_227;
        }
        return (j)com.facebook.j.a("true", null, new com.facebook.i(new GraphRequest[] {
            s
        })).get(0);
        context;
        throw new FacebookException("An error occurred while publishing install.", context);
        return new j(null, null, null, context);
_L2:
        context = s.a();
        s = sharedpreferences.edit();
        s.putLong(s1, System.currentTimeMillis());
        if (((j) (context)).a != null)
        {
            s.putString(s2, ((j) (context)).a.toString());
        }
        s.apply();
        return context;
_L4:
        context = null;
        continue; /* Loop/switch isn't completed */
        context;
        context = null;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public static boolean b()
    {
        return j;
    }

    public static boolean b(Context context)
    {
        com.facebook.internal.n.b();
        return context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("limitEventUsage", false);
    }

    private static void c(Context context)
    {
        com/facebook/g;
        JVM INSTR monitorenter ;
        boolean flag = r.booleanValue();
        if (!flag) goto _L2; else goto _L1
_L1:
        com/facebook/g;
        JVM INSTR monitorexit ;
        return;
_L2:
        com.facebook.internal.n.a(context, "applicationContext");
        com.facebook.internal.n.b(context);
        com.facebook.internal.n.a(context);
        context = context.getApplicationContext();
        m = context;
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_72;
        }
        context = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_72;
        }
        if (((ApplicationInfo) (context)).metaData != null)
        {
            break; /* Loop/switch isn't completed */
        }
_L10:
        com.facebook.internal.m.a(m, d);
        com.facebook.internal.i.b();
        com.facebook.internal.b.a(m);
        l = m.getCacheDir();
        context = new FutureTask(new Callable() {

            final a a = null;

            public final Object call()
                throws Exception
            {
                com.facebook.b.a().b();
                com.facebook.m m1 = com.facebook.m.a();
                Profile profile = m1.a.a();
                if (profile != null)
                {
                    m1.a(profile, false);
                }
                if (com.facebook.AccessToken.a() != null && com.facebook.Profile.a() == null)
                {
                    com.facebook.Profile.b();
                }
                return null;
            }

            
            {
                super();
            }
        });
        e().execute(context);
        r = Boolean.valueOf(true);
        if (true) goto _L1; else goto _L3
        context;
        throw context;
_L3:
        if (d != null) goto _L5; else goto _L4
_L4:
        Object obj = ((ApplicationInfo) (context)).metaData.get("com.facebook.sdk.ApplicationId");
        if (!(obj instanceof String)) goto _L7; else goto _L6
_L6:
        String s = (String)obj;
        if (!s.toLowerCase(Locale.ROOT).startsWith("fb")) goto _L9; else goto _L8
_L8:
        d = s.substring(2);
_L11:
        d = (String)obj;
_L5:
        if (e == null)
        {
            e = ((ApplicationInfo) (context)).metaData.getString("com.facebook.sdk.ApplicationName");
        }
        if (f == null)
        {
            f = ((ApplicationInfo) (context)).metaData.getString("com.facebook.sdk.ClientToken");
        }
        if (g == 0)
        {
            g = ((ApplicationInfo) (context)).metaData.getInt("com.facebook.sdk.WebDialogTheme");
        }
          goto _L10
_L9:
        d = s;
          goto _L11
_L7:
        if (!(obj instanceof Integer)) goto _L5; else goto _L12
_L12:
        throw new FacebookException("App Ids cannot be directly placed in the manfiest.They mut be prexied by 'fb' or be placed in the string resource file.");
        context;
          goto _L10
    }

    public static boolean c()
    {
        return k;
    }

    public static void d()
    {
        k = true;
    }

    public static Executor e()
    {
        Object obj1 = o;
        obj1;
        JVM INSTR monitorenter ;
        Executor executor;
        if (c != null)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        executor = n();
        Object obj;
        obj = executor;
        if (executor != null)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        obj = new ThreadPoolExecutor(5, 128, 1L, TimeUnit.SECONDS, p, q);
        c = ((Executor) (obj));
        obj1;
        JVM INSTR monitorexit ;
        return c;
        Exception exception;
        exception;
        obj1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public static String f()
    {
        return h;
    }

    public static Context g()
    {
        com.facebook.internal.n.b();
        return m;
    }

    public static String h()
    {
        return "4.5.0";
    }

    public static long i()
    {
        com.facebook.internal.n.b();
        return i.get();
    }

    public static String j()
    {
        com.facebook.internal.n.b();
        return d;
    }

    public static String k()
    {
        com.facebook.internal.n.b();
        return f;
    }

    public static int l()
    {
        com.facebook.internal.n.b();
        return g;
    }

    public static int m()
    {
        com.facebook.internal.n.b();
        return n;
    }

    private static Executor n()
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
        b = new HashSet(Arrays.asList(new LoggingBehavior[] {
            LoggingBehavior.f
        }));
    }
}
