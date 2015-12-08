// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.sensors;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.view.OrientationEventListener;
import com.google.android.apps.unveil.env.af;
import com.google.android.apps.unveil.env.w;
import java.util.List;

// Referenced classes of package com.google.android.apps.unveil.sensors:
//            v, x, ab

public final class aa
    implements SensorEventListener
{

    public final SensorManager a;
    public Sensor b;
    public Sensor c;
    public final OrientationEventListener d;
    final v e = new v();
    final v f = new v();
    public final x g;
    private final af h = new af();
    private int i;
    private final w j = new w();

    public aa(Context context)
    {
        i = -1;
        g = new x(this, context);
        a = (SensorManager)context.getSystemService("sensor");
        j.a();
        if (a != null)
        {
            d = new ab(this, context);
            context = a.getSensorList(2);
            List list = a.getSensorList(1);
            if (context.size() > 0)
            {
                c = (Sensor)context.get(0);
            } else
            {
                h.c("Couldn't find a magnetic field sensor.", new Object[0]);
            }
            if (list.size() > 0)
            {
                b = (Sensor)list.get(0);
                return;
            } else
            {
                h.c("Couldn't find an accelerometer.", new Object[0]);
                return;
            }
        } else
        {
            h.c("No SensorManager available.", new Object[0]);
            d = null;
            return;
        }
    }

    static int a(aa aa1, int k)
    {
        aa1.i = k;
        return k;
    }

    static w a(aa aa1)
    {
        return aa1.j;
    }

    public final int a()
    {
        int k = i;
        if (k == -1)
        {
            return -1;
        }
        k %= 360;
        if (k >= 45)
        {
            if (k < 135)
            {
                return 90;
            }
            if (k < 225)
            {
                return 180;
            }
            if (k < 315)
            {
                return 270;
            }
        }
        return 0;
    }

    public final void onAccuracyChanged(Sensor sensor, int k)
    {
    }

    public final void onSensorChanged(SensorEvent sensorevent)
    {
        Sensor sensor = sensorevent.sensor;
        long l = sensorevent.timestamp;
        this;
        JVM INSTR monitorenter ;
        if (sensor.getType() != 1)
        {
            break MISSING_BLOCK_LABEL_41;
        }
        e.a(l, sensorevent.accuracy, sensorevent.values);
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
        if (sensor.getType() != 2)
        {
            break MISSING_BLOCK_LABEL_74;
        }
        f.a(l, sensorevent.accuracy, sensorevent.values);
        if (true) goto _L2; else goto _L1
_L1:
        sensorevent;
        this;
        JVM INSTR monitorexit ;
        throw sensorevent;
        int k = sensor.getType();
        throw new RuntimeException((new StringBuilder(35)).append("Unexpected sensor type: ").append(k).toString());
    }
}
