// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.analytics;

import android.app.Application;
import com.microsoft.applications.telemetry.ILogger;
import com.microsoft.applications.telemetry.ISemanticContext;
import com.microsoft.applications.telemetry.LogConfiguration;
import com.microsoft.applications.telemetry.LogManager;
import com.skype.telemetry.event.TelemetryEvent;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.skype.android.analytics:
//            AriaAccess

final class c
    implements Runnable
{

    final Application a;
    final String b;
    final LogConfiguration c;
    final AriaAccess d;

    public final void run()
    {
        LogManager.initialize(a, b, c);
        AriaAccess.a(d, LogManager.getLogger());
        AriaAccess.a(d).getSemanticContext().setAppId("D1604CB9-CFF6-4A1B-8A91-3C6751D6D79A");
        AriaAccess.b(d).set(true);
        for (; !AriaAccess.c(d).isEmpty(); AriaAccess.a(d, (TelemetryEvent)AriaAccess.c(d).poll())) { }
    }

    onfiguration(AriaAccess ariaaccess, Application application, String s, LogConfiguration logconfiguration)
    {
        d = ariaaccess;
        a = application;
        b = s;
        c = logconfiguration;
        super();
    }
}
