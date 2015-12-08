// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova.deviceorientation;

import android.app.Activity;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.Looper;
import java.util.List;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaWebView;
import org.apache.cordova.PluginResult;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class CompassListener extends CordovaPlugin
    implements SensorEventListener
{

    public static int ERROR_FAILED_TO_START = 3;
    public static int RUNNING = 2;
    public static int STARTING = 1;
    public static int STOPPED = 0;
    public long TIMEOUT;
    int accuracy;
    private CallbackContext callbackContext;
    float heading;
    long lastAccessTime;
    Sensor mSensor;
    private SensorManager sensorManager;
    int status;
    long timeStamp;

    public CompassListener()
    {
        TIMEOUT = 30000L;
        heading = 0.0F;
        timeStamp = 0L;
        setStatus(STOPPED);
    }

    private JSONObject getCompassHeading()
        throws JSONException
    {
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("magneticHeading", getHeading());
        jsonobject.put("trueHeading", getHeading());
        jsonobject.put("headingAccuracy", 0);
        jsonobject.put("timestamp", timeStamp);
        return jsonobject;
    }

    private void setStatus(int i)
    {
        status = i;
    }

    private void timeout()
    {
        if (status == STARTING)
        {
            setStatus(ERROR_FAILED_TO_START);
            if (callbackContext != null)
            {
                callbackContext.error("Compass listener failed to start.");
            }
        }
    }

    public boolean execute(String s, JSONArray jsonarray, CallbackContext callbackcontext)
        throws JSONException
    {
        if (s.equals("start"))
        {
            start();
            return true;
        }
        if (s.equals("stop"))
        {
            stop();
            return true;
        }
        if (s.equals("getStatus"))
        {
            int i = getStatus();
            callbackcontext.sendPluginResult(new PluginResult(org.apache.cordova.PluginResult.Status.OK, i));
            return true;
        }
        if (s.equals("getHeading"))
        {
            if (status != RUNNING)
            {
                if (start() == ERROR_FAILED_TO_START)
                {
                    callbackcontext.sendPluginResult(new PluginResult(org.apache.cordova.PluginResult.Status.IO_EXCEPTION, ERROR_FAILED_TO_START));
                    return true;
                }
                (new Handler(Looper.getMainLooper())).postDelayed(new Runnable() {

                    final CompassListener this$0;

                    public void run()
                    {
                        timeout();
                    }

            
            {
                this$0 = CompassListener.this;
                super();
            }
                }, 2000L);
            }
            callbackcontext.sendPluginResult(new PluginResult(org.apache.cordova.PluginResult.Status.OK, getCompassHeading()));
            return true;
        }
        if (s.equals("setTimeout"))
        {
            setTimeout(jsonarray.getLong(0));
            return true;
        }
        if (s.equals("getTimeout"))
        {
            long l = getTimeout();
            callbackcontext.sendPluginResult(new PluginResult(org.apache.cordova.PluginResult.Status.OK, l));
            return true;
        } else
        {
            return false;
        }
    }

    public float getHeading()
    {
        lastAccessTime = System.currentTimeMillis();
        return heading;
    }

    public int getStatus()
    {
        return status;
    }

    public long getTimeout()
    {
        return TIMEOUT;
    }

    public void initialize(CordovaInterface cordovainterface, CordovaWebView cordovawebview)
    {
        super.initialize(cordovainterface, cordovawebview);
        sensorManager = (SensorManager)cordovainterface.getActivity().getSystemService("sensor");
    }

    public void onAccuracyChanged(Sensor sensor, int i)
    {
    }

    public void onDestroy()
    {
        stop();
    }

    public void onReset()
    {
        stop();
    }

    public void onSensorChanged(SensorEvent sensorevent)
    {
        float f = sensorevent.values[0];
        timeStamp = System.currentTimeMillis();
        heading = f;
        setStatus(RUNNING);
        if (timeStamp - lastAccessTime > TIMEOUT)
        {
            stop();
        }
    }

    public void setTimeout(long l)
    {
        TIMEOUT = l;
    }

    public int start()
    {
        if (status == RUNNING || status == STARTING)
        {
            return status;
        }
        List list = sensorManager.getSensorList(3);
        if (list != null && list.size() > 0)
        {
            mSensor = (Sensor)list.get(0);
            sensorManager.registerListener(this, mSensor, 3);
            lastAccessTime = System.currentTimeMillis();
            setStatus(STARTING);
        } else
        {
            setStatus(ERROR_FAILED_TO_START);
        }
        return status;
    }

    public void stop()
    {
        if (status != STOPPED)
        {
            sensorManager.unregisterListener(this);
        }
        setStatus(STOPPED);
    }


}
