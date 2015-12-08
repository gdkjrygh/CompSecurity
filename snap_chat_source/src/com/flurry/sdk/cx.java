// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import com.flurry.android.FlurryAgent;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.flurry.sdk:
//            ec, dp, dq, el, 
//            eb, dl, dj, dz

public class cx
    implements dq.a, Thread.UncaughtExceptionHandler
{
    public static class a
    {

        public int a;

        public a()
        {
        }
    }


    private static final String a = com/flurry/sdk/cx.getSimpleName();
    private static cx b;
    private final HashMap c = new HashMap();
    private boolean d;

    private cx()
    {
        ec.a().a(this);
        d();
    }

    public static cx a()
    {
        com/flurry/sdk/cx;
        JVM INSTR monitorenter ;
        cx cx1;
        if (b == null)
        {
            b = new cx();
        }
        cx1 = b;
        com/flurry/sdk/cx;
        JVM INSTR monitorexit ;
        return cx1;
        Exception exception;
        exception;
        throw exception;
    }

    private void d()
    {
        dq dq1 = dp.a();
        d = ((Boolean)dq1.a("CaptureUncaughtExceptions")).booleanValue();
        dq1.a("CaptureUncaughtExceptions", this);
        el.a(4, a, (new StringBuilder("initSettings, CrashReportingEnabled = ")).append(d).toString());
        String s = (String)dq1.a("VersionName");
        dq1.a("VersionName", this);
        eb.a(s);
        el.a(4, a, (new StringBuilder("initSettings, VersionName = ")).append(s).toString());
    }

    public void a(String s)
    {
        dj dj1 = dl.a().c();
        if (dj1 != null)
        {
            dj1.a(s, null, false);
        }
    }

    public void a(String s, Object obj)
    {
        if (s.equals("CaptureUncaughtExceptions"))
        {
            d = ((Boolean)obj).booleanValue();
            el.a(4, a, (new StringBuilder("onSettingUpdate, CrashReportingEnabled = ")).append(d).toString());
            return;
        }
        if (s.equals("VersionName"))
        {
            s = (String)obj;
            eb.a(s);
            el.a(4, a, (new StringBuilder("onSettingUpdate, VersionName = ")).append(s).toString());
            return;
        } else
        {
            el.a(6, a, "onSettingUpdate internal error!");
            return;
        }
    }

    public void a(String s, String s1, Throwable throwable)
    {
        dj dj1 = dl.a().c();
        if (dj1 != null)
        {
            dj1.a(s, s1, throwable.getClass().getName(), throwable);
        }
    }

    public void a(String s, Map map)
    {
        dj dj1 = dl.a().c();
        if (dj1 != null)
        {
            dj1.a(s, map, false);
        }
    }

    public HashMap b()
    {
        HashMap hashmap1;
        synchronized (c)
        {
            hashmap1 = new HashMap(c);
        }
        return hashmap1;
        exception;
        hashmap;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void uncaughtException(Thread thread, Throwable throwable)
    {
        throwable.printStackTrace();
        if (!d) goto _L2; else goto _L1
_L1:
        StackTraceElement astacktraceelement[];
        thread = "";
        astacktraceelement = throwable.getStackTrace();
        if (astacktraceelement == null || astacktraceelement.length <= 0) goto _L4; else goto _L3
_L3:
        thread = new StringBuilder();
        if (throwable.getMessage() != null)
        {
            thread.append((new StringBuilder(" (")).append(throwable.getMessage()).append(")\n").toString());
        }
        thread = thread.toString();
_L6:
        FlurryAgent.onError("uncaught", thread, throwable);
_L2:
        dl.a().d();
        dz.a().g();
        return;
_L4:
        if (throwable.getMessage() != null)
        {
            thread = throwable.getMessage();
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

}
