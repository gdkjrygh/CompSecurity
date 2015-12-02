// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.m;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

// Referenced classes of package com.facebook.m:
//            c

public abstract class a
    implements SensorEventListener
{

    private c a;

    public a()
    {
        a = new c();
    }

    protected abstract void a();

    public void b()
    {
        a.a();
    }

    public void onAccuracyChanged(Sensor sensor, int i)
    {
    }

    public void onSensorChanged(SensorEvent sensorevent)
    {
        a.a(sensorevent);
        if (a.b())
        {
            a.a();
            a();
        }
    }
}
