// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ajj
{

    private int a;

    ajj()
    {
        a = 1;
    }

    public final int a()
    {
        this;
        JVM INSTR monitorenter ;
        int i = a;
        this;
        JVM INSTR monitorexit ;
        return i;
        Exception exception;
        exception;
        throw exception;
    }

    public final void a(int i)
    {
        this;
        JVM INSTR monitorenter ;
        a = i;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final boolean b(int i)
    {
        this;
        JVM INSTR monitorenter ;
        int j = a;
        boolean flag;
        if ((j & i) == i)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public final boolean c(int i)
    {
        this;
        JVM INSTR monitorenter ;
        if ((a & i) == i) goto _L2; else goto _L1
_L1:
        a = a | i;
        boolean flag = true;
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        flag = false;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public final boolean d(int i)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag;
        if ((a & i) == i)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = a & ~i;
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }
}
