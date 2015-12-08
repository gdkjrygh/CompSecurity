// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.managers;

import android.app.ActivityManager;
import android.app.Application;
import android.app.NotificationManager;
import android.content.ComponentCallbacks2;
import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.database.sqlite.SQLiteDatabase;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.crashlytics.android.Crashlytics;
import com.crashlytics.android.answers.Answers;
import com.crashlytics.android.beta.Beta;
import com.crashlytics.android.core.CrashlyticsCore;
import com.facebook.g;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.iid.e;
import com.squareup.okhttp.c;
import com.squareup.okhttp.internal.b;
import com.squareup.okhttp.s;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.m;
import com.squareup.picasso.o;
import com.taplytics.ba;
import com.taplytics.be;
import com.taplytics.ci;
import com.taplytics.cj;
import com.taplytics.ck;
import com.taplytics.cs;
import com.taplytics.d;
import com.taplytics.dp;
import com.taplytics.dt;
import com.taplytics.eb;
import com.taplytics.el;
import com.taplytics.gs;
import com.taplytics.gt;
import com.taplytics.gv;
import com.taplytics.gy;
import com.taplytics.ha;
import com.taplytics.hd;
import com.taplytics.he;
import com.taplytics.hg;
import com.taplytics.hi;
import com.taplytics.j;
import com.taplytics.ox;
import com.taplytics.shelduck;
import com.tinder.a.f;
import com.tinder.activities.ActivityAddPhoto;
import com.tinder.activities.ActivityCredits;
import com.tinder.activities.ActivityLogin;
import com.tinder.activities.ActivityVerification;
import com.tinder.b.k;
import com.tinder.b.l;
import com.tinder.enums.Environment;
import com.tinder.events.EventLoggedOut;
import com.tinder.events.EventUnregisterManagers;
import com.tinder.f.a;
import com.tinder.f.ak;
import com.tinder.model.FacebookAnalyticsUtils;
import com.tinder.model.Session;
import com.tinder.utils.ac;
import com.tinder.utils.n;
import com.tinder.utils.v;
import io.fabric.sdk.android.h;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.tinder.managers:
//            ae, d, a, b, 
//            ai, i, ad, ManagerNotifications, 
//            g

public class ManagerApp extends Application
    implements com.tinder.utils.b.c
{

    public static String APP_VERSION_CODE;
    public static boolean a = false;
    public static boolean b = true;
    public static boolean c;
    public static String d;
    public static String n;
    private static final String o[] = {
        com/tinder/activities/ActivityCredits.getSimpleName(), com/tinder/activities/ActivityLogin.getSimpleName(), com/tinder/activities/ActivityVerification.getSimpleName(), com/tinder/activities/ActivityAddPhoto.getSimpleName()
    };
    private static ManagerApp p;
    private static Context q;
    private static com.tinder.utils.b r;
    private static ak s;
    private static com.google.android.gms.ads.identifier.AdvertisingIdClient.Info t;
    private static Handler u = new Handler(Looper.getMainLooper());
    private static Map w = null;
    com.tinder.managers.d e;
    de.greenrobot.event.c f;
    s g;
    n h;
    f i;
    c j;
    i k;
    ad l;
    ai m;
    private Environment v;

    public ManagerApp()
    {
        v = null;
    }

    public static com.google.android.gms.ads.identifier.AdvertisingIdClient.Info a()
    {
        if (t != null && !t.isLimitAdTrackingEnabled())
        {
            return t;
        } else
        {
            return null;
        }
    }

    static com.google.android.gms.ads.identifier.AdvertisingIdClient.Info a(com.google.android.gms.ads.identifier.AdvertisingIdClient.Info info)
    {
        t = info;
        return info;
    }

    static void a(ManagerApp managerapp)
    {
        managerapp.q();
    }

    static void a(ManagerApp managerapp, m m1)
    {
        m1.c();
        try
        {
            managerapp.j.b.a();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ManagerApp managerapp)
        {
            com.tinder.utils.v.a("Failed to clear HTTP Cache", managerapp);
        }
    }

    static void a(Map map)
    {
        if (map != null)
        {
            w = new HashMap(map.size());
            map = map.entrySet().iterator();
            while (map.hasNext()) 
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)map.next();
                w.put((new StringBuilder("tap_")).append((String)entry.getKey()).toString(), entry.getValue());
            }
        }
    }

    public static void a(boolean flag)
    {
        a = flag;
    }

    public static f b()
    {
        return p.i;
    }

    static void b(ManagerApp managerapp)
    {
        managerapp.r();
    }

    public static Context c()
    {
        return q;
    }

    public static ManagerApp d()
    {
        return p;
    }

    public static String e()
    {
        return d;
    }

    public static boolean f()
    {
        if (android.os.Build.VERSION.SDK_INT < 21)
        {
            List list = ((ActivityManager)q.getSystemService("activity")).getRunningTasks(1);
            if (list.isEmpty())
            {
                return false;
            } else
            {
                return ((android.app.ActivityManager.RunningTaskInfo)list.get(0)).topActivity.getPackageName().equalsIgnoreCase(q.getPackageName());
            }
        } else
        {
            return com.tinder.utils.b.a;
        }
    }

    public static boolean g()
    {
        Object obj = ((ActivityManager)q.getSystemService("activity")).getRunningTasks(1);
        if (!((List) (obj)).isEmpty()) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        String s1 = ((android.app.ActivityManager.RunningTaskInfo)((List) (obj)).get(0)).topActivity.getClassName();
        int i1 = s1.lastIndexOf('.');
        obj = s1;
        if (i1 != -1)
        {
            obj = s1.substring(i1 + 1);
        }
        i1 = 0;
label0:
        do
        {
label1:
            {
                if (i1 >= o.length)
                {
                    break label1;
                }
                if (o[i1].equals(obj))
                {
                    break label0;
                }
                i1++;
            }
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
        return true;
    }

    public static ak h()
    {
        return s;
    }

    public static Map i()
    {
        if (w == null)
        {
            return null;
        } else
        {
            return Collections.unmodifiableMap(w);
        }
    }

    public static com.tinder.utils.b k()
    {
        return r;
    }

    public static Handler n()
    {
        return u;
    }

    static Context o()
    {
        return q;
    }

    static ak p()
    {
        return s;
    }

    private void q()
    {
        com.crashlytics.android.Crashlytics.Builder builder = new com.crashlytics.android.Crashlytics.Builder();
        Object obj = new com.crashlytics.android.core.CrashlyticsCore.Builder();
        obj.a = false;
        obj = ((com.crashlytics.android.core.CrashlyticsCore.Builder) (obj)).a();
        if (builder.c != null)
        {
            throw new IllegalStateException("CrashlyticsCore Kit already set.");
        }
        builder.c = ((CrashlyticsCore) (obj));
        if (builder.d != null)
        {
            if (builder.c != null)
            {
                throw new IllegalStateException("Must not use Deprecated methods delay(), disabled(), listener(), pinningInfoProvider() with core()");
            }
            builder.c = builder.d.a();
        }
        if (builder.a == null)
        {
            builder.a = new Answers();
        }
        if (builder.b == null)
        {
            builder.b = new Beta();
        }
        if (builder.c == null)
        {
            builder.c = new CrashlyticsCore();
        }
        io.fabric.sdk.android.c.a(this, new h[] {
            new Crashlytics(builder.a, builder.b, builder.c)
        });
    }

    private void r()
    {
        if (f != null && f.a(this))
        {
            f.b(this);
        }
        Object obj = com.tinder.f.a.a();
        obj.a = new com.tinder.f.m(this);
        obj.b = new com.tinder.f.b();
        if (((com.tinder.f.a.a) (obj)).a == null)
        {
            throw new IllegalStateException("managerModule must be set");
        }
        if (((com.tinder.f.a.a) (obj)).b == null)
        {
            obj.b = new com.tinder.f.b();
        }
        obj = new a(((com.tinder.f.a.a) (obj)), (byte)0);
        s = ((ak) (obj));
        ((ak) (obj)).a(this);
        f.a(this, false);
        r = new com.tinder.utils.b(this);
    }

    public final void a(Environment environment, boolean flag)
    {
        s.j();
        com.tinder.managers.ae.b.putString("ENVIRONMENT", environment.name());
        com.tinder.managers.ae.b.commit();
        f f1 = i;
        (new StringBuilder("New environment: ")).append(environment);
        f1.a(environment);
        if (v == null)
        {
            v = environment;
        }
        if (flag)
        {
            e.d();
        }
    }

    protected void attachBaseContext(Context context)
    {
        super.attachBaseContext(context);
        android.support.a.a.a(this);
    }

    public final void j()
    {
        f.c(new EventUnregisterManagers());
        (new AsyncTask() {

            final ManagerApp a;

            private transient Void a()
            {
                String s2;
                com.google.android.gms.iid.a a1;
                try
                {
                    a1 = com.google.android.gms.iid.a.b(com.tinder.managers.ManagerApp.o());
                    Object obj = a1.a("465293127427", "GCM");
                    n n1 = a.h;
                    if (!TextUtils.isEmpty(((CharSequence) (obj))))
                    {
                        obj = new com.tinder.a.d(3, (new StringBuilder()).append(n1.a.m).append('/').append(((String) (obj))).toString(), null, new com.tinder.utils.n._cls3(n1), new com.tinder.utils.n._cls4(n1), com.tinder.managers.d.b());
                        com.tinder.managers.ManagerApp.b().a(((com.android.volley.Request) (obj)));
                    }
                }
                catch (Exception exception)
                {
                    com.tinder.utils.v.a("delete instanceID failed ", exception);
                    return null;
                }
                s2 = "*";
                if (Looper.getMainLooper() == Looper.myLooper())
                {
                    throw new IOException("MAIN_THREAD");
                }
                Bundle bundle;
                com.google.android.gms.iid.a.c.b(a1.f, "*", "*");
                bundle = new Bundle();
                bundle.putString("sender", "*");
                bundle.putString("scope", "*");
                bundle.putString("subscription", "*");
                bundle.putString("delete", "1");
                bundle.putString("X-delete", "1");
                if (!"".equals(a1.f)) goto _L2; else goto _L1
_L1:
                String s1 = "*";
_L3:
                bundle.putString("subtype", s1);
                if (!"".equals(a1.f))
                {
                    break MISSING_BLOCK_LABEL_270;
                }
                s1 = s2;
_L4:
                bundle.putString("X-subtype", s1);
                com.google.android.gms.iid.e.a(com.google.android.gms.iid.a.d.a(bundle, a1.a()));
                a1.b();
                return null;
_L2:
                s1 = a1.f;
                  goto _L3
                s1 = a1.f;
                  goto _L4
            }

            protected final Object doInBackground(Object aobj[])
            {
                return a();
            }

            protected final void onPostExecute(Object obj)
            {
                int i1 = 0;
                a.l.b(false);
                obj = a.k;
                ((i) (obj)).m();
                ((i) (obj)).a.clear();
                com.tinder.managers.ae.b.remove("LAST_ACTIVITY_DATE").commit();
                com.tinder.managers.i.b(true);
                ManagerApp.p().o().b.cancelAll();
                obj = a.e;
                com.tinder.managers.d.a(null);
                obj = com.tinder.managers.ae.a.getString("ENVIRONMENT", Environment.PROD.name());
                String s1 = com.tinder.managers.ae.a.getString("KEY_SANDBOX", "");
                com.tinder.managers.ae.b.clear();
                com.tinder.managers.ae.b.putString("ENVIRONMENT", ((String) (obj)));
                com.tinder.managers.ae.b.putString("KEY_SANDBOX", s1);
                com.tinder.managers.ae.b.commit();
                com.tinder.b.f.a();
                com.tinder.b.l.a().a.close();
                ManagerApp.p().j();
                (new StringBuilder("location after clear, lat: ")).append(com.tinder.managers.ae.k()).append(" lon:").append(com.tinder.managers.ae.l());
                ManagerApp.p().l().f();
                obj = new File(a.getCacheDir().getParent());
                if (((File) (obj)).exists())
                {
                    String as[] = ((File) (obj)).list();
                    for (int j1 = as.length; i1 < j1; i1++)
                    {
                        String s2 = as[i1];
                        if (!s2.equals("lib") && !s2.equals(".Fabric") && !s2.equals("databases") && com.tinder.utils.m.a(new File(((File) (obj)), s2)))
                        {
                            (new StringBuilder("**************** File ")).append(obj).append('/').append(s2).append(" DELETED *******************");
                        }
                    }

                }
                com.tinder.b.l.a().b();
                com.tinder.managers.ManagerApp.a(a);
                com.tinder.managers.ManagerApp.b(a);
                com.tinder.managers.ManagerApp.h().c().c(new EventLoggedOut());
            }

            
            {
                a = ManagerApp.this;
                super();
            }
        }).execute(new Void[0]);
    }

    public final void l()
    {
        if (e.f())
        {
            e.e();
        }
        com.tinder.managers.a.b();
        Object obj = ac.a();
        Object obj1 = Looper.getMainLooper().getThread();
        Object obj2 = ((Thread) (obj1)).getUncaughtExceptionHandler();
        if (((ac) (obj)).d == null || !((ac) (obj)).d.equals(obj2))
        {
            obj.d = new com.tinder.utils.ac.a(((Thread.UncaughtExceptionHandler) (obj2)), (byte)0);
            ((Thread) (obj1)).setUncaughtExceptionHandler(((ac) (obj)).d);
        }
        obj = new k();
        obj2 = Session.create();
        obj1 = ((k) (obj)).d.format(Long.valueOf(((Session) (obj2)).openDateTime));
        obj2 = ((Session) (obj2)).appVersion;
        ContentValues contentvalues = new ContentValues();
        contentvalues.put(((k) (obj)).b, ((String) (obj1)));
        contentvalues.put(((k) (obj)).c, ((String) (obj2)));
        com.tinder.b.l.a().a(((k) (obj)).a, contentvalues);
    }

    public final void m()
    {
        ac.a();
        ac.b();
    }

    public void onCreate()
    {
        Object obj;
        super.onCreate();
        Log.i("TINDER", "3ff2c3c");
        p = this;
        q = getApplicationContext();
        q();
        obj = ci.b();
        Log.d("Taplytics", (new StringBuilder("Starting taplytics version ")).append(ci.a.a).toString());
        if (this != null) goto _L2; else goto _L1
_L1:
        Object obj1;
        Object obj2;
        try
        {
            Log.d("Taplytics", "Failed to start Taplytics, missing App Context or API Key");
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            gs.b("Master catch!", ((Exception) (obj)));
        }
_L3:
        com.taplytics.a.b.a(com.tinder.managers.b.a());
        com.taplytics.l l1;
        try
        {
            d = q.getPackageManager().getPackageInfo(q.getPackageName(), 0).versionName;
            APP_VERSION_CODE = (new StringBuilder()).append(q.getPackageManager().getPackageInfo(q.getPackageName(), 0).versionCode).toString();
            n = (new StringBuilder()).append(d).append(" (android) [").append(APP_VERSION_CODE).append(']').toString();
            (new StringBuilder("app version (platform)=")).append(n);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            com.tinder.utils.v.a("Failed to load app version", ((Throwable) (obj)));
        }
        com.facebook.g.d();
        com.facebook.g.a(getApplicationContext());
        FacebookAnalyticsUtils.setup(this);
        FacebookAnalyticsUtils.trackEvent("App.Launch");
        com.tinder.b.l.a();
        r();
        obj = new m(this);
        obj1 = new com.squareup.picasso.Picasso.a(this);
        obj1.c = false;
        obj2 = new o(g);
        if (((com.squareup.picasso.Picasso.a) (obj1)).a != null)
        {
            throw new IllegalStateException("Downloader already set.");
        }
        break MISSING_BLOCK_LABEL_1026;
_L2:
label0:
        {
            if (hi.a(this, "android.permission.INTERNET"))
            {
                break label0;
            }
            Log.w("Taplytics", "Failed to find the necessary android.permission.INTERNET permission.");
        }
        break MISSING_BLOCK_LABEL_76;
label1:
        {
            if (((ci) (obj)).f == null || !"83b059946f7ad6864666f0e39522835c51aa5537".equals(((ci) (obj)).f))
            {
                break label1;
            }
            Log.d("Taplytics", "Taplytics has already started! Taplytics only needs to be started once, preferably in your Application subclass.");
        }
          goto _L3
        if (gs.b())
        {
            gs.a((new StringBuilder("Start Taplytics with API Key: ")).append("83b059946f7ad6864666f0e39522835c51aa5537").toString());
        }
        obj.f = "83b059946f7ad6864666f0e39522835c51aa5537";
        obj.u = this;
        obj.c = new ba(this);
        obj.b = new dp(this);
        obj.d = new j();
        obj.e = new cs();
        if (android.os.Build.VERSION.SDK_INT >= 14 && !((ci) (obj)).h)
        {
            obj.x = com.taplytics.d.a(this);
        }
        if (!((ci) (obj)).i)
        {
            ((ci) (obj)).b(true);
            obj.i = true;
        }
        obj1 = ox.b;
        obj2 = ((ci) (obj)).b;
        if (obj1 == ((dp) (obj2)).a) goto _L5; else goto _L4
_L4:
        obj2.a = ((ox) (obj1));
        dt.a[((dp) (obj2)).a.ordinal()];
        JVM INSTR tableswitch 1 3: default 1129
    //                   1 734
    //                   2 777
    //                   3 820;
           goto _L6 _L7 _L8 _L9
_L6:
        obj2.d = "socketio.taplytics.com";
        obj2.b = "api.taplytics.com";
        obj2.c = "ping.taplytics.com";
        obj2.e = "https://";
        if (gs.b())
        {
            gs.a("Switched to Production Server!");
        }
_L5:
        obj1 = ((ci) (obj)).d;
        if (ci.b().j && !hi.a(shelduck.b)) goto _L11; else goto _L10
_L10:
        obj.p = null;
        obj.y = new ArrayList();
        ((ci) (obj)).y.add(new cj(((ci) (obj))));
        obj1 = gt.a();
        obj2 = new ck(((ci) (obj)), "83b059946f7ad6864666f0e39522835c51aa5537");
        if (ci.b().u != null) goto _L13; else goto _L12
_L12:
        ((he) (obj2)).a(null, new Exception("No App Context to write JSON to disk"));
_L15:
        if (android.os.Build.VERSION.SDK_INT < 14 || !((ci) (obj)).h)
        {
            ((ci) (obj)).d();
        }
        if ((getApplicationInfo().flags & 2) != 0)
        {
            obj1 = ((ci) (obj)).b;
            if (ci.b().j)
            {
                (new eb(((dp) (obj1)), (byte)0)).execute(new el[] {
                    null
                });
            }
        }
        ((ci) (obj)).c();
          goto _L3
_L7:
        obj2.d = "socketio-dev.taplytics.com";
        obj2.b = "dev.taplytics.com";
        obj2.c = "dev.taplytics.com";
        obj2.e = "https://";
        if (gs.b())
        {
            gs.a("Switched to Dev Server!");
        }
          goto _L5
_L8:
        obj2.d = "socketio-staging.taplytics.com";
        obj2.b = "staging.taplytics.com";
        obj2.c = "staging.taplytics.com";
        obj2.e = "https://";
        if (gs.b())
        {
            gs.a("Switched to Staging Server!");
        }
          goto _L5
_L9:
        obj2.d = "10.0.3.2";
        obj2.b = "10.0.3.2:3002";
        obj2.c = "10.0.3.2:3002";
        obj2.e = "http://";
        if (gs.b())
        {
            gs.a("Switched to Local Host!");
        }
          goto _L5
_L11:
        obj2 = gt.a();
        l1 = new com.taplytics.l(((j) (obj1)));
        if (ci.b().u != null)
        {
            break MISSING_BLOCK_LABEL_951;
        }
        l1.a(null, new Exception("No App Context to write JSON to disk"));
_L14:
        obj2 = ((j) (obj1)).c;
        obj1 = gt.a();
        obj2 = new com.taplytics.o(((com.taplytics.n) (obj2)));
        if (ci.b().u != null)
        {
            break MISSING_BLOCK_LABEL_973;
        }
        ((hg) (obj2)).a(null, new Exception("No App Context to read App User Attributes from Disk!"));
          goto _L10
        gt.a("TLEvents.json", "JSONArray", new gy(((gt) (obj2)), l1));
          goto _L14
        gt.a("TLUserAttributes.json", "JSONObject", new ha(((gt) (obj1)), ((hg) (obj2))));
          goto _L10
_L13:
        gt.a("TLProperties.json", "JSONObject", new gv(((gt) (obj1)), ((he) (obj2))));
          goto _L15
        obj1.a = ((com.squareup.picasso.Downloader) (obj2));
        if (((com.squareup.picasso.Picasso.a) (obj1)).b != null)
        {
            throw new IllegalStateException("Memory cache already set.");
        }
        obj1.b = ((com.squareup.picasso.d) (obj));
        Picasso.a(((com.squareup.picasso.Picasso.a) (obj1)).a());
        registerActivityLifecycleCallbacks(r);
        registerComponentCallbacks(new ComponentCallbacks2(((m) (obj))) {

            final m a;
            final ManagerApp b;

            public final void onConfigurationChanged(Configuration configuration)
            {
            }

            public final void onLowMemory()
            {
                com.tinder.utils.v.a("Low memory warning!");
            }

            public final void onTrimMemory(int i1)
            {
                switch (i1)
                {
                default:
                    return;

                case 60: // '<'
                    com.tinder.utils.v.a("Trimming memory moderate");
                    try
                    {
                        b.j.b.a();
                        return;
                    }
                    catch (IOException ioexception)
                    {
                        com.tinder.utils.v.a("Failed to clear HTTP Cache", ioexception);
                    }
                    return;

                case 10: // '\n'
                    com.tinder.utils.v.a("Trimming memory running low");
                    com.tinder.managers.ManagerApp.a(b, a);
                    return;

                case 15: // '\017'
                    com.tinder.utils.v.a("Trimming memory critical");
                    com.tinder.managers.ManagerApp.a(b, a);
                    return;

                case 20: // '\024'
                    com.tinder.utils.v.a("Trimming memory UI hidden");
                    com.tinder.managers.ManagerApp.a(b, a);
                    b.k.m();
                    try
                    {
                        b.j.b.a();
                        return;
                    }
                    catch (IOException ioexception1)
                    {
                        com.tinder.utils.v.a("Failed to clear HTTP Cache", ioexception1);
                    }
                    return;

                case 40: // '('
                    com.tinder.utils.v.a("Trimming memory background");
                    com.tinder.managers.ManagerApp.a(b, a);
                    return;

                case 80: // 'P'
                    com.tinder.utils.v.a("Trimming memory complete");
                    com.tinder.managers.ManagerApp.a(b, a);
                    return;
                }
            }

            
            {
                b = ManagerApp.this;
                a = m1;
                super();
            }
        });
        obj = s.b();
        (new StringBuilder("Configured Environment: ")).append(obj);
        (new AsyncTask() {

            final ManagerApp a;

            private transient com.google.android.gms.ads.identifier.AdvertisingIdClient.Info a()
            {
                com.google.android.gms.ads.identifier.AdvertisingIdClient.Info info = AdvertisingIdClient.getAdvertisingIdInfo(a);
                return info;
                Object obj3;
                obj3;
                com.tinder.utils.v.a("Failed to load Advertising ID", ((Throwable) (obj3)));
_L2:
                return null;
                obj3;
                com.tinder.utils.v.a("Failed to load Advertising ID, Google Play Services missing!", ((Throwable) (obj3)));
                continue; /* Loop/switch isn't completed */
                obj3;
                com.tinder.utils.v.a("Failed to load Advertising ID, Google Play Services not setup properly!", ((Throwable) (obj3)));
                if (true) goto _L2; else goto _L1
_L1:
            }

            protected final Object doInBackground(Object aobj[])
            {
                return a();
            }

            protected final void onPostExecute(Object obj3)
            {
                com.tinder.managers.ManagerApp.a((com.google.android.gms.ads.identifier.AdvertisingIdClient.Info)obj3);
            }

            
            {
                a = ManagerApp.this;
                super();
            }
        }).execute(new Void[0]);
        m.a();
        return;
          goto _L5
    }

    public void onEvent(de.greenrobot.event.f f1)
    {
        com.tinder.utils.v.b((new StringBuilder("No subscribers for event: ")).append(f1.b).toString());
    }

    public void onEventMainThread(EventLoggedOut eventloggedout)
    {
        if (v != null)
        {
            a(v, false);
            v = null;
        }
        eventloggedout = new Intent(q, com/tinder/activities/ActivityLogin);
        eventloggedout.setFlags(0x10008000);
        eventloggedout.putExtra("extra_show_intro", true);
        q.startActivity(eventloggedout);
    }

    public void onTerminate()
    {
        f.c(new EventUnregisterManagers());
        f.b(this);
        super.onTerminate();
    }

    static 
    {
        boolean flag = true;
        if (android.os.Build.VERSION.SDK_INT < 19)
        {
            flag = false;
        }
        c = flag;
    }
}
