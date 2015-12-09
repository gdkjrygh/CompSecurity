// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import android.content.Context;
import com.flurry.android.FlurryEventRecordStatus;
import java.util.Map;

// Referenced classes of package com.flurry.sdk:
//            gg, fp, fb, hb, 
//            hc, ey

public class eq
    implements gg
{

    private ey a;

    public eq()
    {
    }

    public static eq a()
    {
        com/flurry/sdk/eq;
        JVM INSTR monitorenter ;
        eq eq1 = (eq)fp.a().a(com/flurry/sdk/eq);
        com/flurry/sdk/eq;
        JVM INSTR monitorexit ;
        return eq1;
        Exception exception;
        exception;
        throw exception;
    }

    private fb a(hb hb1)
    {
        if (hb1 == null)
        {
            return null;
        } else
        {
            return (fb)hb1.c(com/flurry/sdk/fb);
        }
    }

    private fb f()
    {
        return a(hc.a().e());
    }

    public FlurryEventRecordStatus a(String s)
    {
        fb fb1 = f();
        FlurryEventRecordStatus flurryeventrecordstatus = FlurryEventRecordStatus.kFlurryEventFailed;
        if (fb1 != null)
        {
            flurryeventrecordstatus = fb1.a(s, null, false);
        }
        return flurryeventrecordstatus;
    }

    public FlurryEventRecordStatus a(String s, Map map)
    {
        fb fb1 = f();
        FlurryEventRecordStatus flurryeventrecordstatus = FlurryEventRecordStatus.kFlurryEventFailed;
        if (fb1 != null)
        {
            flurryeventrecordstatus = fb1.a(s, map, false);
        }
        return flurryeventrecordstatus;
    }

    public FlurryEventRecordStatus a(String s, Map map, boolean flag)
    {
        fb fb1 = f();
        FlurryEventRecordStatus flurryeventrecordstatus = FlurryEventRecordStatus.kFlurryEventFailed;
        if (fb1 != null)
        {
            flurryeventrecordstatus = fb1.a(s, map, flag);
        }
        return flurryeventrecordstatus;
    }

    public FlurryEventRecordStatus a(String s, boolean flag)
    {
        fb fb1 = f();
        FlurryEventRecordStatus flurryeventrecordstatus = FlurryEventRecordStatus.kFlurryEventFailed;
        if (fb1 != null)
        {
            flurryeventrecordstatus = fb1.a(s, null, flag);
        }
        return flurryeventrecordstatus;
    }

    public void a(Context context)
    {
        hb.a(com/flurry/sdk/fb);
        a = new ey();
    }

    public void a(String s, String s1, String s2)
    {
        StackTraceElement astacktraceelement[] = Thread.currentThread().getStackTrace();
        if (astacktraceelement != null && astacktraceelement.length > 2)
        {
            StackTraceElement astacktraceelement1[] = new StackTraceElement[astacktraceelement.length - 2];
            System.arraycopy(astacktraceelement, 2, astacktraceelement1, 0, astacktraceelement1.length);
            astacktraceelement = astacktraceelement1;
        }
        Throwable throwable = new Throwable(s1);
        throwable.setStackTrace(astacktraceelement);
        fb fb1 = f();
        if (fb1 != null)
        {
            fb1.a(s, s1, s2, throwable);
        }
    }

    public void a(String s, String s1, Throwable throwable)
    {
        fb fb1 = f();
        if (fb1 != null)
        {
            fb1.a(s, s1, throwable.getClass().getName(), throwable);
        }
    }

    public void b()
    {
        if (a != null)
        {
            a.a();
            a = null;
        }
        hb.b(com/flurry/sdk/fb);
    }

    public void b(String s)
    {
        fb fb1 = f();
        if (fb1 != null)
        {
            fb1.a(s, null);
        }
    }

    public void b(String s, Map map)
    {
        fb fb1 = f();
        if (fb1 != null)
        {
            fb1.a(s, map);
        }
    }

    public ey c()
    {
        return a;
    }

    public void c(String s)
    {
        fb fb1 = f();
        if (fb1 != null)
        {
            fb1.a(s, null, false);
        }
    }

    public void c(String s, Map map)
    {
        fb fb1 = f();
        if (fb1 != null)
        {
            fb1.a(s, map, false);
        }
    }

    public void d()
    {
        fb fb1 = f();
        if (fb1 != null)
        {
            fb1.b();
        }
    }

    public void e()
    {
        fb fb1 = f();
        if (fb1 != null)
        {
            fb1.d();
        }
    }
}
