// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.pedometer.service;

import android.app.Service;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.IBinder;
import android.os.PowerManager;
import android.support.v4.content.LocalBroadcastManager;
import com.fitbit.ApplicationForegroundController;
import com.fitbit.data.bl.am;
import com.fitbit.data.bl.t;
import com.fitbit.data.domain.CaloriesBurnedGoal;
import com.fitbit.data.domain.DistanceGoal;
import com.fitbit.data.domain.Length;
import com.fitbit.data.domain.PedometerMinuteData;
import com.fitbit.data.domain.StepsGoal;
import com.fitbit.e.a;
import com.fitbit.livedata.LiveDataPacket;
import com.fitbit.pedometer.e;
import com.fitbit.pedometer.h;
import com.fitbit.savedstate.s;
import com.fitbit.util.o;
import com.fitbit.util.threading.c;
import com.fitbit.widget.b;
import java.util.Date;
import java.util.Map;

// Referenced classes of package com.fitbit.pedometer.service:
//            b, a, PedometerServicesStateListener

class PedometerService extends Service
    implements com.fitbit.pedometer.e.a, com.fitbit.util.d.a.a
{
    static final class PedometerServiceCommand extends Enum
    {

        public static final PedometerServiceCommand a;
        public static final PedometerServiceCommand b;
        public static final PedometerServiceCommand c;
        public static final PedometerServiceCommand d;
        public static final PedometerServiceCommand e;
        public static final PedometerServiceCommand f;
        private static final PedometerServiceCommand g[];

        public static PedometerServiceCommand b(Intent intent)
        {
            if (!intent.hasExtra("com.fitbit.pedometer.service.PedometerService.EXTRA_PEDOMETER_SERVICE_COMMAND"))
            {
                return c;
            } else
            {
                return values()[intent.getIntExtra("com.fitbit.pedometer.service.PedometerService.EXTRA_PEDOMETER_SERVICE_COMMAND", -1)];
            }
        }

        public static PedometerServiceCommand valueOf(String s1)
        {
            return (PedometerServiceCommand)Enum.valueOf(com/fitbit/pedometer/service/PedometerService$PedometerServiceCommand, s1);
        }

        public static PedometerServiceCommand[] values()
        {
            return (PedometerServiceCommand[])g.clone();
        }

        public void a(Intent intent)
        {
            intent.putExtra("com.fitbit.pedometer.service.PedometerService.EXTRA_PEDOMETER_SERVICE_COMMAND", ordinal());
        }

        static 
        {
            a = new PedometerServiceCommand("START_STEP_COUNTING", 0);
            b = new PedometerServiceCommand("STOP_STEP_COUNTING", 1);
            c = new PedometerServiceCommand("FLUSH", 2);
            d = new PedometerServiceCommand("FLUSH_ALL", 3);
            e = new PedometerServiceCommand("START_LIVE_DATA", 4);
            f = new PedometerServiceCommand("STOP_LIVE_DATA", 5);
            g = (new PedometerServiceCommand[] {
                a, b, c, d, e, f
            });
        }

        private PedometerServiceCommand(String s1, int i1)
        {
            super(s1, i1);
        }
    }


    static final String a = "com.fitbit.pedometer.service.PedometerService.EXTRA_PEDOMETER_SERVICE_COMMAND";
    static final String b = "com.fitbit.pedometer.service.PedometerService.ACTION_FLUSH_FINISHED";
    private static final String e = "PedometerService";
    protected PedometerServicesStateListener c;
    protected PowerManager d;
    private e f;
    private android.os.PowerManager.WakeLock g;
    private int h;
    private com.fitbit.util.d.a i;
    private boolean j;
    private boolean k;
    private final c l;
    private final c m;
    private int n;
    private double o;
    private Length p;

    PedometerService()
    {
        l = new c(com.fitbit.util.threading.FitbitHandlerThread.ThreadName.g) {

            final PedometerService a;

            public void a(Intent intent)
            {
                if ("com.fitbit.controllers.AlarmsController.ACTION_MIDNIGHT_COMES".equals(intent.getAction()))
                {
                    a.a(0, 0.0D, new Length(0.0D, com.fitbit.data.domain.Length.LengthUnits.KM));
                }
            }

            
            {
                a = PedometerService.this;
                super(threadname);
            }
        };
        m = new c(com.fitbit.util.threading.FitbitHandlerThread.ThreadName.g) {

            final PedometerService a;

            public void a(Intent intent)
            {
                if ("com.fitbit.SavedState.SoftTrackerData.ACTION_LIVE_DATA_OFFSET_CHANGED".equals(intent.getAction()))
                {
                    a.a(com.fitbit.pedometer.service.PedometerService.a(a), com.fitbit.pedometer.service.PedometerService.b(a), com.fitbit.pedometer.service.PedometerService.c(a));
                }
            }

            
            {
                a = PedometerService.this;
                super(threadname);
            }
        };
    }

    static int a(PedometerService pedometerservice)
    {
        return pedometerservice.n;
    }

    private void a(Intent intent, int i1, int j1)
    {
        h = j1;
        if (!com.fitbit.pedometer.e.h())
        {
            com.fitbit.e.a.d("PedometerService", (new StringBuilder()).append("Pedometer is not supported. Skip current command and stop service for startId = ").append(j1).toString(), new Object[0]);
            i.c();
            return;
        }
        static class _cls5
        {

            static final int a[];

            static 
            {
                a = new int[PedometerServiceCommand.values().length];
                try
                {
                    a[com.fitbit.pedometer.service.PedometerServiceCommand.c.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    a[PedometerServiceCommand.d.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[com.fitbit.pedometer.service.PedometerServiceCommand.a.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[com.fitbit.pedometer.service.PedometerServiceCommand.b.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[com.fitbit.pedometer.service.PedometerServiceCommand.e.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[PedometerServiceCommand.f.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        if (intent != null)
        {
            intent = com.fitbit.pedometer.service.PedometerServiceCommand.b(intent);
        } else
        {
            com.fitbit.e.a.d("PedometerService", "PedometerService recreated after unexpected close. Flush now and schedule next flush alarm", new Object[0]);
            intent = com.fitbit.pedometer.service.PedometerServiceCommand.c;
        }
        com.fitbit.e.a.a("PedometerService", String.format("PedometerService starts with command: [%s]", new Object[] {
            intent
        }), new Object[0]);
        com.fitbit.pedometer.service._cls5.a[intent.ordinal()];
        JVM INSTR tableswitch 1 6: default 124
    //                   1 150
    //                   2 150
    //                   3 215
    //                   4 229
    //                   5 243
    //                   6 255;
           goto _L1 _L2 _L2 _L3 _L4 _L5 _L6
_L1:
        i.b();
        return;
_L2:
        if (k)
        {
            com.fitbit.e.a.a("PedometerService", "Flush is already in progress. Skip command.", new Object[0]);
        } else
        {
            i.a();
            k = true;
            e e1 = f;
            boolean flag;
            if (intent == PedometerServiceCommand.d)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            e1.a(flag);
        }
        continue; /* Loop/switch isn't completed */
_L3:
        f.c(true);
        com.fitbit.pedometer.service.b.a();
        continue; /* Loop/switch isn't completed */
_L4:
        f.c(false);
        com.fitbit.pedometer.service.b.c();
        continue; /* Loop/switch isn't completed */
_L5:
        a(true);
        com.fitbit.pedometer.service.a.a(false);
        continue; /* Loop/switch isn't completed */
_L6:
        a(false);
        i.c();
        if (true) goto _L1; else goto _L7
_L7:
    }

    private void a(e e1)
    {
        com.fitbit.e.a.a("PedometerService", "Setting PedometerAdapter...", new Object[0]);
        if (f != null)
        {
            com.fitbit.e.a.d("PedometerService", "PedometerAdapter is already set. Skip request.", new Object[0]);
        } else
        if (f == null)
        {
            f = e1;
            f.a(this);
            com.fitbit.e.a.a("PedometerService", "Connecting to remote service...", new Object[0]);
            f.c();
            com.fitbit.e.a.a("PedometerService", "Updating sync schedule...", new Object[0]);
            com.fitbit.pedometer.service.b.a();
            return;
        }
    }

    static void a(PedometerService pedometerservice, Intent intent, int i1, int j1)
    {
        pedometerservice.a(intent, i1, j1);
    }

    static void a(PedometerService pedometerservice, e e1)
    {
        pedometerservice.a(e1);
    }

    private void a(boolean flag)
    {
        if (j == flag)
        {
            return;
        }
        j = flag;
        if (flag)
        {
            i.a();
            if (!ApplicationForegroundController.a().b())
            {
                j = false;
                i.b();
                return;
            } else
            {
                com.fitbit.e.a.a("PedometerService", "Initiated start of LiveData streaming", new Object[0]);
                c.b(true);
                f.b(true);
                m.a(new IntentFilter("com.fitbit.SavedState.SoftTrackerData.ACTION_LIVE_DATA_OFFSET_CHANGED"));
                l.b(new IntentFilter("com.fitbit.controllers.AlarmsController.ACTION_MIDNIGHT_COMES"));
                return;
            }
        } else
        {
            com.fitbit.e.a.a("PedometerService", "Initiated stop of LiveData streaming", new Object[0]);
            f.b(false);
            c.b(false);
            m.d();
            l.e();
            i.b();
            return;
        }
    }

    static double b(PedometerService pedometerservice)
    {
        return pedometerservice.o;
    }

    static Length c(PedometerService pedometerservice)
    {
        return pedometerservice.p;
    }

    private void e()
    {
        com.fitbit.e.a.a("PedometerService", "Acquiring wake lock...", new Object[0]);
        if (g.isHeld())
        {
            com.fitbit.e.a.d("PedometerService", "Wake lock is already acquired. Skip request.", new Object[0]);
            return;
        } else
        {
            g.acquire(0x493e0L);
            com.fitbit.e.a.d("PedometerService", "Wake lock is acquired.", new Object[0]);
            return;
        }
    }

    private void f()
    {
        com.fitbit.e.a.a("PedometerService", "Releasing wake lock...", new Object[0]);
        if (!g.isHeld())
        {
            com.fitbit.e.a.d("PedometerService", "Wake lock is already released. Skip request.", new Object[0]);
            return;
        }
        try
        {
            g.release();
            com.fitbit.e.a.d("PedometerService", "Wake lock is released.", new Object[0]);
            return;
        }
        catch (Throwable throwable)
        {
            com.fitbit.e.a.d("PedometerService", (new StringBuilder()).append("Unable to release wake lock: ").append(throwable.getMessage()).toString(), new Object[0]);
        }
    }

    public void a()
    {
    }

    public void a(int i1, double d1, Length length)
    {
        double d2;
        Object obj;
        int j1;
        int k1;
        com.fitbit.e.a.a("PedometerService", "Received PedometerLiveData: steps = %s , calories = %s, distance = %s", new Object[] {
            Integer.valueOf(i1), Double.valueOf(d1), length
        });
        n = i1;
        o = d1;
        p = length;
        k1 = 0;
        j1 = 0;
        d2 = 0.0D;
        obj = s.c();
        if (obj == null) goto _L2; else goto _L1
_L1:
        double d3 = d2;
        if (!com.fitbit.util.o.i(new Date(((Number)((Map) (obj)).get("soft_tracker_data_offset_date_milliseconds_key")).longValue()))) goto _L4; else goto _L3
_L3:
        Number number = (Number)((Map) (obj)).get("soft_tracker_data_offset_steps_key");
        Number number1 = (Number)((Map) (obj)).get("soft_tracker_data_offset_calories_key");
        obj = (Number)((Map) (obj)).get("soft_tracker_data_offset_distance_key");
        if (number != null)
        {
            j1 = number.intValue();
        }
        if (number1 != null)
        {
            d2 = number1.doubleValue();
        }
        k1 = j1;
        d3 = d2;
        if (obj == null) goto _L4; else goto _L5
_L5:
        double d4 = ((Number) (obj)).doubleValue();
        d3 = d2;
        d2 = d4;
_L7:
        double d5 = length.a(com.fitbit.data.domain.Length.LengthUnits.MM).b();
        double d6 = (new Length(d2, com.fitbit.data.domain.Length.LengthUnits.KM)).a(com.fitbit.data.domain.Length.LengthUnits.MM).b();
        com.fitbit.e.a.a("PedometerService", "Broadcasting live-data packet: steps[%d(+%d)] calories[%.2f(+%.2f)] distance[%.2f(+%.2f)km]", new Object[] {
            Integer.valueOf(i1), Integer.valueOf(j1), Double.valueOf(d1), Double.valueOf(d3), Double.valueOf(length.a(com.fitbit.data.domain.Length.LengthUnits.KM).b()), Double.valueOf(d2)
        });
        length = new LiveDataPacket();
        length.a(i1 + j1);
        length.b((int)(d3 + d1));
        length.b(d5 + d6);
        com.fitbit.livedata.e.a(length);
        return;
_L2:
        Date date = new Date();
        StepsGoal stepsgoal = t.a().e(date);
        CaloriesBurnedGoal caloriesburnedgoal = t.a().a(date);
        DistanceGoal distancegoal = t.a().c(date);
        com.fitbit.e.a.a("PedometerService", "Offset date: %s", new Object[] {
            date
        });
        if (com.fitbit.util.o.i(date))
        {
            if (stepsgoal != null)
            {
                d2 = stepsgoal.c().doubleValue();
            } else
            {
                d2 = 0.0D;
            }
            j1 = (int)d2;
            if (caloriesburnedgoal != null)
            {
                d2 = caloriesburnedgoal.c().doubleValue();
            } else
            {
                d2 = 0.0D;
            }
            d3 = (int)d2;
            if (distancegoal != null)
            {
                d2 = distancegoal.c().doubleValue();
            } else
            {
                d2 = 0.0D;
            }
            d2 = (int)d2;
            continue; /* Loop/switch isn't completed */
        }
        com.fitbit.e.a.a("PedometerService", "Local offset is not used. Offset generation date doesn't match current date", new Object[0]);
        d3 = d2;
_L4:
        d2 = 0.0D;
        j1 = k1;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public void a(PedometerMinuteData pedometerminutedata)
    {
        am.a().b(pedometerminutedata);
    }

    public void b()
    {
        com.fitbit.e.a.a("PedometerService", "Flush is finished.", new Object[0]);
        if (!k)
        {
            com.fitbit.e.a.d("PedometerService", "Flush is not in progress. Skip callback.", new Object[0]);
            return;
        } else
        {
            com.fitbit.pedometer.service.b.a();
            com.fitbit.pedometer.h.a().b();
            k = false;
            i.b();
            com.fitbit.widget.b.a(this);
            LocalBroadcastManager.getInstance(this).sendBroadcast(new Intent("com.fitbit.pedometer.service.PedometerService.ACTION_FLUSH_FINISHED"));
            return;
        }
    }

    public void c()
    {
        e();
    }

    public void d()
    {
        f();
        com.fitbit.e.a.a("PedometerService", "Stopping PedometerService with startId = %s", new Object[] {
            Integer.valueOf(h)
        });
        stopSelf(h);
    }

    public IBinder onBind(Intent intent)
    {
        return null;
    }

    public void onCreate()
    {
        super.onCreate();
        com.fitbit.e.a.a("PedometerService", "PedometerService is created.", new Object[0]);
        i = new com.fitbit.util.d.a(this);
        i.a("PedometerService");
        com.fitbit.e.a.d("PedometerService", "Creating non reference counted wake lock with tag = PedometerService", new Object[0]);
        g = d.newWakeLock(1, "PedometerService");
        g.setReferenceCounted(false);
        com.fitbit.pedometer.e.a(new com.fitbit.pedometer.e.b() {

            final PedometerService a;

            public void a(e e1)
            {
            /* block-local class not found */
            class _cls1 {}

                com.fitbit.pedometer.e.a(new _cls1(e1));
            }

            public volatile void a(Object obj)
            {
                a((e)obj);
            }

            
            {
                a = PedometerService.this;
                super();
            }
        }, false);
    }

    public void onDestroy()
    {
        com.fitbit.e.a.a("PedometerService", "Disconnecting from remote service...", new Object[0]);
        f.d();
        f();
        com.fitbit.e.a.a("PedometerService", "Pedometer service is about to be destroyed.", new Object[0]);
        super.onDestroy();
    }

    public int onStartCommand(Intent intent, int i1, int j1)
    {
        com.fitbit.e.a.a("PedometerService", "Starting PedometerService with startId = %s", new Object[] {
            Integer.valueOf(j1)
        });
        i.a();
        com.fitbit.pedometer.e.a(new com.fitbit.pedometer.e.b(intent, i1, j1) {

            final Intent a;
            final int b;
            final int c;
            final PedometerService d;

            public void a(e e1)
            {
            /* block-local class not found */
            class _cls1 {}

                com.fitbit.pedometer.e.a(new _cls1(e1));
            }

            public volatile void a(Object obj)
            {
                a((e)obj);
            }

            
            {
                d = PedometerService.this;
                a = intent;
                b = i1;
                c = j1;
                super();
            }
        }, false);
        return 1;
    }
}
