// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class At
    implements As.a
{

    private final As.a a;
    private volatile int b;
    private volatile int c;

    public At(int i, As.a a1)
    {
        c = 0;
        b = i;
        a = (As.a)dv.a(a1);
    }

    private void a()
    {
        this;
        JVM INSTR monitorenter ;
        b = b - 1;
        if (b != 0) goto _L2; else goto _L1
_L1:
        if (c != 0) goto _L4; else goto _L3
_L3:
        a.g();
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
_L4:
        a.h();
        if (true) goto _L2; else goto _L5
_L5:
        Exception exception;
        exception;
        throw exception;
    }

    public final void g()
    {
        a();
    }

    public final void h()
    {
        c = c + 1;
        a();
    }
}
