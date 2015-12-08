// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.telemetry.provider;

import android.app.Activity;
import android.os.Bundle;
import com.skype.telemetry.event.TelemetryEvent;
import com.skype.telemetry.sdk.FlurryAccessInterface;

// Referenced classes of package com.skype.telemetry.provider:
//            TelemetryProvider

public class FlurryTelemetryProvider extends TelemetryProvider
{

    private FlurryAccessInterface a;

    public FlurryTelemetryProvider(FlurryAccessInterface flurryaccessinterface)
    {
        a = flurryaccessinterface;
    }

    public final void a(TelemetryEvent telemetryevent)
    {
        if (telemetryevent.hasAttributes())
        {
            a.a(telemetryevent.getName(), telemetryevent.getAttributesAsMapString(), false);
            return;
        } else
        {
            a.b(telemetryevent.getName());
            return;
        }
    }

    public void onActivityCreated(Activity activity, Bundle bundle)
    {
    }

    public void onActivityDestroyed(Activity activity)
    {
    }

    public void onActivityPaused(Activity activity)
    {
    }

    public void onActivityResumed(Activity activity)
    {
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle)
    {
    }

    public void onActivityStarted(Activity activity)
    {
        a.a(activity);
    }

    public void onActivityStopped(Activity activity)
    {
        a.b(activity);
    }
}
