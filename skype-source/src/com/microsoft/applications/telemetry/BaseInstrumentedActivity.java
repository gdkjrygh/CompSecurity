// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.applications.telemetry;

import android.app.Activity;
import android.os.Bundle;

// Referenced classes of package com.microsoft.applications.telemetry:
//            LogManager, AppLifecycleState, ILogger

public abstract class BaseInstrumentedActivity extends Activity
{

    private static final String LOG_TAG = com/microsoft/applications/telemetry/BaseInstrumentedActivity.getSimpleName();

    public BaseInstrumentedActivity()
    {
    }

    public ILogger getLogger()
    {
        this;
        JVM INSTR monitorenter ;
        ILogger ilogger = LogManager.getLogger();
        this;
        JVM INSTR monitorexit ;
        return ilogger;
        Exception exception;
        exception;
        throw exception;
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
    }

    protected void onDestroy()
    {
        super.onDestroy();
    }

    protected void onPause()
    {
        super.onPause();
        getLogger().logAppLifecycle(AppLifecycleState.BACKGROUND, null);
    }

    protected void onResume()
    {
        super.onResume();
        getLogger().logAppLifecycle(AppLifecycleState.FOREGROUND, null);
    }

    protected void onStart()
    {
        super.onStart();
        getLogger().logAppLifecycle(AppLifecycleState.RESUME, null);
    }

    protected void onStop()
    {
        super.onStop();
        getLogger().logAppLifecycle(AppLifecycleState.SUSPEND, null);
    }

}
