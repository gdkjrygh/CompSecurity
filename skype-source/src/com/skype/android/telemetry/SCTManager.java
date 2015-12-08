// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.telemetry;

import com.skype.data.clienttelemetry.TelemetryClient;
import com.skype.data.clienttelemetry.TelemetryListener;
import java.util.logging.Logger;

public class SCTManager
    implements TelemetryListener
{

    private final TelemetryClient a;
    private Logger b;

    public SCTManager(TelemetryClient telemetryclient, Logger logger)
    {
        b = logger;
        a = telemetryclient;
        telemetryclient.a(this);
        telemetryclient.a();
    }

    public final void a()
    {
        com.skype.data.clienttelemetry.TelemetryListener.EventType.values();
    }

    public final TelemetryClient b()
    {
        return a;
    }
}
