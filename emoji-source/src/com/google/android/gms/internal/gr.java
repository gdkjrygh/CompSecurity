// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.SystemClock;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            gn, gq

public final class gr
{

    private static final gn BG = new gn("RequestTracker");
    public static final Object CN = new Object();
    private long CJ;
    private long CK;
    private long CL;
    private gq CM;

    public gr(long l)
    {
        CJ = l;
        CK = -1L;
        CL = 0L;
    }

    private void eu()
    {
        CK = -1L;
        CM = null;
        CL = 0L;
    }

    public void a(long l, gq gq1)
    {
        gq gq2;
        long l1;
        synchronized (CN)
        {
            gq2 = CM;
            l1 = CK;
            CK = l;
            CM = gq1;
            CL = SystemClock.elapsedRealtime();
        }
        if (gq2 != null)
        {
            gq2.n(l1);
        }
        return;
        gq1;
        obj;
        JVM INSTR monitorexit ;
        throw gq1;
    }

    public boolean b(long l, int i, JSONObject jsonobject)
    {
        gq gq1;
        boolean flag;
        flag = true;
        gq1 = null;
        Object obj = CN;
        obj;
        JVM INSTR monitorenter ;
        if (CK == -1L || CK != l)
        {
            break MISSING_BLOCK_LABEL_96;
        }
        BG.b("request %d completed", new Object[] {
            Long.valueOf(CK)
        });
        gq1 = CM;
        eu();
_L2:
        if (gq1 != null)
        {
            gq1.a(l, i, jsonobject);
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
        synchronized (CN)
        {
            if (CK != -1L)
            {
                eu();
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
        Object obj1 = CN;
        obj1;
        JVM INSTR monitorenter ;
        Object obj;
        if (CK == -1L || l - CL < CJ)
        {
            break MISSING_BLOCK_LABEL_105;
        }
        BG.b("request %d timed out", new Object[] {
            Long.valueOf(CK)
        });
        l = CK;
        obj = CM;
        eu();
_L2:
        if (obj != null)
        {
            ((gq) (obj)).a(l, i, null);
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

    public boolean ev()
    {
        Object obj = CN;
        obj;
        JVM INSTR monitorenter ;
        Exception exception;
        boolean flag;
        if (CK != -1L)
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
        Object obj = CN;
        obj;
        JVM INSTR monitorenter ;
        Exception exception;
        boolean flag;
        if (CK != -1L && CK == l)
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
