// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class abj
{

    private abf a;
    private abh b;

    public abj()
    {
    }

    public final abh a()
    {
        this;
        JVM INSTR monitorenter ;
        abh abh1 = b;
        this;
        JVM INSTR monitorexit ;
        return abh1;
        Exception exception;
        exception;
        throw exception;
    }

    public final void a(ZO zo)
    {
        this;
        JVM INSTR monitorenter ;
        int j;
        a = abf.a.a(zo);
        if (a.a())
        {
            break MISSING_BLOCK_LABEL_88;
        }
        j = zo.b(aaI.b.e, aaI.b.f);
        int i;
        i = j;
        if (j != 0)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        i = zo.b(aaI.c.e, aaI.c.f);
        zo = new abh(i);
        zo.a = ((abh) (zo)).a + 1;
        b = zo;
        this;
        JVM INSTR monitorexit ;
        return;
        zo;
        throw zo;
    }

    public final boolean b()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = true;
        if (a != null)
        {
            flag = a.a();
        }
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }
}
