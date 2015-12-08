// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.SystemClock;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            ip, is

public final class it
{

    private static final ip Gr = new ip("RequestTracker");
    public static final Object Hz = new Object();
    private long Hv;
    private long Hw;
    private long Hx;
    private is Hy;

    public it(long l)
    {
        Hv = l;
        Hw = -1L;
        Hx = 0L;
    }

    private void fU()
    {
        Hw = -1L;
        Hy = null;
        Hx = 0L;
    }

    public void a(long l, is is1)
    {
        is is2;
        long l1;
        synchronized (Hz)
        {
            is2 = Hy;
            l1 = Hw;
            Hw = l;
            Hy = is1;
            Hx = SystemClock.elapsedRealtime();
        }
        if (is2 != null)
        {
            is2.n(l1);
        }
        return;
        is1;
        obj;
        JVM INSTR monitorexit ;
        throw is1;
    }

    public boolean b(long l, int i, JSONObject jsonobject)
    {
        is is1;
        boolean flag;
        flag = true;
        is1 = null;
        Object obj = Hz;
        obj;
        JVM INSTR monitorenter ;
        if (Hw == -1L || Hw != l)
        {
            break MISSING_BLOCK_LABEL_96;
        }
        Gr.b("request %d completed", new Object[] {
            Long.valueOf(Hw)
        });
        is1 = Hy;
        fU();
_L2:
        if (is1 != null)
        {
            is1.a(l, i, jsonobject);
        }
        return flag;
        jsonobject;
        obj;
        JVM INSTR monitorexit ;
        throw jsonobject;
        flag = false;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public void clear()
    {
        synchronized (Hz)
        {
            if (Hw != -1L)
            {
                fU();
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean d(long l, int i)
    {
        return b(l, i, null);
    }

    public boolean e(long l, int i)
    {
        long l1;
        boolean flag;
        flag = true;
        l1 = 0L;
        Object obj1 = Hz;
        obj1;
        JVM INSTR monitorenter ;
        Object obj;
        if (Hw == -1L || l - Hx < Hv)
        {
            break MISSING_BLOCK_LABEL_105;
        }
        Gr.b("request %d timed out", new Object[] {
            Long.valueOf(Hw)
        });
        l = Hw;
        obj = Hy;
        fU();
_L2:
        if (obj != null)
        {
            ((is) (obj)).a(l, i, null);
        }
        return flag;
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
        flag = false;
        obj = null;
        l = l1;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public boolean fV()
    {
        Object obj = Hz;
        obj;
        JVM INSTR monitorenter ;
        Exception exception;
        boolean flag;
        if (Hw != -1L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj;
        JVM INSTR monitorexit ;
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean p(long l)
    {
        Object obj = Hz;
        obj;
        JVM INSTR monitorenter ;
        Exception exception;
        boolean flag;
        if (Hw != -1L && Hw == l)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj;
        JVM INSTR monitorexit ;
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

}
