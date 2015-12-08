// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.service;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import com.arist.activity.MyApplication;
import com.arist.c.f;

// Referenced classes of package com.arist.service:
//            MusicPlayService

final class e
    implements SensorEventListener
{

    final MusicPlayService a;

    e(MusicPlayService musicplayservice)
    {
        a = musicplayservice;
        super();
    }

    public final void onAccuracyChanged(Sensor sensor, int i)
    {
    }

    public final void onSensorChanged(SensorEvent sensorevent)
    {
        if (MyApplication.e.g())
        {
            sensorevent = sensorevent.values;
            float f1 = sensorevent[0];
            float f2 = sensorevent[1];
            if (Math.abs(f1) > 19F)
            {
                MusicPlayService.a(a);
                return;
            }
            if (Math.abs(f2) > 19F)
            {
                MusicPlayService.b(a);
                return;
            }
        }
    }
}
