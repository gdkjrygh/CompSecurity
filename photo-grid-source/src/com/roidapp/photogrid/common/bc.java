// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.common;

import android.content.Context;
import android.content.SharedPreferences;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Vibrator;
import com.roidapp.photogrid.release.PhotoGridActivity;
import java.lang.ref.WeakReference;

// Referenced classes of package com.roidapp.photogrid.common:
//            az

public final class bc
    implements SensorEventListener
{

    private SensorManager a;
    private WeakReference b;
    private long c;
    private long d;
    private float e;
    private float f;
    private float g;
    private float h;
    private float i;
    private float j;

    public bc()
    {
    }

    public static boolean a(Context context)
    {
        return context.getSharedPreferences(context.getPackageName(), 0).getInt("SHAKE", 1) == 1;
    }

    public final void a()
    {
        if (a != null)
        {
            a.unregisterListener(this);
            a = null;
        }
        b = null;
    }

    public final void a(WeakReference weakreference)
    {
        PhotoGridActivity photogridactivity;
        b = weakreference;
        photogridactivity = (PhotoGridActivity)weakreference.get();
        if (photogridactivity == null) goto _L2; else goto _L1
_L1:
        if (b != null && b.get() == null) goto _L4; else goto _L3
_L3:
        boolean flag;
        if (b == null)
        {
            weakreference = null;
        } else
        {
            weakreference = (PhotoGridActivity)b.get();
        }
        if (weakreference == null || weakreference.getSharedPreferences(weakreference.getPackageName(), 0).getInt("SHAKE", 1) != 1) goto _L4; else goto _L5
_L5:
        flag = true;
_L7:
        if (flag)
        {
            a = (SensorManager)photogridactivity.getSystemService("sensor");
            weakreference = a.getDefaultSensor(1);
            a.registerListener(this, weakreference, 1);
        }
_L2:
        return;
_L4:
        flag = false;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public final void onAccuracyChanged(Sensor sensor, int k)
    {
    }

    public final void onSensorChanged(SensorEvent sensorevent)
    {
        PhotoGridActivity photogridactivity;
        if (b != null)
        {
            photogridactivity = (PhotoGridActivity)b.get();
            break MISSING_BLOCK_LABEL_18;
        }
_L1:
        return;
        if (photogridactivity != null && photogridactivity.v() && !photogridactivity.i && (az.q != 8 || !photogridactivity.b("FragmentTextEdit")))
        {
            long l = System.currentTimeMillis();
            if (l - c > 100L)
            {
                long l1 = c;
                c = l;
                e = sensorevent.values[0];
                f = sensorevent.values[1];
                g = sensorevent.values[2];
                float f1 = Math.abs((e + f + g) - h - i - j) / (float)(l - l1);
                h = e;
                i = f;
                j = g;
                if (l - d > 1000L && f1 * 10000F > 1200F)
                {
                    d = System.currentTimeMillis();
                    ((Vibrator)photogridactivity.getSystemService("vibrator")).vibrate(100L);
                    photogridactivity.w();
                    return;
                } else
                {
                    photogridactivity.i = false;
                    return;
                }
            }
        }
          goto _L1
    }
}
