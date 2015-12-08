// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crittercism.app;

import android.app.Application;
import android.content.Context;
import android.os.Looper;
import android.os.MessageQueue;
import b.a.ab;
import b.a.af;
import b.a.ag;
import b.a.ay;
import b.a.az;
import b.a.bk;
import b.a.cs;
import b.a.du;
import b.a.ei;
import b.a.en;
import b.a.et;
import b.a.eu;
import b.a.ew;
import b.a.fa;
import b.a.k;
import b.a.m;
import b.a.p;
import b.a.q;
import b.a.y;
import b.a.z;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.crittercism.app:
//            CrittercismConfig

public class Crittercism
{

    private Crittercism()
    {
    }

    public static void a(Context context, String s, CrittercismConfig crittercismconfig)
    {
        com/crittercism/app/Crittercism;
        JVM INSTR monitorenter ;
        if (s != null) goto _L2; else goto _L1
_L1:
        f(java/lang/String.getCanonicalName());
_L3:
        com/crittercism/app/Crittercism;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (context != null)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        f(android/content/Context.getCanonicalName());
          goto _L3
        context;
        throw new IllegalArgumentException((new StringBuilder("Crittercism cannot be initialized. ")).append(context.getMessage()).toString());
        context;
        com/crittercism/app/Crittercism;
        JVM INSTR monitorexit ;
        throw context;
        if (crittercismconfig != null) goto _L5; else goto _L4
_L4:
        f(com/crittercism/app/CrittercismConfig.getCanonicalName());
          goto _L3
        context;
        throw context;
_L5:
        if (q.A().b) goto _L3; else goto _L6
_L6:
        q q1;
        long l2;
        l2 = System.nanoTime();
        q1 = q.A();
        eu.a((new StringBuilder("Initializing Crittercism 5.3.3 for App ID ")).append(s).toString());
        ay ay1 = new ay(s);
        q1.d = s;
        q1.z = new ab(ay1, crittercismconfig);
        q1.c = context;
        q1.v = new k(q1.c, q1.z);
        q1.y = context.getPackageName();
        q1.B = new en(context);
        q1.C();
        long l = 0xdf8475800L;
        if (q1.x)
        {
            l = 0x2cb417800L;
        }
        q1.q = new du(l);
        if (!q.B())
        {
            eu.c("Crittercism should be initialized in onCreate() of MainActivity");
        }
        bk.a(q1.v);
        bk.a(q1.c);
        bk.a(new cs());
        bk.a(new af(q1.c, q1.z));
        s = new Thread(new y((byte)0));
        s.start();
        s.join();
_L9:
        q1.r = new ei(q1.z, context, q1, q1, q1);
        if (!q1.x)
        {
            eu.a(new fa(q1, q1.u, q1.r, q1.g));
        }
        context = Thread.getDefaultUncaughtExceptionHandler();
        if (!(context instanceof p))
        {
            Thread.setDefaultUncaughtExceptionHandler(new p(q1, context));
        }
        if (android.os.Build.VERSION.SDK_INT < 14)
        {
            break MISSING_BLOCK_LABEL_539;
        }
        if (q1.c instanceof Application) goto _L8; else goto _L7
_L7:
        eu.c("Application context not provided. Automatic breadcrumbs will not be recorded.");
_L10:
        if (!q1.x)
        {
            ag.b(q1);
            if (Looper.myLooper() == Looper.getMainLooper())
            {
                Looper.myQueue().addIdleHandler(new z((byte)0));
            }
        }
        (new ew(q1.r)).start();
        q1.b = true;
        long l1 = (System.nanoTime() - l2) / 0xf4240L;
        (new StringBuilder("Crittercism finished initializing in ")).append(l1).append("ms");
        eu.b();
          goto _L3
        context;
        eu.a(context);
          goto _L3
        s;
        eu.a(s);
          goto _L9
_L8:
        eu.b();
        ((Application)q1.c).registerActivityLifecycleCallbacks(new m(q1.c, q1));
          goto _L10
        eu.a("API Level is less than 14. Automatic breadcrumbs are not supported.");
          goto _L10
    }

    public static void a(String s)
    {
        if (!q.A().b)
        {
            g("setUsername");
            return;
        }
        if (s == null)
        {
            JSONObject jsonobject;
            try
            {
                eu.c("Crittercism.setUsername() given invalid parameter: null");
                return;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                eu.a(s);
            }
            break MISSING_BLOCK_LABEL_60;
        }
        jsonobject = new JSONObject();
        jsonobject.putOpt("username", s);
        q.A().a(jsonobject);
        return;
        return;
        s;
        eu.b("Crittercism.setUsername()", s);
        return;
    }

    public static void a(Throwable throwable)
    {
        if (!q.A().b)
        {
            g("logHandledException");
            return;
        }
        try
        {
            if (!q.A().g.b())
            {
                q.A().b(throwable);
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (Throwable throwable)
        {
            throw throwable;
        }
        // Misplaced declaration of an exception variable
        catch (Throwable throwable)
        {
            eu.a(throwable);
        }
        return;
    }

    public static void a(JSONObject jsonobject)
    {
        if (!q.A().b)
        {
            g("setMetadata");
            return;
        }
        try
        {
            q.A().a(jsonobject);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            throw jsonobject;
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            eu.a(jsonobject);
        }
        return;
    }

    public static void b(String s)
    {
        if (!q.A().b)
        {
            g("leaveBreadcrumb");
            return;
        }
        if (s == null)
        {
            try
            {
                eu.b("Cannot leave null breadcrumb", new NullPointerException());
                return;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                eu.a(s);
            }
            break MISSING_BLOCK_LABEL_50;
        }
        q.A().a(s);
        return;
    }

    public static void c(String s)
    {
        try
        {
            q.A().b(s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            eu.a(s);
        }
    }

    public static void d(String s)
    {
        try
        {
            q.A().c(s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            eu.a(s);
        }
    }

    public static void e(String s)
    {
        try
        {
            q.A().d(s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            eu.a(s);
        }
    }

    private static void f(String s)
    {
        eu.b("Crittercism cannot be initialized", new NullPointerException((new StringBuilder()).append(s).append(" was null").toString()));
    }

    private static void g(String s)
    {
        eu.b((new StringBuilder("Must initialize Crittercism before calling ")).append(com/crittercism/app/Crittercism.getName()).append(".").append(s).append("().  Request is being ignored...").toString(), new IllegalStateException());
    }
}
