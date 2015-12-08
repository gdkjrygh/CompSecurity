// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.pedometer.google;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener2;
import com.fitbit.pedometer.k;

// Referenced classes of package com.fitbit.pedometer.google:
//            a

private class <init>
    implements SensorEventListener2
{

    final a a;
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
            int j = af.length;
            for (int i = 0; i < j; i++)
            {
                float f = af[i];
                long l1 = sensorevent.timestamp / 0xf4240L;
                long l = l1;
                if (k.c())
                {
                    l = k.b(l1);
                }
                com.fitbit.pedometer.google.a.a(a).a(l);
            }

        }
    }

    private ener2(a a1)
    {
        a = a1;
        super();
        b = false;
    }

    b(a a1, b b1)
    {
        this(a1);
    }
}
