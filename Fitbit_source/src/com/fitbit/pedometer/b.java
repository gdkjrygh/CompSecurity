// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.pedometer;

import com.fitbit.FitBitApplication;
import com.fitbit.data.domain.PedometerMinuteData;
import com.fitbit.pedometer.google.GoogleStepsService;
import com.fitbit.pedometer.schedule.SchedulingPolicy;
import com.fitbit.pedometer.schedule.a;
import com.fitbit.util.o;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.fitbit.pedometer:
//            e, f, g, k, 
//            i, j

public class b extends e
{
    static class a extends i
    {

        a()
        {
        /* block-local class not found */
        class _cls1 {}

            a(new _cls1());
        /* block-local class not found */
        class _cls2 {}

            a(new _cls2());
        /* block-local class not found */
        class _cls3 {}

            a(new _cls3());
        /* block-local class not found */
        class _cls4 {}

            a(new _cls4());
        /* block-local class not found */
        class _cls5 {}

            a(new _cls5());
        }
    }


    private static final String b = "GooglePedometerAdapter";
    private static final SchedulingPolicy c = new com.fitbit.pedometer.schedule.a();
    private f d;
    private g e;
    private volatile boolean f;
    private volatile boolean g;
    private Date h;

    public b()
    {
        d = new f(false);
        e = new g();
    }

    static f a(b b1)
    {
        return b1.d;
    }

    static f a(b b1, f f1)
    {
        b1.d = f1;
        return f1;
    }

    static g a(b b1, g g1)
    {
        b1.e = g1;
        return g1;
    }

    static boolean a(long l, long l1, long l2)
    {
        return b(l, l1, l2);
    }

    static boolean a(b b1, boolean flag)
    {
        b1.g = flag;
        return flag;
    }

    private static boolean b(long l, long l1, long l2)
    {
        long l3 = l2;
        if (k.c())
        {
            l3 = l2 + TimeUnit.MINUTES.toMillis(2L);
        }
        return com.fitbit.pedometer.k.a(l, l1) || l < l1 || l > l3;
    }

    static boolean b(b b1)
    {
        return b1.f;
    }

    static g c(b b1)
    {
        return b1.e;
    }

    static boolean d(b b1)
    {
        return b1.g;
    }

    public PedometerAdapterHelper.PedometerManufacturer a()
    {
        return PedometerAdapterHelper.PedometerManufacturer.c;
    }

    public void a(long l)
    {
        com.fitbit.pedometer.e.a(new Runnable(l) {

            final long a;
            final b b;

            public void run()
            {
                long l1 = com.fitbit.pedometer.b.a(b).c();
                Date date = new Date();
                long l2 = date.getTime();
                if (com.fitbit.pedometer.b.a(a, l1, l2))
                {
                    com.fitbit.e.a.e("GooglePedometerAdapter", String.format("Skipped step with timestamp: %s [%d]\nLast complete minute timestamp: %s [%d]\nNow timestamp: %s [%d]", new Object[] {
                        new Date(a), Long.valueOf(a), new Date(l1), Long.valueOf(l1), date, Long.valueOf(l2)
                    }), new Object[0]);
                } else
                {
                    j j1 = new j(a);
                    com.fitbit.pedometer.b.a(b).a(j1);
                    if (b.b(b) && b.a != null && b.c(b) != null)
                    {
                        b.c(b).a(Collections.singletonList(j1));
                        b.a.a(b.c(b).a(), b.c(b).b(), b.c(b).c());
                        return;
                    }
                }
            }

            
            {
                b = b.this;
                a = l;
                super();
            }
        });
    }

    public void a(boolean flag)
    {
        if (a != null)
        {
            a.a();
            FitBitApplication fitbitapplication = FitBitApplication.a();
            com.fitbit.pedometer.google.GoogleStepsService.ServiceCommand servicecommand;
            if (flag)
            {
                servicecommand = com.fitbit.pedometer.google.GoogleStepsService.ServiceCommand.b;
            } else
            {
                servicecommand = com.fitbit.pedometer.google.GoogleStepsService.ServiceCommand.a;
            }
            GoogleStepsService.a(fitbitapplication, servicecommand);
        }
    }

    public void b(boolean flag)
    {
        f = flag;
        g = flag;
        Object obj = new Date();
        FitBitApplication fitbitapplication;
        if (flag)
        {
            if (h != null && o.j(h, ((Date) (obj))) && e != null)
            {
                a.a(e.a(), e.b(), e.c());
            } else
            {
                e = new g();
                a.a(e.a(), e.b(), e.c());
            }
        }
        h = ((Date) (obj));
        fitbitapplication = FitBitApplication.a();
        if (flag)
        {
            obj = com.fitbit.pedometer.google.GoogleStepsService.ServiceCommand.c;
        } else
        {
            obj = com.fitbit.pedometer.google.GoogleStepsService.ServiceCommand.d;
        }
        GoogleStepsService.a(fitbitapplication, ((com.fitbit.pedometer.google.GoogleStepsService.ServiceCommand) (obj)));
    }

    public boolean b()
    {
        return true;
    }

    public void c()
    {
    }

    public void c(boolean flag)
    {
        if (flag)
        {
            GoogleStepsService.a(FitBitApplication.a());
            return;
        } else
        {
            GoogleStepsService.b(FitBitApplication.a());
            return;
        }
    }

    public void d()
    {
    }

    public void d(boolean flag)
    {
        com.fitbit.pedometer.e.a(new Runnable(flag) {

            final boolean a;
            final b b;

            public void run()
            {
                com.fitbit.pedometer.b.a(b).a((new Date()).getTime());
                Object obj = com.fitbit.pedometer.b.a(b).a(a);
                if (b.a != null)
                {
                    PedometerMinuteData pedometerminutedata;
                    for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); b.a.a(pedometerminutedata))
                    {
                        pedometerminutedata = (PedometerMinuteData)((Iterator) (obj)).next();
                    }

                }
                if (b.d(b) && b.a != null && b.c(b) != null)
                {
                    com.fitbit.pedometer.b.a(b, false);
                    List list = com.fitbit.pedometer.b.a(b).a();
                    b.c(b).a(list);
                    b.a.a(b.c(b).a(), b.c(b).b(), b.c(b).c());
                }
                if (b.a != null)
                {
                    b.a.b();
                }
            }

            
            {
                b = b.this;
                a = flag;
                super();
            }
        });
    }

    public void e()
    {
        com.fitbit.pedometer.e.a(new Runnable() {

            final b a;

            public void run()
            {
                com.fitbit.pedometer.b.a(a, null);
                com.fitbit.pedometer.b.a(a, new f(false));
            }

            
            {
                a = b.this;
                super();
            }
        });
    }

    public SchedulingPolicy f()
    {
        return c;
    }

}
