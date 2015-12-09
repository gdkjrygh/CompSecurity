// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazonaws.mobileconnectors.s3.transfermanager;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public final class n
{

    private static final Log c = LogFactory.getLog(com/amazonaws/mobileconnectors/s3/transfermanager/n);
    protected volatile long a;
    protected volatile long b;

    public n()
    {
        a = 0L;
        b = -1L;
    }

    public long a()
    {
        return b();
    }

    public void a(long l)
    {
        this;
        JVM INSTR monitorenter ;
        a = a + l;
        if (b > -1L && a > b)
        {
            a = b;
            if (c.isDebugEnabled())
            {
                c.debug((new StringBuilder()).append("Number of bytes transfered is more than the actual total bytes to transfer. Total number of bytes to Transfer : ").append(b).append(". Bytes Transferred : ").append(a + l).toString());
            }
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public long b()
    {
        return a;
    }

    public void b(long l)
    {
        b = l;
    }

    public long c()
    {
        return b;
    }

    public double d()
    {
        this;
        JVM INSTR monitorenter ;
        double d1 = e();
        this;
        JVM INSTR monitorexit ;
        return d1;
        Exception exception;
        exception;
        throw exception;
    }

    public double e()
    {
        this;
        JVM INSTR monitorenter ;
        long l = b();
        if (l >= 0L) goto _L2; else goto _L1
_L1:
        double d1 = 0.0D;
_L4:
        this;
        JVM INSTR monitorexit ;
        return d1;
_L2:
        if (b < 0L)
        {
            d1 = -1D;
            continue; /* Loop/switch isn't completed */
        }
        d1 = a;
        l = b;
        d1 = (d1 / (double)l) * 100D;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

}
