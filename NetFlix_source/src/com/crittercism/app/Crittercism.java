// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crittercism.app;

import android.app.AlertDialog;
import android.content.Context;
import android.os.ConditionVariable;
import android.util.Log;
import crittercism.android.ab;
import crittercism.android.ae;
import crittercism.android.af;
import crittercism.android.ai;
import crittercism.android.ap;
import crittercism.android.aq;
import crittercism.android.as;
import crittercism.android.at;
import crittercism.android.i;
import crittercism.android.j;
import crittercism.android.l;
import crittercism.android.m;
import crittercism.android.n;
import crittercism.android.u;
import crittercism.android.v;
import crittercism.android.x;
import java.io.File;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONObject;

// Referenced classes of package com.crittercism.app:
//            CrittercismConfig, CritterRateMyAppButtons

public class Crittercism
{

    private Crittercism()
    {
    }

    public static boolean didCrashOnLastAppLoad()
    {
        boolean flag;
        try
        {
            flag = l.i().p;
        }
        catch (Exception exception)
        {
            return false;
        }
        return flag;
    }

    public static AlertDialog generateRateMyAppAlertDialog(Context context)
    {
        String s1 = null;
        l l1 = l.i();
        aq aq1 = l1.e.e();
        String s;
        if (aq1 != null)
        {
            s = aq1.f;
        } else
        {
            s = null;
        }
        if (aq1 != null)
        {
            s1 = aq1.g;
        }
        return l1.a(context, s1, s);
    }

    public static AlertDialog generateRateMyAppAlertDialog(Context context, String s, String s1)
    {
        return l.i().a(context, s, s1);
    }

    public static String getNotificationTitle()
    {
        return l.i().t.getNotificationTitle();
    }

    public static boolean getOptOutStatus()
    {
        Log.w("Crittercism", "getOptOutStatus: This method is deprecated!");
        return l.i().e.d();
    }

    public static String getUserUUID()
    {
        ExecutorService executorservice;
        FutureTask futuretask;
        futuretask = new FutureTask(new Callable() {

            private static String a()
            {
                Object obj1 = l.i();
                if (((l) (obj1)).f == null)
                {
                    return null;
                }
                String s;
                try
                {
                    s = ((l) (obj1)).a(ae.g.a(), ae.g.b(), null);
                }
                catch (Exception exception1)
                {
                    (new StringBuilder("Exception in getUserUUID.call(): ")).append(exception1.getClass().getName());
                    return null;
                }
                if (s != null)
                {
                    break MISSING_BLOCK_LABEL_47;
                }
                obj1 = ((l) (obj1)).a("com.crittercism.prefs", "com.crittercism.prefs.did", null);
                return ((String) (obj1));
                return s;
            }

            public final Object call()
            {
                return a();
            }

        });
        executorservice = l.i().l;
        executorservice.execute(futuretask);
        Object obj = null;
        try
        {
            while (!futuretask.isDone()) 
            {
                obj = (String)futuretask.get(2500L, TimeUnit.MILLISECONDS);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            obj = null;
        }
        catch (Exception exception)
        {
            (new StringBuilder("Exception in getUserUUID: ")).append(exception.getClass().getName());
            return null;
        }
        return ((String) (obj));
    }

    public static transient boolean init(Context context, String s, JSONObject ajsonobject[])
    {
        boolean flag = false;
        com/crittercism/app/Crittercism;
        JVM INSTR monitorenter ;
        if (!s.contains("CRITTERCISM_APP_ID")) goto _L2; else goto _L1
_L1:
        Log.e("Crittercism", "ERROR: Crittercism will not work unless you enter a valid Crittercism App ID. Check your settings page to find the ID.");
_L4:
        com/crittercism/app/Crittercism;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        JSONObject jsonobject = new JSONObject();
        if (ajsonobject.length > 0)
        {
            jsonobject = ajsonobject[0];
        }
        initialize(context, s, new CrittercismConfig(jsonobject));
        flag = didCrashOnLastAppLoad();
        if (true) goto _L4; else goto _L3
_L3:
        context;
        throw context;
    }

    public static void initialize(Context context, String s)
    {
        com/crittercism/app/Crittercism;
        JVM INSTR monitorenter ;
        initialize(context, s, new CrittercismConfig());
        com/crittercism/app/Crittercism;
        JVM INSTR monitorexit ;
        return;
        context;
        throw context;
    }

    public static void initialize(Context context, String s, CrittercismConfig crittercismconfig)
    {
        com/crittercism/app/Crittercism;
        JVM INSTR monitorenter ;
        if (!s.contains("CRITTERCISM_APP_ID")) goto _L2; else goto _L1
_L1:
        Log.e("Crittercism", "ERROR: Crittercism will not work unless you enter a valid Crittercism App ID. Check your settings page to find the ID.");
_L4:
        com/crittercism/app/Crittercism;
        JVM INSTR monitorexit ;
        return;
_L2:
        boolean flag = l.i().b;
        if (flag) goto _L4; else goto _L3
_L3:
        l l1;
        l1 = l.i();
        l1.t = new m(crittercismconfig);
        l1.b = true;
        l1.f = context;
        l1.g = new n(l1.t);
        l1.h = new x(l1.t);
        l1.i = new u(l1.t);
        l1.j = new v(l1.t);
        crittercismconfig = (new StringBuilder()).append(l1.f.getFilesDir().getAbsolutePath()).append("/").toString();
        l1.s = new File((new StringBuilder()).append(crittercismconfig).append("didCrash.txt").toString());
        if (l1.s == null)
        {
            break MISSING_BLOCK_LABEL_323;
        }
        flag = l1.s.exists();
_L5:
        l1.p = flag;
        l1.k = new ai(l1);
        l1.c = new i(context, s, "3.1.4", l1.t);
        context = Thread.getDefaultUncaughtExceptionHandler();
        if (!(context instanceof j))
        {
            Thread.setDefaultUncaughtExceptionHandler(new j(context));
        }
        l1.r = new Thread(l1.k);
        l1.r.start();
        Log.i("CrittercismInstance", "Crittercism Initialized.");
          goto _L4
        context;
        (new StringBuilder("Exception in init > getInstance().initialize(..): ")).append(context.getClass().getName());
          goto _L4
        context;
        throw context;
        flag = false;
          goto _L5
    }

    public static void leaveBreadcrumb(String s)
    {
        com/crittercism/app/Crittercism;
        JVM INSTR monitorenter ;
        if (s != null) goto _L2; else goto _L1
_L1:
        Log.w("Crittercism", "Cannot leave null breadcrumb");
_L4:
        com/crittercism/app/Crittercism;
        JVM INSTR monitorexit ;
        return;
_L2:
        l.i().a(s);
        if (true) goto _L4; else goto _L3
_L3:
        s;
        throw s;
    }

    public static void logHandledException(Throwable throwable)
    {
        com/crittercism/app/Crittercism;
        JVM INSTR monitorenter ;
        boolean flag = l.i().e.d();
        if (!flag) goto _L2; else goto _L1
_L1:
        com/crittercism/app/Crittercism;
        JVM INSTR monitorexit ;
        return;
_L2:
        l l1;
        l1 = l.i();
        if (l1.i.h() >= 50 || l1.i.f().size() >= 5 || l1.i.f().size() + l1.i.h() >= 50)
        {
            continue; /* Loop/switch isn't completed */
        }
        l1.i.a(throwable);
        try
        {
            if (l1.i.a())
            {
                (new af(l1.i)).a();
            }
        }
        // Misplaced declaration of an exception variable
        catch (Throwable throwable)
        {
            try
            {
                (new StringBuilder("Exception in logHandledException: ")).append(throwable.getClass().getName());
            }
            // Misplaced declaration of an exception variable
            catch (Throwable throwable) { }
            finally
            {
                com/crittercism/app/Crittercism;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
        JVM INSTR monitorexit ;
        throw throwable;
    }

    public static void performRateMyAppButtonAction(CritterRateMyAppButtons critterratemyappbuttons)
    {
        if (!l.i().e.d()) goto _L2; else goto _L1
_L1:
        Log.w("Crittercism", "User has opted out of crittercism.  performRateMyAppButtonAction exiting.");
_L4:
        return;
_L2:
        l l1 = l.i();
        if (android.os.Build.VERSION.SDK_INT < 5)
        {
            Log.w("Crittercism", "Rate my app not supported below api level 5");
            return;
        }
        String s = l1.p();
        if (s == null)
        {
            Log.e("Crittercism", "Cannot create proper URI to open app market.  Returning null.");
            return;
        }
        switch (crittercism.android.l._cls9.a[critterratemyappbuttons.ordinal()])
        {
        default:
            return;

        case 3: // '\003'
            break;

        case 1: // '\001'
            try
            {
                l1.b(s);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (CritterRateMyAppButtons critterratemyappbuttons)
            {
                Log.w("Crittercism", "performRateMyAppButtonAction(CritterRateMyAppButtons.YES) failed.  Email support@crittercism.com.");
            }
            return;

        case 2: // '\002'
            try
            {
                l1.o();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (CritterRateMyAppButtons critterratemyappbuttons)
            {
                Log.w("Crittercism", "performRateMyAppButtonAction(CritterRateMyAppButtons.NO) failed.  Email support@crittercism.com.");
            }
            break; /* Loop/switch isn't completed */
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static void sendAppLoadData()
    {
        if (!l.i().t.delaySendingAppLoad())
        {
            break MISSING_BLOCK_LABEL_46;
        }
        if (l.i().e.d())
        {
            return;
        }
        try
        {
            (new Thread(new crittercism.android.l._cls1(l.i()))).start();
            return;
        }
        catch (Exception exception)
        {
            return;
        }
        Log.i("Crittercism", "sendAppLoadData() will only send data to Crittercism if \"delaySendingAppLoad\" is set to true in the configuration settings you include in the init call.");
        return;
    }

    public static void setMetadata(JSONObject jsonobject)
    {
        try
        {
            if (l.i().e.d())
            {
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            return;
        }
        l.i().c.c(jsonobject);
        if (l.i().b)
        {
            jsonobject = l.i().c.j();
            (new Thread(new crittercism.android.l._cls3(l.i(), jsonobject))).start();
            return;
        }
        Log.e("Crittercism", "Initialize the Crittercism library before using its methods.");
        return;
    }

    public static void setOptOutStatus(boolean flag)
    {
        (new Thread(new Runnable(flag) {

            final boolean a;

            public final void run()
            {
                ab ab1;
                ai ai1;
                l l1;
                l1 = l.i();
                ai1 = l1.k;
                ab1 = null;
                at at1 = l1.e;
                ai1;
                JVM INSTR monitorenter ;
                if (!ai1.a())
                {
                    ab1 = new ab(new ConditionVariable(ai1.a()), at1);
                    ai1.a(ab1);
                }
                ai1;
                JVM INSTR monitorexit ;
                if (ab1 != null)
                {
                    ab1.a();
                }
                at1.c().a(a);
                at1.c().a(l1, ae.f.a(), ae.f.b());
                return;
                Exception exception;
                exception;
                throw exception;
            }

            
            {
                a = flag;
                super();
            }
        })).start();
    }

    public static void setUsername(String s)
    {
        if (!l.i().b)
        {
            break MISSING_BLOCK_LABEL_78;
        }
        if (l.i().e.d())
        {
            return;
        }
        try
        {
            if (l.i().d == null)
            {
                l.i().d = new as();
            }
            l.i().d.a = s;
            JSONObject jsonobject = l.i().c.j();
            jsonobject.put("username", s);
            setMetadata(jsonobject);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return;
        }
        Log.e("Crittercism", "Initialize the Crittercism library before using its methods.");
        return;
    }
}
