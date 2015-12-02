// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taobao.statistic.librarys.a;


// Referenced classes of package com.taobao.statistic.librarys.a:
//            b

public class a
{

    private b fU;
    private b fV;
    private b fW;

    public a()
    {
        fU = null;
        fV = null;
        fW = null;
        fU = new b();
        fV = new b();
    }

    public void a(b b1)
    {
        this;
        JVM INSTR monitorenter ;
        if (b1 == null)
        {
            break MISSING_BLOCK_LABEL_75;
        }
        long l;
        long l1;
        if (fW == null)
        {
            break MISSING_BLOCK_LABEL_70;
        }
        l = b1.bw() - fW.bw();
        l1 = b1.bv() - fW.bv();
        if (l1 <= 0L || l <= 0L)
        {
            break MISSING_BLOCK_LABEL_70;
        }
        fU.e(l);
        fU.d(l1);
        fW = b1;
        this;
        JVM INSTR monitorexit ;
        return;
        b1;
        this;
        JVM INSTR monitorexit ;
        throw b1;
    }

    public void b(b b1)
    {
        this;
        JVM INSTR monitorenter ;
        if (b1 == null)
        {
            break MISSING_BLOCK_LABEL_75;
        }
        long l;
        long l1;
        if (fW == null)
        {
            break MISSING_BLOCK_LABEL_70;
        }
        l = b1.bw() - fW.bw();
        l1 = b1.bv() - fW.bv();
        if (l1 <= 0L || l <= 0L)
        {
            break MISSING_BLOCK_LABEL_70;
        }
        fV.e(l);
        fV.d(l1);
        fW = b1;
        this;
        JVM INSTR monitorexit ;
        return;
        b1;
        this;
        JVM INSTR monitorexit ;
        throw b1;
    }

    public long bp()
    {
        this;
        JVM INSTR monitorenter ;
        if (fU == null) goto _L2; else goto _L1
_L1:
        long l = fU.bx();
_L4:
        this;
        JVM INSTR monitorexit ;
        return l;
_L2:
        l = 0L;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public long bq()
    {
        this;
        JVM INSTR monitorenter ;
        if (fV == null) goto _L2; else goto _L1
_L1:
        long l = fV.bx();
_L4:
        this;
        JVM INSTR monitorexit ;
        return l;
_L2:
        l = 0L;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public long br()
    {
        this;
        JVM INSTR monitorenter ;
        if (fU == null) goto _L2; else goto _L1
_L1:
        long l = fU.bw();
_L4:
        this;
        JVM INSTR monitorexit ;
        return l;
_L2:
        l = 0L;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public long bs()
    {
        this;
        JVM INSTR monitorenter ;
        if (fU == null) goto _L2; else goto _L1
_L1:
        long l = fU.bv();
_L4:
        this;
        JVM INSTR monitorexit ;
        return l;
_L2:
        l = 0L;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public long bt()
    {
        this;
        JVM INSTR monitorenter ;
        if (fV == null) goto _L2; else goto _L1
_L1:
        long l = fV.bw();
_L4:
        this;
        JVM INSTR monitorexit ;
        return l;
_L2:
        l = 0L;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public long bu()
    {
        this;
        JVM INSTR monitorenter ;
        if (fV == null) goto _L2; else goto _L1
_L1:
        long l = fV.bv();
_L4:
        this;
        JVM INSTR monitorexit ;
        return l;
_L2:
        l = 0L;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public void clear()
    {
        this;
        JVM INSTR monitorenter ;
        if (fU != null)
        {
            fU.e(0L);
            fU.d(0L);
        }
        if (fV != null)
        {
            fV.e(0L);
            fV.d(0L);
        }
        fW = null;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
