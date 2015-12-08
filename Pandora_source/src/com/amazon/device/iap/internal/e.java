// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.iap.internal;

import android.util.Log;
import com.amazon.device.iap.internal.a.d;
import com.amazon.device.iap.internal.b.g;

// Referenced classes of package com.amazon.device.iap.internal:
//            b, c, a

public final class e
{

    private static final String a = com/amazon/device/iap/internal/e.getName();
    private static volatile boolean b;
    private static volatile boolean c;
    private static volatile c d;
    private static volatile a e;
    private static volatile b f;

    public e()
    {
    }

    private static Object a(Class class1)
    {
        Object obj;
        try
        {
            obj = d().a(class1).newInstance();
        }
        catch (Exception exception)
        {
            Log.e(a, (new StringBuilder()).append("error getting instance for ").append(class1).toString(), exception);
            return null;
        }
        return obj;
    }

    public static boolean a()
    {
        if (c)
        {
            return b;
        }
        com/amazon/device/iap/internal/e;
        JVM INSTR monitorenter ;
        boolean flag;
        if (!c)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        flag = b;
        com/amazon/device/iap/internal/e;
        JVM INSTR monitorexit ;
        return flag;
        Object obj;
        obj;
        com/amazon/device/iap/internal/e;
        JVM INSTR monitorexit ;
        throw obj;
        com/amazon/device/iap/internal/e.getClassLoader().loadClass("com.amazon.android.Kiwi");
        b = false;
_L1:
        c = true;
        com/amazon/device/iap/internal/e;
        JVM INSTR monitorexit ;
        return b;
        obj;
        b = true;
          goto _L1
    }

    public static c b()
    {
        if (d != null) goto _L2; else goto _L1
_L1:
        com/amazon/device/iap/internal/e;
        JVM INSTR monitorenter ;
        if (d == null)
        {
            d = (c)a(com/amazon/device/iap/internal/c);
        }
        com/amazon/device/iap/internal/e;
        JVM INSTR monitorexit ;
_L2:
        return d;
        Exception exception;
        exception;
        com/amazon/device/iap/internal/e;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public static a c()
    {
        if (e != null) goto _L2; else goto _L1
_L1:
        com/amazon/device/iap/internal/e;
        JVM INSTR monitorenter ;
        if (e == null)
        {
            e = (a)a(com/amazon/device/iap/internal/a);
        }
        com/amazon/device/iap/internal/e;
        JVM INSTR monitorexit ;
_L2:
        return e;
        Exception exception;
        exception;
        com/amazon/device/iap/internal/e;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private static b d()
    {
        if (f != null) goto _L2; else goto _L1
_L1:
        com/amazon/device/iap/internal/e;
        JVM INSTR monitorenter ;
        if (f == null)
        {
            if (!a())
            {
                break MISSING_BLOCK_LABEL_38;
            }
            f = new d();
        }
_L3:
        com/amazon/device/iap/internal/e;
        JVM INSTR monitorexit ;
_L2:
        return f;
        f = new g();
          goto _L3
        Exception exception;
        exception;
        com/amazon/device/iap/internal/e;
        JVM INSTR monitorexit ;
        throw exception;
    }

}
