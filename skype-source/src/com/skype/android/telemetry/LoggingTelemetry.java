// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.telemetry;

import android.app.Application;
import com.skype.android.analytics.AnalyticsPersistentStorage;
import com.skype.android.config.ecs.EcsClient;
import com.skype.android.util.NetworkUtil;

// Referenced classes of package com.skype.android.telemetry:
//            TelemetryHelper, RecordBuilder, SCTManager

public class LoggingTelemetry extends TelemetryHelper
{
    public static final class LogLevel extends Enum
    {

        public static final LogLevel a;
        public static final LogLevel b;
        public static final LogLevel c;
        public static final LogLevel d;
        private static final LogLevel e[];

        public static LogLevel valueOf(String s)
        {
            return (LogLevel)Enum.valueOf(com/skype/android/telemetry/LoggingTelemetry$LogLevel, s);
        }

        public static LogLevel[] values()
        {
            return (LogLevel[])e.clone();
        }

        static 
        {
            a = new LogLevel("INFO", 0);
            b = new LogLevel("WARNING", 1);
            c = new LogLevel("ERROR", 2);
            d = new LogLevel("ASSERT", 3);
            e = (new LogLevel[] {
                a, b, c, d
            });
        }

        private LogLevel(String s, int i)
        {
            super(s, i);
        }
    }


    public LoggingTelemetry(Application application, SCTManager sctmanager, EcsClient ecsclient, NetworkUtil networkutil, AnalyticsPersistentStorage analyticspersistentstorage)
    {
        super(application, sctmanager, ecsclient, networkutil, analyticspersistentstorage);
        setUseFlavorAsNamespace(true);
    }

    public final void a(LogLevel loglevel, String s)
    {
        sendRecord(startBuildingRecord(true).a((new StringBuilder()).append(createPrefix()).append("app_log").toString()).a("log_level", loglevel.toString()).a("warning_message", s));
    }
}
