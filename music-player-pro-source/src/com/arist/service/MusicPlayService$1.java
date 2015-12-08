// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.service;

import android.content.SharedPreferences;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import com.arist.MusicPlayer.MyApplication;

// Referenced classes of package com.arist.service:
//            MusicPlayService

class this._cls0
    implements SensorEventListener
{

    final MusicPlayService this$0;

    public void onAccuracyChanged(Sensor sensor, int i)
    {
    }

    public void onSensorChanged(SensorEvent sensorevent)
    {
        if (MyApplication.getDefaultSharedPreferences().getBoolean("shake_to_change_song", false))
        {
            sensorevent = sensorevent.values;
            float f = sensorevent[0];
            float f1 = sensorevent[1];
            if (Math.abs(f) > (float)19)
            {
                MusicPlayService.access$0(MusicPlayService.this);
                return;
            }
            if (Math.abs(f1) > (float)19)
            {
                MusicPlayService.access$1(MusicPlayService.this);
                return;
            }
        }
    }

    ()
    {
        this$0 = MusicPlayService.this;
        super();
    }
}
