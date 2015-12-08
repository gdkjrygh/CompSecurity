// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.android;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.preference.PreferenceManager;
import com.google.zxing.client.android.camera.CameraManager;
import com.google.zxing.client.android.camera.FrontLightMode;

final class AmbientLightManager
    implements SensorEventListener
{

    private static final float BRIGHT_ENOUGH_LUX = 450F;
    private static final float TOO_DARK_LUX = 45F;
    private CameraManager cameraManager;
    private final Context context;
    private Sensor lightSensor;

    AmbientLightManager(Context context1)
    {
        context = context1;
    }

    public void onAccuracyChanged(Sensor sensor, int i)
    {
    }

    public void onSensorChanged(SensorEvent sensorevent)
    {
        float f = sensorevent.values[0];
        if (cameraManager != null)
        {
            if (f <= 45F)
            {
                cameraManager.setTorch(true);
            } else
            if (f >= 450F)
            {
                cameraManager.setTorch(false);
                return;
            }
        }
    }

    void start(CameraManager cameramanager)
    {
        cameraManager = cameramanager;
        if (FrontLightMode.readPref(PreferenceManager.getDefaultSharedPreferences(context)) == FrontLightMode.AUTO)
        {
            cameramanager = (SensorManager)context.getSystemService("sensor");
            lightSensor = cameramanager.getDefaultSensor(5);
            if (lightSensor != null)
            {
                cameramanager.registerListener(this, lightSensor, 3);
            }
        }
    }

    void stop()
    {
        if (lightSensor != null)
        {
            ((SensorManager)context.getSystemService("sensor")).unregisterListener(this);
            cameraManager = null;
            lightSensor = null;
        }
    }
}
