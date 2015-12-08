// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import com.facebook.internal.BoltsMeasurementEventListener;
import com.facebook.internal.a;
import com.facebook.internal.aw;
import com.facebook.internal.bc;
import java.io.File;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook:
//            am, r, s, t, 
//            aj, n, GraphRequest, ag, 
//            l

public final class q
{

    private static final String a = com/facebook/q.getCanonicalName();
    private static final HashSet b;
    private static volatile Executor c;
    private static volatile String d;
    private static volatile String e;
    private static volatile String f;
    private static volatile String g = "facebook.com";
    private static AtomicLong h = new AtomicLong(0x10000L);
    private static volatile boolean i = false;
    private static boolean j = false;
    private static File k;
    private static Context l;
    private static int m = 64206;
    private static final Object n = new Object();
    private static final Uri o = Uri.parse("content://com.facebook.katana.provider.AttributionIdProvider");
    private static final BlockingQueue p = new LinkedBlockingQueue(10);
    private static final ThreadFactory q = new r();
    private static Boolean r = Boolean.valueOf(false);

    public q()
    {
    }

    public static void a(Context context)
    {
        com/facebook/q;
        JVM INSTR monitorenter ;
        boolean flag = r.booleanValue();
        if (!flag) goto _L2; else goto _L1
_L1:
        com/facebook/q;
        JVM INSTR monitorexit ;
        return;
_L2:
        bc.a(context, "applicationContext");
        context = context.getApplicationContext();
        l = context;
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        context = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        if (((ApplicationInfo) (context)).metaData != null)
        {
            break; /* Loop/switch isn't completed */
        }
_L4:
        aw.a(l, d);
        BoltsMeasurementEventListener.a(l);
        k = l.getCacheDir();
        context = new FutureTask(new s());
        Executors.newSingleThreadExecutor().execute(context);
        r = Boolean.valueOf(true);
        if (true) goto _L1; else goto _L3
        context;
        throw context;
_L3:
        if (d == null)
        {
            d = ((ApplicationInfo) (context)).metaData.getString("com.facebook.sdk.ApplicationId");
        }
        if (e == null)
        {
            e = ((ApplicationInfo) (context)).metaData.getString("com.facebook.sdk.ApplicationName");
        }
        if (f == null)
        {
            f = ((ApplicationInfo) (context)).metaData.getString("com.facebook.sdk.ClientToken");
        }
          goto _L4
        context;
          goto _L4
    }

    public static void a(Context context, String s1)
    {
        context = context.getApplicationContext();
        d().execute(new t(context, s1));
    }

    public static boolean a()
    {
        com/facebook/q;
        JVM INSTR monitorenter ;
        boolean flag = r.booleanValue();
        com/facebook/q;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public static boolean a(am am1)
    {
        HashSet hashset = b;
        hashset;
        JVM INSTR monitorenter ;
        boolean flag;
        if (i && b.contains(am1))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        hashset;
        JVM INSTR monitorexit ;
        return flag;
        am1;
        hashset;
        JVM INSTR monitorexit ;
        throw am1;
    }

    static aj b(Context context, String s1)
    {
        if (context == null || s1 == null)
        {
            try
            {
                throw new IllegalArgumentException("Both context and applicationId must be non-null");
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                aw.a("Facebook-publish", context);
            }
            return new aj(null, null, new n(null, context));
        }
        String s2;
        String s3;
        SharedPreferences sharedpreferences;
        String s4;
        a a1;
        JSONObject jsonobject;
        long l1;
        a1 = com.facebook.internal.a.a(context);
        sharedpreferences = context.getSharedPreferences("com.facebook.sdk.attributionTracking", 0);
        s2 = (new StringBuilder()).append(s1).append("ping").toString();
        s3 = (new StringBuilder()).append(s1).append("json").toString();
        l1 = sharedpreferences.getLong(s2, 0L);
        s4 = sharedpreferences.getString(s3, null);
        jsonobject = new JSONObject();
        jsonobject.put("event", "MOBILE_APP_INSTALL");
        aw.a(jsonobject, a1, com.facebook.a.a.d(context), b(context));
        jsonobject.put("application_package_name", context.getPackageName());
        s1 = com.facebook.GraphRequest.a(String.format("%s/activities", new Object[] {
            s1
        }), jsonobject);
        if (l1 == 0L) goto _L2; else goto _L1
_L1:
        if (s4 == null) goto _L4; else goto _L3
_L3:
        context = new JSONObject(s4);
_L6:
        if (context != null)
        {
            break MISSING_BLOCK_LABEL_264;
        }
        return (aj)com.facebook.aj.a("true", null, new ag(new GraphRequest[] {
            s1
        })).get(0);
        context;
        throw new l("An error occurred while publishing install.", context);
        return new aj(null, null, null, context);
_L2:
        context = s1.g();
        s1 = sharedpreferences.edit();
        s1.putLong(s2, System.currentTimeMillis());
        if (context.b() != null)
        {
            s1.putString(s3, context.b().toString());
        }
        s1.apply();
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
        return i;
    }

    public static boolean b(Context context)
    {
        bc.a();
        return context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("limitEventUsage", false);
    }

    public static boolean c()
    {
        return j;
    }

    public static Executor d()
    {
        Object obj1 = n;
        obj1;
        JVM INSTR monitorenter ;
        Executor executor;
        if (c != null)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        executor = l();
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

    public static String e()
    {
        return g;
    }

    public static Context f()
    {
        bc.a();
        return l;
    }

    public static long g()
    {
        bc.a();
        return h.get();
    }

    public static String h()
    {
        bc.a();
        return d;
    }

    public static String i()
    {
        bc.a();
        return f;
    }

    public static File j()
    {
        bc.a();
        return k;
    }

    public static int k()
    {
        bc.a();
        return m;
    }

    private static Executor l()
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
        b = new HashSet(Arrays.asList(new am[] {
            am.f
        }));
    }
}
