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
import com.facebook.a.a;
import com.facebook.b.aa;
import com.facebook.b.al;
import com.facebook.b.ar;
import com.facebook.b.c;
import com.facebook.b.d;
import com.facebook.b.e;
import java.io.File;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook:
//            aq, t, u, v, 
//            an, o, GraphRequest, ak, 
//            m

public final class s
{

    private static final String a = com/facebook/s.getCanonicalName();
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
    private static final BlockingQueue o = new LinkedBlockingQueue(10);
    private static final ThreadFactory p = new t();
    private static Boolean q = Boolean.valueOf(false);

    public s()
    {
    }

    public static void a(Context context)
    {
        com/facebook/s;
        JVM INSTR monitorenter ;
        boolean flag = q.booleanValue();
        if (!flag) goto _L2; else goto _L1
_L1:
        com/facebook/s;
        JVM INSTR monitorexit ;
        return;
_L2:
        ar.a(context, "applicationContext");
        ar.b(context, false);
        ar.a(context, false);
        l = context.getApplicationContext();
        c(l);
        al.a(l, d);
        aa.b();
        com.facebook.b.e.a(l);
        k = l.getCacheDir();
        context = new FutureTask(new u());
        d().execute(context);
        q = Boolean.valueOf(true);
        if (true) goto _L1; else goto _L3
_L3:
        context;
        throw context;
    }

    public static void a(Context context, String s1)
    {
        context = context.getApplicationContext();
        d().execute(new v(context, s1));
    }

    public static boolean a()
    {
        com/facebook/s;
        JVM INSTR monitorenter ;
        boolean flag = q.booleanValue();
        com/facebook/s;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public static boolean a(aq aq1)
    {
        HashSet hashset = b;
        hashset;
        JVM INSTR monitorenter ;
        boolean flag;
        if (b() && b.contains(aq1))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        hashset;
        JVM INSTR monitorexit ;
        return flag;
        aq1;
        hashset;
        JVM INSTR monitorexit ;
        throw aq1;
    }

    static an b(Context context, String s1)
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
                al.a("Facebook-publish", context);
            }
            return new an(null, null, new o(null, context));
        }
        String s2;
        String s3;
        SharedPreferences sharedpreferences;
        String s4;
        d d1;
        long l1;
        d1 = com.facebook.b.d.a(context);
        sharedpreferences = context.getSharedPreferences("com.facebook.sdk.attributionTracking", 0);
        s2 = (new StringBuilder()).append(s1).append("ping").toString();
        s3 = (new StringBuilder()).append(s1).append("json").toString();
        l1 = sharedpreferences.getLong(s2, 0L);
        s4 = sharedpreferences.getString(s3, null);
        context = com.facebook.b.a.a(c.a, d1, com.facebook.a.a.c(context), b(context), context);
        s1 = com.facebook.GraphRequest.a(null, String.format("%s/activities", new Object[] {
            s1
        }), context, null);
        if (l1 == 0L) goto _L2; else goto _L1
_L1:
        if (s4 == null) goto _L4; else goto _L3
_L3:
        context = new JSONObject(s4);
_L6:
        if (context != null)
        {
            break MISSING_BLOCK_LABEL_231;
        }
        return (an)com.facebook.an.a("true", null, new ak(new GraphRequest[] {
            s1
        })).get(0);
        context;
        throw new m("An error occurred while publishing install.", context);
        return new an(null, null, null, context);
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
        ar.b();
        return context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("limitEventUsage", false);
    }

    static void c(Context context)
    {
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
                if (d == null)
                {
                    Object obj = ((ApplicationInfo) (context)).metaData.get("com.facebook.sdk.ApplicationId");
                    if (obj instanceof String)
                    {
                        d = (String)obj;
                    } else
                    if (obj instanceof Integer)
                    {
                        d = obj.toString();
                    }
                }
                if (e == null)
                {
                    e = ((ApplicationInfo) (context)).metaData.getString("com.facebook.sdk.ApplicationName");
                }
                if (f == null)
                {
                    f = ((ApplicationInfo) (context)).metaData.getString("com.facebook.sdk.ClientToken");
                    return;
                }
            }
        }
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
        executor = k();
        Object obj;
        obj = executor;
        if (executor != null)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        obj = new ThreadPoolExecutor(5, 128, 1L, TimeUnit.SECONDS, o, p);
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
        ar.b();
        return l;
    }

    public static long g()
    {
        ar.b();
        return h.get();
    }

    public static String h()
    {
        ar.b();
        return d;
    }

    public static String i()
    {
        ar.b();
        return f;
    }

    public static int j()
    {
        ar.b();
        return m;
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
        b = new HashSet(Arrays.asList(new aq[] {
            aq.f
        }));
    }
}
