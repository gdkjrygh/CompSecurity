// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.associates;

import android.util.Log;

// Referenced classes of package com.amazon.device.associates:
//            ar, at, bg, w, 
//            k, v, x, q, 
//            ai

final class av
{

    private static final String a = com/amazon/device/associates/av.getSimpleName();
    private static boolean b = false;
    private static volatile boolean c = false;
    private static volatile boolean d = false;
    private static volatile ar e = null;
    private static volatile ar f = null;
    private static volatile bg g = null;
    private static volatile at h = null;
    private static volatile at i = null;

    av()
    {
    }

    static ar a()
    {
        if (e != null) goto _L2; else goto _L1
_L1:
        com/amazon/device/associates/av;
        JVM INSTR monitorenter ;
        e = (ar)a(com/amazon/device/associates/ar, e, false);
        com/amazon/device/associates/av;
        JVM INSTR monitorexit ;
_L2:
        return e;
        Exception exception;
        exception;
        com/amazon/device/associates/av;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private static Object a(Class class1, Object obj, boolean flag)
    {
        if (obj != null) goto _L2; else goto _L1
_L1:
        e();
        if (!flag) goto _L4; else goto _L3
_L3:
        at at1 = i;
_L5:
        if (at1 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        return at1.a(class1).newInstance();
_L4:
        at1 = h;
        if (true) goto _L5; else goto _L2
        Exception exception;
        exception;
        Log.e(a, (new StringBuilder()).append("error getting instance for ").append(class1).toString(), exception);
_L2:
        return obj;
    }

    static void a(boolean flag)
    {
        b = flag;
    }

    static ar b()
    {
        if (f != null) goto _L2; else goto _L1
_L1:
        com/amazon/device/associates/av;
        JVM INSTR monitorenter ;
        f = (ar)a(com/amazon/device/associates/ar, f, true);
        com/amazon/device/associates/av;
        JVM INSTR monitorexit ;
_L2:
        return f;
        Exception exception;
        exception;
        com/amazon/device/associates/av;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static bg c()
    {
        if (g != null) goto _L2; else goto _L1
_L1:
        com/amazon/device/associates/av;
        JVM INSTR monitorenter ;
        g = (bg)a(com/amazon/device/associates/bg, g, false);
        com/amazon/device/associates/av;
        JVM INSTR monitorexit ;
_L2:
        return g;
        Exception exception;
        exception;
        com/amazon/device/associates/av;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static boolean d()
    {
        if (d)
        {
            return c;
        }
        com/amazon/device/associates/av;
        JVM INSTR monitorenter ;
        boolean flag;
        if (!d)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        flag = c;
        com/amazon/device/associates/av;
        JVM INSTR monitorexit ;
        return flag;
        Object obj;
        obj;
        com/amazon/device/associates/av;
        JVM INSTR monitorexit ;
        throw obj;
        com/amazon/device/associates/av.getClassLoader().loadClass("com.amazon.android.Kiwi");
        c = true;
_L1:
        d = true;
        com/amazon/device/associates/av;
        JVM INSTR monitorexit ;
        return c;
        obj;
        c = false;
          goto _L1
    }

    private static void e()
    {
        if (h != null)
        {
            break MISSING_BLOCK_LABEL_117;
        }
        com/amazon/device/associates/av;
        JVM INSTR monitorenter ;
        if (h != null) goto _L2; else goto _L1
_L1:
        if (!d()) goto _L4; else goto _L3
_L3:
        h = new w();
        i = new k();
        x.a(new v());
_L2:
        com/amazon/device/associates/av;
        JVM INSTR monitorexit ;
        return;
_L4:
        if (!b)
        {
            break MISSING_BLOCK_LABEL_100;
        }
        h = new q();
        i = new k();
        x.a(new ai());
          goto _L2
        Exception exception;
        exception;
        com/amazon/device/associates/av;
        JVM INSTR monitorexit ;
        throw exception;
        h = new k();
        i = null;
          goto _L2
    }

}
