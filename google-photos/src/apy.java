// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class apy
    implements aqa, bao
{

    private static final jw a = bai.b(20, new apz());
    private final baq b = baq.a();
    private aqa c;
    private boolean d;
    private boolean e;

    apy()
    {
    }

    static apy a(aqa aqa1)
    {
        apy apy1 = (apy)a.a();
        apy1.e = false;
        apy1.d = true;
        apy1.c = aqa1;
        return apy1;
    }

    public final Class a()
    {
        return c.a();
    }

    public final Object b()
    {
        return c.b();
    }

    public final int c()
    {
        return c.c();
    }

    public final void d()
    {
        this;
        JVM INSTR monitorenter ;
        b.b();
        e = true;
        if (!d)
        {
            c.d();
            c = null;
            a.a(this);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void e()
    {
        this;
        JVM INSTR monitorenter ;
        b.b();
        if (!d)
        {
            throw new IllegalStateException("Already unlocked");
        }
        break MISSING_BLOCK_LABEL_31;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        d = false;
        if (e)
        {
            d();
        }
        this;
        JVM INSTR monitorexit ;
    }

    public final baq q_()
    {
        return b;
    }

}
