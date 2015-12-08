// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.report.c;

import android.app.Activity;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Bundle;
import com.android.slyce.report.mpmetrics.ab;

// Referenced classes of package com.android.slyce.report.c:
//            t, s, af, ac, 
//            ah, j

class ag
    implements android.app.Application.ActivityLifecycleCallbacks, t
{

    final ac a;
    private final s b = new s(this);
    private final af c;

    public ag(ac ac1)
    {
        a = ac1;
        super();
        c = new af(ac1);
    }

    private void a(Activity activity)
    {
        if (b() && !ac.c(a).f())
        {
            c.a();
        } else
        if (!ac.c(a).e())
        {
            activity = (SensorManager)activity.getSystemService("sensor");
            android.hardware.Sensor sensor = activity.getDefaultSensor(1);
            activity.registerListener(b, sensor, 3);
            return;
        }
    }

    private void b(Activity activity)
    {
        if (b() && !ac.c(a).f())
        {
            c.b();
        } else
        if (!ac.c(a).e())
        {
            ((SensorManager)activity.getSystemService("sensor")).unregisterListener(b);
            return;
        }
    }

    private boolean b()
    {
        while (!Build.HARDWARE.equals("goldfish") || !Build.BRAND.startsWith("generic") || !Build.DEVICE.startsWith("generic") || !Build.PRODUCT.contains("sdk") || !Build.MODEL.toLowerCase().contains("sdk")) 
        {
            return false;
        }
        return true;
    }

    public void a()
    {
        android.os.Message message = ac.a(a).obtainMessage(1);
        ac.a(a).sendMessage(message);
    }

    public void onActivityCreated(Activity activity, Bundle bundle)
    {
    }

    public void onActivityDestroyed(Activity activity)
    {
    }

    public void onActivityPaused(Activity activity)
    {
        ac.b(a).b(activity);
        if (ac.b(a).b())
        {
            b(activity);
        }
    }

    public void onActivityResumed(Activity activity)
    {
        a(activity);
        ac.b(a).a(activity);
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle)
    {
    }

    public void onActivityStarted(Activity activity)
    {
    }

    public void onActivityStopped(Activity activity)
    {
    }
}
