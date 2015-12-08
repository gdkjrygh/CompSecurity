// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class aov
{

    private boolean a;
    private boolean b;
    private boolean c;

    aov()
    {
    }

    private boolean b(boolean flag)
    {
        return (c || flag || b) && a;
    }

    final boolean a()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag;
        b = true;
        flag = b(false);
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    final boolean a(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        a = true;
        flag = b(flag);
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    final boolean b()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag;
        c = true;
        flag = b(false);
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    final void c()
    {
        this;
        JVM INSTR monitorenter ;
        b = false;
        a = false;
        c = false;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }
}
