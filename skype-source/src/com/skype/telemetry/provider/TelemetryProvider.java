// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.telemetry.provider;

import com.skype.telemetry.event.TelemetryEvent;

public abstract class TelemetryProvider
    implements android.app.Application.ActivityLifecycleCallbacks
{

    public TelemetryProvider()
    {
    }

    public abstract void a(TelemetryEvent telemetryevent);
}
