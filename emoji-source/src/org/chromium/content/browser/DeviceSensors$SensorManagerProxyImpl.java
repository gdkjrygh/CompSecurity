// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content.browser;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import java.util.List;

// Referenced classes of package org.chromium.content.browser:
//            DeviceSensors

static class mSensorManager
    implements mSensorManager
{

    private final SensorManager mSensorManager;

    public boolean registerListener(SensorEventListener sensoreventlistener, int i, int j, Handler handler)
    {
        List list = mSensorManager.getSensorList(i);
        if (list.isEmpty())
        {
            return false;
        } else
        {
            return mSensorManager.registerListener(sensoreventlistener, (Sensor)list.get(0), j, handler);
        }
    }

    public void unregisterListener(SensorEventListener sensoreventlistener, int i)
    {
        List list = mSensorManager.getSensorList(i);
        if (!list.isEmpty())
        {
            mSensorManager.unregisterListener(sensoreventlistener, (Sensor)list.get(0));
        }
    }

    (SensorManager sensormanager)
    {
        mSensorManager = sensormanager;
    }
}
