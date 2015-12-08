// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Base64;
import com.facebook.internal.BoltsMeasurementEventListener;
import com.facebook.internal.N;
import com.facebook.internal.U;
import com.facebook.internal.Y;
import java.io.File;
import java.lang.reflect.Field;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

// Referenced classes of package com.facebook:
//            G, t, u

public final class s
{
    public static interface a
    {
    }


    private static final String a = com/facebook/s.getCanonicalName();
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
    private static final ThreadFactory q = new t();
    private static Boolean r = Boolean.valueOf(false);

    public s()
    {
    }

    public static void a(Context context)
    {
        com/facebook/s;
        JVM INSTR monitorenter ;
        d(context);
        com/facebook/s;
        JVM INSTR monitorexit ;
        return;
        context;
        throw context;
    }

    public static boolean a()
    {
        com/facebook/s;
        JVM INSTR monitorenter ;
        boolean flag = r.booleanValue();
        com/facebook/s;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public static boolean a(int i1)
    {
        return i1 >= n && i1 < n + 100;
    }

    public static boolean a(G g1)
    {
        HashSet hashset = b;
        hashset;
        JVM INSTR monitorenter ;
        boolean flag;
        if (j && b.contains(g1))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        hashset;
        JVM INSTR monitorexit ;
        return flag;
        g1;
        hashset;
        JVM INSTR monitorexit ;
        throw g1;
    }

    public static boolean b()
    {
        return j;
    }

    public static boolean b(Context context)
    {
        Y.b();
        return context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("limitEventUsage", false);
    }

    public static String c(Context context)
    {
        Y.b();
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

    public static boolean c()
    {
        return k;
    }

    public static Executor d()
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

    private static void d(Context context)
    {
        com/facebook/s;
        JVM INSTR monitorenter ;
        boolean flag = r.booleanValue();
        if (!flag) goto _L2; else goto _L1
_L1:
        com/facebook/s;
        JVM INSTR monitorexit ;
        return;
_L2:
        Y.a(context, "applicationContext");
        Y.b(context, false);
        Y.a(context, false);
        context = context.getApplicationContext();
        m = context;
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_73;
        }
        context = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_73;
        }
        if (((ApplicationInfo) (context)).metaData != null)
        {
            break; /* Loop/switch isn't completed */
        }
_L8:
        U.a(m, d);
        N.b();
        BoltsMeasurementEventListener.a(m);
        l = m.getCacheDir();
        context = new FutureTask(new u());
        d().execute(context);
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
          goto _L8
_L7:
        if (!(obj instanceof Integer)) goto _L5; else goto _L9
_L9:
        d = obj.toString();
          goto _L5
        context;
          goto _L8
    }

    public static String e()
    {
        return h;
    }

    public static Context f()
    {
        Y.b();
        return m;
    }

    public static long g()
    {
        Y.b();
        return i.get();
    }

    public static String h()
    {
        Y.b();
        return d;
    }

    public static String i()
    {
        Y.b();
        return e;
    }

    public static String j()
    {
        Y.b();
        return f;
    }

    public static int k()
    {
        Y.b();
        return g;
    }

    public static File l()
    {
        Y.b();
        return l;
    }

    public static int m()
    {
        Y.b();
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
        b = new HashSet(Arrays.asList(new G[] {
            G.f
        }));
    }
}
