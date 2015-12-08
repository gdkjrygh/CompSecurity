// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import android.content.Context;
import com.flurry.android.FlurryEventRecordStatus;
import java.util.Map;

// Referenced classes of package com.flurry.sdk:
//            kf, jo, iy, lb, 
//            lp, kc, ld, iv, 
//            id, if, ja

public class hi
    implements kf
{

    private static final String a = com/flurry/sdk/hi.getSimpleName();
    private id b;
    private iv c;
    private if d;

    public hi()
    {
    }

    public static hi a()
    {
        com/flurry/sdk/hi;
        JVM INSTR monitorenter ;
        hi hi1 = (hi)jo.a().a(com/flurry/sdk/hi);
        com/flurry/sdk/hi;
        JVM INSTR monitorexit ;
        return hi1;
        Exception exception;
        exception;
        throw exception;
    }

    private iy a(lb lb1)
    {
        if (lb1 == null)
        {
            return null;
        } else
        {
            return (iy)lb1.c(com/flurry/sdk/iy);
        }
    }

    private void b(Context context)
    {
        if (!lp.a(context, "android.permission.INTERNET"))
        {
            kc.b(a, "Application must declare permission: android.permission.INTERNET");
        }
        if (!lp.a(context, "android.permission.ACCESS_NETWORK_STATE"))
        {
            kc.e(a, "It is highly recommended that the application declare permission: android.permission.ACCESS_NETWORK_STATE");
        }
    }

    private iy h()
    {
        return a(ld.a().e());
    }

    public FlurryEventRecordStatus a(String s)
    {
        iy iy1 = h();
        FlurryEventRecordStatus flurryeventrecordstatus = FlurryEventRecordStatus.kFlurryEventFailed;
        if (iy1 != null)
        {
            flurryeventrecordstatus = iy1.a(s, null, false);
        }
        return flurryeventrecordstatus;
    }

    public FlurryEventRecordStatus a(String s, String s1, Map map)
    {
        iy iy1 = h();
        FlurryEventRecordStatus flurryeventrecordstatus = FlurryEventRecordStatus.kFlurryEventFailed;
        if (iy1 != null)
        {
            flurryeventrecordstatus = iy1.a(s, s1, map, false);
        }
        return flurryeventrecordstatus;
    }

    public FlurryEventRecordStatus a(String s, Map map)
    {
        iy iy1 = h();
        FlurryEventRecordStatus flurryeventrecordstatus = FlurryEventRecordStatus.kFlurryEventFailed;
        if (iy1 != null)
        {
            flurryeventrecordstatus = iy1.a(s, map, false);
        }
        return flurryeventrecordstatus;
    }

    public FlurryEventRecordStatus a(String s, Map map, boolean flag)
    {
        iy iy1 = h();
        FlurryEventRecordStatus flurryeventrecordstatus = FlurryEventRecordStatus.kFlurryEventFailed;
        if (iy1 != null)
        {
            flurryeventrecordstatus = iy1.a(s, map, flag);
        }
        return flurryeventrecordstatus;
    }

    public FlurryEventRecordStatus a(String s, boolean flag)
    {
        iy iy1 = h();
        FlurryEventRecordStatus flurryeventrecordstatus = FlurryEventRecordStatus.kFlurryEventFailed;
        if (iy1 != null)
        {
            flurryeventrecordstatus = iy1.a(s, null, flag);
        }
        return flurryeventrecordstatus;
    }

    public void a(Context context)
    {
        lb.a(com/flurry/sdk/iy);
        c = new iv();
        b = new id();
        d = new if();
        b(context);
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
        iy iy1 = h();
        if (iy1 != null)
        {
            iy1.a(s, s1, s2, throwable);
        }
    }

    public void a(String s, String s1, Throwable throwable)
    {
        iy iy1 = h();
        if (iy1 != null)
        {
            iy1.a(s, s1, throwable.getClass().getName(), throwable);
        }
    }

    public FlurryEventRecordStatus b(String s, String s1, Map map)
    {
        iy iy1 = h();
        FlurryEventRecordStatus flurryeventrecordstatus = FlurryEventRecordStatus.kFlurryEventFailed;
        if (iy1 != null)
        {
            flurryeventrecordstatus = iy1.a(s, ja.a(s1), map, false);
        }
        return flurryeventrecordstatus;
    }

    public void b()
    {
        if (d != null)
        {
            d.c();
            d = null;
        }
        if (c != null)
        {
            c.a();
            c = null;
        }
        if (b != null)
        {
            b.a();
            b = null;
        }
        lb.b(com/flurry/sdk/iy);
    }

    public void b(String s)
    {
        iy iy1 = h();
        if (iy1 != null)
        {
            iy1.a(s, null);
        }
    }

    public void b(String s, Map map)
    {
        iy iy1 = h();
        if (iy1 != null)
        {
            iy1.a(s, map);
        }
    }

    public id c()
    {
        return b;
    }

    public void c(String s)
    {
        iy iy1 = h();
        if (iy1 != null)
        {
            iy1.a(s, null, false);
        }
    }

    public void c(String s, Map map)
    {
        iy iy1 = h();
        if (iy1 != null)
        {
            iy1.a(s, map, false);
        }
    }

    public iv d()
    {
        return c;
    }

    public if e()
    {
        return d;
    }

    public void f()
    {
        iy iy1 = h();
        if (iy1 != null)
        {
            iy1.a();
        }
    }

    public void g()
    {
        iy iy1 = h();
        if (iy1 != null)
        {
            iy1.b();
        }
    }

}
