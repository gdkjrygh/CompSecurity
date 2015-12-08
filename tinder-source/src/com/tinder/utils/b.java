// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.utils;

import android.app.Activity;
import android.os.Bundle;
import com.tinder.f.ak;
import com.tinder.managers.ManagerApp;
import com.tinder.managers.d;
import com.tinder.managers.e;
import com.tinder.managers.g;
import com.tinder.managers.z;
import com.tinder.model.SparksEvent;
import java.lang.ref.WeakReference;
import java.util.Timer;
import java.util.TimerTask;

// Referenced classes of package com.tinder.utils:
//            o

public final class com.tinder.utils.b
    implements android.app.Application.ActivityLifecycleCallbacks
{
    public static interface a
    {

        public abstract void a();
    }

    public static final class b
    {

        a a;
        private boolean b;
        private Timer c;
        private TimerTask d;

        public final void a()
        {
            this;
            JVM INSTR monitorenter ;
            if (!b)
            {
                c = new Timer();
                d = new TimerTask(this) {

                    final b a;

                    public final void run()
                    {
                        a.a.a();
                    }

            
            {
                a = b1;
                super();
            }
                };
                c.schedule(d, 600L);
                b = true;
            }
            this;
            JVM INSTR monitorexit ;
            return;
            Exception exception;
            exception;
            throw exception;
        }

        public final void b()
        {
            this;
            JVM INSTR monitorenter ;
            b = false;
            if (c != null && d != null)
            {
                d.cancel();
                c.cancel();
            }
            this;
            JVM INSTR monitorexit ;
            return;
            Exception exception;
            exception;
            throw exception;
        }

        public b(a a1)
        {
            b = false;
            a = a1;
        }
    }

    public static interface c
    {

        public abstract void l();

        public abstract void m();
    }


    public static boolean a = false;
    static boolean b = true;
    static boolean c = false;
    private static boolean h;
    private static b i;
    d d;
    z e;
    g f;
    e g;
    private WeakReference j;

    public com.tinder.utils.b(c c1)
    {
        if (c1 == null)
        {
            throw new IllegalArgumentException("LifeCycleHelperInterface cannot be null in constructor");
        } else
        {
            ManagerApp.h().a(this);
            j = new WeakReference(c1);
            i = new b(new a() {

                final com.tinder.utils.b a;

                public final void a()
                {
                    a.a();
                    (new SparksEvent("App.Close")).put("registered", Boolean.valueOf(ManagerApp.h().g().f())).fire();
                    com.tinder.utils.b.b = true;
                    com.tinder.utils.b.c = false;
                    com.tinder.managers.a.a();
                    g g1 = a.f;
                    g1.c = true;
                    if (g1.a != null)
                    {
                        g1.a.c();
                    }
                    if (o.a(com.tinder.utils.b.a(a)))
                    {
                        ((c)com.tinder.utils.b.a(a).get()).m();
                    }
                }

            
            {
                a = com.tinder.utils.b.this;
                super();
            }
            });
            return;
        }
    }

    static WeakReference a(com.tinder.utils.b b1)
    {
        return b1.j;
    }

    public final void a()
    {
        if (!c)
        {
            SparksEvent sparksevent = new SparksEvent("App.Open");
            sparksevent.put("resume", Boolean.valueOf(h));
            if (e.f)
            {
                g.g = sparksevent;
            } else
            {
                g.a(sparksevent);
                sparksevent.put("registered", Boolean.valueOf(ManagerApp.h().g().f()));
                sparksevent.fire();
            }
            h = true;
            b = false;
            c = true;
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle)
    {
    }

    public final void onActivityDestroyed(Activity activity)
    {
    }

    public final void onActivityPaused(Activity activity)
    {
        a = false;
        i.a();
    }

    public final void onActivityResumed(Activity activity)
    {
        a = true;
        i.b();
        if (b)
        {
            if (d.f())
            {
                a();
            }
            if (o.a(j))
            {
                ((c)j.get()).l();
            }
        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle)
    {
    }

    public final void onActivityStarted(Activity activity)
    {
    }

    public final void onActivityStopped(Activity activity)
    {
    }

}
