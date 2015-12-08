// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class jxr
    implements Runnable
{

    private jxq a;

    jxr(jxq jxq1)
    {
        a = jxq1;
        super();
    }

    public final void run()
    {
        synchronized (jxq.a(a))
        {
            if (jxq.b(a) <= jxq.c(a).b() && jxq.d(a) != null)
            {
                jxq.d(a).d();
                jxq.a(a, null);
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
