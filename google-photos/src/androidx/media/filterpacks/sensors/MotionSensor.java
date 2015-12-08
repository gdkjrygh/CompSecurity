// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package androidx.media.filterpacks.sensors;

import ahn;
import ahs;
import aif;
import aih;
import ajr;
import aju;
import ajw;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;

public final class MotionSensor extends ahn
    implements SensorEventListener
{

    private Sensor mSensor;
    private SensorManager mSensorManager;
    private float mValues[];

    public MotionSensor(ajr ajr1, String s)
    {
        super(ajr1, s);
        mSensorManager = null;
        mSensor = null;
        mValues = new float[3];
    }

    public final ajw b()
    {
        return (new ajw()).b("values", 2, aif.b(Float.TYPE)).a();
    }

    protected final void c()
    {
        mSensorManager = (SensorManager)super.mContext.a.getSystemService("sensor");
        mSensor = mSensorManager.getDefaultSensor(10);
        mSensorManager.registerListener(this, mSensor, 2);
    }

    protected final void e()
    {
        aju aju1 = b("values");
        aih aih1 = aju1.a(null).e();
        synchronized (mValues)
        {
            aih1.b(mValues);
        }
        aih1.a(System.currentTimeMillis() * 0xf4240L);
        aju1.a(aih1);
        return;
        exception;
        af;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected final void g()
    {
        mSensorManager.unregisterListener(this);
    }

    public final void onAccuracyChanged(Sensor sensor, int i)
    {
    }

    public final void onSensorChanged(SensorEvent sensorevent)
    {
        synchronized (mValues)
        {
            mValues[0] = sensorevent.values[0];
            mValues[1] = sensorevent.values[1];
            mValues[2] = sensorevent.values[2];
        }
        return;
        sensorevent;
        af;
        JVM INSTR monitorexit ;
        throw sensorevent;
    }
}
