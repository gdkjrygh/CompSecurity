// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class bur
    implements Runnable
{

    private buq a;

    bur(buq buq1)
    {
        a = buq1;
        super();
    }

    public final void run()
    {
        int i;
        synchronized (a.a)
        {
            i = a.b;
            a.c = false;
        }
        a.d.a(i);
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
