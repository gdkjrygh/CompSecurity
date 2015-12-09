// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.pedometer.google;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener2;
import android.hardware.SensorManager;
import com.fitbit.FitBitApplication;
import com.fitbit.pedometer.k;
import com.fitbit.savedstate.j;
import java.util.concurrent.TimeUnit;

final class com.fitbit.pedometer.google.a
{
    private class a
        implements SensorEventListener2
    {

        final com.fitbit.pedometer.google.a a;
        private boolean b;

        public void a(boolean flag)
        {
            b = flag;
        }

        public void onAccuracyChanged(Sensor sensor, int i)
        {
        }

        public void onFlushCompleted(Sensor sensor)
        {
            if (sensor.getType() == 18 && com.fitbit.pedometer.google.a.a(a) != null)
            {
                com.fitbit.pedometer.google.a.a(a).a(b);
            }
        }

        public void onSensorChanged(SensorEvent sensorevent)
        {
            if (sensorevent.sensor.getType() == 18 && com.fitbit.pedometer.google.a.a(a) != null && sensorevent.values != null)
            {
                float af[] = sensorevent.values;
                int l = af.length;
                for (int i = 0; i < l; i++)
                {
                    float f1 = af[i];
                    long l2 = sensorevent.timestamp / 0xf4240L;
                    long l1 = l2;
                    if (k.c())
                    {
                        l1 = k.b(l2);
                    }
                    com.fitbit.pedometer.google.a.a(a).a(l1);
                }

            }
        }

        private a()
        {
            a = com.fitbit.pedometer.google.a.this;
            super();
            b = false;
        }

    }

    static interface b
    {

        public abstract void a(long l);

        public abstract void a(boolean flag);
    }


    private static final String a = "GoogleStepSensorsController";
    private static final long c = 0L;
    private long b;
    private final a d = new a();
    private final SensorManager e = (SensorManager)FitBitApplication.a().getSystemService("sensor");
    private final Sensor f;
    private b g;
    private boolean h;

    public com.fitbit.pedometer.google.a()
    {
        b = 60000L;
        f = e.getDefaultSensor(18);
        com.fitbit.e.a.a("GoogleStepSensorsController", "Max events count: %s", new Object[] {
            Integer.valueOf(f.getFifoMaxEventCount())
        });
        com.fitbit.e.a.a("GoogleStepSensorsController", "Reserved events count: %s", new Object[] {
            Integer.valueOf(f.getFifoReservedEventCount())
        });
        b = (long)(f.getFifoReservedEventCount() / 300) * 0x3938700L;
    }

    static b a(com.fitbit.pedometer.google.a a1)
    {
        return a1.g;
    }

    private void a(long l)
    {
        d();
        try
        {
            TimeUnit.MILLISECONDS.sleep(j.h());
        }
        catch (InterruptedException interruptedexception) { }
        com.fitbit.e.a.a("GoogleStepSensorsController", "Registering step detector sensor listener with report latency:(microseconds) %s", new Object[] {
            Long.valueOf(l)
        });
        e.registerListener(d, f, 0, (int)l);
    }

    public void a()
    {
        if (h)
        {
            b();
            return;
        } else
        {
            c();
            return;
        }
    }

    public void a(b b1)
    {
        g = b1;
    }

    public void a(boolean flag)
    {
        com.fitbit.e.a.a("GoogleStepSensorsController", "Flushing step detector sensor events...", new Object[0]);
        d.a(flag);
        e.flush(d);
    }

    public void b()
    {
        h = true;
        a(0L);
    }

    public void c()
    {
        h = false;
        a(b);
    }

    public void d()
    {
        com.fitbit.e.a.a("GoogleStepSensorsController", "Unregistering step detector sensor listener...", new Object[0]);
        e.unregisterListener(d);
    }
}
