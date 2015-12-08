// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.telemetry;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.skype.telemetry.event.TelemetryEvent;
import com.skype.telemetry.provider.TelemetryProvider;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

// Referenced classes of package com.skype.telemetry:
//            TelemetryProviderFactory, TelemetryConfiguration

public class TelemetryService
    implements android.app.Application.ActivityLifecycleCallbacks
{

    private final HashMap a;
    private final TelemetryConfiguration b;

    public TelemetryService(Application application, TelemetryProviderFactory telemetryproviderfactory)
    {
        application.registerActivityLifecycleCallbacks(this);
        a = telemetryproviderfactory.createProviders();
        b = telemetryproviderfactory.createConfiguration();
    }

    public final void a(TelemetryEvent telemetryevent)
    {
        Iterator iterator = a.values().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            TelemetryProvider telemetryprovider = (TelemetryProvider)iterator.next();
            if (b.a(telemetryprovider.getClass()))
            {
                telemetryprovider.a(telemetryevent);
            }
        } while (true);
    }

    public void onActivityCreated(Activity activity, Bundle bundle)
    {
        for (Iterator iterator = a.values().iterator(); iterator.hasNext(); ((TelemetryProvider)iterator.next()).onActivityCreated(activity, bundle)) { }
    }

    public void onActivityDestroyed(Activity activity)
    {
    }

    public void onActivityPaused(Activity activity)
    {
        for (Iterator iterator = a.values().iterator(); iterator.hasNext(); ((TelemetryProvider)iterator.next()).onActivityPaused(activity)) { }
    }

    public void onActivityResumed(Activity activity)
    {
        for (Iterator iterator = a.values().iterator(); iterator.hasNext(); ((TelemetryProvider)iterator.next()).onActivityResumed(activity)) { }
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle)
    {
    }

    public void onActivityStarted(Activity activity)
    {
        for (Iterator iterator = a.values().iterator(); iterator.hasNext(); ((TelemetryProvider)iterator.next()).onActivityStarted(activity)) { }
    }

    public void onActivityStopped(Activity activity)
    {
        for (Iterator iterator = a.values().iterator(); iterator.hasNext(); ((TelemetryProvider)iterator.next()).onActivityStopped(activity)) { }
    }
}
