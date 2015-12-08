// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.app.Application;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.ConditionVariable;
import android.os.Looper;
import android.os.MessageQueue;
import android.os.Process;
import com.crittercism.app.CritterRateMyAppButtons;
import com.crittercism.app.CrittercismConfig;
import com.crittercism.app.Transaction;
import java.io.File;
import java.net.URL;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package crittercism.android:
//            au, aw, ax, f, 
//            dw, dz, bb, e, 
//            dx, dt, dp, dn, 
//            dm, dg, at, dr, 
//            cv, bw, cb, bf, 
//            h, ec, ay, bg, 
//            dy, d, i, g, 
//            av, bh, bi, c, 
//            bc, du, br, bq, 
//            dv, ch, di, df, 
//            cu, dj, dc, db, 
//            dd, bk, bx, ce

public final class az
    implements au, aw, ax, f
{
    static final class a
        implements android.os.MessageQueue.IdleHandler
    {

        private boolean a;

        public final boolean queueIdle()
        {
            this;
            JVM INSTR monitorenter ;
            if (!a)
            {
                a = true;
                bg.g();
            }
            this;
            JVM INSTR monitorexit ;
            return true;
            Exception exception;
            exception;
            throw exception;
        }

        private a()
        {
            a = false;
        }

        a(byte byte0)
        {
            this();
        }
    }


    static az a;
    public Map A;
    public dt B;
    int C;
    private String D;
    private br E;
    private g F;
    private at G;
    private boolean H;
    private String I;
    public boolean b;
    public Context c;
    public final ConditionVariable d = new ConditionVariable(false);
    public final ConditionVariable e = new ConditionVariable(false);
    public dw f;
    br g;
    br h;
    br i;
    br j;
    br k;
    br l;
    br m;
    br n;
    br o;
    br p;
    cv q;
    public dg r;
    ExecutorService s;
    public ExecutorService t;
    public boolean u;
    public bb v;
    protected e w;
    public dr x;
    dv y;
    public bi z;

    protected az()
    {
        b = false;
        c = null;
        D = null;
        f = new dw();
        q = null;
        r = null;
        F = null;
        s = Executors.newCachedThreadPool(new dz());
        t = Executors.newSingleThreadExecutor(new dz());
        H = false;
        u = false;
        I = "";
        v = new bb();
        y = null;
        A = new HashMap();
        B = null;
        C = 0;
        w = new e(t);
    }

    public static az A()
    {
        if (a == null)
        {
            a = new az();
        }
        return a;
    }

    private static boolean F()
    {
        boolean flag1 = false;
        StackTraceElement astacktraceelement[] = Thread.currentThread().getStackTrace();
        int i1 = 0;
        do
        {
label0:
            {
                boolean flag = flag1;
                if (i1 < astacktraceelement.length)
                {
                    StackTraceElement stacktraceelement = astacktraceelement[i1];
                    if (!stacktraceelement.getMethodName().equals("onCreate") && !stacktraceelement.getMethodName().equals("onResume"))
                    {
                        break label0;
                    }
                    flag = true;
                }
                return flag;
            }
            i1++;
        } while (true);
    }

    private void G()
    {
        int j1 = Process.myUid();
        int k1 = Process.myPid();
        Object obj = (ActivityManager)c.getSystemService("activity");
        Iterator iterator = ((ActivityManager) (obj)).getRunningAppProcesses().iterator();
        int i1 = 0;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            if (((android.app.ActivityManager.RunningAppProcessInfo)iterator.next()).uid == j1)
            {
                i1++;
            }
        } while (true);
        if (i1 <= 1)
        {
            u = false;
        } else
        {
            obj = ((ActivityManager) (obj)).getRunningServices(0x7fffffff).iterator();
            while (((Iterator) (obj)).hasNext()) 
            {
                if (((android.app.ActivityManager.RunningServiceInfo)((Iterator) (obj)).next()).pid == k1)
                {
                    u = true;
                    return;
                }
            }
        }
    }

    private String H()
    {
        try
        {
            if (I == null || I.equals(""))
            {
                I = c.getPackageName();
            }
        }
        catch (Exception exception)
        {
            dx.c("CrittercismInstance", "Call to getPackageName() failed.  Please contact us at support@crittercism.com.");
            I = new String();
        }
        return I;
    }

    public final boolean B()
    {
        d.block();
        return f.b();
    }

    public final void C()
    {
        dt dt1 = B;
        if (B != null)
        {
            B.d();
        }
    }

    public final String D()
    {
label0:
        {
            PackageManager packagemanager = c.getPackageManager();
            String s1 = H();
            Object obj1 = null;
            Object obj = obj1;
            if (s1 != null)
            {
                obj = obj1;
                if (s1.length() > 0)
                {
                    obj = dp.a(packagemanager.getInstallerPackageName(s1));
                    if (obj == null)
                    {
                        break label0;
                    }
                    obj = ((dn) (obj)).a(s1).a();
                }
            }
            return ((String) (obj));
        }
        dx.c("Crittercism", "Could not find app market for this app.  Will try rate-my-app test target in config.");
        return v.getRateMyAppTestTarget();
    }

    public final void E()
    {
        di di;
        if (!u)
        {
            if (!r.a(di = new di(this) {

        final az a;
        final az b;

        public final void a()
        {
            if (a.f.b())
            {
                return;
            } else
            {
                cu cu1 = new cu(a);
                JSONObject jsonobject = a.y.a();
                cu1.a.put("metadata", jsonobject);
                (new dj(cu1, new dc((new db(b.v.b(), "/android_v2/update_user_metadata")).a()), new dd(a.y))).run();
                return;
            }
        }

            
            {
                b = az.this;
                a = az2;
                super();
            }
    }))
            {
                s.execute(di);
                return;
            }
        }
    }

    public final AlertDialog a(Context context, String s1, String s2)
    {
        boolean flag = false;
        if (f.b())
        {
            dx.b("CrittercismInstance", "User has opted out of crittercism.  generateRateMyAppAlertDialog returning null.");
        } else
        if (!(context instanceof Activity))
        {
            dx.b("CrittercismInstance", "Context object must be an instance of Activity for AlertDialog to form correctly.  generateRateMyAppAlertDialog returning null.");
        } else
        if (s2 == null || s2 != null && s2.length() == 0)
        {
            dx.b("CrittercismInstance", "Message has to be a non-empty string.  generateRateMyAppAlertDialog returning null.");
        } else
        if (android.os.Build.VERSION.SDK_INT < 5)
        {
            dx.b("Crittercism", "Rate my app not supported below api level 5");
        } else
        {
            flag = true;
        }
        if (!flag)
        {
            return null;
        }
        String s3 = D();
        if (s3 == null)
        {
            dx.b("Crittercism", "Cannot create proper URI to open app market.  Returning null.");
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
            dx.b("Crittercism", "Failed to create AlertDialog instance from AlertDialog.Builder.  Did you remember to call Looper.prepare() before calling Crittercism.generateRateMyAppAlertDialog()?");
            return null;
        }
        context.setButton(-1, "Yes", new android.content.DialogInterface.OnClickListener(s3) {

            final String a;
            final az b;

            public final void onClick(DialogInterface dialoginterface, int i1)
            {
                try
                {
                    az.A().a(a);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (DialogInterface dialoginterface)
                {
                    dx.c("CrittercismInstance", "YES button failed.  Email support@crittercism.com.");
                }
            }

            
            {
                b = az.this;
                a = s1;
                super();
            }
        });
        context.setButton(-2, "No", new android.content.DialogInterface.OnClickListener() {

            final az a;

            public final void onClick(DialogInterface dialoginterface, int i1)
            {
                try
                {
                    az.A().C();
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (DialogInterface dialoginterface)
                {
                    dx.c("CrittercismInstance", "NO button failed.  Email support@crittercism.com.");
                }
            }

            
            {
                a = az.this;
                super();
            }
        });
        context.setButton(-3, "Maybe Later", new android.content.DialogInterface.OnClickListener() {

            final az a;

            public final void onClick(DialogInterface dialoginterface, int i1)
            {
                try
                {
                    az.A();
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (DialogInterface dialoginterface)
                {
                    dx.c("CrittercismInstance", "MAYBE LATER button failed.  Email support@crittercism.com.");
                }
            }

            
            {
                a = az.this;
                super();
            }
        });
        return context;
    }

    public final String a()
    {
        String s2 = D;
        String s1 = s2;
        if (s2 == null)
        {
            s1 = "";
        }
        return s1;
    }

    public final String a(String s1, String s2)
    {
        Object obj = null;
        SharedPreferences sharedpreferences = c.getSharedPreferences(s1, 0);
        s1 = obj;
        if (sharedpreferences != null)
        {
            s1 = sharedpreferences.getString(s2, null);
        }
        return s1;
    }

    public final void a(Context context, String s1, CrittercismConfig crittercismconfig)
    {
        dx.a("Crittercism", (new StringBuilder("Initializing Crittercism 5.0.4 for App ID ")).append(s1).toString());
        D = s1;
        v = new bb(crittercismconfig);
        c = context;
        G = new at(c, v);
        I = context.getPackageName();
        x = new dr(context);
        G();
        long l1 = 0xdf8475800L;
        if (u)
        {
            l1 = 0x2cb417800L;
        }
        q = new cv(l1);
        if (!F())
        {
            dx.c("CrittercismInstance", "Crittercism should be initialized in onCreate() of MainActivity");
        }
        bw.a(G);
        bw.a(c);
        bw.a(new cb());
        bw.a(new bf(c, v));
        if (!crittercism.android.h.a(c).exists() && v.isOptmzEnabled())
        {
            try
            {
                w.a(v.a());
                w.b(v.getPreserveQueryStringPatterns());
                s1 = new d(c);
                s1 = new i(w, s1);
                F = new g(this, new URL((new StringBuilder()).append(v.c()).append("/api/apm/network").toString()));
                w.a(F);
                w.a(this);
                (new dy(F, "OPTMZ")).start();
                H = s1.a();
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                (new StringBuilder("Exception in startApm: ")).append(s1.getClass().getName());
                dx.b();
                dx.c();
            }
            (new StringBuilder("installedApm = ")).append(H);
            dx.b();
        }
        r = new dg(v, context, this, this, this);
        if (!u)
        {
            dx.a(new ec(this, t, r, f));
        }
        context = Thread.getDefaultUncaughtExceptionHandler();
        if (!(context instanceof ay))
        {
            Thread.setDefaultUncaughtExceptionHandler(new ay(this, context));
        }
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            if (!(c instanceof Application))
            {
                dx.c("CrittercismInstance", "Application context not provided. Automatic breadcrumbs will not be recorded.");
            } else
            {
                dx.b();
                ((Application)c).registerActivityLifecycleCallbacks(new av(c, this));
            }
        } else
        {
            dx.a("CrittercismInstance", "API Level is less than 14. Automatic breadcrumbs are not supported.");
        }
        if (!u)
        {
            bg.c(this);
            if (Looper.myLooper() == Looper.getMainLooper())
            {
                Looper.myQueue().addIdleHandler(new a((byte)0));
            }
        }
        (new dy(r)).start();
        b = true;
    }

    public final void a(bh bh1)
    {
        bi bi1 = z;
        if (z != null)
        {
            bg.a(bh1);
            bg.i();
            if (bh1.a)
            {
                z.a(bh1.b, TimeUnit.SECONDS);
                z.b();
                return;
            }
        }
    }

    public final void a(c c1)
    {
        c1 = new di(c1) {

            final c a;
            final az b;

            public final void a()
            {
                b.m.a(a);
            }

            
            {
                b = az.this;
                a = c1;
                super();
            }
        };
        if (!r.a(c1))
        {
            t.execute(c1);
        }
    }

    public final void a(ch ch)
    {
        if (!f.b())
        {
            if (!r.a(ch = new di(ch) {

        final ch a;
        final az b;

        public final void a()
        {
            b.n.a(a);
        }

            
            {
                b = az.this;
                a = ch;
                super();
            }
    }))
            {
                t.execute(ch);
                return;
            }
        }
    }

    public final void a(h h1)
    {
        while (!H || !v.isOptmzEnabled() || !h1.a || h1.c) 
        {
            return;
        }
        dx.a("Crittercism", "Enabling OPTMZ");
        F.a(h1.d, TimeUnit.SECONDS);
        F.a();
    }

    public final void a(String s1)
    {
        Object obj = B;
        if (B != null)
        {
            B.d();
        }
        obj = new Intent("android.intent.action.VIEW");
        ((Intent) (obj)).setFlags(0x10000000);
        ((Intent) (obj)).setData(Uri.parse(s1));
        c.startActivity(((Intent) (obj)));
    }

    public final void a(String s1, String s2, int i1)
    {
        s1 = c.getSharedPreferences(s1, 0);
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

    public final void a(String s1, String s2, String s3)
    {
        s1 = c.getSharedPreferences(s1, 0);
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

    public final void a(String s1, URL url, long l1, long l2, long l3, int i1, Exception exception, long l4)
    {
        String s2;
        if (s1 == null)
        {
            dx.b("Crittercism", "Null HTTP request method provided. Endpoint will not be logged.");
            return;
        }
        s2 = s1.toUpperCase(Locale.US);
        HashSet hashset = new HashSet();
        hashset.add("GET");
        hashset.add("POST");
        hashset.add("HEAD");
        hashset.add("PUT");
        hashset.add("DELETE");
        hashset.add("TRACE");
        hashset.add("OPTIONS");
        hashset.add("CONNECT");
        hashset.add("PATCH");
        if (!hashset.contains(s2))
        {
            dx.c("Crittercism", (new StringBuilder("Logging endpoint with invalid HTTP request method: ")).append(s1).toString());
        }
        if (url == null)
        {
            dx.b("Crittercism", "Null URL provided. Endpoint will not be logged");
            return;
        }
        if (l2 < 0L || l3 < 0L)
        {
            dx.b("Crittercism", "Invalid byte values. Bytes need to be non-negative. Endpoint will not be logged.");
            return;
        }
        if (i1 == 0) goto _L2; else goto _L1
_L1:
        if (i1 < 100 || i1 >= 600)
        {
            dx.c("Crittercism", (new StringBuilder("Logging endpoint with invalid HTTP response code: ")).append(Integer.toString(i1)).toString());
        }
_L4:
        s1 = (new d(c)).a();
        if (l1 < 0L)
        {
            dx.b("Crittercism", "Invalid latency. Endpoint will not be logged.");
            return;
        }
        break; /* Loop/switch isn't completed */
_L2:
        if (exception == null)
        {
            dx.c("Crittercism", "Logging endpoint with null error and response code of 0.");
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (l4 < 0L)
        {
            dx.b("Crittercism", "Invalid start time. Endpoint will not be logged.");
            return;
        }
        c c1 = new c();
        c1.f = s2;
        c1.a(url.toExternalForm());
        c1.b(l2);
        c1.d(l3);
        c1.e = i1;
        c1.j = s1;
        c1.e(l4);
        c1.f(l4 + l1);
        if (bc.b())
        {
            c1.a(bc.a());
        }
        c1.a(exception);
        w.a(c1, c.a.l);
        return;
    }

    public final void a(Throwable throwable)
    {
        this;
        JVM INSTR monitorenter ;
        if (throwable != null) goto _L2; else goto _L1
_L1:
        dx.c("Crittercism", "Calling logHandledException with a null java.lang.Throwable. Nothing will be reported to Crittercism");
_L3:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (!u)
        {
            break MISSING_BLOCK_LABEL_70;
        }
        throwable = new di(throwable, Thread.currentThread().getId()) {

            final Throwable a;
            final long b;
            final az c;

            public final void a()
            {
                if (c.f.b())
                {
                    return;
                }
                synchronized (c.q)
                {
                    if (c.C < 10)
                    {
                        Object obj = new bk(a, b);
                        ((bk) (obj)).a("current_session", c.k);
                        ((bk) (obj)).a(c.m);
                        obj.d = "he";
                        if (c.q.a())
                        {
                            obj = (new JSONArray()).put(((bk) (obj)).b());
                            (new dj((new cu(az.a)).a(bq.b.f(), ((JSONArray) (obj))), new dc((new db(c.v.b(), "/android_v2/handle_exceptions")).a()), null)).run();
                            obj = c;
                            obj.C = ((az) (obj)).C + 1;
                            c.q.b();
                        }
                    }
                }
            }

            
            {
                c = az.this;
                a = throwable;
                b = l1;
                super();
            }
        };
        if (!r.a(throwable))
        {
            t.execute(throwable);
        }
          goto _L3
        throwable;
        throw throwable;
        throwable = new di(throwable, Thread.currentThread().getId()) {

            final Throwable a;
            final long b;
            final az c;

            public final void a()
            {
                if (!c.f.b())
                {
                    bk bk1 = new bk(a, b);
                    bk1.a("current_session", c.k);
                    bk1.d = "he";
                    if (c.h.a(bk1))
                    {
                        az.a.a(new bx(bk1.b, bk1.c));
                        if (c.q.a())
                        {
                            df df1 = new df(c.c);
                            df1.a(c.h, new da.a(), c.v.b(), "/android_v2/handle_exceptions", null, az.a, new cu.a());
                            df1.a(c.r, c.s);
                            c.q.b();
                            return;
                        }
                    }
                }
            }

            
            {
                c = az.this;
                a = throwable;
                b = l1;
                super();
            }
        };
        if (!r.a(throwable))
        {
            t.execute(throwable);
        }
          goto _L3
    }

    public final void a(JSONObject jsonobject)
    {
        if (!u)
        {
            if (!r.a(jsonobject = new di(this, jsonobject) {

        final az a;
        final JSONObject b;
        final az c;

        public final void a()
        {
            if (!a.f.b())
            {
                a.y.a(b);
                if (a.y.b())
                {
                    a.E();
                    return;
                }
            }
        }

            
            {
                c = az.this;
                a = az2;
                b = jsonobject;
                super();
            }
    }))
            {
                t.execute(jsonobject);
                return;
            }
        }
    }

    public final int b(String s1)
    {
        if (u)
        {
            dx.c("CrittercismInstance", (new StringBuilder("Transactions are not supported for services. Returning default value of -1 for ")).append(s1).append(".").toString());
            return -1;
        }
        Map map = A;
        map;
        JVM INSTR monitorenter ;
        s1 = (Transaction)A.get(s1);
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_77;
        }
        int i1 = s1.d();
_L1:
        map;
        JVM INSTR monitorexit ;
        return i1;
        s1;
        throw s1;
        i1 = -1;
          goto _L1
    }

    public final int b(String s1, String s2)
    {
        int i1 = 0;
        s1 = c.getSharedPreferences(s1, 0);
        if (s1 != null)
        {
            i1 = s1.getInt(s2, 0);
        }
        return i1;
    }

    public final String b()
    {
        return G.a;
    }

    public final String c()
    {
        String s1 = "";
        if (x != null)
        {
            s1 = x.a();
        }
        return s1;
    }

    public final boolean c(String s1, String s2)
    {
        boolean flag = false;
        s1 = c.getSharedPreferences(s1, 0);
        if (s1 != null)
        {
            flag = s1.getBoolean(s2, false);
        }
        return flag;
    }

    public final String d()
    {
        return "5.0.4";
    }

    public final int e()
    {
        int i1 = -1;
        if (f != null)
        {
            i1 = Integer.valueOf(f.a().a).intValue();
        }
        return i1;
    }

    public final String f()
    {
        return (new bw.f()).a;
    }

    public final int g()
    {
        return (new bw.o()).a.intValue();
    }

    public final int h()
    {
        return (new bw.p()).a.intValue();
    }

    public final String i()
    {
        return "Android";
    }

    public final String j()
    {
        return Build.MODEL;
    }

    public final String k()
    {
        return android.os.Build.VERSION.RELEASE;
    }

    public final dw l()
    {
        return f;
    }

    public final dt m()
    {
        return B;
    }

    public final br n()
    {
        return g;
    }

    public final br o()
    {
        return h;
    }

    public final br p()
    {
        return E;
    }

    public final br q()
    {
        return i;
    }

    public final br r()
    {
        return j;
    }

    public final br s()
    {
        return k;
    }

    public final br t()
    {
        return m;
    }

    public final br u()
    {
        return l;
    }

    public final br v()
    {
        return n;
    }

    public final br w()
    {
        return o;
    }

    public final br x()
    {
        return p;
    }

    public final dv y()
    {
        return y;
    }

    public final void z()
    {
        if (u)
        {
            k = (new br(c, bq.f)).a(c);
        } else
        {
            k = new br(c, bq.f);
        }
        l = new br(c, bq.h);
        m = new br(c, bq.g);
        n = new br(c, bq.k);
        g = new br(c, bq.a);
        h = new br(c, bq.b);
        E = new br(c, bq.c);
        i = new br(c, bq.d);
        j = new br(c, bq.e);
        o = new br(c, bq.i);
        p = new br(c, bq.j);
        if (!u)
        {
            y = new dv(c, D);
        }
    }

    // Unreferenced inner class crittercism/android/az$1

/* anonymous class */
    public final class _cls1 extends di
    {

        final az a;

        public final void a()
        {
            if (a.f.b())
            {
                return;
            } else
            {
                df df1 = new df(a.c);
                df1.a(a.g, new ct.a(), a.v.e(), "/v0/appload/", a.v.b(), az.a, new cs.b());
                df1.a(a.h, new da.a(), a.v.b(), "/android_v2/handle_exceptions", null, az.a, new cu.a());
                df1.a(a.i, new da.a(), a.v.b(), "/android_v2/handle_ndk_crashes", null, az.a, new cu.a());
                df1.a(a.j, new da.a(), a.v.b(), "/android_v2/handle_crashes", null, az.a, new cu.a());
                df1.a(a.r, a.s);
                return;
            }
        }

            public 
            {
                a = az.this;
                super();
            }
    }


    // Unreferenced inner class crittercism/android/az$4

/* anonymous class */
    public static final class _cls4
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


    // Unreferenced inner class crittercism/android/az$7

/* anonymous class */
    public final class _cls7 extends di
    {

        final ce a;
        final az b;

        public final void a()
        {
            b.k.a(a);
        }

            public 
            {
                b = az.this;
                a = ce;
                super();
            }
    }

}
