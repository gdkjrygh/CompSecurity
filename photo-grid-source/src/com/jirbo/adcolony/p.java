// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jirbo.adcolony;

import android.app.Activity;
import java.io.PrintStream;

// Referenced classes of package com.jirbo.adcolony:
//            a, l, d, AdColony, 
//            v, aa

class p
    implements Runnable
{

    public static final int a = 5;
    public static final int b = 10;
    static String c = "MONITOR_MUTEX";
    static volatile p d;
    static volatile long e;

    p()
    {
    }

    static void a()
    {
        synchronized (c)
        {
            e = System.currentTimeMillis();
            if (d == null)
            {
                com.jirbo.adcolony.a.b("Creating ADC Monitor singleton.");
                d = new p();
                (new Thread(d)).start();
            }
        }
        return;
        exception;
        s;
        JVM INSTR monitorexit ;
        throw exception;
    }

    void a(long l1)
    {
        try
        {
            Thread.sleep(l1);
            return;
        }
        catch (InterruptedException interruptedexception)
        {
            return;
        }
    }

    public void run()
    {
        boolean flag;
        com.jirbo.adcolony.a.a(a.n);
        l.a.b("ADC Monitor Started.");
        a.l.b();
        flag = false;
_L8:
        if (AdColony.activity().isFinishing()) goto _L2; else goto _L1
_L1:
        int i;
        int j;
        long l2 = System.currentTimeMillis();
        a.r = false;
        a.l.g();
        double d1;
        v v1;
        long l1;
        if (a.r)
        {
            l1 = 50L;
        } else
        {
            if (flag)
            {
                i = 2000;
            } else
            {
                i = 250;
            }
            l1 = i;
        }
        j = (int)((System.currentTimeMillis() - e) / 1000L);
        a.l.g();
        if (!flag) goto _L4; else goto _L3
_L3:
        if (j >= 10) goto _L2; else goto _L5
_L5:
        i = ((flag) ? 1 : 0);
        if (j < 5)
        {
            a.l.b();
            com.jirbo.adcolony.a.b("AdColony is active.");
            i = 0;
        }
_L6:
        a(l1);
        l1 = System.currentTimeMillis();
        flag = i;
        if (l1 - l2 <= 3000L)
        {
            flag = i;
            if (l1 - l2 > 0L)
            {
                v1 = a.l.e;
                d1 = v1.h;
                v1.h = (double)(l1 - l2) / 1000D + d1;
                flag = i;
            }
        }
        continue; /* Loop/switch isn't completed */
_L4:
        i = ((flag) ? 1 : 0);
        if (j >= 5)
        {
            com.jirbo.adcolony.a.b("AdColony is idle.");
            a.l.c();
            i = 1;
        }
        if (true) goto _L6; else goto _L2
_L2:
        synchronized (c)
        {
            d = null;
        }
        if (!flag)
        {
            a.l.c();
        }
        if (AdColony.activity().isFinishing())
        {
            a.s = true;
            a(5000L);
            if (a.s)
            {
                l.c.b("ADC.finishing, controller on_stop");
                a.l.d();
                aa.a();
            }
        }
        System.out.println("Exiting monitor");
        return;
        exception;
        s;
        JVM INSTR monitorexit ;
        throw exception;
        if (true) goto _L8; else goto _L7
_L7:
    }

}
