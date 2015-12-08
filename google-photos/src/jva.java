// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Handler;
import android.os.IBinder;
import android.text.TextUtils;
import android.view.Display;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class jva extends Service
{

    private static final jwx a = new jwx("CastRemoteDisplayLocalService");
    private static final int b;
    private static final Object c = new Object();
    private static AtomicBoolean d = new AtomicBoolean(false);
    private static jva u;
    private jyn e;
    private jux f;
    private String g;
    private jvj h;
    private jvn i;
    private jvk j;
    private Notification k;
    private Boolean l;
    private PendingIntent m;
    private CastDevice n;
    private Display o;
    private Context p;
    private ServiceConnection q;
    private Handler r;
    private zb s;
    private final zc t = new jvb(this);
    private final IBinder v = new jvm(this);

    public jva()
    {
    }

    static Context a(jva jva1, Context context)
    {
        jva1.p = null;
        return null;
    }

    static ServiceConnection a(jva jva1, ServiceConnection serviceconnection)
    {
        jva1.q = null;
        return null;
    }

    static CastDevice a(jva jva1)
    {
        return jva1.n;
    }

    public static void a()
    {
        b(false);
    }

    public static void a(Context context, Class class1, String s1, CastDevice castdevice, jvk jvk1, jvj jvj1)
    {
        a.a("Starting Service", new Object[0]);
        synchronized (c)
        {
            if (u != null)
            {
                a.c("An existing service had not been stopped before starting one", new Object[0]);
                b(true);
            }
        }
        try
        {
            obj = new ComponentName(context, class1);
            obj = context.getPackageManager().getServiceInfo(((ComponentName) (obj)), 128);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new IllegalStateException("Service not found, did you forget to configure it in the manifest?");
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_110;
        }
        if (((ServiceInfo) (obj)).exported)
        {
            throw new IllegalStateException("The service must not be exported, verify the manifest configuration");
        }
        break MISSING_BLOCK_LABEL_110;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
        b.f(context, "activityContext is required.");
        b.f(class1, "serviceClass is required.");
        b.f(s1, "applicationId is required.");
        b.f(castdevice, "device is required.");
        b.f(jvk1, "notificationSettings is required.");
        b.f(jvj1, "callbacks is required.");
        if (jvk1.a == null && jvk1.b == null)
        {
            throw new IllegalArgumentException("notificationSettings: Either the notification or the notificationPendingIntent must be provided");
        }
        if (d.getAndSet(true))
        {
            a.d("Service is already being started, startService has been called twice", new Object[0]);
            return;
        } else
        {
            class1 = new Intent(context, class1);
            context.startService(class1);
            context.bindService(class1, new jvc(s1, castdevice, jvk1, context, jvj1), 64);
            return;
        }
    }

    private void a(String s1)
    {
        a.a("[Instance: %s] %s", new Object[] {
            this, s1
        });
    }

    static void a(jva jva1, Display display)
    {
        jva1.o = display;
        if (jva1.l.booleanValue())
        {
            jva1.k = jva1.c(true);
            jva1.startForeground(b, jva1.k);
        }
        if (jva1.h != null)
        {
            jva1.h.a(jva1);
            jva1.h = null;
        }
        jva1.a(jva1.o);
    }

    static void a(jva jva1, String s1)
    {
        jva1.a(s1);
    }

    static void a(boolean flag)
    {
        b(false);
    }

    private boolean a(String s1, CastDevice castdevice, jvk jvk1, Context context, ServiceConnection serviceconnection, jvj jvj1)
    {
label0:
        {
            a("startRemoteDisplaySession");
            b.p("Starting the Cast Remote Display must be done on the main thread");
            synchronized (c)
            {
                if (u == null)
                {
                    break label0;
                }
                a.c("An existing service had not been stopped before starting one", new Object[0]);
            }
            return false;
        }
        u = this;
        obj;
        JVM INSTR monitorexit ;
        h = jvj1;
        g = s1;
        n = castdevice;
        p = context;
        q = serviceconnection;
        s = zb.a(getApplicationContext());
        s1 = (new za()).a(b.n(g)).a();
        a("addMediaRouterCallback");
        s.a(s1, t, 4);
        r = new Handler(getMainLooper());
        k = jvk1.a;
        i = new jvn();
        registerReceiver(i, new IntentFilter("com.google.android.gms.cast.remote_display.ACTION_NOTIFICATION_DISCONNECT"));
        j = new jvk(jvk1);
        if (j.a == null)
        {
            l = Boolean.valueOf(true);
            k = c(false);
        } else
        {
            l = Boolean.valueOf(false);
            k = j.a;
        }
        startForeground(b, k);
        s1 = new juw(castdevice, f);
        e = (new jyo(this, new jvh(this), new jvi(this))).a(jut.a, new juv(s1)).a();
        e.b();
        return true;
        s1;
        obj;
        JVM INSTR monitorexit ;
        throw s1;
    }

    static boolean a(jva jva1, String s1, CastDevice castdevice, jvk jvk1, Context context, ServiceConnection serviceconnection, jvj jvj1)
    {
        return jva1.a(s1, castdevice, jvk1, context, serviceconnection, jvj1);
    }

    static Handler b(jva jva1)
    {
        return jva1.r;
    }

    static Display b(jva jva1, Display display)
    {
        jva1.o = null;
        return null;
    }

    static jwx b()
    {
        return a;
    }

    static void b(jva jva1, String s1)
    {
        a.d("[Instance: %s] %s", new Object[] {
            jva1, s1
        });
    }

    private static void b(boolean flag)
    {
label0:
        {
            a.a("Stopping Service", new Object[0]);
            d.set(false);
            synchronized (c)
            {
                if (u != null)
                {
                    break label0;
                }
                a.d("Service is already being stopped", new Object[0]);
            }
            return;
        }
        obj1 = u;
        u = null;
        obj;
        JVM INSTR monitorexit ;
        ((jva) (obj1)).a("Stopping Service");
        if (!flag && ((jva) (obj1)).s != null)
        {
            ((jva) (obj1)).a("Setting default route");
            zb.a(zb.b());
        }
        if (((jva) (obj1)).i != null)
        {
            ((jva) (obj1)).a("Unregistering notification receiver");
            ((jva) (obj1)).unregisterReceiver(((jva) (obj1)).i);
        }
        ((jva) (obj1)).a("stopRemoteDisplaySession");
        ((jva) (obj1)).a("stopRemoteDisplay");
        if (((jva) (obj1)).e == null || !((jva) (obj1)).e.e())
        {
            a.d("Unable to stop the remote display as the API client is not ready", new Object[0]);
        } else
        {
            jut.b.a(((jva) (obj1)).e).a(new jvg(((jva) (obj1))));
        }
        ((jva) (obj1)).a("Stopping the remote display Service");
        ((jva) (obj1)).stopForeground(true);
        ((jva) (obj1)).stopSelf();
        if (((jva) (obj1)).s != null)
        {
            b.p("CastRemoteDisplayLocalService calls must be done on the main thread");
            ((jva) (obj1)).a("removeMediaRouterCallback");
            ((jva) (obj1)).s.a(((jva) (obj1)).t);
        }
        if (((jva) (obj1)).e != null)
        {
            ((jva) (obj1)).e.d();
            obj1.e = null;
        }
        if (((jva) (obj1)).p != null && ((jva) (obj1)).q != null)
        {
            try
            {
                ((jva) (obj1)).p.unbindService(((jva) (obj1)).q);
            }
            catch (IllegalArgumentException illegalargumentexception)
            {
                ((jva) (obj1)).a("No need to unbind service, already unbound");
            }
            obj1.q = null;
            obj1.p = null;
        }
        obj1.g = null;
        obj1.e = null;
        obj1.k = null;
        obj1.o = null;
        return;
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
    }

    private Notification c(boolean flag)
    {
        a("createDefaultNotification");
        int k1 = getApplicationInfo().labelRes;
        Object obj1 = j.c;
        String s1 = j.d;
        Object obj;
        int i1;
        int j1;
        if (flag)
        {
            j1 = b.Dw;
            i1 = b.Du;
        } else
        {
            j1 = b.Dx;
            i1 = b.Dt;
        }
        obj = obj1;
        if (TextUtils.isEmpty(((CharSequence) (obj1))))
        {
            obj = getString(k1);
        }
        if (TextUtils.isEmpty(s1))
        {
            s1 = getString(j1, new Object[] {
                n.d
            });
        }
        obj = (new cn(this)).a(((CharSequence) (obj))).b(s1);
        obj.d = j.b;
        obj = ((cn) (obj)).a(i1);
        ((cn) (obj)).a_(2, true);
        s1 = getString(b.Dy);
        if (m == null)
        {
            m = PendingIntent.getBroadcast(this, 0, new Intent("com.google.android.gms.cast.remote_display.ACTION_NOTIFICATION_DISCONNECT"), 0x10000000);
        }
        obj1 = m;
        ((cn) (obj)).p.add(new ck(0x1080038, s1, ((PendingIntent) (obj1))));
        return ((cn) (obj)).a();
    }

    static AtomicBoolean c()
    {
        return d;
    }

    static void c(jva jva1)
    {
        if (jva1.h != null)
        {
            jva1.h.a(new Status(2200));
            jva1.h = null;
        }
        b(false);
    }

    static Context d(jva jva1)
    {
        return jva1.p;
    }

    static Object d()
    {
        return c;
    }

    static ServiceConnection e(jva jva1)
    {
        return jva1.q;
    }

    static jva e()
    {
        return u;
    }

    static void f(jva jva1)
    {
        jva1.a("startRemoteDisplay");
        if (jva1.e == null || !jva1.e.e())
        {
            a.d("Unable to start the remote display as the API client is not ready", new Object[0]);
            return;
        } else
        {
            jut.b.a(jva1.e, jva1.g).a(new jvf(jva1));
            return;
        }
    }

    public abstract void a(Display display);

    public IBinder onBind(Intent intent)
    {
        a("onBind");
        return v;
    }

    public void onCreate()
    {
        super.onCreate();
        f = new jvd(this);
    }

    public int onStartCommand(Intent intent, int i1, int j1)
    {
        a("onStartCommand");
        return 2;
    }

    static 
    {
        b = b.Dv;
    }
}
