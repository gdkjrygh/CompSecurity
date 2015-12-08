// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class guc
    implements hcv
{

    private final hcn a;
    private boolean b;
    private gua c;

    private guc(gua gua1)
    {
        c = gua1;
        super();
        a = new hcn(c.d.T_());
    }

    guc(gua gua1, byte byte0)
    {
        this(gua1);
    }

    public final hcx T_()
    {
        return a;
    }

    public final void a_(hch hch, long l)
    {
        if (b)
        {
            throw new IllegalStateException("closed");
        }
        if (l == 0L)
        {
            return;
        } else
        {
            c.d.i(l);
            c.d.b("\r\n");
            c.d.a_(hch, l);
            c.d.b("\r\n");
            return;
        }
    }

    public final void close()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = b;
        if (!flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        b = true;
        c.d.b("0\r\n\r\n");
        gua.a(a);
        c.e = 3;
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public final void flush()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = b;
        if (!flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        c.d.flush();
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }
}
