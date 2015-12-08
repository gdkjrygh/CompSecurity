// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.util.Log;
import android.widget.ScrollView;
import android.widget.TextView;
import com.crashlytics.android.core.CrashlyticsMissingDependencyException;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.common.IdManager;
import io.fabric.sdk.android.services.concurrency.Priority;
import io.fabric.sdk.android.services.concurrency.UnmetDependencyException;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class alu extends gyh
{

    final ConcurrentHashMap a;
    aly b;
    String c;
    String d;
    String e;
    String f;
    String g;
    public anh h;
    private final long n;
    private File o;
    private File p;
    private String q;
    private float r;
    private hba s;
    private alw t;

    public alu()
    {
        this((byte)0);
    }

    private alu(byte byte0)
    {
        ExecutorService executorservice = Executors.newSingleThreadExecutor(gze.a("Crashlytics Exception Handler"));
        gze.a("Crashlytics Exception Handler", executorservice);
        this(executorservice);
    }

    private alu(ExecutorService executorservice)
    {
        c = null;
        a = new ConcurrentHashMap();
        n = System.currentTimeMillis();
        r = 1.0F;
        t = new alw(executorservice);
    }

    static int a(float f1, int j)
    {
        return (int)((float)j * f1);
    }

    static File a(alu alu1)
    {
        return alu1.p;
    }

    static boolean a(alu alu1, Activity activity, hbt hbt)
    {
        return alu1.a(activity, hbt);
    }

    private boolean a(Activity activity, hbt hbt)
    {
        amf amf1 = new amf(activity, hbt);
        alv alv1 = new alv((byte)0);
        activity.runOnUiThread(new Runnable(activity, alv1, amf1, hbt) {

            final alv a;
            final alu b;
            private Activity c;
            private amf d;
            private hbt e;

            public final void run()
            {
                android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(c);
                android.content.DialogInterface.OnClickListener onclicklistener = new android.content.DialogInterface.OnClickListener(this) {

                    private _cls7 a;

                    public final void onClick(DialogInterface dialoginterface, int j)
                    {
                        a.a.a(true);
                        dialoginterface.dismiss();
                    }

            
            {
                a = _pcls7;
                super();
            }
                };
                float f1 = c.getResources().getDisplayMetrics().density;
                int j = alu.a(f1, 5);
                Object obj = new TextView(c);
                ((TextView) (obj)).setAutoLinkMask(15);
                Object obj1 = d;
                ((TextView) (obj)).setText(((amf) (obj1)).a("com.crashlytics.CrashSubmissionPromptMessage", ((amf) (obj1)).a.b));
                ((TextView) (obj)).setTextAppearance(c, 0x1030044);
                ((TextView) (obj)).setPadding(j, j, j, j);
                ((TextView) (obj)).setFocusable(false);
                obj1 = new ScrollView(c);
                ((ScrollView) (obj1)).setPadding(alu.a(f1, 14), alu.a(f1, 2), alu.a(f1, 10), alu.a(f1, 12));
                ((ScrollView) (obj1)).addView(((android.view.View) (obj)));
                obj = builder.setView(((android.view.View) (obj1)));
                obj1 = d;
                obj = ((android.app.AlertDialog.Builder) (obj)).setTitle(((amf) (obj1)).a("com.crashlytics.CrashSubmissionPromptTitle", ((amf) (obj1)).a.a)).setCancelable(false);
                obj1 = d;
                ((android.app.AlertDialog.Builder) (obj)).setNeutralButton(((amf) (obj1)).a("com.crashlytics.CrashSubmissionSendTitle", ((amf) (obj1)).a.c), onclicklistener);
                if (e.d)
                {
                    android.content.DialogInterface.OnClickListener onclicklistener1 = new android.content.DialogInterface.OnClickListener(this) {

                        private _cls7 a;

                        public final void onClick(DialogInterface dialoginterface, int j)
                        {
                            a.a.a(false);
                            dialoginterface.dismiss();
                        }

            
            {
                a = _pcls7;
                super();
            }
                    };
                    amf amf2 = d;
                    builder.setNegativeButton(amf2.a("com.crashlytics.CrashSubmissionCancelTitle", amf2.a.e), onclicklistener1);
                }
                if (e.f)
                {
                    android.content.DialogInterface.OnClickListener onclicklistener2 = new android.content.DialogInterface.OnClickListener(this) {

                        private _cls7 a;

                        public final void onClick(DialogInterface dialoginterface, int j)
                        {
                            hbe hbe1 = new hbe(a.b);
                            hbe1.a(hbe1.b().putBoolean("always_send_reports_opt_in", true));
                            a.a.a(true);
                            dialoginterface.dismiss();
                        }

            
            {
                a = _pcls7;
                super();
            }
                    };
                    amf amf3 = d;
                    builder.setPositiveButton(amf3.a("com.crashlytics.CrashSubmissionAlwaysSendTitle", amf3.a.g), onclicklistener2);
                }
                builder.show();
            }

            
            {
                b = alu.this;
                c = activity;
                a = alv1;
                d = amf1;
                e = hbt1;
                super();
            }
        });
        gya.a().a("CrashlyticsCore", "Waiting for user opt-in.");
        try
        {
            alv1.b.await();
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity) { }
        return alv1.a;
    }

    private boolean a(Context context)
    {
        new gyx();
        if (gyx.a(context) == null)
        {
            return false;
        }
        gya.a().c("CrashlyticsCore", "Initializing Crashlytics 2.3.5.79");
        p = new File(g(), "initialization_marker");
        Object obj;
        try
        {
            s = new hav(gya.a());
            s.a();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            gya.a().c("CrashlyticsCore", "Crashlytics was not started due to an exception during initialization", context);
            return false;
        }
        d = context.getPackageName();
        e = super.m.e();
        gya.a().a("CrashlyticsCore", (new StringBuilder("Installer package name is: ")).append(e).toString());
        obj = context.getPackageManager().getPackageInfo(d, 0);
        f = Integer.toString(((PackageInfo) (obj)).versionCode);
        if (((PackageInfo) (obj)).versionName != null) goto _L2; else goto _L1
_L1:
        obj = "0.0";
_L3:
        g = ((String) (obj));
        q = CommonUtils.k(context);
_L4:
        super.m.h();
        obj = new alq(q, CommonUtils.a(context, "com.crashlytics.RequireBuildId", true));
        if (CommonUtils.d(((alq) (obj)).a) && ((alq) (obj)).b)
        {
            Log.e("CrashlyticsCore", ".");
            Log.e("CrashlyticsCore", ".     |  | ");
            Log.e("CrashlyticsCore", ".     |  |");
            Log.e("CrashlyticsCore", ".     |  |");
            Log.e("CrashlyticsCore", ".   \\ |  | /");
            Log.e("CrashlyticsCore", ".    \\    /");
            Log.e("CrashlyticsCore", ".     \\  /");
            Log.e("CrashlyticsCore", ".      \\/");
            Log.e("CrashlyticsCore", ".");
            Log.e("CrashlyticsCore", "This app relies on Crashlytics. Please sign up for access at https://fabric.io/sign_up,\ninstall an Android build tool and ask a team member to invite you to this app's organization.");
            Log.e("CrashlyticsCore", ".");
            Log.e("CrashlyticsCore", ".      /\\");
            Log.e("CrashlyticsCore", ".     /  \\");
            Log.e("CrashlyticsCore", ".    /    \\");
            Log.e("CrashlyticsCore", ".   / |  | \\");
            Log.e("CrashlyticsCore", ".     |  |");
            Log.e("CrashlyticsCore", ".     |  |");
            Log.e("CrashlyticsCore", ".     |  |");
            Log.e("CrashlyticsCore", ".");
            throw new CrashlyticsMissingDependencyException("This app relies on Crashlytics. Please sign up for access at https://fabric.io/sign_up,\ninstall an Android build tool and ask a team member to invite you to this app's organization.");
        }
        break MISSING_BLOCK_LABEL_444;
        context;
        throw new UnmetDependencyException(context);
_L2:
        obj = ((PackageInfo) (obj)).versionName;
          goto _L3
        obj;
        gya.a().c("CrashlyticsCore", "Error setting up app properties", ((Throwable) (obj)));
          goto _L4
        if (!((alq) (obj)).b)
        {
            gya.a().a("CrashlyticsCore", "Configured not to require a build ID.");
        }
        boolean flag;
        and and1 = new and(super.k, q, d);
        gya.a().a("CrashlyticsCore", "Installing exception handler...");
        b = new aly(Thread.getDefaultUncaughtExceptionHandler(), t, super.m, and1, this);
        flag = ((Boolean)t.a(new Callable() {

            private alu a;

            public final Object call()
            {
                return Boolean.valueOf(alu.a(a).exists());
            }

            
            {
                a = alu.this;
                super();
            }
        })).booleanValue();
        aly aly1 = b;
        aly1.c.b(new aly._cls4(aly1));
        Thread.setDefaultUncaughtExceptionHandler(b);
        gya.a().a("CrashlyticsCore", "Successfully installed exception handler.");
_L6:
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        if (!CommonUtils.l(context))
        {
            break; /* Loop/switch isn't completed */
        }
        l();
        return false;
_L7:
        Exception exception;
        gya.a().c("CrashlyticsCore", "There was a problem installing the exception handler.", exception);
        if (true) goto _L6; else goto _L5
_L5:
        return true;
        exception;
          goto _L7
        exception;
        flag = false;
          goto _L7
    }

    static void c(String s1)
    {
        Object obj = (akl)gya.a(akl);
        if (obj != null)
        {
            s1 = new gzb(s1);
            if (((akl) (obj)).a != null)
            {
                obj = ((akl) (obj)).a;
                Object obj1 = ((gyz) (s1)).a;
                gya.a().a("Answers", "Logged error");
                s1 = ((ala) (obj)).a;
                obj = Collections.singletonMap("sessionId", obj1);
                obj1 = new alc(com.crashlytics.android.answers.SessionEvent.Type.h);
                obj1.c = ((java.util.Map) (obj));
                s1.a(((alc) (obj1)), false, false);
            }
        }
    }

    static void d(String s1)
    {
        Object obj = (akl)gya.a(akl);
        if (obj != null)
        {
            s1 = new gza(s1);
            if (((akl) (obj)).a != null)
            {
                obj = ((akl) (obj)).a;
                Object obj1 = ((gyz) (s1)).a;
                if (Looper.myLooper() == Looper.getMainLooper())
                {
                    throw new IllegalStateException("onCrash called from main thread!!!");
                }
                gya.a().a("Answers", "Logged crash");
                s1 = ((ala) (obj)).a;
                obj = Collections.singletonMap("sessionId", obj1);
                obj1 = new alc(com.crashlytics.android.answers.SessionEvent.Type.i);
                obj1.c = ((java.util.Map) (obj));
                s1.a(((alc) (obj1)), true, false);
            }
        }
    }

    private static boolean e(String s1)
    {
        alu alu1 = f();
        if (alu1 == null || alu1.b == null)
        {
            gya.a().c("CrashlyticsCore", (new StringBuilder("Crashlytics must be initialized by calling Fabric.with(Context) ")).append(s1).toString(), null);
            return false;
        } else
        {
            return true;
        }
    }

    public static alu f()
    {
        return (alu)gya.a(alu);
    }

    private static String f(String s1)
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

    static hbu i()
    {
        hbz hbz1 = hbw.a().a();
        if (hbz1 == null)
        {
            return null;
        } else
        {
            return hbz1.b;
        }
    }

    private void l()
    {
        Object obj = new gzv() {

            private alu a;

            public final Priority a()
            {
                return Priority.c;
            }

            public final Object call()
            {
                return a.d();
            }

            
            {
                a = alu.this;
                super();
            }
        };
        for (Iterator iterator = super.j.f().iterator(); iterator.hasNext(); ((gzv) (obj)).a((hab)iterator.next())) { }
        obj = super.i.a.submit(((Callable) (obj)));
        gya.a().a("CrashlyticsCore", "Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.");
        try
        {
            ((Future) (obj)).get(4L, TimeUnit.SECONDS);
            return;
        }
        catch (InterruptedException interruptedexception)
        {
            gya.a().c("CrashlyticsCore", "Crashlytics was interrupted during initialization.", interruptedexception);
            return;
        }
        catch (ExecutionException executionexception)
        {
            gya.a().c("CrashlyticsCore", "Problem encountered during Crashlytics initialization.", executionexception);
            return;
        }
        catch (TimeoutException timeoutexception)
        {
            gya.a().c("CrashlyticsCore", "Crashlytics timed out during initialization.", timeoutexception);
        }
    }

    private void m()
    {
        t.b(new Callable() {

            private alu a;

            private Boolean a()
            {
                boolean flag;
                try
                {
                    flag = alu.a(a).delete();
                    gya.a().a("CrashlyticsCore", (new StringBuilder("Initialization marker file removed: ")).append(flag).toString());
                }
                catch (Exception exception)
                {
                    gya.a().c("CrashlyticsCore", "Problem encountered deleting Crashlytics initialization marker.", exception);
                    return Boolean.valueOf(false);
                }
                return Boolean.valueOf(flag);
            }

            public final Object call()
            {
                return a();
            }

            
            {
                a = alu.this;
                super();
            }
        });
    }

    final amd a(hbz hbz1)
    {
        if (hbz1 != null)
        {
            return new ame(this, CommonUtils.d(super.k, "com.crashlytics.ApiEndpoint"), hbz1.a.c, s);
        } else
        {
            return null;
        }
    }

    public final String a()
    {
        return "2.3.5.79";
    }

    public final void a(String s1)
    {
        if (e("prior to logging messages."))
        {
            long l1 = System.currentTimeMillis();
            long l2 = n;
            aly aly1 = b;
            s1 = (new StringBuilder()).append(CommonUtils.c()).append("/").append("CrashlyticsCore").append(" ").append(s1).toString();
            aly1.c.b(new aly._cls15(aly1, l1 - l2, s1));
        }
    }

    public final void a(String s1, String s2)
    {
        if (s1 == null)
        {
            if (super.k != null && CommonUtils.h(super.k))
            {
                throw new IllegalArgumentException("Custom attribute key must not be null.");
            } else
            {
                gya.a().c("CrashlyticsCore", "Attempting to set custom attribute with null key, ignoring.", null);
                return;
            }
        }
        String s3 = f(s1);
        if (a.size() < 64 || a.containsKey(s3))
        {
            if (s2 == null)
            {
                s1 = "";
            } else
            {
                s1 = f(s2);
            }
            a.put(s3, s1);
            s1 = b;
            s2 = a;
            ((aly) (s1)).c.b(new aly._cls3(s1, s2));
            return;
        } else
        {
            gya.a().a("CrashlyticsCore", "Exceeded maximum number of custom attributes (64)");
            return;
        }
    }

    public final void a(String s1, boolean flag)
    {
        a(s1, Boolean.toString(flag));
    }

    public final void a(Throwable throwable)
    {
label0:
        {
            if (e("prior to logging exceptions."))
            {
                if (throwable != null)
                {
                    break label0;
                }
                gya.a().a(5, "CrashlyticsCore", "Crashlytics is ignoring a request to log a null exception.");
            }
            return;
        }
        aly aly1 = b;
        Thread thread = Thread.currentThread();
        Date date = new Date();
        aly1.c.a(new aly._cls16(aly1, date, thread, throwable));
    }

    public final String b()
    {
        return "com.crashlytics.sdk.android.crashlytics-core";
    }

    public final void b(String s1)
    {
        c = f(s1);
        s1 = b;
        String s2 = c;
        ((aly) (s1)).c.b(new aly._cls2(s1, s2));
    }

    protected final boolean c_()
    {
        return a(super.k);
    }

    protected final Void d()
    {
        boolean flag;
        t.a(new Callable() {

            private alu a;

            public final Object call()
            {
                alu.a(a).createNewFile();
                gya.a().a("CrashlyticsCore", "Initialization marker file created.");
                return null;
            }

            
            {
                a = alu.this;
                super();
            }
        });
        aly aly1 = b;
        aly1.c.a(new aly._cls6(aly1));
        flag = true;
        Object obj = hbw.a().a();
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_69;
        }
        gya.a().d("CrashlyticsCore", "Received null settings, skipping initialization!");
        m();
        return null;
        boolean flag2 = ((hbz) (obj)).d.b;
        if (!flag2) goto _L2; else goto _L1
_L1:
        boolean flag1;
        flag1 = false;
        flag = false;
        aly aly2 = b;
        ((Boolean)aly2.c.a(new aly._cls5(aly2))).booleanValue();
        obj = a(((hbz) (obj)));
        if (obj == null) goto _L4; else goto _L3
_L3:
        (new anb(((amd) (obj)))).a(r);
_L2:
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_157;
        }
        gya.a().a("CrashlyticsCore", "Crash reporting disabled.");
        m();
        return null;
_L4:
        gya.a().d("CrashlyticsCore", "Unable to create a call to upload reports.");
        flag = false;
          goto _L2
        Object obj1;
        obj1;
        flag = true;
_L5:
        gya.a().c("CrashlyticsCore", "Error dealing with settings", ((Throwable) (obj1)));
          goto _L2
        obj1;
        gya.a().c("CrashlyticsCore", "Problem encountered during Crashlytics initialization.", ((Throwable) (obj1)));
        m();
        return null;
        obj1;
        m();
        throw obj1;
        obj1;
        flag = flag1;
          goto _L5
    }

    protected final Object e()
    {
        return d();
    }

    final File g()
    {
        if (o == null)
        {
            o = (new hbc(this)).a();
        }
        return o;
    }

    final boolean h()
    {
        return ((Boolean)hbw.a().a(new hbx() {

            private alu a;

            public final Object a(hbz hbz1)
            {
                boolean flag = false;
                if (hbz1.d.a)
                {
                    if (!(new hbe(a)).a().getBoolean("always_send_reports_opt_in", false))
                    {
                        flag = true;
                    }
                    return Boolean.valueOf(flag);
                } else
                {
                    return Boolean.valueOf(false);
                }
            }

            
            {
                a = alu.this;
                super();
            }
        }, Boolean.valueOf(false))).booleanValue();
    }

    // Unreferenced inner class alu$6

/* anonymous class */
    final class _cls6
        implements hbx
    {

        private alu a;

        public final Object a(hbz hbz1)
        {
            Object obj = ((gyh) (a)).i;
            boolean flag;
            if (((gya) (obj)).c != null)
            {
                obj = (Activity)((gya) (obj)).c.get();
            } else
            {
                obj = null;
            }
            if (obj != null && !((Activity) (obj)).isFinishing() && a.h())
            {
                flag = alu.a(a, ((Activity) (obj)), hbz1.c);
            } else
            {
                flag = true;
            }
            return Boolean.valueOf(flag);
        }

            
            {
                a = alu.this;
                super();
            }
    }

}
