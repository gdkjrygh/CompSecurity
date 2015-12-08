// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.widget.ScrollView;
import android.widget.TextView;
import com.crashlytics.android.answers.Answers;
import com.crashlytics.android.beta.Beta;
import com.crashlytics.android.internal.CrashEventDataProvider;
import com.crashlytics.android.internal.models.SessionEventData;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Kit;
import io.fabric.sdk.android.KitGroup;
import io.fabric.sdk.android.Logger;
import io.fabric.sdk.android.services.common.ApiKey;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.common.ExecutorUtils;
import io.fabric.sdk.android.services.common.IdManager;
import io.fabric.sdk.android.services.concurrency.Priority;
import io.fabric.sdk.android.services.concurrency.PriorityCallable;
import io.fabric.sdk.android.services.concurrency.Task;
import io.fabric.sdk.android.services.concurrency.UnmetDependencyException;
import io.fabric.sdk.android.services.network.DefaultHttpRequestFactory;
import io.fabric.sdk.android.services.network.HttpRequestFactory;
import io.fabric.sdk.android.services.persistence.FileStoreImpl;
import io.fabric.sdk.android.services.persistence.PreferenceStore;
import io.fabric.sdk.android.services.persistence.PreferenceStoreImpl;
import io.fabric.sdk.android.services.settings.AppSettingsData;
import io.fabric.sdk.android.services.settings.FeaturesSettingsData;
import io.fabric.sdk.android.services.settings.PromptSettingsData;
import io.fabric.sdk.android.services.settings.SessionSettingsData;
import io.fabric.sdk.android.services.settings.Settings;
import io.fabric.sdk.android.services.settings.SettingsData;
import java.io.File;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

// Referenced classes of package com.crashlytics.android:
//            CrashlyticsExecutorServiceWrapper, CrashlyticsUncaughtExceptionHandler, CrashlyticsPinningInfoProvider, BuildIdValidator, 
//            DialogStringResolver, DefaultCreateReportSpiCall, CrashlyticsMissingDependencyException, SessionDataWriter, 
//            ReportUploader, CrashlyticsListener, PinningInfoProvider, CreateReportSpiCall

public class Crashlytics extends Kit
    implements KitGroup
{

    private final long a;
    private final ConcurrentHashMap g;
    private final Collection h;
    private File i;
    private CrashlyticsListener j;
    private CrashlyticsUncaughtExceptionHandler k;
    private String l;
    private String m;
    private String n;
    private String o;
    private String p;
    private String q;
    private String r;
    private String s;
    private float t;
    private boolean u;
    private final PinningInfoProvider v;
    private HttpRequestFactory w;
    private CrashlyticsExecutorServiceWrapper x;
    private CrashEventDataProvider y;

    public Crashlytics()
    {
        this(1.0F, null, null, false);
    }

    Crashlytics(float f1, CrashlyticsListener crashlyticslistener, PinningInfoProvider pinninginfoprovider, boolean flag)
    {
        this(f1, crashlyticslistener, pinninginfoprovider, flag, ExecutorUtils.a("Crashlytics Exception Handler"));
    }

    Crashlytics(float f1, CrashlyticsListener crashlyticslistener, PinningInfoProvider pinninginfoprovider, boolean flag, ExecutorService executorservice)
    {
        l = null;
        m = null;
        n = null;
        g = new ConcurrentHashMap();
        a = System.currentTimeMillis();
        t = f1;
        j = crashlyticslistener;
        v = pinninginfoprovider;
        u = flag;
        x = new CrashlyticsExecutorServiceWrapper(executorservice);
        h = Collections.unmodifiableCollection(Arrays.asList(new Kit[] {
            new Answers(), new Beta()
        }));
    }

    private void H()
    {
        Object obj = new PriorityCallable() {

            final Crashlytics a;

            public Void a()
            {
                return a.b();
            }

            public Priority b()
            {
                return Priority.d;
            }

            public Object call()
            {
                return a();
            }

            
            {
                a = Crashlytics.this;
                super();
            }
        };
        for (Iterator iterator = G().iterator(); iterator.hasNext(); ((PriorityCallable) (obj)).a((Task)iterator.next())) { }
        obj = D().e().submit(((Callable) (obj)));
        Fabric.g().a("Fabric", "Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.");
        try
        {
            ((Future) (obj)).get(4L, TimeUnit.SECONDS);
            return;
        }
        catch (InterruptedException interruptedexception)
        {
            Fabric.g().d("Fabric", "Crashlytics was interrupted during initialization.", interruptedexception);
            return;
        }
        catch (ExecutionException executionexception)
        {
            Fabric.g().d("Fabric", "Problem encountered during Crashlytics initialization.", executionexception);
            return;
        }
        catch (TimeoutException timeoutexception)
        {
            Fabric.g().d("Fabric", "Crashlytics timed out during initialization.", timeoutexception);
        }
    }

    private static boolean I()
    {
        Crashlytics crashlytics = f();
        return crashlytics == null || crashlytics.u;
    }

    private int a(float f1, int i1)
    {
        return (int)((float)i1 * f1);
    }

    static int a(Crashlytics crashlytics, float f1, int i1)
    {
        return crashlytics.a(f1, i1);
    }

    static File a(Crashlytics crashlytics)
    {
        return crashlytics.i;
    }

    private static void a(int i1, String s1, String s2)
    {
        Crashlytics crashlytics;
        if (!I())
        {
            if (a("prior to logging messages.", crashlytics = f()))
            {
                long l1 = System.currentTimeMillis();
                long l2 = crashlytics.a;
                crashlytics.k.a(l1 - l2, b(i1, s1, s2));
                return;
            }
        }
    }

    private void a(Context context, String s1)
    {
        Object obj;
        if (v != null)
        {
            obj = new CrashlyticsPinningInfoProvider(v);
        } else
        {
            obj = null;
        }
        w = new DefaultHttpRequestFactory(Fabric.g());
        w.a(((io.fabric.sdk.android.services.network.PinningInfoProvider) (obj)));
        p = context.getPackageName();
        q = B().h();
        Fabric.g().a("Fabric", (new StringBuilder()).append("Installer package name is: ").append(q).toString());
        obj = context.getPackageManager().getPackageInfo(p, 0);
        r = Integer.toString(((PackageInfo) (obj)).versionCode);
        if (((PackageInfo) (obj)).versionName != null)
        {
            break MISSING_BLOCK_LABEL_178;
        }
        obj = "0.0";
_L1:
        try
        {
            s = ((String) (obj));
            o = CommonUtils.m(context);
        }
        catch (Exception exception)
        {
            Fabric.g().d("Fabric", "Error setting up app properties", exception);
        }
        B().m();
        a(o, b(context)).a(s1, p);
        return;
        obj = ((PackageInfo) (obj)).versionName;
          goto _L1
    }

    public static void a(String s1)
    {
        a(3, "Fabric", s1);
    }

    public static void a(String s1, String s2)
    {
        if (I())
        {
            return;
        }
        if (s1 == null)
        {
            if (f().C() != null && CommonUtils.i(f().C()))
            {
                throw new IllegalArgumentException("Custom attribute key must not be null.");
            } else
            {
                Fabric.g().d("Fabric", "Attempting to set custom attribute with null key, ignoring.", null);
                return;
            }
        }
        String s3 = g(s1);
        if (f().g.size() < 64 || f().g.containsKey(s3))
        {
            if (s2 == null)
            {
                s1 = "";
            } else
            {
                s1 = g(s2);
            }
            f().g.put(s3, s1);
            return;
        } else
        {
            Fabric.g().a("Fabric", "Exceeded maximum number of custom attributes (64)");
            return;
        }
    }

    public static void a(Throwable throwable)
    {
        Crashlytics crashlytics;
        if (!I())
        {
            if (a("prior to logging exceptions.", crashlytics = f()))
            {
                if (throwable == null)
                {
                    Fabric.g().a(5, "Fabric", "Crashlytics is ignoring a request to log a null exception.");
                    return;
                } else
                {
                    crashlytics.k.a(Thread.currentThread(), throwable);
                    return;
                }
            }
        }
    }

    private boolean a(Activity activity, PromptSettingsData promptsettingsdata)
    {
        DialogStringResolver dialogstringresolver = new DialogStringResolver(activity, promptsettingsdata);
        OptInLatch optinlatch = new OptInLatch();
        activity.runOnUiThread(new Runnable(activity, optinlatch, dialogstringresolver, promptsettingsdata) {

            final Activity a;
            final OptInLatch b;
            final DialogStringResolver c;
            final PromptSettingsData d;
            final Crashlytics e;

            public void run()
            {
                android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(a);
                android.content.DialogInterface.OnClickListener onclicklistener = new android.content.DialogInterface.OnClickListener(this) {

                    final _cls7 a;

                    public void onClick(DialogInterface dialoginterface, int i1)
                    {
                        a.b.a(true);
                        dialoginterface.dismiss();
                    }

            
            {
                a = _pcls7;
                super();
            }
                };
                float f1 = a.getResources().getDisplayMetrics().density;
                int i1 = Crashlytics.a(e, f1, 5);
                TextView textview = new TextView(a);
                textview.setAutoLinkMask(15);
                textview.setText(c.b());
                textview.setTextAppearance(a, 0x1030044);
                textview.setPadding(i1, i1, i1, i1);
                textview.setFocusable(false);
                ScrollView scrollview = new ScrollView(a);
                scrollview.setPadding(Crashlytics.a(e, f1, 14), Crashlytics.a(e, f1, 2), Crashlytics.a(e, f1, 10), Crashlytics.a(e, f1, 12));
                scrollview.addView(textview);
                builder.setView(scrollview).setTitle(c.a()).setCancelable(false).setNeutralButton(c.c(), onclicklistener);
                if (d.d)
                {
                    android.content.DialogInterface.OnClickListener onclicklistener1 = new android.content.DialogInterface.OnClickListener(this) {

                        final _cls7 a;

                        public void onClick(DialogInterface dialoginterface, int i1)
                        {
                            a.b.a(false);
                            dialoginterface.dismiss();
                        }

            
            {
                a = _pcls7;
                super();
            }
                    };
                    builder.setNegativeButton(c.e(), onclicklistener1);
                }
                if (d.f)
                {
                    android.content.DialogInterface.OnClickListener onclicklistener2 = new android.content.DialogInterface.OnClickListener(this) {

                        final _cls7 a;

                        public void onClick(DialogInterface dialoginterface, int i1)
                        {
                            a.e.a(true);
                            a.b.a(true);
                            dialoginterface.dismiss();
                        }

            
            {
                a = _pcls7;
                super();
            }
                    };
                    builder.setPositiveButton(c.d(), onclicklistener2);
                }
                builder.show();
            }

            
            {
                e = Crashlytics.this;
                a = activity;
                b = optinlatch;
                c = dialogstringresolver;
                d = promptsettingsdata;
                super();
            }
        });
        Fabric.g().a("Fabric", "Waiting for user opt-in.");
        optinlatch.b();
        return optinlatch.a();
    }

    static boolean a(Crashlytics crashlytics, Activity activity, PromptSettingsData promptsettingsdata)
    {
        return crashlytics.a(activity, promptsettingsdata);
    }

    private static boolean a(String s1, Crashlytics crashlytics)
    {
        if (crashlytics == null || crashlytics.k == null)
        {
            Fabric.g().d("Fabric", (new StringBuilder()).append("Crashlytics must be initialized by calling Fabric.with(Context) ").append(s1).toString(), null);
            return false;
        } else
        {
            return true;
        }
    }

    private static String b(int i1, String s1, String s2)
    {
        return (new StringBuilder()).append(CommonUtils.b(i1)).append("/").append(s1).append(" ").append(s2).toString();
    }

    public static void b(String s1)
    {
        if (I())
        {
            return;
        } else
        {
            f().l = g(s1);
            return;
        }
    }

    private boolean b(Context context)
    {
        return CommonUtils.a(context, "com.crashlytics.RequireBuildId", true);
    }

    public static void c(String s1)
    {
        if (I())
        {
            return;
        } else
        {
            f().n = g(s1);
            return;
        }
    }

    public static void d(String s1)
    {
        if (I())
        {
            return;
        } else
        {
            f().m = g(s1);
            return;
        }
    }

    static void e(String s1)
    {
        Answers answers = (Answers)Fabric.a(com/crashlytics/android/answers/Answers);
        if (answers != null)
        {
            answers.a(new io.fabric.sdk.android.services.common.Crash.LoggedException(s1));
        }
    }

    public static Crashlytics f()
    {
        Crashlytics crashlytics;
        try
        {
            crashlytics = (Crashlytics)Fabric.a(com/crashlytics/android/Crashlytics);
        }
        catch (IllegalStateException illegalstateexception)
        {
            Fabric.g().d("Fabric", "Crashlytics must be initialized by calling Fabric.with(Context) prior to calling Crashlytics.getInstance()", null);
            throw illegalstateexception;
        }
        return crashlytics;
    }

    static void f(String s1)
    {
        Answers answers = (Answers)Fabric.a(com/crashlytics/android/answers/Answers);
        if (answers != null)
        {
            answers.a(new io.fabric.sdk.android.services.common.Crash.FatalException(s1));
        }
    }

    private static String g(String s1)
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

    BuildIdValidator a(String s1, boolean flag)
    {
        return new BuildIdValidator(s1, flag);
    }

    CreateReportSpiCall a(SettingsData settingsdata)
    {
        if (settingsdata != null)
        {
            return new DefaultCreateReportSpiCall(this, l(), settingsdata.a.d, w);
        } else
        {
            return null;
        }
    }

    void a(boolean flag)
    {
        PreferenceStoreImpl preferencestoreimpl = new PreferenceStoreImpl(this);
        preferencestoreimpl.a(preferencestoreimpl.b().putBoolean("always_send_reports_opt_in", flag));
    }

    protected boolean a()
    {
        return a(super.C());
    }

    boolean a(Context context)
    {
        Object obj;
        if (u)
        {
            return false;
        }
        obj = (new ApiKey()).a(context);
        if (obj == null)
        {
            return false;
        }
        Fabric.g().b("Fabric", (new StringBuilder()).append("Initializing Crashlytics ").append(d()).toString());
        i = new File(u(), "initialization_marker");
        Exception exception;
        boolean flag;
        try
        {
            a(context, ((String) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Fabric.g().d("Fabric", "Crashlytics was not started due to an exception during initialization", context);
            return false;
        }
        obj = new SessionDataWriter(C(), o, h());
        Fabric.g().a("Fabric", "Installing exception handler...");
        k = new CrashlyticsUncaughtExceptionHandler(Thread.getDefaultUncaughtExceptionHandler(), j, x, B(), ((SessionDataWriter) (obj)), this);
        flag = s();
        k.b();
        Thread.setDefaultUncaughtExceptionHandler(k);
        Fabric.g().a("Fabric", "Successfully installed exception handler.");
_L2:
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        if (!CommonUtils.n(context))
        {
            break; /* Loop/switch isn't completed */
        }
        H();
        return false;
_L3:
        Fabric.g().d("Fabric", "There was a problem installing the exception handler.", exception);
        if (true) goto _L2; else goto _L1
        context;
        throw new UnmetDependencyException(context);
_L1:
        return true;
        exception;
          goto _L3
        exception;
        flag = false;
          goto _L3
    }

    protected Void b()
    {
        boolean flag;
        boolean flag1;
        boolean flag2;
        q();
        k.g();
        flag2 = true;
        flag1 = true;
        flag = flag2;
        Object obj = Settings.a().b();
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_52;
        }
        flag = flag2;
        Fabric.g().c("Fabric", "Received null settings, skipping initialization!");
        r();
        return null;
        flag = flag2;
        if (!((SettingsData) (obj)).d.c) goto _L2; else goto _L1
_L1:
        flag2 = false;
        flag1 = false;
        flag = flag2;
        k.d();
        flag = flag2;
        obj = a(((SettingsData) (obj)));
        if (obj == null) goto _L4; else goto _L3
_L3:
        flag = flag2;
        (new ReportUploader(((CreateReportSpiCall) (obj)))).a(t);
_L2:
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_129;
        }
        Fabric.g().a("Fabric", "Crash reporting disabled.");
        r();
        return null;
_L4:
        flag = flag2;
        Fabric.g().c("Fabric", "Unable to create a call to upload reports.");
          goto _L2
        Object obj1;
        obj1;
        Fabric.g().d("Fabric", "Error dealing with settings", ((Throwable) (obj1)));
        flag1 = flag;
          goto _L2
        obj1;
        Fabric.g().d("Fabric", "Problem encountered during Crashlytics initialization.", ((Throwable) (obj1)));
        r();
        return null;
        obj1;
        r();
        throw obj1;
    }

    public String c()
    {
        return "com.crashlytics.sdk.android:crashlytics";
    }

    public String d()
    {
        return "2.2.4.42";
    }

    public Collection e()
    {
        return h;
    }

    Map g()
    {
        return Collections.unmodifiableMap(g);
    }

    String h()
    {
        return p;
    }

    String i()
    {
        return q;
    }

    String j()
    {
        return s;
    }

    String k()
    {
        return r;
    }

    String l()
    {
        return CommonUtils.b(f().C(), "com.crashlytics.ApiEndpoint");
    }

    CrashlyticsUncaughtExceptionHandler m()
    {
        return k;
    }

    String n()
    {
        if (B().a())
        {
            return l;
        } else
        {
            return null;
        }
    }

    String o()
    {
        if (B().a())
        {
            return m;
        } else
        {
            return null;
        }
    }

    String p()
    {
        if (B().a())
        {
            return n;
        } else
        {
            return null;
        }
    }

    void q()
    {
        x.a(new Callable() {

            final Crashlytics a;

            public Void a()
            {
                Crashlytics.a(a).createNewFile();
                Fabric.g().a("Fabric", "Initialization marker file created.");
                return null;
            }

            public Object call()
            {
                return a();
            }

            
            {
                a = Crashlytics.this;
                super();
            }
        });
    }

    void r()
    {
        x.b(new Callable() {

            final Crashlytics a;

            public Boolean a()
            {
                boolean flag;
                try
                {
                    flag = Crashlytics.a(a).delete();
                    Fabric.g().a("Fabric", (new StringBuilder()).append("Initialization marker file removed: ").append(flag).toString());
                }
                catch (Exception exception)
                {
                    Fabric.g().d("Fabric", "Problem encountered deleting Crashlytics initialization marker.", exception);
                    return Boolean.valueOf(false);
                }
                return Boolean.valueOf(flag);
            }

            public Object call()
            {
                return a();
            }

            
            {
                a = Crashlytics.this;
                super();
            }
        });
    }

    boolean s()
    {
        return ((Boolean)x.a(new Callable() {

            final Crashlytics a;

            public Boolean a()
            {
                return Boolean.valueOf(Crashlytics.a(a).exists());
            }

            public Object call()
            {
                return a();
            }

            
            {
                a = Crashlytics.this;
                super();
            }
        })).booleanValue();
    }

    SessionEventData t()
    {
        SessionEventData sessioneventdata = null;
        if (y != null)
        {
            sessioneventdata = y.a();
        }
        return sessioneventdata;
    }

    File u()
    {
        return (new FileStoreImpl(this)).a();
    }

    boolean v()
    {
        return ((Boolean)Settings.a().a(new io.fabric.sdk.android.services.settings.Settings.SettingsAccess() {

            final Crashlytics a;

            public Boolean a(SettingsData settingsdata)
            {
                boolean flag = false;
                if (settingsdata.d.a)
                {
                    if (!a.w())
                    {
                        flag = true;
                    }
                    return Boolean.valueOf(flag);
                } else
                {
                    return Boolean.valueOf(false);
                }
            }

            public Object b(SettingsData settingsdata)
            {
                return a(settingsdata);
            }

            
            {
                a = Crashlytics.this;
                super();
            }
        }, Boolean.valueOf(false))).booleanValue();
    }

    boolean w()
    {
        return (new PreferenceStoreImpl(this)).a().getBoolean("always_send_reports_opt_in", false);
    }

    boolean x()
    {
        return ((Boolean)Settings.a().a(new io.fabric.sdk.android.services.settings.Settings.SettingsAccess() {

            final Crashlytics a;

            public Boolean a(SettingsData settingsdata)
            {
                boolean flag1 = true;
                Activity activity = a.D().b();
                boolean flag = flag1;
                if (activity != null)
                {
                    flag = flag1;
                    if (!activity.isFinishing())
                    {
                        flag = flag1;
                        if (a.v())
                        {
                            flag = Crashlytics.a(a, activity, settingsdata.c);
                        }
                    }
                }
                return Boolean.valueOf(flag);
            }

            public Object b(SettingsData settingsdata)
            {
                return a(settingsdata);
            }

            
            {
                a = Crashlytics.this;
                super();
            }
        }, Boolean.valueOf(true))).booleanValue();
    }

    SessionSettingsData y()
    {
        SettingsData settingsdata = Settings.a().b();
        if (settingsdata == null)
        {
            return null;
        } else
        {
            return settingsdata.b;
        }
    }

    protected Object z()
    {
        return b();
    }

    private class OptInLatch
    {

        final Crashlytics a;
        private boolean b;
        private final CountDownLatch c;

        void a(boolean flag)
        {
            b = flag;
            c.countDown();
        }

        boolean a()
        {
            return b;
        }

        void b()
        {
            try
            {
                c.await();
                return;
            }
            catch (InterruptedException interruptedexception)
            {
                return;
            }
        }

        private OptInLatch()
        {
            a = Crashlytics.this;
            super();
            b = false;
            c = new CountDownLatch(1);
        }

    }

}
