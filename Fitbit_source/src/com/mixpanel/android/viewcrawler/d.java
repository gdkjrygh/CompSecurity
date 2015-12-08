// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.viewcrawler;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.util.Log;
import com.mixpanel.android.mpmetrics.g;

class d
    implements SensorEventListener
{
    public static interface a
    {

        public abstract void a();
    }


    private static final float f = 7.8F;
    private static final float g = 11.8F;
    private static final long h = 0xee6b280L;
    private static final long i = 0x3b9aca00L;
    private static final int j = -1;
    private static final int k = 0;
    private static final int l = 1;
    private static final int m = 0;
    private static final int n = 1;
    private static final float o = 0.7F;
    private static final String p = "MixpanelAPI.FlipGesture";
    private int a;
    private int b;
    private long c;
    private final float d[] = new float[3];
    private final a e;

    public d(a a1)
    {
        a = -1;
        b = 0;
        c = -1L;
        e = a1;
    }

    private float[] a(float af[])
    {
        for (int i1 = 0; i1 < 3; i1++)
        {
            float f1 = d[i1];
            d[i1] = f1 + 0.7F * (af[i1] - f1);
        }

        return d;
    }

    public void onAccuracyChanged(Sensor sensor, int i1)
    {
    }

    public void onSensorChanged(SensorEvent sensorevent)
    {
        long l1;
        float af[] = a(sensorevent.values);
        int i1 = b;
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
        if (i1 != b)
        {
            c = sensorevent.timestamp;
        }
        l1 = sensorevent.timestamp - c;
        b;
        JVM INSTR tableswitch -1 1: default 168
    //                   -1 205
    //                   0 251
    //                   1 169;
           goto _L1 _L2 _L3 _L4
_L1:
        return;
_L4:
        if (l1 > 0xee6b280L && a == 0)
        {
            if (g.b)
            {
                Log.v("MixpanelAPI.FlipGesture", "Flip gesture begun");
            }
            a = 1;
            return;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (l1 > 0xee6b280L && a == 1)
        {
            if (g.b)
            {
                Log.v("MixpanelAPI.FlipGesture", "Flip gesture completed");
            }
            a = 0;
            e.a();
            return;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (l1 > 0x3b9aca00L && a != 0)
        {
            if (g.b)
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
