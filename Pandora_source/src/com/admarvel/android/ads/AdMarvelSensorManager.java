// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import java.lang.ref.WeakReference;
import java.util.List;

// Referenced classes of package com.admarvel.android.ads:
//            AdMarvelInternalWebView

class AdMarvelSensorManager
{

    private static AdMarvelSensorManager mAdMarvelSensorManager = null;
    private String accelerometerEventMethod;
    private WeakReference adMarvelInternalWebViewReference;
    private String compassEventMethod;
    private Sensor compassSensor;
    private int interval;
    private boolean isCompassEvent;
    private boolean running;
    private Sensor sensor;
    private SensorEventListener sensorEventListener;
    private SensorManager sensorManager;
    private String shakeEventMethod;
    private Boolean supported;
    private float threshold;

    private AdMarvelSensorManager()
    {
        interval = 1000;
        threshold = 2.0F;
        running = false;
        shakeEventMethod = null;
        accelerometerEventMethod = null;
        compassEventMethod = null;
        isCompassEvent = false;
        sensorEventListener = new SensorEventListener() {

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

            public void onAccuracyChanged(Sensor sensor1, int i)
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
                        onHeadingChanged(f);
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
                            if (now - lastShake >= (long)interval)
                            {
                                force = (Math.abs((gravityValues[0] + gravityValues[1] + gravityValues[2]) - oldValues[0] - oldValues[1] - oldValues[2]) / (float)(now - lastShake)) * 100F;
                                lastShake = now;
                                if (force > threshold)
                                {
                                    onShake(force);
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
                            onAccelerationChanged(gravityValues[0], gravityValues[1], gravityValues[2], filter[0], filter[1], filter[2], delta[0], delta[1], delta[2]);
                            oldValues = (float[])gravityValues.clone();
                            lastUpdate = now;
                            return;
                        }
                    }
                }
            }

            
            {
                this$0 = AdMarvelSensorManager.this;
                super();
                now = 0L;
                timeDiff = 0L;
                lastUpdate = 0L;
                lastShake = 0L;
                force = 0.0F;
            }
        };
    }

    public static AdMarvelSensorManager getInstance()
    {
        if (mAdMarvelSensorManager == null)
        {
            mAdMarvelSensorManager = new AdMarvelSensorManager();
        }
        return mAdMarvelSensorManager;
    }

    private void onAccelerationChanged(float f, float f1, float f2, float f3, float f4, float f5, float f6, 
            float f7, float f8)
    {
        AdMarvelInternalWebView admarvelinternalwebview = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get();
        if (admarvelinternalwebview != null && accelerometerEventMethod != null)
        {
            admarvelinternalwebview.loadUrl((new StringBuilder("javascript:")).append(accelerometerEventMethod).append("(").append(f).append(",").append(f1).append(",").append(f2).append(",").append(f3).append(",").append(f4).append(",").append(f5).append(",").append(f6).append(",").append(f7).append(",").append(f8).append(")").toString());
        }
    }

    private void onHeadingChanged(float f)
    {
        AdMarvelInternalWebView admarvelinternalwebview = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get();
        if (admarvelinternalwebview != null && compassEventMethod != null)
        {
            admarvelinternalwebview.loadUrl((new StringBuilder("javascript:")).append(compassEventMethod).append("(").append(f).append(")").toString());
        }
    }

    private void onShake(float f)
    {
        AdMarvelInternalWebView admarvelinternalwebview = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get();
        if (admarvelinternalwebview != null && shakeEventMethod != null)
        {
            admarvelinternalwebview.loadUrl((new StringBuilder("javascript:")).append(shakeEventMethod).append("()").toString());
        }
    }

    private void resetCallbacks()
    {
        shakeEventMethod = null;
        accelerometerEventMethod = null;
        compassEventMethod = null;
    }

    public void init(Context context, AdMarvelInternalWebView admarvelinternalwebview)
    {
        adMarvelInternalWebViewReference = new WeakReference(admarvelinternalwebview);
        if (!running)
        {
            sensorManager = (SensorManager)context.getSystemService("sensor");
            sensor = sensorManager.getDefaultSensor(1);
            compassSensor = sensorManager.getDefaultSensor(2);
            running = sensorManager.registerListener(sensorEventListener, sensor, 3);
        }
        if (isCompassEvent)
        {
            sensorManager.registerListener(sensorEventListener, compassSensor, 3);
            isCompassEvent = false;
        }
    }

    public boolean isHeadingSupported(Context context)
    {
        if (supported == null)
        {
            if (context != null)
            {
                sensorManager = (SensorManager)context.getSystemService("sensor");
                boolean flag;
                if (sensorManager.getSensorList(2).size() > 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                supported = new Boolean(flag);
            } else
            {
                supported = Boolean.FALSE;
            }
        }
        return supported.booleanValue();
    }

    public boolean isListening()
    {
        return running;
    }

    public boolean isSupported(Context context)
    {
        if (supported == null)
        {
            if (context != null)
            {
                sensorManager = (SensorManager)context.getSystemService("sensor");
                boolean flag;
                if (sensorManager.getSensorList(1).size() > 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                supported = new Boolean(flag);
            } else
            {
                supported = Boolean.FALSE;
            }
        }
        return supported.booleanValue();
    }

    public void setHeadingCallback(String s)
    {
        if (s != null)
        {
            isCompassEvent = true;
            compassEventMethod = s;
        }
    }

    public void setShakeCallback(String s)
    {
        if (s != null)
        {
            shakeEventMethod = s;
        }
    }

    public void setShakeProperties(String s, String s1)
    {
        if (s != null)
        {
            threshold = (new Float(s)).floatValue();
        }
        if (s1 != null)
        {
            interval = Integer.parseInt(s1) * 1000;
        }
    }

    public void setTiltCallback(String s)
    {
        if (s != null)
        {
            accelerometerEventMethod = s;
        }
    }

    public void stopListening()
    {
        running = false;
        try
        {
            if (sensorManager != null && sensorEventListener != null)
            {
                sensorManager.unregisterListener(sensorEventListener);
            }
        }
        catch (Exception exception) { }
        resetCallbacks();
    }






}
