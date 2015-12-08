// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.util;

import com.skype.android.telemetry.RecordBuilder;
import com.skype.android.telemetry.TelemetryHelper;
import java.util.logging.Logger;

// Referenced classes of package com.skype.android.util:
//            StopWatch

public class StartupTimeReporter
{
    public static final class CheckPoint extends Enum
    {

        public static final CheckPoint a;
        public static final CheckPoint b;
        public static final CheckPoint c;
        public static final CheckPoint d;
        public static final CheckPoint e;
        public static final CheckPoint f;
        public static final CheckPoint g;
        public static final CheckPoint h;
        private static final CheckPoint i[];

        public static CheckPoint valueOf(String s)
        {
            return (CheckPoint)Enum.valueOf(com/skype/android/util/StartupTimeReporter$CheckPoint, s);
        }

        public static CheckPoint[] values()
        {
            return (CheckPoint[])i.clone();
        }

        static 
        {
            a = new CheckPoint("LANDING_PAGE_ACTIVITY", 0);
            b = new CheckPoint("APP_SIGN_IN_PROCESS", 1);
            c = new CheckPoint("MNV_ACTIVITY_START", 2);
            d = new CheckPoint("MNV_ACTIVITY_STOP", 3);
            e = new CheckPoint("HUB_ACTIVITY", 4);
            f = new CheckPoint("CHAT_ACTIVITY", 5);
            g = new CheckPoint("ACCOUNT_PICKER_ACTIVITY", 6);
            h = new CheckPoint("PRECALL_ACTIVITY", 7);
            i = (new CheckPoint[] {
                a, b, c, d, e, f, g, h
            });
        }

        private CheckPoint(String s, int j)
        {
            super(s, j);
        }
    }


    private static StartupTimeReporter a;
    private static final Logger b = Logger.getLogger("StartupTimeReporter");
    private StopWatch c;
    private String d;
    private boolean e;
    private boolean f;
    private long g;
    private long h;
    private long i;

    private StartupTimeReporter()
    {
        c = new StopWatch();
        e = true;
        d = "WarmStartUp";
    }

    public static StartupTimeReporter a()
    {
        com/skype/android/util/StartupTimeReporter;
        JVM INSTR monitorenter ;
        StartupTimeReporter startuptimereporter;
        if (a == null)
        {
            a = new StartupTimeReporter();
        }
        startuptimereporter = a;
        com/skype/android/util/StartupTimeReporter;
        JVM INSTR monitorexit ;
        return startuptimereporter;
        Exception exception;
        exception;
        com/skype/android/util/StartupTimeReporter;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void a(CheckPoint checkpoint)
    {
        a(checkpoint, null);
    }

    public final void a(CheckPoint checkpoint, TelemetryHelper telemetryhelper)
    {
        boolean flag = true;
        if (e) goto _L2; else goto _L1
_L1:
        checkpoint;
        JVM INSTR monitorenter ;
        static final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[CheckPoint.values().length];
                try
                {
                    a[CheckPoint.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    a[CheckPoint.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    a[CheckPoint.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    a[CheckPoint.d.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[CheckPoint.g.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[CheckPoint.e.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[CheckPoint.f.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[CheckPoint.h.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1.a[checkpoint.ordinal()];
        JVM INSTR tableswitch 1 8: default 430
    //                   1 71
    //                   2 141
    //                   3 197
    //                   4 236
    //                   5 280
    //                   6 280
    //                   7 280
    //                   8 280;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L8 _L8 _L8
_L3:
        checkpoint;
        JVM INSTR monitorexit ;
        return;
_L4:
        if (g == 0L)
        {
            flag = false;
        }
        if (flag) goto _L10; else goto _L9
_L9:
        g = c.c();
        b.info((new StringBuilder("Landing Page loadTime: ")).append(g).toString());
_L10:
        d = "ColdStartUp";
          goto _L3
        telemetryhelper;
        checkpoint;
        JVM INSTR monitorexit ;
        throw telemetryhelper;
_L5:
        if (!d.equals("ColdStartUp")) goto _L3; else goto _L11
_L11:
        h = c.c() - g;
        b.info((new StringBuilder("UserInteractionTimeForLogin: ")).append(h).toString());
          goto _L3
_L6:
        g = c.c();
        b.info((new StringBuilder("startUpDurationUptoMNV: ")).append(g).toString());
          goto _L3
_L7:
        i = c.c() - g;
        b.info((new StringBuilder("MNVduration: ")).append(i).toString());
          goto _L3
_L8:
        long l = c.c();
        c.b();
        f = false;
        e = true;
        l -= i;
        b.info((new StringBuilder("Reporting startup: StartUpType: ")).append(d).append(" : MNV Duration: ").append(i).append(" : duration excluding MNV: ").append(l).append(" : UserInteratction Time for Login/signUp:  ").append(h).toString());
        RecordBuilder recordbuilder = telemetryhelper.startBuildingRecord(true);
        recordbuilder.a("android_startup").a("StartupType", d).a("UserInteractionTimeDuringSignIn", Long.valueOf(h)).a("StartupDuration", Long.valueOf(l));
        telemetryhelper.sendRecord(recordbuilder);
        a = null;
          goto _L3
_L2:
    }

    public final void b()
    {
        if (f && e)
        {
            e = false;
            g = 0L;
            h = 0L;
            c.a();
        }
    }

    public final void c()
    {
        f = true;
        e = true;
    }

}
