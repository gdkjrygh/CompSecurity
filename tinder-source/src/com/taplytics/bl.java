// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;

// Referenced classes of package com.taplytics:
//            ci, gs, bn

public final class bl
    implements SensorEventListener
{

    SensorManager a;
    Sensor b;
    bn c;
    private float d[];
    private int e;
    private boolean f;
    private long g;

    public bl()
    {
        d = new float[3];
        f = false;
    }

    private float a(float f1, int i)
    {
        return 0.8F * d[i] + 0.2F * f1;
    }

    static boolean a(bl bl1)
    {
        bl1.f = true;
        return true;
    }

    public final void onAccuracyChanged(Sensor sensor, int i)
    {
    }

    public final void onSensorChanged(SensorEvent sensorevent)
    {
        if (ci.b().l && f)
        {
            d[0] = a(sensorevent.values[0], 0);
            d[1] = a(sensorevent.values[1], 1);
            d[2] = a(sensorevent.values[2], 2);
            float f1 = sensorevent.values[0];
            float f2 = d[0];
            float f3 = sensorevent.values[1];
            float f4 = d[1];
            float f5 = sensorevent.values[2];
            float f6 = d[2];
            if (Math.max(Math.max(f1 - f2, f3 - f4), f5 - f6) >= 5F)
            {
                if (e == 0)
                {
                    e = e + 1;
                    g = System.currentTimeMillis();
                } else
                {
                    long l = System.currentTimeMillis();
                    if (l - g < 500L && l - g > 10L)
                    {
                        e = e + 1;
                        if (gs.b())
                        {
                            gs.a((new StringBuilder("Move Count: ")).append(e).toString());
                        }
                        if (e >= 3 && c != null)
                        {
                            c.a();
                            return;
                        }
                    } else
                    {
                        e = 0;
                        g = System.currentTimeMillis();
                        e = e + 1;
                        return;
                    }
                }
            }
        }
    }
}
