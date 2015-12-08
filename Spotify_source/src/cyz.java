// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.util.Log;

final class cyz
    implements SensorEventListener
{

    private int a;
    private int b;
    private long c;
    private final float d[] = new float[3];
    private final cza e;

    public cyz(cza cza1)
    {
        a = -1;
        b = 0;
        c = -1L;
        e = cza1;
    }

    public final void onAccuracyChanged(Sensor sensor, int i)
    {
    }

    public final void onSensorChanged(SensorEvent sensorevent)
    {
        long l;
        float af[] = sensorevent.values;
        for (int i = 0; i < 3; i++)
        {
            float f = d[i];
            d[i] = f + 0.7F * (af[i] - f);
        }

        af = d;
        int j = b;
        float f1 = af[0] * af[0] + af[1] * af[1] + af[2] * af[2];
        b = 0;
        if (af[2] > 7.8F && af[2] < 11.8F)
        {
            b = -1;
        }
        if (af[2] < -7.8F && af[2] > -11.8F)
        {
            b = 1;
        }
        if (f1 < 60.84F || f1 > 139.24F)
        {
            b = 0;
        }
        if (j != b)
        {
            c = sensorevent.timestamp;
        }
        l = sensorevent.timestamp - c;
        b;
        JVM INSTR tableswitch -1 1: default 212
    //                   -1 249
    //                   0 295
    //                   1 213;
           goto _L1 _L2 _L3 _L4
_L1:
        return;
_L4:
        if (l > 0xee6b280L && a == 0)
        {
            if (cxi.a)
            {
                Log.v("MixpanelAPI.FlipGesture", "Flip gesture begun");
            }
            a = 1;
            return;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (l > 0xee6b280L && a == 1)
        {
            if (cxi.a)
            {
                Log.v("MixpanelAPI.FlipGesture", "Flip gesture completed");
            }
            a = 0;
            e.a();
            return;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (l > 0x3b9aca00L && a != 0)
        {
            if (cxi.a)
            {
                Log.v("MixpanelAPI.FlipGesture", "Flip gesture abandoned");
            }
            a = 0;
            return;
        }
        if (true) goto _L1; else goto _L5
_L5:
    }
}
