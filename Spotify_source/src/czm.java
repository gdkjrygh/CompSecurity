// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import java.util.Locale;
import java.util.Set;

final class czm
    implements android.app.Application.ActivityLifecycleCallbacks, cza
{

    private final cyz a = new cyz(this);
    private final czl b;
    private czj c;

    public czm(czj czj1)
    {
        c = czj1;
        super();
        b = new czl(czj1);
    }

    private static boolean b()
    {
        while (!Build.HARDWARE.equals("goldfish") || !Build.BRAND.startsWith("generic") || !Build.DEVICE.startsWith("generic") || !Build.PRODUCT.contains("sdk") || !Build.MODEL.toLowerCase(Locale.US).contains("sdk")) 
        {
            return false;
        }
        return true;
    }

    public final void a()
    {
        android.os.Message message = czj.a(c).obtainMessage(1);
        czj.a(c).sendMessage(message);
    }

    public final void onActivityCreated(Activity activity, Bundle bundle)
    {
    }

    public final void onActivityDestroyed(Activity activity)
    {
    }

    public final void onActivityPaused(Activity activity)
    {
        czj.b(c).b(activity);
        cyu cyu1 = czj.b(c);
        if (Thread.currentThread() != Looper.getMainLooper().getThread())
        {
            throw new RuntimeException("Can't check isEmpty() when not on the UI thread");
        }
        if (((czh) (cyu1)).a.isEmpty())
        {
            if (b() && !czj.c(c).h)
            {
                activity = b;
                activity.a = true;
                czj.a(((czl) (activity)).b).removeCallbacks(activity);
            } else
            if (!czj.c(c).g)
            {
                ((SensorManager)activity.getSystemService("sensor")).unregisterListener(a);
                return;
            }
        }
    }

    public final void onActivityResumed(Activity activity)
    {
        if (!b() || czj.c(c).h) goto _L2; else goto _L1
_L1:
        czl czl1 = b;
        czl1.a = false;
        czj.a(czl1.b).post(czl1);
_L4:
        czj.b(c).a(activity);
        return;
_L2:
        if (!czj.c(c).g)
        {
            SensorManager sensormanager = (SensorManager)activity.getSystemService("sensor");
            android.hardware.Sensor sensor = sensormanager.getDefaultSensor(1);
            sensormanager.registerListener(a, sensor, 3);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle)
    {
    }

    public final void onActivityStarted(Activity activity)
    {
    }

    public final void onActivityStopped(Activity activity)
    {
    }
}
