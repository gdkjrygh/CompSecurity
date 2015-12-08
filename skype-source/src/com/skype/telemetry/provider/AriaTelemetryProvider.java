// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.telemetry.provider;

import android.app.Activity;
import android.os.Bundle;
import com.skype.telemetry.event.TelemetryEvent;
import com.skype.telemetry.sdk.AriaAccessInterface;

// Referenced classes of package com.skype.telemetry.provider:
//            TelemetryProvider

public class AriaTelemetryProvider extends TelemetryProvider
{

    private AriaAccessInterface a;

    public AriaTelemetryProvider(AriaAccessInterface ariaaccessinterface)
    {
        a = ariaaccessinterface;
    }

    public final void a(TelemetryEvent telemetryevent)
    {
        a.a(telemetryevent);
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
    }

    public void onActivityStopped(Activity activity)
    {
    }
}
