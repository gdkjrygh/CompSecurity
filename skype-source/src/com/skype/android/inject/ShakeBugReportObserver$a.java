// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.inject;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

// Referenced classes of package com.skype.android.inject:
//            ShakeBugReportObserver

private static final class <init>
    implements SensorEventListener
{
    private static interface a
    {

        public abstract void onShake();
    }


    private static final int MIN_DIRECTION_CHANGES = 5;
    private static final int MIN_FORCE_TO_DETECT = 10;
    private static final int TIME_BETWEEN_DIRECTION_CHANGE_MAX = 200;
    private static final int TOTAL_SHAKE_TIME_MAX = 400;
    private int directionChangeCount;
    private long firstDirectionChangeTime;
    private long lastDirectionChangeTime;
    private long lastShakeTime;
    private float lastX;
    private float lastY;
    private float lastZ;
    private a shakeListener;

    private void reset()
    {
        firstDirectionChangeTime = 0L;
        directionChangeCount = 0;
        lastDirectionChangeTime = 0L;
        lastX = 0.0F;
        lastY = 0.0F;
        lastZ = 0.0F;
    }

    private void setOnShakeListener(a a1)
    {
        shakeListener = a1;
    }

    public final void onAccuracyChanged(Sensor sensor, int i)
    {
    }

    public final void onSensorChanged(SensorEvent sensorevent)
    {
label0:
        {
            float f = sensorevent.values[0];
            float f1 = sensorevent.values[1];
            float f2 = sensorevent.values[2];
            if (Math.abs((f + f1 + f2) - lastX - lastY - lastZ) > 10F)
            {
                long l = System.currentTimeMillis();
                if (firstDirectionChangeTime == 0L)
                {
                    firstDirectionChangeTime = l;
                    lastDirectionChangeTime = l;
                }
                if (l - lastDirectionChangeTime >= 200L)
                {
                    break label0;
                }
                lastDirectionChangeTime = l;
                directionChangeCount = directionChangeCount + 1;
                lastX = f;
                lastY = f1;
                lastZ = f2;
                if (directionChangeCount >= 5)
                {
                    long l1 = firstDirectionChangeTime;
                    long l2 = lastShakeTime;
                    if (l - l1 < 400L && l - l2 > 5000L)
                    {
                        lastShakeTime = l;
                        shakeListener.onShake();
                        reset();
                    }
                }
            }
            return;
        }
        reset();
    }


    private a()
    {
        firstDirectionChangeTime = 0L;
        directionChangeCount = 0;
        lastX = 0.0F;
        lastY = 0.0F;
        lastZ = 0.0F;
    }

    lastZ(lastZ lastz)
    {
        this();
    }
}
