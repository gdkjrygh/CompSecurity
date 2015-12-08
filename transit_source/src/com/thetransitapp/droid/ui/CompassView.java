// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.hardware.GeomagneticField;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.location.Location;
import android.util.AttributeSet;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;

public class CompassView extends View
    implements SensorEventListener
{

    private Sensor accelerometer;
    private Drawable arrow;
    private Float azimuth;
    private Drawable brokenArrow;
    private Location current;
    private int dimension;
    private GeomagneticField geoField;
    private float geomagnetic[];
    private float gravity[];
    private Sensor magnetometer;
    private SensorManager sensorManager;
    private Location target;

    public CompassView(Context context)
    {
        super(context);
        init();
    }

    public CompassView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        init();
    }

    public CompassView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        init();
    }

    private void init()
    {
        sensorManager = (SensorManager)super.getContext().getSystemService("sensor");
        accelerometer = sensorManager.getDefaultSensor(1);
        magnetometer = sensorManager.getDefaultSensor(2);
        arrow = super.getContext().getResources().getDrawable(0x7f020089);
        arrow.setColorFilter(new PorterDuffColorFilter(-1, android.graphics.PorterDuff.Mode.SRC_IN));
        brokenArrow = super.getContext().getResources().getDrawable(0x7f02008a);
        brokenArrow.setColorFilter(new PorterDuffColorFilter(-1, android.graphics.PorterDuff.Mode.SRC_IN));
        int i = arrow.getIntrinsicWidth();
        int j = arrow.getIntrinsicHeight();
        dimension = Math.max(i, j);
        int k = (dimension - i) / 2;
        int l = (dimension - j) / 2;
        arrow.setBounds(k, l, i, j);
    }

    public void onAccuracyChanged(Sensor sensor, int i)
    {
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        sensorManager.registerListener(this, accelerometer, 2);
        sensorManager.registerListener(this, magnetometer, 2);
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        sensorManager.unregisterListener(this);
    }

    protected void onDraw(Canvas canvas)
    {
        float f3;
        float f4;
        f3 = dimension;
        f4 = dimension;
        if (azimuth == null) goto _L2; else goto _L1
_L1:
        float f;
        float f2;
        WindowManager windowmanager;
label0:
        {
            float f1 = current.bearingTo(target) - (float)(Math.toDegrees(azimuth.floatValue()) + (double)geoField.getDeclination());
            if (f1 >= 0.0F)
            {
                f = f1;
                if (f1 <= 180F)
                {
                    break label0;
                }
            }
            f = f1 + 360F;
        }
        windowmanager = (WindowManager)super.getContext().getSystemService("window");
        f2 = f;
        if (windowmanager == null) goto _L4; else goto _L3
_L3:
        f2 = f;
        if (windowmanager.getDefaultDisplay() == null) goto _L4; else goto _L5
_L5:
        f2 = f;
        windowmanager.getDefaultDisplay().getOrientation();
        JVM INSTR tableswitch 1 3: default 148
    //                   1 174
    //                   2 150
    //                   3 182;
           goto _L6 _L7 _L8 _L9
_L8:
        break; /* Loop/switch isn't completed */
_L6:
        f2 = f;
_L4:
        canvas.rotate(f2, f3 * 0.5F, f4 * 0.54F);
        arrow.draw(canvas);
_L2:
        return;
_L7:
        f2 = f - 90F;
        continue; /* Loop/switch isn't completed */
_L9:
        f2 = f + 90F;
        if (true) goto _L4; else goto _L10
_L10:
    }

    protected void onMeasure(int i, int j)
    {
        super.setMeasuredDimension(dimension, dimension);
    }

    public void onSensorChanged(SensorEvent sensorevent)
    {
        if (sensorevent.sensor.getType() == 1)
        {
            gravity = (float[])sensorevent.values.clone();
        }
        if (sensorevent.sensor.getType() == 2)
        {
            geomagnetic = (float[])sensorevent.values.clone();
        }
        azimuth = null;
        if (gravity != null && geomagnetic != null)
        {
            sensorevent = new float[9];
            if (SensorManager.getRotationMatrix(sensorevent, new float[9], gravity, geomagnetic))
            {
                float af[] = new float[3];
                SensorManager.getOrientation(sensorevent, af);
                azimuth = Float.valueOf(af[0]);
            }
        }
        super.invalidate();
    }

    public void setCurrent(Location location)
    {
        current = location;
        geoField = new GeomagneticField(Double.valueOf(location.getLatitude()).floatValue(), Double.valueOf(location.getLongitude()).floatValue(), Double.valueOf(location.getAltitude()).floatValue(), System.currentTimeMillis());
    }

    public void setTarget(Location location)
    {
        target = location;
    }
}
