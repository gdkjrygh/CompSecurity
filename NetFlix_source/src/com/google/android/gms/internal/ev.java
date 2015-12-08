// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.SystemClock;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            er, eu

public final class ev
{

    public static final Object Ab = new Object();
    private static final er zb = new er("RequestTracker");
    private eu Aa;
    private long zX;
    private long zY;
    private long zZ;

    public ev(long l)
    {
        zX = l;
        zY = -1L;
        zZ = 0L;
    }

    private void dT()
    {
        zY = -1L;
        Aa = null;
        zZ = 0L;
    }

    public void a(long l, eu eu1)
    {
        eu eu2;
        long l1;
        synchronized (Ab)
        {
            eu2 = Aa;
            l1 = zY;
            zY = l;
            Aa = eu1;
            zZ = SystemClock.elapsedRealtime();
        }
        if (eu2 != null)
        {
            eu2.l(l1);
        }
        return;
        eu1;
        obj;
        JVM INSTR monitorexit ;
        throw eu1;
    }

    public boolean b(long l, int i, JSONObject jsonobject)
    {
        eu eu1;
        boolean flag;
        flag = true;
        eu1 = null;
        Object obj = Ab;
        obj;
        JVM INSTR monitorenter ;
        if (zY == -1L || zY != l)
        {
            break MISSING_BLOCK_LABEL_96;
        }
        zb.b("request %d completed", new Object[] {
            Long.valueOf(zY)
        });
        eu1 = Aa;
        dT();
_L2:
        if (eu1 != null)
        {
            eu1.a(l, i, jsonobject);
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

    public boolean c(long l, int i)
    {
        return b(l, i, null);
    }

    public void clear()
    {
        synchronized (Ab)
        {
            if (zY != -1L)
            {
                dT();
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
        long l1;
        boolean flag;
        flag = true;
        l1 = 0L;
        Object obj1 = Ab;
        obj1;
        JVM INSTR monitorenter ;
        Object obj;
        if (zY == -1L || l - zZ < zX)
        {
            break MISSING_BLOCK_LABEL_105;
        }
        zb.b("request %d timed out", new Object[] {
            Long.valueOf(zY)
        });
        l = zY;
        obj = Aa;
        dT();
_L2:
        if (obj != null)
        {
            ((eu) (obj)).a(l, i, null);
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

    public boolean dU()
    {
        Object obj = Ab;
        obj;
        JVM INSTR monitorenter ;
        Exception exception;
        boolean flag;
        if (zY != -1L)
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

    public boolean n(long l)
    {
        Object obj = Ab;
        obj;
        JVM INSTR monitorenter ;
        Exception exception;
        boolean flag;
        if (zY != -1L && zY == l)
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
