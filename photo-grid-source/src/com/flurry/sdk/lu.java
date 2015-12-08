// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import android.content.Context;

// Referenced classes of package com.flurry.sdk:
//            kf, lg, lh, kc, 
//            lv, hi, ld, jg

public class lu
    implements kf, lh.a, Thread.UncaughtExceptionHandler
{

    private static final String a = com/flurry/sdk/lu.getSimpleName();
    private boolean b;

    public lu()
    {
    }

    public void a(Context context)
    {
        context = lg.a();
        b = ((Boolean)context.a("CaptureUncaughtExceptions")).booleanValue();
        context.a("CaptureUncaughtExceptions", this);
        kc.a(4, a, (new StringBuilder("initSettings, CrashReportingEnabled = ")).append(b).toString());
        lv.a().a(this);
    }

    public void a(String s, Object obj)
    {
        if (s.equals("CaptureUncaughtExceptions"))
        {
            b = ((Boolean)obj).booleanValue();
            kc.a(4, a, (new StringBuilder("onSettingUpdate, CrashReportingEnabled = ")).append(b).toString());
            return;
        } else
        {
            kc.a(6, a, "onSettingUpdate internal error!");
            return;
        }
    }

    public void b()
    {
        lv.b();
        lg.a().b("CaptureUncaughtExceptions", this);
    }

    public void uncaughtException(Thread thread, Throwable throwable)
    {
        throwable.printStackTrace();
        if (!b) goto _L2; else goto _L1
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
        hi.a().a("uncaught", thread, throwable);
_L2:
        ld.a().g();
        jg.a().d();
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
