// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.util;

import android.app.Application;
import android.os.SystemClock;
import com.skype.SkyLib;
import com.skype.android.analytics.AnalyticsPersistentStorage;
import com.skype.android.config.ecs.EcsClient;
import com.skype.android.telemetry.ExceptionTelemetry;
import com.skype.android.telemetry.RecordBuilder;
import com.skype.android.telemetry.SCTManager;
import com.skype.android.telemetry.TelemetryHelper;
import java.io.PrintWriter;
import java.io.StringWriter;

// Referenced classes of package com.skype.android.util:
//            TimeAnomalyException, NetworkUtil

public class TimeAnomalyTelemetry extends TelemetryHelper
    implements ExceptionTelemetry
{

    private final SkyLib a;

    public TimeAnomalyTelemetry(Application application, SCTManager sctmanager, EcsClient ecsclient, NetworkUtil networkutil, AnalyticsPersistentStorage analyticspersistentstorage, SkyLib skylib)
    {
        super(application, sctmanager, ecsclient, networkutil, analyticspersistentstorage);
        a = skylib;
    }

    public final void a(TimeAnomalyException timeanomalyexception, Object obj, Object obj1)
    {
        RecordBuilder recordbuilder = startBuildingRecord(false);
        recordbuilder.a("timeAnomaly").b("serverSeconds", Integer.valueOf(a.getServerTime())).b("localMillis", Long.valueOf(System.currentTimeMillis())).b("localNanos", Long.valueOf(System.nanoTime())).b("uptime", Long.valueOf(SystemClock.uptimeMillis())).b("realMillis", Long.valueOf(SystemClock.elapsedRealtime()));
        if (android.os.Build.VERSION.SDK_INT >= 17)
        {
            recordbuilder.b("realNanos", Long.valueOf(SystemClock.elapsedRealtimeNanos()));
        }
        RecordBuilder recordbuilder1 = recordbuilder.b("intervalStart", Long.valueOf(timeanomalyexception.b())).b("intervalEnd", Long.valueOf(timeanomalyexception.c())).b("scale", timeanomalyexception.d()).b("isRelative", Boolean.valueOf(timeanomalyexception.a()));
        StringWriter stringwriter = new StringWriter();
        PrintWriter printwriter = new PrintWriter(stringwriter);
        timeanomalyexception.printStackTrace(printwriter);
        printwriter.flush();
        printwriter.close();
        recordbuilder1.b("trace", stringwriter.getBuffer());
        recordbuilder.b("useCase", obj1);
        recordbuilder.b("dataType", obj);
        sendRecord(recordbuilder);
    }
}
