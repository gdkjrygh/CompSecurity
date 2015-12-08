// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.SystemClock;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            is, iv

public final class iw
{

    private static final is Hh = new is("RequestTracker");
    public static final Object Ip = new Object();
    private long Il;
    private long Im;
    private long In;
    private iv Io;

    public iw(long l)
    {
        Il = l;
        Im = -1L;
        In = 0L;
    }

    private void gq()
    {
        Im = -1L;
        Io = null;
        In = 0L;
    }

    public void a(long l, iv iv1)
    {
        iv iv2;
        long l1;
        synchronized (Ip)
        {
            iv2 = Io;
            l1 = Im;
            Im = l;
            Io = iv1;
            In = SystemClock.elapsedRealtime();
        }
        if (iv2 != null)
        {
            iv2.n(l1);
        }
        return;
        iv1;
        obj;
        JVM INSTR monitorexit ;
        throw iv1;
    }

    public boolean b(long l, int i, JSONObject jsonobject)
    {
        iv iv1;
        boolean flag;
        flag = true;
        iv1 = null;
        Object obj = Ip;
        obj;
        JVM INSTR monitorenter ;
        if (Im == -1L || Im != l)
        {
            break MISSING_BLOCK_LABEL_96;
        }
        Hh.b("request %d completed", new Object[] {
            Long.valueOf(Im)
        });
        iv1 = Io;
        gq();
_L2:
        if (iv1 != null)
        {
            iv1.a(l, i, jsonobject);
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
        synchronized (Ip)
        {
            if (Im != -1L)
            {
                gq();
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
        Object obj1 = Ip;
        obj1;
        JVM INSTR monitorenter ;
        Object obj;
        if (Im == -1L || l - In < Il)
        {
            break MISSING_BLOCK_LABEL_105;
        }
        Hh.b("request %d timed out", new Object[] {
            Long.valueOf(Im)
        });
        l = Im;
        obj = Io;
        gq();
_L2:
        if (obj != null)
        {
            ((iv) (obj)).a(l, i, null);
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

    public boolean gr()
    {
        Object obj = Ip;
        obj;
        JVM INSTR monitorenter ;
        Exception exception;
        boolean flag;
        if (Im != -1L)
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
        Object obj = Ip;
        obj;
        JVM INSTR monitorenter ;
        Exception exception;
        boolean flag;
        if (Im != -1L && Im == l)
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
