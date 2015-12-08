// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import android.content.Context;

// Referenced classes of package com.flurry.sdk:
//            gg, hg, hh, gd, 
//            ht, eq, hc, fh

public class hs
    implements gg, hh.a, Thread.UncaughtExceptionHandler
{

    private static final String a = com/flurry/sdk/hs.getSimpleName();
    private boolean b;

    public hs()
    {
    }

    public void a(Context context)
    {
        context = hg.a();
        b = ((Boolean)context.a("CaptureUncaughtExceptions")).booleanValue();
        context.a("CaptureUncaughtExceptions", this);
        gd.a(4, a, (new StringBuilder()).append("initSettings, CrashReportingEnabled = ").append(b).toString());
        ht.a().a(this);
    }

    public void a(String s, Object obj)
    {
        if (s.equals("CaptureUncaughtExceptions"))
        {
            b = ((Boolean)obj).booleanValue();
            gd.a(4, a, (new StringBuilder()).append("onSettingUpdate, CrashReportingEnabled = ").append(b).toString());
            return;
        } else
        {
            gd.a(6, a, "onSettingUpdate internal error!");
            return;
        }
    }

    public void b()
    {
        ht.b();
        hg.a().b("CaptureUncaughtExceptions", this);
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
            thread.append((new StringBuilder()).append(" (").append(throwable.getMessage()).append(")\n").toString());
        }
        thread = thread.toString();
_L6:
        eq.a().a("uncaught", thread, throwable);
_L2:
        hc.a().g();
        fh.a().d();
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
