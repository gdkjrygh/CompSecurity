// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import com.crittercism.app.CritterRateMyAppButtons;
import java.io.File;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONObject;

// Referenced classes of package crittercism.android:
//            g, h, at, q, 
//            ae, m, i, w, 
//            af, aq, v, am, 
//            ak, aj, as, n, 
//            x, u, ai, c

public final class l
    implements g, h
{

    static l a;
    public boolean b;
    public i c;
    public as d;
    public at e;
    public Context f;
    public n g;
    public x h;
    public u i;
    public v j;
    public ai k;
    public ExecutorService l;
    public q m;
    public q n;
    public q o;
    public boolean p;
    public boolean q;
    public Thread r;
    public File s;
    public m t;
    private c u;
    private ExecutorService v;
    private boolean w;
    private String x;

    private l()
    {
        b = false;
        d = null;
        e = new at();
        f = null;
        u = null;
        k = null;
        l = Executors.newCachedThreadPool();
        v = Executors.newSingleThreadExecutor();
        m = new q(100, true, ae.a.b(), new w.a());
        n = new q(100, false, ae.b.b(), new w.a());
        o = new q(10, false, ae.c.b(), new b.a());
        w = false;
        p = false;
        q = false;
        x = "";
        r = null;
        s = null;
        t = new m();
    }

    public static l i()
    {
        if (a == null)
        {
            a = new l();
        }
        return a;
    }

    public final int a(String s1, String s2)
    {
        int i1 = 0;
        s1 = f.getSharedPreferences(s1, 0);
        if (s1 != null)
        {
            i1 = s1.getInt(s2, 0);
        }
        return i1;
    }

    public final AlertDialog a(Context context, String s1, String s2)
    {
        boolean flag = false;
        if (e.d())
        {
            Log.e("CrittercismInstance", "User has opted out of crittercism.  generateRateMyAppAlertDialog returning null.");
        } else
        if (!(context instanceof Activity))
        {
            Log.e("CrittercismInstance", "Context object must be an instance of Activity for AlertDialog to form correctly.  generateRateMyAppAlertDialog returning null.");
        } else
        if (s2 == null || s2 != null && s2.length() == 0)
        {
            Log.e("CrittercismInstance", "Message has to be a non-empty string.  generateRateMyAppAlertDialog returning null.");
        } else
        if (android.os.Build.VERSION.SDK_INT < 5)
        {
            Log.e("Crittercism", "Rate my app not supported below api level 5");
        } else
        {
            flag = true;
        }
        if (!flag)
        {
            return null;
        }
        String s3 = p();
        if (s3 == null)
        {
            Log.e("Crittercism", "Cannot create proper URI to open app market.  Returning null.");
            return null;
        }
        context = new android.app.AlertDialog.Builder(context);
        context.setTitle(s1).setMessage(s2);
        try
        {
            context = context.create();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.e("Crittercism", "Failed to create AlertDialog instance from AlertDialog.Builder.  Did you remember to call Looper.prepare() before calling Crittercism.generateRateMyAppAlertDialog()?");
            return null;
        }
        context.setButton(-1, "Yes", new android.content.DialogInterface.OnClickListener(s3) {

            final String a;
            final l b;

            public final void onClick(DialogInterface dialoginterface, int i1)
            {
                try
                {
                    l.i().b(a);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (DialogInterface dialoginterface)
                {
                    Log.w("CrittercismInstance", "YES button failed.  Email support@crittercism.com.");
                }
            }

            
            {
                b = l.this;
                a = s1;
                super();
            }
        });
        context.setButton(-2, "No", new android.content.DialogInterface.OnClickListener() {

            final l a;

            public final void onClick(DialogInterface dialoginterface, int i1)
            {
                try
                {
                    l.i().o();
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (DialogInterface dialoginterface)
                {
                    Log.w("CrittercismInstance", "NO button failed.  Email support@crittercism.com.");
                }
            }

            
            {
                a = l.this;
                super();
            }
        });
        context.setButton(-3, "Maybe Later", new android.content.DialogInterface.OnClickListener() {

            final l a;

            public final void onClick(DialogInterface dialoginterface, int i1)
            {
                try
                {
                    l.i();
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (DialogInterface dialoginterface)
                {
                    Log.w("CrittercismInstance", "MAYBE LATER button failed.  Email support@crittercism.com.");
                }
            }

            
            {
                a = l.this;
                super();
            }
        });
        return context;
    }

    public final String a()
    {
        if (c == null)
        {
            Log.w("CrittercismInstance", "Failed to get app id.  Please contact us at support@crittercism.com.");
            return new String();
        } else
        {
            return c.a();
        }
    }

    public final String a(String s1, String s2, String s3)
    {
        s1 = f.getSharedPreferences(s1, 0);
        if (s1 != null)
        {
            return s1.getString(s2, s3);
        } else
        {
            return null;
        }
    }

    public final void a(String s1)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = e.d();
        if (!flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        s1 = new w(s1);
        m.a(s1);
        if (true) goto _L1; else goto _L3
_L3:
        s1;
        throw s1;
    }

    public final void a(String s1, String s2, int i1)
    {
        s1 = f.getSharedPreferences(s1, 0);
        if (s1 != null)
        {
            s1 = s1.edit();
            if (s1 != null)
            {
                s1.remove(s2);
                s1.putInt(s2, i1);
                s1.commit();
            }
        }
    }

    public final void a(String s1, String s2, boolean flag)
    {
        s1 = f.getSharedPreferences(s1, 0);
        if (s1 != null)
        {
            s1 = s1.edit();
            if (s1 != null)
            {
                s1.remove(s2);
                s1.putBoolean(s2, flag);
                s1.commit();
            }
        }
    }

    public final void a(boolean flag)
    {
        (new af(g, flag)).a();
        (new af(h, flag)).a();
        (new af(i, flag)).a();
    }

    public final String b()
    {
        return c.k();
    }

    public final void b(String s1)
    {
        e.e().b = true;
        (new Thread(new Runnable() {

            final l a;

            public final void run()
            {
                a.e.e().a(l.a, ae.d.a(), ae.d.b());
            }

            
            {
                a = l.this;
                super();
            }
        })).start();
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setFlags(0x10000000);
        intent.setData(Uri.parse(s1));
        f.startActivity(intent);
    }

    public final void b(String s1, String s2, String s3)
    {
        s1 = f.getSharedPreferences(s1, 0);
        if (s1 != null)
        {
            s1 = s1.edit();
            if (s1 != null)
            {
                s1.remove(s2);
                s1.putString(s2, s3);
                s1.commit();
            }
        }
    }

    public final boolean b(String s1, String s2)
    {
        boolean flag = false;
        s1 = f.getSharedPreferences(s1, 0);
        if (s1 != null)
        {
            flag = s1.getBoolean(s2, false);
        }
        return flag;
    }

    public final String c()
    {
        if (c == null)
        {
            Log.w("CrittercismInstance", "Failed to get hashed device id.  Please contact us at support@crittercism.com.");
            return new String();
        } else
        {
            return c.c();
        }
    }

    public final int d()
    {
        if (c == null)
        {
            Log.w("CrittercismInstance", "Failed to get session id.  Please contact us at support@crittercism.com.");
            return -1;
        } else
        {
            return c.b();
        }
    }

    public final String e()
    {
        if (c == null)
        {
            Log.w("CrittercismInstance", "Failed to get carrier.  Please contact us at support@crittercism.com.");
            return new String();
        } else
        {
            return c.e();
        }
    }

    public final String f()
    {
        return "Android";
    }

    public final String g()
    {
        return Build.MODEL;
    }

    public final String h()
    {
        return android.os.Build.VERSION.RELEASE;
    }

    public final String j()
    {
        try
        {
            if (x == null || x.equals(""))
            {
                x = f.getPackageName();
            }
        }
        catch (Exception exception)
        {
            Log.w("CrittercismInstance", "Call to getPackageName() failed.  Please contact us at support@crittercism.com.");
            x = new String();
        }
        return x;
    }

    public final boolean k()
    {
        Object obj;
        ExecutorService executorservice;
        boolean flag;
        boolean flag2;
        flag2 = true;
        flag = false;
        obj = new FutureTask(new Callable() {

            final l a;

            private Boolean a()
            {
                try
                {
                    l.i().j = crittercism.android.v.a(a.t);
                    (new StringBuilder("pendingNdkCrashes.getPendingDataVector().size = ")).append(l.i().j.f().size());
                }
                catch (Exception exception)
                {
                    (new StringBuilder("Exception in startNdkSendingThreads boolean callable: ")).append(exception.getClass().getName());
                    exception.printStackTrace();
                }
                if (l.i().j.f().size() == 0)
                {
                    return Boolean.valueOf(true);
                }
                break MISSING_BLOCK_LABEL_94;
                Exception exception1;
                exception1;
                return Boolean.valueOf(l.i().l());
            }

            public final Object call()
            {
                return a();
            }

            
            {
                a = l.this;
                super();
            }
        });
        executorservice = Executors.newFixedThreadPool(10);
        executorservice.execute(((Runnable) (obj)));
        boolean flag1 = false;
        StringBuilder stringbuilder;
        try
        {
            while (!((FutureTask) (obj)).isDone()) 
            {
                flag1 = ((Boolean)((FutureTask) (obj)).get(8000L, TimeUnit.MILLISECONDS)).booleanValue();
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            flag = true;
            flag1 = flag2;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            flag1 = false;
        }
        if (flag)
        {
            try
            {
                j.a();
                j.g();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                (new StringBuilder("Exception in startNdkSendingThreads when attempting to flush pending ndk crashes: ")).append(obj.getClass().getName());
            }
        }
        stringbuilder = new StringBuilder("sentNdkCrashes = ");
        if (flag1)
        {
            obj = "TRUE";
        } else
        {
            obj = "FALSE";
        }
        stringbuilder.append(((String) (obj)));
        return flag1;
    }

    public final boolean l()
    {
        JSONObject jsonobject;
        boolean flag;
        boolean flag1;
        flag = true;
        flag1 = false;
        jsonobject = new JSONObject();
        new JSONObject();
        JSONObject jsonobject1 = j.b();
        jsonobject = jsonobject1;
_L2:
        int i1;
        jsonobject = c.a(jsonobject);
        if (!jsonobject.has("success"))
        {
            break MISSING_BLOCK_LABEL_144;
        }
        i1 = jsonobject.getInt("success");
        if (i1 != 1)
        {
            break MISSING_BLOCK_LABEL_144;
        }
_L1:
        Exception exception;
        if (flag)
        {
            try
            {
                j.a();
                j.g();
            }
            catch (Exception exception1)
            {
                (new StringBuilder("Exception removing ndk dump files from disk in attemptToSendNdkCrashes: ")).append(exception1.getClass().getName());
                return flag;
            }
        }
        return flag;
        exception;
        (new StringBuilder("Exception obtaining or handling response object or clearing pending ndk filenames vector in attemptToSendNdkCrashes: ")).append(exception.getClass().getName());
        flag = flag1;
          goto _L1
        Exception exception2;
        exception2;
          goto _L2
        flag = false;
          goto _L1
    }

    public final SharedPreferences m()
    {
        return f.getSharedPreferences("com.crittercism.prefs", 0);
    }

    public final int n()
    {
        float f1;
        try
        {
            f1 = c.g();
        }
        catch (Exception exception)
        {
            return -1;
        }
        return (int)((f1 * 10F) / 160F);
    }

    public final void o()
    {
        e.e().b = true;
        (new Thread(new Runnable() {

            final l a;

            public final void run()
            {
                a.e.e().a(l.a, ae.d.a(), ae.d.b());
            }

            
            {
                a = l.this;
                super();
            }
        })).start();
    }

    public final String p()
    {
label0:
        {
            PackageManager packagemanager = f.getPackageManager();
            String s1 = j();
            Object obj1 = null;
            Object obj = obj1;
            if (s1 != null)
            {
                obj = obj1;
                if (s1.length() > 0)
                {
                    obj = am.a(packagemanager.getInstallerPackageName(s1));
                    if (obj == null)
                    {
                        break label0;
                    }
                    obj = ((ak) (obj)).a(s1).a();
                }
            }
            return ((String) (obj));
        }
        Log.w("Crittercism", "Could not find app market for this app.  Will try rate-my-app test target in config.");
        return t.getRateMyAppTestTarget();
    }

    // Unreferenced inner class crittercism/android/l$1

/* anonymous class */
    public final class _cls1
        implements Runnable
    {

        final l a;

        public final void run()
        {
            l l1;
            Thread thread;
            l1 = l.i();
            thread = l1.r;
_L2:
            if (l1.q || thread == null || !thread.isAlive())
            {
                break MISSING_BLOCK_LABEL_42;
            }
            thread.join();
            continue; /* Loop/switch isn't completed */
            InterruptedException interruptedexception;
            interruptedexception;
            if (!l1.q)
            {
                continue; /* Loop/switch isn't completed */
            }
            Exception exception1;
            try
            {
                l1.a(false);
                l1.k();
                return;
            }
            catch (Exception exception)
            {
                (new StringBuilder("Exception in AppLoadRunnable: ")).append(exception.getClass().getName());
            }
            break; /* Loop/switch isn't completed */
            exception1;
            Log.w("CrittercismInstance", "Exception in Thread in sendAppLoadData");
            if (true) goto _L2; else goto _L1
_L1:
        }

            public 
            {
                a = l.this;
                super();
            }
    }


    // Unreferenced inner class crittercism/android/l$3

/* anonymous class */
    public final class _cls3
        implements Runnable
    {

        final JSONObject a;
        final l b;

        public final void run()
        {
            try
            {
                b.c.b(a);
                return;
            }
            catch (Exception exception)
            {
                return;
            }
        }

            public 
            {
                b = l.this;
                a = jsonobject;
                super();
            }
    }


    // Unreferenced inner class crittercism/android/l$9

/* anonymous class */
    public static final class _cls9
    {

        public static final int a[];

        static 
        {
            a = new int[CritterRateMyAppButtons.values().length];
            try
            {
                a[CritterRateMyAppButtons.YES.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                a[CritterRateMyAppButtons.NO.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                a[CritterRateMyAppButtons.LATER.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }

}
