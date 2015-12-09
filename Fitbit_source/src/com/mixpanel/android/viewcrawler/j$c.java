// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.viewcrawler;

import android.app.Activity;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Bundle;
import com.mixpanel.android.mpmetrics.g;
import java.util.Locale;

// Referenced classes of package com.mixpanel.android.viewcrawler:
//            j, d, c

private class <init>
    implements android.app.ication.ActivityLifecycleCallbacks, Callbacks
{

    final j a;
    private final d b = new d(this);
    private final nit> c;

    private void a(Activity activity)
    {
        if (b() && !j.c(a).g())
        {
            c.a();
        } else
        if (!j.c(a).f())
        {
            activity = (SensorManager)activity.getSystemService("sensor");
            android.hardware.Sensor sensor = activity.getDefaultSensor(1);
            activity.registerListener(b, sensor, 3);
            return;
        }
    }

    private void b(Activity activity)
    {
        if (b() && !j.c(a).g())
        {
            c.b();
        } else
        if (!j.c(a).f())
        {
            ((SensorManager)activity.getSystemService("sensor")).unregisterListener(b);
            return;
        }
    }

    private boolean b()
    {
        while (!Build.HARDWARE.equals("goldfish") || !Build.BRAND.startsWith("generic") || !Build.DEVICE.startsWith("generic") || !Build.PRODUCT.contains("sdk") || !Build.MODEL.toLowerCase(Locale.US).contains("sdk")) 
        {
            return false;
        }
        return true;
    }

    public void a()
    {
        android.os.Message message = j.a(a).obtainMessage(1);
        j.a(a).sendMessage(message);
    }

    public void onActivityCreated(Activity activity, Bundle bundle)
    {
    }

    public void onActivityDestroyed(Activity activity)
    {
    }

    public void onActivityPaused(Activity activity)
    {
        j.b(a).b(activity);
        if (j.b(a).b())
        {
            b(activity);
        }
    }

    public void onActivityResumed(Activity activity)
    {
        a(activity);
        j.b(a).a(activity);
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

    public ycleCallbacks(j j1)
    {
        a = j1;
        super();
        c = new <init>(j1);
    }
}
