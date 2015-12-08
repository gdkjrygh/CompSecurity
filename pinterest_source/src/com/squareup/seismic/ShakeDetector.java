// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.seismic;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;

public class ShakeDetector
    implements SensorEventListener
{

    private final SampleQueue a = new SampleQueue();
    private final Listener b;
    private SensorManager c;
    private Sensor d;

    public ShakeDetector(Listener listener)
    {
        b = listener;
    }

    public final void a()
    {
        if (d != null)
        {
            c.unregisterListener(this, d);
            c = null;
            d = null;
        }
    }

    public final boolean a(SensorManager sensormanager)
    {
        if (d == null)
        {
            d = sensormanager.getDefaultSensor(1);
            if (d != null)
            {
                c = sensormanager;
                sensormanager.registerListener(this, d, 0);
            }
            if (d == null)
            {
                return false;
            }
        }
        return true;
    }

    public void onAccuracyChanged(Sensor sensor, int i)
    {
    }

    public void onSensorChanged(SensorEvent sensorevent)
    {
        boolean flag = true;
        float f = sensorevent.values[0];
        float f1 = sensorevent.values[1];
        float f2 = sensorevent.values[2];
        long l;
        if (Math.sqrt(f * f + f1 * f1 + f2 * f2) <= 13D)
        {
            flag = false;
        }
        l = sensorevent.timestamp;
        a.a(l, flag);
        if (a.b())
        {
            a.a();
            b.hearShake();
        }
    }

    /* member class not found */
    class SampleQueue {}


    private class Listener
    {

        public abstract void hearShake();
    }

}
