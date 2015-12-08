// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;

// Referenced classes of package com.admarvel.android.ads:
//            AdMarvelSensorManager

class force
    implements SensorEventListener
{

    final float alpha = 0.8F;
    private final float delta[] = {
        0.0F, 0.0F, 0.0F
    };
    private final float filter[] = {
        0.0F, 0.0F, 0.0F
    };
    private float force;
    private final float gravity[] = {
        0.0F, 0.0F, 0.0F
    };
    private float gravityValues[];
    private long lastShake;
    private long lastUpdate;
    private float magneticValues[];
    private long now;
    private float oldValues[];
    final AdMarvelSensorManager this$0;
    private long timeDiff;

    public void onAccuracyChanged(Sensor sensor, int i)
    {
    }

    public void onSensorChanged(SensorEvent sensorevent)
    {
        now = System.currentTimeMillis();
        if (sensorevent.sensor.getType() == 1)
        {
            gravityValues = (float[])sensorevent.values.clone();
        }
        if (sensorevent.sensor.getType() == 2)
        {
            magneticValues = (float[])sensorevent.values.clone();
        }
        if (gravityValues != null && magneticValues != null)
        {
            sensorevent = new float[9];
            if (SensorManager.getRotationMatrix(sensorevent, new float[9], gravityValues, magneticValues))
            {
                float af[] = new float[3];
                SensorManager.getOrientation(sensorevent, af);
                float f1 = (float)Math.round(Math.toDegrees(af[0]) * 2D) / 2.0F;
                float f = f1;
                if ((double)f1 < 0.0D)
                {
                    f = f1 + 360F;
                }
                AdMarvelSensorManager.access$0(AdMarvelSensorManager.this, f);
            }
        }
        if (gravityValues != null)
        {
            if (lastUpdate == 0L)
            {
                lastUpdate = now;
                lastShake = now;
                oldValues = (float[])gravityValues.clone();
            } else
            {
                timeDiff = now - lastUpdate;
                if (timeDiff > 0L)
                {
                    if (now - lastShake >= (long)AdMarvelSensorManager.access$1(AdMarvelSensorManager.this))
                    {
                        force = (Math.abs((gravityValues[0] + gravityValues[1] + gravityValues[2]) - oldValues[0] - oldValues[1] - oldValues[2]) / (float)(now - lastShake)) * 100F;
                        lastShake = now;
                        if (force > AdMarvelSensorManager.access$2(AdMarvelSensorManager.this))
                        {
                            AdMarvelSensorManager.access$3(AdMarvelSensorManager.this, force);
                        }
                    }
                    gravity[0] = gravity[0] * 0.8F + gravityValues[0] * 0.2F;
                    gravity[1] = gravity[1] * 0.8F + gravityValues[1] * 0.2F;
                    gravity[2] = gravity[2] * 0.8F + gravityValues[2] * 0.2F;
                    filter[0] = gravityValues[0] - gravity[0];
                    filter[1] = gravityValues[1] - gravity[1];
                    filter[2] = gravityValues[2] - gravity[2];
                    delta[0] = gravityValues[0] - oldValues[0];
                    delta[1] = gravityValues[1] - oldValues[1];
                    delta[2] = gravityValues[2] - oldValues[2];
                    AdMarvelSensorManager.access$4(AdMarvelSensorManager.this, gravityValues[0], gravityValues[1], gravityValues[2], filter[0], filter[1], filter[2], delta[0], delta[1], delta[2]);
                    oldValues = (float[])gravityValues.clone();
                    lastUpdate = now;
                    return;
                }
            }
        }
    }

    ()
    {
        this$0 = AdMarvelSensorManager.this;
        super();
        now = 0L;
        timeDiff = 0L;
        lastUpdate = 0L;
        lastShake = 0L;
        force = 0.0F;
    }
}
