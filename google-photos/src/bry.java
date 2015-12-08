// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class bry
    implements brz
{

    private brv a;

    bry(brv brv1)
    {
        a = brv1;
        super();
    }

    public final boolean a()
    {
        Object obj = brv.a(a);
        obj;
        JVM INSTR monitorenter ;
        brv.b(a);
        Exception exception;
        boolean flag;
        if (brv.c(a).f() > 0L)
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
