// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.pedometer;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.fitbit.FitBitApplication;
import com.fitbit.data.domain.Length;
import com.fitbit.data.domain.PedometerMinuteData;
import com.fitbit.pedometer.schedule.SchedulingPolicy;
import com.fitbit.util.threading.FitbitHandlerThread;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.androidannotations.a.a;

// Referenced classes of package com.fitbit.pedometer:
//            a, PedometerAdapterHelper

public abstract class e
{
    public static interface a
    {

        public abstract void a();

        public abstract void a(int i1, double d1, Length length);

        public abstract void a(PedometerMinuteData pedometerminutedata);

        public abstract void b();
    }

    public static interface b
    {

        public abstract void a(Object obj);
    }


    private static final String b = "PedometerAdapter";
    private static final String c = "com.fitbit.pedometer.PedometerAdapter.CAHCED_ADAPTER_MANUFACTURER_KEY";
    private static e d;
    private static e e = o();
    private static final List f = new ArrayList();
    private static final Object g = new Object();
    private static boolean h = false;
    protected a a;

    public e()
    {
    }

    static e a(e e1)
    {
        d = e1;
        return e1;
    }

    static void a(PedometerAdapterHelper.PedometerManufacturer pedometermanufacturer)
    {
        b(pedometermanufacturer);
    }

    public static void a(b b1)
    {
        a(new b(b1) {

            final b a;

            public void a(e e1)
            {
                a.a(Boolean.valueOf(PedometerAdapterHelper.b(e1.a())));
            }

            public volatile void a(Object obj)
            {
                a((e)obj);
            }

            
            {
                a = b1;
                super();
            }
        }, false);
    }

    public static void a(b b1, boolean flag)
    {
        if (d != null && !flag)
        {
            break MISSING_BLOCK_LABEL_80;
        }
        Object obj = g;
        obj;
        JVM INSTR monitorenter ;
        if (d == null || flag)
        {
            break MISSING_BLOCK_LABEL_39;
        }
        b1.a(d);
        obj;
        JVM INSTR monitorexit ;
        return;
        f.add(b1);
        if (!h)
        {
            break MISSING_BLOCK_LABEL_63;
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        b1;
        obj;
        JVM INSTR monitorexit ;
        throw b1;
        h = true;
        obj;
        JVM INSTR monitorexit ;
        org.androidannotations.a.a.a(new Runnable() {

            public void run()
            {
                Object obj1;
                obj1 = com.fitbit.pedometer.PedometerAdapterHelper.a();
                com.fitbit.e.a.a("PedometerAdapter", "Pedometer manufacturer: %s", new Object[] {
                    obj1
                });
                com.fitbit.pedometer.e.a(com.fitbit.pedometer.PedometerAdapterHelper.a(((PedometerAdapterHelper.PedometerManufacturer) (obj1))));
                com.fitbit.pedometer.e.a(((PedometerAdapterHelper.PedometerManufacturer) (obj1)));
                e.b(e.k());
                Iterator iterator;
                Exception exception;
                if (e.k() != null)
                {
                    obj1 = e.k().getClass().getSimpleName();
                } else
                {
                    obj1 = "null";
                }
                com.fitbit.e.a.a("PedometerAdapter", "Default adapter: %s", new Object[] {
                    obj1
                });
                obj1 = e.l();
                obj1;
                JVM INSTR monitorenter ;
                for (iterator = e.m().iterator(); iterator.hasNext(); ((b)iterator.next()).a(e.k())) { }
                break MISSING_BLOCK_LABEL_124;
                exception;
                obj1;
                JVM INSTR monitorexit ;
                throw exception;
                e.m().clear();
                e.e(false);
                obj1;
                JVM INSTR monitorexit ;
            }

        });
        return;
        b1.a(d);
        return;
    }

    public static void a(Runnable runnable)
    {
        FitbitHandlerThread.a(com.fitbit.util.threading.FitbitHandlerThread.ThreadName.g, runnable);
    }

    static e b(e e1)
    {
        e = e1;
        return e1;
    }

    private static void b(PedometerAdapterHelper.PedometerManufacturer pedometermanufacturer)
    {
        com.fitbit.e.a.a("PedometerAdapter", String.format("Manufacturer in cache [%s]", new Object[] {
            pedometermanufacturer
        }), new Object[0]);
        SharedPreferences sharedpreferences = PreferenceManager.getDefaultSharedPreferences(FitBitApplication.a());
        if (pedometermanufacturer == null)
        {
            sharedpreferences.edit().remove("com.fitbit.pedometer.PedometerAdapter.CAHCED_ADAPTER_MANUFACTURER_KEY").commit();
            return;
        } else
        {
            sharedpreferences.edit().putString("com.fitbit.pedometer.PedometerAdapter.CAHCED_ADAPTER_MANUFACTURER_KEY", pedometermanufacturer.a()).commit();
            return;
        }
    }

    static boolean e(boolean flag)
    {
        h = flag;
        return flag;
    }

    public static e g()
    {
        if (d != null)
        {
            return d;
        }
        if (e != null)
        {
            return e;
        } else
        {
            return new com.fitbit.pedometer.a();
        }
    }

    public static boolean h()
    {
        if (d != null)
        {
            return PedometerAdapterHelper.b(d.a());
        }
        if (e != null)
        {
            return PedometerAdapterHelper.b(e.a());
        } else
        {
            return false;
        }
    }

    public static void j()
    {
        synchronized (g)
        {
            d = null;
            h = false;
            e = null;
            b(((PedometerAdapterHelper.PedometerManufacturer) (null)));
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static e k()
    {
        return d;
    }

    static Object l()
    {
        return g;
    }

    static List m()
    {
        return f;
    }

    private static PedometerAdapterHelper.PedometerManufacturer n()
    {
        String s = PreferenceManager.getDefaultSharedPreferences(FitBitApplication.a()).getString("com.fitbit.pedometer.PedometerAdapter.CAHCED_ADAPTER_MANUFACTURER_KEY", null);
        if (s == null)
        {
            return null;
        } else
        {
            return com.fitbit.pedometer.PedometerAdapterHelper.PedometerManufacturer.a(s);
        }
    }

    private static e o()
    {
        PedometerAdapterHelper.PedometerManufacturer pedometermanufacturer = n();
        if (pedometermanufacturer != null)
        {
            return com.fitbit.pedometer.PedometerAdapterHelper.a(pedometermanufacturer);
        } else
        {
            return null;
        }
    }

    public abstract PedometerAdapterHelper.PedometerManufacturer a();

    public void a(a a1)
    {
        a = a1;
    }

    public abstract void a(boolean flag);

    public abstract void b(boolean flag);

    public abstract boolean b();

    public abstract void c();

    public abstract void c(boolean flag);

    public abstract void d();

    public abstract void e();

    public abstract SchedulingPolicy f();

    public a i()
    {
        return a;
    }

}
