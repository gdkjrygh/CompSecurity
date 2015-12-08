// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova.devicemotion;

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

public class AccelListener extends CordovaPlugin
    implements SensorEventListener
{

    public static int ERROR_FAILED_TO_START = 3;
    public static int RUNNING = 2;
    public static int STARTING = 1;
    public static int STOPPED = 0;
    private int accuracy;
    private CallbackContext callbackContext;
    private Sensor mSensor;
    private Handler mainHandler;
    private Runnable mainRunnable;
    private SensorManager sensorManager;
    private int status;
    private long timestamp;
    private float x;
    private float y;
    private float z;

    public AccelListener()
    {
        accuracy = 0;
        mainHandler = null;
        mainRunnable = new Runnable() {

            final AccelListener this$0;

            public void run()
            {
                timeout();
            }

            
            {
                this$0 = AccelListener.this;
                super();
            }
        };
        x = 0.0F;
        y = 0.0F;
        z = 0.0F;
        timestamp = 0L;
        setStatus(STOPPED);
    }

    private void fail(int i, String s)
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("code", i);
            jsonobject.put("message", s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
        }
        s = new PluginResult(org.apache.cordova.PluginResult.Status.ERROR, jsonobject);
        s.setKeepCallback(true);
        callbackContext.sendPluginResult(s);
    }

    private JSONObject getAccelerationJSON()
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("x", x);
            jsonobject.put("y", y);
            jsonobject.put("z", z);
            jsonobject.put("timestamp", timestamp);
        }
        catch (JSONException jsonexception)
        {
            jsonexception.printStackTrace();
            return jsonobject;
        }
        return jsonobject;
    }

    private void setStatus(int i)
    {
        status = i;
    }

    private int start()
    {
        if (status == RUNNING || status == STARTING)
        {
            return status;
        }
        setStatus(STARTING);
        List list = sensorManager.getSensorList(1);
        if (list != null && list.size() > 0)
        {
            mSensor = (Sensor)list.get(0);
            sensorManager.registerListener(this, mSensor, 2);
            setStatus(STARTING);
            stopTimeout();
            mainHandler = new Handler(Looper.getMainLooper());
            mainHandler.postDelayed(mainRunnable, 2000L);
            return status;
        } else
        {
            setStatus(ERROR_FAILED_TO_START);
            fail(ERROR_FAILED_TO_START, "No sensors found to register accelerometer listening to.");
            return status;
        }
    }

    private void stop()
    {
        stopTimeout();
        if (status != STOPPED)
        {
            sensorManager.unregisterListener(this);
        }
        setStatus(STOPPED);
        accuracy = 0;
    }

    private void stopTimeout()
    {
        if (mainHandler != null)
        {
            mainHandler.removeCallbacks(mainRunnable);
        }
    }

    private void timeout()
    {
        if (status == STARTING)
        {
            setStatus(ERROR_FAILED_TO_START);
            fail(ERROR_FAILED_TO_START, "Accelerometer could not be started.");
        }
    }

    private void win()
    {
        PluginResult pluginresult = new PluginResult(org.apache.cordova.PluginResult.Status.OK, getAccelerationJSON());
        pluginresult.setKeepCallback(true);
        callbackContext.sendPluginResult(pluginresult);
    }

    public boolean execute(String s, JSONArray jsonarray, CallbackContext callbackcontext)
    {
        if (!s.equals("start")) goto _L2; else goto _L1
_L1:
        callbackContext = callbackcontext;
        if (status != RUNNING)
        {
            start();
        }
_L4:
        s = new PluginResult(org.apache.cordova.PluginResult.Status.NO_RESULT, "");
        s.setKeepCallback(true);
        callbackcontext.sendPluginResult(s);
        return true;
_L2:
        if (!s.equals("stop"))
        {
            break; /* Loop/switch isn't completed */
        }
        if (status == RUNNING)
        {
            stop();
        }
        if (true) goto _L4; else goto _L3
_L3:
        return false;
    }

    public void initialize(CordovaInterface cordovainterface, CordovaWebView cordovawebview)
    {
        super.initialize(cordovainterface, cordovawebview);
        sensorManager = (SensorManager)cordovainterface.getActivity().getSystemService("sensor");
    }

    public void onAccuracyChanged(Sensor sensor, int i)
    {
        while (sensor.getType() != 1 || status == STOPPED) 
        {
            return;
        }
        accuracy = i;
    }

    public void onDestroy()
    {
        stop();
    }

    public void onReset()
    {
        if (status == RUNNING)
        {
            stop();
        }
    }

    public void onSensorChanged(SensorEvent sensorevent)
    {
        if (sensorevent.sensor.getType() == 1 && status != STOPPED)
        {
            setStatus(RUNNING);
            if (accuracy >= 2)
            {
                timestamp = System.currentTimeMillis();
                x = sensorevent.values[0];
                y = sensorevent.values[1];
                z = sensorevent.values[2];
                win();
                return;
            }
        }
    }


}
